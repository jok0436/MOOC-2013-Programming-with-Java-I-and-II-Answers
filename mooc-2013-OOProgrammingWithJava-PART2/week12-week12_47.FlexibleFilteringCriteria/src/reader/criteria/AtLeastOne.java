/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author josia
 */
public class AtLeastOne implements Criterion {

    ArrayList<Criterion> criteria = new ArrayList<Criterion>();

    public AtLeastOne(Criterion... allCriteria) {
        this.criteria.addAll(Arrays.asList(allCriteria));
    }

    @Override
    public boolean complies(String line) {
        for (Criterion cri : criteria) {
            if (cri.complies(line)) {
                return true;
            }
        }
        return false;
    }

}
