package com.example.todoapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.todoapp.databinding.ActivityDataInsertBinding;

public class DataInsert extends AppCompatActivity {
    ActivityDataInsertBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDataInsertBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String type = getIntent().getStringExtra("type");
        assert type != null;
        if (type.equals("update")) {
           binding.DIToolbar.setTitle("Update Note");
            binding.editTitle.setText(getIntent().getStringExtra("title"));
            binding.editDiscription.setText(getIntent().getStringExtra("disp"));
            int id = getIntent().getIntExtra("id", 0);
            binding.add.setText("Update Note");
            binding.add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent();
                    in.putExtra("title", binding.editTitle.getText().toString());
                    in.putExtra("disp", binding.editDiscription.getText().toString());
                    in.putExtra("id", id);
                    setResult(RESULT_OK, in);
                    finish();
                }
            });
        } else {
           binding.DIToolbar.setTitle("Add Note");
           binding.add.setText("Add Note");

            binding.add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent();
                    in.putExtra("title", binding.editTitle.getText().toString());
                    in.putExtra("disp", binding.editDiscription.getText().toString());
                    setResult(RESULT_OK, in);
                    finish();
                }
            });
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(DataInsert.this, MainActivity.class));
    }
}