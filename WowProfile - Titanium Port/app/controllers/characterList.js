// Arguments passed into this controller can be accessed via the `$.args` object directly or:
var args = $.args;
var imageFaction;

var rows = [];

for (var i = 0; i < args.lenght; i++){
	var character = args[i];
	var row = Ti.UI.createTableViewRow();
	
	if (args[i].get('faction').equals('Alliance'))
	{
		imageFaction = 'images/alliance.png';
	}
	else
	{
		imageFaction = 'images/horde.png';
	}
	
	var view = Ti.UI.createView({
		
		width:Ti.UI.FILL,
		height: Ti.UI.SIZE,
		layout:'horizontal'
		
	});
	
	var image = Ti.UI.createImageView({
		
		height:42,
		width: 42,
		left:5, 
		top:5, 
		bottom:5,
		image:imageFaction
		
	});
	
	view.add(image);
	
	var viewCharData = Ti.UI.createView({
		
		height:Ti.UI.SIZE,
		width:Ti.UI.FILL,
		layout:'vertical'
		
	});
	
	var charNameLabel = Ti.UI.createLabel({
		top:5,
		left:5,
		text:args.get('name')
		
	});
	
	viewCharData.add(charNameLabel);
	view.add(viewCharData);
	row.add(view);
	rows.push(row);
	
	
};

function showCharacterDetails(e){
	var character = e.rowData;
	var controller = Alloy.createController('characterDetails', character);
	$.characterListTab.open(controller.getView());
}

//$.tableView.data = rows;
