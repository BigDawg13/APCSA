package LinearStructures;
public class IntVector {

    private final static int INITIAL_CAPACITY = 10;
    private int[] arr = new int[INITIAL_CAPACITY];
    private int size = 0;

    // default constructor
    public IntVector() { }

    // overloaded constructor
    public IntVector(int capacity) {
        if(capacity < 0) {
            throw new IllegalArgumentException();
        }
        arr = new int[capacity];
    }

    // the size function, returns the size
    public int size() { return size; }

    private void testBounds(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void tryResize() {
        if(size >= arr.length - 1) { // We've reached the end of the array
        // make a new temp array that's bigger than the origional
            int[] temp = new int[1 + arr.length * 2];
        // copy data into temp array
            for(int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
        // set old array = new temp array
            arr = temp;
        }
    }

    // CRUD = Create, read, update, delete
    public int get(int index) {
        testBounds(index);
        return arr[index];
    }

    // insert the valie 'n' at the end of the vector
    public void add(int n) {
        tryResize(); // guarantee capacity first
        arr[size++] = n;
    }

    public void clear() {
        arr = new int[INITIAL_CAPACITY];
        size = 0;
    }

    public void set(int index, int value) {
        testBounds(index);
        arr[index] = value;
    }

    /*
     * sets the element at 'index' equal to 'value'
     * returns true if the value was successfully inserted, false otherwise
     * @param index The position in whihch the value will in inserted
     * @param value The numerical value to be added
     */

    public boolean add(int index, int value) {
        testBounds(index);
        tryResize();
        for(int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        size++;
        return true;
    }


    /*
     * Removes the first instance of 'value' found in the list
     * returns 'true' if the value was removed from the list, 'false' otherwise
     * the list remains unchanged if the values does not exist in the list
     * @param value The value to be removed if it exists
     */
    public boolean remove(int value) {
        boolean found = false;
        for(int i = 0; i < size - 1; i++) {
            if(arr[i] == value || found) {
                found = true;
                arr[i] = arr[i + 1];
            }
        }
        if(found) size--;
        return found;
    }

    @Override
    public String toString() {
        if(size == 0) return "[]";
        String t = "[" + arr[0];
        for(int i = 1; i < size; i++) {
            t += ", " + arr[i];
        }
        return t + "]";
    }

}