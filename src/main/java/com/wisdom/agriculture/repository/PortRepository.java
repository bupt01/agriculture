package com.wisdom.agriculture.repository;

import com.wisdom.agriculture.domain.PortData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * create by ledendary-666
 * 2018/10/20 0020 21:11
 *
 * 操作串口
 */
public interface PortRepository extends JpaRepository<PortData,Integer> {

//    public List<Category> findByCategoryTypeIn(List<Integer> catoryList);


    /**
     * 查询最新的一条数据
     * @return 最新的数据
     */
    @Query(nativeQuery = true,value = "SELECT * FROM port_data where port_id=(SELECT max(port_id) FROM port_data)")
    PortData findMaxId();



}
