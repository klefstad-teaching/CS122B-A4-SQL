package com.github.klefstad_teaching.cs122b.sql.model.response;

public class StudentSearchRequest
{
    private String  firstName;
    private String  lastName;
    private Integer year;
    private Double  gpa;
    private String  className;

    public String getFirstName()
    {
        return firstName;
    }

    public StudentSearchRequest setFirstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }

    public String getLastName()
    {
        return lastName;
    }

    public StudentSearchRequest setLastName(String lastName)
    {
        this.lastName = lastName;
        return this;
    }

    public Integer getYear()
    {
        return year;
    }

    public StudentSearchRequest setYear(Integer year)
    {
        this.year = year;
        return this;
    }

    public Double getGpa()
    {
        return gpa;
    }

    public StudentSearchRequest setGpa(Double gpa)
    {
        this.gpa = gpa;
        return this;
    }

    public String getClassName()
    {
        return className;
    }

    public StudentSearchRequest setClassName(String className)
    {
        this.className = className;
        return this;
    }
}
