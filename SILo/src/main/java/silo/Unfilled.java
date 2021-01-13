/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

/**
 *
 * @author Mystery-PC
 */
public class Unfilled extends FormState {
    public Unfilled(ItemForm context) {
        this.context = context;
    }
    
    public void formFilled() {
        context.changeState(new Filled(context));
    }
}
