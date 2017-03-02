package stockassistancewebserver


import grails.rest.Resource

@Resource(uri='/USMarketCompany')
class USMarketCompany {

    String stockid
    String companyname

    Double currentprice
    Date currentpricetimestamp

    Double openprice
    Double highest_price
    Double lowest_price
    Double close_price

    // 成交量
    String tradingvolume

    // 成交额
    String tradingvalue

    //总市值
    String marketcap

    // 流通市值
    String capitalizationvalue


    //振幅
    String oscillation

    // 换手率
    String turnoverrate
    Double pbr // 市净率 Price-to-book ratio
    Double per // 市盈率
    Date lastUpdateDateTime

    static constraints = {
        stockid blank: false, nullable: false, comment: "股票ID"
        companyname blank: false, nullable: false, comment: "公司名称"
        currentprice blank: false, nullable: true, comment: "Current Price"
        currentpricetimestamp blank: false, nullable: false
        openprice blank:false, nullable:true, comment: "开盘价"
        highest_price blank:false, nullable:true, comment: "最高价"
        lowest_price blank:false, nullable:true, comment: "最低价"
        close_price blank:false, nullable:true, comment: "昨日收盘价"
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