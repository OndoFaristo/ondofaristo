Main.widgets = {
	layoutBox1: ["wm.Layout", {box: "v", height: "1flex"}, {}, {
		label1: ["wm.Label", {caption: "label1", height: "15px", autoSize: true}, {}, {
			format: ["wm.DataFormatter", {}, {}]
		}],
		label2: ["wm.Label", {caption: "label2", height: "12px"}, {}, {
			format: ["wm.DataFormatter", {}, {}]
		}],
		panel1: ["wm.Panel", {box: "h", height: "48px"}, {}, {
			label3: ["wm.Label", {caption: "label3", width: "32px", autoSize: true}, {}, {
				format: ["wm.DataFormatter", {}, {}]
			}],
			label4: ["wm.Label", {caption: "label4", width: "96px"}, {}, {
				format: ["wm.DataFormatter", {}, {}]
			}]
		}]
	}]
}