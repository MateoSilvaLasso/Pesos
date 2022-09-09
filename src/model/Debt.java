package model;

import excepsiones.InvalidAmountExcepcion;

public class Debt {

    private double value;

    public Debt(double value) throws InvalidAmountExcepcion{

        if(value<=0)
            throw new InvalidAmountExcepcion(value);
        else
            this.value = value;

        //podemos lanzar la excepcion

    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
