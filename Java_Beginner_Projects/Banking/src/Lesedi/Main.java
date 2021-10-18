package Lesedi;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        if (bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Lee", 50.05);
        bank.addCustomer("Adelaide", "Tedi", 175.3);
        bank.addCustomer("Adelaide", "Curs", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Mike", 150.54);

        bank.addCustomerTransaction("Adelaide", "Lee", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tedi", 12.44);
        bank.addCustomerTransaction("Adelaide", "Curs", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brain", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addCustomer("Adelaide", "Brain", 5.53)) {
            System.out.println("Error Adelaide branch already exist");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Adelaide", "Lee", 12.21)) {
            System.out.println("Customer Lee already exists");
        }
    }
}
