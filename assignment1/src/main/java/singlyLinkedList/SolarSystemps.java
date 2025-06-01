package singlyLinkedList;

public class SolarSystemps {

    public class SolarObject {

        String Name;
        double EuatorialDiameters;//duong kinh xich dao
        double Mass;//khoi luong
        double SemiMajorAxis;//khoang cach tu hanh tinh den mat troi
        double OrbitalPeriod;// chu ky quy dao
        SolarObject next;

        public SolarObject(String Name, double EuatorialDiameters, double Mass, double SemiMajorAxis, double OrbitalPeriod) {
            this.Name = Name;
            this.EuatorialDiameters = EuatorialDiameters;
            this.Mass = Mass;
            this.SemiMajorAxis = SemiMajorAxis;
            this.OrbitalPeriod = OrbitalPeriod;
            this.next = null;
        }

    }
    SolarObject head, tail;

    public SolarSystemps() {
        this.head = null;
        this.tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void insertObjectFirst(String Name, double EuatorialDiameters, double Mass, double SemiMajorAxis, double OrbitalPeriod) {
        SolarObject newObject = new SolarObject(Name, EuatorialDiameters, Mass, SemiMajorAxis, OrbitalPeriod);
        if (isEmpty()) {
            head = tail = newObject;
        } else {
            newObject.next = head;
            head = newObject;
        }
    }

    public void insertObjectLast(String Name, double EquatorialDiameters, double Mass, double SemiMajorAxis, double OrbitalPeriod) {
        SolarObject newObject = new SolarObject(Name, EquatorialDiameters, Mass, SemiMajorAxis, OrbitalPeriod);
        if (isEmpty()) {
            head = tail = newObject;
        } else {
            SolarObject temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newObject;
        }
    }

    SolarObject findObject(String name) {
        SolarObject temp = head;
        if (isEmpty()) {
            System.out.println("No find object");
            return null;
        }
        while (temp != null) {
            if (temp.Name.equalsIgnoreCase(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    boolean deleteObject(String name) {
        if (isEmpty()) {
            System.out.println("No object to delete");
        }
        SolarObject tempObject = head;
        SolarObject prevObject = null;
        //co 1 hanh tinh
        if (tempObject != null && tempObject.Name.equals(name)) {
            head = tempObject.next;
        }
        //nhieu hanh tinh
        while (tempObject.next != null) {
            if (tempObject.Name.equalsIgnoreCase(name)) {
                prevObject.next = tempObject.next;
                System.out.println("DELETE" + name);
                return true;
            }
            prevObject = tempObject;
            tempObject = tempObject.next;
        }
        System.out.println("Not found to delete");
        return false;
    }

    SolarObject deleteFirst() {
        if (isEmpty()) {
            System.out.println("No thinh to delete");
            return null;
        }
        SolarObject temp = head;
        if (head.next == null) {
            head = null;
            return temp;
        }
        head = head.next;
        return temp;
    }

    SolarObject deleteLast() {
        if (isEmpty()) {
            System.out.println("no thing to delete");
            return null;
        }
        SolarObject temp = head;
        if (head.next == null) {
            head = null;
            tail = null;
            return temp;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        SolarObject delete = temp.next;
        temp.next = null;
        tail = temp;
        return delete;
    }

    void sortObject() {
        if (isEmpty() || head.next == null) {
            System.out.println("Can not sort");
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            SolarObject current = head;
            while (current.next != null) {
                if (current.Mass > current.next.Mass) {
                    swapped = true;
                    //name
                    String tempName = current.Name;
                    current.Name = current.next.Name;
                    current.next.Name = tempName;

                    // EuatorialDiameters
                    double tempDiameters = current.EuatorialDiameters;
                    current.EuatorialDiameters = current.next.EuatorialDiameters;
                    current.next.EuatorialDiameters = tempDiameters;

                    // mass
                    double tempMass = current.Mass;
                    current.Mass = current.next.Mass;
                    current.next.Mass = tempMass;

                    // SemiMajorAxis
                    double tempSemiMajorAxis = current.SemiMajorAxis;
                    current.SemiMajorAxis = current.next.SemiMajorAxis;
                    current.next.SemiMajorAxis = tempSemiMajorAxis;
                    
                    // OrbitalPeriod
                    double tempOrbitalPeriod = current.OrbitalPeriod;
                    current.OrbitalPeriod = current.next.OrbitalPeriod;
                    current.next.OrbitalPeriod = tempOrbitalPeriod;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void displayObjects() {
        SolarObject temp = head;
        while (temp != null) {
            System.out.println("Name: " + temp.Name + ", Mass: " + temp.Mass + " kg, Diameter: " + temp.EuatorialDiameters + " km, EuatorialDiameters: " + temp.OrbitalPeriod + " AU, Semi Major Axis: " + temp.SemiMajorAxis + " Julian Years");
            temp = temp.next;
        }
    }
}
