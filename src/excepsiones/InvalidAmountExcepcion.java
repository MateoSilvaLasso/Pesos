package excepsiones;

public class InvalidAmountExcepcion extends Exception{
    public InvalidAmountExcepcion(double value) {
        super("El valor ingresado " + value+" no es un registro valido");
    }
}
