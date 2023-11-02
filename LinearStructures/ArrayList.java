package LinearStructures;

public class ArrayList<E> { // Parameter ex. ArrayList<E>
    // what is protected
    // protected is... public in the packege, private outside the package
    protected final static int INITIAL_CAPACITY = 10;

    private int size = 0;

    @SuppressWarnings("unchecked") // java annotation
    private E[] data = (E[])new Object[INITIAL_CAPACITY];

    public ArrayList() { } // default constructor

    public ArrayList(E[] objects) {
        for(int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        if(size >= data.length) {
            E[] newData = (E[])new Object[size * 2 + 1];
            // manually loop through and copt the old to the new
            System.arraycopy(data, 0, newData, 0, size); // system version to manually copy over the data
            data = newData;
        }
    }
    public void add(E e) {
        add(size, e);
    }

    public void add(int index, E e) {
        ensureCapacity();

        for(int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i]; // right shift
        }
        data[index] = e; // insert
        size++;
    }

    @Override
    public String toString() {
        if(size == 0) return "[]";
        String t = "[" + data[0];
        for(int i = 1; i < size; i++) {
            t += ", " + data[i];
        }
        return t + "]";
    }

    // TODO: bring over the toString method from IntVector
    // test this ArrayList class' add functions in Main
    // Push to github
}
