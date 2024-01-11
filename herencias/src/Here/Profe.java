package Here;

import Here.Persona;

public class Profe extends Persona {

    String assignatura ;
    public Profe(String assignatura ,String nom , int edad){
        super(nom,edad);
        this.assignatura = assignatura;
    };
    public String toString(){
        return super.toString()+ assignatura;
    };
    public String getAssignatura() {
        return assignatura;
    }
    public void setAssignatura(String assignatura) {
        this.assignatura = assignatura;
    }
}
