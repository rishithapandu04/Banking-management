import java.util.Scanner;

class Account {
double balance = 0;
    void deposit(int amount){
        balance = balance + amount;
        System.out.println("Updated balance: + balance");
    }
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Updated balance: + balance");
  } 
    void deposit(int amount, String descripation){
     System.out.println("Updated balance: + balance");
     }
 }
public class BankAccount {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount obj = new BankAccount();
        System.out.println(" Enter integer amount:");
        int a =sc.nextInt();
        obj.deposit(a);
        System.out.println("Enter Decimal amount:");
        double b =sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter amount:");
        int c= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter descripation:");
        String d =sc.nextLine();
        obj.deposit(c,d);
        sc.close();
    }
}
    


    
    
        

    

    

