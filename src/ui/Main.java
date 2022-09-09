package ui;
import excepsiones.NotEnoughMoneyException;
import excepsiones.InvalidAmountExcepcion;
import model.User;
public class Main {

    public static void main(String[] args) {

        try{
            User user= new User();
            user.getWallet().addIncomes(10000);
            user.getWallet().addDebt(2000);

            user.getWallet().pay(8000);
        }catch (InvalidAmountExcepcion ex){
            ex.printStackTrace();
        }catch (NotEnoughMoneyException ax){
            ax.printStackTrace();
        }




    }

}
