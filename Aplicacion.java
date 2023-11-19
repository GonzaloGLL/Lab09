import java.io.*;
import java.util.*;

public class Aplicacion {
    private List<Empleado> empleados;
    private String archivo = "empleados.txt";

    public Aplicacion() {
        empleados = new ArrayList<>();
        reporteEmpleados();
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void reporteEmpleados() {
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);

            empleados = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);

        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(empleados);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
