package android.example.smith_final_practical;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    TextView phone_number = findViewById(R.id.phone_number);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buy_tickets = findViewById(R.id.place_order);

        buy_tickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectConcert.class);
                startActivity(intent);
            }
        });

//        phone_number.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Call(v);
//            }
//        });
    }

//    public void Call(View v)
//    {
//        Uri u = Uri.parse("tel:" + phone_number.getText().toString());
//
//        Intent i = new Intent(Intent.ACTION_DIAL, u);
//
//        try
//        {
//            startActivity(i);
//        }
//        catch (SecurityException ignored)
//        {}
//    }
}
