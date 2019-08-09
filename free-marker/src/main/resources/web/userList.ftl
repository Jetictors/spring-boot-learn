<!DOCTYPE html>
<html lang="en">

    <head>
        <title>UserList</title>
    </head>

    <body>
        this is UserList Page
        <br/>
        <table border="1px">
            <tr>
                <td>userId</td>
                <td>userName</td>
                <td>pwd</td>
                <td>nickName</td>
                <td>age</td>
                <td>sex</td>
            </tr>
            <#list userList as user>
                <tr>
                    <td>${user.userId}</td>
                    <td>${user.userName}</td>
                    <td>${user.pwd}</td>
                    <td>${user.nickName}</td>
                    <td>${user.age}</td>
                    <td>${user.sex}</td>
                </tr>
            </#list>
        </table>
    </body>

</html>