package model;

import excepsiones.InvalidAmountExcepcion;

public class Incomes {
    private double value;

    public Incomes(double value) throws InvalidAmountExcepcion {
        if(value<=0)
            throw new InvalidAmountExcepcion(value);
        else
            this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
