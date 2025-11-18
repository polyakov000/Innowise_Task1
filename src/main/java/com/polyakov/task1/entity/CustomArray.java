package com.polyakov.task1.entity;

import com.polyakov.task1.observer.ArrayObserver;
import com.polyakov.task1.observer.impl.ArrayObserverImpl;
import com.polyakov.task1.repository.Repository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Objects;

public class CustomArray implements ArrayObserver {
    private long id;
    private int[] elements;
    private static final Logger log = LogManager.getLogger();
    private static final Repository repository = Repository.getInstance();
    private ArrayObserver arrayObserver = new ArrayObserverImpl();

    public CustomArray(long id, int[] elements) {
        this.id = id;
        this.elements = elements.clone();
        log.info("array "+ this +" was created");
        repository.addArray(this);
    }

    private CustomArray() {
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
        this.elements = elements.clone();
        update(this);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CustomArray customArray = (CustomArray) object;
        return id == customArray.id && Arrays.equals(elements, customArray.elements);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id);
        result = 31 * result + Arrays.hashCode(elements);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("CustomArray { id = ")
                .append(id)
                .append("\nelements = { ")
                .append(Arrays.toString(this.getElements()))
                .append(" }\n}").toString();
    }

    public static Builder build(){
        return new CustomArray().new Builder();
    }

    @Override
    public void update(CustomArray customArray) {
        arrayObserver.update(this);
    }

    public class Builder {
        private long id;
        private int[] elements;
        private Builder(){}

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder elements(int[] elements) {
            this.elements = elements.clone();
            return this;
        }

        public CustomArray build() {
            return CustomArray.this;
        }

    }
}
