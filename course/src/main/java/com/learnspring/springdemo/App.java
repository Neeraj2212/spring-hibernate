package com.learnspring.springdemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Coach theCoach = new TrackCoach();
        
        System.out.println(theCoach.getDailyWorkout());
    }
}
