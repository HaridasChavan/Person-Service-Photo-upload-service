package com.irissoftware.springbootmongodb.service;

import org.springframework.web.multipart.MultipartFile;

import com.iissoftware.springbootmongodb.collection.Photo;

import java.io.IOException;

public interface PhotoService {
    String addPhoto(String originalFilename, MultipartFile image) throws IOException;

    Photo getPhoto(String id);
}
