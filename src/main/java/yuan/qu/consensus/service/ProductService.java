package yuan.qu.consensus.service;

import yuan.qu.consensus.entity.Order;

public interface ProductService {

    /**
     * 获取商品数量
     *
     * @param id 商品id
     * @return 库存数量
     * */
    Long getProductQuantity(Long id);


    /**
     * 下单
     *
     * @param o 订单对象
     * @return 是否下单成功
     * */
    boolean addOrder(Order o);

}
