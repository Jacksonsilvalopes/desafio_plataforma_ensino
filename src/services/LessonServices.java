package services;

import entities.Lesson;

import java.util.List;

public class LessonServices {

    private static List<Lesson> lessonList ;
    public LessonServices(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public static void summary(){

        int totalSeconds = 0;
        for(Lesson l : lessonList){
            totalSeconds += l.duration();
        }
        System.out.println("DURAÇÃO TOTAL DO CURSO = " + totalSeconds + " segundos");
    }
}
