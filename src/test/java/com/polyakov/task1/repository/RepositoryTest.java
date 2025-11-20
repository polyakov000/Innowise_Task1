package com.polyakov.task1.repository;

import com.polyakov.task1.comparator.FirstElementComparator;
import com.polyakov.task1.comparator.IdComparator;
import com.polyakov.task1.comparator.LengthComparator;
import com.polyakov.task1.comparator.SumComparator;
import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.repository.specification.Specification;
import com.polyakov.task1.repository.specification.impl.ArrayLengthMoreThanSpecification;
import com.polyakov.task1.repository.specification.impl.FirstArrayElementSpecification;
import com.polyakov.task1.repository.specification.impl.IdSpecification;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
  CustomArray customArray1;
  CustomArray customArray2;
  CustomArray customArray3;
  List<CustomArray> arrays = new ArrayList<>();
  Repository repository = Repository.getInstance();

  @BeforeEach
  void setUp() {
    customArray1 = new CustomArray(1,new int[] {325,35342,22,4});
    customArray2 = new CustomArray(2,new int[] {22,44,3});
    customArray3 = new CustomArray(3,new int[] {1});
    arrays.add(customArray1);
    arrays.add(customArray2);
    arrays.add(customArray3);
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void addArray() {
    List<CustomArray> expected = List.of(customArray1,customArray2,customArray3);
    List<CustomArray> actual = repository.getRepositoryArrays();
    assertEquals(expected,actual);
  }

  @Test
  void removeArray() {
    repository.remove(customArray1);
    List<CustomArray> expected = List.of(customArray2,customArray3);
    List<CustomArray> actual = repository.getRepositoryArrays();
    assertEquals(expected,actual);
  }

  @Test
  void clearRepository() {
    repository.clearRepository();
    long expected = 0;
    long actual = repository.getRepositoryArrays().stream().count();
    assertEquals(expected,actual);
  }

  @Test
  void getRepositoryArrays() {
    List<CustomArray> expected = List.of(customArray1,customArray2,customArray3);
    List<CustomArray> actual = repository.getRepositoryArrays();
    assertEquals(expected,actual);
  }

  @Test
  void findBySpecification() {
    Specification idSpecification = new IdSpecification(2);
    Specification firstArrayElementSpecification = new FirstArrayElementSpecification(3);
    Specification arrayLengthMoreThanSpecification = new ArrayLengthMoreThanSpecification(1);
    List<CustomArray> expected1 = List.of(customArray2);
    List<CustomArray> expected2 = List.of(customArray3);
    List<CustomArray> expected3 = List.of(customArray2,customArray3);
    List<CustomArray> actual1 = repository.findBySpecification(idSpecification);
    List<CustomArray> actual2 = repository.findBySpecification(firstArrayElementSpecification);
    List<CustomArray> actual3 = repository.findBySpecification(arrayLengthMoreThanSpecification);
    assertAll(
            () -> assertEquals(expected1,actual1),
            () -> assertEquals(expected2,actual2),
            () -> assertEquals(expected3,actual3)
    );
  }
  @Test
  void sort(){
    List<CustomArray> sortedById = repository.sort(new IdComparator());
    List<CustomArray> sortedByFirstElement = repository.sort(new FirstElementComparator());
    List<CustomArray> sortedBySum = repository.sort(new SumComparator());
    List<CustomArray> sortedByLength = repository.sort(new LengthComparator());
    assertAll(
            ()-> assertEquals(customArray3,sortedByFirstElement.get(0)),
            ()->  assertEquals(customArray3,sortedBySum.get(0)),
            ()->  assertEquals(customArray3,sortedByLength.get(0)),
            ()->  assertEquals(customArray1,sortedById.get(0))
    );
  }
}