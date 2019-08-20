public class Account {
    private String number;
    private double balance;
    private String Name;
    private String phone;

    public Account(String number,double balance,String Name,String phone){
        this.number=number;
        this.balance=balance;
        this.Name=Name;
        this.phone=phone;
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("New balance is ="+balance);
    }
    public void withdraw(double amount){
        if(this.balance-amount<0){
            System.out.println("Not enough balance");
        }
        else {
            this.balance -= amount;
            System.out.println("New balance is ="+balance);
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
