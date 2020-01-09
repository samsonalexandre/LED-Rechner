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

public class WattActivity extends AppCompatActivity {

    TextView outTextW;
    EditText inTextW;
    Button butt16W, butt32W, buttBackWat;
    double WattMeter16 = 4.8;
    double WattMeter32 = 2.4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watt);

        outTextW = (TextView)findViewById(R.id.textOutWatt);
        inTextW = (EditText)findViewById(R.id.textInnWatt);
        butt16W = (Button)findViewById(R.id.button16watt);
        butt32W = (Button)findViewById(R.id.button32watt);
        buttBackWat = (Button)findViewById(R.id.button_back_wat);

        buttBackWat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WattActivity.this, MainActivity.class);
                startActivity(intent);finish();
            }
        });
    }
    public void rechne16w(View view){
        String inText16 = inTextW.getText().toString();
        double inText_16 = Double.parseDouble(inText16);
        double Erg16 = inText_16 * WattMeter16;
        double newErg16 = new BigDecimal(Erg16).setScale(2, RoundingMode.UP).doubleValue();
        String stErg16 = Double.toString(newErg16);
        outTextW.setText("LED benötigen " + stErg16 + " Watt");
    }
    public void rechne32w(View view){
        String inText32 = inTextW.getText().toString();
        double inText_32 = Double.parseDouble(inText32);
        double Erg32 = inText_32 * WattMeter32;
        double newErg32 = new BigDecimal(Erg32).setScale(2, RoundingMode.UP).doubleValue();
        String stErg32 = Double.toString(newErg32);
        outTextW.setText("LED benötigen " + stErg32 + " Watt");
    }


}
