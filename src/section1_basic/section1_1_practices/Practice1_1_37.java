package algorithmPractice.src.section1_basic.section1_1_practices;

import java.util.Arrays;

public class Practice1_1_37 {
    public static void main(String[] args) {
        shuffleTest ( 4, 4 );
    }

    public static void shuffleTest(int M, int N) {
        int[] array = new int[M];
        int[][] array2D = new int[M][M];
        for ( int i = 0 ; i < N ; i++ ) {
            for ( int k = 0 ; k < M ; k++ ) {
                array[k] = k;
            }
            shuffle ( array );
            System.out.println ("打乱后的大小为M的数组:"  + Arrays.toString ( array));
            for ( int j = 0 ; j < M ; j++ ) {
                array2D[array[j]][j] += 1;
            }
        }
        System.out.println ("M行M列数组" );
        for ( int i = 0 ; i < M ; i++ ) {
            for ( int j = 0 ; j < M ; j++ ) {
                System.out.print ( array2D[i][j] + "\t");
            }
            System.out.println ( );
        }
    }

    /**
     * 将数组元素打乱
     * @param a 数组
     */
    public static void shuffle(int[] a) {
        int N = a.length;
        for ( int i = 1 ; i < N ; i++ ) {
            int random  = ( int ) ( Math.random ( )*N);
            int temp = a[i];
            a[i] = a[random];
            a[random] = temp;
        }
    }
}
