package algorithmPractice.src.section1_basic.section1_1_practices;

import java.util.Scanner;

public class Practice1_1_33 {
    public static void main(String[] args) {
        double[] vectorA = {1, 2, 3};
        double[] vectorB = {4, 5, 6};
        double[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] matrixB = new double[3][3];
        System.out.println("输入矩阵B");//其他同理，方便起见直接赋初值
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < matrixB.length; i++) {
            for(int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("向量A为");
        printVector(vectorA);

        System.out.println("向量B为");
        printVector(vectorB);

        System.out.println("矩阵A为");
        printMatrix(matrixA);

        System.out.println("矩阵B为");
        printMatrix(matrixB);

        System.out.println("向量A和向量B之积为" + Practice1_1_33.dot(vectorA, vectorB));
        System.out.println();

        System.out.println("矩阵A和矩阵B的之积矩阵C为");
        printMatrix(Practice1_1_33.mult(matrixA, matrixB));

        System.out.println("矩阵A的转置矩阵AT为");
        printMatrix(Practice1_1_33.transpose(matrixA));

        System.out.println("矩阵A和向量A之积列向量为");
        printVector(Practice1_1_33.mult(matrixA, vectorA));

        System.out.println("向量A和矩阵A之积行向量为");
        printVector(Practice1_1_33.mult(vectorA, matrixA));
    }

    private static double dot(double[] vectorA, double[] vectorB) {
        if (vectorA.length != vectorB.length) {
            System.out.println("请重新输入，向量A的列数和向量B的行数需相等！");
            System.exit(-1);
        }
        double product = 0.0;
        for (int i = 0; i < vectorA.length; i++) {
            product += vectorA[i]*vectorB[i];
        }
        return product;
    }

    private static double[][] mult(double[][] matrixA, double[][] matrixB) {
        int matrixARow = matrixA.length;
        int matrixACol = matrixA[0].length;
        int matrixBRow = matrixB.length;
        int matrixBCol = matrixB[0].length;
        if (matrixACol != matrixBRow) {
            System.out.println("请重新输入，矩阵A的列数和矩阵B的行数需相等！");
            System.exit(-1);
        }
        double[][] matrixC = new double[matrixARow][matrixBCol];

        for (int i = 0; i < matrixARow; i++) {
            for (int j = 0; j < matrixBCol; j++) {
                double matrixCij = 0;
                for (int k = 0; k < matrixBRow; k++) {
                    matrixCij += matrixA[i][k] * matrixB[k][j];
                }
                matrixC[i][j] = matrixCij;
            }
        }
        return matrixC;
    }

    private static double[][] transpose(double[][] matrixA) {
        double[][] matrixAT = new double[matrixA[0].length][matrixA.length];

        for(int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixAT[j][i] = matrixA[i][j];
            }
        }
        return matrixAT;
    }

    private static double[] mult(double[][] matrixA, double[] vectorA) {
        if (matrixA[0].length != vectorA.length) {
            System.out.println("请重新输入，矩阵A的列数和向量A的行数需相等！");
            System.exit(-1);
        }
        double[] vector = new double[matrixA.length];

        for(int i = 0; i < matrixA.length;i++) {
            double vectori = 0;
            for(int j = 0; j < vectorA.length; j++) {
                vectori += matrixA[i][j] * vectorA[j];
            }
            vector[i] = vectori;
        }
        return vector;
    }

    private static double[] mult(double[] vectorA, double[][] matrixA) {
        if (vectorA.length != matrixA.length) {
            System.out.println("请重新输入，向量A的列数和矩阵A的行数需相等！");
            System.exit(-1);
        }
        double[] vector = new double[matrixA[0].length];

        for(int i = 0; i < matrixA[0].length;i++) {
            double vectori = 0;
            for(int j = 0; j < vectorA.length; j++) {
                vectori += vectorA[j] * matrixA[j][i];
            }
            vector[i] = vectori;
        }
        return vector;
    }

    private static void printVector(double[] vector) {
        for(int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "\t");
        }
        System.out.println();
        System.out.println();
    }

    private static void printMatrix(double[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0;j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}
