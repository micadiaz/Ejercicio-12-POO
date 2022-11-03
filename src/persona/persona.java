
package persona;

import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;


public class persona {
    Date nombre=new Date();
    Date fechaNacimiento=new Date();

    public persona(Date nombre,Date fechaNacimiento){
    this.nombre=nombre;
    this.fechaNacimiento=fechaNacimiento;
    }
    
    public persona() {
    }
    

    public Date getNombre() {
        return nombre;
    }

    public void setNombre(Date nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
   
Scanner leer=new Scanner(System.in);

     public persona crearPersona(){
         int mes,anio,dia;
        System.out.println("ingrese su nombre");
        String nombre=leer.nextLine();
        System.out.println("ingrese su año de nacimiento");
        anio=leer.nextInt();
         System.out.println("ingrese su mes de nacimiento");
        mes=leer.nextInt();
         System.out.println("ingrese su dia de nacimiento");
        dia=leer.nextInt();
      Date fechaNacimiento=new Date(anio-1900,mes-1,dia);
        System.out.println(fechaNacimiento);
        Date fechaAhora=new Date();
     int a= (fechaAhora.getYear()-fechaNacimiento.getYear());
         System.out.println("usted tiene "+a+ " años ");
         System.out.println("ingrese una edad");
         int edad=leer.nextInt();
         boolean t=true;
         if(a>edad){
             System.out.println(t=false);
         }
         else{System.out.println(t);}
         
        return new persona();
     }
}
/*Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/