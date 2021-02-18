import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your budget for spending?");
    double budget = scan.nextDouble();
    money(budget);
  }
  
  public static void money(double cash)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("How much will your next item be? (input without a $ symbol)");
    double price = scan.nextDouble();
    int purchase = 1;
    if (cash < price)
    {
      System.out.println("You don't have enough money, would you like to try to input a cheaper item? (y/n)");
      string response = scan.nextLine();
      if(response == "y")
      {
        money(cash);
      }
      else
      {
        System.out.println("This program ended, if you made a mistake along the way, simpy restart the program.");
      }
    }
    else
    {
      double newCash = cash - price; 
      System.out.println("Purcahses: " + purchase + ", results in your balance being: $" + newCash);
      purchase++;
      money(newCash);
    }
  }

}