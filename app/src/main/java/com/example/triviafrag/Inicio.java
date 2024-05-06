package com.example.triviafrag;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Inicio extends Fragment {

    //2 borrar
    // 3 atts
    //View vista;
    //Button button;

    public Inicio() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // validar
        if (getArguments() != null) {

        }

    }

    // 4 guardar return en vista
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //vista = inflater.inflate(R.layout.fragment_inicio, container, false);
        // 5 referenciar btn usando como puente vista
//        button = (Button) vista.findViewById(R.id.button);



        return inflater.inflate(R.layout.fragment_inicio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // referenciar btn frag
        //button = view.findViewById(R.id.button);
        Button button = view.findViewById(R.id.button);

        // 6 usar un Toast para probar evento btn ok
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(), "Presiona", Toast.LENGTH_LONG).show();
                Navigation.findNavController(v).navigate(R.id.pregunta);
            }
        });*/
        button.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.pregunta);
        });

    }
}