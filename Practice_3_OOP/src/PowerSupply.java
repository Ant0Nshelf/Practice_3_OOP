public class PowerSupply implements ConnectToCase, GetData{

    private final String name;
    private final int power;
    private Manufacturer manufacturer;
    private final double price;

    public PowerSupply(String name, int power, Manufacturer manufacturer, double price){
        this.name = name;
        this.power = power;
        this.manufacturer = manufacturer;
        this.price = price;
    }


    public void connectToCase(Case pcCase) {
        pcCase.addPower(this);
    }


    public double getPrice() {
        return price;
    }


    public String getDescription() {
        return "Блок живлення: " + manufacturer + " " + name + " " + power + "V";
    }
}
