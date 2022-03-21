package com.albert.spring;

public class TvaMaroc implements ITva {

    @Override
    public double calculeTva(double montant) {
        return montant*1.2;
    }

    
    
}
