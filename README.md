<h1>202330126 이현</h1>

## 5/13

### 자바의 GUI

- GUI : 사용자가 편리하게 입출력 할 수 있도록 그래픽으로 화면을 구성하고, 마우스나 키보드로 입력 받을 수 있도록 지원하는 사용자 인터페이스
- 자바 언어에서 GUI 응용 프로그램 작성 : AWT와 Swing 패키지에 강력한 GUI 컴포넌트 제공.

[AWT 패키지]

- 자바가 처음 나왔을떄 부터 배포된 GUI 패키지, 최근에는 거의 사용하지 않음
- AWT 컴포넌트는 중량 컴포넌트
- AWT 컴포넌트의 그리기는 운영체제에 의해 이루어지며, 운영체제에 의 자원을 많이 소모하고 부담을 줌
- 운영체제가 직접 그리기때문에 속도는 빠름

[Swing 패키지]

- AWT 기술을 기반으로 작성된 자바 라이브러리
- 모든 AWT 기능 + 추가된 풍부하고 화려한 고급 컴포넌트
- AWT 컴포넌트를 모두 스윙으로 재작성.
- AWT 컴포넌트 이름 앞에 J자를 덧붙임
- 순수 자바 언어로 구현
- Swing 컴포넌트는 경량 컴포넌트
- Swing 컴포넌트는 운영체제의 도움을 받지 않고, 직접 그리기 때문에 운영체제에 부담주지 않음
- 현재 자바의 GUI 표준으로 사용

 

### 스윙 GUI 프로그램 샘플

- 스윙 응용프로그램은 스윙 컴포넌트를 이용하여 레고불록을 조립하듯이 작성

### 컨테이너와 컴포넌트

- 컨테이너
    - 다른 컴포넌트를 포함할 수 있는 GUI 컴포넌트 : java.awt.Container를  상속 받음
    - 다른 컨테이너에 포함될 수 있음
    - AWT 컨테이너 : panel, Frame, Applet, Dialog, Window
    - Swing 컨테이너 : Jpanel, Jframe, Japplet, Jdialog, Jwindow
- 컴포넌트
    - 컨테이너에 포홤 되어야 화면에 출력될 수있는 GUI 객체
    - 다른 컴포넌트를 포함할 수 없는 순수 컴포넌트
    - 모든 GUI 컴포넌트가 상속받는 클래스 : java.awt.Component
    - 스윙 컴포넌트가 상속받는 클래스 : javax.swing.Jcomponent
- 최상위 컨테이너
    - 다른 컨테이너에 포함되지 않고도 화면에 출력되며, 독랍적으로 존재 가능한 컨테이너
    - 스스로 화면에 자신을 출력하는 컨테이너: JFrame, JDialog, JApplet

### 컨테이너와 컴포넌트의 포함관계

- 최상위 컨테이너를 바닥에 깔고 그위에 컨테이너를 놓고, 다시 컴포넌트를 쌓아가는 방식, 즉 레고 블록을 쌓는 듯이 GUI프로그램을 작성

### Swing GUI 프로그램 만들기

- 스윙 GUI 프로그램을 만드는 과정
    1. 스윙 프레임 만들기
    2. main() 메소드 작성
    3. 스윙 프레임에 스윙 컴포넌트 붙이기
- 스윙 프로그램 작성ㅇ ㅔ플요한 import ans
    - import java.awt.*;  그래픽 처리를 위한 클래스들의 경로명
    - import java.awt.event. *; AWT 이벤트 사용을 위한경로명
    - import javax.swing.*; 스윙 컴포넌트 클래스들의 경로명
    - import javax.swing.event.*;  스윙 이벤트를 위한 경로명

### Swing 프레임

- 스윙 프레임 : 모든 스윙 컴포넌트를 담는 최상위 컨테이너
    - JFrame을 상속받아 구현
    - 컴포넌트들은 화면에 보이려면 스위 프레임에 부착되어야 함
    - 프레임을 닫으면 프레임에 부착된 모든 컴포넌트가 보이지 않게됨.
- 스윙 프레임 (JFrame) 기본 구성
    - 프레임 : 스윙 프로그램의 기본 틀
    - 메뉴바 : 메뉴들이 부착되는 공간
    - 컨텐트팬 : GUI 컴포넌트들이 부착되는 공간

### 프레임 만들기, JFrame 클래스 상속

- 스윙 프레임
    - JFrame 클래스를 상속받은 클래스 작성
    - 프레임의 크기 반드기 지정 : setSize() 호출
    - 프레임을 화면에 출력하는 코드 반드시 필요 : setVisible(true) 호출

```java
import javax.swing.*;

public class MyFrame extends JFrame { //JFrame을 상속받은 MyFrame 작성
	public MyFrame() {
		setTitle("300 X 300 스윙 프레임 만들기 "); // 타이틀 설정
		
		setSize(300, 300); //프레임 크기 지정
		
		setVIsible(true); //프레임을 화면에 출력
	}
	
	public static void main(String [] args) {
		MyFrame mf = new MyFrame(); //Myframe 객체 즉 스윙 프레임 생성
		}
}
```

### Swing 응용프로그램에서 main()의 기능과 위치

- 스윙 응용 프로그램에서 main()의 기능 최소화 바람직
    - 스윙 응용 프로그램에 실행되는 시작점으로서의 기능만
    - 스윙 프레임을 생성하는 정도의 코드로 최소화

```java
public static void main(String [] args) {
	MyFrame frame = new MyFrame();
}
```

- frame 객체를 생성하고 사용하징 낳기 때문에 worrying이 발생
- 실무에서는 다음과 같이 코딩하는 것이 일반적.

```java
public static void main(String [] args] {
	new MyFrame();
}

```

프레임에 컴포넌트 붙이기

- 타이틀 달기
    - -super() 나 setTitle() 이용
    
    ```java
    MyFrame() {
    	super("문자열");
    	}
    	
    	MyFrame() {
    		setTitle("문자열");
    	}
    ```
    
- 컨텐트팬에 컴포넌트 달기
    - 컨텐트팬이란? 스윙 컴포넌트들이 부착되는 공간
    
    ```java
    public class MyFrame extends JFrame {
    	MyFrame() {
    	
    		//프레임의 컨텐트팬을 알아낸다
    		Container contentPane = getContentPane();
    		}
    		...
    	}
    ```
    
- 컨텐트팬 알아내기 :
    - 스윙 프레임에 붙은 디폴트 컨텐트팬 알아내기

```java
//버튼 컴포넌트 생성
JButton button = new JButtton("Click");
contentPane.add(button); // 컨텐트팬에 버튼 부착
```

- 컨텐트 팬에 컴포넌트 붙이기

```java
class MyPanel extends JPanel {
	..// Jpanel을 상속받은 패널을 구현한다.
}
//frame의 컨텐트팬을 MyPanel 객채로 변경
frame.setContentPane(new MyPanel());
```

- 컨텐트팬 변경

### 컨텐트팬에 대한 JDK 1.5 이후의 추가 사항

- JDK 1.5 이전
    - 프레임의 컨텐트 팬을 알아내어, 반드시 컨텐트팬에 컴포넌트 부착

```java
Container c = frame.getContentPane();
c.add(new JButton("CLick")); // 컨텐트팬에 직접 컴포넌트 부착
```

- JDK 1.5 이후 추가된 사항
    - 프레임에 컴포넌트를 부착하면 프레임이 대신 컨텐트팬에 부착
    
    ```java
    frame.add(new JButton("Click"));
    //프레임이 버튼 컴포넌트를 컨텐트팬에 대신 부착
    ```
    
- 저자의 결론
    - JDK 1.5이전처럼 직접 컨텐트팬에 컴포넌트를 부착하는 것이 바람직함
    - 컴텐트팬 다루기 능력 필요
    - 컴포넌트의 부모가 프레임이 아닌, 컨텐트팬임을 알고 명확히 사용할 필요
- 1.5 이후 추가된 기능을 사용하는 것이 가독성이 좋으며, Content Pane 을 다루는 능력이 반드시 필요한것은 아니다.

### 현재 권장 JDK

- 2026년 기준, JDK는 Java 17 또는 Java 21 (LTS 버전) 사용이 권장됩니다.
- 신규 프로젝트는 21, 기존 레거시 시스템은 17이나 11을 주로 사용합니다.
- java 8은 지원 종료 시점(2026년 11월)이 가까워 전환이 필요함

### Swing 응용 프로그램의 종료

- 응용프로그램 내애서 스스로 종료하는방법
    - 언제 어디서나 무조건 종료 System.exit(0);
- 프레임의 오른쪽 상단의 종료버튼(X)이 클릭되면 어떤 일이 일어나는가?
    - 프레임 종료, 프레임 윈도우를 닫음 : 프레임이 화면에서는 보이지 않게됨!
- 프레임이 보이지 않게 되지만 응용 프로그램이 종료한 것 아님
    - 
    - 키보드나 마우스 입력을 받지 못함
    - 다시 setVisible(true) 를 호출하면, 보이게 되고 이전 처럼 작동함
- 프레임 종료 버튼이 클릭될 때, 프레임과 함꼐 프로그램을 종료 시키는 방법

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

### 컨테이너와 배치, 배치 관리자 개념

- 컨테이너의 배치 관리자
    - 컨테이너마다 하나의 배치 관리자 존재
    - 컨테이너에 부착된느 컴포넌트의 위치와 크기 결정
    - 컨테이너의 크기가 변경되면, 컴포넌트의 위치와 크기 재결정

### 배치 관리자 대표유형4 가지

- FlowLayout 배치 관리자
    - 컴포넌트가 삽입되는 순서대로 왼쪽에서 오른쪽을 배치
    - 배치할 공간이 없으면 아래로 내려와서 봔복한다ㅣ
- BorderLayout 배치 관리자
    - 컨테이너의 공간을 동(EAST), 서(WEST), 남(SOUTH), 북(NORTH), 중앙(CENTER)dml 5개의 영역으로 나눔
    - 5개의 영역 중 응용 프로그램에서 지정한 영역에 컴포넌트 배치
- gridLayout 배치관리자
    - 컨테이너를 프로그램에서 설정한 동일한 크기의 2차원 격자로 나눔
    - 컴포넌트는 삽입 순서대로 죄에서 우로, 다시 위에서 아래로 배치
- CardLayout
    - 컨테이너의 공간에 카드를 쌓아 놓은 듯이 컴포넌트를 포개어 배치

### 컨테이너에 새로운 배치 관리자 설정

- 컨테이너에 새로운 배치 관리자 설정
    - setLayout(LayoutManager lm) 메소드 호출 : lm을 새로운 배치 관리자로 설정

[ 사례 ]

- Jpanel 컨테이너에 BorderLayout 배치관리자를 설정하는 예

```java
JPanel p = new JPanel();
p.setLayout(new BorderLayout());// JPanel에 BorderLayout 설정
```

- 컨텐트팬의 배치 관리자를 FlowLayout 배치관리자로 설정

```java
Container c = frame.getConentPane(); //프레임의 컨텐트 팬 알아내기

c.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout 설정
```

- 오류

```java
c.setlayout(FloLayout);
```

### FlowLayout 배치관리자

- 배치방법:
    - 컴포넌트 를 컨테이너 내에 왼쪽에서 ㅗ른쪽으로 배치
    - 다시위에서 아래로 순서대로 배치

