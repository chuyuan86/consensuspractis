package yuan.qu.consensus.local;

import yuan.qu.consensus.entity.Order;

import java.util.HashMap;
import java.util.Map;

public class LocalCache {

    public static Map<Long,Long> productCount = new HashMap<Long, Long>();

    static{
        loadTest();
        //loadFromDb();
    }

    private static void loadTest(){
        productCount.put(1l,123l);
        productCount.put(2l,123l);
        productCount.put(3l,123l);
    }

    private static void loadFromDb(){

    }






}
