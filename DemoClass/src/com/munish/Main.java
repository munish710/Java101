package com.munish;

class Outer{
    int i=5;
    void show(){
        System.out.println("Inside Outer class!"+i);
    }
    //static inner class
    static class Inner{
        void display()
        {
            System.out.println("Inside inner class!");
        }
    }
}

public class Main {

    public static void main(String[] args) {
	   Outer obj=new Outer();
	   obj.show();
	   Outer.Inner obj1=new Outer.Inner();
	   obj1.display();

    }
}
