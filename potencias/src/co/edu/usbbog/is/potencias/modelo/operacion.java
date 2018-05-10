/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.potencias.modelo;

/**
 *
 * @author 204
 */
public class operacion {

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getRes() {
        return res;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public void setOpe(char ope) {
        this.ope = ope;
    }
    private double num1;
    private double num2;
    private double res;
    private char ope;
    public operacion(){
        this.num1 = 0.0;
        this.num2 = 0.0;
        this.res =  0.0;
        this.ope = 'w';
    }

    public char getOpe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
