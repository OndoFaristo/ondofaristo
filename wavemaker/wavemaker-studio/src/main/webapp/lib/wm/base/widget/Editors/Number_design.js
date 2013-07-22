/*
 *  Copyright (C) 2012-2013 CloudJee, Inc. All rights reserved.
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


dojo.provide("wm.base.widget.Editors.Number_design");
dojo.require("wm.base.widget.Editors.AbstractEditor_design");
dojo.require("wm.base.widget.Editors.Number");

wm.Number.extend({
    themeableStyles: [{name: "wm.NumberSpinner-Down-Arrow_Image", displayName: "Down Arrow"}, {name: "wm.NumberSpinner-Up-Arrow_Image", displayName: "Up Arrow"}],
    set_noFormatting: function(inValue) {
        this.noFormatting = Boolean(inValue);
        this.createEditor();
    }
});

wm.Object.extendSchema(wm.Number, {
    /* Editor group; value subgroup */
    dataValue: {type: "Number"},
    defaultInsert:{type: "Number"},

    /* Editor group; display subgroup */
    places: {group: "editor", subgroup: "display", order: 2, type: "number"},
    applyPlacesWhileTyping: {group: "editor", subgroup: "display", order: 3, type: "boolean"},
    noFormatting: {group: "editor", subgroup: "display", order: 10, type: "boolean", advanced:1},

    /* Editor group; validation subgroup */
    minimum:  { group: "editor", subgroup: "validation", order: 3, bindTarget: true, type: "Number", editor: "wm.Number", editorProps: {emptyValue: "emptyString"}},
    maximum: { group: "editor",  subgroup: "validation", order: 4, bindTarget: true, type: "Number", editor: "wm.Number", editorProps: {emptyValue: "emptyString"}},


    /* Editor group; dojo tooltips subgroup */
    rangeMessage: {  group: "editor text", subgroup: "dojo tooltips", order: 5, advanced:1},

    /* Editor group; behavior subgroup */
    spinnerButtons: {group: "widgetName", subgroup: "behavior", order: 6, type: "boolean"},

    /* Ignored group */
    resetButton: {ignore: 1},
    regExp: { ignore: 1 },
    maxChars: { ignore: 1},

    /* Methods group */
    setMaximum: {method:1},
    setMinimum: {method:1}
});



wm.Object.extendSchema(wm.Currency, {
    /* Editor group; display subgroup */
    currency: {group: "editor", subgroup: "display", order: 2},
    noFormatting: {ignore:1},

    /* Ignored group */
    password: {ignore:1},
    spinnerButtons: {ignore: 1}
});


dojo.require("wm.base.widget.Editors.Slider");
wm.Object.extendSchema(wm.Slider, {
    /* Editor group; value subgroup */
    discreteValues: {group: "editor", subgroup: "value", order: 50},
    integerValues: {group: "editor", subgroup:"value", order: 51},
    minimum:  { group: "editor", subgroup: "value", order: 60, bindTarget: true},
    maximum: { group: "editor", subgroup: "value", order: 61, bindTarget: true},


    dynamicSlider: {group: "widgetName", subgroup: "behavior", order: 1},

    /* Display group; visual subgroup */
    showButtons: {  group: "editor", subgroup: "layout", order: 5},
    verticalSlider: {  group: "editor", subgroup: "layout", order: 6, ignore: 1},

    /* Ignored group */
    editorBorder: { ignore: 1 },
    changeOnKey: { ignore: 1 },
    changeOnEnter: { ignore: 1 }
});


wm.Object.extendSchema(wm.RangeSlider, {
    dataValue: {ignore: 1},
    topValue:  {bindable: 1, group: "editor", subgroup: "value", order: 11, simpleBindProp: true, type: "Number"},
    bottomValue:  {bindable: 1, group: "editor", subgroup: "value", order: 11, simpleBindProp: true, type: "Number"}
 });