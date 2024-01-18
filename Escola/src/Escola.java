import java.util.ArrayList;

public class Escola {

    private String nom;
    private String adressa;
    private ArrayList<Curs> cursos = new ArrayList<Curs>();

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdressa() {
        return adressa;
    }
    public void setAdressa(String adressa) {
        this.adressa = adressa;
    }
    public void afegirCurs (Curs curs){
        this.cursos.add(curs);
    }
    public void borrarCurs (String asignatura){
        cursos.removeIf(i -> i.getNom().equals(asignatura));
    }
    public void assignarProfeCurs (Profe profe , String asignatura){
        for (Curs i : cursos ) {
            if (i.getNom()==asignatura){
                i.assignarProfe(profe);
            }
        }
    }
    public Profe professorDeAssignatura (String asignatura){
        Profe a = null;
        for (Curs i : cursos ) {
            if (i.getNom()==asignatura){
               a = i.getProfe();
            }
        }
        return a;
    }
    public void assignarEstudiantCurs (Estudiant estudiant , String asignatura){
        for (Curs i : cursos ) {
            if (i.getNom()==asignatura){
                i.afegirEstudiants(estudiant);
            }
        }
    }
    public ArrayList<Estudiant> alumnesDeAssignatura (String asignatura){
        ArrayList<Estudiant> a = null;
        for (Curs i : cursos ) {
            if (i.getNom()==asignatura){
                a = i.getEstudiants();
            }
        }
        return a;
    }

    @Override
    public String toString() {
        return "Escola{" +
                "nom='" + nom + '\'' +
                ", adressa='" + adressa + '\'' +
                ", cursos=" + cursos +
                '}';
    }

    public Escola (String nom ,String adressa ){
        this.adressa=adressa;
        this.nom=nom;
    }
}
