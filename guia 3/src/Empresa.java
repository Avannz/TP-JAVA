import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EmpleadoFull empleado = new EmpleadoFull(" ", 0);
        EmpleadoHora empleadoH = new EmpleadoHora(" ", 0);
        EmpleadoContratista empleadoC = new EmpleadoContratista(" ", 0);

        boolean salir = false;

        System.out.println("Ingresa el salario común de la empresa: ");
        float salario = scanner.nextFloat();

        System.out.println("1)  Empleado por mes");
        System.out.println("2)  Empleado por horas");
        System.out.println("3)  Empleado por proyecto");


        while(!salir)
        {
            System.out.println("Igresa la opcion: ");
            int opcion = scanner.nextInt();

            scanner.nextLine();

           System.out.println("Ingresa su nombre: ");
            String nombre;
            nombre = scanner.nextLine();

            switch (opcion){

                case 1:
                    System.out.println("1");
                    empleado.setNombre(nombre);
                    System.out.println("2");
                    salario = empleado.calcular_pago(salario);

                    empleado.setSalario(salario);

                    System.out.printf("\nSu nombre es:"+nombre);
                    System.out.printf("\nSu salario es de: "+salario+"$");
                    break;

                case 2:

                    empleadoH.setNombre(nombre);

                    salario = empleadoH.calcular_pago(salario);

                    empleadoH.setSalario(salario);
                    System.out.printf("\nSu nombre es:"+nombre);
                    System.out.printf("\nSu salario por hora: "+salario+"$");
                    break;

                case 3:

                    empleadoC.setNombre(nombre);

                    salario = empleadoC.calcular_pago(salario);

                    empleadoC.setSalario(salario);
                    System.out.printf("\nSu nombre es: "+nombre);
                    System.out.printf("\nSu salario de contratista: "+salario+"$");
                    break;

                case 4:
                    salir = true;
                    break;

                default:
                    System.out.printf("\nIngreso cualquier cosa changoooooooooo");
                    break;
            }

            System.out.println("\nQuieres seguir calculando otro salario? ");
            salir = scanner.nextBoolean();
        }
    }
}