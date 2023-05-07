public class CharacterBuilder implements Builder {
    
    Character hero;

    public void reset() {
        hero = new Character();
    }

    public void stepName(String name) {
        hero.setName(name);
    }

    public void stepExpertise(int expertise) {

        switch(expertise) {
            case 1: hero.setExpertise("Warrior");
                    hero.setVitality(15);
                    hero.setStrength(13);
                    hero.setDexterity(7);
                    hero.setEndurance(11);
                    hero.setIntelligence(6);
                    hero.setFaith(8);
                    break;
            case 2: hero.setExpertise("Thief");
                    hero.setVitality(11);
                    hero.setStrength(8);
                    hero.setDexterity(15);
                    hero.setEndurance(9);
                    hero.setIntelligence(9);
                    hero.setFaith(8);
                    break;
            case 3: hero.setExpertise("Cleric");
                    hero.setVitality(9);
                    hero.setStrength(6);
                    hero.setDexterity(9);
                    hero.setEndurance(8);
                    hero.setIntelligence(12);
                    hero.setFaith(16);
                    break;
            case 4: hero.setExpertise("Sorcerer");
                    hero.setVitality(10);
                    hero.setStrength(8);
                    hero.setDexterity(7);
                    hero.setEndurance(9);
                    hero.setIntelligence(16);
                    hero.setFaith(10);
                    break;
            case 5: hero.setExpertise("Pyromancer");
                    hero.setVitality(11);
                    hero.setStrength(7);
                    hero.setDexterity(7);
                    hero.setEndurance(10);
                    hero.setIntelligence(13);
                    hero.setFaith(13);
                    break;
            default: hero.setExpertise("Doomed");
                    hero.setVitality(7);
                    hero.setStrength(4);
                    hero.setDexterity(6);
                    hero.setEndurance(5);
                    hero.setIntelligence(3);
                    hero.setFaith(5);
                    break;
        }
    }

    public void stepWeapon(int weapon) {

        switch(weapon) {
            case 1: hero.setWeapon("Smith's Sword");
                break;
            case 2: hero.setWeapon("Black Blade");
                break;
            case 3: hero.setWeapon("War Hammer");
                break;
            case 4: hero.setWeapon("Butcher's Cleaver");
                break;
            case 5: hero.setWeapon("Knight's Halberd");
                break;
            default: hero.setWeapon("Broken Sword");
                break;
        }
    }

    public void stepPersonalItem(int personalItem) {

        switch(personalItem) {
            case 1: hero.setPersonalItem("Traveler's Devotion");
                break;
            case 2: hero.setPersonalItem("White Flame Bomb");
                break;
            case 3: hero.setPersonalItem("Wrath Potion");
                break;
            case 4: hero.setPersonalItem("Master Key");
                break;
            case 5: hero.setPersonalItem("Church's Chaplet");
                break;
            default: hero.setPersonalItem("Miracle Flask");
                break;
        }
    }

    public Character getResult() {
        return hero;
    }

}
