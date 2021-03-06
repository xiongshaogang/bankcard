package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TWatertransdtl entity.
 */
@Entity
@Table(name = "T_WATERTRANSDTL")
public class TWatertransdtl implements java.io.Serializable {

    // Fields    

    private TWatertransdtlId id;
    private String acctime;
    private String transdate;
    private String transtime;
    private Long refno;
    private Integer transcode;
    private Integer custid;
    private String custname;
    private String stuempno;
    private Long showcardno;
    private Integer cardno;
    private Integer transflag;
    private Integer cardcnt;
    private BigDecimal cardbefbal;
    private BigDecimal cardaftbal;
    private BigDecimal amount;
    private Integer sysid;
    private String devphyid;
    private Integer devseqno;
    private String coldate;
    private String coltime;
    private String status;
    private Integer errcode;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public TWatertransdtl() {
    }

    /**
     * minimal constructor
     */
    public TWatertransdtl(TWatertransdtlId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public TWatertransdtl(
            TWatertransdtlId id,
            String acctime,
            String transdate,
            String transtime,
            Long refno,
            Integer transcode,
            Integer custid,
            String custname,
            String stuempno,
            Long showcardno,
            Integer cardno,
            Integer transflag,
            Integer cardcnt,
            BigDecimal cardbefbal,
            BigDecimal cardaftbal,
            BigDecimal amount,
            Integer sysid,
            String devphyid,
            Integer devseqno,
            String coldate,
            String coltime,
            String status,
            Integer errcode,
            String remark) {
        this.id = id;
        this.acctime = acctime;
        this.transdate = transdate;
        this.transtime = transtime;
        this.refno = refno;
        this.transcode = transcode;
        this.custid = custid;
        this.custname = custname;
        this.stuempno = stuempno;
        this.showcardno = showcardno;
        this.cardno = cardno;
        this.transflag = transflag;
        this.cardcnt = cardcnt;
        this.cardbefbal = cardbefbal;
        this.cardaftbal = cardaftbal;
        this.amount = amount;
        this.sysid = sysid;
        this.devphyid = devphyid;
        this.devseqno = devseqno;
        this.coldate = coldate;
        this.coltime = coltime;
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
    public TWatertransdtlId getId() {
        return this.id;
    }

    public void setId(TWatertransdtlId id) {
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

    @Column(name = "REFNO", precision = 14, scale = 0)
    public Long getRefno() {
        return this.refno;
    }

    public void setRefno(Long refno) {
        this.refno = refno;
    }

    @Column(name = "TRANSCODE")
    public Integer getTranscode() {
        return this.transcode;
    }

    public void setTranscode(Integer transcode) {
        this.transcode = transcode;
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

    @Column(name = "STUEMPNO", length = 20)
    public String getStuempno() {
        return this.stuempno;
    }

    public void setStuempno(String stuempno) {
        this.stuempno = stuempno;
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

    @Column(name = "TRANSFLAG", precision = 1, scale = 0)
    public Integer getTransflag() {
        return this.transflag;
    }

    public void setTransflag(Integer transflag) {
        this.transflag = transflag;
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