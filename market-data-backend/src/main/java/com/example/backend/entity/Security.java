package com.example.backend.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class Security implements Serializable {

    private String SECUID;
    private String MARKET;
    private int BUSIDATE;
    private String STKCODE;
    private double CLOSEPRICE;
    private double OPENPRICE;
    private double LASTPRICE;
    private double HIGHPRICE;
    private double LOWPRICE;
    private double MATCHQTY;
    private double MATCHAMT;
    private double MAXRISEVALUE;
    private double MAXDOWNVALUE;
    private double AVGPRICE;
    private double GYPRICE;
    private double GYPRICE2;
    private double BUYPRICE1;
    private double BUYPRICE2;
    private double BUYPRICE3;
    private double BUYPRICE4;
    private double BUYPRICE5;
    private int BUYVOLUME1;
    private int BUYVOLUME2;
    private int BUYVOLUME3;
    private int BUYVOLUME4;
    private int BUYVOLUME5;
    private double SALEPRICE1;
    private double SALEPRICE2;
    private double SALEPRICE3;
    private double SALEPRICE4;
    private double SALEPRICE5;
    private int SALEVOLUME1;
    private int SALEVOLUME2;
    private int SALEVOLUME3;
    private int SALEVOLUME4;
    private int SALEVOLUME5;
    private int PREOPENINTEREST;
    private int OPENINTEREST;
    private double SETTPRICE;
    private double PRESETTPRICE;
    private int UPDATETIME;

    @JSONField(name = "SECU_ID")
    public String getSECUID() { return SECUID; }

    @JSONField(name = "MARKET")
    public String getMARKET() {
        return MARKET;
    }

    @JSONField(name = "BUSIDATE")
    public int getBUSIDATE() { return BUSIDATE; }

    @JSONField(name = "STKCODE")
    public String getSTKCODE() {
        return STKCODE;
    }

    @JSONField(name = "CLOSEPRICE")
    public double getCLOSEPRICE() {
        return CLOSEPRICE;
    }

    @JSONField(name = "OPENPRICE")
    public double getOPENPRICE() {
        return OPENPRICE;
    }

    @JSONField(name = "LASTPRICE")
    public double getLASTPRICE() {
        return LASTPRICE;
    }

    @JSONField(name = "HIGHPRICE")
    public double getHIGHPRICE() {
        return HIGHPRICE;
    }

    @JSONField(name = "LOWPRICE")
    public double getLOWPRICE() {
        return LOWPRICE;
    }

    @JSONField(name = "MATCHQTY")
    public double getMATCHQTY() {
        return MATCHQTY;
    }

    @JSONField(name = "MATCHAMT")
    public double getMATCHAMT() {
        return MATCHAMT;
    }

    @JSONField(name = "MAXRISEVALUE")
    public double getMAXRISEVALUE() {
        return MAXRISEVALUE;
    }

    @JSONField(name = "MAXDOWNVALUE")
    public double getMAXDOWNVALUE() {
        return MAXDOWNVALUE;
    }

    @JSONField(name = "AVGPRICE")
    public double getAVGPRICE() {
        return AVGPRICE;
    }

    @JSONField(name = "GYPRICE")
    public double getGYPRICE() {
        return GYPRICE;
    }

    @JSONField(name = "GYPRICE2")
    public double getGYPRICE2() {
        return GYPRICE2;
    }

    @JSONField(name = "BUYPRICE1")
    public double getBUYPRICE1() {
        return BUYPRICE1;
    }

    @JSONField(name = "BUYPRICE2")
    public double getBUYPRICE2() {
        return BUYPRICE2;
    }

    @JSONField(name = "BUYPRICE3")
    public double getBUYPRICE3() {
        return BUYPRICE3;
    }

    @JSONField(name = "BUYPRICE4")
    public double getBUYPRICE4() {
        return BUYPRICE4;
    }

    @JSONField(name = "BUYPRICE5")
    public double getBUYPRICE5() {
        return BUYPRICE5;
    }

    @JSONField(name = "BUYVOLUME1")
    public int getBUYVOLUME1() {
        return BUYVOLUME1;
    }

    @JSONField(name = "BUYVOLUME2")
    public int getBUYVOLUME2() {
        return BUYVOLUME2;
    }

    @JSONField(name = "BUYVOLUME3")
    public int getBUYVOLUME3() {
        return BUYVOLUME3;
    }

    @JSONField(name = "BUYVOLUME4")
    public int getBUYVOLUME4() {
        return BUYVOLUME4;
    }

    @JSONField(name = "BUYVOLUME5")
    public int getBUYVOLUME5() { return BUYVOLUME5; }

    @JSONField(name = "SALEPRICE1")
    public double getSALEPRICE1() { return SALEPRICE1; }

    @JSONField(name = "SALEPRICE2")
    public double getSALEPRICE2() {
        return SALEPRICE2;
    }

    @JSONField(name = "SALEPRICE3")
    public double getSALEPRICE3() {
        return SALEPRICE3;
    }

    @JSONField(name = "SALEPRICE4")
    public double getSALEPRICE4() {
        return SALEPRICE4;
    }

    @JSONField(name = "SALEPRICE5")
    public double getSALEPRICE5() {
        return SALEPRICE5;
    }

    @JSONField(name = "SALEVOLUME1")
    public int getSALEVOLUME1() {
        return SALEVOLUME1;
    }

    @JSONField(name = "SALEVOLUME2")
    public int getSALEVOLUME2() {
        return SALEVOLUME2;
    }

    @JSONField(name = "SALEVOLUME3")
    public int getSALEVOLUME3() {
        return SALEVOLUME3;
    }

    @JSONField(name = "SALEVOLUME4")
    public int getSALEVOLUME4() {
        return SALEVOLUME4;
    }

    @JSONField(name = "SALEVOLUME5")
    public int getSALEVOLUME5() {
        return SALEVOLUME5;
    }

    @JSONField(name = "PREOPENINTEREST")
    public int getPREOPENINTEREST() {
        return PREOPENINTEREST;
    }

    @JSONField(name = "OPENINTEREST")
    public int getOPENINTEREST() {
        return OPENINTEREST;
    }

    @JSONField(name = "SETTPRICE")
    public double getSETTPRICE() {
        return SETTPRICE;
    }

    @JSONField(name = "PRESETTPRICE")
    public double getPRESETTPRICE() {
        return PRESETTPRICE;
    }

    @JSONField(name = "UPDATETIME")
    public int getUPDATETIME() {
        return UPDATETIME;
    }

}
