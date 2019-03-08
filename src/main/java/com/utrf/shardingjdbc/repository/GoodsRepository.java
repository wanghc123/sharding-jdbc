package com.utrf.shardingjdbc.repository;

import com.utrf.shardingjdbc.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description:
 * @author: wanghongchun
 * @date: 2019/3/8
 */
public interface GoodsRepository extends JpaRepository<Goods, Long> {
    List<Goods> findAllByGoodsIdBetween(Long goodsId1,Long goodsId2);
    List<Goods> findAllByGoodsIdIn(List<Long> goodsIds);
}
