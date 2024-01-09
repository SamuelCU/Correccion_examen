Correccion_examen

Correción del examen primer bimestre

Parte 2: Explique a detalle cada literal.

g. ¿Qué son los setters y getters?

Los setters y getters son métodos utilizados en la programación orientada a 
objetos para acceder y modificar los atributos de una clase de manera controlada. 

Un setter es un método que se utiliza para establecer (o modificar) 
    el valor de un atributo dentro de una clase.
Un getter es un método que se utiliza para obtener el valor actual 
    de un atributo dentro de una clase.

public String setMarca(String marca){
    this.marca = marca;
}

public String getMarca(){
    return marca
}

Auto carro = new Auto("Clasico");
carro.setMarca("Mustang")
System..out.println(carro.getMarca())
-----------------------------------------------------------------

Mustang

h. Indique las secuencia de comandos en git que permiten clonar un repositorio, traer los ultimos cambios y una vez realizado los cambios, actualizar los cambios.

1. Clonar un repositorio
    git clone <url_del repositorio>
2. Traer los ultimos cambios
    git pull origin main
3. Realizar cambios en los archivos locales
4. Agregar y hacer commit
    git add .
    git commit -m "Mensaje del commit que describe los cambios realizados"
5. Actualizar los cambios
    git push origin main

i. ¿Para que sirve try y catch en java?

En Java, try y catch son bloques utilizados para manejar excepciones. 
Cuando se ejecuta código que puede lanzar una excepción, este código se coloca 
dentro de un bloque try, y cualquier excepción que se genere se captura y maneja 
en un bloque catch. Esto permite gestionar errores de manera controlada en lugar de que 
el programa se detenga abruptamente.

try: aqui esta el codigo suceptible a errores
catch: este bloque capta la excepcion y realiza otra accion para que el programa continue ejecutandose
finally: esto se ejecutara haya o no haya excepcion

try { 
        int resultado = 10/0;
        System.out.println("Resultado de la división: " + resultado);
    } catch (ArithmeticException e) {
        
        System.out.println("Error: no se puede dividir entre cero);
    } finally {
        
        System.out.println("Fin del programa.");
    }

j. Defina el concepto de programacion orientada a objetos y el concepto de costructores. Muestre un ejemplo de los tipos de constructores que puede haber

La Programación Orientada a Objetos es un paradigma de programación que se basa 
en la idea de organizar el código en "objetos", que son instancias de clases.

Un constructor es un método especial en una clase que se llama automáticamente 
cuando se crea una instancia (objeto) de esa clase. Su función principal 
es inicializar los atributos del objeto y realizar cualquier configuración 
necesaria para que el objeto sea válido y utilizable.

// Constructor por defecto (sin parámetros)
public Persona() {
    this.nombre = "Sin Nombre";
    this.edad = 0;
}

// Constructor con parámetros
public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
}

