public class BankAccount {
     private double balance;
     private int accountID;
     private String password;
     public BankAccount(double bl, int ID, String pwd) {
          balance = bl;
          accountID = ID;
          password = pwd;
     }
     public double getBalance() {
          return balance;
     }
     public int getAccountID() {
          return accountID;
     }
     public void changePassword(String newPwd) {
          password = newPwd;
     }
     public boolean deposit(double amount) {
          if ( amount < 0 ) {
               return false;
          }
          balance += amount;
          return true;
     }
}
