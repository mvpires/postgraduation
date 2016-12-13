// Arguments passed into this controller can be accessed via the `$.args` object directly or:
var args = $.args;

var race = args.get('race');

switch(race) {
case "1":
	$.characterDetailName.title = "Human";
	break;
case "2":
	$.characterDetailName.title = "Orc";
	break;
case "3":
	$.characterDetailName.title = "Dwarf";
	break;
case "4":
	$.characterDetailName.title = "Night-Elf";
	break;
case "5":
	v$.characterDetailName.title = "Undead";
	break;
case "6":
	$.characterDetailName.title = "Tauren";
	break;
case "7":
	$.characterDetailName.title = "Gnome";
	break;
case "8":
	$.characterDetailName.title = "Troll";
	break;
case "9":
	$.characterDetailName.title = "Goblin";
	break;
case "10":
	$.characterDetailName.title = "Blood-Elf";
	break;
case "11":
	$.characterDetailName.title = "Draenei";
	break;
case "22":
	v$.characterDetailName.title = "Worgen";
	break;
case "24":
	$.characterDetailName.title = "Pandaren";
	break;
case "25":
	$.characterDetailName.title = "Pandaren";
	break;
case "26":
	$.characterDetailName.title = "Pandaren";
	break;

}

var charClass;

if($.args.get('class') != null)
{
	//Http
	charClass = $.args.get('class');
}
else{
	//Banco
	charClass = $.args.get('charClass');
}



switch (charClass) {
case "1":
	$.characterDetailClass.title = "Warrior";
	break;
case "2":
	$.characterDetailClass.title = "Paladin";
	break;
case "3":
	v$.characterDetailClass.title = "Hunter";
	break;
case "4":
	$.characterDetailClass.title = "Rogue";
	break;
case "5":
	$.characterDetailClass.title = "Priest";
	break;
case "6":
	$.characterDetailClass.title = "Death Knight";
	break;
case "7":
	v$.characterDetailClass.title = "Shaman";
	break;
case "8":
	$.characterDetailClass.title = "Mage";
	break;
case "9":
	$.characterDetailClass.title = "Warlock";
	break;
case "10":
	v$.characterDetailClass.title = "Monk";
	break;
case "11":
	$.characterDetailClass.title = "Druid";
	break;
case "12":
	$.characterDetailClass.title = "Demon Hunter";
	break;
}

var faction = $.args.get('faction');

switch (faction) {
case "0":
	$.characterDetailFaction.title = "Alliance";
	break;
case "1":
	$.characterDetailFaction.title = "Horde";
	break;
}

$.characterDetailLevel.title = "Level: " + $.args.get('level');

$.characterDetailAvatar.image = "http://render-api-us.worldofwarcraft.com/static-render/us/" + $.args.get('thumbnail');

