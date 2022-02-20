package kg.geektech.game.players;

public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, SuperAbility.HEAL);
        this.healPoints = healPoints;
    }

    public Medic(int health, int damage, SuperAbility ability) {
        super(health, damage, ability);
    }

    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() > 0) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0 && this != heroes[i]) {
                    heroes[i].setHealth(heroes[i].getHealth() + this.healPoints);
                }
            }
        }
    }

    public int getHealPoints() {
        return healPoints;
    }
}
