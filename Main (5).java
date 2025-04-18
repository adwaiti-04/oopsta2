package test;

class Animal {
 void move() {
     System.out.println("The animal moves.");
 }
}


class Cheetah extends Animal {

 void move() {
     System.out.println("The cheetah runs swiftly!");
 }
}


public class Main {
 public static void main(String[] args) {
     Animal genericAnimal = new Animal();
     genericAnimal.move();  
     Cheetah fastCheetah = new Cheetah();
     fastCheetah.move();    
 }
}
