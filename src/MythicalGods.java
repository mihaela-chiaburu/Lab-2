import java.util.Objects;
public class MythicalGods {
    private String name;
    private String title;
    private String pantheon;
    private String symbol;
    private String gender;
    public MythicalGods(String name, String title, String pantheon, String symbol, String gender){
        this.name = name;
        this.title = title;
        this.pantheon = pantheon;
        this.symbol = symbol;
        this.gender = gender;
    }
    public MythicalGods(String name, String title, String pantheon, String symbol){
        this.name = name;
        this.title = title;
        this.pantheon = pantheon;
        this.symbol = symbol;
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public String getTitle(){
        return this.title;
    }
    public String getPantheon(){
        return this.pantheon;
    }
    public String getSymbol(){
        return this.symbol;
    }
    public String getGender(){
        return this.gender;
    }
    public void setSymbol(String symbol){
        this.symbol = symbol;
    }
    public void setName(String name){
        this.name = name;
    }

    public String toString() {
        return "\nMythical God:"
                + "\n Name: " + this.name
                + "\n Title: " + this.title
                + "\n Pantheon: " + this.pantheon
                + "\n Symbol: " + this.symbol ;
    }
    public void interactWithOtherGod(MythicalGods otherGod) {
        System.out.println(this.name + " of the " + this.pantheon + " pantheon interacts with " + otherGod.name + " of the " + otherGod.pantheon + " pantheon.");
        if (!this.name.equals("Hera")) {
            if (this.pantheon.equals(otherGod.pantheon))
                System.out.println("They are from the same pantheon and may have common interests.");
            else
                System.out.println("They are from different pantheons, which can lead to an unpredictable reaction.");
        }
        if (this.name.equals("Hera") && Objects.equals(otherGod.gender, "female"))
            System.out.println("Hera will be jealous.");
        if (this.name.equals("Hera") && otherGod.name.equals("Zeus"))
            System.out.println("Hera loves and hates her husband.");
        if (this.name.equals("Hera") && !Objects.equals(otherGod.gender, "female") && !otherGod.name.equals("Zeus"))
            System.out.println("Hera doesn't care");
    }
}
