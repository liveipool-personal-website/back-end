package org.liveipool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liveipool on 2018/5/9.
 */
@RestController
@RequestMapping("/about")
public class PersonalInfoController {
    @Autowired
    private PersonalInfoRepository personalInfoRepository;

    /**
     * 请求：GET /ablut/personalInfo
     * 返回contentType: application/json
     * responseBody:
     */
    @RequestMapping("personalInfo")
    @ResponseBody
    public List<PersonalInfo> getCategorys() {
        List<PersonalInfo> list = new ArrayList<PersonalInfo>();
        list = personalInfoRepository.findAll();
        return list;
    }
}
