package sdplusplus.sdsu.edu.warveterans;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class CountActivity extends ActionBarActivity {

    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
    }

    /**
     * This method is called when the calculate button is clicked.
     */
    public void calculateExperience(View view) {
        display(quantity);
    }
    /**
     * Increment
     */
    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);

    }
    /** Decrement
     *
     */
    public void decrement(View view) {
        if(quantity==0)
            return;
        quantity = quantity - 1;
        display(quantity);
    }
    /**
     * This method displays the amount of experience on the screen.
     */
    private void display(int number) {
        TextView experienceTextView = (TextView) findViewById(
                R.id.value_text_view);
        experienceTextView.setText("" + number);
    }

    /**
     * This method displays the given value on the screen.
     */

}
