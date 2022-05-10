package ro.fasttrackit.curs2.oop;

import lombok.ToString;

@ToString
public abstract class Pet {
    private final String name;

    protected Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String makeSound();
}

interface Top {
}

interface Left extends Top {
    int getInt();
}

interface Right extends Top {
    int field = 1;

    int getInt();

    default void process() {
        System.out.println(field);
        subproblem();
    }

    private void subproblem() {
        System.out.println("private method in interface");
    }
}

interface Down extends Left, Right {
}

class Impl implements Down {

    @Override
    public int getInt() {
        return 0;
    }
}


interface BusinessOperation<T> {
    default T execute() {
        validate();
        return doExecute();
    }

    void validate();

    T doExecute();
}