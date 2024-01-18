package claseAbstrac;

public class Triangle extends  Figura {

    protected double base;
    protected double altura;

    public Triangle(double base , double altura){
        super(3);
        this.altura=altura;
        this.base=base;
    };
    public double area(){
        return this.base * this.altura /2;
    }




}
