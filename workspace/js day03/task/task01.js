

//1. 학생의 정보를 저장하는 객체를 만들고 그 학생의 정보를 출력하기
//학생정보 : 이름, 나이, 성적(1과목)

//1) 객체에 최소 3명의 데이터를 추가하고 이름과 성적 출력하기

const students = [
  { name: '짱구', age: 8, score: 15 },
  { name: '철수', age: 10, score: 90 },
  { name: '유리', age: 13, score: 88 }
];

students.forEach(student => {
  console.log(`이름: ${student.name} | 성적: ${student.score}`);
});


// 이름: 짱구 | 성적: 15
// 이름: 철수 | 성적: 90
// 이름: 유리 | 성적: 88


//2) 객체에서 이름 키에 해당하는 값들만 출력하기

students.forEach(student => {
  console.log(student.name);
});


// 짱구
// 철수
// 유리


//3) 객체에 새로운 속성(학년)을 추가하고 객체 전체 출력하기(for문 사용)

for (let i = 0; i < students.length; i++) {
  const age = students[i].age;

  if (age >= 13) {
    students[i].grade = '6학년';
  } else if (age >= 10) {
    students[i].grade = '3학년';
  } else if (age >= 8) {
    students[i].grade = '1학년';
  } else {
    students[i].grade = '유치원생';
  }
}

students.forEach(student => {
  console.log(student);
});

// { name: '짱구', age: 8, score: 15, grade: '1학년' }
// { name: '철수', age: 10, score: 90, grade: '3학년' }
// { name: '유리', age: 13, score: 88, grade: '6학년' }

//2. 배열의 모든 요소를 2배로 증가시켜 새로운 배열을 만들어 출력하기
//1) 2배 증가시켜 새로운 배열로 출력하기

// 배열 선언
let arr = [1, 2, 3, 5, 6, 5, 7, 3, 6, 7, 8];
console.log(arr);

// [
//   1, 2, 3, 5, 6,
//   5, 7, 3, 6, 7,
//   8
// ]

// 2배 증가시키고 확인
const newArr = arr.map(function (element, index, array) {
  return element * 2;
});
console.log(newArr);

// [
//    2,  4, 6, 10, 12,
//   10, 14,  6, 12, 14,
//   16
// ]


//2) 배열의 길이를 구하고 출력하기

let arr1 = [1, 2, 3, 5, 3, 5, 7, 3, 6, 11, 6];
console.log(arr1);

const arr3 = arr1.map(function (element, index, array) {
  return element;
});

console.log(arr3.length); // 11

//3) 배열에서 특정요소를 삭제하기(3) 메소드 사용

let filteredArr = arr.filter(num => num !== 3);

console.log(filteredArr);

//4) 배열에서 특정 값(cat)을 검색하고 그 값의 인덱스 출력하기
const animals = ['dog', 'cat', 'rabbit'];

let filteredanimals = animals.filter(String => String !== 'cat');
console.log(filteredanimals);

//5) 배열의 첫번째와 마지막요소를 제거한 뒤 남은 배열 출력하기
const colors = ['red', 'blue', 'green', 'yellow'];

const result = colors.slice(1, -1);
console.log(result);

//3. 혼합문제
//1) 배열의 요소를 객체로 변환하여 새로운 배열을 만들기
//  주어진 배열의 값을 객체의 value 속성으로 저장할것
const data = [10, 20, 30];

const objectArray = data.map(num => ({value : num}));

console.log(objectArray);

//출력결과 : [{value: 10}, {value: 20}, {value: 30}]

//2) 배열을 활용하여 특정값을 기준으로 객체 업데이트하기

const users = [
  { id: 1, name: "짱구", age: 5, subject: 'javascript' },
  { id: 2, name: "철수", age: 5, subject: 'javascript' },
  { id: 3, name: "맹구", age: 5, subject: 'javascript' },
];
//id가 2인 객체의 나이를 6으로 변경, subject를 'web표준'으로 변경

// const users2 = users.map(user =>
//   user.id === 2
//     ? { ...user, age: 6, subject: 'web표준' }
//     : user
// );

const users2 = users.map(user => {
  if (user.id === 2) {
    return {
      id: user.id,
      name: user.name,
      age: 6,
      subject: 'web표준'
    };
  } else {
    return user;
  }
});

console.log(users2);

//3) 배열의 요소를 모두 더하여 총합 출력하기
const numbers2 = [2, 5, 20, 10];

const total = numbers2.reduce((sum, num) => sum + num, 0);

console.log(`총합: ${total}`); 

// 총합: 37
