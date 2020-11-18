
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
    private LocalDate AssignedDateOut;
    private String Status;
    public delivery(){}
    public delivery(int ID, LocalDate AssignedDateOut, String Status) {
        this.ID = ID;
        this.AssignedDateOut = AssignedDateOut;
        this.Status = Status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDate getAssignedDateOut() {
        return AssignedDateOut;
    }

    public void setAssignedDateOut(LocalDate AssignedDateOut) {
        this.AssignedDateOut = AssignedDateOut;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
}
