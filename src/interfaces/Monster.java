package interfaces;

import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }


    @Override
    public List<String> write() {
        return List.of(this.getName(), ""
                + this.getHitPoints(), "" + this.getStrength());
    }

    @Override
    public void read(List<String> values) {
        if (values != null && values.size() > 0) {
            this.name = values.get(0);
            this.hitPoints = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + "Werewolf" + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
