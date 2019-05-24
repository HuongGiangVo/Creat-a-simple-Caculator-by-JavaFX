/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorfx;

/**
 *
 * @author Pham
 */
public class Model {
    public float calculate(long number1, long number2, String operator){
        switch(operator){
            case "+":
                return number1+number2;
            case "-":
                return number1-number2;
            case "*":
                return number1*number2;
            case "/":
                if(number2==0){
                    return 0;
                }
                return number1/number2;
            default:
                return 0;
        }
    }
}
