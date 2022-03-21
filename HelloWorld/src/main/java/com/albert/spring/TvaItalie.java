package com.albert.spring;

public class TvaItalie implements ITva {

    public double calculeTva(double montant) {
            return montant*( montant > 1000? 1.3:1);
    }

}
