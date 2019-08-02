package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Item;

import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
public interface ItemService {
    List<Item> getItems(String orderId);//根据订单id获取商品列表
    void decreaseNumbers(List<Item> list);//减少商品库存
}
