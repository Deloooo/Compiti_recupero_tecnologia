package esrecupero1;

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
   private int posizione;
   private int vettore[];
   private Boolean trovato;
   private int numeroTrovato;
    int numero1,numero2,numero3;
   
   public Semaphore mutex1;
    public Semaphore mutex2;
    
   public  DatiCondivisi() {
       posizione=0;
       trovato=false;
       numeroTrovato=0;
   }
   
       public void generaSequenza(int lunghezza) {
           
       vettore = new int[lunghezza];
        int lunghezzaVettore = vettore.length;
        
        for (int i = 0; i < lunghezzaVettore; i++) {
            int n = (int) (Math.random() * 100);
            vettore[i] =  n;
        }
       }
        
        public void visualizzaSequenza(){
            
            int lunghezzaVettore = vettore.length;
            for (int i = 0; i < lunghezzaVettore; i++) {
           
            System.out.print(vettore[i]+" "); 
           
            
        }
            System.out.println();
 }
       public void setNumero1(int n) {
        this.numero1 = n;
    }
    
    public void setNumero2(int n) {
        this.numero2 = n;
    }
    
    public void setNumero3(int n) {
        this.numero3 = n;
    }
    
    synchronized public void setPosizione(int n){
        this.posizione=n;
    }
    
    public int ricercaNelVettore(int n){
        
        for(int i=0;i<vettore.length || trovato == false;i++){
            
            if(vettore[i] == n){
                posizione = i-1;
                trovato=true;
                String s = Integer.toString(i-1);
                System.out.println("Hai trovato il numero in posizione -> " + s);
            }
           
        }
        return posizione;
    }
    
    
   
    public void waitMutex1(){
        mutex1.Wait();
    }
    
    public void signalMutex1(){
        mutex1.Wait();
    }
    
    public void waitMutex2(){
        mutex2.Signal();
    }
    
    public void signalMutex2(){
        mutex2.Signal();
    }
  
}
