/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificab;

import java.util.Scanner;

/**
 *
 * @author Gabriele
 */
/**
 * main: chiedere in input (p,s,f)se si vuole lanciare i piattelli per poi chiedere di sparare i proiettili,
 * alla fine chiede all'utente se vuole uscire dal ciclo, gestisce l'output 
 * P fapartire i due piattelli, S fa partire il primo proiettile , S fa partire il secondo proiettile, F si interrompe
 * Il main legge la richiesta dell'utente al termine della distruzione dei piattelli
 * 
 * thread:threadPiattello lancia il piattello, thread una volta lanciati i pittelli calcola un tempo random e
 * spara i proiettili
 * Il piattello segnala al main quale è stato disrutto   
 * Il proiettile segnala al piatello quando lo ha colpito 
 * 
 * gradi di paralllelismo: main+2 piattelli+2 proiettili 
 * 
 * Dati Condivisi: vuoto 
 * mutua esclusione: 
 * sincronizzazione: il main con P fa parire i due threadPiattello, 
*/
public class VerificaB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s = new Scanner(System.in);
        DatiCondivisi datiCon = new DatiCondivisi();
        String c;
        boolean esci = false;

        //finchè l'utente non inserisce f il main non esce dal ciclo
        while (esci == false) {
            threadPiattello th1 = new threadPiattello(datiCon, 1);
            threadPiattello th2 = new threadPiattello(datiCon, 2);
            threadProiettile th3 = new threadProiettile(datiCon, 1);
            threadProiettile th4 = new threadProiettile(datiCon, 2);
          

            System.out.println("Inserire P per far partire i piatteli, F per uscire: ");
            c = s.next();
            if ("F".equals(c)) {
                esci = true;
            } else if ("P".equals(c)) {
                th1.start();
                th2.start();

                System.out.println("Inserire S per  sparare i proiettili: ");
                c = s.next();
                if ("S".equals(c)) {
                    th3.start();

                }
                System.out.println("Inserire S per  sparare i proiettili: ");
                c = s.next();
                if ("S".equals(c)) {
                    th4.start();
                }
                try {
                    th1.join();
                    th2.join();
                    th3.join();
                    th4.join();
                } catch (InterruptedException e) {
                }
                System.out.println("PIATTELLI DISTRUTTI!!!");
            }
        }
        
    }
    
}
