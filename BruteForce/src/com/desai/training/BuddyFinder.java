package com.desai.training;

import java.util.*;

class BuddyFiner {

    public static void main(String args[]) {
        ArrayList myCities = new ArrayList();
        myCities.add("Tokyo");
        myCities.add("Cambodia");
        myCities.add("Paris");

        HashMap<String, ArrayList<String>> muyFriends = new HashMap<String, ArrayList<String>>();
        //Manish
        ArrayList friendCitites = new ArrayList();
        friendCitites.add("Tokyo");
        friendCitites.add("Mumbai");
        friendCitites.add("Paris");
        muyFriends.put("Manish", friendCitites);
        //Milap
        friendCitites = new ArrayList();
        friendCitites.add("Rajkot");
        friendCitites.add("Mumbai");
        friendCitites.add("Paris");
        muyFriends.put("Milap", friendCitites);

        //hemal
        friendCitites = new ArrayList();
        friendCitites.add("Tokyo");
        friendCitites.add("Cambodia");
        friendCitites.add("Paris");
        friendCitites.add("London");

        muyFriends.put("Hemal", friendCitites);

        //Vasant
        friendCitites = new ArrayList();
        friendCitites.add("Rome");
        friendCitites.add("Chennai");
        friendCitites.add("Paris");
        friendCitites.add("London");

        ArrayList<Buddy> buddy = findBuddies(myCities, muyFriends);

        for (Buddy b:
             buddy) {

            System.out.println(b);
        }

    }


    static ArrayList<Buddy> findBuddies(ArrayList<String> myCities, HashMap<String, ArrayList<String>> friendsList) {

        ArrayList<Buddy> buddies = new ArrayList<Buddy>();

        // for each friend

        for (String friend : friendsList.keySet()) {

            ArrayList friendCities = friendsList.get(friend);

            // check how many cities are common
            friendCities.retainAll(myCities);

            // if # of common cities is > 50% of my list
            // save them to another list.
            if (friendCities.size() > (myCities.size() / 2)) {
                Buddy buddy = new Buddy(friend, friendCities.size(), friendsList.get(friend));
                buddies.add(buddy);
            }


        }

        Collections.sort(buddies);
        return buddies;

    }
    // sort the list based on the #of common cities.

    static class Buddy implements Comparable<Buddy> {
        String _name;
        int _score;
        ArrayList<String> _cities;

        Buddy(String name, int score, ArrayList cities) {
            _name = name;
            _score = score;
            _cities = cities;
        }

        @Override
        public int compareTo(Buddy o) {

            return o._score - this._score;
        }

        public String toString() {
            return _name + " " + _score + " " + _cities;
        }
    }

}