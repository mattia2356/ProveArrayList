import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n"+"ARRAYLIST PROVA:");
        List lista = new ArrayList();
        List lista1 = new ArrayList();
        //Aggiunta elementi ad una lista
        Object element = null;
        lista.add(element);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(element);
        lista.add(4);
        lista.add("Elemento 5");
        
        //NON VA A SOSTITUIRE ELEMENTI NELL'ARRAY,
        //SPOSTA SOLO LA LORO POSIZIONE
        System.out.println(lista.toString());
        //VADO A COPIARE TUTTI GLI ELEMENTI DA UNA LIST AD UN ALTRA
        lista1.addAll(lista);
        System.out.println(lista1);
        lista.add(0,7);
        System.out.println("\n"+"DOPO MODIFICA:");
        System.out.println(lista);
        System.out.println(lista1);
        //RESTITUISCE INDICE ELEMENTO
        System.out.println("\n"+"Indice variabile Element:" + lista.indexOf(element));
        //RESTITUISCE INDICE ULTIMO ELEMENTO PASSATO COME PARAMETRO
        System.out.println("\n"+"Indice ultima posizione element: "+lista.lastIndexOf(element));
        //RESTITUISCE UN BOOLEAN PER VERIFICARE LA PRESENZA DI UN ELEMENTO DENTRO LISTA
        System.out.println("\n"+"È presente l'element 3: "+lista.contains(3));
        //RIMOZIONE ELEMENTO DA LISTA CON NOME ELEMENTO
        lista.remove(element);
        System.out.println("\n"+"Rimozione elemento tramite nome oggetto: "+lista);
        //RIMOZIONE ELEMENTO DA LISTA CON INDICE
        lista.remove(4);
        System.out.println("\n"+"Rimozione elemento tramite indice: "+lista);
        //ELIMINARE COMPLETAMENTE LA LISTA
        lista1.clear();
        System.out.println(lista1);
        
        //FARSI RESTITUIRE DIMENDIONE ELENCO
        System.out.println("\n"+"Grandezza Lista: "+lista.size());
        //CREARE SOTTOLISTA DI UNA LISTA
        List lista3 = lista.subList(0,3);
        System.out.println("\n"+"Sottolista di una Lista da indice 0 a 3: "+lista3);
    }
}
