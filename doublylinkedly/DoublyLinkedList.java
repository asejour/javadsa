package datastructures.doublylinkedly;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    }

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void printList(){
        Node temp = head;
        while (temp !=null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void appendList(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
        }
        else {
            tail.next= newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        length++;
    }
    public Node removeLastList(){
        if(length==0) return null;
        Node temp = tail;
        if(length==1){
            head =null;
            tail =null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
            tail.prev = null;
        }
        length--;
        return temp;
    }
    public void prependList(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }
    public Node removeFirstList(){
        if(length==0) return  null;
        Node temp = head;
        if(length==1){
            head=null;
            tail=null;
        }
        else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;

    }
    public Node getNode(int index){
        if(index<0 || index>=length) return null;
        Node temp = head;
        if(index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }
        else{
            temp = tail;
            for (int i = length-1; i>index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }
    public boolean setNode(int index, int value){
        Node temp = getNode(index);
        if(temp !=null){
            temp.value = value;
            return true;
        }
        return false;
    }
    public boolean insertNode(int index, int value){
        if(index<0 || index>length) return false;
        if(index==0){
            prependList(value);
            return true;
        }
        if(index==length){
            appendList(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = getNode(index -1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node removeList(int index){
        if(index<0 || index>=length) return null;
        if (index==0) return removeFirstList();
        if (index==length-1) return  removeLastList();
        Node temp = getNode(index);
        temp.next.prev= temp.prev;
        temp.prev.next = temp.next;
        temp.next=null;
        temp.prev=null;
        length--;
        return temp;
    }
    public void getHead() {
        System.out.println("Head " + head.value);
    }
    public void getTail(){
        System.out.println("Tail " + tail.value);
    }
    public void getLength(){
        System.out.println("Length " + length);
    }
}
