package json;

import java.util.List;

/**
 * Created by RENT on 2017-03-23.
 */
public class WeatherOutside {
    private List<Weather> weather;

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public WeatherOutside(){

    }

    @Override
    public String toString() {
        return "WeatherOutside{" +
                "weather=" + weather +
                '}';
    }
}
