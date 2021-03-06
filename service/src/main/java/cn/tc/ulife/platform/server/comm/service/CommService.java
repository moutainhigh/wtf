package cn.tc.ulife.platform.server.comm.service;

import java.util.List;

import cn.tc.ulife.platform.server.comm.model.ComStructureBean;
import cn.tc.ulife.platform.server.comm.model.CommunityBean;
import cn.tc.ulife.platform.server.comm.model.RoomBean;


/**
 * 社区模块管理业务接口
 * 日期 2017年2月15日
 * 时间 下午1:24:01
 * @author lwy
 *
 */
public interface CommService {
    
    /**
     * 根据地区id获取小区列表
     * 日期 2017年2月17日
     * 时间 上午9:26:52
     * 创建者 lwy
     * @param communityBean
     * @return
     */
    public List<CommunityBean> getCommList(CommunityBean communityBean);
    
    /**
     * 根据地区id获取小区列表 总记录
     * 日期 2017年2月17日
     * 时间 上午9:26:52
     * 创建者 lwy
     * @param communityBean
     * @return
     */
    public String getCommListTotalCount(CommunityBean communityBean);

   /**
    * 根据当前用户获取其所属小区
    * 日期 2017年2月20日
    * 时间 上午11:09:04
    * 创建者 lwy
    * @param communityBean
    * @return
    */
    public List<CommunityBean> getUserCommList(CommunityBean communityBean);
    
   /**
    * 根据当前用户获取其所属小区 总记录
    * 日期 2017年2月20日
    * 时间 上午11:09:22
    * 创建者 lwy
    * @param communityBean
    * @return
    */
    public String getUserCommListTotalCount(CommunityBean communityBean);
    
    /**
     * 查看社区详情
     * 日期 2017年2月21日
     * 时间 上午10:49:59
     * 创建者 lwy
     * @param communityBean
     * @return
     */
    public CommunityBean getCommInfo(CommunityBean communityBean);
    
    /**
     * 新增小区
     * 日期 2017年2月20日
     * 时间 下午1:59:57
     * 创建者 lwy
     * @param bean
     * @return
     */
    public void addComm(CommunityBean bean);
    /**
     * 修改小区
     * 日期 2017年2月20日
     * 时间 下午2:00:15
     * 创建者 lwy
     * @param bean
     * @return
     */
    public void editComm(CommunityBean bean);
    
    /**
     * 启用停用小区
     * 日期 2017年2月20日
     * 时间 下午2:00:22
     * 创建者 lwy
     * @param bean
     * @return
     */
    public void eidtstartOrStopComm(CommunityBean bean);
    /**
     * 设置小区支付方式
     * 日期 2017年2月20日
     * 时间 下午2:00:31
     * 创建者 lwy
     * @param bean
     * @return
     */
    public void addPayment(CommunityBean bean);
    
    /**
     * 设置小区门口机系列
     * 日期 2017年2月20日
     * 时间 下午2:00:42
     * 创建者 lwy
     * @param bean
     * @return
     */
    public void saveDoorMachine(CommunityBean bean);
    
    /**
     * 校验唯一
     * 日期 2017年2月20日
     * 时间 下午3:44:07
     * 创建者 lwy
     * @param sql
     * @param type
     * @return
     */
    public boolean checkUnique(String sql,String type);
    
   /**
    * 获取社区结构列表
    * 日期 2017年2月21日
    * 时间 下午1:25:52
    * 创建者 lwy
    * @param bean
    * @return
    */
    public List<ComStructureBean> getComStructureList(ComStructureBean bean);
    
    /**
     * 获取结构列表中记录
     * 日期 2017年2月21日
     * 时间 下午1:26:10
     * 创建者 lwy
     * @param bean
     * @return
     */
    public String getComStructureTotalCount(ComStructureBean bean);
    /**
     * 新增社区结构
     * 日期 2017年2月21日
     * 时间 下午1:30:23
     * 创建者 lwy
     * @param bean
     */
    public void addComStru(ComStructureBean bean);
    /**
     * 修改社区结构
     * 日期 2017年2月21日
     * 时间 下午1:30:30
     * 创建者 lwy
     * @param bean
     */
    public void editComStru(ComStructureBean bean);
    
    /**
     * 删除社区结构
     * 日期 2017年2月21日
     * 时间 下午1:30:39
     * 创建者 lwy
     * @param bean
     */
    public void delComStru(ComStructureBean bean);
    
    /**
     * 获取房间列表
     * 日期 2017年2月21日
     * 时间 下午1:25:52
     * 创建者 lwy
     * @param bean
     * @return
     */
     public List<RoomBean> getRoomList(RoomBean bean);
     
     /**
      * 获取房间列表总记录
      * 日期 2017年2月21日
      * 时间 下午1:26:10
      * 创建者 lwy
      * @param bean
      * @return
      */
     public String getRoomTotalCount(RoomBean bean);
     
    /**
     * 新增房间
     * 日期 2017年2月21日
     * 时间 下午1:32:24
     * 创建者 lwy
     * @param bean
     */
     public void addRoom(RoomBean bean);
     /**
      * 修改房间
      * 日期 2017年2月21日
      * 时间 下午1:32:29
      * 创建者 lwy
      * @param bean
      */
     public void editRoom(RoomBean bean);
     
     /**
      * 删除房间
      * 日期 2017年2月21日
      * 时间 下午1:32:36
      * 创建者 lwy
      * @param bean
      */
     public void delRoom(RoomBean bean);


}
