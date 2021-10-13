package io.github.danilopiazza.spring.boot.openshift.repository;

import org.springframework.data.repository.CrudRepository;

import io.github.danilopiazza.spring.boot.openshift.entity.Fruit;

public interface FruitRepository extends CrudRepository<Fruit, Integer> {
}
