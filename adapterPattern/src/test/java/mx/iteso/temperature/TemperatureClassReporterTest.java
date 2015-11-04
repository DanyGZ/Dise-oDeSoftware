package mx.iteso.temperature;

import mx.iteso.adapter.temperature.adapters.TemperatureClassReporter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Daniel on 02/11/2015.
 */
public class TemperatureClassReporterTest {
    TemperatureClassReporter temperatureClassReporter;

    @Before
    public void setUp(){
        temperatureClassReporter = new TemperatureClassReporter();
        temperatureClassReporter.setTemperatureInCelsius(26.6);
        temperatureClassReporter.setTemperatureInFahrenheit(80);
    }

    @Test
    public void testGetCelcius(){
        assertEquals(26.6, temperatureClassReporter.getTemperatureInCelsius(),.1);
    }

    @Test
    public void testGetFarenheit(){
        assertEquals(80, temperatureClassReporter.getTemperatureInFahrenheit(), .1);
    }
}
