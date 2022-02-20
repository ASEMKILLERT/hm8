package kg.geektech.game.players;

public class Berserk extends Hero {
    private int saved_damage;

    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    public int getSaved_damage() {
        return saved_damage;
    }

    public void setSaved_damage(int saved_damage) {
        this.saved_damage = saved_damage;
    }

    public void hit(Boss boss) {
        if (this.getHealth() > 0 && boss.getHealth() > 0) {
            boss.setHealth(boss.getHealth()
                    - this.getDamage() - getSaved_damage());
        }
    }

    public Berserk(int health, int damage, SuperAbility ability) {
        super(health, damage, ability);
    }

    public void applySuperPower(Boss boss, Hero[] heroes) {
        // it works in method hit logic
    }
}
