package com.lcs.comlcsfragmentosestaticos;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class FragmentoA extends Fragment {

    private EnviarMensaje mensaje;
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.fragmento_a, container, false);

        view.findViewById(R.id.enviar).setOnClickListener(v -> {
            TextView tv = view.findViewById(R.id.texto);
            String msg = tv.getText().toString();
            mensaje.enviarDato(msg);
        });
        return view;
    }
    @Override
    public void onAttach(@NonNull Context context){
        super.onAttach(context);
        mensaje = (EnviarMensaje) context;
    }
}
