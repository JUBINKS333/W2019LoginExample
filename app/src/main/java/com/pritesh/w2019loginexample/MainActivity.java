package com.pritesh.w2019loginexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    private EditText edtUserEmail;
    private EditText edtPassword;
    private Button btnLogin;
    private Button btnClear;
    private TextView txtMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtUserEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        txtMsg = findViewById(R.id.lblMessage);

        btnLogin = findViewById(R.id.btnSignIn);
        btnClear = findViewById(R.id.btnClear);

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String email = edtUserEmail.getText().toString();

                Toast.makeText(MainActivity.this, email, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
