package com.kostusenko.labs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Cafe extends Fragment {

    public Cafe() {

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_cafe, container, false);
        Button btn= v.findViewById(R.id.lab7_auth);
        if (btn ==null){
        }
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        FragmentManager manager = getActivity().getSupportFragmentManager();
                        String userLogin = ((TextView)(getActivity().findViewById(R.id.lab7_login))).getText().toString();
                        String userPass = ((TextView)(getActivity().findViewById(R.id.lab7_pass))).getText().toString();
                        manager.beginTransaction().replace(R.id.frameLayout,new CafeOrderConstructor(userLogin,userPass)).commit();
                    }
                }
        );
        return v;
    }
}