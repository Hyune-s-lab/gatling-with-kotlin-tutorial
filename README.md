# gatling-tutorial

### environment

- gatling 3.9.5
- kotlin 1.8.2

### how to use

1. `src/gatling/kotlin` 경로에 `TestSimulation` 파일을 수정 합니다.
2. `Tasks > gatling > gatlingRun` 또는 `./gradlew gatlingRun` 명령어를 실행 합니다.
3. `build/reports/gatling` 경로에 결과가 생성 됩니다.
4. `index.html` 을 브라우저로 열어서 결과를 확인 합니다.

<img width="700" alt="image" src="https://github.com/Hyune-s-lab/gatling-with-kotlin-tutorial/assets/55722186/c10f6556-4b02-4244-94eb-42c3859293a6">

### why gatling

|                    | gatling                    | k6                           |
|--------------------|----------------------------|------------------------------|
| github star        | 6.1k                       | 21.9k 👍                     |
| scripting language | java, **kotlin**, scala 👍 | javascript                   |
| protocol support   | http, https, websocket 👍  | http, https, websocket 👍    |
| reporting          | auto generated **html** 👍 | external tools (ex. grafana) |

### reference

- https://medium.com/@mdportnov/stress-testing-with-gatling-kotlin-e890a17ddc79
- https://github.com/gatling/gatling
- https://github.com/grafana/k6
