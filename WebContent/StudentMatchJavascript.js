
$(function() {
$( "#tabs" ).tabs({
event: "mouseover"
});
});

			




function goToPage(location)
{
	document.location = location;
}

function hideDiv(divID)
{
	document.getElementById(divID).style.display = "none";
}

function showDiv(divID)
{
	document.getElementById(divID).style.display = "";
}

