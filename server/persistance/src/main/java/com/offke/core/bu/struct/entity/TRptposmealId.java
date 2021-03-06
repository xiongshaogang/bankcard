package com.offke.core.bu.struct.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TRptposmealId entity.
 */
@Embeddable
public class TRptposmealId implements java.io.Serializable {

    // Fields    

    private String accdate;
    private String accno;
    private Integer deviceid;
    private String summary;
    private String transdate;
    private String mealname;

    // Constructors

    /**
     * default constructor
     */
    public TRptposmealId() {
    }

    /**
     * full constructor
     */
    public TRptposmealId(
            String accdate,
            String accno,
            Integer deviceid,
            String summary,
            String transdate,
            String mealname) {
        this.accdate = accdate;
        this.accno = accno;
        this.deviceid = deviceid;
        this.summary = summary;
        this.transdate = transdate;
        this.mealname = mealname;
    }

    // Property accessors

    @Column(name = "ACCDATE", nullable = false, length = 8)
    public String getAccdate() {
        return this.accdate;
    }

    public void setAccdate(String accdate) {
        this.accdate = accdate;
    }

    @Column(name = "ACCNO", nullable = false, length = 10)
    public String getAccno() {
        return this.accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    @Column(name = "DEVICEID", nullable = false)
    public Integer getDeviceid() {
        return this.deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    @Column(name = "SUMMARY", nullable = false, length = 60)
    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Column(name = "TRANSDATE", nullable = false, length = 8)
    public String getTransdate() {
        return this.transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }

    @Column(name = "MEALNAME", nullable = false, length = 60)
    public String getMealname() {
        return this.mealname;
    }

    public void setMealname(String mealname) {
        this.mealname = mealname;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TRptposmealId))
            return false;
        TRptposmealId castOther = (TRptposmealId) other;

        return ((this.getAccdate() == castOther.getAccdate()) || (this.getAccdate() != null
                && castOther.getAccdate() != null && this
                .getAccdate()
                .equals(
                        castOther
                                .getAccdate())))
                && ((this.getAccno() == castOther.getAccno()) || (this.getAccno() != null
                && castOther.getAccno() != null && this
                .getAccno()
                .equals(
                        castOther
                                .getAccno())))
                && ((this.getDeviceid() == castOther.getDeviceid()) || (this.getDeviceid() != null
                && castOther.getDeviceid() != null && this
                .getDeviceid()
                .equals(
                        castOther
                                .getDeviceid())))
                && ((this.getSummary() == castOther.getSummary()) || (this.getSummary() != null
                && castOther.getSummary() != null && this
                .getSummary()
                .equals(
                        castOther
                                .getSummary())))
                && ((this.getTransdate() == castOther.getTransdate()) || (this.getTransdate() != null
                && castOther.getTransdate() != null && this
                .getTransdate()
                .equals(
                        castOther
                                .getTransdate())))
                && ((this.getMealname() == castOther.getMealname()) || (this.getMealname() != null
                && castOther.getMealname() != null && this
                .getMealname()
                .equals(
                        castOther
                                .getMealname())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getAccdate() == null ? 0 : this.getAccdate().hashCode());
        result = 37 * result + (getAccno() == null ? 0 : this.getAccno().hashCode());
        result = 37 * result + (getDeviceid() == null ? 0 : this.getDeviceid().hashCode());
        result = 37 * result + (getSummary() == null ? 0 : this.getSummary().hashCode());
        result = 37 * result + (getTransdate() == null ? 0 : this.getTransdate().hashCode());
        result = 37 * result + (getMealname() == null ? 0 : this.getMealname().hashCode());
        return result;
    }

}