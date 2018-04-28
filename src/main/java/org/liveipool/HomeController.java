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
     * 请求：/home/bigBackPic
     * 请求方式：get
     * 返回contentType: application/json
     * responseBody: { "url": "http://123.123.123.123/big.png" }
         * @return Sring url
     */
    @RequestMapping("/home/bigBackPic")
    public Home getBigBackPic() {
        Home home = new Home();
        home.setUrl(bigBackPicUrl);
        return home;
    }

    @RequestMapping("/home/smallBackPic")
    public Home getSmallBackPic() {
        Home home = new Home();
        home.setUrl(smallBackPicUrl);
        return home;
    }

    @RequestMapping("/home/slogan")
    public Home getSlogan() {
        Home home = new Home();
        home.setSlogan(slogan);
        return home;
    }
}
