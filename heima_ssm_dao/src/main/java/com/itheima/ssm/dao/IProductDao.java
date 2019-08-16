package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 产品持久层
 */
public interface IProductDao {

    //查找所有产品
    @Select("select * from product")
    public List<Product> findAll() throws Exception;

    //保存一个产品
    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus)values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);
}
