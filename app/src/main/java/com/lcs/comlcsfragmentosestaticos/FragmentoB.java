package com.lcs.comlcsfragmentosestaticos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FragmentoB extends Fragment {
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.fragmento_b, container, false);
        return view;
    }
    public void recibir(String dato){
        TextView tv = getActivity().findViewById((R.id.mensaje));
        tv.setText(dato);
    }
}