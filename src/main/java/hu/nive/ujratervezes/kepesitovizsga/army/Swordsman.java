package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {
    private int hitPoints = 100;
    private int damage = 10;
    private boolean armored;
    private boolean shilded = true;

    public Swordsman(boolean armored) {
        this.armored = armored;
    }

    @Override
    int doDamage() {
        return 10;
    }

    @Override
    void sufferDamage(int damage) {
        if (shilded) {
            shilded = false;
        } else if (armored) {
            hitPoints -= damage / 2;
        } else {
            hitPoints -= damage;
        }
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }
}
