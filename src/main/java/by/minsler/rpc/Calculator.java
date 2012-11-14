package by.minsler.rpc;

/**
 * User: dzmitry.misiuk
 * Date: 11/14/12
 * Time: 11:59 AM
 */
public class Calculator {

    public int sum(){
        return 10;
    }

    public Film setFilm(String country,String name){
        Film film = new Film();
        film.setCountry(country);
        film.setName(name);
        return  film;
    }
}