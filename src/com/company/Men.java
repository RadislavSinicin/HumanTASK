package com.company;

public class Men extends Human{

    public Men(String name, String surname, int height, int weight, boolean sex){
        this.name=name;
        this.height=height;
        this.sername=surname;
        this.sex=sex;
        this.weight=weight;
        this.rez=true;
        this.percent=0.0;
    }

    public Men(){

    }

    @Override
    public boolean speak(Human h) {
        if (h.sex==true)
        {
            percent=0.5;
            rez=false;
            return  rez;
        }
        else {
            percent=1.0;
            return rez=true;
        }
    }

    @Override
    public boolean terpet(Human h) {
        if (h.sex==true)
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
        if (this.height>h.height)
        {
            percent=0.85;
            return rez=false;
        }
        else {
            percent=0.95;
            return rez=true;
        }
    }

    @Override
    public Human relatives(Human h) {
        if (this.sex==h.sex)
            return null;
        else {
            Human baby=new Men();
            baby.name="Rebenok";
            baby.sername=this.sername;
            baby.height=this.height/3;
            baby.weight=this.weight/10;
            baby.sex=true;
            return baby;
        }
    }
}
