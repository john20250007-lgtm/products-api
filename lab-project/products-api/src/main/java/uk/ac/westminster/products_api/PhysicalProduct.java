public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){}
    public DigitalProduct(Long id, String name, double price,
                          String weightKg, double dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }
    public String getWeightKg() {
        return weightKg;
    }
    public double getDimensions() {
        return dimensions;
    }
}