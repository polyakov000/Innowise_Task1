package com.polyakov.task1.repository;

import com.polyakov.task1.entity.CustomArray;
import com.polyakov.task1.repository.specification.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Repository {
  private static Repository repository;
  private List<CustomArray> repositoryArrays = new ArrayList<>();
  private Repository(){
  }
  public static Repository getInstance(){
    if(repository == null){
      repository = new Repository();
    }
    return repository;
  }
  public void add(CustomArray customArray){
    repositoryArrays.add(customArray);
  }
  public void remove(CustomArray customArray){
    repositoryArrays.remove(customArray);
  }
  public void clearRepository(){
    repositoryArrays.clear();
  }

  public List<CustomArray> getRepositoryArrays() {
    return repositoryArrays;
  }

  public List<CustomArray> sort(Comparator<? super CustomArray> comparator){
    return repositoryArrays.stream().sorted(comparator).toList();
  };

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
