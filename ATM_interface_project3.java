

/* 
ATM Interface
Create a class to represent 1. the ATM machine.
2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.
3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
checkBalance().
4. Create a class to represent the user's bank account, which stores the account balance.
5. Connect the ATM class with the user's bank account class to access and modify the account
balance.
6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions.
*/

import java.util.Scanner;

class ATM{

    int PIN = 5678;
    int balance = 10000;
    
public void checkPin(){

    System.out.println("Enter your PIN");
    Scanner sc = new Scanner(System.in);
    int pin = sc.nextInt();

    if(pin==PIN){
     menu();
    }
    else{
        System.out.println("Please Entered a valid PIN");
    }


    
    
}

public void menu(){
    System.out.println("Choose an option");
    System.out.println("1. Check Balance");
    System.out.println("2. Withdraw money");
    System.out.println("3. Deposit Money");
    System.out.println("4. Go Back");
    System.out.println("5. Exit");

    System.out.println("Select an option");

    Scanner sc = new Scanner(System.in);
    int option = sc.nextInt();
    

    if(option==1){
        checkBalance();
    }
    else if(option==2){
        withdrawBalance();
    }
    else if(option==3){
        depositMoney();
    }
    else if(option==4){
        back();
    }
    else if(option==5){   
        
        System.out.println("Thank you for using our ATM");
        System.out.println("Have a nice day");
        
    }
    



}

public void checkBalance(){
System.out.println("Thank you");
System.out.println("Your Balance is " + balance);
menu();
}
public void withdrawBalance(){
    System.out.println("Enter withdraw amount");

    Scanner sc = new Scanner(System.in);
    int withdrawBalance = sc.nextInt();
    if(withdrawBalance<balance){
        System.out.println("Thank you for using our ATM");
        System.out.println("Transiction Successful");
        System.out.println("You have succesfully withdraw Rs" +withdrawBalance + " from your account");
        System.out.println("Your remaining balance is Rs" + (balance - withdrawBalance) + " in your account ");

        balance = balance-withdrawBalance;

        menu();
    }
    else{
        System.out.println("Insufficient Balance");
    }
}

public void depositMoney(){
    System.out.println("Insert Cash you want to deposit");
    Scanner sc = new Scanner(System.in);
    int depositMoney = sc.nextInt();

    System.out.println("You have deposited money Succesfully :) ");
    System.out.println("Your remaining balance is Rs" + (balance + depositMoney) + " in your account ");
    System.out.println("Thank You for using our ATM");
    balance = balance+ depositMoney;
    menu();
}

public void  back(){
    
    System.out.println("Thank you for using our ATM");
    System.out.println("Have a nice day");
    System.out.println("Please visit again");
    System.out.println("Thank you");

    checkPin();
    
}
}


public class ATM_interface_project3 {
    public static void main(String[] args) {
        
        ATM atm = new ATM();
        atm.checkPin();
    }
    
}
