/**
 * Name :Kapparage Nishadi
 * IIT ID: 20221055
 * UOW ID : w1953623
 */

public class Positions {
    private final int rowNumber;
    private final int columnNumber;
    public int gCost;
    public int hCost;
    private Positions parent;
    public String direction;

    public Positions(int rowNumber, int columnNumber){
        this.columnNumber = columnNumber;
        this.rowNumber = rowNumber;
    }

    public Positions getParent() {
        return parent;
    }

    public void setParent(Positions parent) {
        this.parent = parent;
    }

    public int getFCost(){
        return gCost + hCost;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

}
