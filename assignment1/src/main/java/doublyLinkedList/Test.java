/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublyLinkedList;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Test {

    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dList = new DoublyLinkedList();
        dList.addFirst(new Planet("Mercury", 0.383, 0.06, 0.39, 0.24));
        dList.addFirst(new Planet("Venus", 0.949, 0.81, 0.72, 0.62));
        dList.addFirst(new Planet("Earth", 1.000, 1.00, 1.00, 1.00));
        dList.addFirst(new Planet("Mars", 0.532, 0.11, 1.52, 1.88));
        dList.addLast(new Planet("Jupiter", 11.209, 317.83, 5.20, 11.86));
        dList.addLast(new Planet("Saturn", 9.449, 95.16, 9.54, 29.45));
        dList.addLast(new Planet("Uranus", 4.007, 14.54, 19.19, 84.02));
        dList.addLast(new Planet("Neptune", 3.883, 17.15, 30.07, 164.79));
        System.out.println("List before sort:");
        dList.traversal();
        dList.backTraversal();
        System.out.println("List after sort by mass:");
        dList.sort();
        dList.traversal();
        dList.backTraversal();
        System.out.print("Input Planet you want to find:");
        String searchName = sc.nextLine();
        Planet found = dList.find(searchName);
        System.out.println("\nSearch" + searchName + ": " + (found != null ? found : "Can't find in your list"));

    }
}
