# BehavioralDesignPatterns
A collection of examples and explanations for common behavioral design patterns, showcasing how objects interact and share responsibilities.

Chain of Responsibility: 
  Avoid coupling the sender of a request to its receiver by giving more than one
object a chance to handle the request. Chain the receiving objects and pass the
request along the chain until an object handles it.
![chain-of-responsibility-2x](https://github.com/user-attachments/assets/786ace9c-0d97-4306-b9c5-dc259dcfa824)
```java
public class Chain {
     public static void main(String[] args){
         // Crear las instancias de las clases correspondientes
         CPaquete paquete1 = new PaquetePequeño();
         CPaquete paquete2 = new PaqueteMediano();
         CPaquete paquete3 = new PaqueteGrande();
         
         // Asignar el siguiente paquete en la cadena de responsabilidad
         paquete1.setNext(paquete2);
         paquete2.setNext(paquete3);
         
         // Realizar las verificaciones para cada tipo de paquete
         paquete1.verificarPaquete("Pequeño"); // Verificar si el paquete es pequeño
         paquete1.verificarPaquete("Mediano"); // Verificar si el paquete es mediano
         paquete1.verificarPaquete("Grande");  // Verificar si el paquete es grande
         paquete1.verificarPaquete("Fragil");  // Verificar si el paquete es frágil
     }
}

```


