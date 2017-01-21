package chinesestockassistancewebserver

class Company {

    String stockid
    String companyname
    double currentprice
    Date currentpricetimestamp
    double openprice
    double closeprice
    double marketcap
    double capitalizationvalue
    double tradingvolume
    double tradingvalue
    double oscillation
    double turnoverrate
    int pbr
    int per
    Date lastUpdateDateTime

    static constraints = {
        stockid blank: false, nullable: false, comment: "股票ID"
        companyname blank: false, nullable: false, comment: "公司名称"
        currentprice blank: false, nullable: true, default: 0, comment: "Current Price"
        currentpricetimestamp blank: false, nullable: false
        openprice blank:false, nullable:true, comment: "开盘价"
        closeprice blank:false, nullable:true, comment: "昨日收盘价"
        marketcap blank:false, nullable:true, comment: '总市值'
        capitalizationvalue blank:false, nullable:true, comment: '流通市值'
        tradingvolume blank:false, nullable:true, comment: '成交量'
        tradingvalue blank:false, nullable:true, comment: '成交额'
        oscillation blank:false, nullable:true, comment: '股票振幅'
        turnoverrate blank:false, nullable:true, comment: '换手率'
        pbr blank:false, nullable:true, comment: '市净率 Price-to-book ratio'
        per blank:false, nullable:true, comment: '市盈率'
        lastUpdateDateTime blank:false, nullable:false, comment: "最后一次更新时间"
    }
    static mapping = {
        version false
        id generator:'assigned', name:'stockid'
    }
}

/*
(
   stockid                 VARCHAR(20) NOT NULL COMMENT '股票ID',
   companyname             VARCHAR(20) NOT NULL COMMENT '公司名称',
   currentprice            FLOAT(4, 2) COMMENT 'Current stock price',
   currentpricetimestamp   DATETIME NOT NULL,
   openprice               FLOAT(4, 2) COMMENT '开盘价',
   closeprice              FLOAT(4, 2) COMMENT '昨日收盘价',
   marketcap               FLOAT(4, 2) COMMENT '总市值',
   capitalizationvalue     FLOAT(4, 2) COMMENT '流通市值',
   tradingvolume           FLOAT(4, 2) COMMENT '成交量',
   tradingvalue            FLOAT(4, 2) COMMENT '成交额',
   oscillation             FLOAT(4, 2) COMMENT '股票振幅',
   turnoverrate            FLOAT(4, 2) DEFAULT 0.0 COMMENT '换手率',
   `PBR`                   INT(5)
                              DEFAULT 0
                              COMMENT '市净率 Price-to-book ratio',
   `PER`                   INT(5) DEFAULT 0 COMMENT '市盈率',
   lastUpdateDateTime   DATETIME NOT NULL COMMENT '最后一次更新时间',
   PRIMARY KEY(stockid)
   )CHARACTER SET = utf8
 */