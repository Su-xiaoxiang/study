<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>人培方案管理</title>
    <%--<link rel="stylesheet" href="../../../static/layui/dist/css/layui.css">--%>
    <link rel="stylesheet" href="../../../static/layui2/css/layui.css">
    <style>


    </style>
</head>
<body>
<div class="layui-form" style="padding: 10px;">
    <div class="layui-inline">
        <label>专业名称</label>
        <div class="layui-inline">
            <input type="text" name="majorName" placeholder="请输入专业名称" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label>专业类别</label>
        <div class="layui-inline">
            <select name="typeId">
                <option value="">请选择</option>
                <c:forEach items="${typeList}" var="type">
                    <option value="${type.typeId}">${type.typeName}</option>
                </c:forEach>
            </select>
        </div>
    </div>
    <div class="layui-inline">
        <label>编写时间</label>
        <div class="layui-inline">
            <input type="text" name="startTime" id="startTime" placeholder="开始时间" class="layui-input">
        </div>
        <div class="layui-inline">-</div>
        <div class="layui-inline">
            <input type="text" name="endTime" id="endTime" placeholder="结束时间" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <button class="layui-btn" lay-submit lay-filter="searchBtn">检索</button>
        <button type="button" class="layui-btn layui-btn-normal" id="addBtn">增加</button>
    </div>
</div>

<!-- 数据表格 -->
<table class="layui-table" lay-data="{url:'${pageContext.request.contextPath}/planDoc/data', page:true, id:'dataTable'}"
       lay-filter="test">
    <thead>
    <tr>
        <th lay-data="{type:'numbers', width:60}">编号</th>
        <th lay-data="{field:'majorName', width:180}">专业名称</th>
        <th lay-data="{field:'majorCode', width:120}">专业代码</th>
        <th lay-data="{field:'typeName', width:120}">所属专业类别</th>
        <th lay-data="{field:'occupationCategory', width:180}">主要职业类别</th>
        <th lay-data="{field:'postCategory', width:180}">主要岗位类别</th>
        <th lay-data="{field:'author', width:100}">主编人</th>
        <th lay-data="{field:'writeTime', width:120, templet:function(d){
                    var date = new Date(d.writeTime);
                    var year = date.getFullYear();
                    var month = (date.getMonth() + 1).toString().padStart(2, '0');
                    var day = date.getDate().toString().padStart(2, '0');
                    return year + '-' + month + '-' + day;
                }}">编写时间
        </th>
        <th lay-data="{width:80, toolbar:'#operationBar', fixed:'right'}">操作</th>
    </tr>
    </thead>
</table>

<!-- 添加编辑表单模板 -->
<script type="text/html" id="editForm" style="display:none">
    <form class="layui-form" lay-filter="editForm" style="padding: 20px;">
        <input type="hidden" name="id">
        <div class="layui-form-item">
            <label class="layui-form-label">标题</label>
            <div class="layui-input-block">
                <input type="text" name="majorName" required lay-verify="required" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">专业代码</label>
            <div class="layui-input-block">
                <input type="text" name="majorCode" required lay-verify="required" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">所属专业类别</label>
            <div class="layui-input-block">
                <select name="typeName" required lay-verify="required">
                    <option value="">请选择</option>
                    <c:forEach items="${typeList}" var="type">
                        <option value="${type.typeId}">${type.typeName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">主要职业类别</label>
            <div class="layui-input-block">
                <input type="text" name="occupationCategory" required lay-verify="required" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">主要岗位类别</label>
            <div class="layui-input-block">
                <input type="text" name="postCategory" required lay-verify="required" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">编写人</label>
            <div class="layui-input-block">
                <input type="text" name="author" required lay-verify="required" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="saveBtn">保存</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</script>

<!-- 操作栏模板 -->
<script type="text/html" id="operationBar">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
</script>

<%--<script src="../../../static/layui/dist/layui.js"></script>--%>
<script src="../../../static/layui2/layui.js"></script>
<script>
    layui.use(['table', 'form', 'layer', 'laydate'], function () {
        var form = layui.form,
            table = layui.table,
            layer = layui.layer,
            laydate = layui.laydate,
            $ = layui.$;

        // 日期选择器
        laydate.render({
            elem: '#startTime'
        });
        laydate.render({
            elem: '#endTime'
        });

        // 重新渲染表单，让下拉框生效
        form.render('select');

        // 检索
        form.on('submit(searchBtn)', function (data) {
            table.reload('dataTable', {
                where: data.field,
                page: {curr: 1}
            });
            return false;
        });

        // 打开编辑弹窗
        table.on('tool(test)', function (obj) {
            if (obj.event === 'edit') {
                layer.open({
                    type: 1,
                    title: '修改人培方案',
                    area: ['500px', '600px'],
                    content: $('#editForm').html(),
                    closeBtn: 1,
                    success: function (layero, index)
                        {
                            var data = obj.data; // 不要将 obj.data 转换为 JSON 字符串
                            console.log(JSON.stringify(data));
                            form.val('editForm', {
                                id: data.id,
                                majorName: data.majorName,
                                majorCode: data.majorCode,
                                typeName: data.typeName,
                                occupationCategory: data.occupationCategory,
                                postCategory: data.postCategory,
                                author: data.author,
                            });
                            // 重新渲染表单，让下拉框生效
                            form.render();
                        }
                });
            }
        });

// 保存操作
        form.on('submit(saveBtn)', function (data) {
            console.log(data.field);
            $.ajax({
                url: '${pageContext.request.contextPath}/planDoc/update',
                type: 'POST',
                contentType: 'application/json',
                data: JSON.stringify(data.field),
                success: function (res) {
                    if (res.code === 0) {
                        layer.msg('保存成功', {icon: 1});
                        layer.closeAll('page');
                        table.reload('dataTable');
                    } else {
                        layer.msg(res.msg, {icon: 2});
                    }
                }
            });
            return false;
        });
    });
</script>
</body>
</html>