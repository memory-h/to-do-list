# TO-DO LIST

## ✔️ 프로젝트 개요
- `tasks.json` 파일을 파일 입출력을 통해 TO-DO LIST를 가져온다.
- 콘솔에 `추가`, `수정`, `삭제`, `조회`, `종료` 중 1개만 입력 받는다.
- `추가`를 입력 하면 할 일을 추가한다.
    - 추가한 할 일을 `tasks.json` 파일에 추가한다.
- `수정`을 입력 하면 TO-DO LIST에 존재하는 할 일을 수정한다.
    - 제목을 수정할 수 있다.
    - 완료 여부를 수정할 수 있다.
        - `completed` 속성을 `false`에서 `true`로 수정할 수 있다.
        - `completed` 속성을 `true`에서 `false`로 수정할 수 있다.
    - 수정한 할 일을 `tasks.json` 파일에 반영한다.
- `삭제`를 입력하면 TO-DO LIST에 존재하는 할 일을 삭제한다.
    - 삭제할 할 일을 `tasks.json` 파일에서 삭제한다.
- `조회`를 입력하면 TO-DO LIST를 조회한다.
    - 조회를 원하는 날짜를 입력한다.
        - 날짜는 `yyyy-MM-dd` 형식으로 입력한다.
        - 조회할 날짜에 TO-DO LIST가 없으면 `조회할 TO-DO LIST가 없습니다.` 문구를 출력한다.
- `종료`를 입력하면 프로그램을 종료한다.
- 예외가 발생하면 `[ERROR]`로 시작하는 문구를 출력한다.
    - 예외가 발생하면 그 부분부터 다시 입력 받는다.

## ✔️ 구현 기능 목록

### 저장된 TO-DO LIST를 가져오는 기능
- [x] `src/main/resources/tasks.json`에서 파일 입출력을 통해 TO-DO LIST를 가져오는 기능을 구현한다.

### TO-DO LIST 프로그램 시작을 알리는 메시지를 출력하는 기능
- [ ] TO-DO LIST 프로그램 시작을 알리는 메시지를 출력하는 기능을 구현한다.

### `추가`, `수정`, `삭제`, `조회`, `종료` 중 1개만 입력을 요구하는 메시지를 출력하는 기능
- [ ] 5개의 명령어 중 1개만 입력을 요구하는 메시지 출력하는 기능을 구현한다.

### `추가`, `수정`, `삭제`, `조회`, `종료` 중 하나를 입력 받는 기능 
- [ ] `추가`, `수정`, `삭제`, `조회`, `종료` 중 1개만 입력 받는 기능을 구현한다.
  - [ ] 빈 문자열이 입력되었는지 검증하는 기능을 구현한다.
  - [ ] `추가`, `수정`, `삭제`, `조회`, `종료` 중 1개만 입력되었는지 검증하는 기능을 구현한다.

### `추가`를 입력했을 때 제목을 요구하는 메시지를 출력하는 기능
- [ ] 제목 입력을 요구하는 메시지를 출력하는 기능을 구현한다.

### `추가`를 입력했을 때 TO-DO LIST에 추가하는 기능
- [ ] 제목를 입력 받는 기능을 구현한다.
  - [ ] 빈 문자열을 입력 받았는지 검증하는 기능을 구현한다.
- [ ] TO-DO LIST를 구분하는 `id`를 자동으로 생성하는 기능을 구현한다. 
- [ ] 생성 날짜는 `LocalDate`를 사용하여 오늘 날짜로 초기화하는 기능을 구현한다.
- [ ] 완료 여부의 기본값을 `false`로 초기화하는 기능을 구현한다.
- [ ] 파일 입출력을 통해 TO-DO LIST를 `tasks.json` 파일에 추가하는 기능을 구현한다.

### `추가` 기능이 정상적으로 진행되면 성공 메시지를 출력하는 기능
- [ ] TO-DO LIST 추가가 정상적으로 진행되면 성공 메시지를 출력하는 기능을 구현한다.

### `수정`을 입력했을 때 `id` 입력을 요구하는 메시지를 출력하는 기능
- [ ] `id`를 입력을 요구하는 메시지를 출력하는 기능을 구현한다.

### `수정`을 입력했을 때 제목 또는 완료 여부를 요구하는 메시지를 출력하는 기능
- [ ] 제목 또는 완료 여부를 요구하는 메시지를 출력하는 기능을 구현한다.

### `수정`을 입력했을 때 TO-DO LIST를 수정하는 기능
- [ ] `id`를 입력 받는 기능을 구현한다.
    - [ ] 빈 문자열을 입력 받았는지 검증하는 기능을 구현한다.
    - [ ] 자연수를 입력 받았는지 검증하는 기능을 구현한다.
    - [ ] TO-DO LIST에 존재하는 `id`인지 검증하는 기능을 구현한다.
- [ ] `id`로 수정할 TO-DO LIST를 조회하는 기능을 구현한다.
- [ ] 제목 또는 완료 여부를 입력 받는 기능을 구현한다.
  - [ ] 빈 문자열인지 확인한다.
  - [ ] 1 또는 2를 입력 받았는지 검증하는 기능을 구현한다. (1를 입력 받으면 제목 수정, 2를 입력 받으면 완료 여부 수정)
- [ ] 제목을 수정하는 기능을 구현한다.
- [ ] 완료 여부를 수정하는 기능을 구현한다.

### `수정` 기능이 정상적으로 진행되면 성공 메시지를 출력하는 기능
- [ ] TO-DO LIST 수정이 정상적으로 진행되면 성공 메시지를 출력하는 기능을 구현한다.

### `삭제`를 입력했을 때 `id` 입력을 요구하는 메시지를 출력하는 기능
- [ ] `id`를 입력을 요구하는 메시지를 출력하는 기능을 구현한다.

### `삭제`를 입력했을 때 TO-DO LIST를 삭제하는 기능
- [ ] `id`를 입력 받는 기능을 구현한다.
  - [ ] 빈 문자열을 입력 받았는지 검증하는 기능을 구현한다.
  - [ ] 자연수를 입력 받았는지 검증하는 기능을 구현한다.
  - [ ] TO-DO LIST에 존재하는 `id`인지 검증하는 기능을 구현한다.
- [ ] 입력 받은 `id`를 사용하여 TO-DO LIST를 삭제하는 기능을 구현한다.

### `삭제` 기능이 정상적으로 진행되면 성공 메시지를 출력하는 기능
- [ ] TO-DO LIST 삭제가 정상적으로 진행되면 성공 메시지를 출력하는 기능을 구현한다.

### `조회`를 입력했을 때 TO-DO LIST를 조회하는 기능
- [ ] 조회를 원하는 날짜를 입력 받는 기능을 구현한다.
  - [ ] 빈 문자열이 입력 받았는지 검증하는 기능을 구현한다.
  - [ ] `yyyy-MM-dd` 패턴으로 입력 받았는지 검증하는 기능을 구현한다.
- [ ] 입력 받은 날짜로 해당 날짜의 TO-DO LIST를 조회하는 기능을 구현한다.

### `조회`한 TO-DO LIST의 결과를 출력하는 기능
- [ ] 날짜를 기준으로 조회한 TO-DO LIST 결과를 출력하는 기능을 구현한다.

### `종료`를 입력했을 때 프로그램을 종료하는 기능
- [ ] `종료`를 입력 받으면 프로그램을 종료하는 기능을 구현한다.
