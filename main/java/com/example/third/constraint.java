package com.example.third;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.widget.TextView;

public class constraint extends Fragment {
    public constraint(){
        super(R.layout.fragment_constraint);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = (TextView) getView().findViewById(R.id.mail);
        Bundle arguments = getArguments();
        textView.setText(arguments.getString("ticketKey"));

        getParentFragmentManager().setFragmentResultListener("requestKey",
                this, new FragmentResultListener() {
                    @Override
                    public void onFragmentResult(@NonNull String requestKey,
                                                 @NonNull Bundle bundle) {
                        String result = bundle.getString("ticketKey");
                        String ticket = result;
                        textView.setText(ticket);
                    }
                }
        );

        Button button = (Button) getView().findViewById(R.id.oplatabutton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (savedInstanceState == null) {
                    Bundle result = new Bundle();
                    result.putString("accepted", "Ticket accepted!");
                    getChildFragmentManager().setFragmentResult("bundleKey", result);
                }
            }
        });
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_constraint, container, false);
    }




}