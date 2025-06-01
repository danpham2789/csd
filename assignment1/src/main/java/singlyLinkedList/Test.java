/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singlyLinkedList;

public class Test {

    public static void main(String[] args) {
        SolarSystemps list = new SolarSystemps();

        list.insertObjectFirst("Mercury", 4879, 3.285E23, 0.39, 0.24);
        list.insertObjectFirst("Venus", 12104, 4.867E24, 0.72, 0.62);
        list.insertObjectFirst("Earth", 12742, 5.972E24, 1.00, 1.00);
        list.insertObjectFirst("Mars", 6779, 6.39E23, 1.52, 1.88);
        list.insertObjectFirst("Jupiter", 139820, 1.898E27, 5.20, 11.86);
        list.insertObjectFirst("Saturn", 116460, 5.683E26, 9.58, 29.45);
        list.insertObjectFirst("Uranus", 50724, 8.681E25, 19.19, 84.02);
        list.insertObjectFirst("Neptune", 49244, 1.024E26, 30.07, 164.79);

        System.out.println("List objects:");
        list.displayObjects();
        
        System.out.println();
        
//        String Name = "Mars";
//        SolarSystemps.SolarObject result = list.findObject(Name);
//        if (result != null) {
//            System.out.println("Found: " + result.Name + " - Mass: " + result.Mass + " kg - Diameter: " + result.EuatorialDiameters + " km - Orbital Period: " + result.OrbitalPeriod + " AU - Semi Major Axis: " + result.SemiMajorAxis + " Julian Years");
//        } else {
//            System.out.println("Not found");
//        }

//        boolean delete = list.deleteObject(Name);
//        if (delete) {
//            System.out.println(Name + " has delete");
//        } else {
//            System.out.println("Not found to delete");
//        }

//
//        list.sortObject();
//        System.out.println("\n List After sort:");
//        list.displayObjects();
//        System.out.println();
//        list.insertObjectLast("Mars", 6779, 6.39E23, 1.52, 1.88);

//        list.deleteFirst();
//        System.out.println();
        list.deleteLast();
        
        list.displayObjects();
        
        
    }
}
/*
Ưu điểm: về phần thêm hoặc xóa thì nó sẽ nhanh hơn so với arraylist vì ta chỉ cần thay đổi vị trí của con trỏ là được chứ không cần phải dời cả một đoạn như bên arraylist
Code đơn giản dễ hiểu và dễ linh động giữa singly và double linked list
Nhược điểm là:không thể truy cập ngầu nhiên mà phải bắt đầu từ vị trí 0
*/
