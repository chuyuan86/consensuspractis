package yuan.qu.consensus.service.impl;

import yuan.qu.consensus.entity.Order;
import yuan.qu.consensus.service.ProductService;

public class ProductServiceImpl implements ProductService{

    /**
     * 1:redis
     * 2:memory
     * 3:db
     * */
    private static int strategy;

    public Long getProductQuantity(Long id) {
        switch(this.strategy){
            case 1:
                System.out.print("redis");
            case 2:
                System.out.print("memory");
            case 3:
                System.out.print("db");
        }
        return null;
    }

    public boolean addOrder(Order o) {
        switch(this.strategy){
            case 1:
                System.out.print("redis");
            case 2:
                System.out.print("memory");
            case 3:
                System.out.print("db");
        }
        return false;
    }
}
