public class Desarrollador extends Empleado{
    private String lenguajeProgramacion;

    public Desarrollador(String nombre, double salario, String departamento, String lenguajeProgramacion) {
        super(nombre, salario, departamento);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Lenguaje de programación: "+ lenguajeProgramacion);
    }
}
