
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arraysInt = {1, 2, 3, 6, 8, 7, 5, 8, 6, 9, 2, 5, 8, 4, 5, 5, 8, 7, 5};
        System.out.println(pullOutElemOfArr(arraysInt));

        int[] array={4,4,1,};
        System.out.println(getCheckElemOfArr(array));
    }

    private static boolean getCheckElemOfArr(int[] array) {
        boolean allCheck=false, s=false, t =true;
        int u=array[0];
        for (int j : array) {
            if (u!=j) s=true;
            if (j == 1 || j == 4){}else t =false;
        }
        if (t && s) allCheck=true;

        return allCheck;
    }


    private static String pullOutElemOfArr(int[] arraysInt) throws RuntimeException {
        if (findElemInArr(arraysInt)){
            for (int j = arraysInt.length - 1; j >= 0; j--) {
                if (arraysInt[j] == 4) {
                    arraysInt = Arrays.copyOfRange(arraysInt, (j + 1), arraysInt.length);
                    break;
                }
            }
        }else {throw new RuntimeException("В массиве нет четвёрок");}
        return Arrays.toString(arraysInt);
    }

    private static boolean findElemInArr(int[] arr) {
        for (int j : arr) if (j == 4) return true;
        return false;
    }
}


