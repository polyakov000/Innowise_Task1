package com.polyakov.task1.repository;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.specification.Specification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repository {
  private static Repository repository;
  private static ArrayList<CustomArray> repositoryArrays = new ArrayList<>();
  private Repository(){
  }
  public static Repository getInstance(){
    if(repository == null){
      repository = new Repository();
    }
    return repository;
  }
  public void addArray(CustomArray customArray){
    repositoryArrays.add(customArray);
  }
  public void removeArray(CustomArray customArray){
    repositoryArrays.remove(customArray);
  }
  public void clearRepository(){
    repositoryArrays.clear();
  }

  public ArrayList<CustomArray> getRepositoryArrays() {
    return repositoryArrays;
  }

  public List<CustomArray> findBySpecification(Specification specification){
    List<CustomArray> foundArrays = new ArrayList<>();
    for(CustomArray customArray : repositoryArrays){
      if(specification.isExists(customArray)){
        foundArrays.add(customArray);
      }
    }
    return foundArrays;
  }


}
