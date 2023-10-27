public class Supernatural {
    public static void main(String[] args) {

        MythicalGods zeus = new MythicalGods("Zeus", "King of the Gods", "Greek", "Thunderbolt", "male");
        MythicalGods hera = new MythicalGods("Hera", "God of marriage", "Greek", "Peacock", "female");
        MythicalGods anubis = new MythicalGods("Anubis", "God of the Dead", "Egyptian", "Ankh");
        MythicalGods loki = new MythicalGods("Loki", "Trickster God", "Nordic", "Serpent", "male");
        MythicalGods isis = new MythicalGods("Isis", "Goddess of Motherhood", "Egyptian", "Ankh", "female");

        Ghosts casper = new Ghosts("Casper", "Pneumonia", "Haunted Mansion", "Transparent");
        Ghosts ladyInWhite = new Ghosts("Lady in White", "Tragic accident", "Abandoned Church", "Shadowy");

        Vampires dracula = new Vampires("Dracula", "Type O", 500, false);
        Vampires alucard = new Vampires("Alucard", "Type A", 200, true);

        Wizards snape = new Wizards("Severus Snape", "Potions Master", "Advanced Potion-Making", "Magic wand");
        Wizards merlin = new Wizards("Merlin", "Enchanter and Advisor", "Book of Enchantments", "Staff of Power");

        System.out.println(zeus);
        System.out.println(anubis);
        System.out.println(loki);
        System.out.println(hera);
        System.out.println("\n");

        hera.interactWithOtherGod(isis);
        //hera.interactWithOtherGod(loki);
        hera.interactWithOtherGod(zeus);
        zeus.interactWithOtherGod(anubis);
        System.out.println("\n");

        //creating a Roman God xd xd
        zeus.setName("Jupiter");
        System.out.println(zeus.getName());

        System.out.println(casper);
        ladyInWhite.setHauntingLocation("Abandoned school");
        System.out.println(ladyInWhite);
        System.out.println("\n");

        alucard.drinkBlood("Mihaela", "Type A");
        System.out.println(dracula);
        dracula.setAge(700);
        System.out.println(dracula.getAge());
        System.out.println(alucard);

        System.out.println(snape);
        System.out.println(merlin);
        System.out.println("\n");
        merlin.castSpell("Shadow Wizard Money Gang");

    }
}