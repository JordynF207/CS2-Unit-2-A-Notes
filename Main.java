public class Main {

   public static void main(String []args) {
      int yourAge = 15;
      int drivingAge = 17;
      // 1. Will these print true or false? False, true
      System.out.println(yourAge == drivingAge);
      System.out.println(yourAge != drivingAge);
      // 2. Set yourAge to a new value of 17
      yourAge = 17;
      // 3. Print whether yourAge equals drivingAge
      System.out.println(yourAge == drivingAge);
      System.out.println(yourAge != drivingAge);
      
      boolean sameAge = (yourAge == drivingAge);
      System.out.println(sameAge);


      boolean isHeads = false;
if (isHeads) {
    System.out.println("Let's go to the game");
}
else {
    System.out.println("Let's watch a movie");
}
System.out.println("after conditional");

boolean isAWeek = false;
if (isAWeek) {
   System.out.println("It's a busy week.");
}
else {
   System.out.println("It's a lighter week!");
}

   }
}
