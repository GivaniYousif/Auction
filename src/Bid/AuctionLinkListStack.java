/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bid;

import java.util.LinkedList;

/**
 *
 * @author givani.yousif
 */
public class AuctionLinkListStack implements StackInterface {
    private LinkedList theStack;

    public AuctionLinkListStack() {
        theStack = new LinkedList();
    }

    @Override
    public int size() {
        return theStack.size();
    }

    @Override
    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    @Override
    public void push(Object e) {
        theStack.addFirst(e);
    }

    @Override
    public Object top() {
        return theStack.getFirst();
    }

    @Override
    public Object pop() {
        return theStack.removeFirst();
    }
    
    
    
    
    
    
} // end class
