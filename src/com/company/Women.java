package com.company;

public class Women extends Human{

    public Human givebaby()
    {
        Human n2=new Men();
        return n2;
    }
    public Women(){

    }
    public Women (String name, String surname, int height, int weight, boolean sex){
        this.name=name;
        this.height=height;
        this.sername=surname;
        this.sex=sex;
        this.weight=weight;
        this.percent= 0.0;
        this.rez=false;
    }

    @Override
    public boolean speak(Human h) {
        if(h.sex==true)
        {
            percent=1.0;
            return rez=true;

        }
        else {
            percent=0.5;
            return rez=true;
        }
    }

    @Override
    public boolean terpet(Human h) {
        if (h.sex==false)
        {
            percent=0.05;
            return rez=false;
        }
        else {
            percent=0.7;
            return rez=true;
        }
    }

    @Override
    public boolean time(Human h) {
        if (this.height<h.height)
        {
            percent=0.85;
            return rez=true;
        }
        else {
            percent=0.95;
            return rez=true;
        }
    }

    @Override
    public Human relatives(Human h) {
        if (this.sex == h.sex)
            return null;
        else {
            Human baby = new Men();
            baby.name = "Rebenok";
            baby.sername = this.sername;
            baby.height = this.height - 100;
            baby.weight = 5;
            baby.sex = false;
            return baby;
        }
    }
}
