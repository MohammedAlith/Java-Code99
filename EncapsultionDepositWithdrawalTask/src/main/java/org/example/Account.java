package org.example;
public class Account {
    private long contact;
    private double bal = 0.0;
    private String name;
    private String gender;



    public Account(long contact, String name, String gender, double balance) {
        this.contact = contact;
        this.gender = gender;
        this.bal = balance;
        this.name = name;

    }


    public long getContact()
    {
        return contact;
    }
    public void setContact(long contact) {

        this.contact = contact;
    }
    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
        }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getBal() {
        return bal;
    }

    public void deposit(double amount){
        if(amount>0){
            bal +=amount;
            System.out.println("Successfully Deposited: "+amount);
        }else{
            System.out.println("Deposit amount must be positive.");
        }
    }
 public void withdraw(double amount){
        if(amount<0){
            if(bal>=amount){
                bal-=amount;
                System.out.println("Successfully Withdraw: "+amount);
            } else if(amount<bal){
                System.out.println("Insufficient Balance");
            }else{
                System.out.println("withdrawal amount should be positive");
            }
        }

 }

}
