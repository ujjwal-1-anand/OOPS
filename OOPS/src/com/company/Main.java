package com.company;

class Pen{
    String type ;  // properties oif a class
    String color;

    public void write() {   // fuctioning of a class
        System.out.println("writing  something ");
            }
            public void colorprint() {  // colour print krne ko
                System.out.println(this.color); // this is used to trace whereever the class properties are called
                System.out.println(this.type);  // ye this ye btata hai ki iss function ko cal kon kr rha hai
            }
    // constructor can be of parametric, non parametric, and copy
            //

}   // this above line of code is a class and now we will create objects
    // of this class this class is reducing our work repeating again again the same thing

public class Main {

    public static void main(String[] args) {
         Pen pen1 = new Pen(); // declaring object pen() ye () constructor ke jaise kaam krte h
                               // constructor and class name must be same as uss class ka hi constructor bann rha hai
                              // constructor does not return anything
         Pen pen2 = new Pen(); // ek aur object
         Pen pen3 = new Pen(); // ek aur object


         pen1.type ="gel";  // dot is used to call the properties oif class
         pen1.color="blue";
         pen1.write(); //// function called here like what that class was doing uske function ko call kiya yaha humne

        pen2.type ="ball";  // dot is used to call the properties oif class
        pen2.color="green";

        pen3.type ="pilot";  // dot is used to call the properties oif class
        pen3.color="black";

        pen1.colorprint();
        pen2.colorprint();
        pen3.colorprint();
    }

}
