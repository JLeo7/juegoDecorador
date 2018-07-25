package game.core.tools;

import game.core.Element;

public class Amulet extends CharacterDecorator{
    Element element;

    public Amulet (Element element){
        this.element = element;
    }

    @Override
    public String getClassName() {
        return element.getClassName();
    }

    @Override
    public String getName () {
        if ("Worker".equals(element.getClassName())){
            return element.getName()+", with an amulet (no stats increased due to class)";
        } else {
            return element.getName()+", with an amulet";
        }
    }

    @Override
    public int getHp() {
        return element.getHp();
    }

    @Override
    public int getAtk() {
        return element.getAtk();
    }

    @Override
    public int getDef() {
        return element.getDef();
    }

    @Override
    public int getMp() {
        if ("Worker".equals(element.getClassName())){
            return element.getMp();
        } else {
            return element.getMp()+10;
        }
    }
}
