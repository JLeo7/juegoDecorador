package game.core.tools;

import game.core.Element;

public class Sword extends CharacterDecorator{
    Element element;

    public Sword (Element element) {
        this.element = element;
    }

    @Override
    public String getClassName() {
        return element.getClassName();
    }

    @Override
    public String getName () {
        return element.getName()+", with a sword";
    }

    @Override
    public int getHp() {
        return element.getHp()+1;
    }

    @Override
    public int getAtk() {
        return element.getAtk()+10;
    }

    @Override
    public int getDef() {
        return element.getDef()+10;
    }

    @Override
    public int getMp() {
        return element.getMp();
    }
}
