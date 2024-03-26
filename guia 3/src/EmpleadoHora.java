import java.util.Scanner;

public class EmpleadoHora extends Empleado {

    public EmpleadoHora(String nombre, float salario) {
        super(nombre, salario);
    }



    public float calcular_pago (float salario) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Horas trabajadas: ");
        int horas = scanner.nextInt();

        salario =  (salario * horas) / 720;

        return salario;
    }
}


