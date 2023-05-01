package generics;

import generics.interfaces.BrazilTaxService;
import generics.interfaces.UsaTaxService;


public class Tests {

    public void runMe(){

        //ex1();
        //ex2();
        //ex3();
        ex4();




    }

    public void ex4(){
        BankAccount accOnBrazil = new BankAccount(new BrazilTaxService());
        BankAccount accOnUsa = new BankAccount(new UsaTaxService());

        accOnBrazil.depositAmount(25.0);
        accOnUsa.depositAmount(25.0);
        System.out.println(String.format("Your brazilian account has %.2f of amount", accOnBrazil.getBalance()));
        System.out.println(String.format("Your Usa account has %.2f of amount", accOnUsa.getBalance()));


    }

    /*public void ex3(){

        BankAccount acc1 = new BankAccount();
        System.out.println(acc1); //BankAccount{balance=0.0, accountNumber=0, lastAssignedNumber=1, BANK_CODE=123}
        BankAccount acc2 = new BankAccount();
        System.out.println(acc2); //BankAccount{balance=0.0, accountNumber=1, lastAssignedNumber=2, BANK_CODE=123}
        System.out.println(acc1); //BankAccount{balance=0.0, accountNumber=0, lastAssignedNumber=2, BANK_CODE=123}

    }*/

    public void ex2(){
        int mInt = test();
        System.out.println(mInt);
        int mInt2 = test2(); //this is possible because we're in the same class.
        System.out.println(mInt2);
        String.valueOf(1);  //static method
        String str = new String("teste");
        str.length(); //instance method
    };
    public static int test(){
        return 5;
    }
    public int test2(){
        return 5;
    }

    public void ex1(){

        int i = 5;
        changeNumber(i);
        System.out.println(String.format("My number i is %d", i)); //5
        Integer i2 = 7;
        changeNumber2(i2);
        System.out.println(String.format("My number i2 is %d", i2)); //7
        int[] intArray = {10,20,30};
        System.out.println(String.format("Array ref: %s", intArray)); //[I@1b6d3586
        changeArrayNumber(intArray);
        System.out.println(String.format("My first element of array is %d", intArray[0])); //20
        Person p1 = new Person(5,"Teste"); //generics.Tests$Person@4554617c
        System.out.println(String.format("Ref from person: %s", p1));
        changePerson(p1);
        System.out.println(String.format("The name of person %s \n The age of person %d", p1.name, p1.age)); //Teste2 15

    }

    private void changePerson(Person p){
        System.out.println(String.format("Ref from person: %s", p)); //generics.Tests$Person@4554617c
        p.age = 15;
        p.name = "Teste2";
    }

    private void changeArrayNumber(int[] arrayParam){
        System.out.println(String.format("Array ref: %s", arrayParam)); //[I@1b6d3586
        arrayParam[0] = 20;
    }
    private void changeNumber2(Integer i2){
        i2 = i2 + 5;
    }
    private void changeNumber(int i){
        i = i + 5;
    }
    public class Person{
        private Integer age;
        private String name;

        Person(Integer age, String name){
            this.age = age;
            this.name = name;
        }

    }

}
