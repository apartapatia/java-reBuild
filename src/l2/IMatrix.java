package l2;

public interface IMatrix {
    public void setElement(int rows, int columns, int value);
    public int getElement(int rows, int columns);
    public int getRows();
    public int getColumns();
    IMatrix sum(IMatrix otherMatrix);
    IMatrix product(IMatrix otherMatrix);


}
