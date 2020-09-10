/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificab;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author Gabriele
 */
public class threadProiettile extends Thread{
      private DatiCondivisi datiCon;
    private int th;
    
    public threadProiettile(DatiCondivisi dati, int th) {
        this.datiCon = dati;
        this.th = th;
    }
    
    @Override
    public void run() {
        
        if(th == 1) {
            System.out.println(".... ATTESA DI x SECONDI PRIMA CHE IL proiettile 1 COLPISCA IL\n" +
"piattello 1 (x numero casuale tra 1 e 2)");
            try {
                 //genero un tempo random tra 1000 e 2000,  addormento il thread per quel totale di tempo
                sleep((new Random().nextInt(1000) + 1000));
                System.out.println("proiettile 1 COLPISCE piattello 1 ");
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
            //faccio partire il thread del piattello 1
            datiCon.SignalSem1();
        }
        else{
            System.out.println(".... ATTESA DI x SECONDI PRIMA CHE IL proiettile 2 COLPISCA IL\n" +
"piattello 2 (x numero casuale tra 1 e 2)");
            try {
                 //genero un tempo random tra 1000 e 2000,  addormento il thread per quel totale di tempo
                sleep((new Random().nextInt(1000) + 1000));
                System.out.println("proiettile 2 COLPISCE piattello 2 ");
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
            //faccio partire il thread del piattello 2
            datiCon.SignalSem2();
        }
    }
}
