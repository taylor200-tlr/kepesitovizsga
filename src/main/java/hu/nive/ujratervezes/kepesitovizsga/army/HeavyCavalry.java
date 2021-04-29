package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {
    private int hitPoints = 150;
    private int damage = 20;
    private boolean armored = true;
    private int numberOfAttack = 1;

    @Override
    int doDamage() {
        if (numberOfAttack == 1) {
            numberOfAttack++;
            return damage * 3;
        }
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

    @Override
    public int getHitPoints() {
        return hitPoints;
    }
}
