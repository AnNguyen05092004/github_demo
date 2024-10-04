public class Account {
    private String id, cus, name, password;
    
    public Account(String id, String cus, String name, String password) {
        this.id = id;
        this.cus = cus;
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    public boolean check(String name, String pass){
        if(this.name.equals(name) && this.password.equals(pass)){
            return true;
        }
        return false;
    }

}
