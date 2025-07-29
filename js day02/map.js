// 13번 : map() 함수

// 배열명.map(callback(element[, index [, array]][, thisArgs]));

let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
console.log(arr);

// 배열의 각 요소에 2를 곱한 값을 새로운 배열로 반환
const newArr1 = arr.map(function (element, index, array){
 return element * 2;
// return index;
});
console.log(newArr1);


// 배열의 각 요소(문자열)를 문자열의 길이만 담은 새로운 배열로 반환
const arr2 = ['java', 'git', 'javascript', 'dbms', 'web'];

// for(let i = 0; i < arr2.length; i++){
//   let arr3 = [];
//   arr3.push(i.length); //push : 상수 추가
// }

const newArr2 = arr2.map(function(element){
  return element.length;
})
console.log(newArr2); // [4, 3, 10, 4, 3 ]

// 배열의 각 객체 특정 프로퍼티 값을 새로운 배열로 반환
const users1 = [
  {name : '짱구', age : 5},
  {name : '철수', age : 5},
  {name : '훈이', age : 5},
  {name : '맹구', age : 5},
  {name : '유리', age : 5}
];

console.log(users1);

const names = users1.map(function (element){
  return element.name;
});

console.log(names); // [ '짱구', '철수', '훈이', '맹구', '유리' ]


// thisArgs는 콜백함수 내에서 this 키워드를 사용할 때 참조할 객체를 지정할 수 있다
 const mul = {multi : 2}; //mul 안에서 키값은 multi로 지정되어있음
 const number = [1, 2, 3, 4, 5];
 const numberIdx = number.map(function(element, index, array){
  return{
    element : element * this.multi, //this가 없으면 multi(키값)을 찾을 수 없어서 오류 발생
    index : index,
    array : array
  }
 }, mul);
console.log(numberIdx);













