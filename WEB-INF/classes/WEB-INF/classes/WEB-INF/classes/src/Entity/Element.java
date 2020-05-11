package Entity;

// 零件信息类
public class Element {
    private int element_number;
    private String element_name;
    private double element_price;
    private String major_supplier;
    private String secondary_supplier;

    public Element() {
    }

    public Element(int number, String name, double price, String m_supplier, String s_supplier) {
        this.element_number = number;
        this.element_name = name;
        this.element_price = price;
        this.major_supplier = m_supplier;
        this.secondary_supplier = s_supplier;
    }

    public int getElement_number() {
        return element_number;
    }

    public void setElement_number(int element_number) {
        this.element_number = element_number;
    }

    public String getElement_name() {
        return element_name;
    }

    public void setElement_name(String element_name) {
        this.element_name = element_name;
    }

    public double getElement_price() {
        return element_price;
    }

    public void setElement_price(double element_price) {
        this.element_price = element_price;
    }

    public String getMajor_supplier() {
        return major_supplier;
    }

    public void setMajor_supplier(String major_supplier) {
        this.major_supplier = major_supplier;
    }

    public String getSecondary_supplier() {
        return secondary_supplier;
    }

    public void setSecondary_supplier(String secondary_supplier) {
        this.secondary_supplier = secondary_supplier;
    }

    @Override
    public String toString() {
        return "Element{" +
                "element_number=" + element_number +
                ", element_name='" + element_name + '\'' +
                ", element_price=" + element_price +
                ", major_supplier='" + major_supplier + '\'' +
                ", secondary_supplier='" + secondary_supplier + '\'' +
                '}';
    }
}
