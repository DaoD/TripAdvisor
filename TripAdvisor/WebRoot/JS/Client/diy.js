$('.ui.dropdown')
  .dropdown()
;

//$('.ui.calendar').calendar({
//  type: 'date'
//});

$('.ui.calendar').calendar({
  type: 'date',
//  monthFirst: false,
  formatter: {
    date: function (date, settings) {
      if (!date) return '';
      var day = date.getDate();
      var month = date.getMonth() + 1;
      var year = date.getFullYear();
      return year + '-' + month + '-' + day;
    }
  }
});

$('table')
  .tablesort()
;

$('thead th.price').data('sortBy', function(th, td, tablesort) {
	return parseInt(td.text());
});

function getdays(date1, date2) {
	var year1 = date1.split("-")[0];
	var month1 = date1.split("-")[1];
	var day1 = date1.split("-")[2];
	var year2 = date2.split("-")[0];
	var month2 = date2.split("-")[1];
	var day2 = date2.split("-")[2];
	var s_date1 = new Date();
	s_date1.setYear(year1)
	s_date1.setMonth(month1 - 1);
	s_date1.setDate(day1);
	var s_date2 = new Date();
	s_date2.setYear(year2)
	s_date2.setMonth(month2 - 1);
	s_date2.setDate(day2);
	var day_diff = parseInt((s_date2.getTime() - s_date1.getTime()) / (1000 * 60 * 60 * 24))
	return day_diff;
}

function bookflight(id) {
	var airline = $('#airline' + id)[0].innerHTML;
	var flightno = $('#flightno' + id)[0].innerHTML;
	var fromcity = $('#fromcity' + id)[0].innerHTML;
	var tocity = $('#tocity' + id)[0].innerHTML;
	var flightclass = $('#flightclass' + id)[0].innerHTML;
	var departtime = $('#departtime' + id)[0].innerHTML;
	var arrivetime = $('#arrivetime' + id)[0].innerHTML;
	var flighttime = $('#flighttime' + id)[0].innerHTML;
	var departdate = $('#departdate' + id)[0].innerHTML;
	var price = $('#price' + id)[0].innerHTML;
	var number = $('#number' + id)[0].innerHTML;
	$('#cardheader')[0].innerHTML = airline + " " + flightno;
	$('#cardmeta')[0].innerHTML = departdate + " " + fromcity + " - " + tocity;
	$('#carddescription')[0].innerHTML = departtime + "-" + arrivetime + " " + flighttime + " " + flightclass + "<br/>" + "RMB: " + price + " * " + number;
	$('.ui.card').css("box-shadow", "0 1px 3px 0 #D4D4D5, 0 0 0 1px #D4D4D5");
	$('#submitbutton').css("display", "inline-block");
	
	$('#bookairline')[0].value = airline;
	$('#bookflightid')[0].value = id;
	$('#bookflightdate')[0].value = departdate;
	$('#bookflightnumber')[0].value = number;
	$('#bookflightprice')[0].value = (price * number).toString();
	$('#bookflightno')[0].value = flightno;
	$('#bookflightclass')[0].value = flightclass;
	$('#bookflightdeparttime')[0].value = departtime;
	$('#bookflightarrivetime')[0].value = arrivetime;
	$('#bookflighttime')[0].value = flighttime;
	$('#bookfromcity')[0].value = fromcity;
	$('#booktocity')[0].value = tocity;
}

function bookhotel(id) {
	var hotelname = $('#hotelname' + id)[0].innerHTML;
	var address = $('#address' + id)[0].innerHTML;
	var star = $('#star' + id)[0].innerHTML;
	var roomtype = $('#roomtype' + id)[0].innerHTML;
	var price = $('#price' + id)[0].innerHTML;
	var city = $('#location' + id)[0].innerHTML;
	var number = $('#number' + id)[0].innerHTML;
	var fromdate = $('#fromdate' + id)[0].innerHTML;
	var todate = $('#todate' + id)[0].innerHTML;
	
	$('#cardheader')[0].innerHTML = hotelname;
	$('#cardmeta')[0].innerHTML = city + " " + star;
	$('#carddescription')[0].innerHTML = fromdate + "-" + todate + " " + roomtype + "<br/>" + "RMB: " + price + " * " + number + " * " + getdays(fromdate, todate) + " 天";
	$('.ui.card').css("box-shadow", "0 1px 3px 0 #D4D4D5, 0 0 0 1px #D4D4D5");
	$('#submitbutton').css("display", "inline-block");
	
	$('#bookhotelname')[0].value = hotelname;
	$('#bookhoteltype')[0].value = roomtype;
	$('#bookhotelfromdate')[0].value = fromdate;
	$('#bookhoteltodate')[0].value = todate;
	$('#bookhoteldays')[0].value = getdays(fromdate, todate);
	$('#bookhotelnumber')[0].value = number;
	$('#bookhotelid')[0].value = id;
	$('#bookhotelprice')[0].value = (price * number * getdays(fromdate, todate)).toString();
	$('#bookhoteladdress')[0].value = address;
	$('#bookhotelstar')[0].value = star;
	$('#bookhotellocation')[0].value = city;
}

