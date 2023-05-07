public interface Builder {

    void reset();
    void stepName(String name);
    void stepExpertise(int expertise);
    void stepWeapon(int weapon);
    void stepPersonalItem(int personalItem);
    Character getResult();

}
