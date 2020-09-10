package verificab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriele
 */
public class DatiCondivisi {
 
    //dichiaro due semafori
    private Semaphore sem1, sem2;
//inizializzo i semafori
    public DatiCondivisi(){
        this.sem1 = new Semaphore(0);
        sem2 = new Semaphore(0);
    }
//wait semaforo1
    public void WaitSem1() {
        sem1.Wait();
    }
//wait semaforo2
    public void WaitSem2() {
        sem2.Wait();
    }
//signal semaforo1
    public void SignalSem1() {
        sem1.Signal();
    }
//signal semaforo2
    public void SignalSem2() {
        sem2.Signal();
    }
  }
