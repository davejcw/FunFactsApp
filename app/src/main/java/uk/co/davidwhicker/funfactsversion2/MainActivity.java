package uk.co.davidwhicker.funfactsversion2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.LongBuffer;
import java.util.Random;


public class MainActivity extends ActionBarActivity {


    private factSelector factSelector = new factSelector();
    private colorSelector colorSelector = new colorSelector();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Grab the elements
        final TextView factWrapper = (TextView) findViewById(R.id.factWrapper);
        final Button factButton = (Button) findViewById(R.id.factButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fact = factSelector.getFact();
                factWrapper.setText(fact);

                int color = colorSelector.getColor();
                factButton.setTextColor(color);
                relativeLayout.setBackgroundColor(color);

                if(fact == "David misses and loves his girlfriend crazy amounts")
                {
                    Toast.makeText(MainActivity.this, "Damn straight he does!!", Toast.LENGTH_LONG).show();
                }
            }
        };





        factButton.setOnClickListener(listener);
    }
}
