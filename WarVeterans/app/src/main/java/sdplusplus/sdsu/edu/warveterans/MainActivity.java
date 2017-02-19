package sdplusplus.sdsu.edu.warveterans;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click_function(View view) {
        System.out.println("New Branch");
        System.out.println("Gowtham");
    }
}
