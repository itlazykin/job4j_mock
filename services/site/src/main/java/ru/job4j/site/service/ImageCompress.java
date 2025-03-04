package ru.job4j.site.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImageCompress {
    MultipartFile compressImage(MultipartFile file) throws IOException;
}
