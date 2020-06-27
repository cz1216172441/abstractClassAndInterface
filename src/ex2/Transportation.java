package ex2;

public abstract class Transportation implements RideSelection {

    private int cost;
    private String name;

    public Transportation(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean canRide(int budget) {
        return budget >= this.cost;
    }

}
