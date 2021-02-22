import java.util.Scanner; //scanner is imported for use
class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in); //declaring Scanner scan
    System.out.println("What is your budget for spending?");
    double budget = scan.nextDouble(); //uses scanner scan
    money(budget); //calls to method
  }
  
  public static void money(double cash) //Method
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("How much will your next item be? (input without a $ symbol)");
    double price = scan.nextDouble();
    int purchase = 1;

    if (cash < price)
    {
      System.out.println("You don't have enough money; would you like to try to input a cheaper item? (y/n)");

      String response = scan.next();

      if(response.equals("y"))
      {
        money(cash);
      }
      else if (response.equals("n"))
      {
        System.out.println("This program ended, if you made a mistake along the way, simpy restart the program.");
      }
    }
    else if (cash > price && price >= 0)
    {
      double newCash = cash - price; 
      purchase++;
      System.out.println("Purcahses: " + purchase + ", results in your balance being: $" + newCash);
      System.out.println("Will that be your final purchase? (y/n)");
      String response = scan.next();
      if (response.equals("y"))
        {
          System.out.println("Okay, thank you for shopping! If you made a mistake along the way restart the program! \n Your final balance is " + cash);
          System.exit(1);
        }
      else if (response.equals("n"))
      {
        System.out.println("Okay moving onto next item...");
        money(cash);
      }
      else
      {
        System.exit(1);
      }
      money(newCash);
    }
  }

}