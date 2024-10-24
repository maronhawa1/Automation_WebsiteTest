public class register {
    String name;
    String email;
    String password;
    String firstName,lastName,address,country,state,city,zipCode,phone;
    int day,month,year;
    public register(String name, String email,String password, int day,int month,int year,String firstName,String lastName, String address, String country, String state, String city,String zipCode, String phone){
        this.name=name;
        this.email=email;

        this.password=password;
       this.day=day;
       this.month=month;
       this.year=year;
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.country=country;
        this.state=state;
        this.city=city;
        this.zipCode=zipCode;
        this.phone=phone;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setDay(char day) {
        this.day = day;
    }

    public void setMonth(char month) {
        this.month = month;
    }

    public void setYear(char year) {
        this.year = year;
    }
    public void emailIsExist(String str){
        if (str.equals("Email Address already exist!")){
            System.out.println("The email is exist please try on login");
        }
    }
}
