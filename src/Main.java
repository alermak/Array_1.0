public class Main {
    public static void main(String[] args) {
        int [] arr1 = new int [3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int a = 0; a < 3; a++) {
            if (a != 2) {
                System.out.print(arr1[a] + ", ");
            } else {
                System.out.print(arr1[a]);
            }
        }
    //
        System.out.print("\n");
    //
        float [] arr2 = {1.57f, 7.654f, 9.986f};
        for (int b = 0; b < 3; b++) {
            if (b != 2) {
                System.out.print(arr2[b] + ", ");
            } else {
                System.out.print(arr2[b]);
            }
        }
    //
        System.out.print("\n");
    //
        int [] arr3 = {10, 20, 30};
        for (int c = 0; c < 3; c++) {
            if (c != 2) {
                System.out.print(arr3[c] + ", ");
            } else {
                System.out.print(arr3[c]);
            }
        }
    //
        System.out.print("\n");
    //
        for (int a = 2; a >= 0; a--) {
            if (a != 0) {
                System.out.print(arr1[a] + ", ");
            } else {
                System.out.print(arr1[a]);
            }
        }
    //
        System.out.print("\n");
    //
        for (int b = 2; b >= 0; b--) {
            if (b != 0) {
                System.out.print(arr2[b] + ", ");
            } else {
                System.out.print(arr2[b]);
            }
        }
    //
        System.out.print("\n");
    //
        for (int c = 2; c >= 0; c--) {
            if (c != 0) {
                System.out.print(arr3[c] + ", ");
            } else {
                System.out.print(arr3[c]);
            }
        }
    //
        System.out.print("\n");
    //
        for (int a = 0; a < 3; a++) {
            if (arr1[a] % 2 != 0)
                arr1[a]++;
            if (a != 2) {
                System.out.print(arr1[a] + ", ");
            } else {
                System.out.print(arr1[a]);
            }
        }
    }

}