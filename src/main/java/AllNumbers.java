import java.util.ArrayList;

public class AllNumbers {
    public static ArrayList<Integer> allNumbers() {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1;i<=75;i++){
            nums.add(i);
        }

        return nums;
    }
}
