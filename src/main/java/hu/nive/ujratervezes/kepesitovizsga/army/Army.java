package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<MilitaryUnit> army = new ArrayList<>();

    public int getArmySize() {
        return army.size();
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public int getArmyDamage() {
        int result = 0;
        for (MilitaryUnit actual : army) {
            result += actual.doDamage();
        }
        return result;
    }

    public void damageAll(int i) {
        List<MilitaryUnit> deadUnit = new ArrayList<>();
        for (MilitaryUnit actual : army) {
            actual.sufferDamage(i);
            if (actual.getHitPoints() < 25) {
                deadUnit.add(actual);
            }
        }
        army.removeAll(deadUnit);
    }
}
