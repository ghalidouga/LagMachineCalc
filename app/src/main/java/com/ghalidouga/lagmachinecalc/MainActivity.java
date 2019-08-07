package com.ghalidouga.lagmachinecalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_main);
        Button confirmButton = (Button) findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText totalChunkEditText = (EditText) findViewById(R.id.totalChunkEditText);
                TextView resultPistonTextView = (TextView) findViewById(R.id.resultPistonTextView);
                TextView resultObserverTextView = (TextView) findViewById(R.id.resultObserverTextView);
                TextView resultArmorStandTextView = (TextView) findViewById(R.id.resulArmorStandTextView);
                TextView resultCobbleStoneTextView = (TextView) findViewById(R.id.resultCobblestoneTextView);
                TextView resultWoodPlankTextView = (TextView) findViewById(R.id.resultWoodPlankTextView);
                TextView resultIronIngotTextView = (TextView) findViewById(R.id.resultIronIngotTextView);

                int totalChunks = Integer.parseInt(totalChunkEditText.getText().toString());
                int resultPiston = totalChunks * 256;
                int resultObserver = totalChunks * 512;
                int resultArmorStand = totalChunks * 256;
                int resultCobbleStone = (resultPiston * 4) + ( resultObserver * 6);
                int resultWoodPlank = resultPiston * 3;
                int resultIronIngot = resultPiston * 1;
                //test


                resultPistonTextView.setText(resultPiston + "");
                resultObserverTextView.setText(resultObserver + "");
                resultArmorStandTextView.setText(resultArmorStand + "");
                resultCobbleStoneTextView.setText(resultCobbleStone + "");
                resultWoodPlankTextView.setText(resultWoodPlank + "");
                resultIronIngotTextView.setText(resultIronIngot + "");
            }
        });
//
//
//
//            }
//        });
    }
}
