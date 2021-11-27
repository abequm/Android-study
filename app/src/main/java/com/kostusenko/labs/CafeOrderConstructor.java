package com.kostusenko.labs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CafeOrderConstructor extends Fragment {

    private static final String ARG_LOGIN = "UserLogin";
    private static final String ARG_PASS = "UserPass";

    // TODO: Rename and change types of parameters
    private String Userlogin; // login
    private String UserPass; // password

    public CafeOrderConstructor(String userLogin, String userPass) {
        Userlogin=userLogin;
        UserPass=userPass;
        TextView welcomeBox= getActivity().findViewById(R.id.lab7_welcomeUserTextView);
        welcomeBox.setText("Привет "+userLogin+"! Что будете заказывать?");

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cafe_order_constructor, container, false);
    }
}