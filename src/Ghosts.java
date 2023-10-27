public class Ghosts {
    private String name;
    private String causeOfDeath;
    private String hauntingLocation;
    private String apparitionType;
    public Ghosts(String name, String causeOfDeath, String hauntingLocation, String apparitionType){
        this.name = name;
        this.causeOfDeath = causeOfDeath;
        this.hauntingLocation = hauntingLocation;
        this.apparitionType = apparitionType;
    }
    public String getName(){
        return this.name;
    }
    public String getCauseOfDeath(){
        return this.causeOfDeath;
    }
    public String getHauntingLocation(){
        return this.hauntingLocation;
    }
    public String getApparitionType(){
        return this.apparitionType;
    }
    public void setHauntingLocation(String hauntingLocation){
        this.hauntingLocation = hauntingLocation;
    }
    public String toString() {
        return "\nGhost:"
                + "\n Name: " + this.name
                + "\n Cause of death: " + this.causeOfDeath
                + "\n Haunting location: " + this.hauntingLocation
                + "\n Apparition Type: " + this.apparitionType;
    }
}
