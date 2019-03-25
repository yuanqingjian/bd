package com.bd.system.service;

import com.bd.system.domain.ShopPosition;
import java.util.List;

/**
 * 店铺岗位关系 服务层
 * 
 * @author luxuewei
 * @date 2019-03-25
 */
public interface IShopPositionService 
{
	/**
     * 查询店铺岗位关系信息
     * 
     * @param shopId 店铺岗位关系ID
     * @return 店铺岗位关系信息
     */
	public ShopPosition selectShopPositionById(Integer shopId);
	
	/**
     * 查询店铺岗位关系列表
     * 
     * @param shopPosition 店铺岗位关系信息
     * @return 店铺岗位关系集合
     */
	public List<ShopPosition> selectShopPositionList(ShopPosition shopPosition);
	
	/**
     * 新增店铺岗位关系
     * 
     * @param shopPosition 店铺岗位关系信息
     * @return 结果
     */
	public int insertShopPosition(ShopPosition shopPosition);
	
	/**
     * 修改店铺岗位关系
     * 
     * @param shopPosition 店铺岗位关系信息
     * @return 结果
     */
	public int updateShopPosition(ShopPosition shopPosition);
		
	/**
     * 删除店铺岗位关系信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteShopPositionByIds(String ids);
	
}