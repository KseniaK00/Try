package org.example;

public class Main {
    public static void main(String[] args){
        Tester tester=new Tester("Горошек","Посыпался",17,"B2",35.5);
        tester.printInf();
        tester.printInf(30);
        tester.printInf(30,1);
        Tester.Zp(tester,30);

    }
}
