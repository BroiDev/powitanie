package com.broidev.powitanie;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // pola klasy - dostępne we wszystkich metodach
    private EditText etName;
    private Button btnGreet;
    private Button btnClear;
    private CheckBox cbShout;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // połączenie pól z elementami layoutu - ZAWSZE po setContentView
        etName = findViewById(R.id.etName);
        btnGreet = findViewById(R.id.btnGreet);
        btnClear = findViewById(R.id.btnClear);
        cbShout = findViewById(R.id.cbShout);
        tvResult = findViewById(R.id.tvResult);

        // obsługa kliknięć
        btnGreet.setOnClickListener(v -> greet());
        btnClear.setOnClickListener(v -> clear());
    }

    private void greet() {
        String name = etName.getText().toString().trim();

        if (name.isEmpty()) {
            Toast.makeText(this, R.string.error_empty_name, Toast.LENGTH_SHORT).show();
            return;
        }

        String greeting = getString(R.string.greeting, name);

        if (cbShout.isChecked()) {
            greeting = greeting.toUpperCase();
        }

        tvResult.setText(greeting);
    }

    private void clear() {
        etName.setText("");
        tvResult.setText("");
    }
}