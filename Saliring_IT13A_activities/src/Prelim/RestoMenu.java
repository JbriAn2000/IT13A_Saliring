package midterm;
import java.io.*;
import java.util.Scanner;

public class RestoMenu {

    static final int SHIFT = 3;
    static final String FILE_NAME = "D:\\users.txt"; 
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Welcome to Restaurant Ordering System ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1 -> createAccount();
                case 2 -> {
                    if (login()) {
                        orderMenu();
                    }
                }
                case 3 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

   
    public static void createAccount() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        String encryptedPassword = encrypt(password);

        try {
            FileWriter writer = new FileWriter(FILE_NAME, true);
            writer.write(username + "," + encryptedPassword + "\n");
            writer.close();
            System.out.println("Account created successfully! Saved to: " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }


    public static boolean login() {
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String storedUsername = parts[0];
                    String storedEncryptedPassword = parts[1];
                    String decryptedPassword = decrypt(storedEncryptedPassword);

                    if (storedUsername.equals(inputUsername) && decryptedPassword.equals(inputPassword)) {
                        System.out.println("Login successful! Welcome, " + inputUsername);
                        reader.close();
                        return true;
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }

        System.out.println("Invalid username or password.");
        return false;
    }

  
    public static String encrypt(String password) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : password.toCharArray()) {
            encrypted.append((char) (c + SHIFT));
        }
        return encrypted.toString();
    }


    public static String decrypt(String password) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : password.toCharArray()) {
            decrypted.append((char) (c - SHIFT));
        }
        return decrypted.toString();
    }

  
    public static void orderMenu() {
        String[] items = {"Pizza", "Burger", "Fries"};
        double[] prices = {150.0, 100.0, 50.0};
        int[] quantities = new int[3];

        int choice;

        do {
            System.out.println("\n--- Restaurant Menu ---");
            for (int i = 0; i < items.length; i++) {
                System.out.printf("%d. %s - ₱%.2f%n", i + 1, items[i], prices[i]);
            }
            System.out.println("4. Exit & Checkout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter quantity: ");
                int qty = scanner.nextInt();
                quantities[choice - 1] += qty;
            } else if (choice != 4) {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

      
        System.out.println("\n--- Order Summary ---");
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            if (quantities[i] > 0) {
                double itemTotal = quantities[i] * prices[i];
                System.out.printf("%s x %d = ₱%.2f%n", items[i], quantities[i], itemTotal);
                total += itemTotal;
            }
        }
        System.out.printf("Total Bill: ₱%.2f%n", total);
    }
}