package th.in.pnnutkung.wongnorg.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.TextView;

import th.in.pnnutkung.wongnorg.R;
import th.in.pnnutkung.wongnorg.model.Restaurant;
import th.in.pnnutkung.wongnorg.model.Storage;

public class RestaurantDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);
        Bundle bundle = getIntent().getExtras();
        String resName = bundle.getString("resName");

        Restaurant res = Storage.getInstance().getRestaurant(resName);
        TextView name = (TextView)findViewById(R.id.restaurantName);
        name.setText(res.getName());
        TextView cuisine = (TextView)findViewById(R.id.cuisine);
        cuisine.setText(res.getCuisine());
        RatingBar rate = (RatingBar)findViewById(R.id.ratingBar);
        rate.setNumStars((int)res.getStar());
        TextView call = (TextView)findViewById(R.id.call);
        call.setText(res.getCall());
        TextView about = (TextView)findViewById(R.id.about);
        about.setText(res.getAbout());
    }
}
