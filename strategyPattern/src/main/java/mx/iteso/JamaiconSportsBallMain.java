package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        BowlingBall bowlling = new BowlingBall();
        CristalBall cristal = new CristalBall();
        GolfBall golf = new GolfBall();
        PingPongBall pingPong = new PingPongBall();
        TennisBall tennis = new TennisBall();

        System.out.println(bowlling.roll());
        System.out.println(bowlling.performBounce());
        System.out.println(bowlling.performDeflate());
        System.out.println(bowlling.performInflate());
        System.out.println(bowlling.explode());

        System.out.println();

        System.out.println(cristal.roll());
        System.out.println(cristal.performBounce());
        System.out.println(cristal.performDeflate());
        System.out.println(cristal.performInflate());
        System.out.println(cristal.explode());

        System.out.println();

        System.out.println(golf.roll());
        System.out.println(golf.performBounce());
        System.out.println(golf.performDeflate());
        System.out.println(golf.performInflate());
        System.out.println(golf.explode());

        System.out.println();

        System.out.println(pingPong.roll());
        System.out.println(pingPong.performBounce());
        System.out.println(pingPong.performDeflate());
        System.out.println(pingPong.performInflate());
        System.out.println(pingPong.explode());

        System.out.println();

        System.out.println(tennis.roll());
        System.out.println(tennis.performBounce());
        System.out.println(tennis.performDeflate());
        System.out.println(tennis.performInflate());
        System.out.println(tennis.explode());

        System.out.println();

        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());
        System.out.println(soccer.explode());

        System.out.println();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());
        System.out.println(american.explode());

        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());
        System.out.println(base.explode());

    }
}
