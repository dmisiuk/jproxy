package by.minsler.rpc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: dzmitry.misiuk
 * Date: 11/14/12
 * Time: 12:25 PM
 */
public class dao {

    private List<Film> list;

    public dao(){
        list = new ArrayList<Film>();
        list.add(new Film("belarus", "В тумане"));
        list.add(new Film("usa", "sherlock"));
        list.add(new Film("gb", "luter"));

    }

    public Film getFilm(int number){
       return list.get(number);

    }

    public int getCount(){
        return list.size();

    }


    public List<Film> getAllFilm(){
        return  list;
    }

    public Map<String,String> addFilm(String country,String name){
        Film film = new Film();
        film.setCountry(country);
        film.setName(name);

        list.add(film);
        Map<String,String> map = new HashMap<String, String>();
        map.put("country", film.getCountry());
        map.put("name", film.getName());
        map.put("added", "success");
        return  map;
    }


}