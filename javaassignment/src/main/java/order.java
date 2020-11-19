
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
    private double Price;
    private delivery delivery;
    public order(){}
    public order(int ID, String Owner, double Weight, LocalDate Datein, String Status, double Price, int ID2, LocalDate AssignedDateOut, String Status2, String Address) {
        this.ID = ID;
        this.Owner = Owner;
        this.Weight = Weight;
        this.Datein = Datein;
        this.Status = Status;
        this.ID=ID;
        this.Price=Price;
        this.delivery = new delivery(ID2, AssignedDateOut, Status2, Address);
    }
    
    ////
    public int getID2(){
        return delivery.getID();
    }
    /////

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(delivery delivery) {
        this.delivery = delivery;
    }
    
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
