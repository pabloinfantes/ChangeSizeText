package com.example.changesizetext.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.changesizetext.ChangeSizeApplication;
import com.example.changesizetext.data.model.Message;
import com.example.changesizetext.databinding.ActivityChangesizetextBinding;


public class ChangeSizeTextActivity extends AppCompatActivity {
    private static final String TAG = "ChangeSizeProject";
    ActivityChangesizetextBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChangesizetextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btSend.setOnClickListener(view -> {

            //1.- Crear objeto Bundle
            Bundle bundle = new Bundle();
            //2.- Añadir mensaje al Bundle
            Message message = new Message(((ChangeSizeApplication)getApplication()).getUser(),
                    binding.edMessage.getText().toString(),
                    binding.skSize.getProgress());

            bundle.putSerializable("message",message);
            //3.- Enviar el intent con el bundle
            Intent intent = new Intent(this,ViewMessageActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            Log.d(TAG,"ChangeSizeTextActivity -> onCreate() ");
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"ChangeSizeTextActivity -> onStart() ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"ChangeSizeTextActivity -> onResume() ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"ChangeSizeTextActivity -> onPause() ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"ChangeSizeTextActivity -> onStop() ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"ChangeSizeTextActivity -> onDestroy() ");
    }
}