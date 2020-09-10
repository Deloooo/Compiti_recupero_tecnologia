/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esrecupero1;

import java.util.Scanner;

/**
 *
 * @author delogu_gabriele_enea
 */
/*
1)chiedere all'utente una quantità LUNG maggiore di 0 e generare una sequenza di numeri casuali di lunghezza LUNG 
2)chiedere all'utente di inserire tre numeri da ricercare nella sequenza 
facendo utilizzo di thread ricercare un numero nella sequenza e determinare la posizione in cui si trova
3)appena un thread trova il numero tutte le ricerche si devono interrompere e il programma deve comunicare il
numero trovato e la sua posizione all'interno della sequenza

GRADI di parallelismo: (numero di thread da usare), 4 compreso il main
1)main chiede la quantintità, chiedere all'utente di inserire tre numeri da ricercare nella sequenza e 
deve comunicare il numero trovato e la sua posizione all'interno della sequenza 
thread:
1 cerca il primo numero nella sequenza
2 cerca il secondo numero nella sequenza
3 cerca il terzo numero nella sequenza

appena trova un numero il thread deve fermare anche gli altri

dati condivisi: posizione, vettore , trovato, numeroTrovato
nome della variabile deve essere significativa e lo stesso vale per la spiegazione

mutua esclusione: più thread modificano in parallelo la stessa variabile 
(no sul vettore, no sui numeri, trovato e numeroTrovato si)
*/
public class EsRecupero1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        DatiCondivisi datiCon = new DatiCondivisi();

        System.out.println("Inserire la lunghezza del vettore");
        Scanner lunghezzaVettore = new Scanner(System.in);
        
        int l = Integer.parseInt(lunghezzaVettore.nextLine());
        datiCon.generaSequenza(l);
        
        datiCon.visualizzaSequenza();
        

        System.out.println("Inserire 3 numeri compresi tra 0 e 100");
        Scanner numero1 = new Scanner(System.in);
        int n1 = Integer.parseInt(numero1.nextLine());

        Scanner numero2 = new Scanner(System.in);
        int n2 = Integer.parseInt(numero2.nextLine());

        Scanner numero3 = new Scanner(System.in);
        int n3 = Integer.parseInt(numero3.nextLine());
        
        thread th1 = new thread(datiCon,n1);
        thread th2 = new thread(datiCon,n2);
        thread th3 = new thread(datiCon,n3);
        
        th1.start();
        
        th2.start();
        
        th3.start();
        
        th1.join();
        th2.join();
        th3.join();
        
        
    }
    
}
