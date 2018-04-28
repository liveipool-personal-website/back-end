package org.liveipool;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by liveipool on 2018/4/28.
 */
// 这个JsonSerialize是不返回属性为null的值
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class Home {
    private String url;
    private String slogan;

    public String setUrl(String url) {
        return this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String setSlogan(String slogan) {
        return this.slogan = slogan;
    }

    public String getSlogan() {
        return slogan;
    }

}
