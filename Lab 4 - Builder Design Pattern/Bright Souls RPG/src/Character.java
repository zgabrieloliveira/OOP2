public class Character {
    
    private String name;
    private String expertise;
    private int vitality;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int endurance;
    private int faith;
    private String weapon;
    private String personalItem;

    public Character() {
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getExpertise() {
        return expertise;
    }
    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
    public int getVitality() {
        return vitality;
    }
    public void setVitality(int vitality) {
        this.vitality = vitality;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public int getEndurance() {
        return endurance;
    }
    public void setEndurance(int endurance) {
        this.endurance = endurance;
    } 
    public int getFaith() {
        return faith;
    }
    public void setFaith(int faith) {
        this.faith = faith;
    }
    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public String getPersonalItem() {
        return personalItem;
    }
    public void setPersonalItem(String personalItem) {
        this.personalItem = personalItem;
    }

    public void seeStats() {
        System.out.println("\nYou're a " + expertise + "! Here's your stats:");
        System.out.println("Vitality: " + vitality);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Endurance: " + endurance);
        System.out.println("Faith: " + faith);
        System.out.println();
    }

    public String toString() {
        return "HERE'S YOUR CHARACTER...\n" + "\nName: " + name + "\nExpertise: " + expertise + "\nVitality: " + vitality + "\nStrength: "
                + strength + "\nDexterity: " + dexterity + "\nIntelligence: " + intelligence + "\nEndurance: " + endurance
                + "\nFaith: " + faith + "\nWeapon: " + weapon + "\nPersonal Item: " + personalItem;
    }

    
  
}
