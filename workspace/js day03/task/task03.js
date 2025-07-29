//1. 문자열을 인수로 받아 역순으로 뒤집을 결과를 반환하는 함수
// 콜백을 사용하여 문자열을 역순으로 출력

//함수명 printStr()  매개변수 1개
//함수명 reverseStr() 콜백사용
//참고 : split(), reverse(), join()

// split() : 문자열 쪼개기
// reverse() : 배열 순서 뒤집기 
// join() : 배열을 다시 문자열로 합치기

function reverseStr(str) {
    return str.split('').reverse().join('');
}

// 위 함수 자체가 콜백함수로 쓰일 예정
// 다시 문자열(str)로 합쳐서 출력할 예정

function printStr(str, callback) {
    const result = reverseStr(str);
    console.log(result);
  }

printStr("hello java!", reverseStr);

//2.  성과 이름을 전달받아서 풀네임을 만든 뒤 000님 환영합니다 출력하기

//함수명 welcomeUser

// function welcomUser(str, str){
// const firstname = "승훈";
// const lastname = "강";
// return str;
// }
// console.log(`${lastname} + ${firstname}님 환영합니다!`);

function welcomUser(firstname, lastname){
  // const firstname = "강";
  // const lastname = "승훈";
  // return lastname + firstname;
  const fullname = lastname + firstname;
  console.log(`${fullname}님 환영합니다!`)
}
// console.log(`${lastname} + ${firstname}님 환영합니다!`);

// let result = welcomUser("승훈", "강");
welcomUser("승훈", "강");

//3. 사용자 나이를 입력후 성인이면 true반환, 아니면 false 반환

//함수명 isAdult

function isAdult(){
 
}

//4. 객체를 사용해 성적관리 프로그램 만들기
//프로그램이 등록되지 않은 학생은 3명이다
//이름 : 둘리, 나이 : 5, 점수 : 80
//이름 : 도우너, 나이 : 6, 점수 : 50
//이름 : 또치, 나이 : 5, 점수 : 90
// 학생마다의 점수 출력하기(이름 점수 같이 출력할 것)
// 3명을 모두 프로그램에 등록시킨다
// 3명의 학생 정보를 학교 객체로 선언 후에 학교 객체에 등록시킨다

const students = [
  { name: '둘리', age: 5, score: 80 },
  { name: '도우너', age: 6, score: 50 },
  { name: '또치', age: 5, score: 90 }
];

const student1 = { name: '둘리', age: 5, score: 80 };
const student2 = { name: '도우너', age: 6, score: 50 };
const student3 = { name: '또치', age: 5, score: 90 };

//5. 포인트를 각각 객체에 추가하고 순서대로 point는 80, 50, 90이다
//포인트를 모두 더한 값을 출력하라

const point1 = 80;
const point2 = 50;
const point3 = 90;

const mul = (point1, point2, point3, callback) => {
  const product = point1 + point2 + point3;
  callback(product);
};

const multi = result => console.log(point1 + point2 + point3);
mul(80, 50, 90);