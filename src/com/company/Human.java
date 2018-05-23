package com.company;

public abstract class Human {

    public boolean sex;
    public String name;
    public String sername;
    public int height;
    public int weight;

    public double percent;
    public boolean rez;

    public abstract boolean speak(Human h);
    public abstract boolean terpet(Human h);
    public abstract boolean time(Human h);
    public  abstract Human relatives(Human h);

}
