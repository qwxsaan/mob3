package com.example.third;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class relative extends Fragment {
    public relative(){
        super(R.layout.fragment_relative);
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getParentFragmentManager().setFragmentResultListener("bundleKey", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle bundle) {
                String result = bundle.getString("accepted");
                TextView textView = (TextView) getView().findViewById(R.id.tarif);

            }
        });

        Button standart = (Button) getView().findViewById(R.id.standart);
        Button comfort = (Button) getView().findViewById(R.id.comfort);
        Button vip = (Button) getView().findViewById(R.id.vip);

        standart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (savedInstanceState == null) {
                    Bundle result = new Bundle();
                    result.putString("ticketKey", "Standart");
                    getParentFragmentManager().setFragmentResult("ticketyKey", result);
                    getParentFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragment_container_view, constraint.class, result)
                            .commit();
                }
            }
        });

        comfort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (savedInstanceState == null) {
                    Bundle result = new Bundle();
                    result.putString("ticketKey", "Standart");
                    getParentFragmentManager().setFragmentResult("ticketKey", result);
                }
            }
        });

        vip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (savedInstanceState == null) {
                    Bundle result = new Bundle();
                    result.putString("ticketKey", "vip");
                    getParentFragmentManager().setFragmentResult("ticketKey", result);
                }
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_relative, container, false);
    }




}