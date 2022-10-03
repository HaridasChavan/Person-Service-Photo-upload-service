package com.irissoftware.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iissoftware.springbootmongodb.collection.Photo;

@Repository
public interface PhotoRepository extends MongoRepository<Photo, String> {
}