```java
container.setLayout(new FlowLayout());
container.add(new JButton("add"));
container.add(new JButton("sub"));
container.add(new JButton("mul"));
container.add(new JButton("div"));
container.add(new JButton("calculate"));
```

### FlowLayout 생성자

- 생성자
    - FlowLayout();
    - FlowLayout(int align, int hGap, int vGap)
- align : 컴포넌트를 정렬하는 방법 지정, 왼쪽정렬(FlowLayout.LEFT), 오른쪽 정렬(FlowLayout.RIGHT), 중앙정렬(FlowLayout.CENTER(디폴트))
- hGap : 좌우 두 컴포넌트 사이의 수평 간격, 픽셀단위, 디폴트는 5
- vGap : 상하 두 컴포넌트 사이의 수직 간격, 픽셀단위. 디폴느는 5

### BorderLayout 배치관리자

- 배치방법
    - 컨테이너 공간을 5구역으로 분할, 배치 : 동, 서, 남, 북, 중앙
- 배치 방법
- add(Component comp, int index) : comp 를 index의 공간에 배치

### BorderLayout 생성자와 add() 메소드

- 생성자
    - BorderLayout()
    - BorderLayout(int hGap, int vGap)
        - hGap : 좌우 두 컴포넌트 사이의 수평간격, 픽셀단위( 디폴트 : 0)
        - vGap : 상하 두 컴포넌트 사이의 수직간격, 픽셀 단위 (디폴트 : 0)
- add() 메소드
    - void add(Component comp, int index)
        - comp 컴포넌트를 index 위치에 삽입한다.
        - index : 컴포넌트의 위치

### GridLayout 배치 관리자

- 배치방법
    - 컨테이너 공간을 동일한 사각형 격자(그리드)로 분할하고 각 셀에 컴포넌트 하나씩 배치
        - 생성자에 행수와 열수 지정
        - 셀에 왼쪽에서 오른쪽으로, 다쉬위레서 아래로 순서대로 배치

```java
container.setLayout(new GridLayout(4,3,5,5)); //4X3 분할로 컴포넌트 배치
container.add(new JButton("1"));
container.add(new JButton("2"));
```

### GridLayout 생성자

- 생성자
    - GridLayout()
    - GridLayout(int rows, int cols)
    - GridLayout(int rows, int cols, hGap, int vGap)
        - rows : 각자의 행수(디폴트 : 1)
        - cols : 각자의 열수(디폴트 : 1)
        - hGap : 좌우 두 컴포넌트 사이의 수평 간격, 픽셀 단위 (디폴트 : 0)
        - vGap : 상하 두 컴포넌트 사이의 수직 간격, 픽셀 단위 (디폴트 : 0)
        - rows x cols 만큼의 셀을 가진 격자로 컨테이너 공간을 분할, 배치

### 배치관리자 없는 컨테이너

- 배치 관리자가 없는 컨테이너가 필요한 경우
    - 응용 프로그램에서 직접 컴포넌트의 크기와 위치를 결정하고자 하는 경우
    1. 컴포넌트의 크기나 위치를 개발자 임의로 결정하고자 하는 경우
    2. 게임 프로그램과 같이 시간이나 마우스/키보드의 입력에 따라 컴포넌트들의 위치와 크기가 수시로 변한는 경우
    3. 여러 컴포넌트들이 서로 겹쳐 출력하고자 하는 경우
- 컨테이너의 배치 관리자 제거 방법

```java
JPanel p = new JPanel();
p.setLayout(null); // JPanel의 배치관리자 삭제
```

- 컨테이너의 배치 관리자가 없어지면, 컴포넌트에 대한 어떤 배치도 없음
- 추가된 ㅋ머포넌트의 크기가 0으로 설정, 위치는 예측할 수 없게 됨

```java
 // 패널 p에는 배치관리자가 없으면 아래 두버튼은 배치되지 않는다.
 
 p.add(new JButton("click"));
 p.add(new JButton("me!"));
```

### 컴포넌트의 절대 위치와 크기 설정

- 배치 관리자가 없는 컨테이너에 컴포넌트를 삽입할때
    - 프로그램에서 컴포넌트의 절대 크기와 위치 설정
    - 컴포넌트들이 서로 겹치게 할수 있음
- 컴포넌트의 크기와 위치 설정 메소드
    - void setSize(int width, int height)
    - void setLoaction( int x, int y)
    - void setBounds( int x, int y, int width, int height)

```java
JPanel p = new JPanel();
p.setLayout(null);

JButton clickButton = new JButton("Click");
clickButton.setSize(100, 40);
clickButton.setLocation(50, 50);
p.add(clickButton);
```



## 5/4

### 패키지 만들기

- 클래스 파일(.class)이 저장되는 위치는?
    - 클래스나 인터페이스가 컴파일 되면 클래스 파일(.class) 생성
    - 크래스 파일은 패키지로 선언된 디렉터리에 저장
- 패키지 서언
    - 소스파일의 맨 앞에 컴파일 후 저장될 패키지 지정 → package 패키지명

```java
package UI; // 아래 Tools를 컴파일 하여 UI패키지에 저장할것 지시

public class Tools {

....

}

---------------------------------------------------------------------------
	//tools 클래스의 경로명은 UI.Tools가 됨
---------------------------------------------------------------------------

package Graphic; // 아래 Line 클래스를 Graphic 패키지에 저장

import UI.Tools; // UI.Tools 클래스의 경로명 임포트

public class Line extends Shape {
	public void draw() {
		Tools t = new Tools();
	}
}
```

### 디폴트 패키지

- package 선언문이 없는 자바 소스 파일의 경우
    - 컴파일러는 클래스나 인터페이스를 디폴트 패키지에 소속시킴
    - 디폴트 패키지 → 현재 디렉터리

### VS Code에서 Java Package 생성하기 1

- eclipse 보다도 간단히 만들 수 있습니다.
- 교재의 예제에서는 app과 lib package 를 만들었지만, 일반적으로 package는 
com.foo.test와 같이 도메인의 역순으로 만드는것이 일반적
- 먼저 다음과 같은 디렉터리를 만든다.
 src/
     — com/
               — foo/
                       — test/
- 다음 test에서 [bar.java](http://bar.java) 파일을 생성
- Explorer 아래쪽 “java project”를 클릭하면 package의 계층 구조를 볼 수 있습니다.
- 사용자정의 package 를 만든후 사용하려먼 improt 키워드를 사용한다.
    - //파일 : src/com/example/utils/HelloUtil.java
    - //파일 : src/com/example/Main.java
- 어떤 클래스 파일에서 package 선언을 생략하면 default package(기본패키지)에 속하게 됩니다.
- 같은 기본 패키지에 있는 다른 클래스에서는 import없이 사용 가능합니다.
- default package에 속해 있으면 다른 package를 사용할 수 없습니다.
- 실제 프로젝트에서는 거의 모든 클래스가 명시적으로 package를 선언

### packag의 운영 방법

- 패키지 이름은 도메인 기반으로 시작(일반 관례)형식 : com.회사이름.프로젝트명.기능명
    - 충동 방지( 전세계 어디서든 유일한 패키지명 확보 가능)/ 모듈별 분리 기능
- 기능/역할별로 하위 패키지를 구분 : utils. controller, service 등
- 디렉터리 구조와 package 선언을 정확히 일치해야 합니다.
- import는 필요한 만큼만, * 전체 import는 피하는것이 좋습니다.

### 자바 플랫폼의 모듈화

- 자바 플랫폼
    - 자바의 개발 환경(JDK)과 자바의 실행 환경(JRE)을 지칭. java SE(자바 API) 포함
    - 자바 API의 모든 클래스가 여러 개의 모듈로 재구성 됨.
    - 모듈 파일은 JDK의 jmods 디렉터리에 저장하여 배포. 현재는 OpenJDK에 따라 다름
- 자바 모듈화의 목적
    - 자바컴포넌트들을 필요에 따라 조립하여 사용하기 위함.
    - 컴퓨터시스템의 불필요한 부담 감소
    - 세밍한 모듈화를 통해 필요 없는 모듈이 로드되지 않게
    - 소형 IoT 장치에도 자바 응용프로그램이 실행되고 성능을 유지하게 함

### JDK의 주요 패키지

- java.lang
    - 스트링, 수학 함수, 입출력 등 자바 프로그래밍에 필요한 기본적인 클래스와 인터페이스
    - 자봉으로 improt됨 - improt 문 필요 X
- java.util
    - 날짜, 시간, 백터, 해시맵 등과 같은 다양한 유틸리티 클래스와 인터페이스 제공
- java.io
    - 키보드, 모니터, 프린터, 디스크 등에 입출력을 할수 있는 클래스와 인터페이스 제공
- java.awt
    - GUI 프로그램을 작성하기위한 AWT패키지
- javax.swing
    - GUI 프로그래밍을 작성하기 위한 스윙 패키지

### Object 클래스

- 모든 자바 클래스는 반드시 Object를 상속받도록 자동 컴파일
- 모든 클래스의 수퍼 클래스
- 모든 클래스가 상속받는 공통 메소드 포함

- 주요 메소드

| 메소드 | 설명 |
| --- | --- |
| boolean equals(Object obj) | obj가 가르키는 객채와 현재 객체를 비교하여 같으면 ture 리턴 |
| Class getClass() | 현 객체의 런타임 클래스를 리턴 |
| int hashCode() | 현 객체에 대한 해시 코드 값 리턴 |
| String toString() | 현 객체에 대한 문자열 표현 리턴 |
| void notify() | 현 객체에 대해 대기하고 있는 하나의 스레드를 꺠운다. |
| void notifyALL() | 현 객체에 대해 대기하고 있는 모든 스레드를 꺠운다. |
| void wait() | 다른 스레드가 꺠울 떄까지 현재 스레드를 대기시킨다. |

### Wrapper 클래스

- Wrapper 클래스 : 자바의 기본 타입을 클래스화 한 8개 클래스를 통칭
    - 기본타입: byte | short | int | long | char | float | double | boolean
    - wrapper 클래스 : Byte | Short | Integer | Long | Character | Float | Double | Boolean

용도 : 객체만 사용할 수 이쓴 컬렉션 등에 기본 타입의 값을 사용하기 위해 Wrapper 객체로 만들어 사용

### 주요 메소드

- 가장 많이 사용하는 Interger 클래스의 주요 메소드
    - 다른  wrapper 클래스의 메소드는 이와 유사
    
    static int bitCount( int i) 정수 i의 이진수 표현에서 1의 개수 리턴
    
    float floatValue() float 타입으로 값 리턴
    
    int intValue() int타입으로 값 리턴
    
    long longValue() long 타입으로 값 리턴
    
    short shortValue() short 타입으로 값 리턴
    
    static int parseInt(string s) 스트링 s를 10진 정수로 변환한 값 리턴
    
    static int parseInt(String s, int radix) 스트링 S를 지정된 진법의 정수로 변환한 값 리턴
    
    static String toBinaryString( int i ) 정수 i를 이진수 표현으로 변환한 스트링 리턴
    
    static String toHexString( int i ) 정수 i를 16진수 표현으로 변환한 스트링 리턴
    
    static toOctalString( int i ) 정수 i를 8진수 표현으로 변환한 스트링 리턴
    
    static string toString( int i ) 정수 i를 스트링으로 변환하여 리턴
    

### 박싱과 언박싱

- 박싱(boxing) : 기본 타입의 값을 Wrapper 객체로 변환
- 언박싱(unboxing) : Wrapper 객체에 들어 있는 기본 타입의 값을 빼내는 것. 박싱의 반대.
- 자동 박싱과 자동 언박싱 : JDK 1.5부터 박싱과 언박싱은 자동으로 이루어지도록 컴퍼일 됨.

```java
Integer ten = 10; //자동 박싱. integet ten = intrger.valueOf(10);로 자동처리
int n = ten; // 자동 언박싱. int n = ten.intValue();로 자동 처리
```

### String의 생성 과 특징

- 자바에는 기본 데이터 타입에 string이 없음. 대신 String 클래스를 제공.
- string 클래스는 문자열을 나타냄
- 스트링 리터럴(문자열 리터럴)은 string 객체로 처리됨
- 스트링 객체의 생성 사례

```java
String str1 = "abcd";

char data[] = {'a', 'b', 'c', 'd'};
String str2 = new String(data);
String str3 = new String("abcd"); // str2 와 str3은 모두 "abcd" 스트링
```

### 스트링 객체의 주요 특징

- 스트링 객체의 주요 특징
    - 리터럴 스티링이든 new Sting()을 생성했든 객체의 문자열 수정 불가능
    
    ```java
    String s = new String("Hello"); //s의 스트링은 수정 불가능
    String t = s.concat("Java"); // 스트링 s에 "Java"
    ```
    
- 스트링 비교 : 두 스트링을 비교할 떄 반드시 equals()를 사용하여야 함
    - eqpuals()는 내용을 비교하기 때문

### 스트링 리터럴과 new String()

- 스트링 리터럴
    - 자바 가상 기계 내부에서 리터럴 테이블에 저장되고 관리됨
    - 응용프로그램에서 공유됨
    - 스트링 리터럴 사례 ) String s = “hello”:
