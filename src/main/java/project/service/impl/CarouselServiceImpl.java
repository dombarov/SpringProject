package project.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import project.service.CarouselService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CarouselServiceImpl implements CarouselService {
    private Logger LOGGER = LoggerFactory.getLogger(CarouselServiceImpl.class);

    private List<String> images = new ArrayList<>();

    public CarouselServiceImpl(@Value("${carousel.images}") List<String> images) {
        this.images.addAll(images);

    }

//    @PostConstruct
//    public void afterInitialize(){
//        if (images.size() < 3){
//            throw new IllegalArgumentException("Error with images size");
//        }
//    }

    @Override
    public String firstImage() {
        return images.get(0);

    }

    @Override
    public String secondImage() {
        return images.get(1);
    }

    @Override
    public String thirdImage() {
        return images.get(2);
    }

    @Scheduled(cron = "${carousel.refresh-cron}")
    public void refresh(){
        LOGGER.info("Shuffling images...");
        Collections.shuffle(images);
    }

}