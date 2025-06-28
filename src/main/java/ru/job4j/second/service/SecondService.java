package ru.job4j.second.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SecondService {

    @Value("${app.word:none}")
    private String word;

    public String getWord() {
        return word;
    }
}
