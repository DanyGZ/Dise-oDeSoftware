package mx.iteso.observer.impl;

import mx.iteso.observer.Scorer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;

public class StoreMonitorDisplayTest {
    private StoreMonitorDisplay storeMonitorDisplay;
    private ScoresData scoresData;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
    }

    @Test
    public void testUpdate() {
        storeMonitorDisplay.update("homeTeam", "awayTeam", 1, 0, new ArrayList<Scorer>());
        //Nothing to assert or verify for now
    }
}
