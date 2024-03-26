public class EmpleadoContratista extends Empleado{

    public EmpleadoContratista(String nombre, float salario) {
        super(nombre, salario);
    }


    public float calcular_pago(float salario) {


        salario += salario * 0.10;
        return salario;
    }


}
