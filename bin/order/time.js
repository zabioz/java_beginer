//json Date 시간데이터와 시간데이터의일부를 정규식으로 고쳐서 출력하기

function formatDate(date) {
    var dateformat = new Date(date),
    	year = date.getFullYear(),
        month = (date.getMonth() + 1),
        day = date.getDate(),
        hour = date.getHours(),
        min = date.getMinutes(),
        sec = date.getSeconds(),
        milsec = date.getMilliseconds();
    
    if (month.length < 2) 
        month = '0' + month;
    if (day.length < 2) 
        day = '0' + day;

    return ({year, month, day, hour, min, sec, milsec})
}

//ver2

format = function date2str(x, y) {
    var z = {
        M: x.getMonth() + 1,
        d: x.getDate(),
        h: x.getHours(),
        m: x.getMinutes(),
        s: x.getSeconds()
    };
    y = y.replace(/(M+|d+|h+|m+|s+)/g, function(v) {
        return ((v.length > 1 ? "0" : "") + eval('z.' + v.slice(-1))).slice(-2)
    });

    return y.replace(/(y+)/g, function(v) {
        return x.getFullYear().toString().slice(-v.length)
    });
}

time = function (a){
	a = a.replace(/.\d{2}[+]9:00)/g)
			return a
	}

void format (String time){
	naiyou = 
	 val a = /.\d{2}[+]9:00)/g
			return 
	};

console.log(format(new Date(), 'yyyy-MM-ddThh:mm.ss')+"+9:00")

console.log(RegExp(format(new Date(), 'yyyy-MM-ddThh:mm:ss')+".\d{2}[+]9:00"))
