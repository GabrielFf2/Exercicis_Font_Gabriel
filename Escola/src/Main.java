public class Main {
    public static void main(String[] args) {

        Escola IESManacor = new Escola("IES Manacor","Carrer veinat de son gotleu");
        IESManacor.afegirCurs(new Curs("Informatica"));
        IESManacor.assignarProfeCurs(new Profe(1700.43,"Miquel","nonBinari",27),"Informatica");
        IESManacor.assignarEstudiantCurs(new Estudiant(7,"PEP","home",17),"Informatica");
        System.out.println(IESManacor.toString());
        IESManacor.borrarCurs("Informatica");
        System.out.println(IESManacor.toString());

    }
}