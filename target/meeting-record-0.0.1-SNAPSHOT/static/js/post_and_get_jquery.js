/**
 * Created by DELL on 17.7.4.
 */
$("#loginSubmit").click(function () {
    var username = $("#username").val();
    var password = $("#password").val();
    $.ajax({
        type:"POST",
        url:"login",
        data:{username:username,password:password},
        success:function (data) {
            if(data.code==100){
                window.location.href="/";
            }else{
                alert("登录失败，请检查账号和密码是否正确");
            }
        }
    })
});

$("#logout").click(function () {
    $.ajax({
        type:"POST",
        url:"logout",
        success:function () {
            window.location.href="/login";
        }
    })
})

$("#addMeetingSubmit").click(function () {
    var meeting_name = $("#meeting_name").val();
    var meeting_depart = $("#meeting_depart option:selected").val();
    var meeting_date = $("#meeting_date").val();
    var meeting_place = $("#meeting_place").val();
    var meeting_host = $("#meeting_host").val();
    var meeting_saver = $("#meeting_saver").val();
    var meeting_type = $("#meeting_type option:selected").val();
    var meeting_present = $("#meeting_present").val();
    var meeting_abstruct = $("#meeting_abstruct").val();
    var meeting_remark = $("#meeting_remark").val();
    var meeting_content = $("#meeting_content").val();
    var meeting_isopen = $("#meeting_isopen").is(":checked");
    if(meeting_isopen==true){
        var open = 1;
    }else{
        var open = 0;
    }
    $.ajax({
        type:"POST",
        url:"addMeetingInfo",
        data:{
            meeting_name:meeting_name,
            meeting_depart:meeting_depart,
            meeting_date:meeting_date,
            meeting_place:meeting_place,
            meeting_host:meeting_host,
            meeting_saver:meeting_saver,
            meeting_type:meeting_type,
            meeting_present:meeting_present,
            meeting_abstruct:meeting_abstruct,
            meeting_remark:meeting_remark,
            meeting_content:meeting_content,
            meeting_isopen:open
        },
        success:function (data) {
            console.log(data);
            if(data.code==100){
                window.location.href="/index";
            }else{
                alert("添加失败！");
            }
        }
    })
});

//日期组件
$("#meeting_date").datetimepicker({
    weekStart: 1,
    todayBtn:  1,
    autoclose: 1,
    todayHighlight: 1,
    startView: 2,
    forceParse: 0,
    showMeridian: 1,
    format: "yyyy-mm-dd",
    minView: 'month'
});

//显示所属部门的信息
$.get("getDepartForSelect",
    function(data){
        if(data.code==100){
            //console.log(data.extend.depart);
            // $.each(data.extend.depart, function (index, item) {
            //     console.log(item.departmentName);
            // })
            $.each(data.extend.depart, function (index, item) {
                var option = $("<option></option>").append(item.departmentName).val(item.departmentId);
                option.appendTo("#meeting_depart");
            })
        }else{
            console.log("获取数据失败");
        }
    });

$.get(
    "getTypeForSelect",
    function(data){
        if(data.code==100){
            //console.log(data.extend.type);
            $.each(data.extend.type, function (index, item) {
                var option = $("<option></option>").append(item.typeName).val(item.typeId);
                option.appendTo("#meeting_type");
            })
        }else{
            console.log("获取数据失败");
        }
    });

$.get(
    "getMeetingWithPage",
    function (data) {
        if(data.code==100){
            console.log(data.extend.meeting);
            $.each(data.extend.meeting, function (index, item) {
                var tdId = $("<td></td>").append(item.meetingId);
                var tdName = $("<td></td>").append(item.meetingName);
                var tdSaver = $("<td></td>").append(item.meetingSaver);
                var tdType = $("<td></td>").append(item.meetingType);
                var tdHost = $("<td></td>").append(item.meetingHost);
                var tdDate = $("<td></td>").append(item.meetingDate);
                var tdDepart = $("<td></td>").append(item.meetingDepartment);

                var editbtn = $("<a></a>").append("编辑").addClass("label label-success").href("editMeeting?meetingId="+item.meetingId);
                var deletebtn = $("<a></a>").append("删除").addClass("label label-danger");
                var tdDetils = $("<tr></tr>").append(editbtn).append(deletebtn);
                $("<tr></tr>").append(tdId)
                    .append(tdName)
                    .append(tdSaver)
                    .append(tdType)
                    .append(tdHost)
                    .append(tdDate)
                    .append(tdDepart)
                    .append(tdDetils)
                    .appendTo("#meeting_list")
            })
        }else{
            console.log("获取数据失败");
        }
    }
)