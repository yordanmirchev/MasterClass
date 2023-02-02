package interfaces;

import org.hamcrest.core.Is;

public class Main {

    public static void main(String[] args) {
       ISaveable player = new Player("player", 10, 100);
       ISaveable monster= new Monster("monster", 10, 100);

        System.out.println(player);
        System.out.println(monster);

        System.out.println(player.write());
        System.out.println(monster.write());
    }

}

