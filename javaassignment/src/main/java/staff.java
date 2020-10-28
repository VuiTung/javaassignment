/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class staff {
    private String Fullname;
    private int ID;
    private String Password;
    private int Age;
    private String PN;
    private String Email;
    private String Position;
    private String Gender;
    public staff(){}
    public staff(String Fullname, int ID, String Password, int Age, String PN, String Email, String Position, String Gender) {
        this.Fullname = Fullname;
        this.ID = ID;
        this.Password = Password;
        this.Age = Age;
        this.PN = PN;
        this.Email = Email;
        this.Position = Position;
        this.Gender = Gender;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getPN() {
        return PN;
    }

    public void setPN(String PN) {
        this.PN = PN;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }
}
class managingStaff extends staff{
        private String shift;

    public managingStaff(String shift) {
        this.shift = shift;
    }

    public managingStaff(String shift, String Fullname, int ID, String Password, int Age, String PN, String Email, String Position, String Gender) {
        super(Fullname, ID, Password, Age, PN, Email, Position, Gender);
        this.shift = shift;
    }

        

        public String getShift() {
            return shift;
        }

        public void setShift(String shift) {
            this.shift = shift;
        }
        
    }
class deliveryStaff extends staff{
        private String Assignedtransport;

    public deliveryStaff(String Assignedtransport) {
        this.Assignedtransport = Assignedtransport;
    }

    public deliveryStaff(String Assignedtransport, String Fullname, int ID, String Password, int Age, String PN, String Email, String Position, String Gender) {
        super(Fullname, ID, Password, Age, PN, Email, Position, Gender);
        this.Assignedtransport = Assignedtransport;
    }

        
       

        public String getAssignedtransport() {
            return Assignedtransport;
        }

        public void setAssignedtransport(String Assignedtransport) {
            this.Assignedtransport = Assignedtransport;
        }
        
    }

  
