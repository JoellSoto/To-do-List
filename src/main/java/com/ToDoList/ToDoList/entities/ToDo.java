package com.ToDoList.ToDoList.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ToDo {

    @Id
    @SequenceGenerator(
            name="ToDo_sequence",
            sequenceName="ToDo_sequence",
            allocationSize =1
    )

    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator ="ToDO_sequence"
    )
    private int id;

    @Column
    private String task;

    @Column
    private boolean isCompleted;

    public boolean getIsCompleted(){
        return  isCompleted;
    }

}
