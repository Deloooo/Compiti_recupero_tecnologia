/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese_frequenze;

import java.util.Scanner;

/**
 *
 * @author Gabriele
 */
/*
1)chiedere all'utente una stringa contenente delle fermate di una linea di autobus e gli orari di 5 corse che partono ad orari differenti
2)chiedere all'utente di inserire il nome del comune da cui parte e il nome del comune dove deve andare 
3)facendo utilizzo di thread ricercare se la linea che permette di arrivare a destinazione e in caso positivo l'elenco di tutti gli orari di partenza e di arrivo
4)al termine il programma visualizzerà il numero di corse trovate e gli orari di ogni corsa

GRADI di parallelismo: (numero di thread da usare), 6 compreso il main
main chiede all'utente una stringa contenente delle fermate di una linea di autobus e gli orari di 5 corse che partono ad orari differenti,
chiedere all'utente di inserire il nome del comune da cui parte e il nome del comune dove deve andare 

thread: (tutti e 5 i thread) ricerca se la propria linea permette di arrivare a destinazione e in caso positivo l'elenco di tutti gli orari di partenza e di arrivo

Dati condivisi: elencoCorseTrovate, comunePartenza , comuneArrivo, ifTrovate(booleano)
elencoCorseTrovate: sia ore di partenza trovate che quelle di arrivo (JOrario)
numeroCorse:numero di corse trovate
mutua esclusione: elencoCorseTrovae (si),comunePartenza(no),comuneArrivo(no), ifTrovate(no)


*/
public class ESE_frequenze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic hereù
        String fermate,corsa1,corsa2,corsa3,corsa4,corsa5;
        DatiCondivisi datiCon = new DatiCondivisi();
         Scanner scanner =  new Scanner(System.in);
         
        System.out.print("Inserire l'elenco di 5 fermate separate da una ',' : ");
        fermate = scanner.nextLine();
        System.out.println();
        
        System.out.print("Inserire l'elenco degli orari della prima corsa separate da una ',' : ");
         corsa1 = scanner.nextLine();
        System.out.println();
        
        System.out.print("Inserire l'elenco degli orari della seconda corsa separate da una ',' : ");
         corsa2 = scanner.nextLine();
        System.out.println();
        
        System.out.print("Inserire l'elenco degli orari della terza corsa separate da una ',' : ");
         corsa3 = scanner.nextLine();
        System.out.println();
        
        System.out.print("Inserire l'elenco degli orari della quarta corsa separate da una ',' : ");
         corsa4 = scanner.nextLine();
        System.out.println();
        
        System.out.print("Inserire l'elenco degli orari della quinta corsa separate da una ',' : ");
         corsa5 = scanner.nextLine();
        System.out.println();
        
        System.out.print("Inserire la partenza: ");
       String p= scanner.nextLine();
        System.out.println();
        
        String[] fermateBus =fermate.split(",");
        String[] oraCorsa1 =corsa1.split(",");
        String[] oraCorsa2 =corsa2.split(",");
        String[] oraCorsa3 =corsa3.split(",");
        String[] oraCorsa4 =corsa4.split(",");
        String[] oraCorsa5 =corsa5.split(",");
        
        System.out.print("Inserire la arrivo: ");
         String a= scanner.nextLine();
        System.out.println();
        
        datiCon.setComuneArrivo(a);
        datiCon.setComunePartenza(p);
        
        threadRicerca th1 = new threadRicerca(datiCon,oraCorsa1);
        threadRicerca th2 = new threadRicerca(datiCon,oraCorsa2);
        threadRicerca th3 = new threadRicerca(datiCon,oraCorsa3);
        threadRicerca th4 = new threadRicerca(datiCon,oraCorsa4);
        threadRicerca th5 = new threadRicerca(datiCon,oraCorsa5);
        
        datiCon.findPos(fermateBus);

        
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        
        th1.join();
        th2.join();
        th3.join();
        th4.join();
        th5.join();
        
        
    }
    
}