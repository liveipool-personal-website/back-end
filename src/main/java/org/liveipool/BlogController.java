package org.liveipool;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liveipool on 2018/4/28.
 */
@RestController
public class BlogController {
    private String bigBackPicUrl = "big hahahah";

    /**
     * 请求：GET /blog/:blogId
     * 返回contentType: application/json
     * responseBody: {
     *      "blog": {
     *          "blogId": 0,
     *          "title": "如何评价中山大学",
     *          "uploadDate": "2018-03-12",
     *          "content": "..."
     *      }
     * }
     */
    @RequestMapping("/blog/{id}")
    public Blog getBlog(@PathVariable int id) {
        Blog blog = new Blog();
        blog.setBlogId(id);
        return blog;
    }

}
