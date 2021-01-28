package com.pc;

public abstract class BuildPC {



    // This method is implemented in abstract buildPC class.
    //The Three classes, CyberpowerPC, DigitalStorm and iButPower will extend this class
    // Those classes will *OVERRIDE* this method.
    void information()
    {
        System.out.println("Waiting for Pc to Build");
    }

    // all of these methods will be implemented in other Three classes depending on the company
    // These methods will return their stuff depending on the PC
    // All the companies will have a specific code. for example, if its called from CyberPowerPC, the code of that company is 1

    public abstract String buildRam();
    public abstract int buildCpu();
    public abstract double buildGraphicsCard();
    public abstract float buildSSD();




}
