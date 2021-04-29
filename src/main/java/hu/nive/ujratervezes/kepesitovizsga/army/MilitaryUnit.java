package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {
    abstract int doDamage();

    abstract void sufferDamage(int damage);

    public abstract int getHitPoints();
}
