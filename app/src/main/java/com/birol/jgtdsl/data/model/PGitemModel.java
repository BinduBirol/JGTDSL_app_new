package com.birol.jgtdsl.data.model;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.birol.jgtdsl.databinding.FragmentPaymentListDialogListDialogItemBinding;
import com.birol.jgtdsl.paymentListDialogFragment;

public class PGitemModel  {
    private String id;
    private String name;
    private String imgurl;

    public PGitemModel(String id, String name, String imgurl) {
        this.id = id;
        this.name = name;
        this.imgurl = imgurl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}