public class patient {
    private int patientId;
    private String name;
    private int addressId;
    private String phone;
    private String email;

    // Constructor
    public patient(int patientId, String name, int addressId, String phone, String email) {
        this.patientId = patientId;
        this.name = name;
        this.addressId = addressId;
        this.phone = phone;
        this.email = email;
    }
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAddressId() {
        return addressId;
    }
    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
