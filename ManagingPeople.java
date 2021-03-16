/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagingPeople;

/**
 *
 * @author AUDY
 */
public class ManagingPeople {

    public static void main(String[] args) {
         Person p1 = new Person("arial", 27);
        Person p2 = new Person("Ramdan", 30);
        
        if (p1.getAge() == p2.getAge()) {
                System.out.println(p1.getName()+ "is the same age as" +p2.getName());
        }else{
            System.out.println(p1.getName()+ "is NOT the same age as" +p2.getName());
        }

    
    }
    
}

public class person {
    
    String getName;
    int getAge;

    Person(String getName, int getAge){
        this.getName = getName;
        this.getAge = getAge;
    }
    
    public int getAge() {
        return getAge;
    }
        
    
    
}
