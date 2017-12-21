package yuan.qu.consensus.entity;

import java.util.List;
import java.util.Map;

/**
 * 订单
 * */
public class Order {

    private String orderId;

    private List<Product> product;

    private Map<Long,Long> productAmount;

}
