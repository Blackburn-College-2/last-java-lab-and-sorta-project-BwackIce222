/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liststacktemplate;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;




/**
 *
 * @author Paul
 * @param <T>
 */
public class MyList<T> {
private List myList = new LinkedList();
private ListNode first;
private ListNode last;
private Stack myStack = new Stack();
    /**
     * get the ith element stored in the list. Note that this does not return
     * the containing node, but the stored element in the node. Null if D.N.E.
     *
     * @param i
     * @return
     */
    public T get(int i) {
  return (T)myList.get(i);
      
    }

    /**
     * Add an element to the end of the list.
     *
     * @param v the element to insert.
     * @return the modified list object
     */
    public MyList<T> add(T v) {
        if(myList.isEmpty()){
            last = new ListNode(v);
        }
        myList.add(v);
        return this;
    }

    /**
     * removes an element (node) at the index specified.
     *
     * @param i
     * @return the element which was removed. null if invalid index.
     */
    public T removeAtIndex(int i) {
        /*
        Be careful here! think about edge cases. If you choose to keep a
        'last' pointer, what if the element being removed is last?
         */
        if(i==myList.size()){
        last = new ListNode((T)myList.get(i));
        }else{
        myList.remove(i);   
    }
        return (T) this;
    }
    /**
     * returns the index of the element given. -1 if not found.
     *
     * @param v The element to look for.
     * @return the index or -1 if not found.
     */
    public int indexOf(T v) {
       return myList.lastIndexOf(v);
    }

    /**
     * removes the first occurrence of given element. Does nothing if the
     * element is not present in the list.
     *
     * @param v the element to remove
     * @return the modified list to allow chaining i.e.
     * ls.remove(3).remove(4)...
     */
    public MyList<T> remove(T v) {
       myList.remove(v);
       return this;
    }

    /**
     * calculates and returns the size/length of the list.
     *
     * @return the length/size.
     */
    public int size() {
       return myList.size();
    }

    /**
     * Answers if there are any elements in the list.
     *
     * @return true if list contains at least 1 element, false otherwise.
     */
    public boolean isEmpty() {
      return !myList.isEmpty();
    }

    /**
     * A pretty toString for lists.
     *
     * @return MyList: [elem1, elem2, elem3...]
     */
    @Override
    public String toString() {
        String r = "";
        Iterator link = myList.iterator();
        for(int i =0; i<myList.size();i++){
            r+= myList.get(i)+"\t";
        }
          
        return "MyList: "+r;
    }

}
