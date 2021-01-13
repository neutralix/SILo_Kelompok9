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
public class Filled extends FormState {
    public Filled(ItemForm context) {
        this.context = context;
    }
    
    public void formEmpty() {
        context.changeState(new Unfilled(context));
    }
}
