/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificab2;

/**
 *
 * @author delogu_gabriele_enea
 */
/**
 *
 * -main: gestione input e output 
 * -thread1: che riceve dal main un URL un
 * carattere alla volta e li accoda ad una stringa STR 
 * -thread2:che legge la
 * stringa STR, cerca in un vettore (che simula il motore di ricerca GOOGLE)
 * tutti gli URL che contengono la stringa STR e li inserisce all'interno di un
 * vettore di stringhe VETT condiviso  
 * -thread 3 che legge la stringa STR, cerca in un vettore (che simula la
    CACHE di un browser) tutti gli URL che contengono la stringa STR e li
    inserisce all'interno di un vettore di stringhe VETT condiviso
 * -thread 4 che visualizza tutto il contenuto del vettore di stringhe VETT
    condiviso
* 
 *Dati Condivi: elencoGOOGLE,  elencoCACHE
 * Mutua esclusione: elencoGOOGLE,elencoCACHE
 */
public class VerificaB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
