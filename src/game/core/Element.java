package game.core;

public abstract class Element {
    protected String className;
    protected String name;
    protected int hp;
    protected int atk;
    protected int def;
    protected int mp;

    public abstract String getClassName();
    public abstract String getName();
    public abstract int getHp();
    public abstract int getAtk();
    public abstract int getDef();
    public abstract int getMp();
}
