import LinearStructures.ArrayList;
import java.util.LinkedList;

public class Start {
    public static void main(String args[]) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();

        strings.add("Cat");
        strings.add("Dog");
        strings.add("Mouse");

        nums.add(1);
        nums.add(3);
        nums.add(4);

        System.out.println(strings);
        System.out.println(nums);

        for(String s : strings) {
            System.out.println(s);
        }
    }
}