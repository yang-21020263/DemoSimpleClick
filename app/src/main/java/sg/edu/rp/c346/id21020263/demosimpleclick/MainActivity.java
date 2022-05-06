package sg.edu.rp.c346.id21020263.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //variables
    Button btn;
    TextView tv;
    EditText et;
    ToggleButton tb;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking variables
        btn = findViewById(R.id.btn1);
        et = findViewById(R.id.et1);
        tv = findViewById(R.id.tv1);
        tb = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.RadioGroupGender);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //get text from editText
                String txt = et.getText().toString();

                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    // Write the code when male selected
                    txt = "He says " + txt;
                }
                else{
                    // Write the code when female selected
                    txt = "She says " + txt;
                }
                //making textview display the text
                tv.setText(txt);
            }
        });
        //
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tb.isChecked()) {
                    et.setEnabled(true);
                } else {
                    et.setEnabled(false);
                }
            }
        });

    }
}