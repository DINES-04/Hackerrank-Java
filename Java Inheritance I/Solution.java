import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
	void walk()
	{
		System.out.println("I am walking");
	}
}
class bird extends Animal {
    void sing() {
        System.out.println("I am singing");
    }
}
class Bird extends bird
{
	void fly()
	{
		System.out.println("I am flying");
	}
    /*void sing() {
        System.out.println("I am singing");
    }*/
}


public class Solution{

   public static void main(String args[]){

	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
      bird.sing();
	
   }
}