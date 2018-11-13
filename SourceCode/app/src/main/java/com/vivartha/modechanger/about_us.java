/**
 * @author sai krsihna kolli
 * The AboutUs provides the user with key information on how the application works.
 * Predefined Classes used : Buttons and intents
 * Predefined classes are used to navigate between the screens
 */

package com.vivartha.modechanger;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class about_us extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        Button btn = (Button)findViewById(R.id.r5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(about_us.this, Home_Activity.class);
                startActivity(i);
            }
        });
    }

}
