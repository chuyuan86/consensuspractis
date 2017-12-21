package yuan.qu.consensus.service;

import yuan.qu.consensus.entity.Order;

public interface ProductService {

    /**
     * 获取商品数量
     * */
    public Long getProductQuantity(Long id);


    /**
     * 下单
     * */
    public boolean addOrder(Order o);

}
