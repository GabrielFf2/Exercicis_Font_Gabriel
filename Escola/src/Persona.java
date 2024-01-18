public class Persona {

    protected String nom ;
    protected  String genere;
    protected int edad;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getGenere() {
        return genere;
    }
    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", genere='" + genere + '\'' +
                ", edad=" + edad +
                '}';
    }

    public Persona (String nom , String genere , int edad){
        this.edad = edad;
        this.genere = genere;
        this.nom = nom;
    }
}
