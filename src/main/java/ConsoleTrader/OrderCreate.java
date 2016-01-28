package ConsoleTrader;

import com.ib.client.Order;

/**
 * Created by khalida on 1/28/2016.
 */
public class OrderCreate {

    private String orderType;
    private int orderQuantity;
    private String action;
    private final String account = "DU314318";

    public OrderCreate() {
        orderType = null;
        orderQuantity = 0;
        action = null;
    }

    public OrderCreate(Order order, String orderType, int orderQuantity, String action) {
        this.orderType = orderType;
        this.orderQuantity = orderQuantity;
        this.action = action;
    }

    public void setOrderObject(Order order) {
        order.m_account = this.account;
        order.m_action = this.action;
        order.m_totalQuantity = this.orderQuantity;
        order.m_orderType = this.orderType;
    }

    public String getAccount() {
        return account;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}
