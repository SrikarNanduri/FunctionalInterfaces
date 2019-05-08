package com.srikar.Streams.IntermediateOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Srikar on Feb, 2019
 */
public class FilterExample {

    public static void main(String [] args){

        withOutStreams(initData());
        withStreams(initData());
        withStreamsTest(initUserData());

    }

    private static void withStreams(List<String> randomNames) {

        List<String> startsWithK = randomNames.stream().filter(s -> s.substring(0,1).equalsIgnoreCase("k")).collect(Collectors.toList());

        startsWithK.stream().forEach(System.out::println);

    }

    private static void withStreamsTest(List<User> userList) {

        List<User> adminFromUsers = userList.stream().filter(user -> user.getType().equals("admin")).collect(Collectors.toList());

        adminFromUsers.stream().forEach(user -> System.out.println(user.toString()));

    }



    private static void withOutStreams(List<String> randomNames){

        List<String> startsWithS = new ArrayList<>();

        for(String names : randomNames){
            if(names.substring(0, 1).equalsIgnoreCase("s")){
                startsWithS.add(names);
            }
        }

        for (String name : startsWithS)
        System.out.println(name);

    }

    private static List<String> initData(){
        List<String> randomNames = new ArrayList<>();
        randomNames.add("Kartik");
        randomNames.add("kriti");
        randomNames.add("Jane");
        randomNames.add("rich");
        randomNames.add("sam");
        randomNames.add("peter");
        randomNames.add("Samantha");

        return randomNames;
    }


    private static List<User> initUserData(){
        List<User> randomNames = new ArrayList<>();
        randomNames.add(new User("Kartik", "Student", 701235481));
        randomNames.add(new User("kriti", "admin", 701235481));
        randomNames.add(new User("Jane", "Student", 701235481));
        randomNames.add(new User("Samantha", "Student", 701235481));
        randomNames.add(new User("sam", "admin", 701235481));
        randomNames.add(new User("rich", "Student", 701235481));

        return randomNames;
    }


    public static class User{
        String name;
        String type;
        int number;

        public User(String name, String type, int number) {
            this.name = name;
            this.type = type;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", number=" + number +
                    '}';
        }
    }
}
