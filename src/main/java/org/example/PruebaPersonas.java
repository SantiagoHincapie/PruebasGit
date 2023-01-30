package org.example;

public class PruebaPersonas
{
    public static void main(String[] args)
    {
        //Creacion de un objeto de tipo persona
        Persona persona1;

        // instanciando un objeto de la clase persona
        persona1=new Persona();

        //Acceder al objeto persona y llamado del metodo

        persona1.desplegarNombres();
        System.out.println("-");

        //modificamos los valores del atributo persona
        persona1.nombre="Santiago".toLowerCase();
        persona1.apellido="Hincapie";
        persona1.desplegarNombres();

        Persona persona2=new Persona();
        persona2.nombre="Andre";
        persona2.apellido="Hincapie";
        persona2.desplegarNombres();

    }
}
