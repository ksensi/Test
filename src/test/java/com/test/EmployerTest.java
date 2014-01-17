package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Ксения
 * Date: 17.01.14
 * Time: 13:33
 * To change this template use File | Settings | File Templates.
 */
public class EmployerTest {
    public static List<Employer> employers;
    public static Test1 test;
    @BeforeClass
    public static void setUp() throws SQLException {
        employers = new ArrayList<>();
        test = new Test1();
    }

    @Before
    public void prepareEmployee() {
        Employer emp = new Employer("A", "RAE", 1);
        Employer emp1 = new Employer("B", "POI", 2);
        Employer emp2 = new Employer("C", "POTR", 1);
        Employer emp3 = new Employer("A", "POTR", 2);
        Employer emp4 = new Employer("C", "POTR", 2);
        employers.add(emp);
        employers.add(emp1);
        employers.add(emp2);
        employers.add(emp3);
        employers.add(emp4);
    }

    @After
    public void CleanTableAfterTest() throws SQLException {
        employers.clear();
    }

    @Test
    public void testSortEmployer() throws SQLException {
        Employer emp = new Employer("A", "RAE", 1);
        Employer emp1 = new Employer("B", "POI", 2);
        Employer emp2 = new Employer("C", "POTR", 1);
        Employer emp3 = new Employer("A", "POTR", 2);
        Employer emp4 = new Employer("C", "POTR", 2);
        List<Employer> employersTemp = new ArrayList<>();
        employersTemp.add(emp);
        employersTemp.add(emp3);
        employersTemp.add(emp1);
        employersTemp.add(emp2);
        employersTemp.add(emp4);
        test.sortEmployer(employers);
        for (int i = 0; i < employers.size(); i++){
            assertEquals(employers.get(i),employersTemp.get(i));
        }

    }
}
