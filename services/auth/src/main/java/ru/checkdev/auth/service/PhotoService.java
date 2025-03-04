package ru.checkdev.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.checkdev.auth.domain.Photo;
import ru.checkdev.auth.repository.PhotoRepository;

@Service
public class PhotoService {

    private final PhotoRepository photoRepository;

    @Autowired
    public PhotoService(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    public Photo save(Photo photo) {
        return photoRepository.save(photo);
    }

    public Photo findImage(Integer id) {
        return photoRepository.findById(id).get();
    }
}
