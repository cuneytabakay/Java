package Gun36.Final.classfinal;

public class Tasit {
    private String model;

    public Tasit(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public final String toString() {
        return "Tasit{" +
                "model='" + model + '\'' +
                '}';
    }
}
