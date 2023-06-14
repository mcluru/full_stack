package com.lec.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lec.domain.Category;
import com.lec.domain.Goods;

public interface GoodsService {

	Page<Goods> getGoodsList(Pageable pageable, String searchType, String searchWord);

	void insertGoods(Goods goods);

	void deleteGoods(Goods goods);

	Goods getGoods(Goods goods);

	void updateGoods(Goods goods);

}
