<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Render Domain</title>
</head>
<body>
<table border="1">
      <tr>
        <th>Symbol</th>
        <th>Shares</th>
    <th>Current price</th>
        <th>Earning Report Date</th>
        <th>Average Cost</th>
      </tr>
    <g:each in="${companyList}" var="viewShare">
        <tr>
            <g:set var="symbol" value="${fieldValue(bean:"${viewShare}", field:"symbol")}"/>
            <td><a href="http://finance.sina.com.cn/realstock/company/"><g:fieldValue bean="${viewShare}/nc.shtml" field="stockid"/></a></td>
            <td><g:fieldValue bean="${viewShare}" field="stockid"/></td>
            <td><g:fieldValue bean="${viewShare}" field="companyname"/></td>
        </tr>
    </g:each>
</table>
</body>
</html>