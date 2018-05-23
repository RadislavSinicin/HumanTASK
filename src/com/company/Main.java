package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Human h1;
        Human h2;

        boolean sex;
        double percent=0;
        boolean rezultat=true;

        Scanner s = new Scanner(System.in);
        System.out.println("Vvedite first human");
        String name = s.nextLine();
        String surname = s.nextLine();
        sex=s.nextBoolean();
        int height=s.nextInt();
        int weight=s.nextInt();

        if (sex==true) {
            sex = true;
            h1=new Men(name,surname,height,weight,sex);
            System.out.println("Вы создали мужчину");
        }
        else {
            sex=false;
            h1=new Women(name,surname,height,weight,sex);
            System.out.println("Вы создали женщину");
        }
        System.out.println("Vvedite second human");
        Scanner s2=new Scanner(System.in);
        name = s2.nextLine();
        surname = s2.nextLine();
        sex=s2.nextBoolean();
        height=s2.nextInt();
        weight=s2.nextInt();

        if (sex==true) {
            sex = true;
            h2=new Men(name,surname,height,weight,sex);
            System.out.println("Вы создали мужчину");

        }
        else {
            sex=false;
            h2=new Women(name,surname,height,weight,sex);
            System.out.println("Вы создали женщину");
        } // создали двух людей

        h1.speak(h2);
        System.out.println("Совместимость в разговоре :"+h1.percent);
        h1.terpet(h2);
        System.out.println("Совместимость в терпении :"+h1.percent);
        h1.time(h2);
        System.out.println("Совместимость в времяприпроваждении :"+h1.percent);



        h1.relatives(h2);
        if (h1.relatives(h2)==null)
        {
            System.out.println("Ребенка не будет");
        }
        else {
            System.out.println("Ребеночек будет!");
            Human h3;
            h3=h1.relatives(h2);
            System.out.println("Name: " + h3.name);
            System.out.println("Surname: " +h3.sername);
            System.out.println("Sex: " +h3.sex);
            System.out.println("Weight: " +h3.weight);
            System.out.println("Height: " +h3.height);
        }
    }
}
