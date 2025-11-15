package Library;

import static Library.Admins.scanner;

public class Members extends Library.Users {
    private String memberID;
    private String payment;

    public Members(){
        super();
    }

    public Members(String name, String address, String email, String phone, String memberID, String payment) {
        super(name, address, email, phone);
        this.memberID = memberID;
        this.payment = payment;
    }
    public String getMemberID() {
        return memberID;
    }

    public String getPayment() {
        return payment;
    }

    public void menu(){
        MemberOpp memberOpp = new MemberOpp();
        int i;
        do {
            System.out.println("****** Member Menu ******");
            System.out.println("1. Borrow book");
            System.out.println("2. Return book");
            System.out.println("3. Renew membership");
            System.out.println("4. Buy membership");
            System.out.println("5. Search book");
            System.out.println("6. Calculate fine");
            System.out.println("7. Pay fine");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            i = scanner.nextInt();

            switch (i) {
                case 1:
                    memberOpp.borrowBook();
                    break;
                case 2:
                    memberOpp.returnBook();
                    break;
                case 3:
                    memberOpp.renewMembership();
                    break;
                case 4:
                    memberOpp.buyMembership();
                    break;
                case 5:
                    memberOpp.searchBook();
                    break;
                case 6:
                    memberOpp.calculateFine();
                    break;
                case 7:
                    memberOpp.payFine();
                    break;
                case 8:
                    memberOpp.exit();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (true);
    }
}
