public class Wizards {
    private String name;
    private String magicalSpecialty;
    private String spellBook;
    private String mysticalArtifact;
    public Wizards(String name, String magicalSpecialty, String spellBook, String mysticalArtifact){
        this.name = name;
        this.magicalSpecialty = magicalSpecialty;
        this.spellBook = spellBook;
        this.mysticalArtifact = mysticalArtifact;
    }
    public String getName(){
        return this.name;
    }
    public String getMagicalSpecialty(){
        return this.magicalSpecialty;
    }
    public String getSpellBook(){
        return this.spellBook;
    }
    public String getMysticalArtifact(){
        return this.mysticalArtifact;
    }
    public void setMysticalArtifact(String mysticalArtifact){
        this.mysticalArtifact = mysticalArtifact;
    }
    public void castSpell(String spellName) {
        System.out.println(this.name + " casts the spell '" + spellName + "' from their spell book.");
        System.out.println("We Love Casting Spells.");
    }
    public String toString() {
        return "\nWizard:"
                + "\n Name: " + this.name
                + "\n Magical Specialty: " + this.magicalSpecialty
                + "\n Spell Book: " + this.spellBook
                + "\n Mystical Artifact: " + this.mysticalArtifact;
    }
}
