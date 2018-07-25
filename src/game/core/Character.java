package game.core;

import game.core.enums.CharacterStats;

public class Character extends Element{

    public Character(CharacterStats chStats){
        className = chStats.getClassName();
        name = chStats.getClassName();
        hp = chStats.getHp();
        atk = chStats.getAtk();
        def = chStats.getDef();
        mp = chStats.getMp();
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getAtk() {
        return atk;
    }

    @Override
    public int getDef() {
        return def;
    }

    @Override
    public int getMp() {
        return mp;
    }
}
