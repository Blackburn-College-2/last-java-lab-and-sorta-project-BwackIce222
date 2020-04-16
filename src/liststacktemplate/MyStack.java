/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liststacktemplate;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author Paul
 */
public class MyStack<T> {
    private Stack<T> stack = new Stack<>();
    MyList<T> arr = new MyList();

    /**
     * push an element onto the stack
     *
     * @param t the element to add to the stack
     * @return return the stack to allow chaining. i.e. stack.push(1).push(2)...
     */
    public MyStack<T> push(T t) {
     stack.addElement(t);
     return this;
    }

    /**
     * remove and return the top element from the stack. This method should
     * throw an exception of your own descriptive making when this method is
     * called on an empty stack.
     *
     * @return the top of the stack/removed element
     */
    public T pop() {
        if(stack.isEmpty()){
            System.out.println("I am empty");
        }else{
            return stack.remove(stack.size());
        }
       return (T) this;
    }

    /**
     * returns the top element on the stack, but does not remove it.
     *
     * @return the top element of the stack
     */
    public T peek() {
        return stack.get(stack.size());
    }

    /**
     * Answers whether or not the stack contains elements.
     *
     * @return true-contains elements; false otherwise.
     */
    public boolean isEmpty() {
        return !stack.isEmpty();
    }

    /**
     * returns how many elements are in the stack.
     *
     * @return
     */
    public int size() {
       return stack.size();
    }

    /**
     * Custom toString which prints the stack... as a stack. (See example test
     * case from lab.
     *
     * @return
     */
    @Override
    public String toString() {
        return Arrays.toString(stack.toArray());
    }
}
