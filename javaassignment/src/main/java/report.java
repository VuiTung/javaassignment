
public class report {
    private int ID;
    private String title;
    private String content;

    
    public report(){}
    public report(int ID, String title, String content) {
        this.ID = ID;
        this.title = title;
        this.content = content;
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
     public String toString(){
         return (ID+","+title+","+content);
     }

}
