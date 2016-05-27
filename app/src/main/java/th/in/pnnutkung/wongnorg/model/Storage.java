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
        restaurantsList.add(new Restaurant("Coco Ichibanya","Japanese",3.75f,"02-636-1050","\"CoCoICHIBANYA\" the famous curry house from Japan with 36 years experience in Japanese food business, offers varieties of Japanese Curry with unique and creative style along with the best quality ingredient to make tasty curry."));
        restaurantsList.add(new Restaurant("Gold Curry","Japanese",3.25f,"02-662-5003","ご当地グルメ、人気の金沢カレーがバンコク初上陸！金沢カレー特有の濃厚なカレーをぜひ、ご堪能ください！"));
        restaurantsList.add(new Restaurant("Maria Pizzeria & Restaurant","Italian",4.1f,"089-455-9477","\"Best of the Best\" จาก สสว. โครงการยกระดับคุณภาพมาตรฐานของอาหารไทย และร้านอาหารไทย อาหารสไตล์อิตาเลียน , เวียดนาม , ไทย , จีน และ มังสวิรัติ"));
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
