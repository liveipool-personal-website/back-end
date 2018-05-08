package org.liveipool;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by liveipool on 2018/5/8.
 */
public interface BlogInfoRepository extends JpaRepository<BlogInfo,String> {
    public BlogInfo findByBlogId(int BlogId);
}
