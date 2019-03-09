
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class RingingCentre {

    private Map<Bird, List<String>> birds = new HashMap<Bird, List<String>>();

    public void observe(Bird bird, String place) {
        List<String> list = new ArrayList<String>();
        list.add(place);
        if (birds.containsKey(bird)) {
            list = birds.get(bird);
            list.add(place);
        }
        birds.put(bird, list);
    }

    public void observations(Bird bird) {
        if (birds.containsKey(bird)) {
            List<String> list = birds.get(bird);
            System.out.println(bird.toString() + " observations: " + list.size());
            for (String item : list) {
                System.out.println(item);
            }
        } else {
            System.out.println(bird.toString() + " observations: 0");

        }
    }
}
