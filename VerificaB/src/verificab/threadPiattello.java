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
public class threadPiattello extends Thread {

    private DatiCondivisi datiCon;
    private int th;

    public threadPiattello(DatiCondivisi dati, int th) {
        this.datiCon = dati;
        this.th = th;
    }
@Override
    public void run() {

        if (th == 1) {
            //In attesa che il thread del proiettile 1 mandi la signal
            datiCon.WaitSem1();
            System.out.println("piattello 1 SI DISINTEGRA \n");
            try {
                //genero un tempo random tra 1000 e 2000,  addormento il thread per quel totale di tempo
                sleep((new Random().nextInt(1000) + 1000));
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        } else {

            datiCon.WaitSem2();
       
            System.out.println("piattello 2 SI DISINTEGRA \n");
            try {
                sleep((new Random().nextInt(1000) + 1000));
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
}
}
