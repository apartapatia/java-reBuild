package l2;

import java.util.Arrays;
import java.util.Objects;

public class Matrix extends AbstractMatrix {

    private final int[][] matrix;
    public Matrix(int rows, int columns){
        super(rows, columns);
        this.matrix = new int[rows][columns];
        for (int i = 0; i < columns; i++) {
            this.matrix[i][i] = 1;
        }
    }
    public Matrix(int size){
        this(size,size);
    }
    public void setElement(int rows, int columns, int value){
        this.matrix[rows][columns] = value;
    }

    public int getElement(int rows, int columns){
        return this.matrix[rows][columns];
    }

    public Matrix sum(Matrix otherMatrix){
        return (Matrix) super.sum(otherMatrix);
    }

    public Matrix product(Matrix otherMatrix){
        return (Matrix) super.product(otherMatrix);
    }
    @Override
    public IMatrix createMatrix(int rows, int columns){
        return new Matrix(rows,columns);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Size: ").append(this.rows).append("x").append(this.columns).append('\n');

        for (int[] val : this.matrix){
            builder.append(Arrays.toString(val)).append(" ");
            builder.append("\n");
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object otherObject){

        if (!(otherObject instanceof Matrix)) {
            return false;
        }

        if (this.getColumns() != ((Matrix) otherObject).getColumns() && this.getRows() != ((Matrix) otherObject).getRows()){
            return false;
        }

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getElement(i,j) != ((Matrix) otherObject).getElement(i,j))
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Matrix testMatrix = new Matrix(2);

        System.out.println("0 matrix degree: ");
        System.out.println(testMatrix.toString());

        testMatrix.setElement(0,0,1);
        testMatrix.setElement(0,1,1);
        testMatrix.setElement(1,0,1);
        testMatrix.setElement(1,1,0);

        System.out.println("1 matrix degree: ");
        System.out.println(testMatrix.toString());

        Matrix resultMatrix = new Matrix(3);
        System.out.println(resultMatrix.equals(testMatrix));
        for (int i = 0; i < 9; i++) {
            resultMatrix = resultMatrix.product(testMatrix);
            System.out.println(i + " " + "matrix degree: ");
            System.out.println(resultMatrix);
        }
    }
}
