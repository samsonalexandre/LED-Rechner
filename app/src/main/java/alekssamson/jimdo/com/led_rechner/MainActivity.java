package alekssamson.jimdo.com.led_rechner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void watt(View view){
        Intent wat = new Intent(MainActivity.this, WattActivity.class);
        startActivity(wat);finish();
    }
    public void amper(View view){
        Intent ampe = new Intent(MainActivity.this, AmperActivity.class);
        startActivity(ampe);finish();
    }
}
