import java.util.Scanner;

public class VacationSystem {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String name = "";
    int key = 0;
    int age = 0;
    int day = 0;

    System.out.println("Welcome to the Andimar vacation system");

    System.out.println("Were is your name");
    name = in.nextLine();

    System.out.println("Were is your departament?");
    System.out.println("Customer Support, press 1");
    System.out.println("Driver, press 2");
    System.out.println("Administrative, press 3");
    key = in.nextInt();

    System.out.println("How many years of service do you have?");
    age = in.nextInt();

    if (key == 1) {
      if (age == 1) {
        day = 6;
      }
      if (age >= 2 && age <= 6) {
        day = 14;
      } 
      if( age >= 7) {
        day = 20;
      }
    }
    if (key == 2) {
      if (age == 1) {
        day = 7;
      }
      if (age >= 2 && age <= 6) {
        day = 15;
      } 
      if( age >= 7){
        day = 22;
      }
    }
    if (key == 3) {
      if (age == 1) {
        day = 10;
      }
      if (age >= 2 && age <= 6) {
        day = 20;
      } 
      if( age >= 7) {
        day = 30;
      }
    } 
    if (key >= 4) {
      System.out.println("the key does not correspond to any department");
    }

    System.out.println("Hello " + name + " have  " + day + " days vacation");
		in.close();
  }
}