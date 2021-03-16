/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author AUDY
 */
public class Person {
    String fName;
    String lName;
    int stuId;
    String stuStatus;
    
     public Person(String fName, String lName, int stuId, String stuStatus){
       this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
        
     }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getStuId() {
        return stuId;
    }

    public String getStuStatus() {
        return stuStatus;
    }
     

    public static void main(String[] args) {
       
        Person p1 = new Person ("laura", "rusydi", 41200599, "aktif");

        System.out.println (p1.getfName());
        System.out.println (p1.getlName());
        System.out.println (p1.getStuId());
        System.out.println (p1.getStuStatus());
        
    }
    
}
