package com.birol.jgtdsl.data.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.birol.jgtdsl.R;
import com.birol.jgtdsl.data.model.GridMenuModel;

import java.util.ArrayList;

public class MenuGVAdapter extends ArrayAdapter<GridMenuModel> {

    public MenuGVAdapter(@NonNull Context context, ArrayList<GridMenuModel> GridMenuModelArrayList) {
        super(context, 0, GridMenuModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.card_item, parent, false);
        }

        GridMenuModel GridMenuModel = getItem(position);
        TextView courseTV = listitemView.findViewById(R.id.idTVCourse);
        ImageView courseIV = listitemView.findViewById(R.id.idIVcourse);

        courseTV.setText(GridMenuModel.getName());
        courseIV.setImageResource(GridMenuModel.getImgid());
        return listitemView;
    }
}
