public class Linearprobing
{
    public static void buscar(String[] HT,String nombre){//realiza la busqueda del nombre
        System.out.println("Buscar el dato: "+nombre);    
        int nH = Math.abs(nombre.hashCode()) % HT.length;
        //System.out.println(nH);
        boolean vuelta = false;
        for (int k = nH; k <= HT.length ;k++){
                    if(k == HT.length){
                     k = 0;
                     vuelta = true;
                    }
                    if (HT[k].equals(nombre)){
                     System.out.println("El slot original en la tabla hash es: " + nH);
                     System.out.println("La tabla hashing HT en su slot " + k + " tiene el dato: " + HT[k]);
                     System.out.println("------------------------------------------------------------------------------");
                     break;
                    } 
                    if(k == nH && vuelta == true){
                        System.out.println(nombre + " No existe");
                        System.out.println("------------------------------------------------------------------------------");
                        break;
                    }
                 }
        
    }
    public static void rellenar(String[] al,String[] HT){//rellena la tabla hash
        System.out.println("Llenando la tabla hashing ...");
        for (String n: al) {
            int nH = Math.abs(n.hashCode()) % HT.length;
            /** esto sirve para observar las claves originales de cada nombre */
            //System.out.println(n+" esta es su clave original -->"+nH);
            if (HT[nH] == null){
                HT[nH] = n;   
               
                        }else{
                            for (int i = nH; i <= HT.length; i++ ){
                                if(i == (HT.length)){
                                        //nH=0;
                                        i = 0;
                                }
                                if (i < (HT.length)){
                                     if (HT[i]==null){
                                         HT[i]=n;
                                         break;
                                     }
                                }
                                
                            }
                           
             }
        }
        System.out.println();
    }
    public static void imprimir(String[] HT){// imprime los valores de la tabla hash
         System.out.println("Contenido de la tabla hashing ...");
        int i = 0;
        for (String n: HT) {
            System.out.printf("%03d %-50s%n",i,n);
            i++;
        }
        System.out.println();
    
    }
     /** args[0] = nombresOrden.txt */
    public static void main(String[] args) {
        /** archivo de datos */
        In in = new In(args[0]);
        String[] al = in.readAllLines();
        
        /** tabla hashing */
        String[] HT = new String[150];
        
        /** numero hash de los primeros 3 datos usando la funcion hash heredada de Object */
        for (int i = 0; i <=5; i++) {
            int nH = al[i].hashCode();
            System.out.println("El # hash de " + al[i] + " es " + nH + " ajustado a 150 slots es " +
                             nH % HT.length + " ~> " + Math.abs(nH % HT.length ));            
        }
        System.out.println();
                
        /** llenando la HT */
        
        rellenar(al,HT);
        
        
        /** imprimiendo la HT */
        imprimir(HT);
       
        
        /** muchas instrucciones despues, consultamos la tabla hash */
        
       buscar(HT,"Cristina Barthel Guardiola");
       buscar(HT,"Ezequiel Atsuri Ortiz Sarmiento");
       buscar(HT,"Joaquin Vila Garcia");
       buscar(HT,"Carlos Arellano");
       buscar(HT,"Dalia Cruz");
       buscar(HT,"Pedro Quiroz Luis");
       
           
    }
}

