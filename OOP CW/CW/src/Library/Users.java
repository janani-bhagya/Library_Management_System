package Library;
abstract public class Users {
    protected String name;
    protected String address;
    protected String email;
    protected String phone;

    public Users() {

    }

    public Users(String name, String phone, String address, String email) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
    abstract public void menu();
}

