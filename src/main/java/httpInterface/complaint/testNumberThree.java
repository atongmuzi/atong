package httpInterface.complaint;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testNumberThree {
    public static void main(String[] args) {
        double[] dbe = new double[]{1,2,3,4,5,6,7,8,9,0};
        List<Item[]> items = fourSum(dbe, 16);
        items.forEach(item -> {
            System.out.println(Arrays.toString(item));
        });
    }

    public static List<Item[]> fourSum(double[] arr, double sum)
    {
        List<Item[]> list = new ArrayList<>();
        for (int i = 1; i <= arr.length; ++i) {
            Item[] x = fourSum(arr, i, sum);
            if (x.length > 0)
                list.add(x);
        }
        return list;
    }

    public static Item[] fourSum(double[] arr, int count, double sum)
    {
        for (int i = 0; i < arr.length; ++i) {
            if (count == 1) {
                if (Math.abs(arr[i] - sum) <= 0.000001) {
                    return new Item[]{new Item(i, arr[i])};
                }
                else {
                    return new Item[0];
                }
            }
            Item[] x = fourSum(arr, count - 1, sum - arr[i]);
            if (x.length > 0) {
                int finalI = i;
                if (Arrays.stream(x).anyMatch(o -> o.index == finalI))
                    continue;
                Item[] result = Arrays.copyOf(x, x.length + 1);
                result[result.length - 1] = new Item(i, arr[i]);
                return result;
            }
        }
        return new Item[0];
    }
    @Data
    public static class Item {
        public Item(int index, double value) {
            this.index = index;
            this.value = value;
        }

        private int index;
        private double value;
    }
}
