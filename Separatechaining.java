public class Separatechaining
{
    public static void rellenar(String[] al,SinglyLinkedList[] HT){
        System.out.println("Llenando la tabla hashing ...");
        for (String n: al) {
            int nH = Math.abs(n.hashCode()) % HT.length;    
            HT[nH].addLast(n);
        }
        System.out.println();
    }
    public static void imprimir(SinglyLinkedList[] HT){
         System.out.println("Contenido de la tabla hashing ...");
        int i = 0;
        for (SinglyLinkedList n: HT) {
            System.out.printf("%03d %-50s%n",i,n);
            i++;
        }
        System.out.println();
    }
    public static void buscar(SinglyLinkedList[] HT,String nombre){
        System.out.println("Buscar el dato: "+nombre);    
        int nH = Math.abs(nombre.hashCode()) % HT.length;
        Node<String> walk = HT[nH].getHead();
        while(walk != null){
            if (nombre.equals(walk.getElement())) {
                    System.out.println("La función hash para ese dato es: " + nH);
                    System.out.println("La tabla hashing HT en su slot " + nH + " tiene el dato: " +walk.getElement());
                    System.out.println("------------------------------------------------------------------------------");
                    break;
                }   
              walk = walk.getNext();
              
        
        }
        if(walk == null){
                    System.out.println(nombre +" no existe");
                    System.out.println("------------------------------------------------------------------------------");
                }
            
        
    }
    /** args[0] = nombresOrden.txt */
    public static void main(String[] args) {
        
        /** archivo de datos */
                    
        In in = new In(args[0]);
        String[] al = in.readAllLines();
        
        /** tabla hashing */
        SinglyLinkedList[] HT = new SinglyLinkedList[150];
        SinglyLinkedList<String> ss;
        /** numero hash de los primeros 3 datos usando la funcion hash heredada de Object */
        for (int i = 0; i <=5; i++) {
            int nH = al[i].hashCode();
            System.out.println("El # hash de " + al[i] + " es " + nH + " ajustado a 150 slots es " + nH % HT.length + " ~> " + Math.abs(nH % HT.length ));            
        }
        System.out.println();
          /** Insercion de una lista ligada simple a la tabla hasj */      
          
         for (int i = 0; i < HT.length; i++) {
             ss = new SinglyLinkedList<String>();
             HT[i] = ss;             
        } 
        
        /** llenando la HT */
        
        rellenar(al,HT);
        /** imprimiendo la HT */
        imprimir(HT);
        
        /** muchas instrucciones despues, consultamos la tabla hash */
        
        buscar(HT,"Álvaro Ortega Gonzales");
        buscar(HT,"Javier Santiago Porras");
        buscar(HT,"Fransisco Javier Martinez Carceles");
        buscar(HT,"Mario Cabrera");
        buscar(HT,"Jouliette Barrera Lopez");
        buscar(HT,"Alejandro Luis Perez");
        buscar(HT,"Pedro Quiroz Luis");
        buscar(HT,"Jouliette Barrera Lopez");
        buscar(HT,"Benito Juarez");

    }
}
