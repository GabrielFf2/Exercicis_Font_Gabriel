package claseAbstrac;

public abstract class Figura {

    protected  int costats;
    public Figura(int costats){
        this.costats=costats;
    };
    public int getCostats() {
        return costats;
    }
    public void setCostats(int costats) {
        this.costats = costats;
    }

    public abstract double area();
}
