package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Scorer;
import mx.iteso.observer.Subject;

import java.util.ArrayList;

/**
 * Created by Daniel on 24/09/2015.
 */
public class MobileAppDisplay implements Observer, Displayable {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private Subject scoresData;
    private ArrayList<Scorer> scorers;

    public MobileAppDisplay(Subject scoresData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
    }

    public void display() {
        System.out.println("\nMobileApp. Latest score is:");
        System.out.println(homeTeam + " (HOME) " + homeGoals + " - "
                + awayTeam + " (AWAY) " + awayGoals + "\nGoals");
        for(Scorer scorer : scorers){
            System.out.println(scorer);
        }
    }

    public void update(String home, String away, int homeGoals, int awayGoals, ArrayList<Scorer> scorers) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.scorers = scorers;
        display();
    }
}
