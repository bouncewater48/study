//1. 나이가 19살 이상이면 입장가능, 19살 미만이면 입장 불가 출력
// 나이가 10살이면 당첨을 출력하고 아니면 다음기회에 출력
// 본인이름, 나이는 상수로 설정, 삼항연산자 사용할 것

const name1 = "강승훈";
const age1 = 27;

const access = age1 >= 19 ? "입장가능" : "입장불가";
const prize = age1 === 10 ? "당첨!" : "다음기회에...";

console.log(`1. ${name1}님은 ${age1}살 ${access}이십니다! 이벤트는 ${prize}`);


//출력결과
// 본인이름님은 00살 입장가능여부는 결과 
// 이벤트 당첨여부
//출력

//2. 점수가 60점 이상이면 합격, 60점 미만이면 불합격출력
// 점수가 100점이면 장학생, 아니면 일반학생 출력
// 학생이름, 점수는 상수로 설정

const name2 = "철수";
const score1 = 100;

const pass = score1 >= 60 ? "합격" : "불합격";
const stutype = score1 === 100 ? "장학생" : "일반학생";

console.log(`2. ${name2}님의 점수는 ${score1}점으로, ${pass}입니다. 또한 ${name2}님은 ${stutype}입니다`);

//3. 학생의 이름과 성적을 입력받아서 성적에 따른 학점 출력
// 90점 이상 : A, 80점 이상 : B,  70점이상 : C, 그외 : F

const name3 = "짱구";
const score2 = 78;

let grade = "";

if (score2 >= 90) {
    grade = "A";
  } else if (score2 >= 80) {
    grade = "B";
  } else if (score2 >= 70) {
    grade = "C";
  } else {
    grade = "F";
  }

  console.log(`3. ${name3}님의 점수는 ${score2}점으로, 학점은 ${grade}입니다.`)

//4. 1부터 100까지의 숫자중 3, 6, 9의 배수 합계 출력

let sum = 0;

for (let i = 1; i <= 100; i++){
    if(i % 3 === 0 || i % 6 === 0 || i % 9 === 0){
        sum += i;
    }
}
console.log(`4. 1부터 100까지의 숫자중 3, 6, 9의 배수 합계 : ${sum}`)
