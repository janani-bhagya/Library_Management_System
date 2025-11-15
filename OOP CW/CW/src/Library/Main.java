package Library;
import java.util.Scanner;

public class Main {


    static UserData databaseUser = new UserData();
    static BookData databaseBook = new BookData();

    private static void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("****** Admin Login ******");
        System.out.println("Enter Username - ");
        String username = scanner.nextLine();

        System.out.println("Enter Password - ");
        String password = scanner.nextLine();

        int n = 0;
        n = (databaseUser.login(username,password));
        if(n == 1){
            System.out.println("Login Successfully!");
            Admins adm = new Admins();
            adm.menu();
        }
        else {
            System.out.println("Incorrect Username or Password!");
        }
    }
    private static void memberlogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("****** Member Login ******");
        System.out.println("Enter memberID - ");
        String memberID = scanner.nextLine();

        int n = 0;
        n = (databaseUser.memberlogin(memberID));
        if(n == 1){
            System.out.println("Login Successfully!");
        }
        else {
            System.out.println("Incorrect Username or Password!");
        }
        Members mem = new Members();
        mem.menu();
    }
    private static void newAdmin(){
        Scanner scanner = new Scanner(System.in);
        String name, address, email, phone, username="", password, memberID, payment;

        System.out.println("Enter name - ");
        name = scanner.nextLine();

        System.out.println("Enter address - ");
        address = scanner.nextLine();

        System.out.println("Enter email - ");
        email = scanner.nextLine();

        System.out.println("Enter phone - ");
        phone = scanner.nextLine();

        System.out.println("Enter username - ");
        username = scanner.nextLine();

        System.out.println("Enter password - ");
        password = scanner.nextLine();

        System.out.println("Create account successfully");
        Admins adm = new Admins(name, address, email, phone, username, password);
        databaseUser.newAdmin(adm);

    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        databaseUser.Owner();
        databaseUser.User();
        databaseBook.Book();
            int i,n;
            do {
                System.out.println("Welcome to Library Management System!");
                System.out.println("1. Admin Login");
                System.out.println("2. Member Login");
                System.out.println("3. New Admin");
                System.out.println("4. Exit");
                System.out.println("Enter your choice: ");
                i = scanner.nextInt();
                switch (i) {
                    case 1:
                        login();
                        break;
                    case 2:
                        memberlogin();
                        break;
                    case 3:
                        newAdmin();
                        login();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.print("Invalid choice");

                }
            }while(true);
    }
}
