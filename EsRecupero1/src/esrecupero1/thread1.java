/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esrecupero1;

/**
 *
 * @author ballabio_luca
 */
public class thread1 extends Thread{
    private DatiCondivisi datiCon;
    
    public thread1(DatiCondivisi datiCon){
        this.datiCon = datiCon;
    }
    
    @Override
    public void run(){
        datiCon.ricercaNelVettore(datiCon.numero1);
        datiCon.signalMutex1();
    }
}
