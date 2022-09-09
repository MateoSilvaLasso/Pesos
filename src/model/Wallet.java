package model;


import excepsiones.InvalidAmountExcepcion;
import excepsiones.NotEnoughMoneyException;

import java.util.ArrayList;
public class Wallet {
    private ArrayList<Debt> debt;
    private ArrayList<Incomes> incomes;

    public Wallet() {
        this.debt= new ArrayList<>();
        this.incomes= new ArrayList<>();
    }

    public void addDebt(double value) throws InvalidAmountExcepcion{

            Debt d = new Debt(value);
            debt.add(d);

    }

    public void addIncomes(double value) throws InvalidAmountExcepcion{

             Incomes e= new Incomes(value);
             incomes.add(e);

    }

    public void pay(double value) throws NotEnoughMoneyException, InvalidAmountExcepcion {
        double cont1=0;
        for(Debt debts: debt){
            cont1+= debts.getValue();
        }

        double cont2=0;

        for(Incomes income: incomes){
            cont2+=income.getValue();
        }

        double total= cont2-cont1;
        if(value>total){
            throw new NotEnoughMoneyException(total,value);
        }else{
            addDebt(value);
        }
    }


}
