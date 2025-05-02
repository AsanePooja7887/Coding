package practice;
/*
Write a program to swap two string variables without using a third variable in Java.
 */
public class Swapstrntuse3rdvar
{
    public static void main(String[] args) {
        String a = "Coding";
        String b = "Ninjas";
        System.out.println("Before swapping :- "+a+ " "+b);
        a= a+b;
        b=a.substring(0,a.length()- b.length());
        a=a.substring(b.length());
        System.out.println("After swapping :- "+a+ " "+b);


    }
}
