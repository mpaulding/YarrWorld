package edu.orangecoastcollege.cs273.mpaulding.yarrworld;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final Context context = this;
    private Button speakButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        speakButton =  (Button) findViewById(R.id.speakButton);

        speakButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(
                                context, R.string.alert_dialog_message, Toast.LENGTH_SHORT ).show();
//                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
//                        alertDialogBuilder.setTitle(getString(R.string.alert_dialog_title));
//                        alertDialogBuilder.setMessage(getString(R.string.alert_dialog_message));
//                        alertDialogBuilder.setCancelable(true);
//
//                        AlertDialog alertDialog = alertDialogBuilder.create();
//                        alertDialog.show();
                    }
                }
        );

    }


}
