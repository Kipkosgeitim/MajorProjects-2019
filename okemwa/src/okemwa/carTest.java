/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okemwa;

/**
 *
 * @author timoo
 */
public class carTest {
     public static void main(String args[]){
        Car myCar= new Car();
        myCar.numberplate="UAN 485E";
        myCar.speed=47.0;
        myCar.maxSpeed=180.0;
        
        System.out.print(myCar.numberplate);
        System.out.print("is moving at"+myCar.speed);
        System.out.print("kilometer per hour");
        System.out.println();
        
        myCar.accelarate();
        
        System.out.print(myCar.numberplate);
        System.out.print("is moving at"+myCar.speed);
        System.out.print("kilometer per hour");
        System.out.println();
        
        myCar.brake();
        
        System.out.print(myCar.numberplate);
        System.out.print("is moving at"+myCar.speed);
        System.out.print("kilometer per hour");
        System.out.println();
        
}
}
