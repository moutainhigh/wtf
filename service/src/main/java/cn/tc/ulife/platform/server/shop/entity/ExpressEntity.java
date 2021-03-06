/**
 * @Title: ExpressEntity
 * @Package cn.tc.ulife.platform.server.express.entity
 * @Description: 快递持久对象
 * @author alliswell008
 * @date 2017/2/16 15:04
 * @version V1.0
 * Update Logs:
 * ****************************************************
 * Name:
 * Date:
 * Description:
 * *****************************************************
 */
package cn.tc.ulife.platform.server.shop.entity;

/**
 * @author alliswell008
 * @ClassName: ExpressEntity
 * @Description: 快递持久对象
 * @date 2017/2/16 15:04
 */
public class ExpressEntity {
    /** 快递公司ID*/
    protected String id;

    /** 快递公司名称*/
    protected String kdmc;

    /** 代收金额*/
    protected String dsje;

    /** 快递公司logo*/
    protected String logo;

    /** 联系人名称*/
    protected String name;

    /** 联系方式*/
    protected String tel;

    /** 快递公司地址*/
    protected String dz;

    /** 快递公司状态*/
    protected String zt;

    /** 创建人ID*/
    protected String cid;

    /** 创建时间*/
    protected String ctime;

    /** 修改时间*/
    protected String mtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKdmc() {
        return kdmc;
    }

    public void setKdmc(String kdmc) {
        this.kdmc = kdmc;
    }

    public String getDsje() {
        return dsje;
    }

    public void setDsje(String dsje) {
        this.dsje = dsje;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getMtime() {
        return mtime;
    }

    public void setMtime(String mtime) {
        this.mtime = mtime;
    }
}
