/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author zacarij
 */
public class exercise2SR {
    
    private int IDR;
    private String DescR;
    private String Group;
    
    public exercise2SR (){
        IDR = 12233;
        DescR = "Test";
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
