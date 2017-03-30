package designPatternCreational.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-03-27.
 */
public class Shop {
    List<Observator> observators = new ArrayList<>();

    public void discount(){
        observators.forEach(x->x.notifyObservator());

    }

    public void registerObservator(Observator observator){
        observators.add(observator);
    }
}
