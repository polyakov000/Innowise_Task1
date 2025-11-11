package com.polyakov.task1.entity;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Objects;

public class MyArray {
    private static final Logger log = LogManager.getLogger();
    private long id;
    private int[] elements;

    public MyArray(long id, int[] elements) {
        this.id = id;
        this.elements = elements.clone();
        log.info("array "+ this +" was created");
    }

    public MyArray(Builder builder) {
        this.id = builder.id;
        this.elements = builder.elements;
        log.info("array "+ this +"was created");
    }

    public int[] getElements() {
        return elements;
    }

    public int getLength() {
        return elements.length;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MyArray myArray = (MyArray) object;
        return id == myArray.id && Arrays.equals(elements, myArray.elements);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id);
        result = 31 * result + Arrays.hashCode(elements);
        return result;
    }

    public static class Builder {
        private long id;
        private int[] elements;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder elements(int[] elements) {
            this.elements = elements;
            return this;
        }

        public MyArray build() {
            return new MyArray(this);
        }

    }
}
