// 2번 : var 키워드(let.js랑 같이 보기)

var data1 = '10';
var data2 = '10';

console.log(data1, typeof data1, typeof (data2));
console.log(data2,typeof data1, typeof (data2));
// typeof 연산자, typeof() 함수 : 값의 자료형을 확인

var data1 = true;
console.log(data1, typeof data1, typeof(data1));

// 호이스팅(hoisting) : 선언의 위치에 상관없이 존재하면 무조건 메모리에 할당이 된다
// 초기화 작업은 호이스팅 되지 않고 선언만 호이스팅 된다
// 즉 아래에서 선언하고 초기화를 진행해도 위에서 읽는게 가능하다
console.log(name, typeof name);
var name = '강승훈';
console.log(name, typeof name);

console.log(age1, typeof age1);

var age1;