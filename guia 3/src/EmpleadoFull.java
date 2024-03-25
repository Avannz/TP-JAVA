public class EmpleadoFull extends  Empleado{


    public EmpleadoFull(String nombre, float salario) {
        super(nombre, salario);
    }




    public float calcular_pago(){
        return salario;
    }
}
