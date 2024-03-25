import java.util.Scanner;

public class Empresa {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            EmpleadoFull empleado = null;
            boolean salir = false;

            System.out.println("Ingresa el salario común de la empresa: ");
            float salario = scanner.nextFloat();

            System.out.println("1)  Empleado por mes");
            System.out.println("2)  Empleado por horas");
            System.out.println("2)  Empleado por proyecto");


            while(!salir)
            {
                System.out.println("Igresa la opcion: ");
                int opcion = scanner.nextInt();

                switch (opcion){

                    case 1:

                        System.out.println("Ingresa su nombre: ");
                        String nombre = scanner.nextLine();

                        empleado.setNombre(nombre);

                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;
                }
            }
        }

}
