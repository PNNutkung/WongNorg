package th.in.pnnutkung.wongnorg.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import th.in.pnnutkung.wongnorg.R;
import th.in.pnnutkung.wongnorg.model.Restaurant;
import th.in.pnnutkung.wongnorg.model.Storage;

public class RandomRestaurant extends AppCompatActivity {
    Restaurant recentRestaurant;
    List<Restaurant> resList;
    int currentRandom = -1,random;
    TextView resName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_restaurant);
        if(resList == null) {
            Log.e("resList","Create new");
            resList = Storage.getInstance().getRestaurantsList();
        }
    }

    public void randomRestaurant(View view){
        random = (int)Math.floor(Math.random()*resList.size());
        Log.e("Random",String.format("%d",random));
        if(currentRandom == random){
            randomRestaurant(view);
        } else {
            currentRandom = random;
            recentRestaurant = resList.get(random);
            resName = (TextView)findViewById(R.id.randomRestaurantName);
            resName.setText(recentRestaurant.getName());
        }
    }
}
