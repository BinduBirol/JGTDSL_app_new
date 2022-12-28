package com.birol.jgtdsl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.birol.jgtdsl.databinding.FragmentCustomerInfoBinding;
import com.birol.jgtdsl.databinding.FragmentSecondBinding;

public class CustomerInfoFragment extends Fragment {

    private FragmentCustomerInfoBinding binding;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_customer_info, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}