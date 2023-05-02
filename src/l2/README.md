# Readme

# Matrix class

This is a Java class called Matrix that extends the AbstractMatrix class and implements the IMatrix interface. The class provides basic operations for a matrix, such as setting and getting elements, summing matrices, multiplying matrices, and creating new matrices. The class has the following methods:

### Constructors

- Matrix(int rows, int columns) creates a new instance of Matrix with the specified number of rows and columns. The default value of all elements is 0, except for the diagonal elements which are set to 1.
- Matrix(int size) creates a new instance of Matrix with the specified size. The matrix is square and the default value of all elements is 0, except for the diagonal elements which are set to 1.

### Element manipulation methods

- setElement(int row, int column, int value) sets the element at the specified row and column to the specified value.
- getElement(int row, int column) returns the value of the element at the specified row and column.

### Matrix operation methods

- sum(Matrix otherMatrix) returns a new Matrix which is the result of adding the current matrix to the specified matrix.
- product(Matrix otherMatrix) returns a new Matrix which is the result of multiplying the current matrix with the specified matrix.

### Override methods

- createMatrix(int rows, int columns) returns a new Matrix instance with the specified number of rows and columns.
- toString() returns a String representation of the Matrix object.

### Example Usage

- The Matrix class also includes a main method that demonstrates how to use the class. The example creates matrix

    [1 1]

    [1 0]

    and then computes the 10 this matrix degrees:

```Java 
Matrix testMatrix = new Matrix(2);

System.out.println("0 matrix degree: ");
System.out.println(testMatrix.toString());

testMatrix.setElement(0, 0, 1);
testMatrix.setElement(0, 1, 1);
testMatrix.setElement(1, 0, 1);
testMatrix.setElement(1, 1, 0);

System.out.println("1 matrix degree: ");
System.out.println(testMatrix.toString());

Matrix resultMatrix = testMatrix;
for (int i = 0; i < 9; i++) {
resultMatrix = resultMatrix.product(testMatrix);
System.out.println(i + " " + "matrix degree: ");
System.out.println(resultMatrix);
} 
```
# Note: 
- This class uses the AbstractMatrix class and the IMatrix interface. The AbstractMatrix class provides a basic implementation of a matrix, while the IMatrix interface specifies the required methods for a matrix class.