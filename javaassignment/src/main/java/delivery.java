
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class delivery {
    private int ID;
    private String AssignedDateOut;
    private String Status;
    private String Address;
    public delivery(){}
    public delivery(int ID, String AssignedDateOut, String Status, String Address) {
        this.ID = ID;
        this.AssignedDateOut = AssignedDateOut;
        this.Status = Status;
        this.Address = Address;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAssignedDateOut() {
        return AssignedDateOut;
    }

    public void setAssignedDateOut(String AssignedDateOut) {
        this.AssignedDateOut = AssignedDateOut;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    public String toString(){
        return(ID+","+AssignedDateOut+","+ Status+","+ Address);
    }
}
