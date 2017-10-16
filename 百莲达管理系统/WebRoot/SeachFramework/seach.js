function ullist(ul, data) {
			var datecount = 0;
			var selectcount = 0;
			var index = 0;
			var andor = [ "并且", "或者" ];
			// 0= 1> 2< 3>= 4<= 5<> 6in 7notin 8bettow 9likel 10liker  11likea
			var math = [ "等于", "大于", "小于", "大于等于", "小于等于", "不等于", "包含", "不包含",
					"区间", "左相同", "右相同", "全相同" ];

			$(document).on("change", ".list", function(e) {
				var index = $(e.currentTarget).prev().prev().val();
				for ( var i = 0; i < data.length; i++) {
					if (data[i].rely >= 0 && data[i].rely == index) {
						var as=$(e.currentTarget).parent().parent().find(".opt");
						for(var a=0;a<as.size();a++)
						if(parseInt($(as.get(a)).val())==i)changer(as.get(a));
					}
				}

			});
			this.init = function() {
				this.additem();
				changer($("select").get(0));
			};
			this.ready = function() {
				allready();
			};

			this.additem = function() {
				var li = $("<li></li>").css({
					display : "inline",
					"line-height" : "35px",
					"padding-left" : "3px"
				});
				var all = getselectjson(data, {
					width : "180px",
					height : "25px",
					"margin-right" : "2px"
				}, index);

				all.change(function(e) {
					changer(e.currentTarget);
				});
				li.append(all);
				var mh = getselect(math, {
					width : "70px",
					height : "25px",
					"margin-right" : "2px"
				}, "math");
				mh.change(function(e) {
					mathchanger(e.currentTarget);
				});
				li.append(mh);
				li.append(getinput(data[0].type, index));
				li.append(getselect(andor, {
					width : "50px",
					height : "25px",
					"margin-left" : "2px"
				}, "andor"));
				ul.append(li);
				ul.append($("<br/>"));
				index++;
				changer(all.get(0));
			}

			function getinput(type, index) {
				switch (type) {
				case 0:
				case 1:
					return $("<input type='number' class='i"+index+"'></input>")
							.css({
								width : "150px",
								height : "25px"
							});
				case 2:
					return $("<input type='text' class='i"+index+"'></input>")
							.css({
								width : "150px",
								height : "25px"
							});
				case 3:
					return $("<input type='date' class='i"+index+"' >").css({
						width : "150px",
						height : "25px"
					});
				case 4:
					return $("<input type='time' class='i"+index+"' >").css({
						width : "150px",
						height : "25px"
					});
				case 5:
					return $("<select  class='list i"+index+"'></select>").css(
							{
								width : "150px",
								height : "25px"
							});
				case 6:
					return $("<select  class='index i"+index+"'></select>")
							.css({
								width : "150px",
								height : "25px"
							});
				case 7:
					var arr = $("<tmp class='tmp"+index+"'></tmp>");
					arr.append($(
							"<input type='text' class='i"+index+"'></input>")
							.css({
								width : "70px",
								height : "25px",
								"margin-right" : "2px"
							}));
					arr.append($(
							"<input type='text' class='ia"+index+"'></input>")
							.css({
								width : "70px",
								height : "25px"
							}));
					return arr;

				}
			}
			function setmath(li, type) {
				li.find(".math option").removeAttr("disabled");
				switch (type) {
				case 0:
				case 1:
					li.find(".math option[value='9']").attr("disabled",
							"disabled");
					li.find(".math option[value='10']").attr("disabled",
							"disabled");
					li.find(".math option[value='11']").attr("disabled",
							"disabled");
					li.find(".math").val(0);
					break;
				case 2:
				case 3:
				case 4:
					li.find(".math option[value='6']").attr("disabled",
							"disabled");
					li.find(".math option[value='7']").attr("disabled",
							"disabled");
					li.find(".math option[value='8']").attr("disabled",
							"disabled");
					li.find(".math").val(0);
					break;
				case 5:
				case 6:
					li.find(".math option[value!='0']").attr("disabled",
							"disabled");
					li.find(".math").val(0);
					break;
				case 7:
					li.find(".math option[value!='8']").attr("disabled",
							"disabled");
					li.find(".math").val(8);
					break;
				}
			}
			function mathchanger(s) {
				var p = $(s);
				var v = parseInt(p.val());
				var i = p.prev().attr("index");
				switch (v) {
				case 8:
					var o = getinput(7, i);
					o.replaceAll($(".i" + i));
					break;
				case 6:
				case 7:
					var o = getinput(2, i);
					if (p.parent().find("tmp").size() > 0) {
						o.replaceAll($(".tmp" + i));
					} else {
						o.replaceAll($(".i" + i));
					}
					break;
				case 9:
				case 10:
				case 11:
					var o = getinput(2, i);
					if (p.parent().find("tmp").size() > 0) {
						o.replaceAll($(".tmp" + i));
					} else {
						o.replaceAll($(".i" + i));
					}
					break;
				default:
					var o = getinput(0, i);
					if (p.parent().find("tmp").size() > 0) {
						o.replaceAll($(".tmp" + i));
					} else {
						o.replaceAll($(".i" + i));
					}
					break;
				}
			}
			function changer(s) {
				var p = $(s);
				var i = p.attr("index");
				var d = data[parseInt(p.val())];
				var type = d.type;
				var o = getinput(type, i);
				if (p.parent().find("tmp").size() > 0) {
					o.replaceAll($(".tmp" + i));
				} else {
					o.replaceAll($(".i" + i));
				}
				setmath(p.parent(), type);
				p.attr("col", d.tablename + "." + d.colname);
				p.attr("type", d.type);

				if (type == 5) {
					var param = {};

					if (d.rely >= 0) {

						var id = getrelyid(d.rely);
						if (id > 0) {
							param.id = id;
						} else {
							MsgDialog("依赖项未选择，不能进行查询");
							var ind = getrelyindex(d.rely);
							p.val(ind);
							changer(p.get(0));
							return;
						}
					}
					$.getJSON(d.url, param, function(json) {
						for ( var i = 0; i < json.length; i++) {
							o.append($("<option value='"+json[i].id+"'>"
									+ json[i].name + "</option>"));
						}
					});
				}
				if (type == 6) {
					$.getJSON(d.url, {}, function(json) {
						for ( var i = 0; i < json.length; i++) {
							o.append($("<option value='"+i+"'>" + json[i]
									+ "</option>"));
						}
					});
				}
			}
			//检验依赖的项存在并获取值
			function getrelyid(index) {
				var s = $(".opt").size();
				for ( var i = 0; i < s; i++) {
					var x = parseInt($($(".opt").get(i)).val());
					if (x == index) {
						return $($(".opt").get(i)).next().next().val();
					}
				}
				return 0;
			}
			//检验依赖的项存在并获取值
			function getrelyindex(index) {
				var s = $(".opt").size();
				for ( var i = 0; i < s; i++) {
					var x = parseInt($($(".opt").get(i)).val());
					if (x == index) {
						return i;
					}
				}
				return 0;
			}

			function getselect(data, style, cls) {
				var s = $("<select class='"+cls+"'></select>").css(style);
				for ( var i = 0; i < data.length; i++) {
					s
							.append($("<option value='"+i+"'>" + data[i]
									+ "</option>"));
				}
				return s;
			}
			function getselectjson(data, style, index) {
				var s = $(
						"<select col='"+data[0].tablename+"."+data[0].colname+"' type='"+data[0].type+"' class='opt' index='"+index+"'></select>")
						.css(style);
				for ( var i = 0; i < data.length; i++) {
					s.append($("<option value='"+i+"'>" + data[i].lable
							+ "</option>"));
				}
				return s;
			}

			function allready() {
			}

		}



