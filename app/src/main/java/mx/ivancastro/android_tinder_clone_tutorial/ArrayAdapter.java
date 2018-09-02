package mx.ivancastro.android_tinder_clone_tutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ArrayAdapter extends android.widget.ArrayAdapter<Cards> {
    Context context;

    public ArrayAdapter (Context context, int resourceId, List<Cards> items) {
        super(context, resourceId, items);
    }

    public View getView (int position, View convertView, ViewGroup parent) {
        Cards cardItem = getItem(position);
        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);

        TextView name = convertView.findViewById(R.id.name);
        ImageView image = convertView.findViewById(R.id.name);

        name.setText(cardItem.getName());
        image.setImageResource(R.mipmap.ic_launcher);

        return convertView;
    }
}
