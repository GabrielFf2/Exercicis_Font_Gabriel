
package com.pakage;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        int ex = 2;

        if (ex == 1 ) {
            ex1();
        }
        if (ex == 2 ) {
            ex2();
        }

    }
    public static void ex1(){
        int Peres = 2 ;
        int Pomes = 5 ;

        System.out.println(Peres+Pomes);

        if (Peres > Pomes){
            System.out.println("tenc mes peres que pomes");
        }
        if (Pomes > Peres){
            System.out.println("tenc mes Pomes que Peres");
        }

        /* ==  =!  <  >  >=  <=  Operadors Relacionals */
        /* and &&  or ||  not !  Operadors Logics */

        Scanner sc1 = new Scanner(System.in);

        int maria ;
        int tomeu ;
        int antonia ;
        System.out.println("Edat de na Maria : ");
        maria = sc1.nextInt();
        sc1.nextLine();
        System.out.println("Edat den Tomeu : ");
        tomeu = sc1.nextInt();
        sc1.nextLine();
        System.out.println("Edat de n'Antonia : ");
        antonia = sc1.nextInt();


        //Donat l'edat de 3 persones , na Maria , En Tomeu i n'antonia
        //digues si na maria te el doble  d'edat que en tomeu i n'antonia junts
        if (maria == (tomeu+antonia)*2)
            System.out.println("Na maria te el doble d el'edat den tomeu i n'antonia junts");
        else {
            System.out.println("Na maria no te el doble d el'edat den tomeu i n'antonia junts");
        }

        //L'edat den tomeu es dues vegades l'edat de n'antonia
        if (tomeu == (antonia*2)){
            System.out.println("En tomeu te el doble de l'edad de n'antonia");
        }

        //L'edat de na maria es parell
        if ( antonia % 2 == 0 ){
            System.out.println("L'edat de n'antonia es parell");
        }
        //Na maria te mes anys que en tomeu i en tomeu te mes anys que n'antonia
        if (maria > tomeu && tomeu > antonia){
            System.out.println("na maria te mes anys que en tomeu i n'antonia junts");
        }

        //na maria te menus anys que nantonia o en tomeu te me anys que na maria
        if (maria > antonia || tomeu > maria){
            System.out.println("na maria te menus anys que nantonia o en tomeu te me anys que na maria");
        }

    }
}