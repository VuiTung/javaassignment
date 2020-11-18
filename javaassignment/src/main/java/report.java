
public class report {
    private int ID;
    private String title;
    private String content;
    private int DeliverystaffID;
    
    public report(){}
    public report(int ID, String title, String content, int DeliverystaffID) {
        this.ID = ID;
        this.title = title;
        this.content = content;
        this.DeliverystaffID = DeliverystaffID;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDeliverystaffID() {
        return DeliverystaffID;
    }

    public void setDeliverystaffID(int DeliverystaffID) {
        this.DeliverystaffID = DeliverystaffID;
    }


}
