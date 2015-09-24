package mx.iteso.observer;

import mx.iteso.observer.impl.MobileAppDisplay;
import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;

import java.util.ArrayList;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();

        MobileAppDisplay mobile = new MobileAppDisplay(scoresData);
        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
        ArrayList<Scorer> scorers = new ArrayList<Scorer>();
        scorers.add(new Scorer("Boby", 8, "Deltantero", "TacitKnowledge"));
        scorers.add(new Scorer("Jake", 10, "MedioCampista", "TacitKnowledge"));
        scorers.add(new Scorer("CR", 7, "Deltantero", "TacitKnowledge"));
        scorers.add(new Scorer("Tom", 10, "MedioCampista", "TacitKnowledge"));
        scoresData.setScore("Tacit Knowledge", "Intel", 4, 0, scorers);

        scorers = new ArrayList<Scorer>();
        scorers.add(new Scorer("Danger", 8, "Deltantero", "Queretaro"));
        scorers.add(new Scorer("Eptos", 10, "MedioCampista", "Chivas"));
        scorers.add(new Scorer("Tanke", 7, "MedioCampista", "Chivas"));
        scoresData.removeObserver(storeMonitorDisplay);
        scoresData.setScore("Chivas", "Queretaro", 2, 1, scorers);

    }
}
