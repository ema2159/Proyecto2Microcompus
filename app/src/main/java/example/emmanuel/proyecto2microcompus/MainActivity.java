package example.emmanuel.proyecto2microcompus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button coffbtn, resbtn, barbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        coffbtn=(Button)findViewById(R.id.coffbutton);
        coffbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),coffeactivity.class);
                startActivity(i);
            }
        });
        resbtn=(Button)findViewById(R.id.resbutton);
        resbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),resActivity.class);
                startActivity(i);
            }
        });
        barbtn=(Button)findViewById(R.id.barbutton);
        barbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),BarActivity.class);
                startActivity(i);
            }
        });
    }
}
