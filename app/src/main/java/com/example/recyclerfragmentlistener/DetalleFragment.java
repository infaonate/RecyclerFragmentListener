package com.example.recyclerfragmentlistener;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetalleFragment extends Fragment {
    private static final String ARG_NOMBRE = "nombre";
    private static final String ARG_APELLIDOS = "apellidos";

    public static DetalleFragment newInstance(String nombre, String apellidos) {
        DetalleFragment fragment = new DetalleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_NOMBRE, nombre);
        args.putString(ARG_APELLIDOS, apellidos);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detalle, container, false);

        String nombre = getArguments().getString(ARG_NOMBRE);
        String apellidos = getArguments().getString(ARG_APELLIDOS);

        TextView tvNombre = view.findViewById(R.id.tvNombre);
        TextView tvApellidos = view.findViewById(R.id.tvApellidos);

        tvNombre.setText(nombre);
        tvApellidos.setText(apellidos);

        return view;
    }
}