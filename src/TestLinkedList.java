import java.util.LinkedList;
       public class TestLinkedList
       {
       public static void main(String arg[])
       {
//Crea, llena e imprime una lista con números
           LinkedList listaNums= new LinkedList(); 
           listaNums.add(8);
           listaNums.add(3);
           listaNums.add(5);
           listaNums.add(2);
           listaNums.add(3);
//Insertar un nuevo dato al inicio de la lista
           listaNums.addFirst(10);
           System.out.println("Lista de numeros: "+listaNums);
//------------------------------------------

//Crea, llena e imprime una lista con nombres
           LinkedList listaNombres= new LinkedList();
           listaNombres.add("Juan");
           listaNombres.add("Pedro");
           listaNombres.add("Carlos");
           listaNombres.add("Daniel");
           listaNombres.add("Carlos");
//Insertar un nuevo dato al inicio de la lista
listaNombres.addFirst("Julian"); System.out.println("Lista de nombres:"+listaNombres);
//------------------------------------------

//Obtiene y remueve el primer elemento de la lista
           System.out.println("Elemento removido:"+listaNums.poll());
           System.out.println("Elemento removido:"+listaNombres.poll());

//Las listas quedan así:
           System.out.println("Lista de numeros: "+listaNums);
           System.out.println("Lista de nombres:"+listaNombres);
        }
}

