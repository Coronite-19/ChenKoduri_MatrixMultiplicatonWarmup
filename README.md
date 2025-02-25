# Matrix Multiplication in Java

This project contains a `Matrix` class with a `multiply` method that takes two 2D arrays (`Double[][]`) and performs matrix multiplication if their sizes are compatible. If the number of columns in the first matrix does not match the number of rows in the second, it returns a special "null matrix."

The `MatrixRunner` class defines two example matrices, calls `Matrix.multiply(x, y)`, and prints the result in a formatted way. The implementation uses nested loops to compute the dot product for each element in the resulting matrix.
