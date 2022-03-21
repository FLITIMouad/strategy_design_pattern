package com.albert.spring;

public  class FacturationService  {
    private ITva t;

    public void setT(ITva tva) {
        t = tva;
    } 
    public double calculeMontantTtc(double montantHt) {
        return montantHt + t.calculeTva(montantHt);
    }
}
