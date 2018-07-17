package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvShapes;

    ArrayList<ShapeItem> alShapeList;

    CustomAdapter caShape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvShapes = findViewById(R.id.listViewShapes);

        alShapeList = new ArrayList<>();

        ShapeItem shape1 = new ShapeItem("Rectangle","Length x Length","Area");
        ShapeItem shape2 = new ShapeItem("Triangle","(Length of base x length)/2", "Area");
        ShapeItem shape3 = new ShapeItem("Cube", "Length x Length x Length", "Volume");

        caShape = new CustomAdapter(this,R.layout.shape_item, alShapeList);
    }
}
