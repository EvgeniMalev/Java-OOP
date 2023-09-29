public class PCB {
    private String BOM;
    private String type;
    private String interface;
    private int quantity;
    private double price;
    private List<Component> components;

    public PCB(String BOM, String type, String interface, int quantity, double price) {
        setBOM(BOM);
        setType(type);
        setInterface(interface);
        setQuantity(quantity);
        setPrice(price);
    }

    private void setPrice(double price) {
        if (price < 0) {
            throw new IllegalStateException("Price cannot be negative");
        }

        this.price = price;
    }

    private void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalStateException("Quantity cannot be negative");
        }

        this.quantity = quantity;
    }

    private void setBOM(String BOM) {
        if (BOM.trim().isEmpty()) {
            throw new IllegalStateException("BOM cannot be empty");
        }

        this.BOM = BOM;
    }

    private void setType(String type) {
        if (type.trim().isEmpty()) {
            throw new IllegalStateException("Type cannot be empty");
        }

        this.type = type;
    }

    private void setInterface(String interface) {
        if (interface.trim().isEmpty()) {
            throw new IllegalStateException("Interface cannot be empty");
        }

        this.interface = interface;
    }

    private void setMoney(double money) {
        // TODO: Implement this method
    }

    public void buyProduct(Product product) {
        // TODO: Implement this method
    }
