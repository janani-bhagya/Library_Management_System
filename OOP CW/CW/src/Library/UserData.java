package Library;

import java.util.ArrayList;
import java.util.Date;

public class UserData {

    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> address = new ArrayList<String>();
    ArrayList<String> email = new ArrayList<String>();
    ArrayList<String> phone = new ArrayList<String>();
    ArrayList<String> memberID = new ArrayList<String>();
    ArrayList<String> payment = new ArrayList<String>();
    ArrayList<String> username = new ArrayList<String>();
    ArrayList<String> password = new ArrayList<String>();
    ArrayList<Date> buyDate = new ArrayList<Date>();
    ArrayList<Date> exDate = new ArrayList<Date>();

    public void User(){
        name.add("sanjana");
        address.add("123 Main Street");
        email.add("sanjana@example.com");
        phone.add("0761863910");
        memberID.add("sanjana123");
        payment.add("Paid");
        buyDate.add(new Date(2023-12-07));

        name.add("Dushan");
        address.add("456 Elm Street");
        email.add("alice@example.com");
        phone.add("987-654-3210");
        memberID.add("Dushan123");
        payment.add("Not Paid");
        buyDate.add(new Date(2023-01-05));

    }
    public void Owner(){
        username.add("yasith");
        password.add("1234");
    }
    public void newMember(Members m){
        name.add(m.getName());
        address.add(m.getAddress());
        email.add(m.getEmail());
        phone.add(m.getPhone());
        memberID.add(m.getMemberID());
        payment.add(m.getPayment());
        System.out.println("Member added successfully!");
    }
    public void newAdmin(Admins a){
        username.add(a.getUsername());
        password.add(a.getPassword());
        System.out.println("Admin added successfully!");
    }

    public int login (String username, String password){
        int n = 0;
        for (int i = 0; i < this.username.size(); i++) {
            if (this.username.get(i).equals(username) && this.password.get(i).equals(password)) {
                n = 1;
            }
        }
        return n;
    }
    public int memberlogin (String memberID){
        int n = 0;
        for (int i = 0; i < this.memberID.size(); i++) {
            if (this.memberID.get(i).equals(memberID)) {
                n = 1;
            }
        }
        return n;
    }

    public void searchMember(String memberName) {
            int rem = 0;
            for (int i = 0; i < this.name.size(); i++) {
                if (this.name.get(i).equals(memberName)) {
                    System.out.println("Name: " + name.get(i));
                    System.out.println("Address: " + address.get(i));
                    System.out.println("Email: " + email.get(i));
                    System.out.println("Phone: " + phone.get(i));
                    System.out.println("MemberID: " + memberID.get(i));
                    System.out.println("Payment: " + payment.get(i));
                    rem = 1;
                }
            }
            if (rem != 1){
                System.out.println("Member not found!");
            }
    }

}
