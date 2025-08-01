-- 3번 : 서브쿼리 실습
-- 단일행, 다중행, 연관, 비연관
-- SELECT, FROM, WHERE 서브쿼리
-- 연산자, 집계함수 => 어떤 연산자를 쓸지
-- 쿼리를 메인쿼리와 서브쿼리로 나눠서 작성


-- 1. 전체 직원 중 급여가 가장 높은 직원의 이름과 급여를 구하기
-- 단일행 / 비연관
-- WHERE
-- MAX(), =

SELECT MAX(SALARY) FROM EMPLOYEES; -- 1개행

SELECT FIRST_NAME 이름, SALARY 급여 
FROM EMPLOYEES; -- 107행(메인쿼리)

SELECT FIRST_NAME 이름, SALARY 급여 
FROM EMPLOYEES
WHERE SALARY = (SELECT MAX(SALARY) FROM EMPLOYEES);

-- 2. 전체 평균급여보다 많이 받는 직원의 이름과 급여 조회
-- 단일행 / 비연관
-- WHERE
-- AVG(), >

-- 평균 급여 조회
SELECT AVG(SALARY)
FROM EMPLOYEES; -- 1개행(서브쿼리)

-- 전체 직원 조회(이름, 급여)
SELECT FIRST_NAME, SALARY
FROM EMPLOYEES; -- 107행



-- 메인쿼리
SELECT FIRST_NAME, AVG(SALARY)
FROM EMPLOYEES
GROUP BY FIRST_NAME;

SELECT 

SELECT E.FIRST_NAME, E.SALARY
FROM EMPLOYEES E
WHERE SALARY > ( SELECT AVG(SALARY)
	FROM EMPLOYEES
--	WHERE E.FIRST_NAME = FIRST_NAME 
--	GROUP BY FIRST_NAME
);
--ORDER BY E.FIRST_NAME;

-- 3. IT 부서에 소속된 직원의 이름과 부서ID, 급여 조회
-- 다중행, 연관
-- WHERE, IN
-- 연산자


-- 부서 이름 조회, 서브쿼리
SELECT DEPARTMENT_NAME
FROM DEPARTMENTS;

SELECT DEPARTMENT_NAME
FROM DEPARTMENTS
WHERE DEPARTMENT_NAME = 'IT';


-- 부서ID, 직원 이름, 급여 조회, 메인쿼리
SELECT DEPARTMENT_ID, FIRST_NAME, SALARY
FROM EMPLOYEES;

--
--SELECT e.DEPARTMENT_ID, e.FIRST_NAME, e.SALARY,
--	(SELECT d.DEPARTMENT_NAME
--	FROM DEPARTMENTS d
--	WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID) 부서명
--FROM EMPLOYEES e T
--WHERE DEPARTMENT_NAME IN 
--	(SELECT DEPARTMENT_NAME
--	FROM DEPARTMENTS d
--	WHERE d.DEPARTMENT_NAME = 'IT'
--);

SELECT e.DEPARTMENT_ID 부서ID, e.FIRST_NAME||' '||e.LAST_NAME 이름  , e.SALARY 급여,
	(SELECT d.DEPARTMENT_NAME
	FROM DEPARTMENTS d 
	WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID) 부서명
FROM EMPLOYEES e
WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID
	FROM DEPARTMENTS
	WHERE DEPARTMENT_ID = 60);
--GROUP BY DEPARTMENT_ID;
--GROUP BY DEPARTMENT_NAME;
--HAVING DEPARTMENT_NAME = 'IT';
--HAVING 부서명 = 'IT';
--WHERE 부서명 = 'IT';
--WHERE DEPARTMENT_NAME IN
--	(SELECT DEPARTMENT_NAME
--	FROM DEPARTMENTS
--	WHERE DEPARTMENT_NAME = 'IT');


-- 4. ST_CLERK 직무를 가진 직원의 급여 평균 조회
--  단일행, 비연관
-- =
-- 서브쿼리 없이 단독실행

SELECT AVG(SALARY)
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK';

