package com.birol.jgtdsl;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;

import com.birol.jgtdsl.data.adapters.PaymentGatewayAdapter;
import com.birol.jgtdsl.data.model.PGitemModel;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.birol.jgtdsl.databinding.FragmentPaymentListDialogListDialogItemBinding;
import com.birol.jgtdsl.databinding.FragmentPaymentListDialogListDialogBinding;

import java.util.ArrayList;

public class paymentListDialogFragment extends BottomSheetDialogFragment {
    private FragmentPaymentListDialogListDialogBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = FragmentPaymentListDialogListDialogBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ArrayList<PGitemModel> pGitems= new ArrayList<PGitemModel>();
        pGitems.add(new PGitemModel("DBBL","DBBL","https://seeklogo.com/images/D/dutch-bangla-bank-ltd-logo-96BD5A58D8-seeklogo.com.png"));
        PaymentGatewayAdapter paymentGatewayAdapter = new PaymentGatewayAdapter(getActivity(),pGitems);
        binding.idGVpg.setAdapter(paymentGatewayAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



}