package com.example.navigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class three extends Fragment {



    Spinner spin_1,spin_2;
    TextView heading_sign_up;
    String[] role1 = new String[]{"CHAIRMAN", "HOD", "PRINCIPAL", "STUDENT"};
    String[] departments = new String[]{"CSE", "CSM", "CSO", "CIC","CSD","AIDS","ECE","EEE","MECH","CIVIL","AIML"};




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_three,container,false);
        heading_sign_up=view.findViewById(R.id.heading_sign_up);
        spin_1=view.findViewById(R.id.spinner1_up);
        spin_2=view.findViewById(R.id.spinner2_up);

        Animation animation= AnimationUtils.loadAnimation(getContext(),R.anim.blink_animation);
        heading_sign_up.startAnimation(animation);

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(
                getContext(), android.R.layout.simple_spinner_item, role1
        );

        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(
                getContext(), android.R.layout.simple_spinner_item, departments
        );
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_1.setAdapter(arrayAdapter1);

        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_2.setAdapter(arrayAdapter2);



        spin_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), role1[position], Toast.LENGTH_SHORT).show();
                String selected = role1[position];
                if (selected.equals("HOD") || selected.equals("STUDENT")) {
                    spin_2.setEnabled(true);  // Enable spinner2
                } else {
                    spin_2.setEnabled(false); // Disable spinner2
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Optional: Handle this case
            }
        });


        //Spinner 2

        spin_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), departments[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Optional: Handle this case
            }
        });



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_three, container, false);
    }
}