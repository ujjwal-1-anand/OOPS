package com.company;



 // cosntructor ko call sifr ek baar kiya jaata hai jb wo cal
// hota hai function jaise usko baar baar call nhui kr skte




class Student {          // class bani

    String name;
    int age;
        public void printinfo() {
                System.out.println(this.age);   // neeche non-paramateric hai kyuiki iske () me kuch nhi hai
                System.out.println(this.name);
            https://github.com/ujjwal-1-anand/OOPS.git
            }

    Student() {
        System.out.println("constructor called");
    }

                /*
                        Student (String name, int age){  // ye wala constructor parametrized hai
                            this.name=name  ;// abb yaha pe jo name akela hai wo aapne string me paas kiya hai like jo hum as a user de rhe hai
                            this.age= age;  // this.name jo hai wo class me se utha ke laaye h  ka naam hai  and name jo hai wo
                }
                  */


    Student (Student s2){     // copy constructor ek object ko copy kr ke dusre me daale
        this.name=s2.name;
        this.age=s2.age;
    }
}


public class Main {
    public static void main(String[] args) {
        // parametrized constructor agar doge to thik wrna java apne aapa ban leta hai
        Student s1 = new Student();            // passing the info for constructor
        s1.name = "sralldha";                // yaha pe aapne naya ojbect initialize
        s1.age = 22;
        Student s2 = new Student(s1); // s2 jo naya object banay agya hai usme aapne s1 ko copy kr liya
        s2.printinfo();
        com.company1.Account account1=new com.company1.Account();
     account1.naame="customer";   // notice kre to humne kbhi s2 liye kuch nhi kiya but we have just copied the s1 into s2
;

        Triangle t1 = new Triangle();
        t1.color = "red"; //. color ka mtlb hai ki shape class se aaone uski property mang li
        t1.printinfo();
    }
}


//// Inheritance ////

class Shape {                // shape class aapne 2 properties likhi aur main me jaa ke
    String color ;
    String name;
}

class Triangle extends Shape{ // tarike se traingle class ke liye bhi aapko properties deni chahiye thi but aap nhi de rhe ho
                              // but humne extend kiya hai isko uppar se


                                  public void printinfo() {
                                  System.out.println(this.color);
                              }
}

/*  4 types ke inheritance hai

    */


class Shapes {
    public void area (){
    System.out.println("Displays area");
    }

}
/// neche wala example multi level hai
class Tri extends Shapes{
    public void area(int l,int h){
        System.out.println((l/2)*l*h);
    }
}
/* class Equilateral extends Tri {
    public void area(int l, int h) {
        System.out.println((l / 2) * l * h);
    }
} */

// hireracial extends class ek hi base class se multi class bann gyi


class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}
