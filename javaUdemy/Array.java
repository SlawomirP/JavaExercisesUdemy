package five.Bonu;

public class Array {
    private int [] array;


    public Array(int[] ar) {
        this.array = ar;
    }

    public int add() {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public int avg() {
        int avg = add() / array.length;
        return avg;
    }


    public int minVal() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }


    public int maxVal() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }


}
