package com.program.vendingmachineapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout modal_cartSummary;
    private Button button_goBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        modal_cartSummary = (ConstraintLayout)findViewById(R.id.modal_cartSummary);
        button_goBack = (Button) modal_cartSummary.findViewById(R.id.button_goBack);
        button_goBack.setOnClickListener(v -> OnGoBack());
    }

    public void OnViewCart(View view) {
        modal_cartSummary.setVisibility(View.VISIBLE);
    }
    public void OnGoBack(){
        modal_cartSummary.setVisibility(View.GONE);
    }
}