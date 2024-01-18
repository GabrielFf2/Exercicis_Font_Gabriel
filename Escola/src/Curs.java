import java.util.ArrayList;
public class Curs {

    private String nom;
    private int codi=0;
    private Profe profe;
    private ArrayList<Estudiant> estudiants = new ArrayList<Estudiant>();

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCodi() {
        return codi;
    }
    public void setCodi(int codi) {
        this.codi = codi;
    }

    public Profe getProfe() {
        return profe;
    }

    public void assignarProfe(Profe profe) {
        this.profe = profe;
    }

    public ArrayList<Estudiant> getEstudiants() {
        return estudiants;
    }
    public void afegirEstudiants(Estudiant estudiant){
        estudiants.add(estudiant);
    }
    @Override
    public String toString() {
        return "Curs{" +
                "nom='" + nom + '\'' +
                ", codi=" + codi +
                ", profe=" + profe +
                ", estudiants=" + estudiants +
                '}';
    }
    public Curs (String nom ){
        this.codi = getCodi();
        codi++;
        this.nom=nom;
    }
}
