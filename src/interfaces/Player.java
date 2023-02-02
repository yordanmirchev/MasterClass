package interfaces;

import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        return List.of(this.getName(), this.getWeapon(), ""
                + this.getHitPoints(), "" + this.getStrength());
    }

    @Override
    public void read(List<String> values) {
        if (values != null && values.size() > 0) {
            setName(values.get(0));
            setWeapon(values.get(1));
            setHitPoints(Integer.parseInt(values.get(2)));
            setStrength(Integer.parseInt(values.get(3)));
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + "Tim" + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
