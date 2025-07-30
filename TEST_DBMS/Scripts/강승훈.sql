SELECT * FROM employees; 
SELECT EMAIL FROM employees;
/*
 * 2번 문제
	hr 계정으로 로그인
	처음에는 hr계정이 잠금상태
	sqlplus > Enter user-name : sys as sysdba > 비밀번호 : 1234
	alter = 수정
	hr 계정 잠금 해제 > alter user hr account unlock;
	hr 계정 잠금 해제 후 계정 비밀번호 변경 > alter user hr identified by 비밀번호;
	현재 접속한 계정 확인 : show user; 
	유저 변경 : conn hr/1234(비밀번호);
	현재 접속한 계정 확인 > show user;
*/
/*
 * 6번 문제
1) DB(DataBase)
	여러가지 데이터를 모아둔 공간
	ex) 카카오톡 메시지, 카드결제내역, 인스타그램에 등록한 사진, 유튜브에 업로드한 동영상, ...
	일상생활에서 사용하는 정보가 모두 데이터베이스에 기록된다

2) DBMS(DataBase Management System)
	데이터베이스 관리 시스템
	
	DB를 관리할 수 있는 구체적인 체계(시스템)
	- Oracle, MySQL, MariaDB, MS-SQL, MongoDB, ...

- 데이터베이스의 특징
	데이터베이스는 데이터 일관성, 데이터 독립성, 동시접속, 데이터 공유가 중요하다
	데이터 일관성 : 여러 파일에 중복해서 저장되어 있는 데이터를 하나로 모아
		하나의 저장방식으로 종합해서 관리하는 것
	데이터 독립성 : 통합해서 저장한 데이터를 컴퓨터 운영 체제와는 별도로 
		데이터 관리시스템에서 관리하자는 것
	동시접속 : 데이터 베이스는 여러 사용자 또는 여러 응용프로그램이 동시에 데이터를
		읽고 쓸 수 있는 환경을 지원해야한다
	데이터 공유 : 데이터 베이스는 여러 사용자 또는 여러 응용 프로그램들 간에 데이터를
		공유하는데 사용이 된다
*/
/*
(1) 관계형 데이터 베이스 관리시스템 << 수업시간에 주로 배울 내용
	테이블 형식으로 데이터를 저장하며 테이블간의 관계를 설정하는 데이터베이스 시스템
	가장 이반적인 SQL 쿼리언어를 사용하여 데이터를 추가, 수정, 삭제, 검색
	ex) Oracle, MySQL(MariaDB), MS-SQL, Microsoft SQL Server, SQLite, 등등...
	(당장은 Oracle 위주로 배우고, 보안쪽 배울떄 MariaDB도 배울 예정,
	다 배우고 나면 Oracle, MySQL, MariaDB를 다룰 수 있을 예정)
	MySQL과 MariaDB는 문법이 서로 같아서 하나만 배워도 나머지 하나를 쓰는데 어려움이 없음
*/