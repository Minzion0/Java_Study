package study;

abstract class GreenOrc{
    public final String SKIN_COLOR = "녹색";
    public int health;
    public int attackDamage;
    public int defense;

    public abstract void setHealth();
    public abstract void setAttackDamage();
    public abstract void setDefense();
}

interface NPCSystem{
    void conversationSystem();
    void questionSystem();
}

interface UserSystem{
    void partySystem();
    void tradeSystem();
}

class OrkNPC1 extends GreenOrc implements NPCSystem{

    @Override
    public void conversationSystem() {

    }

    @Override
    public void questionSystem() {

    }

    @Override
    public void setHealth() {

    }

    @Override
    public void setAttackDamage() {

    }

    @Override
    public void setDefense() {

    }
}

class OrkUser1 extends GreenOrc implements UserSystem{

    @Override
    public void setHealth() {
        this.health=100;
    }

    @Override
    public void setAttackDamage() {
        this.attackDamage=10;
    }

    @Override
    public void setDefense() {
        this.defense=5;
    }

    @Override
    public void partySystem() {

    }

    @Override
    public void tradeSystem() {

    }
}
public class Java_11_2 {
}