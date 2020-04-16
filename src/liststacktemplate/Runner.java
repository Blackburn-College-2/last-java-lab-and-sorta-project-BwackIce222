package liststacktemplate;


import liststacktemplate.MyList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyList<String> list = new MyList().add("a").add("b").add("c").add("d");
        System.out.println(list.toString());
        System.out.println("get index3: " + list.get(3));
        System.out.println("remove x: " + list.remove("x"));
        System.out.println("remove c: " + list.remove("c"));
        System.out.println(list);
        System.out.println("index of a: " + list.indexOf("a"));
        list.removeAtIndex(0);
        System.out.println("removed index 0: " + list);
        System.out.println(list.size());

        

    }
    //Estimated time 3hours, took 1.75 hours

}
