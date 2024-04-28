package com.example.triviafrag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Inicio extends Fragment {

    //2 borrar
    // 3 atts
    View vista;
    Button button;

    public Inicio() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    // 4 guardar return en vista
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_inicio, container, false);
        // 5 referenciar btn usando como puente vista
        button = (Button) vista.findViewById(R.id.button);

        // 6 usar un Toast para probar evento btn ok
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Presiona", Toast.LENGTH_LONG).show();
                //Navigation.findNavController(v).navigate(R.id.fragmentUno);
            }
        });
        return vista;
    }
}