package datastructures;

import datastructures.doublylinkedly.DoublyLinkedList;
import datastructures.hashtable.HashTable;
import datastructures.linkedlist.LinkedList;
import datastructures.recursion.Recursion;
import datastructures.sort.Sort;
import datastructures.stack.Stack;
import datastructures.trees.BinarySearchTrees;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
 public static void printItem(int n){
     for(int i=0; i<n; i++) {
         for (int j = 0; j < n; j++) {
             System.out.println(i + "" + j);
         }
     }
 }
public static int addItem(int n){
     return n + n + n;
}

public static void differentItem(int a, int b){
     for(int i=0; i<a; i++){
         for(int j=0; j<b; j++){
             System.out.println(i +" " +j);

         }

     }
}
    public static void main(String[] args){


     int [] array = {1,5,7,3,89,2,6};

     Sort.bubleSort(array);
        System.out.println(Arrays.toString(array));



       /* int fact = Recursion.factorial(4);
        System.out.println("result "+fact);


        */
     /*Recursion rc = new Recursion();

        System.out.println(rc.factorial(4));

      */

        /*HashTable myHashTable = new HashTable();
        myHashTable.set("tile" , 100);
        myHashTable.set("hello" , 500);
        myHashTable.set("hi" , 34);
        myHashTable.set("nails" , 200);
        //System.out.println(myHashTable.hash("lumber"));
        myHashTable.printTable();

         */

    // BinarySearchTrees myBST = new BinarySearchTrees();


       // System.out.println("My Root " + myBST.root);
     /* Stack myStack = new Stack(1);
        myStack.printStack();
        myStack.getTop();
        myStack.getHeight();
        */


       /*
        DoublyLinkedList myDLL = new DoublyLinkedList(3);
        myDLL.appendList(4);
        myDLL.appendList(4);
        myDLL.setNode(2,8);
        System.out.println(myDLL.getNode(2));
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        myDLL.printList();
        */

       // LinkedList linkedlist = new LinkedList(4);
       // linkedlist.appendList(5);
        //linkedlist.appendList(3);
       // linkedlist.removeList(2);
        //System.out.println( "get Node index "+ linkedlist.getNode(2));
        //linkedlist.removeFirstList();
        //System.out.println(linkedlist.removeLast() );
        //System.out.println(linkedlist.removeLast() );
        //System.out.println(linkedlist.removeLast() );
        //linkedlist.removeLast();
       // linkedlist.removeLast();
        //linkedlist.getHead();
        //linkedlist.getTail();
        //linkedlist.getLength();
       // linkedlist.printList();

        /*HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        HashMap<String,Integer> map3 = new HashMap<>();
        //map1.put("value",1);
        //map2 = map1;
        //map1.put("value",22);
        map3.put("value",33);
        map2=map3;
        map1=map3;
        Cookie ck = new Cookie("blue");
        ck.setColor("black");
        printItem(10);
        System.out.println("test addItem " + addItem(5));
        differentItem(5,5);
        System.out.println("color cookie " + ck.getColor());
        System.out.println("Map1 " +map1);
        System.out.println("Map2 " +map2);*/
    }
}
