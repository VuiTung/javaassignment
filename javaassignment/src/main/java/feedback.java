public class feedback {
    
    private int ID;
    private String Title;
    private String Content;
    private String Status;
    private feedbackreply feedbackreply;
    public feedback(){}
    public feedback(int ID, String title, String Content, String Status) {
        this.ID = ID;
        this.Title = title;
        this.Content = Content;
        this.Status = Status;
    }
    public feedback(int ID, int ID2, String Content2){
    this.ID = ID;
    this.feedbackreply =new feedbackreply(ID2, Content2);
    }
    
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }



}
