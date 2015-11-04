package mx.iteso.temperature;

import mx.iteso.adapter.temperature.adapters.TemperatureObjectReporter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Daniel on 02/11/2015.
 */
public class TemperatureObjectReporterTest {
    TemperatureObjectReporter temperatureObjectReporter;

    @Before
    public void setUp(){
        temperatureObjectReporter = new TemperatureObjectReporter();
        temperatureObjectReporter.setTemperatureInCelsius(26.6);
        temperatureObjectReporter.setTemperatureInFahrenheit(80);
    }

    @Test
    public void testGetCelcius(){
        assertEquals(26.6, temperatureObjectReporter.getTemperatureInCelsius(),.1);
    }

    @Test
    public void testGetFarenheit(){
        assertEquals(80, temperatureObjectReporter.getTemperatureInFahrenheit(), .1);
    }
}
