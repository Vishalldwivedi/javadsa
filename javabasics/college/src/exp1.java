import java.util.Scanner;

abstract class Account {
    double interestRate;
    double amount;

    abstract double calculateInterest();
}

class FDAccount extends Account {
    double calculateInterest() {
        double interestRate = 0;
        double amount;
        int noOfDays;
        int age;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter amount = ");
        amount = ob.nextInt();
        System.out.println("Enter number of days = ");
        noOfDays = ob.nextInt();

        if (amount < 10000000) {
            System.out.println("Enter age of Customer = ");
            age = ob.nextInt();
            if (age >= 60) {
                interestRate = calculateInterestForSeniorCitizens(noOfDays, amount);
            } else {
                interestRate = calculateInterestForRegularCustomers(noOfDays, amount);
            }
        } else {
            interestRate = calculateInterestForHighValueDeposits(noOfDays, amount);
        }
        ob.close();
        return interestRate;
    }

    private double calculateInterestForSeniorCitizens(int noOfDays, double amount) { double rate = 0;	if (noOfDays >= 7 && noOfDays <= 14) {	rate = 5.0;
    } else if (noOfDays >= 15 && noOfDays <= 29) { rate = 5.25;
    } else if (noOfDays >= 30 && noOfDays <= 45) { rate = 6.0;
    } else if (noOfDays > 45 && noOfDays <= 60) { rate = 7.5;
    } else if (noOfDays >= 61 && noOfDays <= 184) { rate = 8.0;
    } else if (noOfDays >= 185 && noOfDays <= 365) { rate = 8.5;
    }
        return calculateInterest(amount, rate);
    }

    private double calculateInterestForRegularCustomers(int noOfDays, double amount) { double rate = 0;	if (noOfDays >= 7 && noOfDays <= 14) {	rate = 4.5;
    } else if (noOfDays >= 15 && noOfDays <= 29) { rate = 4.75;
    } else if (noOfDays >= 30 && noOfDays <= 45) { rate = 5.5;
    } else if (noOfDays > 45 && noOfDays <= 60) { rate = 7.0;
    } else if (noOfDays >= 61 && noOfDays <= 184) { rate = 7.5;
    } else if (noOfDays >= 185 && noOfDays <= 365) { rate = 8.0;
    }
        return calculateInterest(amount, rate);
    }

    private double calculateInterestForHighValueDeposits(int noOfDays, double amount) { double rate = 0;	if (noOfDays >= 7 && noOfDays <= 14) {	rate = 6.5;
    } else if (noOfDays >= 15 && noOfDays <= 29) { rate = 6.75;
    } else if (noOfDays >= 30 && noOfDays <= 45) { rate = 6.75;
    } else if (noOfDays > 45 && noOfDays <= 60) { rate = 8.0;
    } else if (noOfDays >= 61 && noOfDays <= 184) { rate = 8.5;
    } else if (noOfDays >= 185 && noOfDays <= 365) { rate = 10.0;
    }
        return calculateInterest(amount, rate);
    }

    private double calculateInterest(double amount, double rate) { return (rate / 100) * amount;
    }
}



class RDAccount extends Account { double interestRate, interest = 0.0; double amount;	int noOfMonths, age;
    double monthlyAmount;

    double calculateInterest() {
        Scanner ob = new Scanner(System.in); System.out.println("Enter per month Amount = "); monthlyAmount = ob.nextDouble(); System.out.println("Enter no of Months = "); noOfMonths = ob.nextInt();
        System.out.println("Enter the age of customer = "); age = ob.nextInt();
        amount = (monthlyAmount * noOfMonths);

        if (age >= 60) {	interestRate = calculateSeniorCitizenRate(noOfMonths);
        } else {
            interestRate = calculateRegularCustomerRate(noOfMonths);
        }

        ob.close();	interest = (interestRate
                / 100) * amount;	return interest;
    }

    private double calculateSeniorCitizenRate(int noOfMonths) { if (noOfMonths >= 6 && noOfMonths < 9) {
        return 8.00;
    } else if (noOfMonths >= 9 && noOfMonths < 12) { return 8.25;
    } else if (noOfMonths >= 12 && noOfMonths < 15) { return 8.50;
    } else if (noOfMonths >= 15 && noOfMonths < 18) { return 8.75;
    } else if (noOfMonths >= 18 && noOfMonths < 21) { return 9.00;
    } else if (noOfMonths >= 21) { return 9.25;
    }
        return 0;
    }

    private double calculateRegularCustomerRate(int noOfMonths) { if (noOfMonths >= 6 && noOfMonths < 9) {
        return 7.50;
    } else if (noOfMonths >= 9 && noOfMonths < 12) { return 7.75;
    } else if (noOfMonths >= 12 && noOfMonths < 15) { return 8.00;
    } else if (noOfMonths >= 15 && noOfMonths < 18) { return 8.25;
    } else if (noOfMonths >= 18 && noOfMonths < 21) { return 8.50;
    } else if (noOfMonths >= 21) { return 8.75;
    }
        return 0;
    }
}

class SBAccount extends Account { double interestRate = 0.000;
    double interest;	double amount; int type;
    Scanner ob = new Scanner(System.in); double calculateInterest() {
        System.out.println("Enter Amount = "); amount = ob.nextInt();
        System.out.println("Press 1 for Normal Account \nPress 2 for NRI :: "); type = ob.nextInt();
        if (type == 1) { interestRate = 0.04;	} else if (type == 2) { interestRate = 0.06;
        }
        interest = interestRate*amount; ob.close();
        return interest;
    }
}
public class exp1 {
    public static void main(String[] args) {
        String name;
        int choice;
        Scanner o = new Scanner(System.in);
        System.out.print("\n21BCS2844");
        System.out.print("\nvishal\n");
        System.out.print("\nEnter Customer name :");
        name = o.next();
        System.out.print(" Select the following options: \n1. Interest Calculator -- SB\n2. Interest Calculator -- FD\n3. Interest Calculator -- RD\n4. Exit\nWhat is your Choice " + name + " : ");

        choice = o.nextInt();
        switch (choice) {
            case 1:
                SBAccount ob1 = new SBAccount();
                System.out.println(" Interest amount you will get = " + ob1.calculateInterest());

            case 2:
                FDAccount ob2 = new FDAccount();
                System.out.println(" Interest amount you will get = " + ob2.calculateInterest());

            case 3:
                RDAccount ob = new RDAccount();
                System.out.println(" Interest amount you will get = " + ob.calculateInterest());

            case 4:
                break;
        }
        o.close();

    }
}