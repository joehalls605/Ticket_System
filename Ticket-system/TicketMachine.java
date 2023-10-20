
/**
 * Write a description of class TicketMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicketMachine
{
    // instance variables - replace the example below with your own
    private int price;
    private int balance;
    private int total;

    /**
     * Constructor for objects of class TicketMachine
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }

   
    public int getPrice()
    {
        // put your code here
        return price;
    }
    
    public int getBalance()
    {
        return balance;
    }
    
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }
    
    public void printTicket()
    {
    System.out.println("Your ticket:");
    System.out.println("Price:" + price + "pounds");
    
    total = total + balance;
    balance = 0;
    }
}
