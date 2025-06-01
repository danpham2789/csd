/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublyLinkedList;

/**
 *
 * @author ADMIN
 */
public class DoublyLinkedList {

    class Node {

        Planet data;
        Node next, prev;

        public Node(Planet data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public Node(Planet x) {
            this(x, null, null);
        }
    }
    Node head, tail;

    public DoublyLinkedList() {
        head = tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Planet plant) {
        Node newNode = new Node(plant);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(Planet plant) {
        Node newNode = new Node(plant);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("This list is Empty!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("This list is Empty!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeData(Planet planet) {
        if (isEmpty()) {
            System.out.println("This list is Empty!");
        } if (head == tail) {
            if (head.data != planet) {
                System.out.println("Can't find the Data!");
            } else {
                head=tail=null;
            }
          return;
        } else {
            Node current = head;
            while (current.next != tail){
                if(current.next.data == planet){
                    current.next=current.next.next;
                    current.next.prev=current;
                }else {
                    current=current.next;
                }
            }
            if(current==tail) removeLast();
            if(current==head) removeFirst();
        }
    }
    
    public void sort(){
        if(isEmpty()) return;
        boolean swapped;
        Node temp;
       do{
           swapped=false;
           temp=head;
           while (temp.next!=null){
               if(temp.data.mass> temp.next.data.mass){
                   Planet swap = temp.data;
                   temp.data= temp.next.data;
                   temp.next.data=swap;
                   swapped=true;
               }
               temp=temp.next;
           }
       }while(swapped);
    }
    public Planet find(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.name.equalsIgnoreCase(name)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null; 
    }

    public void traversal(){
        Node current=head;
        while(current != null){
            System.out.println(current.data);
            current=current.next;
        }   
        System.out.println();
    }
    public void backTraversal(){
        Node current=tail;
        while(current != null){
            System.out.println(current.data);
            current=current.prev;
        }
        System.out.println();
    }  
}
