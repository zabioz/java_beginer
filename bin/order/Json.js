//fetch, stringify 등 의 사용법 확인
//json 데이터를 정규식으로 고쳐서 출력하기

const json = {
		key:{
		name: "lee",
		number: 1234
		}
}
//console.log(json.key.name)

console.log(JSON.stringify(json))

console.log(JSON.stringify({ x: [10, undefined, function(json){}, {}]}));

postData("https://api.androidhive.info/contacts/",{name: "Johnny Depp"})
	.then(data => console.log(JSON.stringify(data)))
	.catch(error => console.error(error));

function postData(url="", data = {id:"c201"}) {
	return fetch(url,{
		method: 'GET',
		headers:{
			"Content-Type": "application/json",
		},
		body: JSON.stringify(json),
	})
	.then(response => response.json());
}



fetch('https://api.androidhive.info/contacts/')
  .then(function(response) {
    return response.json();

    function postData(url = '', data={}){
    	return fetch(url,)
    }
})
  .then(function(myJson) {
    console.log(JSON.stringify(myJson));
});


//describe("",function(){
//	it("xxx", function() {
//		const xxx = new Regexp(dataformat(new Date(), yyyymmdd) + "")
//
//		return frisby.fetch({"key":{"name":"lee","number":"num"}
//			})
//	})
//}
//)
//}
//JSON.parse(JSON.stringify(result));

