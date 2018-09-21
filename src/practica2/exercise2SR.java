
package practica2;

public class exercise2SR {
    
    private int IDR;
    private String DescR;
    private String Group;
    
    public exercise2SR (){
        
    }
    
    public void Assign (int ID, String Desc){
        this.IDR = ID;
        this.DescR = Desc;
        Group = "Service Desk";
    }

    public int getIDR() {
        return IDR;
    }

    public String getDescR() {
        return DescR;
    }

    public String getGroup() {
        return Group;
    }

    public void setIDR(int IDR) {
        this.IDR = IDR;
    }

    public void setDescR(String DescR) {
        this.DescR = DescR;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }
    
}
