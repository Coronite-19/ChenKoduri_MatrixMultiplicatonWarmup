// Matrix.java
public class Matrix {
    public static Double[][] multiply(Double[][] x, Double[][] y) {
        if (x == null || y == null || x.length == 0 || y.length == 0 || x[0].length != y.length) {
            return new Double[][] { { null, null } };
        }
        int r = x.length;
        int c = x[0].length;
        int d = y[0].length;
        Double[][] z = new Double[r][d];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < d; j++) {
                double sum = 0.0;
                for (int k = 0; k < c; k++) {
                    sum += x[i][k] * y[k][j];
                }
                z[i][j] = sum;
            }
        }
        return z;
    }
}
