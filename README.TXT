------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Tablas Hash
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS: Ezequiel Atsuri Ortiz Sarmiento
USER INSTRUCTIONS:

esta vez lo que realize fue ordenar los datos de acuerdo al separechainig para que cuando los lellera el lineal proving saliera exactamente en ese orden
y asi darme cuenta de que el algoritmo estaba acomodandose de la forma correcta.

los ultimos cinco valores no estan al ultimo porque cuando se genero su clave ya estaba ocupados asi que buscaron en otros espacios vacios

Conclusion

Bueno primaramente revise la bibliografia para poder tener claros los conceptos y el funcionamiento de liearprobing y de separatechainig una vez
que me quedo claros empeze a hacer una pequeña traza para ver como se comporta los datos en especial en el de linear probing con los ultimos y primeros
indices un problema que me surgio fue como iniciar de nuevo la tabla hash es decir si no hay lugar en la posicion 159 regresar hasta el indice
0 pero al final pude resolverlo con un condicional, tambien puse un pequeño codigo en linear probing para ver el comportamiento cuando el 
hascode que obtenia ya estaba ocupado en la tabla hash y tenia que buscar mas adelante con lo cual verifique el correcto comportamiento que tenia cuando el indice
llegaba a 160 y regresaba inmediatamente a 0, con el separate chainig tuve el problema de que algunos nombres no se encontraban aun estando en la 
tabla hash pero cheque mi documento y despues del nombre habia un espacion de mas y tambien lo leia la clase in por lo que al poner el parametro
nombre sin ese espacio me creaba otro hascode y buscaba en la pocición que no era, al final verifique que no hubiera algun espacio de mas en mi 
documento para que no hubiera ningun problema.

Al final comprendi como se crean y utilizan las tablas hash tambien puse en practica todo lo que aprendi anteriormente como los TDA en este caso el
in que es muy util para leer los archivos, tambien puse en practica la utilización de las listas ligadas que son de gran ayuda cuando no 
sabemos cuantos datos se almacenaran.

