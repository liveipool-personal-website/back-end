package org.liveipool;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liveipool on 2018/5/6.
 */
@RestController
@RequestMapping("/blog")
public class CategorysController {
    @Autowired
    private CategorysRepository categorysRepository;

    /**
     * 请求：GET /blog/categorys
     * 返回contentType: application/json
     * responseBody:
     */
    @RequestMapping("categorys")
    @ResponseBody
    public List<Category> getCategorys() {
        List<Category> list = new ArrayList<Category>();
        list = categorysRepository.findAll();
        return list;
    }
}
