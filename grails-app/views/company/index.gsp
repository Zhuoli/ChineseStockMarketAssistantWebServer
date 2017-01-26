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
            <input id="filterTable-input" data-type="search" placeholder="Search For Customers...">
        </form>
        <table data-role="table" data-mode="columntoggle" class="ui-responsive ui-shadow" id="myTable" data-filter="true" data-input="#filterTable-input">
            <tr>
                <th data-priority="6">股票代码</th>
                <th data-priority="1">公司名称</th>
                <th data-priority="2">市盈率</th>
                <th data-priority="3">市净率</th>
                <th data-priority="4">当前价格</th>
             </tr>
            <g:each in="${companyList}" var="viewShare">
                <tr>
                    <td class="name"><g:fieldValue bean="${viewShare}" field="stockid"/></td>
                    <td class="city"><g:fieldValue bean="${viewShare}" field="companyname"/></td>
                    <td><g:fieldValue bean="${viewShare}" field="per"/></td>
                    <td><g:fieldValue bean="${viewShare}" field="pbr"/></td>
                    <td><g:fieldValue bean="${viewShare}" field="currentprice"/></td>
                </tr>
            </g:each>
        </table>
        </div>
    </body>
</html>