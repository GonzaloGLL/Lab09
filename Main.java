import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aplicacion app = new Aplicacion();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar empleado");
            System.out.println("2. Ver empleados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el número del empleado: ");
                int numero = scanner.nextInt();
                scanner.nextLine();  
                System.out.print("Ingrese el nombre del empleado: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el sueldo del empleado: ");
                double sueldo = scanner.nextDouble();
                Empleado empleado = new Empleado(numero, nombre, sueldo);
                app.agregarEmpleado(empleado);
            } else if (opcion == 2) {
                app.reporteEmpleados();
                for (Empleado empleado : app.getEmpleados()) {
                    System.out.println(empleado);
                }
            } else if (opcion == 3) {
                break;
            } else {
                System.out.println("Opción no válida");
            }
        }

        scanner.close();
    }
}
