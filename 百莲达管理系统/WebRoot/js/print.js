
function CreateFormPage(strPrintName, printDatagrid) {
    var tableString = '<div><h3 align=center>'+strPrintName+'</h3></div><table cellspacing="0" class="pb">';//璁剧疆琛ㄥご
    var frozenColumns = printDatagrid.datagrid("options").frozenColumns;  
    var columns = printDatagrid.datagrid("options").columns;    
    var nameList = '';

   
    if (typeof columns != 'undefined' && columns != '') {
        $(columns).each(function (index) {
            tableString += '\n<tr>';
            if (typeof frozenColumns != 'undefined' && typeof frozenColumns[index] != 'undefined') {
                for (var i = 0; i < frozenColumns[index].length; ++i) {
                    if (!frozenColumns[index][i].hidden) {
                        tableString += '\n<th width="' + frozenColumns[index][i].width + '"';
                        if (typeof frozenColumns[index][i].rowspan != 'undefined' && frozenColumns[index][i].rowspan > 1) {
                            tableString += ' rowspan="' + frozenColumns[index][i].rowspan + '"';
                        }
                        if (typeof frozenColumns[index][i].colspan != 'undefined' && frozenColumns[index][i].colspan > 1) {
                            tableString += ' colspan="' + frozenColumns[index][i].colspan + '"';
                        }
                        if (typeof frozenColumns[index][i].field != 'undefined' && frozenColumns[index][i].field != '') {
                            nameList += ',{"f":"' + frozenColumns[index][i].field + '", "a":"' + frozenColumns[index][i].align + '"}';
                        }
                        tableString += '>' + frozenColumns[0][i].title + '</th>';
                    }
                }
            }
            for (var i = 0; i < columns[index].length; ++i) {
                if (!columns[index][i].hidden) {
                    tableString += '\n<th width="' + columns[index][i].width + '"';
                    if (typeof columns[index][i].rowspan != 'undefined' && columns[index][i].rowspan > 1) {
                        tableString += ' rowspan="' + columns[index][i].rowspan + '"';
                    }
                    if (typeof columns[index][i].colspan != 'undefined' && columns[index][i].colspan > 1) {
                        tableString += ' colspan="' + columns[index][i].colspan + '"';
                    }
                    if (typeof columns[index][i].field != 'undefined' && columns[index][i].field != '') {
                        nameList += ',{"f":"' + columns[index][i].field + '", "a":"' + columns[index][i].align + '"}';
                    }
                    tableString += '>' + columns[index][i].title + '</th>';
                }
            }
            tableString += '\n</tr>';
        });
    }

    var rows = printDatagrid.datagrid("getRows");
    var nl = eval('([' + nameList.substring(1) + '])');
    for (var i = 0; i < rows.length; ++i) {
        tableString += '\n<tr>';
        $(nl).each(function (j) {
            var e = nl[j].f.lastIndexOf('_0');

            tableString += '\n<td';
            if (nl[j].a != 'undefined' && nl[j].a != '') {
                tableString += ' style="text-align:' + nl[j].a + ';"';
            }
            tableString += '>';
            if (e + 2 == nl[j].f.length) {
                tableString += rows[i][nl[j].f.substring(0, e)];
            }
            else
                tableString += rows[i][nl[j].f];
            tableString += '</td>';
        });
        tableString += '\n</tr>';
    }
    tableString += '\n</table>'; 
    
    return tableString;  //杩斿洖鐢熸垚鐨勮〃鏍煎瓧绗︿覆
}
function openPrintdl(title,selector,dlselector,iframeselector){
	var contentstring = CreateFormPage(title,$(selector));  //璋冪敤涓婇潰鐨勬柟娉�
	
	$(dlselector).dialog({
		top:10,
		left:200,
	    title: '鎵撳嵃棰勮',
	    width: 1000,
	    height:400,
	    closed: false,
	    cache: false,
	    modal: true,
	    toolbar:'.menutb'
	});
		//鎵撳紑dialog涔嬪悗锛屽姞杞絠frame
		$(iframeselector).attr("src","../myprint.jsp?contentstring="+contentstring);
		
		$('.file').menu({
		    onClick:function(item){
				if(item.text=="鎵撳嵃")$(iframeselector)[0].contentWindow. woyaoprint(); //璇ユ柟娉曞湪myprint.jsp椤典腑
		    }
		});
		$('.setting').menu({
		    onClick:function(item){
				if(item.text=="鏄剧ず鍒惰〃鏃堕棿")$(iframeselector)[0].contentWindow.opendate();//璇ユ柟娉曞湪myprint.jsp椤典腑
				if(item.text=="涓嶆樉绀哄埗琛ㄦ椂闂�)$(iframeselector)[0].contentWindow.closedate();//璇ユ柟娉曞湪myprint.jsp椤典腑
		    }
		});
}
