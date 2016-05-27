package th.in.pnnutkung.wongnorg.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pipatpol on 2559-05-13.
 */
public class Storage {
    private static Storage instance;
    private List<Restaurant> restaurantsList;

    private Storage(){
        restaurantsList = new ArrayList<Restaurant>();
        restaurantsList.add(new Restaurant("Coco Ichibanya","Japanese",4.5f,"02-636-1050","The famous curry house from Japan with 30 years experience in Japanese food business, offers varieties of Japanese Curry with unique and creative style along with the best quality ingredient to make tasty curry."));
        restaurantsList.add(new Restaurant("Gold Curry","Japanese",3.25f,"02-662-5003","ご当地グルメ、人気の金沢カレーがバンコク初上陸！金沢カレー特有の濃厚なカレーをぜひ、ご堪能ください！"));
    }

    public static Storage getInstance(){
        if(instance == null){
            instance = new Storage();
        }
        return instance;
    }


    public Restaurant getRestaurant(String name){
        for(Restaurant r: restaurantsList) {
            if(r.getName().equals(name)) {
                return r;
            }
        }
        return null;
    }

    public List<Restaurant> getRestaurantsList(){
        return restaurantsList;
    }
}
