/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;
import jdk.internal.util.xml.impl.Input;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and add object oriented principles satisfy as comment in the code
 * @author sivagamasrinivasan
 * date 02/19
 */
public class ArithmeticBase 
{
    private double x;
    private double y;
    double calculate(double x, double y) 
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter String");
        //String s= sc.next();
        public enum Input{PLUS,MINUS,TIMES,DIVIDE};
        private Input input;

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the input
     */
    public Input getInput() {
        return input;
    }

    /**
     * @param input the input to set
     */
    public void setInput(Input input) {
        this.input = input;
    }
        
        switch (input.toUpperCase()) 
        {
            case "PLUS":
                return x + y;
            case "MINUS":
                return x - y;
            case "TIMES":
                return x * y;
            case "DIVIDE":
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
}
   
}
