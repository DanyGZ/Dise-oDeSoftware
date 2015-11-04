package mx.iteso.enemy;


import mx.iteso.adapter.enemy.EnemyAttacker;
import mx.iteso.adapter.enemy.EnemyRobot;
import mx.iteso.adapter.enemy.EnemyRobotAdapter;
import mx.iteso.adapter.enemy.impl.EnemyGiantRobot;
import mx.iteso.adapter.enemy.impl.EnemyTank;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Daniel on 02/11/2015.
 */
public class EnemyRobotAdapterTest {
    EnemyRobot robot;
    EnemyRobotAdapter robotAdapter;
    EnemyAttacker tank;

    @Before
    public void setUp(){
        robot = new EnemyGiantRobot();
        robotAdapter = new EnemyRobotAdapter(robot);
        tank = new EnemyTank();
    }

    @Test
    public void testReactToHuman(){
        assertEquals("Enemy Robot Tramps on Bob", robotAdapter.assignDriver("Bob"));
    }

    @Test
    public void testSmash(){
        assertEquals("Enemy Robot Causes Damage With Its Hands", robotAdapter.fireWeapon());
    }

    @Test
    public void testWalk(){
        assertEquals("Enemy Robot Walks Forward", robotAdapter.driveForward());
    }

    @Test
    public void testDifferenceBetweenTankAssignDriver(){
        assertEquals(false, robotAdapter.assignDriver("Bob").equals(tank.assignDriver("Bob")));
    }

    @Test
    public void testDifferenceBetweenTankFireWeapon(){
        assertEquals(false, robotAdapter.fireWeapon().equals(tank.fireWeapon()));
    }

    @Test
    public void testDifferenceBetweenTankDrive(){
        assertEquals(false, robotAdapter.driveForward().equals(tank.driveForward()));
    }
}
