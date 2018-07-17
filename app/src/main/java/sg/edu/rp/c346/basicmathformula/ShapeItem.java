package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 17010372 on 17/7/2018.
 */

public class ShapeItem {
    private String shape;
    private String formula;
    private String type;

    public ShapeItem(String shape, String formula, String type){
        this.shape = shape;
        this.formula = formula;
        this.type = type;
    }
    public void setShape(String shape){
        this.shape = shape;
    }
    public void setLength(String formula){
        this.formula = formula;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getShape(){
        return shape;
    }
    public String getFormula(){
        return formula;
    }
    public String getType(){
        return type;
    }
    @Override
    public String toString(){
        return "ShapeItem{"+"area of "+ shape + "\'" + formula + "Formula of type is:"+ type;
    }
}
