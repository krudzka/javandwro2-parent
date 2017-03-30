package json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Created by RENT on 2017-03-23.
 */
public class Challenge {
   private  String base;
   @JsonProperty(value ="date_a")
   private String date;
    private Map <String,Double> rates;

    public Challenge(String base, String date, Map<String, Double> rates) {
        this.base = base;
        this.date = date;
        this.rates = rates;
    }

    public Challenge(){

    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Challenge{" +
                "base='" + base + '\'' +
                ", date='" + date + '\'' +
                ", rates=" + rates +
                '}';
    }
}
