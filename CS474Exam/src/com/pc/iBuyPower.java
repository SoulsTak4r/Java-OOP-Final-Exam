package com.pc;


/*

There is parent class with inner class and nested interface
The inner class extends its parent class and implements the nested interface
The Parent class extends Abstract buildPC Class
  This class will cover the following things.
        1- Method Overloading (Compile Time Polymorphism)
        2- Method Overriding (RunTime Polymorphism)
        3- Shadowing
        4- Obscuring
        5- Dynamic Dispatch (will happen in Main class)
        6 - Multilevel Inheritance ( This child class extends its parent class and its parent class extends abstract class)
                                    ( C -> P -> A )

   Reference : Jls (14)
                Chapter 8
                Chapter 9
                Chapter 3
                Chapter 15
                chapter 6



 */

public class iBuyPower extends BuildPC {

    private double discount = 16.0; // this variable is private which mean it can only be accessible in it own class.
    private static double price = 1350.0; // only static methods, class can access the static fields, since its also private that means this variable is only useable in this class
    public int code = 2; // A public field can be accessed by other classes and methods outside of its own class. Only if if the class is object is created.
    protected String Description = "Build your dream gaming PC with iBUYPOWER. High performance computers at a low price. ";
   // private String System = "This is IBuyPower Company"; -------> a local variable and a class share the same name,
                                                                    // the precedence rules may render the class unusable. The class is said to be obscured by the variable.

    public iBuyPower()
    {
        System.out.println(Description);
        System.out.println("");
    }

    public void getCode()
    {
        System.out.println("Secret code for iBuyPower received from Generic Class ");
    }

    // ----------------------------------------------------------------------------------------
    // this is the method which is already implemented in buildPC abstract class.
    // But here we are extending it and *OVERRIDING* the method
    @Override
    void information() {
        System.out.println("iBuyPower Is building Ram, Cpu, Graphics Card, and SSD. Please Wait.....");
    }

    // We are implementing an abstract method from buildPC abstract class
    @Override
    public String buildRam() {
        return "Ram has been Build from iBuyPower Parent Class";
    }

    // We are implementing an abstract method from buildPC abstract class
    @Override
    public int buildCpu() {
        return 2;
    }

    // We are implementing an abstract method from buildPC abstract class
    @Override
    public double buildGraphicsCard() {
        return 2.0;
    }

    // We are implementing an abstract method from buildPC abstract class
    @Override
    public float buildSSD() {
        return (float) 2.000;
    }
//-----------------------------------------------------------------------------


    // This method is created to show and example of "overriding method"
    // The same name method is created in its inner class newPrice
    public double afterDiscount()
    {
        float totalPrice = (float) (price - discount);

        return totalPrice;
    }
    // This method is created to show and example of "overriding method"
    // The same name method is created in its inner class newPrice
    public void Message()
    {
        System.out.println("you got 16% basic discount");
    }
    //-----------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------

    // This method is created to show and example of Overloading the Method
    // The same method is created in its inner class newPrice
    public void Confirmation(int x)
    {
        if(x == code)
        {
            System.out.println("Your Order has been confirmed");
        }
        else
        {
            System.out.println("***error.There was an error in our System");
        }
    }

    // This method is created to show and example of Overloading the Method
    // The same method is created in its inner class newPrice
    public void Confirmation(String x)
    {
        System.out.println(x);
    }

    //--------------------------------------------------------------------------------

    // This is an nested class of iBuyPower
    // it extends iBuyPower class and implements nested newDiscount interface which is in CyperPowerPc class
    // This class will cover the following things.
    /*  1- Method Overriding
        2- Method Overriding
        3- Shadowing
        4- Obscuring
        5- Dynamic Dispatch (will happen in Main class)
         6 - Multilevel Inheritance ( This child class extends its parent class and its parent class extends abstract class)
                                    ( C -> P -> A )
     */
    static class newPrice extends iBuyPower implements CyberPowerPC.newDiscount
    {

        private double discount = 30.0; // this variable will overshadow its parent class variable if this class object is created.


        public newPrice()
        {
            System.out.println("Variable of discount in iBuyPower has been overshadowed, discount is " + discount);
        }

        // This method is created to show and example of "overriding method"
        // The same method is created in its parent class iBuyPower
        @Override
        public double afterDiscount() {
            float totalPrice = (float) (price - discount);
            return totalPrice;
        }

        // This method is created to show and example of "overriding method"
        // The same method is created in its parent class iBuyPower
        public void Message()
        {

            System.out.println("Congrats! you got 30% basic discount");
        }

        // This method is created to show and example of "Method Overloading"
        // The same method is created below
        public void Confirmation(int x)
        {
            if(x == code)
            {
                System.out.println("Your discounted Order has been confirmed");
            }
            else
            {
                System.out.println("***error.There was an error in our System");
            }
        }

        // This method is created to show and example of "Method overloading"
        // The same method is created above
        public void Confirmation(String x)
        {
            System.out.println(x);
        }

        // This method is created to show that this method is in non-static child class.
        // we can access this class otherwise if the class is static child class we cannot access this method
        public void SpecialOffer()
        {
            System.out.println("No offer Found");
        }







    }


}
