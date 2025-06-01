package array;


public class Array {
    int length;
    int capacity;
    Planet arr[];

    public Array(int capacity) {
        arr = new Planet[capacity];
        this.capacity = capacity;
        length = 0;
    }
    
    public Array(){
        this(5);
    }
    
    Boolean isEmpty(){
        return length == 0;
    }
    
    Boolean isFull(){
        return length == capacity;
    }
    
    void increaseSize(){
        int newCapacity = (int)(this.capacity*1.5);
        Planet newArr[] = new Planet[newCapacity];
        for (int i = 0; i < length; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
        capacity = newCapacity;
    }
    
    void insertLast(Planet p){
        if (isFull() == true)  increaseSize();
        arr[length] = p;
        length++;
    }
    
    void insertFirst(Planet p) {
        if (isFull()) increaseSize();
        for (int i = length; i >= 1; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = p;
        length++;
    }
    
    void insertAny(int index, Planet p){
        if (index < 0 || index > length) {
            System.out.println("Out of index");
            return;
        }
        if (isFull()) increaseSize();
        for (int i = length; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = p;
        length++;
    }
    
    void removeLast(){
        arr[length--] = null;
    }
    
    void removeFirst(){
        for (int i = 1; i < length; i++){
            arr[i-1] = arr[i];
        }
        removeLast();
    }
    
    void removeByIndex(int index){
        for (int i = index + 1; i < length; i++){
            arr[i-1] = arr[i];
        }
        removeLast();
    }
    
    void removeByName(String removeName){
        int index = findByName(removeName);
        if (index != -1) removeByIndex(index);
        else System.out.println("Invalid name");
    }
    
    int findByName(String findName){
        for (int i = 0; i < length; i++){
            if (arr[i].name.equals(findName)) return i;
        }
        return -1;
    }
    
    int partition(int left, int right){
        double pivot = arr[right].equatorialDiameter;
        int j = left;
        
        for (int i = left; i < right; i++ ){
            if (arr[i].equatorialDiameter < pivot){
                Planet temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        
        Planet temp = arr[j];
        arr[j] = arr[right];
        arr[right] = temp;
        
        return j;
    }
    
    void qSort(int left, int right) {
        if (left > right) return;
        int pivot = partition(left, right);
        qSort(left, pivot - 1);
        qSort(pivot + 1, right);
        
    }
    
    void sort(){
        qSort(0, length - 1);
    }
    
    void display(){
        for (int i = 0; i < length; i++){
            System.out.println(arr[i]);
        }
    }
}
