package polimorfismo;


/* Supongamos que tenemos una clase abstracta llamada "Vehiculo" que tiene un método abstracto "conducir": */
abstract class Vehiculo {

    public abstract void conducir();
}


/* Luego, creamos dos clases que extienden de "Vehiculo", una llamada "Automovil" y otra "Moto". 
/ Cada una de ellas implementará el método "conducir" de forma diferente: */

class Automovil extends Vehiculo {

    public void conducir() {
        System.out.println("Conduciendo un automóvil");
    }
}

class Moto extends Vehiculo {

    public void conducir() {
        System.out.println("Conduciendo una moto");
    }
}

/* Ahora, en nuestra clase principal, podemos crear un array de objetos de la clase "Vehiculo",
pero instanciados como objetos de las clases "Automovil" y "Moto". Luego, podemos recorrer este
array y llamar al método "conducir" para cada uno de los objetos, sin saber de antemano de qué 
tipo de objeto se trata, ya que todos ellos implementan la misma interfaz "Vehiculo": */
public class PolimorfismoEjemplo {

    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[2];
        vehiculos[0] = new Automovil();
        vehiculos[1] = new Moto();

        for (int i = 0; i < vehiculos.length; i++) {
            vehiculos[i].conducir();
        }
    }
}
/* Al ejecutar este código, veremos que se llama al método "conducir" de cada uno de los objetos del 
/ array, pero con un comportamiento diferente para cada uno de ellos, gracias a la implementación del 
/ método en las clases "Automovil" y "Moto". Este es un ejemplo de polimorfismo en Java, donde diferentes
/ objetos pueden implementar el mismo método de forma diferente, y sin embargo, se pueden tratar todos
/ ellos de forma homogénea, gracias a que implementan la misma interfaz.*/
