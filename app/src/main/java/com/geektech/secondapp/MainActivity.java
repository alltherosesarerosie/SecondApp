package com.geektech.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    EditText editText_email;
    EditText editText_password;
    MaterialButton materialButton;
    TextView textView_input;
    TextView textView_login_and_reg;
    LinearLayout layout_btn;
    LinearLayout layout_text_fotget_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_email=(EditText)findViewById(R.id.text_email);
        editText_password=(EditText)findViewById(R.id.text_password);
        materialButton=(MaterialButton)findViewById(R.id.bt_input);
        textView_input=(TextView)findViewById(R.id.text_input);
        textView_login_and_reg=(TextView)findViewById(R.id.text_3);
        layout_btn=(LinearLayout)findViewById(R.id.LLayout2);
        layout_text_fotget_password=(LinearLayout)findViewById(R.id.text_forgetPassword);






        Toast toast_true = Toast.makeText(getApplicationContext(),
                "Вы зарегистрировались!", Toast.LENGTH_SHORT);

        Toast toast_false = Toast.makeText(getApplicationContext(),
                "Ошибка!", Toast.LENGTH_SHORT);

        editText_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String text_email = editText_email.getText().toString().trim();
                String text_password = editText_password.getText().toString().trim();

                if(text_email.length()>0 || text_password.length()>0){
                    materialButton.setBackgroundColor(getResources().getColor(R.color.orange));



                    materialButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(text_email.equals("admin") || text_password.equals("admin")){
                                toast_true.show();
                                textView_input.animate().alpha(0);
                                textView_login_and_reg.animate().alpha(0);
                                layout_btn.animate().alpha(0);
                                layout_text_fotget_password.animate().alpha(0);

                            }
                            else{
                                toast_false.show();
                            }
                        }
                    });
                }

                else{
                    materialButton.setBackgroundColor(getResources().getColor(R.color.gray));

                }
            }
        });












    }
}