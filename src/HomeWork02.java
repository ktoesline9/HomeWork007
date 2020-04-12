import java.util.Arrays;

public class HomeWork02 {
    public static void main(String[] args) {

        //Task 1
        int[] arr = {0, 1, 0, 1, 1, 0, 1, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] += 1;

            } else arr[i] -= 1;
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        //Task 2

        int[] emptyArray = new int[8];

        for (int i = 0; i < emptyArray.length; i++) {

            emptyArray[i] = i * 3;
            System.out.print(emptyArray[i] + "  ");
        }

        System.out.println();

        //Task 3

        int[] specificValuesNumber = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(specificValuesNumber));
        for (int i = 0; i < specificValuesNumber.length; i++) {
            if (specificValuesNumber[i] / 6 > 0) {
                specificValuesNumber[i] *= 2;
            }
            System.out.print(specificValuesNumber[i] + "  ");

        }
        System.out.println();
        //task 3
        int x = 10;
        int[][] doubleArray = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j) {
                    doubleArray[i][j] = 1;

                }
                System.out.print(doubleArray[i][j] + " ");


            }
            System.out.println();

        }


        int[] maxValueArr = {5, 3, 8, 1, 9, 5, 7, 14, 6};
        int maxValue = maxValueArr[0];
        int minValue = maxValueArr [0];

        for (int i = 0; i < maxValueArr.length; i++) {
            if (maxValueArr[i] -maxValue <0){
                i = maxValue;

            }

        }
        System.out.println(maxValue);
    }

}

