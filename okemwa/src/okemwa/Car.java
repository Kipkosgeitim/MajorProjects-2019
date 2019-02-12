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
public class Car {
    String numberplate;
    double speed=0.0;
    double maxSpeed;
    String year= "2009";
    String make= "bmw";
    void accelarate(){
        this.speed=this.maxSpeed;
    }
    void brake(){
        this.speed= this.maxSpeed-5;
    }

}
