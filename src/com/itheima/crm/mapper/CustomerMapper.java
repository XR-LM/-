package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;

public interface CustomerMapper {

	/**
	 * 根据queryVo分页查询数据
	 * 
	 * @param queryVo
	 * @return
	 */
	List<Customer> queryCustomerByQueryVo(QueryVo queryVo);

	/**
	 * 根据queryVo查询数据条数
	 * 
	 * @param queryVo
	 * @return
	 */
	int queryCountByQueryVo(QueryVo queryVo);
	/**
	 * 根据id查询客户信息
	 * @param id
	 * @return
	 */
	Customer queryCustomerById(Integer id);
	/**
	 * 根据id跟新用户信息
	 * @param customer
	 */
	void updateCustomerById(Customer customer);
	/**
	 * 根据id删除用户信息
	 * @param customer
	 */
	void deleteCustomerById(Integer id);
	

}
