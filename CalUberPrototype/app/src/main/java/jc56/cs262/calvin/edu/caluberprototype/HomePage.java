package jc56.cs262.calvin.edu.caluberprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button toBasket = (Button)findViewById(R.id.JoinARide_button);

        toBasket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this, BasketActivity.class));
            }
        });
    }


    public void launchUserProfile(View view) {
        Intent intent = new Intent(this,UserProfile.class);
        startActivity(intent);

    }

    public void launchCreateRide(View view) {
        Intent intent = new Intent(this,CreateRide.class);
        startActivity(intent);
    }

    public void launchBasket(View view) {
        Intent intent = new Intent(this,BasketActivity.class);
        startActivity(intent);
    }
    public void login_function(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}