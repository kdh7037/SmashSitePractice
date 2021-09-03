package nas.smash.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NoticeRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<String> getAllNotice(){
        List<String> noticeList = new ArrayList<>();
        noticeList.addAll(jdbcTemplate.queryForList("select content from notice",String.class));
        return noticeList;
    }
}
