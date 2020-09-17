import javafx.print.Collation;

import java.util.*;

public class FindBuddies {





}


List<String> getBuddies(List<String> wishlists, String userName) {

    ArrayList<String> myCities=new ArrayList<String>(); // cities for userName;
    ArrayList<Buddy> buddies = new ArrayList<Buddy>();
    ArrayList<String> buddyNames = new ArrayList<String>();

    for ( int i = 0 ; i < wishlists.size() ; i ++ ) {
        String mylist =  wishlists.get(i);
        String[] cities = mylist.split(",");
        if (cities[0].equals(userName)) {
            myCities = new ArrayList<String>(Arrays.asList(cities));
            myCities.remove(0);
        }
    }

    // matching
    for ( int i = 0 ; i  < wishlists.size() ; i ++) {
        String mylist =  wishlists.get(i);
        String[] cities = mylist.split(",");
        String currentUser  = cities[0] ;
        if (!currentUser.equals(userName)) {
            ArrayList <String> f_citites = new ArrayList<String>(Arrays.asList(cities));
            f_citites.remove(0);
            f_citites.retainAll(myCities); // intersection of two lists..
            if ( f_citites.size() > (myCities.size()/2)) {
                Buddy b = new Buddy ( currentUser, f_citites.size(), f_citites );
                buddies.add(b);
            }
        }

    }

    Collections.sort(buddies);

    for (int i = 0 ; i < buddies.size() ; i++) {
        buddyNames.add(buddies.get(i).name);
    }

    return buddyNames;
    /*
    for each user {

        check #of cites match input user , friends.
        if # of citesMatched > MyCities.size/2
             addToBuddies
    }
     */

}


class Buddy implements Comparable<Buddy>{
    String name;
    int rank;
    List<String> cities;


    @Override
    public int compareTo(Buddy buddy) {
        return buddy.rank - this.rank;
    }

    public Buddy(String _name, int _rank, List<String> _cities) {
        name = _name;
        rank = _rank;
        cities = _cities;
    }
}