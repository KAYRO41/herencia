package Tarea;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado(new Programar());
        empleado.realizarTarea(); 

        empleado.cambiarTarea(new Diseñar());
        empleado.realizarTarea(); 
    }
}

