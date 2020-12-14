package com.wisdom.agriculture.repository;

import com.wisdom.agriculture.domain.News;
import org.hibernate.validator.constraints.EAN;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 作者：ledendary-666
 * 创建时间：2019/4/10 0010 10:35
 * 描述：
 */
public interface NewsRepository extends JpaRepository<News, String> {


}
