package excepsiones;

public class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException(double total, double price) {
        super("El producto de valor "+ price+" es mas caro que su capital "+ total);
    }
}
