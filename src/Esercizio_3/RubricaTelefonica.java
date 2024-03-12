package Esercizio_3;

import java.util.HashMap;
import java.util.Set;

public class RubricaTelefonica {
   private HashMap<String, String> rubrica;

   public RubricaTelefonica(){
     this.rubrica =  new HashMap<>();
   }
   public void inserisciCoppia(String nome, String telefono){
        rubrica.put(nome, telefono);
   }
   public void cancellazioneCoppia(String nome){
       rubrica.remove(nome);
   }
   public String ricercaTelefono(String telefono){
        for (String nome : rubrica.keySet()){

        }
   }
    public String ricercaTelefono(String nome){
        for (String telefono : rubrica.keySet()){

        }
    }
    public void stampaContatti(String nome, String telefono){
        Set<String> contattiRubrica = rubrica.keySet();
       for (String contatti : contattiRubrica){
           System.out.println("Nome " + nome);
           System.out.println("Telefono " + rubrica.get(telefono));
       }
    }
}
