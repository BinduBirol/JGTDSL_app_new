package com.birol.jgtdsl;

import android.graphics.Typeface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.birol.jgtdsl.databinding.FragmentBillHistoryBinding;


public class BillHistoryFragment extends Fragment {

    private FragmentBillHistoryBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bill_history, container, false);
        mainTable(view);
        return view;

    }

    public void mainTable(View view) {
        TableLayout stk = (TableLayout) view.findViewById(R.id.table_main);
        TableRow tbrow0 = new TableRow(getActivity());

        TextView tv0 = new TextView(getActivity());
        tv0.setText("Bill month");
        tv0.setBackgroundResource(R.drawable.table_cell);
        tv0.setPadding(20,20,20,20);
        tv0.setTextSize(20);
        tv0.setTypeface(null, Typeface.BOLD);
        tbrow0.addView(tv0);

        TextView tv1 = new TextView(getActivity());
        tv1.setText("Payment date");
        tv1.setBackgroundResource(R.drawable.table_cell);
        tv1.setPadding(20,20,20,20);
        tv1.setTextSize(20);
        tv1.setTypeface(null, Typeface.BOLD);
        tbrow0.addView(tv1);

        TextView tv2 = new TextView(getActivity());
        tv2.setText("Payment method");
        tv2.setBackgroundResource(R.drawable.table_cell);
        tv2.setPadding(20,20,20,20);
        tv2.setTextSize(20);
        tv2.setTypeface(null, Typeface.BOLD);
        tbrow0.addView(tv2);

        TextView tv3 = new TextView(getActivity());
        tv3.setText("Billed amount");
        tv3.setBackgroundResource(R.drawable.table_cell);
        tv3.setPadding(20,20,20,20);
        tv3.setTextSize(20);
        tv3.setTypeface(null, Typeface.BOLD);
        tbrow0.addView(tv3);

        TextView tv4 = new TextView(getActivity());
        tv4.setText("Surcharge");
        tv4.setBackgroundResource(R.drawable.table_cell);
        tv4.setPadding(20,20,20,20);
        tv4.setTextSize(20);
        tv4.setTypeface(null, Typeface.BOLD);
        tbrow0.addView(tv4);

        TextView tv5 = new TextView(getActivity());
        tv5.setText("Status");
        tv5.setBackgroundResource(R.drawable.table_cell);
        tv5.setPadding(20,20,20,20);
        tv5.setTextSize(20);
        tv5.setTypeface(null, Typeface.BOLD);
        tbrow0.addView(tv5);


        stk.addView(tbrow0);

        for (int i = 0; i < 12; i++) {
            TableRow tbrow = new TableRow(getActivity());
            TextView t1v = new TextView(getActivity());
            t1v.setText("Dec 2022");
            t1v.setBackgroundResource(R.drawable.table_cell);
            t1v.setPadding(20,20,20,20);
            t1v.setTextSize(20);
            t1v.setGravity(Gravity.CENTER);
            tbrow.addView(t1v);

            TextView t2v = new TextView(getActivity());
            t2v.setText("20 jun 2022");
            t2v.setBackgroundResource(R.drawable.table_cell);
            t2v.setPadding(20,20,20,20);
            t2v.setTextSize(20);
            t2v.setGravity(Gravity.CENTER);
            tbrow.addView(t2v);

            TextView t3v = new TextView(getActivity());
            t3v.setText("DBBL, Nexus pay");
            t3v.setBackgroundResource(R.drawable.table_cell);
            t3v.setPadding(20,20,20,20);
            t3v.setTextSize(20);
            t3v.setGravity(Gravity.CENTER);
            tbrow.addView(t3v);

            TextView t4v = new TextView(getActivity());
            t4v.setText("12000");
            t4v.setBackgroundResource(R.drawable.table_cell);
            t4v.setPadding(20,20,20,20);
            t4v.setTextSize(20);
            t4v.setGravity(Gravity.CENTER);
            tbrow.addView(t4v);

            TextView t5v = new TextView(getActivity());
            t5v.setText("12000");
            t5v.setBackgroundResource(R.drawable.table_cell);
            t5v.setPadding(20,20,20,20);
            t5v.setTextSize(20);
            t5v.setGravity(Gravity.CENTER);
            tbrow.addView(t5v);

            TextView t6v = new TextView(getActivity());
            t6v.setText("Paid");
            t6v.setBackgroundResource(R.drawable.table_cell);
            t6v.setPadding(20,20,20,20);
            t6v.setTextSize(20);
            t6v.setGravity(Gravity.CENTER);
            tbrow.addView(t6v);

            stk.addView(tbrow);
        }

    }
}