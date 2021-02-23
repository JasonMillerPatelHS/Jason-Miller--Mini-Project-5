import java.util.Scanner; //scanner is imported for use
class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in); //declaring Scanner scan
    System.out.println("What is your budget for spending?");
    double budget = scan.nextDouble(); //uses scanner scan
    budget = money(budget); //calls to method, makes budget = to method
    System.out.println(budget); //prints final budget
    scan.close(); //ends scanner in main
  } 

  public static double money(double cash) //Method
  {
    Scanner scan = new Scanner(System.in); //scanner scan was not declared in method money.
    System.out.println("How much will your item be? (input without a $ symbol)");
    double price = scan.nextDouble(); //price is the cost of customers item purchased
    int purchase = 1; //purchase is the measure so the user knows how many items they 'purchased'

    if (cash <= price) //if item is too expensive then...
    {
      System.out.println("You don't have enough money; \n would you like to try to input a cheaper item? (y/n)");

      String response = scan.next(); //scans for response next line,

      if(response.equals("y")) //if user input y
      {
        money(cash);
      } 
      else if (response.equals("n"))
      {
        System.out.println("This program ended, \n if you made a mistake along the way, simply restart the program. Balance($): ");
        return cash;
      } 
    } 
    else if (cash > price && price >= 0)
    {
      double newCash = cash - price; 
      purchase++; //adds one to purchases to show how many items user bought
      System.out.println("Purcahses: " + purchase + ", results in your balance being: $" + newCash);
      System.out.println("Will that be your FINAL purchase? (y/n)");
      String response = scan.next(); //scans user response again
      if (response.equals("y")) //if user typed y then..
        {
          System.out.println("Okay, thank you for shopping! \nIf you made a mistake along the way restart the program! \nfinal balance ($): ");
          return newCash;
        } 
      else if (response.equals("n")) //if user typed n...
      {
        System.out.println("Okay moving onto next item...");
        money(newCash); //creates a loop restarts method
      } 
      else
      {
        return newCash;
      }
      scan.close(); //ends scanner
    } 
    scan.close(); //ends scanner in method
    return cash;
  } 
} 