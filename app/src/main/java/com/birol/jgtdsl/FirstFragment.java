package com.birol.jgtdsl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.birol.jgtdsl.data.adapters.MenuGVAdapter;
import com.birol.jgtdsl.data.model.GridMenuModel;
import com.birol.jgtdsl.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private GridView menuGV;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);

        menuGV = binding.idGVmenu;
        ArrayList<GridMenuModel> GridMenuModelArrayList = new ArrayList<GridMenuModel>();
        GridMenuModelArrayList.add(new GridMenuModel("Customer info", R.drawable.ic_baseline_person_outline_24));
        GridMenuModelArrayList.add(new GridMenuModel("Payment history", R.drawable.ic_baseline_checklist_24));
        GridMenuModelArrayList.add(new GridMenuModel("Outstanding bIlls", R.drawable.ic_baseline_payments_24));
        GridMenuModelArrayList.add(new GridMenuModel("Downloads", R.drawable.ic_baseline_arrow_circle_down_24));
        GridMenuModelArrayList.add(new GridMenuModel("Notifications", R.drawable.ic_baseline_notifications_active_24));
        MenuGVAdapter adapter = new MenuGVAdapter(getActivity(), GridMenuModelArrayList);
        menuGV.setAdapter(adapter);

        menuGV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                switch (position){
                    case 0:
                        NavHostFragment.findNavController(FirstFragment.this)
                                .navigate(R.id.action_homeToCinfo);
                        break;

                    case 1:
                        NavHostFragment.findNavController(FirstFragment.this)
                                .navigate(R.id.action_homeToBillHistory);
                        break;

                    case 2:
                        NavHostFragment.findNavController(FirstFragment.this)
                                .navigate(R.id.action_homeToPayment);
                        break;

                    case 3:
                        NavHostFragment.findNavController(FirstFragment.this)
                                .navigate(R.id.action_homeToDownloads);
                        break;
                    case 4:
                        NavHostFragment.findNavController(FirstFragment.this)
                                .navigate(R.id.action_homeToNotifications);
                        break;

                }


            }
        });
        return binding.getRoot();

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}