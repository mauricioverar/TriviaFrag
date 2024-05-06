package com.example.triviafrag;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.triviafrag.databinding.FragmentInicioBinding;

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
        // agregar binding
        @NonNull FragmentInicioBinding binding = FragmentInicioBinding.inflate(inflater, container, false);
        View view = binding.getRoot(); // obtener ruta
        // acceder al boton
        binding.button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // validar texto
                if(!binding.editTextText.getText().toString().isEmpty()) {
                    goPregunta(binding.editTextText.getText().toString());
                } else {
                    Toast.makeText(getContext(), "Campo vacio",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Inflate the layout for this fragment
        //vista = inflater.inflate(R.layout.fragment_inicio, container, false);
        // 5 referenciar btn usando como puente vista
//        button = (Button) vista.findViewById(R.id.button);

        //return inflater.inflate(R.layout.fragment_inicio, container, false);
        return view;
    }

    // ir a Pregunta
    private void goPregunta(String name) {
        // instanciar Pregunta
        Pregunta pregunta = new Pregunta();
        FragmentManager fragmentManager = getChildFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                // Transaction
        FragmentTransaction transaction = fragmentManager.beginTransaction().replace(R.id.contenedorFragment,pregunta, Pregunta.class.getSimpleName());
        transaction.commit();

    }

    /*@Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // referenciar btn frag
        //button = view.findViewById(R.id.button);
        Button button = view.findViewById(R.id.button);

        // 6 usar un Toast para probar evento btn ok
        *//*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(), "Presiona", Toast.LENGTH_LONG).show();
                Navigation.findNavController(v).navigate(R.id.pregunta);
            }
        });*//*
        button.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.pregunta);
        });

    }*/
}