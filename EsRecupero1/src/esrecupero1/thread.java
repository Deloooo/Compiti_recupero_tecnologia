/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esrecupero1;

/**
 *
 * @author  Gabriele
 */
public class thread extends Thread{
    private DatiCondivisi datiCon;
    private int num;
    
    public thread(DatiCondivisi datiCon,int n){
        this.datiCon = datiCon;
        
    }
    
    @Override
    public void run(){
        datiCon.ricercaNelVettore(datiCon.numero1);
       // datiCon.signalMutex1();
    }
}
