/*
 *  Copyright (C) 2008-2011 VMWare, Inc. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

dojo.provide("wm.base.components.Property");

dojo.declare("wm.Property", wm.Component, {
	property: "",
	bindTarget: true,
	bindSource: true,
	isEvent: false,
	readonly: false,
	init: function() {
		this.inherited(arguments);
	},
	listProperties: function() {
		var p = this.inherited(arguments);
		p.bindTarget.ignoretmp = this.isEvent;
		p.bindSource.ignoretmp = this.isEvent;
		return p;
	},
	makePropEdit: function(inName, inValue, inDefault) {

		switch (inName) {
			case "selectProperty":
				return makeReadonlyButtonEdit(inName, inValue, inDefault);
		}
		return this.inherited(arguments);
	},
	editProp: function(inName, inValue, inInspector) {
		switch (inName) {
			case "selectProperty":
				wm.onidle(this, "beginBind");
				break;
		}
	},
	beginBind: function(inPropName) {
		studio.onSelectProperty = dojo.hitch(this, "selectProperty");
	    studio.selectProperty(this, null, studio.getDictionaryItem("wm.Property.SELECT_PROPERTY", {propertyName: this.name}));
	},
	selectProperty: function(inId) {
		studio.onSelectProperty = null;
		var id = inId.replace("studio.wip.", "");
		this.setValue("property", id);
		// FIXME: this split/shift/join thing happens in Composite too, unify
		var ids = id.split("."), c = ids.shift(), prop = ids.join(".");
		// FIXME: this also happens in Composite, a couple different ways
		var c = studio.wip.getValue(c);
		if (c) {
			if (c.isEventProp(prop))
				this.setValue("isEvent", true);
			if (c.schema[prop] && c.schema[prop].readonly)
				this.setValue("readonly", true);
		}
	},
	write: function() {
		return wm.Property.deploy ? "" : this.inherited(arguments);
	},
	publish: function() {
		return '[' +
			'"' + this.name + '", ' + 
			'"' + this.property + '", ' + 
			'{' + 
				'group: "Published"' + (
					this.isEvent ? ', isEvent: true' :
						(this.readonly ? ', readonly: true' : '') +
						(this.bindSource ? ', bindSource: true' : '') +
						(this.bindTarget ? ', bindTarget: true' : '')) +
			'}' +
		']';
	}
});

wm.Object.extendSchema(wm.Property, {
    owner: { ignore: 1},
    property: {order: 2},
    selectProperty: {order: 3}
});

/*
registerPackage([ "Components", "Property", "wm.Property", "wm.base.components.Property", "images/flash.png", "Published Property"]);
*/
