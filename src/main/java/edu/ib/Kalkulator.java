package edu.ib;

public class Kalkulator {

    public double oblicz(double w, String op, double temp){
        if (op=="+") return (w+temp);
        if (op=="-") return (w-temp);
        if (op=="*") return (w*temp);
        if (op=="/") return (w/temp);
        else {
            System.out.println("Error");
            return 0.00000000000000000001;
        }

    }

}
