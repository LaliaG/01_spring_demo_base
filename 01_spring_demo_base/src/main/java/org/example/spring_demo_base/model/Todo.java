package org.example.spring_demo_base.model;

import lombok.Getter;
import lombok.Setter;

public class Todo {
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private String description;
    private boolean isDone;

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
