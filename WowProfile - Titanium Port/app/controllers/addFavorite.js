// Arguments passed into this controller can be accessed via the `$.args` object directly or:
var args = $.args;

function add() {
	var favorite = Alloy.createModel('favorites', {

		name : $.characterDetailName,
		race : $.characterDetailRace,
		charClass: $characterDetailClass,
		faction : $.characterDetailFaction,
		level : $.characterDetailLevel,
		thumbnail : $.characterDetailAvatar

	});

	favorite.save();

	Allow.Collections.favorites.fetch();
	close();
}

function close() {
	if (OS_IOS) {
		$.navWindow.close();
	} else {
		$.addFavorite.close();
	}
}
