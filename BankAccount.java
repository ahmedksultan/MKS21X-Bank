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
     public void setPassword(String newPwd) {
          password = newPwd;
     }
     public String toString() {
          return accountID + "\t" + balance;
     }
     public boolean deposit(double amount) {
          if ( amount < 0 ) {
               return false;
          }
          balance += amount;
          return true;
     }
     public boolean withdraw(double amount) {
          if ( amount < 0 || (balance - amount < 0) ) {
               return false;
          }
          balance -= amount;
          return true;
     }
}
