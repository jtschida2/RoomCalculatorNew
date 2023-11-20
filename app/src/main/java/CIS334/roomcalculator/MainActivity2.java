package CIS334.roomcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView roomDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        double length = getIntent().getDoubleExtra("height", 0);
        double width = getIntent().getDoubleExtra("width", 0);
        double area = getIntent().getDoubleExtra("area", 0);
        roomDetails = findViewById(R.id.textViewMeasurements);
        roomDetails.setText("The width is " + width + " ft and the length is " + length + " ft and the total flooring needed is " + area + "ft");
    }
//new line


}