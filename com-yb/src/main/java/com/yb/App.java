package com.yb;

/**
 * Hello world!
 *
 */
public class App 
{


    /**
     * name : huochai
     * age : 29
     * school : {"name":"diankeyuan","location":"beijing"}
     */

    private String name;
    private int age;
    private SchoolBean school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SchoolBean getSchool() {
        return school;
    }

    public void setSchool(SchoolBean school) {
        this.school = school;
    }

    public static class SchoolBean {
        /**
         * name : diankeyuan
         * location : beijing
         */

        private String name;
        private String location;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }
    }
}
