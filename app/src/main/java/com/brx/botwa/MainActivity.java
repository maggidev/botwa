package com.brx.botwa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStartBot = findViewById(R.id.btnStartBot);
        btnStartBot.setOnClickListener(v -> {
            // Inicia a atividade do terminal integrado
            Intent intent = new Intent(this, TerminalActivity.class);
            intent.putExtra("run_bot", true);
            startActivity(intent);
            Toast.makeText(this, "Iniciando Terminal Integrado...", Toast.LENGTH_SHORT).show();
        });
    }
}
