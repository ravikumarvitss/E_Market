package com.market.e_market;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Lenovo on 08-Jun-17.
 */
public class Signin extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.signin, container, false);
        Button proced = (Button) rootView.findViewById(R.id.but3);
        proced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getActivity(),Home_Screen.class);
                //startActivity(in);
                 getActivity().startActivity(in);

            }
        });
        TextView forgetps=(TextView) rootView.findViewById(R.id.forgetps);
        forgetps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getActivity(),ForgetPassword.class);
                //startActivity(in);
                getActivity().startActivity(in);
            }
        });
        //textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        return rootView;
    }
}
