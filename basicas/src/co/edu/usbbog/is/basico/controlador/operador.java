/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.basico.controlador;

import co.edu.usbbog.is.basico.modelo.operacion;

/**
 *
 * @author 204
 */
public class operador {
    
    public operacion operar(operacion o){
    if(o.getOpe()=='w'){
    return null;
    }else{
        switch(o.getOpe()){
                case '+':
                    o.setRes(sumar(o.getNum1(),o.getNum2()));
                    break;
                case '-':
                    o.setRes(restar(o.getNum1(),o.getNum2()));
                    break;
                case '*':
                    o.setRes(multiplicar(o.getNum1(),o.getNum2()));
                    break;
                default:
                    System.out.println("operacion no valida");
        }
    }
        return o;
    }
    private double sumar(double Num1, double Num2){
return Num1+Num2;
}
    private double restar(double Num1, double Num2){
return Num1-Num2;
}
    private double multiplicar(double Num1, double Num2){
return Num1*Num2;
}
}


