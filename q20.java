public class Student{
    private String name;
    private int ID;
    private boolean isRegistered;
    public Student(String name, int ID, boolean isRegistered){
        this.name = name;
        this.ID = ID;
        this.isRegistered = isRegistered;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return ID;
    }
    public boolean getRegistered(){
        return isRegistered;
    }
    public void setRegistered(boolean isRegistered){
        this.isRegistered = isRegistered;
    }

    public String toString(){
        return "Name: " + name + "\nID: " + ID + "\nRegistered: " + isRegistered;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setID(int ID){
        this.ID = ID;
    }
}