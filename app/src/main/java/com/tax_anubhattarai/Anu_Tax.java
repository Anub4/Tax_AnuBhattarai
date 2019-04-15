package com.tax_anubhattarai;

public class Anu_Tax {
    private float amount,FirstTax;
    private float SecondTax,TotalTax,salary;

    public Anu_Tax(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float totalAmount()
    {
        salary=amount*12;
        TotalTax= (float) (this.salary*0.01);
        return (TotalTax);
    }
    public float totalAmount2() {
        salary=amount*12;
        FirstTax= (float) (200000*0.01);
        TotalTax= (float) (FirstTax+((this.salary-200000)*(0.15)));
        return (TotalTax);
    }

    public float totalAmount3() {
        salary=amount*12;
        FirstTax= (float) (200000*0.01);
        SecondTax= (float) ( FirstTax+(150000*0.15));
        TotalTax= (float) (SecondTax+((this.salary-350000)*0.25));
        return (TotalTax);
    }
}
