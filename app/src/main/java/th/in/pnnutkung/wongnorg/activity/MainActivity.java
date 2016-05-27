package th.in.pnnutkung.wongnorg.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.OnClick;
import th.in.pnnutkung.wongnorg.R;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.homeNearbyTextView) public void onClick() {
        Log.e("Nearby Restaurants","Click!");
        Intent nearbyRestaurants = new Intent(this, NearbyRestaurantsActivity.class);
        startActivity(nearbyRestaurants);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
        final TextView randomRestaurant = (TextView)findViewById(R.id.homeRandomTextView);
        randomRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Random Restaurants","Click!");
                Intent randomRestaurants = new Intent(MainActivity.this, RandomRestaurant.class);
                startActivity(randomRestaurants);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