- new String()으로 생성된 스트링
    - 스트링 객체는 힙에 생성
    - 스트링은 공유되지 않음

### String 활용

- 스트링 비교, equals()와 compareTo()
    - tmxmfld qlrydp ==연산자 절대 사용 금지
    - equals() : 스트링이 같으면 true, 아니면 false 리턴
    
    ```java
    String java = "java";
    if(java.equals("java")) //ture
    ```
    
- int compareTo(String anotherString)
    - 문자열이 같으면 0 리턴
    - 이문자열이 anotherString 보다 먼저 나오면 음수 리턴
    - 이문자열이 anotherString 보다 먼저 나오면 양수 리턴
    
    ```java
    String java = "java";
    String cpp = "C++";
    int res = java.compareTo(cpp);
    if(res==0) System.out.println("the same");
    else if (res < 0) System.out.println(java + " < " + cpp);
    else System.out.println(java + " > " + cpp);
    
    java > C++
    ```
    
- 공백 제거, String trim ()
- 키보드나 파일로부터 스트링을 입력 시 , 스트링 앞 뒤 공백이 끼는 경우가 많다.
    - trim()을 이용하면 스트링 앞 뒤에 있는 공백 제거
    
    ```java
    String a = "xyzt";
    String b = a.trim();
    ```
    

### StringBuffer 클래스

- 가변 스트링을 다루는 클래스
- StringBuffer 객체 생성

```java
StringBuffer sb = new StringBuffer("java");
```

- String 클래스와 달리 문자열 변경 가능
    - 가변 크기의 버퍼를 가지고 있어 문자열 수정 가능
    - 문자열의 수정이 많은 작업에 적합
- 스트링 조작 사례

```java
StringBuffer sb = new StringBuffer("This");

sb.append(" is pencul.");
sb.insert(7, "my");
sb.replace(8, 10, "your");
System.out.println(sb);
```

### StringTokenizer 클래스

- 구분 문자를 기준으로 문자열을 분리하는 클래스
    - 구분 문자(delimiter) : 문자열을 구분할 때 사용되는 문자
    - 토큰(token) : 구분 문자로 분리된 문자열

### Math 클래스

- 기본 산술 연산 메소드를 제공하는 클래스
- 모든 메소드는 static으로 선언
    - 클래스 이름으로 호출 가능
- Math.random()메소드로 난수 발생
    - random()은 0보다 크거나 같고 1.0보다 작은 실수 난수발생
    - 1에서 100까지의 랜덤 정수 10개 를 발생시키는 코드사례
    
    ```java
    for(int x=0; x<10; x++) {
    	int n = (int)(Math.random()*100 + 1);
    	System.out.println(n);
    }
    ```
    
- * java.util.Random 클래스를 이용하여 난수 발생 가능

```java
Random r = new Random();
int n = r.nextInt();
int m = r.nextInt(100);
```

### 컬랙션(collection)의 개념

- 요소(element)라고 불리는 가변 개수의 객체들의 저장소
    - 객체들의 컨테이너라고도 불림
    - 요소의 개수에 따라 크기 자동 조절
    - 요소의 삽입, 삭제 에 따른 요소의 위치 자동 이동
- 고정 크기의 배열을 다루는 어려움 해소
- 다양한 객체들의 삽입, 삭제, 검색 등의 관리 용이

### 컬렉션의 특징

1. 컬랙션은 제네릭 (generics) 기법으로 구현
- 제네릭
    - 특정 타입만 다루지 않고, 여러 종류의 타입으로 변신할 수 있도록 클래스나 메소드를 일반화 시키는 기법
    - 클래스나 인터페이스 이름에 <E>, <K>, <V> 등 타입 매개변수 포함
- 제네릭 컬렉션 사례 : 벡터 Vector<E>
    - <E>에서 E에 구체적인 타입을 주어 구체적인 타입만 다루는 벡터로 활용
    - 정수만 다루는 컬렉션 벡터 Vector<Interger>
    - 문자열만 다루는 컬렉션 벡터 Vector<String>
1. 컬렉션의 요소는 객체만 가능
- int, char, double 등의 기본 타입으로 구체화 불가
- 컬렉션 사례

```java
Vector<int> v = new Vector<int>();// 컴파일 오류, int는 사용 불가
Vector<Integer> v = new Vector<Integer>();//정상 코드
```

### 제네릭은 형판과 같은 개념

- 제네릭은 클래스나 메소드를 형판에서 찍어내듯이 생산할 수 있도록 일반화된 형판을 만드는 기법

### 제네릭의 기본 개뇸

- 제네릭
    - JDK 1.5부터 도입(2004년 기점)
    - 모든 종류의 데이터 타입을 다룰 수 있도록 일반화된 타입 매개 변수로 클래스(인터페이스)나 메소드를 작성하는 기법
    - C++의 템플릿과 동일

### Vector<E>의 특성

- <E>에 사용할 요소의 특정 타입으로 구체화
- 베열을 가변 크기로 다룰 수 있게 하는 컨테이너
    - 배열의 길이 제한 극복
    - 요소의 개수가 넘치면 자동으로 길이 조절
- 요소 객체들을 삽입, 삭제, 검색하는 컨테이너
    - 삽입, 삭제에 따라 자동으로 요소의 위치 조정
- Vector에 삽입 가능한 것
    - 객체, null
    - 기본 타입의 값은 Wrapper 객체로 만들어 저장
- Vector에 객체 삽입
    - 벡터의 맨 뒤, 중간에 객체 삽입 가능
- vector에서 객체 삭제
    - 임의의 위치에 있는 객체 삭제 가능

### 컬렉션과 자동 박싱/언박싱

- JDK 1.5 이전
    - 기본 타입 데이터를 Wrapper 객체로 만들어 삽입
    
    ```java
    Vector<Integer> v = new Vector<Integer>();
    v.add(Integer.valueOF(4));
    ```
    
    - 컬렉션으로부터 요소를 얻어올 떄, Wrapper 클래스로 캐스팅 필요
    
    ```java
    Integer n = (integer)v.get(0);
    int k = n.intValue(); // K = 4
    ```
    
- JDK 1.5부터
    - 자동 박싱/언박싱이 작동하여 기본 타입 값 삽입 가능
    
     
    
    ```java
    Vector<Integer> v = new Vector<Integer> ();
    v.add(4); // 4 -> Integer.valueOf(4)로 자동 박싱
    int k = v.get(0); // Integer 타입이 int 타입으로 자동 언박싱, K = 4
    ```
    
    - 그러나, 타입 매개 변수를 기본 타입으로 구체화할 수는 없음
    
    ```java
    Vector<int> v = new Vector<int> ();// 컴파일 오류
    ```
    

### 컬렉션 생성문의 진화 : Java 7, Java 10

- java 7 이전
    
    ```java
    Vector<Integer> v = new Vector<Integer> ();
    ```
    
- java 7 이후
    - 컴파일러의 타입 추로 기능 추가
    - <>(다이아몬드 연산자)에 타입 매개변수 생략
    
    ```java
    Vector<Integer> v = new Vector<>();// java 7부터 추가, 가능
    ```
    
- java 10 이후
    - var 키워드 도입, 컴파일러의 지역 변수 타입 추론 가능
    
    ```java
    var v = new Vector<Integer>(); // java 10부터 추가, 가능
    ```
    

### ArrayList<E>

- 가변 크기 배열을 구현한 클래스
    - <E>에 요소로 사용할 특정 타입으로 구체화
- 벡터와 거의 동일
    - 요소 삽입, 삭제, 검색 등 벡터 기능 과 거의 동일
    - 벡터와 달리 스레드 동기화 기능 없음
    - 다수 스레드가 동시에 ArrayList에 접근할 때 동기화 되지 않음
    - 개발자가 스레드 동기화 코드 작성

### ArrayList 와 Vector의 차이

- Array와 Vector는 모두 동적으로 크기가 늘어나는 배열 기반의 리스트 클래스입니다.
- ArrayList       Vector
- 비동기화          동기화
- 빠름                느림
- 1.5배씩증가         2배씩
- java 1.2               java 1.0
- 요즘은 ArrayList가 기본 선택지
- Vector는 이제 거의 사용하지 않고, 멀티스레드가 필요하면 다른방법
(SynchronizedList, CopyOnWritArrayList)을 사용

### 컬렉션의 순차 검색을 위한 Iterator

- Iterator<E> 인터페이스
    - 리스트 구조이 컬렉션에서 요소의 순차 검색을 위한 인터페이스
    - Vector<E>, ArrayList<E>, LinkedList<E>가 상속받는 인터페이스
- Iterator 객체 얻어내기
    - 컬렉션의 iterator()메소드 호출: 해당 컬렉션을 순차 검색할 수 있는 Iteratorrorcp flxjs
    
    ```java
    Vector<Integer> v = new Vector<Integer>();
    Iterator<Integer> it = v.iterator();
    
    ========================================
    
    while(it.hasNext()) { // 모든 요소 방문
    	int n = it.next(); // 다음 요소 리턴
    	...
    }
    ```
    

### HashMap<K,V>

- 키<Key>와 값<value>의 쌍으로 구성되는 요소를 다루는 컬렉션
    - K : 키로 사용할 요소의 타입
    - V : 값으로 사용할 요소의 타입
    - 키와 값이 한 쌍으로 삽입
    - ‘값’ 검색하기 위해서는 반드시 ‘키’를 사용
- 삽입 및 검색이 빠른 특징
    - 요소 삽입 : put() 메소드
    - 요소 검색 : get() 메소드
    
    ```java
    HashMap<String, String> h = new HashMap<String, String>();
    
    h.put("apple", "사과");
    String kor = h.get("apple");
    ```
    

