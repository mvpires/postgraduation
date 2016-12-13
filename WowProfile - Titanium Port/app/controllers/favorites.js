// Arguments passed into this controller can be accessed via the `$.args` object directly or:
var args = $.args;

function showDetails(e) {
	var favorite = Alloy.Collections.favorites.get(e.rowData.characterId);
	var controller = Alloy.createController('characterDetails', favorite);
	controller.tab = $.favoritesTab;
	$.favoritesTab.open(controller.getView());

}

function favoritesFilter(collection) {
	return collection.where({
		favorite : 1
	});
}
