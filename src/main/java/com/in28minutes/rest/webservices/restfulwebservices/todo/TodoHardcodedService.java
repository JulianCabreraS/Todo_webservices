package com.in28minutes.rest.webservices.restfulwebservices.todo;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardcodedService {
    private static final List<Todo> todos = new ArrayList<>();
    private static int idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "in28minutes", "Learn to Dance", new Date(), false));
        todos.add(new Todo(++idCounter, "in28minutes", "Learn abouot microservices", new Date(), false));
        todos.add(new Todo(++idCounter, "in28minutes", "Learn about Angular", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }

}
