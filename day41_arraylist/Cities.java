package day41_arraylist;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        cities.add(0,"Ashgabat");
        System.out.println(cities);
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(cities.size()-1));
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("there are " + size + " cities in the list");

        for (int i = 0; i< cities.size();i++){
            System.out.print(cities.get(i) + "-");
            }
        System.out.println();
        for (String each : cities) {
            System.out.print(each + " ");
        }
        System.out.println();

        cities.remove(3);
        System.out.println(cities);

        cities.remove("New York");
        System.out.println("after remove = " +cities);

        //cities.clear();
        //System.out.print("size = " + cities.size() + " ");

        if (cities.isEmpty()){
            System.out.println("List is empty");
        }

        cities.forEach(city -> System.out.print(city.toUpperCase() + " "));

    }
}
