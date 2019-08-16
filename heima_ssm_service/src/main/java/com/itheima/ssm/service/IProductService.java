package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

/**
 * 产品业务层
 */
public interface IProductService {

    //查找所有产品信息
    public List<Product> findAll() throws Exception;

    /**
     * 保存一个产品
     * @param product
     */
    void save(Product product) throws Exception;
}
