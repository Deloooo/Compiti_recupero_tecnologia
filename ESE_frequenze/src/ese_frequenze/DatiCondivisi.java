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
public class DatiCondivisi {
   private JOrariTrovati elencoCorseTrovate[];//composto da ora di partenza e ora di  arrivo
   private JCorse elncoCorse;//composto da un elenco di oggetti composto da Fermate e orari
   
   private String comunePartenza;
    private String comuneArrivo;
   private int posPartenza;
    private int posArrivo;
   private int numeroCorse;
   public Semaphore mutex1;
    public Semaphore mutex2;
   //mututa esclusione: JOrariTrovati,numeroCorse
    
   public  DatiCondivisi() {
       comunePartenza="";
       comuneArrivo="";
       posPartenza=0;
       posArrivo=0;
       
   }
   
   public void visualizzaOrari(){
            
            int lunghezzaVettore = elencoCorseTrovate.length;
            for (int i = 0; i < lunghezzaVettore; i++) {
           
            System.out.print(elencoCorseTrovate[i]+" "); 
           
            
        }
   }
   public JCorse ricercaComune(int n){
       JCorse j;
       j = JCorse();
       
       return j;
   }
    public String getComunePartenza() {
        return comunePartenza;
    }

    public String getComuneArrivo() {
        return comuneArrivo;
    }

    public void setComunePartenza(String comunePartenza) {
        this.comunePartenza = comunePartenza;
    }

    public void setComuneArrivo(String comuneArrivo) {
        this.comuneArrivo = comuneArrivo;
    }


    void findPos(String[] vet) {
         int lunghezzaVettore = vet.length;
        for (int i = 0; i < lunghezzaVettore; i++) {
           
            if(vet[i].equals(comunePartenza))
            {
                posPartenza=i;
            }
            
            if(vet[i].equals(comuneArrivo))
            {
                posArrivo=i;
            }
           
            
        }
        
        
    }

    
            
}

