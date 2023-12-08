public class Memory implements  ConnectToMotherboard, GetData{

    private final String name;
    private final String type;
    private final double capacity;
    private final Manufacturer manufacturer;
    private final double price;

    public Memory(String name, String type, double capacity, Manufacturer manufacturer, double price){
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public void connectToMotherboard(Motherboard motherboard) {
        motherboard.addMemory(this);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Память: "+ manufacturer + " " + name + " " + capacity + "GB (Тип: " + type + ")";
    }
}
