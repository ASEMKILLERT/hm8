package kg.geektech.game.players;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    public Magic(int health, int damage, SuperAbility ability) {
        super(health, damage, ability);
    }

    public void applySuperPower(Boss boss, Hero[] heroes) {

    }
}
