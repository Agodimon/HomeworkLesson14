

import java.util.Arrays;

public class Main {

    public boolean getCheckElemOfArr(int[] array) {
        boolean allCheck=false, s=false, t =true;
        int u=array[0];
        for (int j : array) {
            if (u!=j) s=true;
            //noinspection StatementWithEmptyBody
            if (j == 1 || j == 4){}else t =false;
        }
        if (t && s) allCheck=true;

        return allCheck;
    }

    public int[] pullOutElemOfArr(int[] arraysInt) throws RuntimeException {
        if (findElemInArr(arraysInt)){
            for (int j = arraysInt.length - 1; j >= 0; j--) {
                if (arraysInt[j] == 4) {
                    arraysInt = Arrays.copyOfRange(arraysInt, (j + 1), arraysInt.length);
                    break;
                }
            }
        }else {throw new RuntimeException("В массиве нет четвёрок");}
        return arraysInt;
    }

    public boolean findElemInArr(int[] arr) {
        for (int j : arr) if (j == 4) return true;
        return false;
    }
}


