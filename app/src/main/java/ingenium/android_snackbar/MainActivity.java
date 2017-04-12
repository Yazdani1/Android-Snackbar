package ingenium.android_snackbar;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button normal;
    private Button action;
    private Button custom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        normal=(Button)findViewById(R.id.normal_xml);
        action=(Button)findViewById(R.id.action_xml);
        custom=(Button)findViewById(R.id.custom_xml);


        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar=Snackbar.make(normal,"Its Normal Snackbar",Snackbar.LENGTH_LONG);
                snackbar.show();

            }
        });


        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar=Snackbar.make(action,"Its Action Snackbar",Snackbar.LENGTH_INDEFINITE);

                snackbar.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"Its Action Snackbar",Toast.LENGTH_SHORT).show();
                    }
                });
                snackbar.show();


            }
        });

        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar=Snackbar.make(custom,"Its Custom Snackbar",Snackbar.LENGTH_INDEFINITE);

                snackbar.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(getApplicationContext(),"Its Custom SnackBar",Toast.LENGTH_SHORT).show();

                    }
                });

                snackbar.setActionTextColor(Color.BLUE);
                View sb=snackbar.getView();
                TextView txt=(TextView)sb.findViewById(android.support.design.R.id.snackbar_text);
                txt.setTextColor(Color.MAGENTA);
                snackbar.show();

            }
        });

    }
}
