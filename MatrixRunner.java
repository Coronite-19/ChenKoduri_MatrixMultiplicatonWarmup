// Junhe Chen, Laasya Koduri
// MatrixRunner.java
public class MatrixRunner {
    public static void main(String[] args) {
        Double[][] x = {
            {1.0, 2.0, 3.0, 5.0},
            {4.0, 5.0, 6.0, 7.0},
            {7.0, 8.0, 9.0, 9.0}
        };
        Double[][] y = {
            {1.0, 2.0, 3.0, 4.0, 5.0},
            {4.0, 5.0, 6.0, 7.0, 8.0},
            {7.0, 8.0, 9.0, 10.0, 11.0},
            {10.0, 11.0, 12.0, 13.0, 14.0}
        };
        Double[][] z = Matrix.multiply(x, y);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                sb.append(String.format("%5s", z[i][j])).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
