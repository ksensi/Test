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
        Employer emp = new Employer("Kseniya", "RAE", 12);
        Employer emp1 = new Employer("Rinat", "POI", 10);
        Employer emp2 = new Employer("Masha", "POTR", 5);
        employers.add(emp);
        employers.add(emp1);
        employers.add(emp2);
    }

    @After
    public void CleanTableAfterTest() throws SQLException {
        employers.clear();
    }

    @Test
    public void testSortName() throws SQLException {
        Employer emp = new Employer("Kseniya", "RAE", 12);
        Employer emp1 = new Employer("Rinat", "POI", 10);
        Employer emp2 = new Employer("Masha", "POTR", 5);
        List<Employer> employersTemp = new ArrayList<>();
        employersTemp.add(emp);
        employersTemp.add(emp2);
        employersTemp.add(emp1);
        test.sortName(employers);
        for (int i = 0; i < employers.size(); i++){
            assertEquals(employers.get(i),employersTemp.get(i));
        }

    }

    @Test
    public void testSortEmployerCount() throws SQLException {
        Employer emp = new Employer("Kseniya", "RAE", 12);
        Employer emp1 = new Employer("Rinat", "POI", 10);
        Employer emp2 = new Employer("Masha", "POTR", 5);
        List<Employer> employersTemp = new ArrayList<>();
        employersTemp.add(emp2);
        employersTemp.add(emp1);
        employersTemp.add(emp);
        test.sortEmployerCount(employers);
        for (int i = 0; i < employers.size(); i++){
            assertEquals(employers.get(i),employersTemp.get(i));
        }

    }
}
