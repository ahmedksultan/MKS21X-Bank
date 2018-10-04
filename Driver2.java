public class Driver2 {
     public static void main(String[] args) {
          BankAccount test1 = new BankAccount( 200.53, 111, "fortnite");
          BankAccount test2 = new BankAccount( 300.00, 222, "password2");
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
          //transfer of money - 50 dollars!
          System.out.println(test1);
          System.out.println(test2);
          System.out.println("...\nTransferring $50 from test1 to test 2. ...");
          if (test1.transferTo(test2, 50.0, "Fortnite!!!")) {
               System.out.println("Success! $50 was transfered from test1 to test2!");
          }
          else {
               System.out.println("Failure - transfer was not completed.");
          }
          System.out.println(test1);
          System.out.println(test2);
          System.out.println("Account balance of " + test1.getAccountID() +
               " - $" + test1.getBalance());
          System.out.println("Account balance of " + test2.getAccountID() +
                    " - $" + test2.getBalance());
     }
}
