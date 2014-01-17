package com.test;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Ксения
 * Date: 17.01.14
 * Time: 12:47
 * To change this template use File | Settings | File Templates.
 */
public class Test1 {
    public void sortName (List<Employer> employers){
        for (int j = 0; j < employers.size(); j++) {
            for (int i = j + 1; i < employers.size(); i++) {
                if (employers.get(i).getName().compareTo(employers.get(j).getName()) < 0) {
                    Employer temp = employers.get(j);
                    employers.set(j, employers.get(i));
                    employers.set(i, temp);


                }
            }
        }
    }
    public void sortEmployerCount (List<Employer> employers){
        for (int j = 0; j < employers.size(); j++) {
            for (int i = j + 1; i < employers.size(); i++) {
                if (employers.get(i).getEmployer_count() < employers.get(j).getEmployer_count()) {
                    Employer temp = employers.get(j);
                    employers.set(j, employers.get(i));
                    employers.set(i, temp);


                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
