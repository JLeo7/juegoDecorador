package game.core.tools;

import game.core.Element;

public class Armor extends CharacterDecorator{
    Element element;

    public Armor (Element element) {
        this.element = element;
    }

    @Override
    public String getClassName() {
        return element.getClassName();
    }

    @Override
    public String getName () {
        return element.getName()+", with armor";
    }

    @Override
    public int getHp() {
        return element.getHp()+20;
    }

    @Override
    public int getAtk() {
        return element.getAtk();
    }

    @Override
    public int getDef() {
        return element.getDef()+20;
    }

    @Override
    public int getMp() {
        return element.getMp();
    }
}
