package designPatternCreational;

/**
 * Created by RENT on 2017-03-27.
 */
public class SingletonLazyInit {

    private static SingletonLazyInit INSTANCE = null;

    private SingletonLazyInit(){

    }

    public static SingletonLazyInit getINSTANCE(){
        if(INSTANCE==null){
            INSTANCE = new SingletonLazyInit();
        }

        return INSTANCE;
    }


}
