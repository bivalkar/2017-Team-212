package sdplusplus.sdsu.edu.warveterans;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click_function(View view) {
        Intent go = new Intent(MainActivity.this,CountActivity.class);
        startActivity(go);

    }
}