### 제네릭 만들기

- 제네릭 클래스 작성 : 클래스 이름 옆에 일반화된 타입 매개 변수 추가

```java
public class MyClass<T> {
	T val;
	void set(T a) {
		val = a;
	}
	T get() {
		return val;
	}
}
```

- 제네릭 객체 생성 및 활용
    - 제네릭 타입에 구체적인 타입을 지정하여 객체를 생성하는 것을 구체화라고험
```java
MyClass<String> s = new MyClass<String>();
s.set("hello");
System.out.println(s.get());

MyClass<Integer> n = new MyClass<Integer>(); 
n.set(5);
System.out.printn(n.get());
```
 


## 4/29

### 서브클래스 객체의 모양

- 슈퍼 클래스 객체와 서브 클래스의 객체는 별개
- 서브 클래스 객체는 슈퍼 클래스 멤버 포함

```java
public static void main(String[] args) {
	point p = new Point();
	p.set( 1,2 );
	p.showPoint();
	
	ColorPoint cp = new ColorPoint();
	cp.set(3, 4);
	cp.setColor("red");
	cp.showColorPoint();
}
```

```java
void set(int x, y) {
	this.x=x;
	this.y=y;
	}
	void showPoint() {...}
```

```java
void setColor(String color){
	this.color = color;
	}
void showColorPoint() {
	System.out.print(color);
	showPoint();
}
```

### 상속(inheritance)의 필요성

- 상속이 없는 경우 중복된 멤버를 가진 4개의 클래스

- 삭속을 이용한 경우

### 클래스 상속과 객체

- 상속 선언: extends 키워드 사용
- 부모 클래스를 물려받아 자식 클래스를 확장한다는 의미
- 부모 클래스 → 슈퍼클래스(super class)
- 자식 클래스 →서브 클래스(sub class)

### 자바 상속의 특징

- 클래스 다중 상속 불허
    - 하나의 클래스가 둘 이상의 부모 클래스를 동시에 상속받는것을 말합니다.
- C++ 다중 상속 가능

- C++는 다중상속으로 멤버가 중복생성되는 문제가 있음
    - 부모 클래스 간에 계층적 관계가 있을경우, 중복된 멤버가 생성될수도 있음
    - 모호성 문제: 두 부모 클래스에 동일한 이름의 멤버가 존재할경우, 
    어떤 부모의 멤버를 호출애햐랄지 모호해집니다

- 자바는 인터페이스의 다중 상속 허용
    - 다중상속과 유사한 기능을 제공합니다.
- 모든 자바 클래스는 묵시적으로 object클래스 상속받음

### 슈퍼 클래스의 멤버에 대한 서브 클래스의 접근

- 슈퍼클래스의 private 멤버: 서브 클래스에서 접근할 수 없음
- 슈퍼 클래스의 디폴트 멤버: 서브 클래스가 동일한 패키지에 있을때, 접근 가능
- 슈퍼 클래스의 public 멤버: 서브 클래스는 항상 접근 가능
- 슈퍼 클래스의 protected 멤버:

### 서브 클래스와 슈퍼 클래스의 생성자 선택

- 슈퍼 클래스와 서브클래스 : 각각 여러 개의 생성자 작성 가능
- 서브 클래스의 객체가 생성될 떄: 슈퍼 클래스 생성자 1개와 서브 클래스 생성자 1개가 실행
- 서브 클래스의 생성자와 슈퍼 클래스의 생성자가 결정되는 방식
1. 개발자의 명시적 선택
    1. 서브 클래스 개발자가 슈퍼 클래스의 생성자가 명시적 선택’
2.  컴파일러가 기본 생성자 생상
    1. 서브 클래스 개발자가 슈퍼클래스의 생성자를 선택하지 않음 경우
    2. 컴파일러가 자동으로 슈퍼 클래스의 기본 생성자 등록

### 업캐스팅(upcasting) 개념

- 하위 클래스의 래퍼런스는 상위 클래스를 가리킬 수 없지만, 상위 클래스의 래퍼런스는 하위 클래스를 가리킬수 있다는 설명
- 생물이 들어가는 박스에 사람이나 코끼리를 넣어도 무방.
- 사람이나 코리리 모두 생물을 상속받았기 떄문

- 업캐스팅(upcastiong) 이란?
    - 서브 클래스의 래퍼런스를 슈퍼 클래스 래퍼런스에 대입
    - 슈퍼 클래스 래퍼런스로 서브 클래스 객체를 가리키게 되는 현상
    
    ```java
    class Person { }//슈퍼 클래스
    class Student extends Preson { }
    
    Person p;
    Student s = new Student();
    p = s; // 업캐스팅
    ```
    
    슈퍼 클래스 래퍼런스로 객체 내의
    슈퍼 클래스의 맴버만 접근 가능
    
    ```java
    p.grade = "A"; //grade는 Preson 의
    							 //맴버가 아니므로
    							 //컴파일 오류
    ```
    

### 그렇다면 왜 p = s로 업케스팅을 한 걸까?

- 이 사례는 업케스팅의 제한 사항을 설명하기 위한 코드 입니다
- 실제로는 이런식으로 업케스팅을 사용하지는 않습니다.

- 실제로는 여러 자식 클래스를 하나의 부모 타입으로 다루기 위해 사용합니다.

```java
Preson[] people = new Person[3];
people[0] = new Student("홍길동");
people[1] = new Student("김영희");
people[2] = new Student("이순신");
```

- 이렇게 하면 공통된 타입(Person) 으로 여러 자식 클래스를 한 배열에 담을 수 있습니다.
- 대신 접근은 Person 수준에서만 가능합니다.

### 다운캐스팅(downcasting)

- 슈퍼 클래스 레퍼런스를 서브 클래스 레퍼런스에 대입
- 업캐스팅 된 것을 다시 원래대로 되돌리는 것
- 반드시 명시적 타입 변환 지정
- 다운 캐스팅 사례

```java
public class DowncastingEX {
	public static void main(String[] args) {
		Person p = new Student("이재문");
		Student s;
		
		s = (Student)p;
		
		System.out.println(s.name);
		s.grade = "A";
		}
	}
```

```java
class Person{ }
class Student extends Person { }

Person p = new Student("이재문");

Sudent s = (Student)p;
```

### 업 캐스팅 레퍼런스로 객체 구별?

- 업캐스팅 된 래퍼런스로는 객체의 실제 타입을 구분하기 어려움
- 슈퍼 클래스는 여러 서브 클래스에 상속되기 떄문

### instanceof 연산자 사용

- 레퍼런스가 가리키는 객체의 타입 식별 : 연산의 결과는 ture/false의 불린 값으로 반환
    - 객체 레퍼런스 instanceof
    클래스타입
- instanceof 연산자 사용 사례
    
    ```java
    Person p = new proFessor();
    
    if(p insanceof Person)
    if(p insanceof Student)
    if(p insanceof Reserarcher)
    if(p insanceof Professor)
    
    if("java" instanceof String)
    ```
    

### 메소드 오버라이딩(Method Overriding)의 개념

- 서브 클래스에서 슈퍼 클래스의 메소드 중복 작성
- 슈퍼 클래스의 메소드 무력화, 항상 서브 클래스에 오버라이딩한 메소드가 실행되도록 보장
- “메소드 무시하기”로 번역되기도 함
- 오버라이딩 조건
→ 슈퍼 클래스 메소드의 원형(메소드 이름, 인자 타입 및 개수, 리턴 타입) 동일하게 작성

### 서브 클래스 객체와 오버라이딩된 메소드 호출

- 오버라이딩 한 메소드가 실행됨을 보장

```java
class A {
	void f() {
			System.out.orintln("A의 f() 호출");
			}
}
class B extends A {
	void f() {
		System.out.println("8의 f() 호출");
		}
}
```

### 오버라이딩의 목적, 다형성 실현

- 오버라이딩으로 다형성 실현
- 하나의 인터페이스(같은 이름)에 서로 다른 구현
- 슈퍼 클래스의 메소드를 서브 클래스에서 각각 목적에 맞게 다르게 구현
- 사례: Shape의 drew() 메소드를 Line, Rect, Circle에서 오버라딩하여 다르게 구현

### 동작 바인딩 - 오버라이딩된 메소드 호출

- SuperObject 하나만 있는 응용 프로그램의 경우 혹은 상속받은 경우 모두 동적 바인딩을 한다.
- 오버라디잉 메소드가 항상 호출된다.
- SuoerObject 는 키워드가 아닙니다.

```java
public class SuperObject {
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("Super Object");
	}
	public static void main(String[] args) {
		SuperObject a = new SuperObjcet();
		a.paint();
		}
} 
```

```java
class SuperObject {
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("Super Object");
	}
}
public class SubObject extends SuperObject {
	public void draw() {
		System.out.println("sub Object");
	}
	public static void main(String [] args) {
		SuperObject b = new SubObject();
		b.print();
	}
}
```

### super 키워드로 슈퍼 클래스의 멤버 접근

- 슈퍼 클래스의 멤버를 접근할 때 사용되는 레퍼런스
Super.슈퍼클래스의멤버
- 서브클래스에서만 사용
- 슈퍼 클래스의 필드 접근
- 슈퍼 클래스의 메소드 호출 시 super로 이루어지는 메소드 호출: 정적 바인딩

### 오버로딩과 오버라이딩

| 비교 | 메소드 오버로딩 | 메소드 오버라이딩 |
| --- | --- | --- |
| 선언 | 같은 클래스나 상속 관계에서 동일한 이름의 메소드 중복 작성 | 서브 클래스에서 슈퍼 클래스에 있는 메소드와 동일한 이름의 메소드 재작성 |
| 관계 | 동일한 클래스 내 혹은 상속 관계 | 상속관계 |
| 목적 | 이름이 같은 여러 개의 메소드를 중복 선언하여 사용의 편리성 향상 | 슈퍼 클래스에 구현된 메소드를 무시하고 서브 클래스에서 새로운 기능의 메소드를 재정의하자고자 함 |
| 조건 | 메소드 일므은 반드시 동일함. 메소드의 인자의 개수나 인자의 타입이 달라야 성립 | 메소드의 이름, 인자의 타입, 인자의 개수, 인자의 리턴 타입 등이 모두 동일하여야 성립 |
| 바인딩 | 정적 바인딩. 컴파일시 중복된 메소드중 호출되는 메소드 결정 | 동적 바인딩. 실행 시간에 오버라이딩된 메소드 찾아 호출 |

### 추상 클래스

- 추상 메소드(abstract method)
    - abstract로 선언된 메소드, 메소드의 코드는 없고 원형만 선언
    
    ```java
    abstract public String getName(); //추상 메소드
    abstract public String fail() {return "Good Bye");
    
    ```
    
- 추상 클래스(abstract class)
    - 추상 메소드를 가지며, abstract로 선언된 클래스
    - 추상 메소드 없이, abstact로 선언한 클래스

```java
//추상 메소드를 가진 추상 클래스
abstract class Shape{
	public Shape() { . . . }
	public void edit() { . . . }
	
	abstract public void draw(); //추상 메소드
}
```

```java
//추상 메소드 없는 추상 클래스
abstract class JComponent {
	String name;
	public void load(String name) {
		this.name = name;
		}
}
```

- class fault {  //오류. 추상메서드를 가지고 있으므로 abstract 로 선언되어야 함
    abstract public void f(); // 추상 메소드
}

