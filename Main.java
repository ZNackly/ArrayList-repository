import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(153);
        arr.add(53);
        arr.add(9);
        arr.add(1, 177);
        System.out.println(arr.size());
        System.out.println(arr.get(0));
        System.out.println(arr.set(3, 153));
        System.out.println(arr.remove(0));
        System.out.println(arr.indexOf(53));
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
