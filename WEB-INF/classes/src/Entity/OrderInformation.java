package Entity;

// 订货信息类
public class OrderInformation {
    private int order_number;
    private int order_amount;
    private String order_time;

    public OrderInformation() {
    }

    public OrderInformation(int number, int amount, String time) {
        this.order_number = number;
        this.order_amount = amount;
        this.order_time = time;
    }

    public int getOrder_number() {
        return order_number;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }

    public int getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(int order_amount) {
        this.order_amount = order_amount;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    @Override
    public String toString() {
        return "OrderInformation{" +
                "order_number=" + order_number +
                ", order_amount=" + order_amount +
                ", order_time='" + order_time + '\'' +
                '}';
    }
}
