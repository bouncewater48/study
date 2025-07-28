// 4번 : 즉시실행함수

(function(){
  console.log("javascript 2일차 수업");
})();

let result = (function (num1, num2){
  return num1 + num2;
})(10, 20);
console.log(result);

// 모듈패턴(private scope)
const Counter = (function (){
  let count = 0;
  return{
    increment : function(){
      count++;
      return count;
    },
    decrement : function(){
      count--;
      return count;
    },
  };
})();

// count : 은닉화 -> 직접 값을 변경 불가  (모듈 패턴)
console.log(Counter.increment()); //1
console.log(Counter.increment()); //2
console.log(Counter.decrement()); //1

count = 10; //Counter로 바꾸라고 빨간줄 그어져있으나, 바꾸면 오류 뜨니까 바꾸지 말것
console.log(count);

//초기화 코드
(function () {
  const name = '짱구';
  console.log(`${name}, 안녕!`);
})();




