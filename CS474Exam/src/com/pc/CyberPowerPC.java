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
        7- Access Controls

   Reference : Jls (14)
                Chapter 8
                Chapter 9
                Chapter 3
                Chapter 15
                Chapter 6



 */







public class CyberPowerPC extends BuildPC {
    public String MY_CONSTANT = "With 20% Discount";
   private double discount = 20.0; // this variable is private which mean it can only be accessible in it own class.
   private static double price = 1250.0; // only static methods, class can access the static fields, since its also private that means this variable is only useable in this class
   public int code = 1; // A public field can be accessed by other classes and methods outside of its own class. Only if if the class is object is created.
   protected String Description = "CyberPowerPC, also known as CyberPower, is an American computer manufacturer and retailer.";
   final int secreteCode = 777;



   public CyberPowerPC()
   {
       System.out.println(Description);
       System.out.println("");

   }


   public void getCode()
   {
       System.out.println("Secret code for CyberPowerPC received from Generic Class: " + this.secreteCode );
   }


// ----------------------------------------------------------------------------------------
    // this is the method which is already implemented in buildPC abstract class.
    // But here we are extending it and *OVERRIDING* the method
    @Override
    void information() {
        System.out.println("CyberPowerPC Is building Ram, Cpu, Graphics Card, and SSD. Please Wait.....");
    }

   // We are implementing an abstract method from buildPC abstract class
    @Override
    public String buildRam() {
        return "Ram has been Build";
    }

    // We are implementing an abstract method from buildPC abstract class
    @Override
    public int buildCpu() {
        return 1;
    }

    // We are implementing an abstract method from buildPC abstract class
    @Override
    public double buildGraphicsCard() {
        return 1.0;
    }

    // We are implementing an abstract method from buildPC abstract class
    @Override
    public float buildSSD() {
        return (float) 1.000;
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
       System.out.println("you got " + MY_CONSTANT);
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

    //**********************************

    // Two methods are explaining method Operator Overloading
    // If one
   public static void getTotal(int a)
   {
       System.out.println("This is static method of CyberPowerPC Parent Class, and integer " + a + " is entered to invoke this method" );
   }

    public static void getTotal(String a)
    {
        System.out.println("This is static method of CyberPowerPC Parent Class, and String  " + a + " is entered to invoke this method" );
    }
    //*******************************************
   //--------------------------------------------------------------------------------

    // This is and inner nested interface. The inner class will implement its method
   interface newDiscount
   {
       double afterDiscount();

   }


   // This is an inner class of CyberpowerPC
    // it extends CyberpowerPc class and implements newDiscount interface
    // This class will cover the following things.
    /*  1- Method Overloading (Compile Time Polymorphism)
        2- Method Overriding (RunTime Polymorphism)
        3- Shadowing
        4- Obscuring
        5- Dynamic Dispatch (will happen in Main class)
        6 - Multilevel Inheritance ( This child class extends its parent class and its parent class extends abstract class)
                                    ( C -> P -> A )
     */
   class newPrice extends CyberPowerPC implements newDiscount
   {
        public String MY_CONSTANT = "with 25% Discount"; // this variable will Obscure the Parent variable with the name name
       private double discount = 25.0; // this variable will overshadow its parent class variable if this class object is created.


       public newPrice()
       {
           System.out.println("Variable of discount in CyberPowerPC has been overshadowed, discount is " + discount);
       }

       // This method is created to show and example of "overriding method"
       // The same method is created in its parent class CyberPowerPc
       @Override
       public double afterDiscount() {
           float totalPrice = (float) (price - discount);
           return totalPrice;
       }

       // This method is created to show and example of "overriding method"
       // The same method is created in its parent class CyberPowerPc
       public void Message()
       {

           System.out.println("Congrats! you got " + MY_CONSTANT);
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
