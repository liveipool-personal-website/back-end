package org.liveipool;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by liveipool on 2018/4/28.
 */
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class Blog {
    private int blogId;
    private String title;
    private String uploadDate;
    private String category;

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
