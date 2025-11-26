package com.polyakov.task1.entity;

import com.polyakov.task1.observer.ArrayObservable;
import com.polyakov.task1.observer.ArrayObserver;
import com.polyakov.task1.repository.Repository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;

public class CustomArray implements ArrayObservable {
    static final Logger log = LogManager.getLogger();
    long id;
    int[] elements;
    ArrayObserver arrayObserver;

    public CustomArray(long id, int[] elements) {
        this.id = id;
        this.elements = elements.clone();
        log.info("array "+ this +" was created");
        Repository.getInstance().add(this);
    }

    private CustomArray() {
    }

    public int[] getElements() {
        return elements.clone();
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
        notifyObservers();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        CustomArray that = (CustomArray) object;

        if (getId() != that.getId()) return false;
      return Arrays.equals(getElements(), that.getElements());
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + Arrays.hashCode(getElements());
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

    @Override
    public void addObserver(ArrayObserver observer) {
        if(observer != null){
            this.arrayObserver = observer;
        }
    }

    @Override
    public void removeObserver(ArrayObserver observer) {
        this.arrayObserver = null;
    }

    @Override
    public void notifyObservers() {
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
    public static Builder newBuilder(){
        return new CustomArray().new Builder();
    }
}
