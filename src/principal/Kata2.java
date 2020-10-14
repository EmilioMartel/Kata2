package principal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {

        //---------------- RESPASO DE TRABAJAR CON MAPAS ------------------//
        /*Map<Integer,Integer> map = new HashMap<>();

        map.put(0,-1);
        map.put(8,3);
        map.put(6,8);
        map.put(3,0);
        map.put(5,12);
        map.put(9,23);*/

        //-----------------FORMA 1 DE RECORRER UN MAPA--------------//
        /*for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
        }*/

        //-----------------FORMA 2 DE RECORRER UN MAPA--------------//
        /*for(Integer key: map.keySet()){
            System.out.println("Key = " + key + ", value = " + map.get(key));
        }*/

        //-----------------FORMA 3 DE RECORRER UN MAPA--------------//
        /*Iterator<Map.Entry<Integer,Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()){
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
        }*/

        int [] data = {1,2,14,14,6,3,8,9,4,1,2,3,14,5};
        String [] data2 = {"pepe","maria","Pablo","maria","pepe","pepe","Facundo","Rosa","pepe","Pedro"};

        Histogram meta_histo = new Histogram(data2);

        Map<Integer,Integer> histogram = meta_histo.getHistogram();

        Iterator<Map.Entry<Integer,Integer>> entries = histogram.entrySet().iterator();
        while (entries.hasNext()){
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }
}
