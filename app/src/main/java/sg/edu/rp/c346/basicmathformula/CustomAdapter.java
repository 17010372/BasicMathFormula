package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17010372 on 17/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ShapeItem> shapeList;

    public CustomAdapter(@NonNull Context context, int resource, ArrayList<ShapeItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = layout_id;
        shapeList = shapeList;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id,parent,false);
        TextView tvShape = rowView.findViewById(R.id.textView);
        TextView tvFormula = rowView.findViewById(R.id.textView2);
        TextView tvType = rowView.findViewById(R.id.textView3);
        ShapeItem currentItem= shapeList.get(position);
        String shape = currentItem.getShape();
        String formula = currentItem.getFormula();
        String type = currentItem.getType();

        tvShape.setText(shape);
        tvFormula.setText(formula);
        tvType.setText(type);
        return rowView;
    }
}



