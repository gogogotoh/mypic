package org.example.mypicdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/calendar")
public class CalendarController {
    @GetMapping("/photos")
    public List<Map<String, Object>>getCalanderPhotos(){
        List<Map<String, Object>> events = new ArrayList<>();

        events.add(Map.of(
                "title", "사진1",
                "start", "2025-05-12",
                "url", "images/photo2.png",//프론트에서 사용하는 키
                "postId", 1  //게시글 상세 페이지로 이동할 때 사용할 Id
        ));

        return events;
    }
}