### 추상 클래스의 인스턴스 생성 불가

- 추상 클래스는 온전한 클래스가 아니기 때문에 인스턴스를 생성할 수 없음

### 추상 클래스의 상속과 구현

- 추상 클래스 상속
    - 추상 클래스를 상속받으면 추상 클래스가 됨
    - 서브 클래스도 abstract로 선언해야 함.
    
    ```java
    abstract class A {
    	abstract public int add(int x, int y);
    }
    abstract class B extends A {
    	public void show() {System.out.println("B");}
    }
    
    A a = new A();
    B b = new B();
    ```
    
- 추상 클래스 구현
    - 서브 클래스에서 슈퍼 클래스의 추상 메소드 구현(오버라이딩)
    - 추상 클래스를 구현한 서브 클래스는 추상 클래스 아님
    
    ```java
    class C extends A {
    	public int add(int x, int y){return x+y;}
    	public void show() {System.out.printin("C");}
    }
    ...
    C c = new C();
    ```
    

### 추상 클래스의 목적

- 추상 클래스의 목적
    - 상속을 위한 슈퍼 클래스로 활용하는것
    - 서브 클래스에서 추상 메소드 구현
    - 다형성 실현

```java
abstract class Shape {
	public abstract void draw();
}
```

```java
class Line extends DObject {
	@override
	public void draw() {
		System.out.println("Line");
	}
}
```

```java
class Rect extends DObject {
	@overrid
	public void draw() {
		System.out.println("Rect");
		}
}
```

```java
class Circle extends DObject {
	@override
	public void draw() {
		System.out.println("Circle");
		}
}
```

### 자바의 인터페이스

- 소프트웨어를 규격화 된 묘듈로 만들고, 인터페이스가 맞는 모듈을 조립하듯이 응용프로그램을 작성 하기위해서 사용.

- 자바의 인터페이스
    - 클래스가 구현해야 할 메소드들이 선언되는 추상형
    - 인터페이스 선언: interface 키워드로 선언.
    
    EX) public interface SeriaDriver{…}
    
    ```java
    interface PhoneInterface {
    	public static final int TIMEOUT = 10000;
    	public abstract void sendCall();
    	public abstract void receiveCall();
    	public abstract void printLogo(); {
    		System.out.println(" ** Phone ** ");
    		};
    }
    	
    ```
    

### 인터페이스의 구성 요소들의 특징

[ 인터페이스의 구성 요소들 ]

- 상수: public만 허용, public static final 생략
- 추상 메소드 : public abstract 생략 가능
- default 메소드:
    - 인터페이스에 코드가 작성된 메소드
    - 인터페이스르르 구현하는 클래스에 자동 상속
    - public 접근 지정만 허용, 생략 가능
- private 메소드 :
    - 인터페이스 내에 메소드 코드가 작성되어야 함
    - 인터페이스 내에 있는 다른 메소드에 의해서만 호출 가능
- static 메소드 : public, private 모두 지정 가능 public.

### 추상 클래스 vs 인터페이스

- 공통점
    1. 추상 메소드를 가지고 있어야한다.
    2. 인트선트화 할수 없다( new 생성자 사용 X)
    3. 상송받아 구현한 구현체의 인스턴스를 사용해야한다.
    4. 상속한 클래스는 추상 메소드를 반드시 구현하여야 한다.

### 패키지 개념과 필요성

- 3명이 분담하여 자바 응용 프래그램을 개발하는경우, 동일한 이름의 클래스가 존재할 가능성 있음. → 합칠떄 오류 발생 가능성 → 개발자가 서로 다른 디렉터리로 코드 관리하여 해결.

### 자바의 패키지와 모듈이란?

- 패키지(package)
    - 서로 관련된 클래스와 인터페이스를 컴파일 한 클래스 파일들을 묶어 놓은 디렉터리
    - 하나의 으용ㅇ 프로그램은 한개 이상의 패키지로 작성
    - 패키지는 jar 파일로 압축 할 수있음.
- 모듈(module)
    - 여러 패키지와 이미지 등의 자원을 모아 높은 컨테이너
    - 하나의 모듈을 하나의 .jmod 파일에 저장
- JAVA 9 부터 모듈화 도입
    - 플랫폼의 모듈화 : Java 9 부터 API의 모든 클래스들(자바 실행 환경)을 패키지 기반으로 모듈들로 완전히 재구성
    - 응용 프로그램의 모듈화 : 클래스들은 패키지로 만들고, 다시 패키지를 모듈로 만듦
    모듈 프로그래밍은 어렵고 복잡.

### 자바의 모듈화의 목적

- 모듈화의 목적
    - java 9 부터 자바 API를 여러 모듈(99개)로 분활 : java 8 까지는 rt.jar 의 한 파일에 모든 API 저장. # 현재 70개로 정리됨.
    - 응용 프로그램이 실핼할떄 꼭필요한 모듈들로만 실핼 환경 구축 : 메모리 자원이 열약한 작은 소형 기기에 꼭필요한 모듈로 구성된 작은 크기의 실행 이미지를 만들기 위함.

### 자바 API의 모듈 파일들

- Temurin OpenJDK 24부터는 JEP 439 표준을 따르게 되어 jmods 디렉토리가 포함되지 않습니다.
- Temurin의 jlink tool을 활성화 하면 JMOD 파일을 사용하지 않고도 사용자 지정 run-time 이미지를 생성할 수 있어 JDK크기를 약 25% 줄일 수 있습니다.
- Temurin OpenJDK 24는 빌드할 떄 기본 자동으로 활성화 됩니다.

- 만일 jmods의 파일을 확인해 보고 싶다면 다른 곳에서 제공하는 OpenJDK를 확인해 보세요.

### 패키지 사용하기, import문

- 다른 패키지에 작성된 클래스 사용
    - import 를 이용하지 않는 경우
    → 소스에 클래스 이름의 완전 경로명 사용
- 필요한 클래스만 import
    - 소스 시작부분에 클래스의 경로명 improt
    - import 패키지.클래스
    - 소스에는 클래스 명만 명시 하면됨.
- 패키지 전체를 import
    - 소스 시작 부분에 패키지의 경로명. * import
    - import 패키지.*
    - 소스에는 클래스 명만 명시하면 됨
    - improt java.util.*;
    → java.util 패키지 내의 모든 클래스만을 지정, 하위 패키지의 클래스는 포함하지 않음.

## 4/15

---

### 생성자 개념과 목적

- 생성자
    - 객체가 생성될때 초기화 목적으로 실행되는 메소드
    - 객체가 생성되는 순간에 자동 호출

### 생성자의 특징

- 생성자 이름은 크래스 이름과 동일
- 생성자는 여러개 작성 가능(생성자 중복)
- 생성자는 객체 생성시 한 번만 호출
    - 자바에서 객체 생성은 반드시 new 연산자로 함

### 생성자의 종류

- 기본 생성자: 매개변수 없고, 아무 작업 없이 단순 리턴하는 생성자
- 기본 생성자가 자동 생성되는 경우
    - 클래스에 생성자가 하나도 선언되어 있지 않을 때
    - 컴파일러에 의해 기본 생성자 자동 생성
- 기본 생성자가 자동 생성되지 않는 경우
    - 클래스에 생성자가 선언되어 있는경우

### this 레퍼런스

- 객체 자신에 대한 레퍼런스
- 컴파일러에 의해 자동관리, 개발자는 사용하기만 하면 됨
- this.멤버 형태로 멤버를 접근할때

```java
public class Circle {
		int radius;
		
		public Circle() { radius = 1;}
		public Circle(int r) { radius = r; } 
		double getArea() {
				return 3.14 * radius * radius;		
		}
		...
}
```

```java
public class Circle {
	int radius;
	
	public Circle() {this.radius = 1;}
	public Circle(int radius) {
			this.radius = radius;
	}
	double getArea() {
			return 3.14 * this.radius * this.radius;
			}
		...
}
```

### this()롤 다른 생성자 호출

- 같은 클래스의 다른 생성자 호출
- 생성자 내에서만 사용 가능
- 생성자 코드의 제일 앞에 있어야 함
- this() 사용 실패 사례
    
    ```java
    public Book() {
    		System.out.printin("생성자 호출됨");
    		this("","",0); // 생성자의 첫 번째 문장이 아니기 때문에 컴파일 오류
    ```
    

### 객체 배열

- 객체에 대한 레퍼런스 배열
- 자바의 객체 배열 만들기 3 단계
    - 1.배열 레퍼런스 변수 선언
    - 레퍼런스 배열 생성
    - 배열의 각 원소 객체 생성

```java
Circle [] c; // 1. Circle 배열에 대한 레퍼런스 변수 C 선언
c= new Circle[5]; // 2. 레퍼런스 배열 생성

for(int i=0; i<c.length; i++)
	c[i] = new Circle(i);// 3. 각원소 객체 생성
	

------------------------------------------------
for(int i =0; i<c.length; i++)
	System.out.print((int)(c[i].getArea()) + " " );
```

### 메소드

- 메소드는 C/C++의 함수 와 동일
- 자바의 모든 메소드는 반드시 클래스 안에 있어야함 (캡슐화 원칙)
- 메소드형식
    
    ```java
    public int getSum(int i, int j) {
    	int sum;
    	sum = i + j;
    	return sum;
    }
    ```
    
- 접근 지정자 : 다른 클래스에서 메소드를 접근할 수 있는지 여부 선언
    - public, private, protected, 디폴트(접근 지정자 생략)
- 리턴 타입 : 메소드가 리턴하는 값의 데이터 타입

### 인자 전달 - 기본 탕비의 값이 전달되는 경우

- 매개 변수가 byte, int, double 등 기본 타입으로 선언되었을 때
    - 호출자가 건네는 값이 매개 변수에 복사되어 전달. 실 인자 값은 변경되지 않음
    
    ```java
    	public class CallByCalue {
    		public static void main(String args[]) {
    			int n = 10;
    			
    			increase(n);
    			
    			System.out.println(n);
    		}
    ```
    
    ```java
    static void increase(int m) {
    m = m + 1;
    
    	}
    }
    ```
    

### 인자 전달 - 배열이 전달되는 경우

- 배열 레퍼런스만 매개 변수에 전달 : 배열 통째로 전달되지 않음
- 객체가 전달되는 경우와 동일 : 매개 변수가 실인자의 배열 공유

```java
public class ArrayPassing {
	public static void main(String arg[]) {
	int a[] = {1, 2, 3, 4, 5};
	
	increase(a);
	
	for(int i=0; i<a.length; i++)
		System.out.print(a[i]+ " ");
	}
```

```java
static void increase(int [] array) {
for(int i=0; i<a.length; i++) 
	array[1]++;
		}
	}
}
```

### 메소드 오버로딩

- 한 클래스 내에서 두개 이상의 이름이 같은 메소드 작성
    - 메소드 이름이 동일해야함
    - 매개 변수의 갯 혹은 타입이 달라야함
    - 리턴 타입은 오버로딩과 관련없음
- 성공한 오버로딩과 메소드 호출

```java
public static void main(String args[]) {
MethodSample a = new MethodSample();

int i = a.getSum(1, 2);
int j = a.getSum(1, 2, 3);
double k = a.getSum(1.1, 2.2);
```

```java
public class MethodSample {
	public int getSum(int i, int j) {
				return i + j;
			}
	public int getSum(int i, int j, int k) {
				return i + j + k;
			}
	public int getSum(double i, double j) {
				return i + j;
			}
```

