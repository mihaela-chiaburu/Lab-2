import java.util.Objects;

public class Vampires {
    private String name;
    private String bloodTypePreference;
    private int age;
    private boolean daylightTolerance;
    public Vampires(String name, String title, int age, boolean daylightTolerance){
        this.name = name;
        this.bloodTypePreference = title;
        this.age = age;
        this.daylightTolerance = daylightTolerance;
    }
    public String getName(){
        return this.name;
    }
    public String getBloodTypePreference(){
        return this.bloodTypePreference;
    }
    public int getAge(){
        return this.age;
    }
    public boolean getDaylightTolerance(){
        return this.daylightTolerance;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void drinkBlood(String victimName, String victimBloodType) {
        if (Objects.equals(this.bloodTypePreference, victimBloodType)) {
            System.out.println(this.name + " drinks blood from " + victimName + " with satisfaction.");
        } else {
            System.out.println(this.name + " doesn't like this type of blood from " + victimName + " but drinks it anyway.");
        }
    }
    public String toString() {
        return "\nVampire:"
                + "\n Name: " + this.name
                + "\n Blood type preference: " + this.bloodTypePreference
                + "\n Age: " + this.age
                + "\n Daylight tolerance: " + this.daylightTolerance;
    }
}
