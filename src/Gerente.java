public class Gerente extends Empleado{
    private Double bono;

    public Gerente(String nombre, double salario, String departamento, Double bono) {
        super(nombre, salario, departamento);
        this.bono = bono;
    }

    public Double getBono() {
        return bono;
    }

    public void setBono(Double bono) {
        this.bono = bono;
    }

    public double calcularSalarioTotal(){
        return getSalario() + bono;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();

        System.out.println("Bono: " +bono);
        System.out.println("Salario total: "+ calcularSalarioTotal());
    }
}