### 객체 치환시 주의할 점

- 객체 치환은 객체 복사가 아니며, 레퍼런스의 복사이다.

```java
public class samp {
int id;
public Samp(int x) {this.id = x;}
public void set(int x) {tihs.id = x;}
public int get() {return this.id;}

public static void main(String []args) {
	Samp ob1 = new Samp(3);
	Samp ob2 = new Samp(4);
	Samp s;
	
	s=ob2;
	ob1 = ob2;
	System.out.println("ob1.id="+ob1.get());
	System.out.println("ob2.id="+ob2.get());
		}
	}
	
```

### 객체 소멸

- new로 할당 받은 객체와 메모리를 jvm 으로 되돌려주는 행위
- 자바 객채 소멸 연산자 없음
- 객체 소멸은 JVM의 고유 역할
- C/C++에서는 할당 받은 객체를 개발자가 프로그램 내에서 삭제해야함
- C/C++의 프로그램 작성을 어렵게 만드는 요인
- 자바에서는 사용하지 않는 객체나 배열을 돌려주는 코등 책음으로 부터 개발자 해방

### 가비지

- 가리키는 레퍼런스가 하나도없는 객체
- 더 이상 접근할 수 없어 사용할 수 없게 된 메모리
- 가비지 컬렉션: 자바 가상 기계의 가비지 컬렉터가 자동으로 가비지 수집, 변환

```java
Person a, b;
a = new Person("이몽룡");
b = new Person("성춘향");

b = a; // b가 가리키던 객체는 가비지가 됨.
```

### 가비지 컬랙션

- JVM이 가비지 자동 회수
    - 가용 메모리 공간이 일정 이하로 부족해질떄
    - 가비지를 수거하여 가용 메모리 공간으로 확보
- 가비지 컬렉터에 의해 자동 수행
- 강제 가비지 컬렉션 강제 수행: System  또는 RunTime 객체의 GC() 메소드 호출
- 이 코드는 JVM 에 강력한 가비지 컬랙션 요청

### 자바의 패키지 개념

- 상호 관련 있는 클래스 파일(컴파일된 .class)을 저장하여 관리하는 디랙터리
- 자바 응용프로그램은 하나 이상의 패키지로 구성

### 접근 지정자

- 자바의 접근 지정자 4가지: private, protected, public, 디폴트( 접근 지정자 생략 )
- 접근 지정자의 목적
    - 클래스나 일부 멤버를 공개하여 다른 클래스에서 접근하도록 허용
    - 객체 지향 언어의 캡슐화 정책은 멤버를 보호하는것
    → 접근 지정은 캡슐화에 묶인 보호를 일부 해제할 목적으로 사용
- 접근 지정자에 따른 클래스나 멤버의 공개 범위

### 클래스 접근 지정

- 다른 클래스에서 사용하도록 허용할 지 지정
- public 클래스 : 다른 모든 클래스에게 접근 허용
- 디폴트 클래스(접근 지정자 생략): 같은 패키지의 클래스에만 접근 허용

```java
public class World{ // public 클래스
...........
}
class Local{ // 디폴트 클래스
........
}
```

### 멤버 접근 지정

public 멤버: 패키지에 관계 없이 모든 클래스에게 접근 허용

privae 멤버: 동일 클래스 내에만 접근 허용. 상속 받은 서브 클래스에서 접근 불가.

### static 멤버

- static 멤버 선언

```java
class StaticSample {
		int n;               //non-static 필드
		void g() {...}       //non-static 메소드
		
		static int m;        //static 필드
		static void f() {...}//static 메소드
```

- 객체 생성과 non-static 멤버의 생성
:non-static 멤버는 객체가 생성될떄, 객체마다 생긴다.

### static 멤버 사용

- 클래스 이름으로 접근 가능

```java
staticSample.m = 3; // 클래스 이름으로 static 필드 접근
staticSample.f().   // 클래스 이름으로 static 메소드 호출

```

- 객체의 멤버로 접근 가능

```java
staticSample b1 = staticSaple();

b1 = -3; // 객체이름으로 static 필드 접근
b1.f();  // 객체이름으로 static 메소드 호출
```

- non-static 멤버는 클래스이름으로 접근 안됨

```java
staticSample.n = 5;  //n은 non-staitc이미로 컴파일 오류
staticSample.g();    //g()는 non-static이므로 컴파일 오류
```

### #non-static 모든 객체에 멤버 생성 , static은 멤버공유

### static의 활용

- 전역 변수와 전역 함수를 만들 때 활용
- 공융 멤버를 만들때 : static으로 선언한 멤버는 클래스의 객체들 사이에 공유

### static 메소드의 제약 조건 1

- static 메소드는 오직 static 멤버만 접근 가능
    - 객체가 생성되지 않은 상황에서도 static 메소드는 실행될 수 있기 때문에, non-static멤버 활용 불가
    - non-static 메소드는 static 멤버 사용가능
    
    ```java
    class StaticMethod{
    	int n;
    	void f1(int x) { n = x; } //정상
    	void f2(int x) { m = x; } // 정상
    	static int m;
    	static void s1(int x) { n = x; } //컴파일 오류, static 메소드는 non-static필드 n 사용불가
    	static void s2(int x) { f1(3); } //컴파일 오류, siatic 메소드는 non-static 메소드f1() 사용불가
    	static void s3(int x) { m = x; ) //정상 static 매소드는 static 필드 m 사용 가능
    		static void s4(int x) { s3(3;  ) //정상 static 메소드는 static 매소드 s3() 호출 가능
    ```
    

### static 메소드의 제약 조건 2

- static 메소드는 this 사용불가
- static 메소드는 객체 없이도 사용 가능하므로, this 레퍼런스 사용할 수 없음

 

```java
//오류
static void f() { this.n = x; } // 오류. static 메소드에서는 this 사용 불가능
static void g() { this.m = x; } // 오류. static 메소드에서는 this 사용 불가능
```

### final 클래스와 메소드

- final 클래스 - 더 이상 클래스 상속 불가능

```java
final class FinalClass {
....
}
class DerivedClass extends FinalClass{ // 컴파일 오류
...
}
```

- final 메소드 - 더 이상 오버라이딩 불가능

```java
public class SuperClass{
	protected final int finalMethod() {...}
}

class SubClass extends SuperClass{
	protected int finalMethod{...} // 컴파일 오류, 오버라이딩 할수 없음
}
```

### final 필드

- final 필드 : 상수를 선언할 때 사용

```java
class SharedClass {
	public static final double PI = 3.14;
}
```

- 상수 필드는 선언 시에 초기 값을 지정하여야 한다.
- 상수 필드는 실행 중에 값을 변경할 수 없다.

```java
public class FinalFieldClass {
	final int ROWS = 10; // 상수 정의, 이때 초기 값(10) 반드시 설정
	
	void f() {
		int [] intArray = new int [ROWS]; //상수 활용
		ROWS = 30; // 컴파일 오류 발생, final 필드 값을 변경할 수 없다.
		}
	}
```

## 4주차(3/25)

---

### 비트연산

비트개념

byte x =10;       X | 0 | 0 | 0 | 0 | 1 | 0 | 1 | 0 |

- 비트 논리 연산: 비트끼리 AND, OR, XOR, NOT 연산
- 비트 시프트 연산 : 비트를 오른쪽이나 왼쪽으로 이동

### 비트연산이 사용되는 경우

- 비트연산은 하드웨어 프로그래밍 뿐만 아니라 일반 소프트웨어 개발에서도 여러 가지 용도로 사용됩니다.
- 특히 성능이 중요한 경우나 최적화가 필요한 경우에 많이 활용됩니다.

1. 성능 최적화 및 연산 속도 향상: 곱셉(*)과 나눗셈(/)보다 비트 연산(<<,>>) 이 훨씬 빠름
2. 권환 및 플래그 설정(비트 마스크): 여러 개의 상태 (flag)를 하나의 int 변수에 저장할떄 사용
3. 데이터 압축 및 최적화
-불필요한 공간을 줄이기 위해 여러 개의 작읍 값을 하나의 정수에 저장
4. 해싱(heshing) 및 암호화(Encryption)
- 비트 연산을 활용하여 해시 함수 및 암호화 알고리즘을 최적화
- 예: MD5, SHA-256, XOR 암호화 등
5. 빠른 연산 (짝수/홀수 한별, 절댓값 계산 등)
- 짝수/홀수 판별( 마지막 비트가 0이면 짝수, 1이면 홀수)
- 부호 바꾸기 (음수 변환)

### 조건문 - 단순 if 문, if-else 문

- 단순 if 문
-if의 괄호 안에 조건식(논리형 변수나 논리 연산)
- 실행문장이 단일 문장인 경우 둘러싸는 {, } 생략 가능
- if - else 문
- 조건식이 ture면 실행문장1, false이면 실행문장 2 실행
- 다중 if 문
- 조건문 이. 너무 많은 경우, switch 문 사용권장

### switch문

- Switch문의 식과 case 문의 값과 비교
    - case의 비교 값과 일치하면 해당 case의 실행문장 수행
    - break를 만나면 switch문을 벗어남
    - case의 비교값과 일치하는 것이 없으면 default문 실행
    - case의 비교 값과 일치하는 것이 없으면 default 문 실행
    - default문은 생략 가능

### break문

switch문 내의 break문

- break문을 만나면 switch문 벗어남
- case문에 break가 없다면 다음 case문 계속 실행
- 언젠가 break 를 만날때까지 계속 내려가면서 실행
- 반복문 하나를 즉시 벗어날때 사용, 하나의 반복문만 벗어남
- 중첩 반복의 경우 안쪽 반복문의 break 문이 실행되면 안쪽 반복문 만 벗어남.

### case문

- case문의 값
    - 문자, 정수, 문자열 리터럴만 허용
    - 실수 리터럴은 허용되지않음
    
    (리터럴은 **변수에 저장되기 전부터 그 자체로 값(상수)을 의미하는 고정된 데이터 표현**)
    

### 반복문

- 자바 반복문 - for 문 , whill문, do-while 문
    - for(초기문; 조건식; 반복 후 작업) {
    .. 조건문 ..
    }

### continue문

- 반복문을 빠져 나가지 않고, 다음 반본으로 제어 변경.
- 반복문에서 continue;문의 분기

![image.png](attachment:e118d510-567b-46b2-a6f6-c3b5c48c17d2:image.png)

### 자바 배열(array)

- 인뎃스와 인뎃스으ㅔ 대응하는 데이터들로 이루어진 자료구조로 한번에 많은 메모리 공간 선언.
- 같은 타입의 데이터들이 순차적으로 저장되는 공간으로 인덱스를 이용하여 원소 데이터 접근.
- 반복문을 이용하여 처리하기에 적합한 자료구조
- 배열 인덱스 : 0부터 시작

## 4/8 수업

---

### 비교 연산, 논리 연산

- 비교연산자 : 두개의 값을 비교하여 ture / false 결과
- 논리연산자 : 두 개의 논리 값에 논리연산. 논리결과

```java
(age >= 20) && (age < 30)     //나이(int age)가 20대인 경우
(c >= 'A') && (c <= 'Z')      // 문자(char c)가 대문자인 경우
(x >= 0) && (y>=0) && (x<=50) && (y<=50).    //(x,y)가 (50,50)의 사각형 내에 있음

```

