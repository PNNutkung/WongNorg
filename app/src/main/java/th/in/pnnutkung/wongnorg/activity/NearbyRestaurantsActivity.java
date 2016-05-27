package th.in.pnnutkung.wongnorg.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import th.in.pnnutkung.wongnorg.R;
import th.in.pnnutkung.wongnorg.model.Restaurant;
import th.in.pnnutkung.wongnorg.model.Storage;

public class NearbyRestaurantsActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_restaurants);


        listView  = (ListView) findViewById(R.id.nearbyRestaurantListView);
        List<String> restaurantNameList = new ArrayList<String>();
        for(Restaurant r: Storage.getInstance().getRestaurantsList()){
            restaurantNameList.add(r.getName());
        }
        String[] lv_arr = restaurantNameList.toArray(new String[restaurantNameList.size()]);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.activity_listview,lv_arr);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(NearbyRestaurantsActivity.this, RestaurantDetailActivity.class);
                String select = (listView.getItemAtPosition(position).toString());
                Log.e("AdapterView",select);
                intent.putExtra("resName",select);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
