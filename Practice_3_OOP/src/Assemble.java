import java.util.List;
public interface Assemble {

    void connectToMotherboard(Motherboard motherboard);

    void connectToCase(Case computerCase);

    void addComponent(GetData component);

    double calculateTotalPrice();

    String getDescription();

    List<GetData> getComponents();
}
