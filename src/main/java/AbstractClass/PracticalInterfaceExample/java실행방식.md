Spring Boot 애플리케이션을 빌드하고 나면, 실행하는 방법은 크게 몇 가지가 있습니다. 여기 가장 일반적인 방법들을 소개하겠습니다:

1. **Jar 파일 실행하기**:
    - Spring Boot 애플리케이션은 일반적으로 실행 가능한 jar(Java ARchive) 파일로 패키징됩니다. Maven이나 Gradle을 사용하여 프로젝트를 빌드한 후, 생성된 jar 파일을 직접 Java 명령어로 실행할 수 있습니다.
    - 명령어 예시:
      ```
      java -jar target/your-application.jar
      ```
    - 여기서 `target/your-application.jar`는 Maven을 사용하여 빌드했을 때 생성되는 jar 파일의 경로입니다. Gradle을 사용하는 경우 경로는 일반적으로 `build/libs/` 아래에 있습니다.

2. **Maven 플러그인을 사용하여 실행하기**:
    - Maven을 사용하는 경우, Spring Boot Maven 플러그인을 활용하여 애플리케이션을 직접 실행할 수 있습니다. 이 방법은 개발 중에 애플리케이션을 빠르게 실행해 보기에 편리합니다.
    - 명령어 예시:
      ```
      mvn spring-boot:run
      ```

3. **Gradle 플러그인을 사용하여 실행하기**:
    - Gradle을 사용하는 경우, Spring Boot Gradle 플러그인을 이용하여 애플리케이션을 실행할 수 있습니다.
    - 명령어 예시:
      ```
      gradle bootRun
      ```

4. **IDE를 통해 실행하기**:
    - 대부분의 Java 개발 환경(IDE)에서는 Spring Boot 애플리케이션을 직접 실행할 수 있는 기능을 제공합니다. 예를 들어, IntelliJ IDEA, Eclipse, VS Code 등에서는 프로젝트 내의 메인 클래스를 우클릭하고 'Run'을 선택하여 애플리케이션을 실행할 수 있습니다.

이러한 방법들은 모두 Spring Boot 애플리케이션을 실행하는 효과적인 방법이며, 상황에 따라 가장 편리한 방법을 선택하여 사용하면 됩니다. 개발 단계에서는 IDE나 Maven/Gradle 플러그인을 사용하는 것이 좋고, 배포 시에는 jar 파일을 실행하는 방식을 주로 사용합니다.

- - -

out 폴더에서
```shell
java AbstractClass.PracticalInterfaceExample.main
```
클래스 명으로 실행도 가능하다. 