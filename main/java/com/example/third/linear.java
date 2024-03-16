package com.example.third;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.nfc.Tag;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class linear extends Fragment {
    public linear ()
    {
        super(R.layout.fragment_linear);
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("1", "onCreate");
        Log.d("1", "VIEW: null state");
        Log.d("1", "FRAGMENT: " + getLifecycle().getCurrentState().toString());
        Toast.makeText(getContext(), "onCreate", Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,  @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.d("1", "onCreateView");
        Log.d("1", "VIEW: "+getViewLifecycleOwner().getLifecycle().getCurrentState().toString() );
        Log.d("1", "FRAGMENT: "+getLifecycle().getCurrentState().toString());
        Toast.makeText(getContext(), "onCreateView", Toast.LENGTH_SHORT).show();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d("1", "onViewCreated");
        Log.d("1", "VIEW: "+getViewLifecycleOwner().getLifecycle().getCurrentState().toString() );
        Log.d("1", "FRAGMENT: "+getLifecycle().getCurrentState().toString());
        Toast.makeText(getContext(), "onViewCreated", Toast.LENGTH_LONG).show();
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Log.d("1", "onViewStateRestored");
        Log.d("1", "VIEW: " + getViewLifecycleOwner().getLifecycle().getCurrentState().toString());
        Log.d("1", "FRAGMENT: "+getLifecycle().getCurrentState().toString() );
        Toast.makeText(getContext(), "onViewStateRestored", Toast.LENGTH_LONG).show();
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("1", "onStart");
        Log.d("1", "VIEW: "+getViewLifecycleOwner().getLifecycle().getCurrentState().toString() );
        Log.d("1", "FRAGMENT: "+getLifecycle().getCurrentState().toString());
        Toast.makeText(getContext(), "onStart", Toast.LENGTH_LONG).show();
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("1", "onResume");
        Log.d("1", "VIEW: "+getViewLifecycleOwner().getLifecycle().getCurrentState().toString() );
        Log.d("1", "FRAGMENT: "+getLifecycle().getCurrentState().toString() );
        Toast.makeText(getContext(), "onResume", Toast.LENGTH_LONG).show();
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("1", "onPause");
        Log.d("1", "VIEW: "+getViewLifecycleOwner().getLifecycle().getCurrentState().toString());
        Log.d("1", "FRAGMENT: "+getLifecycle().getCurrentState().toString() );
        Toast.makeText(getContext(), "onDestroy", Toast.LENGTH_LONG).show();
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("1", "onStop");
        Log.d("1", "VIEW: "+getViewLifecycleOwner().getLifecycle().getCurrentState().toString() );
        Log.d("1", "FRAGMENT: "+getLifecycle().getCurrentState().toString() );
        Toast.makeText(getContext(), "onStop", Toast.LENGTH_LONG).show();
        super.onStop();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d("1", "onSaveInstanceState");
        Log.d("1", "VIEW: "+getViewLifecycleOwner().getLifecycle().getCurrentState().toString() );
        Log.d("1", "FRAGMENT: "+getLifecycle().getCurrentState().toString() );
        Toast.makeText(getContext(), "onSaveInstanceState", Toast.LENGTH_LONG).show();
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onDestroyView() {
        Log.d("1", "onDestroyView");
        Log.d("1", "VIEW: "+getViewLifecycleOwner().getLifecycle().getCurrentState().toString() );
        Log.d("1", "FRAGMENT: "+getLifecycle().getCurrentState().toString() );
        Toast.makeText(getContext(), "onDestroyView", Toast.LENGTH_LONG).show();
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("1", "onDestroy");
        Log.d("1", "VIEW: "+getViewLifecycleOwner().getLifecycle().getCurrentState().toString() );
        Log.d("1", "FRAGMENT: "+getLifecycle().getCurrentState().toString() );
        Toast.makeText(getContext(), "onDestroy", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }

}