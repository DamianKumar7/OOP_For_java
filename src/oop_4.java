import java.util.*;

class Account{
    int accountiId;
    String accountType;
    int balance;
    Account(int accountId,String accountType,int balance){
        this.accountiId = accountId;
        this.accountType = accountType;
        this.balance = balance;

    }
    boolean withdraw(int amount){
        if(amount > balance){
            System.out.println("Sorry not enough balance!");
            return false;
        }
        balance = balance - amount;
        System.out.println("Balance after withdraw:"+ Integer.toString(balance));
        return true;

    }

}
class AccountDetails{
    public Account getAccounntDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Account type");
        String tyep = sc.nextLine();
        System.out.println("Enter the balance");
        int balance = sc.nextInt();
        Account account = new Account(id,tyep,balance);
        return account;
    }
    public int getWithdrawAmount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be deducted");
        int amount  = sc.nextInt();
        return amount;
    }
    public static void main(String[] args){
        AccountDetails obj = new AccountDetails();
        Account account = obj.getAccounntDetails();
        int amount = obj.getWithdrawAmount();
        boolean ans = account.withdraw(amount);
        

    }
}