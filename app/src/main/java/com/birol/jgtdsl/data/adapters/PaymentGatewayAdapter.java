package com.birol.jgtdsl.data.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.birol.jgtdsl.R;
import com.birol.jgtdsl.data.model.PGitemModel;
import com.birol.jgtdsl.data.model.PGitemModel;
import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class PaymentGatewayAdapter extends ArrayAdapter<PGitemModel> {

    public PaymentGatewayAdapter(@NonNull Context context, ArrayList<PGitemModel> PGitemModelArrayList) {
        super(context, 0, PGitemModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_payment_list_dialog_list_dialog_item, parent, false);
        }

        PGitemModel pGitemModel = getItem(position);
        TextView courseTV = listitemView.findViewById(R.id.idTVCourse);
        ImageView courseIV = listitemView.findViewById(R.id.idIVcourse);

        courseTV.setText(pGitemModel.getName());
        Picasso.get().load(pGitemModel.getImgurl()).into(courseIV);

        //courseIV.setImageBitmap(getImagefromUrl(pGitemModel.getImgurl()));
        return listitemView;
    }

}
