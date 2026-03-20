package org.sourav;

public class DiselEngine implements Engine {
    String type;
    int milage;
    String model;

    public DiselEngine() {
    }

    public DiselEngine(String type, int milage, String model) {
        this.type = type;
        this.milage = milage;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public int getMilage() {
        return milage;
    }

    public String getModel() {
        return model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Disel engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Disel car stops");
    }

    @Override
    public String toString() {
        return "DiselEngine{" +
                "type='" + type + '\'' +
                ", milage=" + milage +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public void accelerator() {
        System.out.println("acclereration: car speading");
    }
}
