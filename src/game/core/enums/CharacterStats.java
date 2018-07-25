package game.core.enums;

public enum CharacterStats {
    MAGE ("Mage",8,15,15,40),
    WARRIOR ("Warrior",20,30,30,20),
    WORKER ("Worker",25,10,10,10);

    private String className;
    private int hp;
    private int atk;
    private int def;
    private int mp;

    CharacterStats(String className, int hp, int atk, int def, int mp){
        this.className = className;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.mp = mp;
    }

    public String getClassName() {
        return className;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getMp() {
        return mp;
    }
}
