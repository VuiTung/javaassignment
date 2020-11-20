public class feedbackreply {
    private int ID;
    private String Content;
    public feedbackreply(){}
    public feedbackreply(int ID, String Content) {
        this.ID = ID;
        this.Content = Content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }
    
    public String toString(){
    return (ID+","+Content);
}
}
