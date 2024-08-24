package Tarea;

public class Empleado {
    private Tarea tarea;

    public Empleado(Tarea tarea) {
        this.tarea = tarea;
    }

    public void cambiarTarea(Tarea nuevaTarea) {
        this.tarea = nuevaTarea;
    }

    public void realizarTarea() {
        tarea.realizar();
    }
}
