import LinearStructures.ArrayList;

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
    }
}