public class Driver {
     public static void main(String[] args) {
          BankAccount test1 = new BankAccount( 200.53, 111, "fortnite");
          //getAccountID, getBalance
          System.out.println("ACCOUNT TEST - test1\n");
          System.out.println("Account balance of " + test1.getAccountID() +
               " - $" + test1.getBalance());
          //[[toString]] account info
          System.out.println(test1);
          //changing password
          test1.setPassword("Fortnite!!!");
          //depositing 300 dollars
          System.out.println("...\nDepositing 300 dollars!");
          test1.deposit(300.00);
          //getAccountID, getBalance
          System.out.println("Account balance of " + test1.getAccountID() +
               " - $" + test1.getBalance());
          //withdraw 100 dollars
          System.out.println("...\nWithdrawing 100 dollars!");
          test1.withdraw(100.53);
          //getAccountID, getBalance
          System.out.println("Account balance of " + test1.getAccountID() +
               " - $" + test1.getBalance());
     }
}
