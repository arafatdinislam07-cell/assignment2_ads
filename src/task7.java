import java.util.*;

public class task7 {

    public static List<Integer> topK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
                (a, b) -> map.get(a) - map.get(b)
        );

        for (int num : map.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        return new ArrayList<>(heap);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3, 3, 3};
        System.out.println(topK(nums, 2));
    }
}