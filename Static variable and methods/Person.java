public class Person {
   String name;
   String email;
   String phoneNumber;
   private static int personCount = 0;
   public static void printPersonCounter() {
      System.out.println ("Person count: " + personCount);
   }

// WRITE YOUR CODE HERE
  
   public Person(String initName, String initEmail, String initPhone)
   {
      name = initName;
      email = initEmail;
      phoneNumber = initPhone;
// WRITE YOUR CODE HERE
      personCount++;
   }

   public String toString(){
     return  name + ": " + email + " " + phoneNumber;
   }

   public static void main(String[] args){
      // call the constructor to create a new person
      for (int i=0; i<Integer.parseInt(args[0]); i++) {
         new Person("P" + i, "p"+i+"@gmail.com", "123-456-7890");
      }

      Person.printPersonCounter();
   }
}