function bookcar(id) {
	var companyname = $('#companyname' + id)[0].innerHTML;
	var brandname = $('#brand' + id)[0].innerHTML;
	var type = $('#type' + id)[0].innerHTML;
	var enginetype = $('#enginetype' + id)[0].innerHTML;
	var passengers = $('#passengers' + id)[0].innerHTML;
	var price = $('#price' + id)[0].innerHTML;
	var fromdate = $('#fromdate' + id)[0].innerHTML;
	var todate = $('#todate' + id)[0].innerHTML;
	var city = $('#city' + id)[0].innerHTML;
	
	$('#cardheader')[0].innerHTML = brandname + " " + enginetype + " " + type;
	$('#cardmeta')[0].innerHTML = companyname;
	$('#carddescription')[0].innerHTML = fromdate + "-" + todate + " 最多可乘坐： " + passengers + "人" + "<br/>" + "RMB: " + price + " * " + getdays(fromdate, todate) + " 天";
	$('.ui.card').css("box-shadow", "0 1px 3px 0 #D4D4D5, 0 0 0 1px #D4D4D5");
	$('#submitbutton').css("display", "inline-block");
	
	$('#bookcompanyname')[0].value = companyname;
	$('#bookcarshape')[0].value = type;
	$('#bookcarfromdate')[0].value = fromdate;
	$('#bookcartodate')[0].value = todate;
	$('#bookcardays')[0].value = getdays(fromdate, todate);
	$('#bookcarprice')[0].value = (price * getdays(fromdate, todate)).toString();
	$('#bookcarid')[0].value = id;
	$('#bookcarbrand')[0].value = brandname;
	$('#bookcarenginetype')[0].value = enginetype;
	$('#bookcarpassengers')[0].value = passengers;
	$('#bookcarcity')[0].value = city;
	$('#bookcarfromdate')[0].value = fromdate;
	$('#bookcartodate')[0].value = todate;
}

var attractionStringList = new Array();

function removeattraction(id) {
	delete attractionStringList[id];
	$('#attractioncards')[0].innerHTML = "";
	$('#idlist')[0].value = "";
	var count = 0;
	for(var key in attractionStringList) {
		$('#attractioncards')[0].innerHTML += attractionStringList[key];
		$('#idlist')[0].value += (key + " ");
		count += 1;
	}
	if(count == 0) {
		$('#submitbutton').css("display", "none");
	}
}

function bookattraction(id) {
	var name = $('#name' + id)[0].innerHTML;
	var location = $('#location' + id)[0].innerHTML;
	var price = $('#price' + id)[0].innerHTML;
	var date = $('#date' + id)[0].innerHTML;
	var number = $('#number' + id)[0].innerHTML;
	
	var addString = '<div class=\"ui card\">' 
		+ '<div class=\"content\">'
		+ '<a onclick=\"removeattraction(' + id + ');\"><i class=\"right floated remove icon\"></i></a>'
		+ '<div class=\"header\" id=\"cardheader\">' + name + '</div>'
		+ '<div class=\"meta\" id=\"cardmeta\">' + location + '</div>'
		+ '<div class=\"description\" id=\"carddescription\">' + date + '<br/>' + 'RMB: ' + price + ' * ' + number + '</div>'
		+ '</div>'
		+ '</div>'
		+ '<input type=\"hidden\" name=\"attractionname' + id +  '\" value=\"' + name + '\">'
		+ '<input type=\"hidden\" name=\"attractionlocation' + id +  '\" value=\"' + location + '\">'
		+ '<input type=\"hidden\" name=\"attractionprice' + id +  '\" value=\"' + (price * number).toString() + '\">'
		+ '<input type=\"hidden\" name=\"attractiondate' + id +  '\" value=\"' + date + '\">'
		+ '<input type=\"hidden\" name=\"attractionnumber' + id +  '\" value=\"' + number + '\">'
		+ '<input type=\"hidden\" name=\"attractionid' + id +  '\" value=\"' + id + '\">';
	attractionStringList[id.toString()] = addString;
	
	$('#attractioncards')[0].innerHTML = "";
	$('#idlist')[0].value = "";
	for(var key in attractionStringList) {
		$('#attractioncards')[0].innerHTML += attractionStringList[key];
		$('#idlist')[0].value += (key + " ");
	}
	$('#submitbutton').css("display", "inline-block");
	$('#submitbutton').css("margin-top", "10px");
}