-- 5. 부서별 최대 급여를 받는 직원들의 이름과 급여, 부서ID 조회
-- 서브쿼리 유형 : 다중행, 연관
-- 연산자 : =, MAX()
-- 서브쿼리 위치 : WHERE

-- 부서별 최대 급여
SELECT DEPARTMENT_ID, MAX(SALARY)
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID; -- 12행

SELECT FIRST_NAME, DEPARTMENT_ID, SALARY
FROM EMPLOYEES E
WHERE SALARY = (SELECT MAX(SALARY) FROM EMPLOYEES WHERE E.DEPARTMENT_ID = DEPARTMENT_ID);

SELECT SALARY, DEPARTMENT_ID
FROM EMPLOYEES;

-- 6. 부서가 존재하지 않는 직원 조회
--	서브쿼리 유형 : 비연관 OR 연관
--	연산자 : NOT IN OR NOT EXISTS
--	서브쿼리 위치 : WHERE

-- 비연관서브쿼리(NOT IN)
SELECT EMPLOYEE_ID, FIRST_NAME, DEPARTMENT_ID
FROM EMPLOYEES
--WHERE DEPARTMENT_ID IS NULL; --이렇게도 확인은 가능하나 다른 테이블과 연계가 불가능해진다
WHERE DEPARTMENT_ID NOT IN (SELECT DEPARTMENT_ID FROM EMPLOYEES e)
	OR DEPARTMENT_ID IS NULL;

-- 연관서브쿼리(NOT EXISTS)
-- EXISTS() 서브쿼리가 결과를 반환하면 TRUE, 없으면 FALSE
-- NOT EXISTS() : 서브쿼리가 결과를 반환하지 않는 경우만 TRUE --FALSE는 반환되지 않고 TRUE만 반환!

SELECT E.EMPLOYEE_ID
FROM EMPLOYEES E
--WHERE NOT EXISTS( SELECT 1 -- EXISTS 함수가 실행됐을때 행이 하나라도 존재하는가 확인용 1
WHERE NOT EXISTS( SELECT D.DEPARTMENT_ID -- SELECT 1과 동일하게 조회
			FROM DEPARTMENTS d 
			WHERE D.DEPARTMENT_ID = E.DEPARTMENT_ID
);



-- 7. 급여가 평균보다 높은 직원들 중 SA_REP 직무를 가진 사람만 조회
-- 단일행, 비연관
-- AND, >, AVG()
-- WHERE

SELECT AVG(SALARY)
FROM EMPLOYEES;

-- 메인쿼리
SELECT FIRST_NAME, JOB_ID, SALARY
FROM EMPLOYEES e 
WHERE SALARY > (SELECT AVG(SALARY) FROM EMPLOYEES) AND JOB_ID = 'SA_REP' --26행
--WHERE JOB_ID = 'SA_REP' -- 27행
ORDER BY SALARY; -- 26행

-- 8. 평균 급여보다 낮은 사람들의 급여를 20%( * 1.2) 인상한 결과 테이블 조회
--		컬럼 : 직원번호, 직원, 급여, 인상급여
-- 단일행 / 연관
-- 연산자 : <, * 1.2(산술연산자 *)
-- WHERE
SELECT AVG(SALARY)
FROM EMPLOYEES; --6461.831 (1행)

SELECT EMPLOYEE_ID, FIRST_NAME, SALARY * 1.2 AS 인상급여
FROM EMPLOYEES
WHERE SALARY < (SELECT AVG(SALARY) FROM EMPLOYEES);
-- ()안의 서브쿼리의 결과가 하나만 나오면 단일행이다
-- ()안의 서브쿼리의 결과가 2개 이상 나오면 다중행이다
-- 비교연산자가 쓰이면 단일연산자다! (연산자 여러개를 쓰면 비교연산자를 못쓰기 때문)
-- 단일행에서 결과가 여러개 나오면 ORA-01427:single-row subquery returns more than one row 에러가 나옴

-- 다중행은 서브쿼리에서 여러개의 결과를 반환할 수 있음
-- IN : 여러 값 중 포함 여부 판단
-- ANY : 하나라도 조건을 만족하면 TRUE
-- ALL : 전부 조건을 만족해야함
















































