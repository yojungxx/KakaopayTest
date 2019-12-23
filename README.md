##카카오페이 관계사 증권##
##특정 고객 거래내역 조회 서비스 API ##

1. 개발 프레임워크
 - Spring Boot 

2. 빌드 및 실행 방법
 - 빌드방법 : 프로젝트 우클릭 -> Run As -> Maven build
 - 실행방법 : cmd 실행 
                 -> 빌드 후 생성 된 jar파일이 있는 경로로 이동
                 -> 명령어 실행 : java -jar -Dfile.encoding=UTF-8 test-6-0.0.1-SNAPSHOT.jar
                 -> 브라우저에서 아래 URL을 통해 테스트

3. API URL
 1) 2018년, 2019년 각 연도별 합계 금액이 가장 많은 고객을 추출하는 API
   -  http://localhost:8080/getMostCusInf
 2) 2018년 또는 2019년에 거래가 없는 고객을 추출하는 API
   - http://localhost:8080/getDeNoneCusInf
 3) 연도별 관리점별 거래금액 합계를 구하고 합계금액이 큰 순서로 출력하는 API
   - http://localhost:8080/getYearDeSumMngInf
 4) 지점명을 입력하면 해당지점의 거래금액 합계를 출력하는 API 개발
   - http://localhost:8080/getDeSumMngInf/판교점
   - http://localhost:8080/getDeSumMngInf/강남점
   - http://localhost:8080/getDeSumMngInf/분당점
   - http://localhost:8080/getDeSumMngInf/잠실점