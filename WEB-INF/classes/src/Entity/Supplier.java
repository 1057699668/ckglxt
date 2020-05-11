package Entity;

// 供应商信息类
public class Supplier {
    private int supplier_number;
    private String supplier_name;
    private int supplier_contact;
    private String supplier_address;

    public Supplier() {
    }

    public Supplier(int number, String name, int contact, String address) {
        this.supplier_number = number;
        this.supplier_name = name;
        this.supplier_contact = contact;
        this.supplier_address = address;
    }

    public int getSupplier_number() {
        return supplier_number;
    }

    public void setSupplier_number(int supplier_number) {
        this.supplier_number = supplier_number;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public int getSupplier_contact() {
        return supplier_contact;
    }

    public void setSupplier_contact(int supplier_contact) {
        this.supplier_contact = supplier_contact;
    }

    public String getSupplier_address() {
        return supplier_address;
    }

    public void setSupplier_address(String supplier_address) {
        this.supplier_address = supplier_address;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplier_number=" + supplier_number +
                ", supplier_name='" + supplier_name + '\'' +
                ", supplier_contact='" + supplier_contact + '\'' +
                ", supplier_address='" + supplier_address + '\'' +
                '}';
    }
}
