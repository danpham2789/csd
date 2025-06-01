/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        Array arr = new Array();
        arr.insertFirst(new Planet("Mercury", 0.383, 0.06, 0.39, 0.24));
        arr.insertFirst(new Planet("Venus", 0.949, 0.81, 0.72, 0.62));
        arr.insertFirst(new Planet("Earth", 1.000, 1.00, 1.00, 1.00));
        arr.insertFirst(new Planet("Mars", 0.532, 0.11, 1.52, 1.88));
        arr.insertLast(new Planet("Uranus", 4.007, 14.54, 19.19, 84.02));
        arr.insertLast(new Planet("Neptune", 3.883, 17.15, 30.07, 164.79));
        arr.insertAny(4, new Planet("Jupiter", 11.209, 317.83, 5.20, 11.86));
        arr.insertAny(5, new Planet("Saturn", 9.449, 95.16, 9.54, 29.45));
        arr.display();
        
        System.out.println("================================");
        System.out.println("After sort:");
        arr.sort();
        arr.display();
        
        System.out.println("================================");
        System.out.println("Enter name want to search: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Information about the target:");
        System.out.println(arr.arr[arr.findByName(name)]);
        
        
        System.out.println("================================");
        System.out.println("After delete:");
        arr.removeByIndex(3);
        arr.removeByName("Venus");
        arr.removeFirst();
        arr.removeLast();
        arr.display();
    }
}

/*
Pros:
- The addLast and addFirst operations execute in constant time, O(1), ensuring very fast insertions at both ends.
- The sort method, implemented using Quick sort, operates efficiently with an average complexity of O(log n).

Cons:
- The removeFirst operation requires O(n) time, which can be inefficient.
- The addIndex and removeIndex operations take O(n – x) time (where x is the index), 
making them less efficient especially for lower indices.
- The find operation has a worst-case time complexity of O(n).
*/
