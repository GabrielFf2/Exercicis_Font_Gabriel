package Here;

public class Persona {

    protected int edad = 18;
    protected String nom = "???";

    public Persona() {
    }
    public Persona(String nom , int edad ){
        this.edad = edad;
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return nom + " " + edad ;
    }
}
