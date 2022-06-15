package Exercise2;

import java.util.ArrayList;

public class FlightList {
    private ArrayList<Flight> list;

    public FlightList(){
        list = new ArrayList<>();
    }
    public void add(Flight f){
        list.add(f);
    }
    public void showList(){
        for(Flight s: list){
            s.printInfo();
        }
    }

    public void showList(ArrayList<Flight> slist) {
        for(Flight s: list) {
            s.printInfo();
        }
    }

}