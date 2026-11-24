public class TestEmpleado {
    public static void main(String[] args) {
        Gerente gerente =new Gerente("Juan", 1600.00, "RRHH", 500.00);

        Desarrollador desarrollador =new Desarrollador("Ana", 2500, "Informática", "Java");

        System.out.println("=====INFORMACION GERENTE=======");
        gerente.mostrarInformacion();

        System.out.println();

        System.out.println("=====INFORMACION DESARROLLADOR=======");
        desarrollador.mostrarInformacion();
    }
}