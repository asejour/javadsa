package datastructures.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    class Node{
         int value;
         Node next;
        Node(int value){
            this.value=value;
        }

    }
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length =1;
    }

    public void printList(){
        Node temp = head;
        while (temp !=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void appendList(int value){
        Node newNode = new Node(value);
        if(length==0){
            head= newNode;
            tail = newNode;
        }
        else{

            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public Node removeLast(){
        if(length==0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next !=null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length==0){
            head=null;
            tail = null;
        }
    return temp;
    }

    public void prependList(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;

        }
        length++;
    }
    public Node removeFirstList(){
        if(length==0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length==0){
            tail=null;
        }
        return temp;
    }
    public Node getNode(int index){
        if(index<0 || index>=length) return null;
        Node temp = head;
        for(int i=0; i<index; i++)
        {
            temp = temp.next;
        }
        return temp;
    }
    public boolean insertList(int index, int value){
        if(index<0 || index>length)return false;
        if(index==0){
            prependList(index);
            return true;
        }
        if(index==length){
            appendList(index);
            return true;
        }
        Node newNode = new Node (value);
        Node temp = getNode(index -1);
        temp.next = newNode.next;
        temp.next = newNode;
        length++;
        return true;

    }
    public boolean setList(int index, int value){
        Node temp = getNode(index);
        if(temp !=null){
            temp.value = value;
            return true;
        }
        return false;
    }
    public Node removeList(int index){
        if(index<0 || index>=length) return null;
     if(index==0) return removeFirstList();
     if(index==length -1) return removeLast();
     Node prev = getNode(index -1);
     Node temp = prev.next;
     prev.next = temp.next;
     temp.next = null;
     length--;
     return temp;
    }
    public void reverseList(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i=0; i<length; i++){
            after = temp.next;
            temp.next=before;
            before = temp;
            temp = after;

        }
    }
    public void getHead(){
        System.out.println("Head " + head.value);
    }
    public void getTail(){
        System.out.println("Tail " + tail.value);
    }
    public void getLength(){
        System.out.println("Length "+ length);
    }
}
