<html>
    <head><title>TaskManager</title></head>
    <body><h5><u>ADD TASK</u></h5> <BR>
    <form action="saveTask">
        <table>
            <tr>
                <td><center>TaskId : </center></td>
                <td><center><input type="text" name="taskId"></center></td>
            </tr>
            <tr>
                <td><center>Task Holder Name : </center></td>
                <td><center><input type="text" name="taskHolderName"></center></td>
            </tr>
            <tr>
                <td><center>Task Date : </center></td>
                <td><center><input type="Date" name="taskDate"></center></td>
            </tr>
            <tr>
                <td><center>Task Name : </center></td>
                <td><center><input type="text" name="taskName"></center></td>
            </tr>
            <tr>
                <td><center>Task Status : </center></td>
                <td><center><input tye="text" name="taskStatus"></center></td>
            </tr>
            <tr><td>
                <center><input type="submit" value="ADD"></center>
            </td></tr>
        </table>
    </form>    
    <hr>
    <h5>Get Task by Task HoderName</h5>
    <form action="getTask">
        <input type="text" name="id"><br>
        <input type="submit"  value="GET"><br>
    </form>
    <hr>
    <h5>Delete Task</h5>
    <form action="deleteTask">
        <input type="text" name="id"><br>
        <input type="submit"  value="DELETE"><br>
    </form>
    <hr>
    <h5>Get All Task</h5>
    <form action="alltasks">
        <input type="submit"  value="GET ALL"><br>
    </form>
    <hr>
    </body>
    <h5>Change Task Status</h5>
    <form action="changeStatus">
        <input type="text" name="id"><br>
        <input type="submit"  value="Change Status"><br>
    </form>
    <hr>
</html>