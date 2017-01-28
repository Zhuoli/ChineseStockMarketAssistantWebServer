<!DOCTYPE html>
<html>
    <head>
        <title>Render Domain</title>
        <meta name="viewport" content="main, width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
        <script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
        <style>
        th {
            border-bottom: 1px solid #d6d6d6;
        }

        tr:nth-child(even) {
            background: #e9e9e9;
        }
        </style>
    </head>

    <body>
    <div  data-role="main" class="ui-content">
        <form>
            <input id="filterTable-input" data-type="search" placeholder="Search...">
        </form>
        <table data-role="table" data-mode="columntoggle" class="ui-responsive ui-shadow" id="myTable" data-filter="true" data-input="#filterTable-input">
            <thead>
            <tr>
                <th data-priority="2">股票代码</th>
                <th data-priority="1">公司名称</th>
                <th data-priority="3">市盈率</th>
                <th data-priority="4">市净率</th>
                <th data-priority="5">当前价格</th>
                <th>上次跟新时间</th>
             </tr>
            </thead>
            <tbody>
            <g:each in="${companyList}" var="viewShare">
                <tr>
                    <td><g:link url="http://finance.sina.com.cn/realstock/company/${viewShare.stockid}/nc.shtml">${viewShare.stockid}</g:link></td>
                    <td>${viewShare.companyname}</td>
                    <td>${viewShare.per}</td>
                    <td>${viewShare.pbr}</td>
                    <td>${viewShare.currentprice}</td>
                    <td>${viewShare.currentpricetimestamp}</td>
                </tr>
            </g:each>
            </tbody>
        </table>
        </div>
    </body>
</html>