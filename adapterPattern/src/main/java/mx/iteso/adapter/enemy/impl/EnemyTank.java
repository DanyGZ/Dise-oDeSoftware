package mx.iteso.adapter.enemy.impl;

import mx.iteso.adapter.enemy.EnemyAttacker;

public class EnemyTank implements EnemyAttacker {

    public String fireWeapon() {
        return("Enemy tank fires weapon");
    }

    public String driveForward() {
        return("Enemy Tank moves forward");
     }

    public String assignDriver(String driverName) {
        return (driverName + " is driving the tank");
    }

}
