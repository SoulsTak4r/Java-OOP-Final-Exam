
/*

    Name: Hamza Amjad
    nedID: hamjad2
    UIN: 677562545
    CS 474 Final Exam
 */


/*

This is a Main class where all the instantiation is happening.
  This class will cover the following topics.
        1- Upcasting
        2- Downcasting
        4- Dynamic Dispatch
        5- if-else
        6- switch statements
        7- While loops
        8- try and catch
        10- executing Lambda Functions
        11- executing Anonymous Class
        12 - Subtype Polymorphism
        12 - Parametric Polymorphism

   Reference : Jls (14)
                Chapter 14
                Chapter 9.8 and 9.9
                Chapter 3
                Chapter 15
                 Chapter 6

 */


package com.pc;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

     private static CyberPowerPC cyberPowerPC = null;
    private static CyberPowerPC cyberPowerPC1 = null;
    private static GenericClass<CyberPowerPC> genericClass = null; // an example of Parametric Polymorphism
    private static GenericClass<String> genericClass1 = null; // an example of Parametric Polymorphism

    private static iBuyPower iBuyPower = null;
    private static DigitalStorm digitalStorm = null;
    public static void main(String[] args)
    {
        ArrayList<CyberPowerPC> arrayList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Please Select Your Gaming PC Company");
        System.out.println("1. CyberPowerPC");
        System.out.println("2. IBuyPower");
        System.out.println("3. DigitalStorm");

        genericClass1 = new GenericClass<>("Hello from Generic Class");
        System.out.println(genericClass1.getObject());

        int inp = checkInput(0, input);

        switch (inp)
        {
            case 1:

                cyberPowerPC = new CyberPowerPC();

                genericClass = new GenericClass<>(cyberPowerPC);
                genericClass.getObject().getCode();

                cyberPowerPC.Confirmation("You have confirmed that you have selected CyberPowerPc"); // this line shows that we are Method Overloading in cyberPowerPC

                Scanner nextInput = new Scanner(System.in);
                System.out.println("Do you want to take more discount? Type Y for yes or N for no");
                String c = nextInput.nextLine();
                //try to use unicode here

                if(c.equals("Y"))
                {

                    // In this snippet of code, we are also doing Dynamic Dispatch
                    cyberPowerPC1 = new CyberPowerPC().new newPrice(); // This line shows we are making an instance of inner class of CyberPowerPC
                    System.out.println(cyberPowerPC1.afterDiscount()); // This line shows that we are method overriding in inner class
                    cyberPowerPC1.Confirmation(1); // This line shows that we are method overloading in InnerClass of Cyberpowerpc
                    ((CyberPowerPC.newPrice) cyberPowerPC1).SpecialOffer(); // This line shows that we downcasting and downcasting is casting to a subtype
                    cyberPowerPC1.information(); // This line shows that we are method overloading in InnerClass of Cyberpowerpc



                    // These line shows that we are Upcasting and Upcasting is casting to a supertype
                    CyberPowerPC.newPrice child = new CyberPowerPC().new newPrice();
                    CyberPowerPC.newDiscount cyberPowerPC2 = child;
                    System.out.println("CyberPowerPC total price is: " + cyberPowerPC2.afterDiscount());



                    AnonymousClass anonymousClass = new AnonymousClass() {
                        @Override
                        public void suprise() {
                            System.out.println("Yayyyy! You got 5% more off, here is the Coupon: " + x);
                        }
                    };
                    anonymousClass.suprise();
                    arrayList.add(cyberPowerPC);
                }
                else
                {
                    cyberPowerPC.information(); // overridden method information about cyberPowerPC which is in abstract class
                    cyberPowerPC.buildRam(); // implemented by cyberPowerPC
                    cyberPowerPC.buildCpu(); // implemented by cyberPowerPC
                    cyberPowerPC.buildGraphicsCard(); // implemented by cyberPowerPC
                    cyberPowerPC.buildSSD(); // implemented by cyberPowerPC
                    cyberPowerPC.Message(); // implemented by cyberPowerPC
                }


                for(int i = 0; i < arrayList.size(); i++)
                {


                    System.out.println(arrayList.get(0).code);

                }

                break;
            case 2:

                iBuyPower = new iBuyPower();
                iBuyPower.Confirmation("You have confirmed that you have selected iBuyPower"); // this line shows that we are Method Overloading in cyberPowerPC
                GenericClass<iBuyPower> genericClass1 = new GenericClass<>(iBuyPower);
                genericClass1.getObject().getCode();


                Scanner nextInput1 = new Scanner(System.in);
                System.out.println("Do you want to take more discount? Type Y for yes or N for no");
                String cc = nextInput1.nextLine();

                if(cc.equals("Y"))
                {
                    // a Lambda function that return any kind of integer
                    childLambda child = (int y) -> y;

                    // a lambda function that return childlambda where you can access its lambda function
                    //for example, its returning childLambda, so when we return childLambda, we can easily access its own lambda functions
                    lambdaFunc parent = () -> child;

                    System.out.println("Yayyyy! You got 3% more off, here is the coupon code: " + parent.func().funky(2));


                    // In this snippet of code, we are also doing Dynamic Dispatch
                    iBuyPower iBuyPower1 = new iBuyPower.newPrice(); // This line shows we are making an instance of inner class of iBuyPower
                   System.out.println(iBuyPower1.afterDiscount()); // This line shows that we are method overriding in inner class
                    iBuyPower1.Confirmation(2); // This line shows that we are method overloading in InnerClass of iBuyPower
                    ((com.pc.iBuyPower.newPrice) iBuyPower1).SpecialOffer(); // This line shows that we downcasting and downcasting is casting to a subtype
                    iBuyPower1.information(); // This line shows that we are method overloading in InnerClass of iBuyPower

                    // These line shows that we are Upcasting and Upcasting is casting to a supertype
                    iBuyPower.newPrice child1 = new iBuyPower.newPrice();
                    CyberPowerPC.newDiscount ibuy = child1;
                    System.out.println(ibuy.afterDiscount());

                }
                else
                {
                    iBuyPower.information(); // overridden method information about ibuyPower which is in abstract class
                    iBuyPower.buildRam(); // implemented by iBuyPower
                    iBuyPower.buildCpu(); // implemented by iBuyPower
                    iBuyPower.buildGraphicsCard(); // implemented by iBuyPower
                    iBuyPower.buildSSD(); // implemented by iBuyPower
                    iBuyPower.Message(); // implemented by iBuyPower
                }
                break;
            case 3:

                digitalStorm = new DigitalStorm();
                digitalStorm.Confirmation("You have confirmed that you have selected DigitalStorm"); // this line shows that we are Method Overloading in cyberPowerPC
                GenericClass<DigitalStorm> genericClass2 = new GenericClass<>(digitalStorm);
                genericClass2.getObject().getCode();



                Scanner nextInput12 = new Scanner(System.in);
                System.out.println("Do you want to take more discount? Type Y for yes or N for no");
                String ccc = nextInput12.nextLine();


                if(ccc.equals("Y"))
                {

                    // In this snippet of code, we are also doing Dynamic Dispatch
                    DigitalStorm digitalStorm1 = new DigitalStorm.newPrice(); // This line shows we are making an instance of inner class of DigitalStorm
                    System.out.println(digitalStorm1.afterDiscount()); // This line shows that we are method overriding in inner class
                    digitalStorm.Confirmation(3); // This line shows that we are method overloading in InnerClass of DigitalStorm
                    ((DigitalStorm.newPrice) digitalStorm1).SpecialOffer(); // This line shows that we downcasting and downcasting is casting to a subtype
                    digitalStorm1.information(); // This line shows that we are method overloading in InnerClass of DigitalStorm

                    // These line shows that we are Upcasting and Upcasting is casting to a supertype
                    DigitalStorm.newPrice child1 = new DigitalStorm.newPrice();
                    InterFace.nestedInterFace digit = child1;
                    System.out.println(digit.afterDiscount());

                }
                else
                {
                    digitalStorm.information(); // overridden method information about DigitalStorm which is in abstract class
                    digitalStorm.buildRam(); // implemented by DigitalStorm
                    digitalStorm.buildCpu(); // implemented by DigitalStorm
                    digitalStorm.buildGraphicsCard(); // implemented by DigitalStorm
                    digitalStorm.buildSSD(); // implemented by DigitalStorm
                    digitalStorm.Message(); // implemented by DigitalStorm
                }

                break;
            default:
                System.out.println("No Pc available Please Try Later");
        }



    }


    // Checking the first user input
    private static int checkInput(int num, Scanner getNum)
    {


        boolean flag = false; // a check flag
        while (!flag) {
            try {


                num = getNum.nextInt();

                if(num > 0 && num < 4)
                {
                    flag = true;
                }
                else
                {

                    System.out.println("*** Please enter a number 1 to 3 ***");
                }
            } catch (InputMismatchException e) {

                System.out.println("****Error!!! Please enter a *NUMBER*..");
                getNum.next();
                continue;
            }
        }
        return num;
    }



}
