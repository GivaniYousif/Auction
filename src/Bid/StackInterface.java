/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bid;

/**
 *
 * @author john.gerstenberg
 * Code taken from Goodrich Text page 229
 */
public interface StackInterface<E> {
    // An interface is a class with abstract methods that must be
    // implemented by any class that implements this interface (chapter 2)
    
    int size();
    
    boolean isEmpty();
    
    // adds an item to the stack
    void push(E e);
    
    // return but not remove the top item on the stack
    E top();
    
    // remove item at the top of the stack
    E pop();  
}
