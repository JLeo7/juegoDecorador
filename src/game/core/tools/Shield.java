package game.core.tools;

import game.core.Element;

public class Shield extends CharacterDecorator{
    Element element;

    public Shield (Element element) {
        this.element = element;
    }

    @Override
    public String getClassName() {
        return element.getClassName();
    }

    @Override
    public String getName () {
        return element.getName()+", with a shield";
    }

    @Override
    public int getHp() {
        return element.getHp()+10;
    }

    @Override
    public int getAtk() {
        return element.getAtk();
    }

    @Override
    public int getDef() {
        return element.getDef()+40;
    }

    @Override
    public int getMp() {
        return element.getMp();
    }
}
