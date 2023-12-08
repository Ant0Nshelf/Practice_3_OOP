public class Service {

    private final Assemble computerAssembly;

    public Service(Assemble computerAssembly){
        this.computerAssembly = computerAssembly;
    }

    public void addProcessor(CPUBuilder processorBuilder) {
        CPU processor = processorBuilder.build();
        computerAssembly.addComponent(processor);
    }

    public void addMemory(MemoryBuilder memoryBuilder) {
        Memory memory = memoryBuilder.build();
        computerAssembly.addComponent(memory);
    }

    public void addMotherboard(MotherboardBuilder motherboardBuilder) {
        Motherboard motherboard = motherboardBuilder.build();
        computerAssembly.addComponent(motherboard);
    }

    public void addGraphicCard(GraphicCardBuilder graphicCardBuilder) {
        GraphicCard graphicCard = graphicCardBuilder.build();
        computerAssembly.addComponent(graphicCard);
    }

    public void addPowerSupply(PowerSupplyBuilder powerSupplyBuilder) {
        PowerSupply powerSupply = powerSupplyBuilder.build();
        computerAssembly.addComponent(powerSupply);
    }

    public void addRam(RamBuilder ramBuilder) {
        RAM ram = ramBuilder.build();
        computerAssembly.addComponent(ram);
    }

    public void addCase(CaseBuilder caseBuilder) {
        Case pcCase = caseBuilder.build();
        computerAssembly.addComponent(pcCase);
    }

    public Assemble getComputer(){return computerAssembly;}
}
