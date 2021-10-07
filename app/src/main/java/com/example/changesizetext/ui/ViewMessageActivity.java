package com.example.changesizetext.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.changesizetext.ChangeSizeApplication;
import com.example.changesizetext.R;
import com.example.changesizetext.data.model.Message;
import com.example.changesizetext.databinding.ActivityViewMessageBinding;

/**
 * Esta clase visualiza un mensaje que se ha inicializado en ChangeSizeTextActivity
 * Se configura el componente TextView con un texto y un tamaño fuente.
 * @author pablo
 * @version 1.0
 */
public class ViewMessageActivity extends AppCompatActivity {
    private static final String TAG = "ChangeSizeProject";
    ActivityViewMessageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //1.- Recoger el intent
        Intent intent = getIntent();
        //2.-Recoger el mensaje
        //1Forma
        //Bundle bundle = intent.getExtras();
        //Message message = (Message) bundle.getSerializable("message");
        //2Forma y mas corta
        Message message = (Message) intent.getExtras().getSerializable("message");
        //Actualizamos la vista
        binding.tvMessageContent.setText(message.getMessage());
        binding.tvMessageContent.setTextSize(message.getSize());
        /*
        Todas las activity tienen acceso a la informacion de la clase Application desde el metodo getApplication
        para ello se debe de hacer un casting explicito ((ChangeSizeApplication)getApplication())
         */
        Log.d(TAG,((ChangeSizeApplication)getApplication()).getUser().toString());
    }



}