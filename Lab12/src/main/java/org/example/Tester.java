package org.example;

public class Tester {
    String name;
    String surname;
    int expirienceInYears;
    String englishLevel;
    double salary;

    public Tester(String name,String surname,int expirienceInYears,String englishLevel, double salary) {
        this.name=name;
        this.surname=surname;
        this.expirienceInYears=expirienceInYears;
        this.englishLevel=englishLevel;
        this.salary=salary;
    }
    public Tester(String name, String surname){
        this(name, surname, 13, "A2",0.0);
    }
    public Tester(String name, String surname, int expirienceInYears){
        this(name, surname, expirienceInYears, "B2", 35.5);
    }

    public void printInf(){
        System.out.println("Имя: "+ name+ "\nФамилия: "+surname+"\nВозраст: "+ expirienceInYears+ "\nУровень английского: "+ englishLevel+ "\nЗарплата: " +salary+"\n" );
    }
    public void printInf(int days){
        System.out.println("Имя: "+ name+ "\nФамилия: "+surname+"\nВозраст: "+ expirienceInYears+ "\nУровень английского: "+ englishLevel+ "\nЗарплата: " +salary+"\nЗарплата за месяц: " +(salary*days)+"\n" );
    }
    public void printInf(int days,int Id){
        System.out.println("ID работника"+Id+"\nИмя: "+ name+ "\nФамилия: "+surname+"\nВозраст: "+ expirienceInYears+ "\nУровень английского: "+ englishLevel+ "\nЗарплата: " +salary+"\nЗарплата за месяц: " +(salary*days)+"\n" );
    }

    public static void Zp(Tester tester, int days){
        System.out.println("Зарплаза за "+days+ " дней, работника по имени "+tester.name+": "+(tester.salary*days)+"\n");
    }
}
