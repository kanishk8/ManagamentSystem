package com.kanishk.managamentsystem.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.kanishk.managamentsystem.model.Details;

public interface DetailsRepo extends CrudRepository<Details, Integer> {

}
