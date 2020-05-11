package Entity;

// 库存清单类
public class InventoryList {
    private int list_number;
    private int list_amount;
    private int critical_value;

    public InventoryList() {
    }

    public InventoryList(int number, int amount, int value) {
        this.list_number = number;
        this.list_amount = amount;
        this.critical_value = value;
    }

    public int getList_number() {
        return list_number;
    }

    public void setList_number(int list_number) {
        this.list_number = list_number;
    }

    public int getList_amount() {
        return list_amount;
    }

    public void setList_amount(int list_amount) {
        this.list_amount = list_amount;
    }

    public int getCritical_value() {
        return critical_value;
    }

    public void setCritical_value(int critical_value) {
        this.critical_value = critical_value;
    }

    @Override
    public String toString() {
        return "InventoryList{" +
                "list_number=" + list_number +
                ", list_amount=" + list_amount +
                ", critical_value=" + critical_value +
                '}';
    }
}
