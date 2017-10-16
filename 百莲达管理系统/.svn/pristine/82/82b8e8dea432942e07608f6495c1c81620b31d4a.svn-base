	function openchongzhi(title,url,width,height,top,left) {
		$('#chognzhi').form('clear');
		$('#chongzhi').dialog({
			closed : false,
			modal : false,
			title : title,
			top : top,
			left : left,
			width : width,
			height : height,
			href:url,
			buttons : [ {
				text : '确定',
				iconCls : 'icon-ok',
				handler : addchongzhi
			}, {
				text : '取消',
				iconCls : 'icon-cancel',
				handler : function() {
					$('#chongzhi').dialog('close');
				}
			} ]
		});
	}
	function addchongzhi(){
		$('#chongzhiform').form('submit', {
			url:'ordermain/insert',
			success:function(data){
				if(data){
					$.messager.alert('信息提示','提交成功！','info');
					$('#chongzhi').dialog('close');
				}
				else
				{
					$.messager.alert('信息提示','提交失败！','info');
				}
			}
		});
}
	function openczdl(title,url,width,height,top,left) {
		$('#chognzhi').form('clear');
		$('#chongzhi').dialog({
			closed : false,
			modal : false,
			title : title,
			top : top,
			left : left,
			width : width,
			height : height,
			href:url,
			buttons : [ {
				text : '确定',
				iconCls : 'icon-ok',
				handler : detailinsert
			}, {
				text : '取消',
				iconCls : 'icon-cancel',
				handler : function() {
					$('#chongzhi').dialog('close');
				}
			} ]
		});
	}
	function detailinsert(){
		$('#chongzhiform').form('submit', {
			url:'ordermain/insert',
			success:function(data){
				if(data){
					//明细表提交
					var rows = $('#orderdetailsdg').datagrid("getRows");
					for(var i =0;i<rows.length;i++){
						data=rows[i];
						$.ajax({type:"POST",url:"orderdetail/insert1",dataType:"json",data:rows[i],success:function(json){
							if(json.status>0){ 
							}else{
								
							}
							}});
					}
					$.messager.alert('信息提示','提交成功！','info');
					$('#chongzhi').dialog('close');
				}
				else
				{
					$.messager.alert('信息提示','提交失败！','info');
				}
			}
		});
		
	}
	function openpddl(title,url,width,height,top,left) {
		$('#chognzhi').form('clear');
		$('#chongzhi').dialog({
			closed : false,
			modal : false,
			title : title,
			top : top,
			left : left,
			width : width,
			height : height,
			href:url,
			buttons : [ {
				text : '生成损溢单',
				iconCls : 'icon-ok',
				handler : function (){
					alert("生成损溢单");
				}
			},{
				text : '确定',
				iconCls : 'icon-ok',
				handler : detailinsertpd
			}, {
				text : '取消',
				iconCls : 'icon-cancel',
				handler : function() {
					$('#chongzhi').dialog('close');
				}
			} ]
		});
	}
	function detailinsertpd(){
		$('#checkstore').form('submit', {
			url:'checkmain/insert',
			success:function(data){
				if(data){
					//明细表提交
					var rows = $('#checkdetailsdg').datagrid("getRows");
					for(var i =0;i<rows.length;i++){
						data=rows[i];
						$.ajax({type:"POST",url:"checkdetail/insert1",dataType:"json",data:rows[i],success:function(json){
							if(json.status>0){ 
							}else{
							}
							}});
					}
					$.messager.alert('信息提示','提交成功！','info');
					$('#chongzhi').dialog('close');
				}
				else
				{
					$.messager.alert('信息提示','提交失败！','info');
				}
			}
		});
		
	}
	function Modify_pwd(title,url,width,height,top,left){
		$('#modify_pwd').dialog({
			closed : false,
			modal : false,
			title : title,
			top : top,
			left : left,
			width : width,
			height : height,
			href:url,
			buttons : [ {
				text : '确定',
				iconCls : 'icon-ok',
				handler : submitpass
			}, {
				text : '取消',
				iconCls : 'icon-cancel',
				handler : function() {
					$('#modify_pwd').dialog('close');
				}
			} ]
		});
		
	}
	function submitpass(){
		$('#modify_pwform').form('submit', {
			url:'user/updatePWD',
			success:function(data){
				var json =eval('('+data+')');
				if(json.status>0){
					$.messager.alert('信息提示','提交成功！','info');
					$('#modify_pwd').dialog('close');
				}
				else
				{
					$.messager.alert('信息提示','密码错误或两次密码不一致！','info');
				}
			}
		});
		
	}
