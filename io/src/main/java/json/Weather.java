package json;

/**
 * Created by RENT on 2017-03-23.
 */
public class Weather {
    String description;

    @Override
    public String toString() {
        return "Weather{" +
                "description='" + description + '\'' +
                '}';
    }
public Weather (){

}
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