### 배열의 크기, length 필드

- 자바의 배열은 객체로 처리
- 배열의 크기는 배열 객체의 length 필드에 저장

```java
int intArray[];
intArray = new int[5];

int size = intArray.lenght;
//size는 5
```

- length 필드를 이용하여 배열의 모든 값을 출력하는 사례

```cpp
for(int i=0; i<intArray.length; i++) // inrArray 배열 크기만큼 루프를 돈다
	System.out.println(intArray[i]);
```

### 함수 호출 시 배열 전달 비교 : C/C++ vs 자바

- 자바가 C/C++에 비해 배열을 다루기 10배 편한 구죠

```cpp
//c/c++
int sum(int x[], int size){
	int n, s=0;
		for( n=0; n < size; n++)
					s += x[n];
		return s;
}
```

```java
//java
int sum(int x[]) {
	int n, s=0;
	for(n=0; n < x.lenght; x++)
				s += x[n];
		return s;
}		
		
```

### 배열과 for - each문

- for-each문 : 배열이나 나열의 원소를 순차접근하는데 유용한 for 문
    
    for(변수 : 배열 레퍼런스) {
    
    .. 반복작업문..
    
    }
    
- for-each문으로 정수 배열의 합을 구하는 사례

```cpp
int[]n = {1,2,3,4,5};
int sum = 0;
for (int k : n) {
				sum += k;
} 
```

### 2차원 배열

- 2차원 배열 선언

```cpp
int intArray[][]; 또는 int[][] intArray;
```

- 2차원 배열 생성

```cpp
int Array = new int [2][5]; int intArray[] = new int[2[5]; // 배열 선언과 생성 동시
```

- 2차원 배열 구조
- 2차원 배열의 length 필드
i.length → 2차원 배열의 행의 개수로 2
i[n].lenght → n번째 행의 열의 개수
i[1]. length → 1번째 행의 열의 개수, 5

### 2차원 배열의 초기화

### 메소드의 배열 리턴

- 배열의 레퍼런스만 리턴되며, 배열 전체가 리턴되는 것이 아님
- 메소드의 리턴 타입
    - 리턴하는 배열 타입과 리턴 받는 배열 타입 일치
    - 리턴 타입에 배열의 크기를 지정하지않음.

```cpp
int[] makeArray() {
		int temp[] = new int[4];       int[] intArray;
		return temp;
}
```

### 배열을 리턴 받아 사용하는 과정

```cpp
int[] makeArray(){
	int temp[] = new int [4];
	return temp;
}
```

### 자바의 예외 처리

- 예외: 실행 중 오동작이나 결과에 악영향을 미치는 예상치 못한 상황 발생
→ 자바에서는 실행 중 발생하는 에러를 예외로 처리
- 실행 중 예외가 발생하면 : 자바 필랫폼은 응용 프로그램이 예외를 처리하도록 호출
→ 응용 프로그램이 예외를 처리하지 않으면 프로그램 강제 종료 시킴

[예외 발생 경우]

- 정수를 0으로 나누는 경우
- 배열의 크기보다 큰 인덱스로 배열의 온소를 접근하는 경우
- 정수를 읽는 코드가 실행되고 있을 때 사용자가 문자를 입력한 경우

### 자바의 예외 처리, try-catch-finally문

- 예외 처리: 발생한 예외에 대해 개발자가 작성한 프로그램 코드에서 대응하는것
- try-catch-finally문 사용, finally 블록은 생략 가능

```java
try {
	예외가 발생할 가능성이 있는 실행문(try문)
	}
catch(처리할 예외 타입 선언){
	예외 처리문(catch 블록)
	}
finally{
	예외 발생 여부아 상관없이 무조건 실행되는 문장(finally 블록)	
	}
```

### 자바의 예외 클래스

- 자바는 응용 프로그램이 실행중 오류를 탐지할 수 있도록 많은 예외를 클래스 형태로 제공

| 예외 타입 (예외 클래스) | 예외 발생 경우 | 패키지 |
| --- | --- | --- |
| ArithmeticException | 정수를 0으로 나눌때발생 | java.lang |
| NullpointerException | null 래퍼런스르 참조할 때 발생 | java.lang |
| ClassCastException | 변환할 수 없는 타입으로 객체를 변활할떄 발생 | java.lang |
| OutOfMemoryError | 메모리가 부족한 경우 발생 | java.lang |
| ArrayIndexOutOfBoundsException | 배열의 범위를 벗어난 접근 시 발생 | java.lang |
| IllegalArgumentException | 잘못된 인자 전달 시 발생 | java.lang |
| IOException | 입출력 동작 실패 또는 인터럽트 시 발생 | java.io |
| NumberFormatException | 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환시 발생 | java.lang |
| InputMismatchException | Scanner 클래스의 nextInt()를 호출하여 정수로 입력받고자 하였지만, 사용자가 ‘a’ 등과 같이 문자를 입력한 경우 | java.util |

### 예외 클래스 사례

- 배열의 범위를 벗어나 원소를 접근하는 예외 처리
- ArrayIndexOutBoundsException 예외

```java
int intArray [] = new int[5];

try{
	intArray[3] = 10; // 예외 발생하지 않음
	intArray[6] = 5;  // 예외 발생
}
catch(ArrayIndexOutOfBoundsException){ 
	System.out.println("배열의 범위를 코과하여 원소를 접근하였습니다");
}

```

### 자바의 객체 지향 특성 : 캡슐화

- 캡슐화 : 객체를 캡슐로 싸서 내부를 볼 수 없게 하는것
    - 객체의 가장 본질적인 특징
    - 외부의 접근으로부터 객체 보호
- 자바의 캡슐화
    - 클래스(class): 객체 모양을 선언한 틀 (캡슐화하는 틀)
    - 객체 : 생성된 실체(instance): 클래스 내에 메소드와 필드 구현

### 자바의 객체 지향 특성 : 상속

- 상속
    - 상위 객체의 속성이 하위 객체에 물려줌
    - 하위 객채가 상위 객체의 속성을 모두 가지는 관계
- 실세계의 상속 사례
    - 나무는 식물의 속성과 생물의 속성을 모두 가짐
    - 사람은 생물의 속성은 가지지만 식물의 속성은 가지고 있지 않음
    

### 자바의 상속

- 자바의 상속
    - 상위 클래스의 맴버를 하위 클래스가 물려받음
    - 상위 클래스 : 수퍼 클래스
    - 하위 클래스 : 서브 클래스, 수퍼 클래스 코드의 재사용, 새로운 특성 추가 가능

### 자바의 객체 지향 특징 : 다향성

- 다향성
    - 같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 구현되는 것
- 다형성 사례
    - 메소드 오버로딩 : 한 클래스 내에서 같은 이름이지만 다르게 작동하는 여러 메소드
    - 메소드 오버라이딩 : 슈퍼 클래스의 메소드를 동일한 일므으로 서브 클래스마다 다르게 구현

### 객체 지향 언어의 목적

1. 소프트웨어의 생산성 향상
    - 컴퓨터 산업 발전에 따라 소프트웨어의 생명 주기 단축
    - 소프트웨어를 빠른 속도로 생산할 필요성 증대

객체 지향 언어

- 상속, 다향성, 객체, 캡슐화 등 소프트웨어 재사용을 위한 여러 장치 내장
- 소프트웨어 재사용과 부분 수정 빠름
- 소프트웨어를 다시 만드는 부담 대폭 줄임
- 소프트웨어 생산성 향상
1. 실세계에 대한 쉬운 모델링
    - 초기 프로그래밍
        - 수학 계산/통계 처리를 하는 등 처리 과정, 계산 절차 중요
    - 현대 프로그래밍
        - 컴퓨터가 산업 전반에 활용
        - 실세계에서 발생하는 일을 프로그래밍
        - 실세계에서는 절차나 과정보다 물체(객체)들의 상호 작용으로 묘사하는 것이 용이
    - 객체 지향 언어
        - 실세계의 일을 보다 쉽게 프로그래밍하기 위한 객체 중심적 연어
    

### 절차 지향 프로그래밍과 객체 지향 프로그래밍

- 절차 지향 프로그래밍
    - 작업 순서를 표현하는 컴퓨터 명령 집합
    - 함수들의 집합으로 프로그램 작성
- 객체 지향 프로그래밍
    - 컴퓨터가 수행하는 작업을 객체들 간의 상호 작용으로 표현

### 클래스와 객체

- 클래스: 객체의 속성과 행위 선언. 객체의 설계도 혹은 틀

- 객체 : 클래스의 틀로 찍어낸 실체
    - 프로그램 실행중에 생성되는 실체
    - 메모리 공간을 갖는 구체적인 실체
    - 인스턴스라고도 부름
- 사례
    - 클래스 : 소나타자동차,     객체: 출고된 실제 소나타 100데
    - 클래스: 벽시계,  객체: 우리집 벽에 걸린 벽시계들

### 자바 클래스 구성

- 클래스
    - class 키워드로 선언
    - 맴버 : 클래스 구성요소.필드(멤버 변수)와 메소드(멤버 함수)
    - 클래스에 대한 public 접근 지정 : 다른 모든 클래스에서 클래스 사용 허락
    - 맴버에 대한 public 접근 지정 : 다른 모든 클래스에게 접근 허용
## 3주차 (3/18)

---

### var 키워드

java 10 부터 도입 되었습니다.

var 키워드는 타입을 생략하고 변수 선언을 할수있습니다.

컴파일러가 추론하여 변수 타입을 결정합니다.

변수 선언할떄 초기값이 주지 않으면 컴파일 오류가 발생합니다.

### 전위/후위 연산자 (++, --)

- **전위 연산자**: 연산을 **먼저** 수행한 뒤 값을 사용
    - `++i`, `--i`
    - 예: `int i = 1; int a = ++i;` → i=2, a=2
- **후위 연산자**: 현재 값을 **먼저** 사용한 뒤 연산을 수행
    - `i++`, `i--`
    - 예: `int i = 1; int a = i++;` → a=1, i=2
- **주의**: 한 줄에서 여러 번 섞어 쓰면 가독성이 떨어지고 실수가 생기기 쉬우니, 가능하면 한 줄에 한 번만 사용합니다.

System.out.print()의 종류

- System.out.print()
    - 기본 출력문으로 줄 바꿈을 하지 않고 한줄로 출력함
- System.out.println()
    - 출력 후. 자동으로 줄바꿈 (개행)을 실행합니다.
- System.out.printf()
    - 형식을 지정(formatting)하여 문자열을 출력할 때 사용합니다.

### 자바의 키 입력 : [System.in](http://System.in) vs Scanner

- System.in
    - 키보드와 연결된 자바의 표준 입력 스트림
    - 입력되는 키를 바이트(문자 아님)로 리턴하는 저수준 스트림
    - System.in을 직접 사용하면 바이트를 문자나 숫자로 변환하는 많은 어려움 있음
- Scanner 클래스
    - 읽은 바이트를 문자, 정수, 실수, 불린, 문자열 등 다양한 타입으로 변환하여 리턴
