package com.dhaval.baeldung;

public class Subject {
    private Lesson lesson;

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public void beginStudy() {
        lesson.startLearning();
    }
}
