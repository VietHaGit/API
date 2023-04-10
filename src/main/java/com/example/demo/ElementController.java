package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ElementController  {

    @GetMapping("/elements")
//    public List<String> getElements(){
//        List<String> elements = new ArrayList<>();
//        elements.add("A");
//        elements.add("B");
//        elements.add("C");
//        return elements;
    public List<Integer> getElements(){
        List<Integer> elements = new ArrayList<>();
        elements.addAll(Arrays.asList(1 ,2 ,3, 4));
        return  elements;
//        completed
    }
}
