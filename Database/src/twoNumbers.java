/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timoo
 */

 import java.util.Scanner;
public class twoNumbers {
   




    public static void main(String args[])
    {
        int a, b, big;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Two Number : ");
        a = scan.nextInt();
        b = scan.nextInt();
		
        if(a>b)
        {
            big = a;
        }
        else
        {
            big = b;
        }
		
        System.out.print("Largest of Two Number is " +big);
    }
}

