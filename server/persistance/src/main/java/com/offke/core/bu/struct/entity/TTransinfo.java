package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TTransinfo entity.
 */
@Entity
@Table(name = "T_TRANSINFO")
public class TTransinfo implements java.io.Serializable {

    // Fields    

    private TTransinfoId id;
    private String acctime;
    private String transdate;
    private String transtime;
    private String coldate;
    private String coltime;
    private Integer transcode;
    private Integer paytype;
    private String voucherno;
    private Integer custid;
    private String custname;
    private Long showcardno;
    private Integer cardno;
    private Integer purseno;
    private Integer cardcnt;
    private BigDecimal cardbefbal;
    private BigDecimal cardaftbal;
    private BigDecimal amount;
    private BigDecimal managefee;
    private String opercode;
    private Integer sysid;
    private String devphyid;
    private Integer devseqno;
    private Integer offlineflag;
    private Integer exttype;
    private String extdata;
    private String revflag;
    private String status;
    private Integer errcode;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TTransinfo() {
    }

    /**
     * minimal constructor
     */
    public TTransinfo(TTransinfoId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TTransinfo(
            TTransinfoId id,
            String acctime,
            String transdate,
            String transtime,
            String coldate,
            String coltime,
            Integer transcode,
            Integer paytype,
            String voucherno,
            Integer custid,
            String custname,
            Long showcardno,
            Integer cardno,
            Integer purseno,
            Integer cardcnt,
            BigDecimal cardbefbal,
            BigDecimal cardaftbal,
            BigDecimal amount,
            BigDecimal managefee,
            String opercode,
            Integer sysid,
            String devphyid,
            Integer devseqno,
            Integer offlineflag,
            Integer exttype,
            String extdata,
            String revflag,
            String status,
            Integer errcode,
            String remark) {
        this.id = id;
        this.acctime = acctime;
        this.transdate = transdate;
        this.transtime = transtime;
        this.coldate = coldate;
        this.coltime = coltime;
        this.transcode = transcode;
        this.paytype = paytype;
        this.voucherno = voucherno;
        this.custid = custid;
        this.custname = custname;
        this.showcardno = showcardno;
        this.cardno = cardno;
        this.purseno = purseno;
        this.cardcnt = cardcnt;
        this.cardbefbal = cardbefbal;
        this.cardaftbal = cardaftbal;
        this.amount = amount;
        this.managefee = managefee;
        this.opercode = opercode;
        this.sysid = sysid;
        this.devphyid = devphyid;
        this.devseqno = devseqno;
        this.offlineflag = offlineflag;
        this.exttype = exttype;
        this.extdata = extdata;
        this.revflag = revflag;
        this.status = status;
        this.errcode = errcode;
        this.remark = remark;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "termid", column = @Column(name = "TERMID", nullable = false)),
            @AttributeOverride(name = "termseqno", column = @Column(name = "TERMSEQNO", nullable = false))})
    public TTransinfoId getId() {
        return this.id;
    }

    public void setId(TTransinfoId id) {
        this.id = id;
    }

    @Column(name = "ACCTIME", length = 6)
    public String getAcctime() {
        return this.acctime;
    }

    public void setAcctime(String acctime) {
        this.acctime = acctime;
    }

    @Column(name = "TRANSDATE", length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "TRANSTIME", length = 6)
    public String getTranstime() {
        return this.transtime;
    }

    public void setTranstime(String transtime) {
        this.transtime = transtime;
    }

    @Column(name = "COLDATE", length = 8)
    public String getColdate() {
        return this.coldate;
    }

    public void setColdate(String coldate) {
        this.coldate = coldate;
    }

    @Column(name = "COLTIME", length = 6)
    public String getColtime() {
        return this.coltime;
    }

    public void setColtime(String coltime) {
        this.coltime = coltime;
    }

    @Column(name = "TRANSCODE")
    public Integer getTranscode() {
        return this.transcode;
    }

    public void setTranscode(Integer transcode) {
        this.transcode = transcode;
    }

    @Column(name = "PAYTYPE")
    public Integer getPaytype() {
        return this.paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    @Column(name = "VOUCHERNO", length = 20)
    public String getVoucherno() {
        return this.voucherno;
    }

    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
    }

    @Column(name = "CUSTID")
    public Integer getCustid() {
        return this.custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    @Column(name = "CUSTNAME", length = 60)
    public String getCustname() {
        return this.custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    @Column(name = "SHOWCARDNO", precision = 10, scale = 0)
    public Long getShowcardno() {
        return this.showcardno;
    }

    public void setShowcardno(Long showcardno) {
        this.showcardno = showcardno;
    }

    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "PURSENO")
    public Integer getPurseno() {
        return this.purseno;
    }

    public void setPurseno(Integer purseno) {
        this.purseno = purseno;
    }

    @Column(name = "CARDCNT")
    public Integer getCardcnt() {
        return this.cardcnt;
    }

    public void setCardcnt(Integer cardcnt) {
        this.cardcnt = cardcnt;
    }

    @Column(name = "CARDBEFBAL", precision = 15)
    public BigDecimal getCardbefbal() {
        return this.cardbefbal;
    }

    public void setCardbefbal(BigDecimal cardbefbal) {
        this.cardbefbal = cardbefbal;
    }

    @Column(name = "CARDAFTBAL", precision = 15)
    public BigDecimal getCardaftbal() {
        return this.cardaftbal;
    }

    public void setCardaftbal(BigDecimal cardaftbal) {
        this.cardaftbal = cardaftbal;
    }

    @Column(name = "AMOUNT", precision = 15)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "MANAGEFEE", precision = 15)
    public BigDecimal getManagefee() {
        return this.managefee;
    }

    public void setManagefee(BigDecimal managefee) {
        this.managefee = managefee;
    }

    @Column(name = "OPERCODE", length = 8)
    public String getOpercode() {
        return this.opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    @Column(name = "SYSID")
    public Integer getSysid() {
        return this.sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    @Column(name = "DEVPHYID", length = 20)
    public String getDevphyid() {
        return this.devphyid;
    }

    public void setDevphyid(String devphyid) {
        this.devphyid = devphyid;
    }

    @Column(name = "DEVSEQNO")
    public Integer getDevseqno() {
        return this.devseqno;
    }

    public void setDevseqno(Integer devseqno) {
        this.devseqno = devseqno;
    }

    @Column(name = "OFFLINEFLAG", precision = 1, scale = 0)
    public Integer getOfflineflag() {
        return this.offlineflag;
    }

    public void setOfflineflag(Integer offlineflag) {
        this.offlineflag = offlineflag;
    }

    @Column(name = "EXTTYPE")
    public Integer getExttype() {
        return this.exttype;
    }

    public void setExttype(Integer exttype) {
        this.exttype = exttype;
    }

    @Column(name = "EXTDATA", length = 30)
    public String getExtdata() {
        return this.extdata;
    }

    public void setExtdata(String extdata) {
        this.extdata = extdata;
    }

    @Column(name = "REVFLAG", length = 1)
    public String getRevflag() {
        return this.revflag;
    }

    public void setRevflag(String revflag) {
        this.revflag = revflag;
    }

    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "ERRCODE")
    public Integer getErrcode() {
        return this.errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    @Column(name = "REMARK", length = 240)
    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}