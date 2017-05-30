$('.ui.dropdown')
  .dropdown()
;

$('.ui.calendar').calendar({
  type: 'date'
});

$('table')
  .tablesort()
;

$('thead th.price').data('sortBy', function(th, td, tablesort) {
	return parseInt(td.text());
});

function bookflight(id) {
	var airline = $('#airline' + id)[0].innerHTML;
	var flightno = $('#flightno' + id)[0].innerHTML;
	var fromcity = $('#fromcity' + id)[0].innerHTML;
	var tocity = $('#tocity' + id)[0].innerHTML;
	var flightclass = $('#flightclass' + id)[0].innerHTML;
	var departtime = $('#departtime' + id)[0].innerHTML;
	var arrivetime = $('#arrivetime' + id)[0].innerHTML;
	var flighttime = $('#flighttime' + id)[0].innerHTML;
	var price = $('#price' + id)[0].innerHTML;
	$('#cardheader')[0].innerHTML = airline + " " + flightno;
	$('#cardmeta')[0].innerHTML = fromcity + " - " + tocity;
	$('#carddescription')[0].innerHTML = departtime + "-" + arrivetime + " " + flighttime + " " + flightclass + "<br/>" + "RMB: " + price;
	$('.ui.card').css("box-shadow", "0 1px 3px 0 #D4D4D5, 0 0 0 1px #D4D4D5");
	$('#submitbutton').css("display", "inline-block");
}