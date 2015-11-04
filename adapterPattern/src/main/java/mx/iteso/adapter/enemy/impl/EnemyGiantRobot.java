package mx.iteso.adapter.enemy.impl;

import mx.iteso.adapter.enemy.EnemyRobot;

public class EnemyGiantRobot implements EnemyRobot{

    public String smashWithHands() {
        return ("Enemy Robot Causes Damage With Its Hands");
    }

    public String walkForward() {
        return ("Enemy Robot Walks Forward");
    }

    public String reactToHuman(String driverName) {
        return ("Enemy Robot Tramps on " + driverName);
    }

}
