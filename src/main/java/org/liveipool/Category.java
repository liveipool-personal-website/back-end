package org.liveipool;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liveipool on 2018/5/6.
 */
@Entity
@Table(name="categorys")
public class Category {
    @Id
    @Column(name="category")
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
