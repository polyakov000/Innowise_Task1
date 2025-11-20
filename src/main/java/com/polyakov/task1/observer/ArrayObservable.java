package com.polyakov.task1.observer;

public interface ArrayObservable {
  void addObserver(ArrayObserver observer);
  void removeObserver(ArrayObserver observer);
  void notifyObservers();
}
