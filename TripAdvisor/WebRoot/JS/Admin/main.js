$('.ui.dropdown')
  .dropdown()
;

$('.ui.checkbox')
.checkbox({
	onChecked: function() {
		$('.field').removeClass("disabled");
		$('.ui.button').removeClass("disabled");
	},
	onUnchecked: function() {
		$('.field').addClass("disabled");
		$('.ui.button').addClass("disabled");
	}
})
;
