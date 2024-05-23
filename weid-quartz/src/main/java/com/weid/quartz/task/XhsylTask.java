package com.weid.quartz.task;

import com.weid.common.utils.StringUtils;
import com.weid.quartz.task.service.XhsylApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 定时任务调度测试
 *
 * @author weid
 */
@Component("xhsylTask")
public class XhsylTask {


    public void collectingNotes(Integer keyword_id, String keyword, Integer all_page) {
//        {"keyword_id":3,"keyword":"穿搭","all_page":3}
        System.out.println(StringUtils.format("执行多参方法： keyword_id, keyword, all_page", keyword_id, keyword, all_page));
        XhsylApi.collectingNotes(keyword_id, keyword, all_page);
    }

    public void collectingComment(String noteIds) {
//        {"keyword_id":3,"keyword":"穿搭","all_page":3}

        System.out.println(StringUtils.format("执行多参方法： note_id_list", noteIds));
        XhsylApi.collectingComment(noteIds);
    }

}
