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
        Verificador verificador = new VerificadorP();
        Verificador verificador2 = new VerificadorN();
        Verificador verificador3 = new VerificadorE();
       
        verificador.setNext(verificador2);
        verificador2.setNext(verificador3);

        Solicitud solicitud = new Solicitud("Solicitud 1", EstadoEntrega.EXCELENTE);
        Solicitud solicitud2 = new Solicitud("Solicitud 2", EstadoEntrega.NORMAL);
        Solicitud solicitud3 = new Solicitud("Solicitud 3", EstadoEntrega.PESIMO);

        verificador.verificar(solicitud);
        verificador.verificar(solicitud2);
        verificador.verificar(solicitud3);
      
     }
}
```


