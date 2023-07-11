# CI-CD 과제

### CI(Continuous Integration)란
* 지속적인 통합을 뜻하며 버전 관리 시스템에서 소스코드가 변경되었을 때 변경된 소스코드들을 통합하는 과정을 의미한다

### CI가 필요한 이유
* CI를 사용하면 코드의 변경사항을 자동으로 빌드시킬 수 있다
    > 버전 관리나 소스코드를 통합하는 작업 등을 자동화시킬 수 있기 때문이다
* 여러 개발자들이 동시에 개발할 때 생기는 문제를 조기에 찾아낼 수 있다


### CD(Continuous Distribution)란
* 지속적인 배포를 의미하며 지속적인 통합 과정이 끝나는 지점부터 시작된다
* 프로덕션 개발 테스트 환경을 포함해 선택한 환경으로 애플리케이션을 제공하는 과정을 자동화하는 것이다

### CD가 필요한 이유
* 배포하는 과정을 수동으로 작업한다면 자동화된 프로세스보다 시간이 더 오래 걸릴수 있고 휴먼에러도 발생할 수 있기 때문이다
* 자동화된 프로세스를 통해 신속한 배포가 가능할 것이기 때문이다

### CI/CD의 개념과 필요성을 정리할 때 사용한 자료들

https://www.jetbrains.com/ko-kr/teamcity/ci-cd-guide/benefits-of-ci-cd/

https://www.itworld.co.kr/insider/233284

https://helloworld-88.tistory.com/50

https://velog.io/@beardfriend/CICD%EA%B0%80-%ED%95%84%EC%9A%94%ED%95%9C-%EC%9D%B4%EC%9C%A0

https://velog.io/@rlafbf222/Spring-Boot-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-CI-CD-%EA%B5%AC%EC%B6%95%ED%95%98%EA%B8%B0-%ED%95%AD%ED%95%B4%EC%9D%BC%EC%A7%80-54%EC%9D%BC%EC%B0%A8

## CI 과정

* 인텔리제이 스프링 이니셜라이져를 통한 프로젝트 생성
<img width="798" alt="Pasted Graphic 1" src="https://github.com/KimTaeO/CI-CD_study/assets/103710151/edfdeb8b-7452-4cd8-9fad-194b56c503a1">


* 깃허브에 레포를 생성하고 로컬 저장소와 연결 후 푸쉬
<img width="681" alt="Pasted Graphic" src="https://github.com/KimTaeO/CI-CD_study/assets/103710151/1c357573-245f-4557-a250-02727b8118a5">

* 깃헙 레포에서 


![Pasted Graphic 2](https://github.com/KimTaeO/CI-CD_study/assets/103710151/e1b470c1-f27c-4509-b89f-ad6426105362)
* 탭을 누른 후

* Java with Gradle을 선택후 사용하고있는 브랜치와 자바 버전으로 바꾼 뒤 커밋
￼![Pasted Graphic 3](https://github.com/KimTaeO/CI-CD_study/assets/103710151/f200962d-f7f7-44c6-8f51-6308004319ba)

* 깃헙 액션이 성공적으로 끝나면
￼
* 커밋 id 앞에 체크표시가 뜨게 된다면 성공
![Pasted Graphic 4](https://github.com/KimTaeO/CI-CD_study/assets/103710151/fb56870c-a001-4c67-8d72-4a4aa9242fcb)


## 스프링 부트 CD 아키텍쳐
![image](https://github.com/KimTaeO/CI-CD_study/assets/103710151/e43c0586-65f7-4a14-a29c-bf0e3c71a1f7)
