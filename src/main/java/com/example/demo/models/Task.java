package com.example.demo.models;

import jakarta.persistence.*;
@Entity
@Table (name = "tasks")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "task_type", discriminatorType = DiscriminatorType.STRING)

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @Column(name = "due_date")
    private String dueDate;

    private boolean status;

    public Task (){
    }

    public Task(String title, String dueDate, boolean status) {
        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", status=" + status +
                '}';
    }
}

//    Model the relationships of a Task Management software using Spring JPA. Assume that you have the following requirements for data storage:
//
//    Tasks have a title, dueDate and a boolean status.
//    There are 2 types of tasks: BillableTask and InternalTask.
//    BillableTask have an additional hourlyRate attribute.



