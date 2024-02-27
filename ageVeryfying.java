import java.util.Scanner;
class ageVeryfying {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter age:");

    int age = input.nextInt();
    
    if (age < 18) {

    System.out.println("Your age is too small, don't qualified: " + age);
    } 
    
    if (age > 18) {
        System.out.println("You qualified to get ticket: " + age);
    }
    
    input.close();
    
  }

}
