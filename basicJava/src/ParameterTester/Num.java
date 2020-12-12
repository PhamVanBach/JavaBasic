/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParameterTester;

/**
 *
 * @author bachp
 */
public class Num {
    private int value;
    public Num(int update){
        value = update;
    }
    public void setValue(int update){
        value = update;
    }
    public String toString(){
        return value + "";
    }
}
