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
public class thread3 extends Thread{
    private DatiCondivisi datiCon;
    
    public thread3(DatiCondivisi datiCon){
        this.datiCon = datiCon;
    }
    
    @Override
    public void run(){
        datiCon.waitMutex2();
        datiCon.ricercaNelVettore(datiCon.numero3);
    }
}
