package alekssamson.jimdo.com.led_rechner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AmperActivity extends AppCompatActivity {

    private TextView outTextA;
    private EditText inTextA;
    private Button butt16A, butt32A, buttBackAmp;
    private double WattMeter16 = 4.8;
    private double WattMeter32 = 2.4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amper);

        inTextA = (EditText)findViewById(R.id.textInAmper);
        outTextA = (TextView)findViewById(R.id.editOutAmper);
        butt16A = (Button)findViewById(R.id.button16amper);
        butt32A = (Button)findViewById(R.id.button32amper);
        buttBackAmp = findViewById(R.id.button_back_amp);

        buttBackAmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AmperActivity.this, MainActivity.class);
                startActivity(intent);finish();
            }
        });
    }

    public void rechne16a(View view){
        String inText16 = inTextA.getText().toString();
        double inText_16 = Double.parseDouble(inText16);
        double Erg16 = (inText_16 * WattMeter16) / 12;
        double newErg16 = new BigDecimal(Erg16).setScale(2, RoundingMode.UP).doubleValue();
        String stErg16 = Double.toString(newErg16);
        outTextA.setText("LED benötigen " + stErg16 + " Amper");
    }
    public void rechne32a(View view){
        String inText32 = inTextA.getText().toString();
        double inText_32 = Double.parseDouble(inText32);
        double Erg32 = (inText_32 * WattMeter32) / 12;
        double newErg32 = new BigDecimal(Erg32).setScale(2, RoundingMode.UP).doubleValue();
        String stErg32 = Double.toString(newErg32);
        outTextA.setText("LED benötigen " + stErg32 + " Amper");
    }
}
