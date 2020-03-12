package httpInterface.complaint;

import lombok.Data;

import java.util.Arrays;

public class testNumberTwo {
    public static void main(String[] args) {
        double[] dbe = new double[]{90.14,83.16,89.22,92,88.46,77.1,85.44,92.88,86.26,77.86,46.04,83.7,76.68,76.28,78.76,83.94,71.94,86.16,72.38};
        System.out.println(Arrays.toString(fourSum(dbe, 356.96)));
    }

    public static Item[] fourSum(double[] arr, double sum)
    {
        for (int i = 1; i <= arr.length; ++i) {
            Item[] x = fourSum(arr, i, sum);
            if (x.length > 0)
                return x;
        }
        return new Item[0];
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
