package Library;

import java.util.Scanner;
public class Admins extends Users {
    static Scanner scanner = new Scanner(System.in);
    static AdminOpp adminOpp = new AdminOpp();
    private String username;
    private String password;

    public Admins(){

    }

    public Admins(String name, String address, String email, String phone, String username, String password) {
        super(name, address, email, phone);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void menu(){
        int i;
        do {
        System.out.println("****** Admin Menu ******");
        System.out.println("1. Add new member");
        System.out.println("2. Add book");
        System.out.println("3. Delete book");
        System.out.println("4. Search member");
        System.out.println("5. Search book");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        i = scanner.nextInt();

            switch (i) {
                case 1:
                    adminOpp.newMember();
                    break;
                case 2:
                    adminOpp.addBook();
                    break;
                case 3:
                    adminOpp.deleteBook();
                    break;
                case 4:
                    adminOpp.searchMember();
                    break;
                case 5:
                    adminOpp.searchBook();
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }while (true);
    }
}
