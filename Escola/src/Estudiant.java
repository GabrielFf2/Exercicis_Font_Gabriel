public class Estudiant extends Persona {

    private  int estudiantID;
    private double mitjana;
    private static int contadorEstudiantID = 1;

    public int getEstudiantID() {
        return estudiantID;
    }

    private void setEstudiantID(int estudiantID) {
        this.estudiantID = estudiantID;
    }

    public double getMitjana() {
        return mitjana;
    }
    public void setMitjana(double mitjana) {
        this.mitjana = mitjana;
    }

    @Override
    public String toString() {
        return "Estudiant{" +
                "mitjana=" + mitjana +
                "ID d'estudiant="+ estudiantID + super.toString() +
                '}';
    }


    public Estudiant(double mitjana , String nom , String genere , int edad){
        super(nom,genere,edad);
        this.mitjana = mitjana;
        this.estudiantID = contadorEstudiantID;
        contadorEstudiantID++;
    }

}
