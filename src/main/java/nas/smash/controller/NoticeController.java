package nas.smash.controller;

import nas.smash.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/notice")
public class NoticeController {
    @Autowired
    NoticeRepository noticeRepository;

    @GetMapping
    public String check(){
        return "welcome";
    }

    @GetMapping(path = "/first")
    public List<String> getAllNotice(){
        return noticeRepository.getAllNotice();
    }
}
