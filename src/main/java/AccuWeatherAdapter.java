package main.java;

import java.util.List;
import java.util.Map;

public class AccuWeatherAdapter implements Clima{

    AccuWeatherAPI accuWeatherAPI;

    public AccuWeatherAdapter(AccuWeatherAPI AccuAPI)
    {
        accuWeatherAPI = AccuAPI;
    }

    public List<Map<String, Object>> getWeather(String ciudad) {

        return accuWeatherAPI.getWeather(ciudad);
    }

}
