
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
public class order {
    private int ID;
    private String Owner;
    private double Weight;
    private LocalDate Datein;
    private String Status;
    private delivery delivery;
    public order(){}
    public order(int ID, String Owner, double Weight, LocalDate Datein, String Status) {
        this.ID = ID;
        this.Owner = Owner;
        this.Weight = Weight;
        this.Datein = Datein;
        this.Status = Status;

    }
    public order(int ID, int ID2, LocalDate AssignedDateOut, String Status2){
        this.ID=ID;
        this.delivery = new delivery(ID2, AssignedDateOut, Status2);
    }
    ////
    public int getID2(){
        return delivery.getID();
    }
    /////
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public LocalDate getDatein() {
        return Datein;
    }

    public void setDatein(LocalDate Datein) {
        this.Datein = Datein;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
         
}
