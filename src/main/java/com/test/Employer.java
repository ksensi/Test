package com.test;

/**
 * Created with IntelliJ IDEA.
 * User: Ксения
 * Date: 17.01.14
 * Time: 12:55
 * To change this template use File | Settings | File Templates.
 */
public class Employer {
    public String name;
    public String company_name;
    public int employer_count;

    public Employer(){
        super();
    }

    public Employer(String name, String company_name, int employer_count) {
        this.name = name;
        this.company_name = company_name;
        this.employer_count = employer_count;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getEmployer_count() {
        return employer_count;
    }

    public void setEmployer_count(int employer_count) {
        this.employer_count = employer_count;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", employer_count=" + employer_count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;

        Employer employer = (Employer) o;

        if (employer_count != employer.employer_count) return false;
        if (company_name != null ? !company_name.equals(employer.company_name) : employer.company_name != null)
            return false;
        if (name != null ? !name.equals(employer.name) : employer.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (company_name != null ? company_name.hashCode() : 0);
        result = 31 * result + employer_count;
        return result;
    }
}
