package section1_basic.section1_1_practices;

public class Practice1_1_33 {

    private static double vectorProduct(double[] vectorA, double[] vectorB) {
        if (vectorA.length != vectorB.length) System.exit(-1);
        double product = 0.0;
        for (int i = 0; i < vectorA.length; i++) {
            product += vectorA[i]*vectorB[i];
        }
        return product;
    }

    private static double[][] matrixProduct(double[][] matrixA, double[][] matrixB) {
        int matrixARow = matrixA.length;
        int matrixACol = matrixA[0].length;
        int matrixBRow = matrixB.length;
        int matrixBCol = matrixB[0].length;
        if (matrixACol != matrixBRow) System.exit(-1);
        double[][] matrixC = new double[matrixARow][matrixBCol];

        for (int i = 0; i < matrixARow; i++) {
            double matrixCij = 0;
            for (int j = 0; j < matrixACol; j++) {
                matrixCij += matrixA[i][j]*matrixB[j][i];
                matrixC[i][j] = matrixCij;
            }
        }
        return matrixC;
    }

    private static double[][] matrixTranspose(double[][] matrixA) {
        double[][] transposeA = new double[matrixA.length][matrixA[0].length];

        for(int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                transposeA[j][i] = matrixA[i][j];
            }
        }
        return transposeA;
    }

}
