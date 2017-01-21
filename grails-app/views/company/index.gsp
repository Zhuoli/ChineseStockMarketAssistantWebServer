<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Render Domain</title>
</head>
<body>
<table border="1">
      <tr>
        <th>股票代码</th>
        <th>公司名称</th>
        <th>市盈率</th>
        <th>市净率</th>
        <th>当前价格</th>
      </tr>
    <g:each in="${companyList}" var="viewShare">
        <tr>
            <td><g:fieldValue bean="${viewShare}" field="stockid"/></td>
            <td><g:fieldValue bean="${viewShare}" field="companyname"/></td>
            <td><g:fieldValue bean="${viewShare}" field="per"/></td>
            <td><g:fieldValue bean="${viewShare}" field="pbr"/></td>
            <td><g:fieldValue bean="${viewShare}" field="currentprice"/></td>
        </tr>
    </g:each>
</table>
</body>
</html>