- java.util.Scanner
    - 객체를 생성해서 사용
    - 키보드에 연결된 [System.in](http://System.in)에게 키를 읽게하고, 원하는 타입으로 변환하여 리턴
    - 입력되는 키 값을 공백으로 가분되는 토큰 단위로 읽음
    - 공백 문자 :’ \t ‘ , ‘\r ‘ , ‘\n ‘, ‘ ‘, ‘ \f ’ (페이지 나누기, 폼피드, 프린트에서 사용)

### 자바의 특징

- 실시간으로 응용프로그램에 부적합
    - 실행 도중 예측할 수 없는 시점에 가비지 컬랙션 실행
    - 응용프로그램의 일시적 중단 발생
- 자바 프로그램은 안전
    - 타입 체크 엄격
    - 물리적 주소 ??? 를 사용하는 포인터 개념 없음
- 프로그램 작성 쉬움
    - 포인터 개념이 없음, 동적 메모리 반환 하지 않음, 다양한 라이브러리지원.
- 실행 속도 개선을 위해 JIT 컴파일러 사용
    - 자바는 바이트 코드를 인터프리터 방식으로 실행
    - 기계어가 실행되는 것보다 느림
    - JIT 컴파일 기법으로 실행 속도 개선
    - JIT 컴파일 - 실행 중에 바이트 코드를 기계어 코드로 컴파일하여 기계어를 실행하는 기법

### 조건 연산

- 3개의 피연산자로 구성된 삼항(ternary) 연산자
- opr1 ? opr2 : opr3 → opr1이 결과가, true면 opr2, false면 opr3
- if-else 을 조건 연산자로 간결하게 표현 가능


## 2주차(3/11)

Pascal Case

- **정의**: 여러 단어를 이어서 쓸 때 각 단어의 **첫 글자를 대문자**로 쓰고, 나머지는 소문자로 쓰는 표기법입니다.
- **특징**: 단어 사이에 공백이나 밑줄\(_\)을 쓰지 않습니다.
- **예시**
    - `PascalCase`
    - `UserName`
    - `StudentId`
- **주로 쓰는 곳**
    - Java의 **클래스명**, **인터페이스명**, **Enum명** (관례)
    - 생성자 이름은 클래스명과 같아서 자연스럽게 PascalCase가 됩니다.
- **비교**
    - `camelCase`: 첫 단어만 소문자, 이후 단어 첫 글자는 대문자 \(예: `userName`\)
    - `snake_case`: 단어를 `_`로 구분 \(예: `user_name`\)

### [ 기계어 ]

1. 0, 1,의 이진수로 구성된 언어
2. 컴퓨터의 cpu는 기계어만 이해하고 처리 가능

### [ 어셈블리어 ]

- 기계어 명령을 ADD, SUB, MOVE 등과 같은 표현 하기 쉬운 상징적인 단어인 
니모닉 기호(mnemonic symbol)로 일대일 대응시킨 언어

### [ 고급언어 ]

- 사람이 사용하는 언어로 이애하기 쉽고, 쉽게 표현할 수 있도록 고안된 언어입니다.
- pascal, basic, C/C++, java, c#
- 절차 지향 언어와 객체 지향 언어로 나눌수 있습니다.

### [절차 지향 언어]

- 프로그램을 절차, 순서에 따라서 실행
- 데이터(입력)와 함수를 분리
- 코드의 유연성 부족, 재사용이 어러움
- 전역 변수를 많이사용하기에 코드의 가독성과 유지보수가 어려워짐
- C, Pascal, Fortran등

### [객체 지향 언어]

- 현실의 객체를 모델링하여 프로그램을 작성하는 방식
- 객체는 데이터와 데이터를 처리하는 메소드(함수) 를 모두 포함
- 상속, 캡슐화 다향성 등의 개념을 활용하여 유연하고 재사용가능한 코드를 작성 가능
- Java, C++, Python

### [함수 지향 언어]

- 함수형 언어는 함수를 일급 객체로 취급, 상태변겅을 피하고 불변성을 지향하는 프로그래밍 패러다임
- 함수형 언어에서는 함수의 조합으로 복잡한 작업을 수행, 상태 변경 대신에 
데이터를 변환하는 방식의 프로그램을 작성
- 재귀, 고차함수, 순수함수 등의 개념을 중요시, 병렬 처리와 높은 수준의 추상화를 지원
- 객체 지향 언어의 특성을 그대로, 함수 지향적인 기능을 추가
- python, Kotlin, Haskell, Lisp, Scala<br>


<h1>3월 26일 정리</h1>
JVM: 자바 가상 머신

HEAP: 더미 데이터

### var 키워드

java 10 부터 도입 되었습니다.

var 키워드는 타입을 생략하고 변수 선언을 할수있습니다.

컴파일러가 추론하여 변수 타입을 결정합니다.

변수 선언할떄 초기값이 주지 않으면 컴파일 오류가 발생합니다.

### 전위/후위 연산자 (++, --)

- **전위 연산자**: 연산을 **먼저** 수행한 뒤 값을 사용
    - `++i`, `--i`
    - 예: `int i = 1; int a = ++i;` → i=2, a=2
- **후위 연산자**: 현재 값을 **먼저** 사용한 뒤 연산을 수행
    - `i++`, `i--`
    - 예: `int i = 1; int a = i++;` → a=1, i=2
- **주의**: 한 줄에서 여러 번 섞어 쓰면 가독성이 떨어지고 실수가 생기기 쉬우니, 가능하면 한 줄에 한 번만 사용합니다.



System.out.print()의 종류

- System.out.print()
    - 기본 출력문으로 줄 바꿈을 하지 않고 한줄로 출력함
- System.out.println()
    - 출력 후. 자동으로 줄바꿈 (개행)을 실행합니다.
- System.out.printf()
    - 형식을 지정(formatting)하여 문자열을 출력할 때 사용합니다.

### 자바의 키 입력 : [System.in](http://System.in) vs Scanner

- System.in
    - 키보드와 연결된 자바의 표준 입력 스트림
    - 입력되는 키를 바이트(문자 아님)로 리턴하는 저수준 스트림
    - System.in을 직접 사용하면 바이트를 문자나 숫자로 변환하는 많은 어려움 있음
- Scanner 클래스
    - 읽은 바이트를 문자, 정수, 실수, 불린, 문자열 등 다양한 타입으로 변환하여 리턴
- java.util.Scanner
    - 객체를 생성해서 사용
    - 키보드에 연결된 [System.in](http://System.in)에게 키를 읽게하고, 원하는 타입으로 변환하여 리턴
    - 입력되는 키 값을 공백으로 가분되는 토큰 단위로 읽음
    - 공백 문자 :’ \t ‘ , ‘\r ‘ , ‘\n ‘, ‘ ‘, ‘ \f ’ (페이지 나누기, 폼피드, 프린트에서 사용)

### 자바의 특징

- 실시간으로 응용프로그램에 부적합
    - 실행 도중 예측할 수 없는 시점에 가비지 컬랙션 실행
    - 응용프로그램의 일시적 중단 발생
- 자바 프로그램은 안전
    - 타입 체크 엄격
    - 물리적 주소 ??? 를 사용하는 포인터 개념 없음
- 프로그램 작성 쉬움
    - 포인터 개념이 없음, 동적 메모리 반환 하지 않음, 다양한 라이브러리지원.
- 실행 속도 개선을 위해 JIT 컴파일러 사용
    - 자바는 바이트 코드를 인터프리터 방식으로 실행
    - 기계어가 실행되는 것보다 느림
    - JIT 컴파일 기법으로 실행 속도 개선
    - JIT 컴파일 - 실행 중에 바으트 코드를 기계어 코드로 컴파일하여 기ㅖ어를 실행하는 기법

### 조건 연산

- 3개의 피연산자로 구성된 삼항(ternary) 연산자
- opr1 ? opr2 : opr3 → opr1이 결과가, true면 opr2, false면 opr3
- if-else 을 조건 연산자로 간결하게 표현 가능

```mermaid
int x = 5;
int y = 3;

int big;
if(x>y)
	big = x;             
else
	big = y;
```

### 비트연산

비트개념

byte x =10;       X | 0 | 0 | 0 | 0 | 1 | 0 | 1 | 0 |

- 비트 논리 연산: 비트끼리 AND, OR, XOR, NOT 연산
- 비트 시프트 연산 : 비트를 오른쪽이나 왼쪽으로 이동

### 비트연산이 사용되는 경우

- 비트연산은 하드웨어 프로그래밍 뿐만 아니라 일반 소프트웨어 개발에서도 여러 가지 용도로 사용됩니다.
- 특히 성능이 중요한 경우나 최적화가 필요한 경우에 많이 활용됩니다.

1. 성능 최적화 및 연산 속도 향상: 곱셉(*)과 나눗셈(/)보다 비트 연산(<<,>>) 이 훨씬 빠름
2. 권환 및 플래그 설정(비트 마스크): 여러 개의 상태 (flag)를 하나의 int 변수에 저장할떄 사용
3. 데이터 압축 및 최적화
-불필요한 공간을 줄이기 위해 여러 개의 작읍 값을 하나의 정수에 저장
4. 해싱(heshing) 및 암호화(Encryption)
- 비트 연산을 활용하여 해시 함수 및 암호화 알고리즘을 최적화
- 예: MD5, SHA-256, XOR 암호화 등
5. 빠른 연산 (짝수/홀수 한별, 절댓값 계산 등)
- 짝수/홀수 판별( 마지막 비트가 0이면 짝수, 1이면 홀수)
- 부호 바꾸기 (음수 변환)

### 조건문 - 단순 if 문, if-else 문

- 단순 if 문
-if의 괄호 안에 조건식(논리형 변수나 논리 연산)
- 실행문장이 단일 문장인 경우 둘러싸는 {, } 생략 가능
- if - else 문
- 조건식이 ture면 실행문장1, false이면 실행문장 2 실행
- 다중 if 문
- 조건문 이. 너무 많은 경우, switch 문 사용권장

### switch문

- Switch문의 식과 case 문의 값과 비교
    - case의 비교 값과 일치하면 해당 case의 실행문장 수행
    - break를 만나면 switch문을 벗어남
    - case의 비교값과 일치하는 것이 없으면 default문 실행
    - case의 비교 값과 일치하는 것이 없으면 default 문 실행
    - default문은 생략 가능

### break문

switch문 내의 break문

- break문을 만나면 switch문 벗어남
- case문에 break가 없다면 다음 case문 계속 실행
- 언젠가 break 를 만날때까지 계속 내려가면서 실행
- 반복문 하나를 즉시 벗어날때 사용, 하나의 반복문만 벗어남
- 중첩 반복의 경우 안쪽 반복문의 break 문이 실행되면 안쪽 반복문 만 벗어남.

### case문

- case문의 값
    - 문자, 정수, 문자열 리터럴만 허용
    - 실수 리터럴은 허용되지않음
    
    (리터럴은 **변수에 저장되기 전부터 그 자체로 값(상수)을 의미하는 고정된 데이터 표현**)
    

### 반복문

- 자바 반복문 - for 문 , whill문, do-while 문
    - for(초기문; 조건식; 반복 후 작업) {
    .. 조건문 ..
    }

### continue문

- 반복문을 빠져 나가지 않고, 다음 반본으로 제어 변경.
- 반복문에서 continue;문의 분기


### 자바 배열(array)

- 인뎃스와 인뎃스에 대응하는 데이터들로 이루어진 자료구조로 한번에 많은 메모리 공간 선언.
- 같은 타입의 데이터들이 순차적으로 저장되는 공간으로 인덱스를 이용하여 원소 데이터 접근.
- 반복문을 이용하여 처리하기에 적합한 자료구조
- 배열 인덱스 : 0부터 시작