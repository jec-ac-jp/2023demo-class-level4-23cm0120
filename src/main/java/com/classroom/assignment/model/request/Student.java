package com.classroom.assignment.model.request;

public class Student {
  private String id;
  private String name;
  private String lesson;


  public Student(String id, String name, String lesson) {
    this.setId(id);
    this.setName(name);
    this.setLesson(lesson);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLesson() {
    return lesson;
  }

  public void setLesson(String lesson) {
    this.lesson = lesson;
  }



}
