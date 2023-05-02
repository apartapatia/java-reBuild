package l2;

public abstract class AbstractMatrix implements IMatrix {

    protected int rows;
    protected int columns;

    public AbstractMatrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
    }

    public int getRows(){
        return rows;
    }

    public int getColumns(){
        return columns;
    }

    protected abstract IMatrix createMatrix(int rows, int columns);
    public abstract void setElement(int rows, int columns, int value);
    public abstract int getElement(int rows, int columns);

    public IMatrix sum(IMatrix otherMatrix){
        if(this.getRows() != otherMatrix.getRows() && this.getColumns() != otherMatrix.getColumns()){
            throw new IllegalArgumentException("Matrix sizes are not equal");
        }

        AbstractMatrix resultMatrix = (AbstractMatrix) createMatrix(this.getRows(), this.getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                resultMatrix.setElement(i,j,this.getElement(i,j) + otherMatrix.getElement(i,j));
            }
        }
        return resultMatrix;
    }

    public IMatrix product(IMatrix otherMatrix){
        if(this.getColumns() != otherMatrix.getRows()){
            throw new IllegalArgumentException("Matrix sizes are not equal");
        }

        AbstractMatrix resultMatrix = (AbstractMatrix) createMatrix(this.getRows(), otherMatrix.getColumns());

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                int temp = 0;
                for (int k = 0; k < this.getColumns(); k++) {
                    temp += this.getElement(i,k) * otherMatrix.getElement(k,j);
                }
                resultMatrix.setElement(i,j,temp);
            }
        }
        return resultMatrix;
    }


}
