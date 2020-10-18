# market-data-service
基于Spring Boot、MyBatis和Vue的行情服务项目

## 后端

后端接受证券代码作为参数，例：

http://localhost:8099/security/find?secuID=000001.SH

返回JSON格式的字符串：
```bash
{"AVGPRICE":1436.98893729,"BUSIDATE":20190806,"BUYPRICE1":0.0,"BUYPRICE2":0.0,"BUYPRICE3":0.0,"BUYPRICE4":0.0,"BUYPRICE5":0.0,"BUYVOLUME1":0,"BUYVOLUME2":0,"BUYVOLUME3":0,"BUYVOLUME4":0,"BUYVOLUME5":0,"CLOSEPRICE":3354.0352,"GYPRICE":0.0,"GYPRICE2":0.0,"HIGHPRICE":3374.9041,"LASTPRICE":3362.9714,"LOWPRICE":3335.0427,"MARKET":"SH","MATCHAMT":2.233418285404E11,"MATCHQTY":1.55423485E8,"MAXDOWNVALUE":-1.0,"MAXRISEVALUE":-1.0,"OPENINTEREST":0,"OPENPRICE":3341.5276,"PREOPENINTEREST":0,"PRESETTPRICE":0.0,"SALEPRICE1":0.0,"SALEPRICE2":0.0,"SALEPRICE3":0.0,"SALEPRICE4":0.0,"SALEPRICE5":0.0,"SALEVOLUME1":0,"SALEVOLUME2":0,"SALEVOLUME3":0,"SALEVOLUME4":0,"SALEVOLUME5":0,"SECU_ID":"000001.SH","SETTPRICE":2909.4933,"STKCODE":"000001","UPDATETIME":102110}
```