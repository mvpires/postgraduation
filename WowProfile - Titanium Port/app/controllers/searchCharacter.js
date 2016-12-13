// Arguments passed into this controller can be accessed via the `$.args` object directly or:
var args = $.args;

var connection = Ti.Network.createHTTPClient;

connection.onerror = function(e) {
	alert(e);
};

connection.onload = function(e) {
	var characters = JSON.parse(this.responseText);

	var controller = Alloy.createController('characterList', characters);
	$.searchCharacterWindow.open(controller.getView());

};

searchCharacter = function() {

	var charName = $.CharacterSearchTextField.value;
	if (charName != null || charName != '') {

		charName.trim();
		charName.toLowerCase();

		connection.open('GET', 'https://us.api.battle.net/wow/character/nemesis/' + charName + '?locale=en_US&apikey=dj6g6bh58m63tqzsyv4mk8xqby7sjezn');
		connection.send();
		
	}
	
	else{
		alert("Invalid name");
	}

};
