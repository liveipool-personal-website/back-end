package org.liveipool;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liveipool on 2018/4/28.
 */
@RestController
public class HomeController {
    private String bigBackPicUrl = "big hahahah";
    private String smallBackPicUrl = "small hhhhh";
    private String slogan = "李为的个人网站";

    /**
     * 请求：GET /home/bigBackPic
     * 返回contentType: application/json
     * responseBody: { "url": "http://123.123.123.123/big.png" }
     */
    @RequestMapping("/home/bigBackPic")
    public Home getBigBackPic() {
        Home home = new Home();
        home.setUrl(bigBackPicUrl);
        return home;
    }

    /**
     * 请求：GET /home/smallBackPic
     * 返回contentType: application/json
     * responseBody: { "url": "http://123.123.123.123/small.png" }
     */
    @RequestMapping("/home/smallBackPic")
    public Home getSmallBackPic() {
        Home home = new Home();
        home.setUrl(smallBackPicUrl);
        return home;
    }

    /**
     * 请求：GET /home/slogan
     * 返回contentType: application/json
     * responseBody: { "slogan": "李为的个人网站" }
     */
    @RequestMapping("/home/slogan")
    public Home getSlogan() {
        Home home = new Home();
        home.setSlogan(slogan);
        return home;
    }
}
