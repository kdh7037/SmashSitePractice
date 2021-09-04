package nas.smash.controller;

import nas.smash.entity.Notice;
import nas.smash.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class NoticeController {
    @Autowired
    NoticeRepository noticeRepository;

    @GetMapping(path = "/first")
    public List<String> getAllNotice(){
        return noticeRepository.getAllNotice();
    }

    @PostMapping
    public String notice(NoticeForm form){
        Notice notice = new Notice();
        notice.setId(form.getId());

        noticeService.join(notice);

        return "redirect:/";
    }
}
