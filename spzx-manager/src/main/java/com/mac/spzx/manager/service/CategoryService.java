package com.mac.spzx.manager.service;

import com.mac.spzx.model.entity.product.Category;

import java.util.List;

/**
 * @author: Koreyoshi
 * @version: 1.0
 * @date: 2024年07月09日, 11:19:05
 */
public interface CategoryService {

    // 查询商品分类  通过id“懒加载”
    List<Category> getCategoryList(Long parentId);
}