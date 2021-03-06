package com.bd.system.service;

import com.bd.system.domain.ShopArea;
import java.util.List;

/**
 * 店铺区域 服务层
 * 
 * @author luxuewei
 * @date 2019-03-30
 */
public interface IShopAreaService 
{
	/**
     * 查询店铺区域信息
     * 
     * @param areaId 店铺区域ID
     * @return 店铺区域信息
     */
	public ShopArea selectShopAreaById(Integer areaId);
	
	/**
     * 查询店铺区域列表
     * 
     * @param shopArea 店铺区域信息
     * @return 店铺区域集合
     */
	public List<ShopArea> selectShopAreaList(ShopArea shopArea);
	
	/**
     * 新增店铺区域
     * 
     * @param shopArea 店铺区域信息
     * @return 结果
     */
	public int insertShopArea(ShopArea shopArea);
	
	/**
     * 修改店铺区域
     * 
     * @param shopArea 店铺区域信息
     * @return 结果
     */
	public int updateShopArea(ShopArea shopArea);
		
	/**
     * 删除店铺区域信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteShopAreaByIds(String ids);
	
}
