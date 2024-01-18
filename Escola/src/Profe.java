public class Profe extends Persona{

    private static int contadorProfeID = 1;
    private int profeID ;
    private double salari ;

    public double getSalari() {
        return salari;
    }
    public void setSalari(double salari) {
        this.salari = salari;
    }

    public int getProfeID() {
        return profeID;
    }
    private void setProfeID(int profeID) {
        this.profeID = profeID;
    }

    @Override
    public String toString() {
        return "Profe{" +
                "profeID=" + profeID +
                ", salari=" + salari + super.toString() +
                '}';
    }

    public Profe (double salari , String nom , String genere , int edad){
        super(nom,genere,edad);
        this.profeID=contadorProfeID;
        contadorProfeID++;
        this.salari = salari;
    }

}
