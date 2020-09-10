/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese_frequenze;

/**
 *
 * @author delogu_gabriele_enea
 */
public class threadRicerca  extends Thread{
    
    private DatiCondivisi datiCon;
    private String[] vettore;
    
    public threadRicerca(DatiCondivisi datiCon,String[] n){
        this.datiCon = datiCon;
        this.vettore=n;
    }
    
    @Override
    public void run(){
        
       // datiCon.signalMutex1();
    }
    
}
