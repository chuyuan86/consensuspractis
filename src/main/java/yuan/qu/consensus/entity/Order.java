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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public Map<Long, Long> getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(Map<Long, Long> productAmount) {
        this.productAmount = productAmount;
    }
}
