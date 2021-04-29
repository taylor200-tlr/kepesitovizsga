package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {
    private int hitPoints = 50;
    private int damage = 20;
    private boolean armored = false;

    @Override
    int doDamage() {
        return damage;
    }

    @Override
    void sufferDamage(int damage) {
        if (armored) {
            hitPoints -= damage / 2;
        } else {
            hitPoints -= damage;
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
