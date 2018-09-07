<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${ctx}/common/js/jquery.min.js"></script>
<script type="text/javascript">
$.ajax({
			type: "get", 
			url: "/test/first",
			data:{"userId":"333"},
			dataType:'json',
			success: function(result){
				console.log(result)
			}
		}); 
</script>
</head>
<body>
就得紧紧的11
</body>
</html>