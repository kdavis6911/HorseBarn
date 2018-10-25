public class Stallion implements Horse{
    private String name;
    private int weight;

    public Stallion(String name, int weight) {
        this.weight = weight;
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public int getWeight()
    {
        return weight;
    }
}
