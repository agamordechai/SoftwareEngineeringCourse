package lesson8;

public class Reader {
    private String name;
    private String address;
    private String id;
    private String phone;

    public Reader(String name, String address, String id, String phone) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getId() {
        return id;
    }
    public String getPhone() {
        return phone;
    }
}
