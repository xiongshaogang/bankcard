package com.offke.core.bu.struct.entity;

import javax.persistence.*;

/**
 * TDoordevcardlist entity.
 */
@Entity
@Table(name = "T_DOORDEVCARDLIST")
public class TDoordevcardlist implements java.io.Serializable {

    // Fields    

    private TDoordevcardlistId id;
    private Integer holidayid;
    private Integer cardno;
    private String cardphyid;
    private String cardverno;
    private Integer adddelflag;
    private Integer downstatus;
    private String downtime;
    private String updatetime;

    // Constructors

    /**
     * default constructor
     */
    public TDoordevcardlist() {
    }

    /**
     * minimal constructor
     */
    public TDoordevcardlist(TDoordevcardlistId id, Integer downstatus) {
        this.id = id;
        this.downstatus = downstatus;
    }

    /**
     * full constructor
     */
    public TDoordevcardlist(
            TDoordevcardlistId id,
            Integer holidayid,
            Integer cardno,
            String cardphyid,
            String cardverno,
            Integer adddelflag,
            Integer downstatus,
            String downtime,
            String updatetime) {
        this.id = id;
        this.holidayid = holidayid;
        this.cardno = cardno;
        this.cardphyid = cardphyid;
        this.cardverno = cardverno;
        this.adddelflag = adddelflag;
        this.downstatus = downstatus;
        this.downtime = downtime;
        this.updatetime = updatetime;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "deviceid", column = @Column(name = "DEVICEID", nullable = false)),
            @AttributeOverride(name = "custid", column = @Column(name = "CUSTID", nullable = false)),
            @AttributeOverride(name = "weekid", column = @Column(name = "WEEKID", nullable = false))})
    public TDoordevcardlistId getId() {
        return this.id;
    }

    public void setId(TDoordevcardlistId id) {
        this.id = id;
    }

    @Column(name = "HOLIDAYID")
    public Integer getHolidayid() {
        return this.holidayid;
    }

    public void setHolidayid(Integer holidayid) {
        this.holidayid = holidayid;
    }

    @Column(name = "CARDNO")
    public Integer getCardno() {
        return this.cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }

    @Column(name = "CARDPHYID", length = 16)
    public String getCardphyid() {
        return this.cardphyid;
    }

    public void setCardphyid(String cardphyid) {
        this.cardphyid = cardphyid;
    }

    @Column(name = "CARDVERNO", length = 12)
    public String getCardverno() {
        return this.cardverno;
    }

    public void setCardverno(String cardverno) {
        this.cardverno = cardverno;
    }

    @Column(name = "ADDDELFLAG", precision = 1, scale = 0)
    public Integer getAdddelflag() {
        return this.adddelflag;
    }

    public void setAdddelflag(Integer adddelflag) {
        this.adddelflag = adddelflag;
    }

    @Column(name = "DOWNSTATUS", nullable = false)
    public Integer getDownstatus() {
        return this.downstatus;
    }

    public void setDownstatus(Integer downstatus) {
        this.downstatus = downstatus;
    }

    @Column(name = "DOWNTIME", length = 30)
    public String getDowntime() {
        return this.downtime;
    }

    public void setDowntime(String downtime) {
        this.downtime = downtime;
    }

    @Column(name = "UPDATETIME", length = 30)
    public String getUpdatetime() {
        return this.updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

}