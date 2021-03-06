
package cn.tc.ulife.platform.server.pay.service;

import java.util.List;

import cn.tc.ulife.platform.server.pay.model.PayOrderBean;
import cn.tc.ulife.platform.server.pay.model.UpayFsBean;
import cn.tc.ulife.platform.server.shop.model.OrderBean;
import cn.tc.ulife.platform.server.shop.model.OrderLogBean;


public interface UpayService
{
	/**
	 * 获取订单日志
	 * 日期 2016-11-14
	 * 时间 下午2:58:27
	 * 创建者 lwy
	 * @param id
	 * @return
	 */
	public List<OrderLogBean> getOrderLog(OrderBean bean);
	/**
	 * 订单明细
	 * 日期 2016-6-2
	 * 时间 下午1:31:02
	 * 创建者 wbx
	 * @param param
	 * @return
	 */
	public List<OrderBean> getOrderGoodsInfo(OrderBean bean);
	/**
	 * 订单进度查询
	 * 日期 2016-8-24
	 * 时间 下午4:19:33
	 * 创建者 wbx
	 * @param bean
	 * @return
	 */
	public OrderBean getOrderProgress(OrderBean bean);
	/**
	 * 获取订单详情
	 * 日期 2016-11-14
	 * 时间 下午2:52:29
	 * 创建者 lwy
	 * @param bean
	 * @return
	 */
	public OrderBean getOrderByOrderBh(OrderBean bean);
	/**
	 * 获取支付方式
	 * 
	 * @return
	 */
	public List<UpayFsBean> queryPayment(UpayFsBean ufb);
	
	public int queryPaymentTotal(UpayFsBean ufb);

	/**
	 * 新增 支付方式
	 * 
	 * @param ufb
	 * @return
	 */
	public int savePayFs(UpayFsBean ufb);

	/**
	 * 修改支付方式
	 * 
	 * @param ufb
	 * @return
	 */
	public int updPayFs(UpayFsBean ufb);
	
	/**
	 * 交易记录
	 * 
	 * @return
	 */
	public List<PayOrderBean> queryPayOrder(PayOrderBean pob);
	
	/**
	 * 总记录交易记录
	 * 
	 * @return
	 */
	public int queryPayOrderTotal(PayOrderBean pob);
	
	
	/**
	 * 交易记录
	 * 
	 * @return
	 */
	public List<PayOrderBean> queryPayOrderExport(PayOrderBean pob);

}
