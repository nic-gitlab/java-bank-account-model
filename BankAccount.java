public class BankAccount {

  private String accountNumber;
  private double balance;

  public BankAccount(String accountNumber ) {
    this.accountNumber = accountNumber;
    this.balance = this.getBalance();
  }

public String getAccountNumber(){
    return accountNumber;
}

public double getBalance(){
    return balance;
}

public void deposit(double depositAmount){
    this.balance += depositAmount;
}

public double withdraw(double withdrawalAmount) {
    if (this.balance >= withdrawalAmount) {
      this.balance -= withdrawalAmount;
    }
  return withdrawalAmount;
}





}
