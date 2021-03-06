package com.offke.core.bu.struct.entity;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * TRptdeptledger entity.
 */
@Entity
@Table(name = "T_RPTDEPTLEDGER")
public class TRptdeptledger implements java.io.Serializable {

    // Fields    

    private TRptdeptledgerId id;
    private Integer transtype;
    private Integer transcnt;
    private BigDecimal dramt;
    private BigDecimal cramt;

    // Constructors

    /**
     * default constructor
     */
    public TRptdeptledger() {
    }

    /**
     * minimal constructor
     */
    public TRptdeptledger(TRptdeptledgerId id, Integer transtype) {
        this.id = id;
        this.transtype = transtype;
    }

    /**
     * full constructor
     */
    public TRptdeptledger(
            TRptdeptledgerId id,
            Integer transtype,
            Integer transcnt,
            BigDecimal dramt,
            BigDecimal cramt) {
        this.id = id;
        this.transtype = transtype;
        this.transcnt = transcnt;
        this.dramt = dramt;
        this.cramt = cramt;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "accdate", column = @Column(name = "ACCDATE", nullable = false, length = 8)),
            @AttributeOverride(name = "deptcode", column = @Column(name = "DEPTCODE", nullable = false, length = 30)),
            @AttributeOverride(name = "subjno", column = @Column(name = "SUBJNO", nullable = false, length = 6)),
            @AttributeOverride(name = "summary", column = @Column(name = "SUMMARY", nullable = false, length = 60))})
    public TRptdeptledgerId getId() {
        return this.id;
    }

    public void setId(TRptdeptledgerId id) {
        this.id = id;
    }

    @Column(name = "TRANSTYPE", nullable = false)
    public Integer getTranstype() {
        return this.transtype;
    }

    public void setTranstype(Integer transtype) {
        this.transtype = transtype;
    }

    @Column(name = "TRANSCNT")
    public Integer getTranscnt() {
        return this.transcnt;
    }

    public void setTranscnt(Integer transcnt) {
        this.transcnt = transcnt;
    }

    @Column(name = "DRAMT", precision = 15)
    public BigDecimal getDramt() {
        return this.dramt;
    }

    public void setDramt(BigDecimal dramt) {
        this.dramt = dramt;
    }

    @Column(name = "CRAMT", precision = 15)
    public BigDecimal getCramt() {
        return this.cramt;
    }

    public void setCramt(BigDecimal cramt) {
        this.cramt = cramt;
    }

}