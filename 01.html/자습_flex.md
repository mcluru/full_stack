# Flex

<h3>Flex는 Container, Items 두가지로 나뉨 </h3>
Container : Items를 감싸는 부모요소. 각 Item을 정렬하기 위해 필요<br>
<br>

- 사용속성
  - Container : display, flex-flow, justify-content 등
  - Items : order, flex, align-self 등

<br>

# Conrainer 속성

- display : Flex Container를 정의
- flex-flow : flex-direction와 flex-wrap의 단축 속성
- flex-direction : Items의 주 축 설정 (요소의 방향)
- flex-wrap : Items의 줄바꿈 설정 (요소 정렬)
- justify-content : 주 축의 정렬 방법 설정
- align-content : 교차 축의 정렬 방법 설정(2줄 이상)
- align-items : 교차 축에서 Items 정렬 방법 설정(1줄)
<br>
<br>
<hr>
<h2>display</h2>

container의 방향을 수직/수평 설정  
내부 Items에는 영향x

- flex : Block 특성. 수직 쌓임
- inline-flex : Inline 특성. 수평 쌓임
<br>
<br>
<h2>flex-flow</h2>

주 축과 줄바꿈 동시에 설정

- 사용법 : 주축속성값 줄바꿈속성값;  
 ex) flex-flow : row-reverse wrap;
<br>
<br>
<h2>flex-direction</h2>

Items의 주 축 설정.  
설정한 방향부터 Item이 놓인다 (=reverse되면 Items의 방향도 바뀜)  
주 축에 따라 교차측도 변경됨.

- row (default) : 수평축(가로방향) 좌 -> 우
- row-reverse : 수평축 좌 <- 우
- column : 수직축(세로방향) 위 -> 아래
- column-reverse : 수직축 위 <- 아래
<br>
<br>
<h2>flex-wrap</h2>
Items의 줄바꿈 설정

- nowrap (default) : 모든 Items 한 줄에 표시(Container 넓이에 맞게 축소)
- wrap : Container보다 요소 총 넓이가 커지면 나머지를 다음줄로 보냄
- wrap-reverse : 줄바꿈 요소를 역순으로 배열  
   ex)

        D E
        A B C

<br>
<br>
<h2>justify-content</h2>
주 축의 정렬방법 설정

\*주 측이 수직측이면 세로로 정렬됨

- flex-start (default) : 시작점으로 정렬
- flex-end : 끝점으로 정렬
- center : 가운데 정렬
- space-between : 각각 시작점과 끝점에 두고 나머지는 사이에 간격 맞춰 정렬
- space-around : 여백 포함 간격 맞춰 정렬

<br>
<br>
<h2>align-content</h2>

교차 축의 정렬방법 설정  
flex-wrap 속성이 wrap으로 2줄 이상이고 여백 있을 때만 사용 가능

- stretch : Container의 교차 축을 채우기 위해 Items를 늘림
- flex-start : 시작접으로 정렬
- flex-end : 끝점으로 정렬
- center : 가운데 정렬
- space-between : 각각 시작점과 끝점에 두고 나머지는 사이에 간격 맞춰 정렬
- space-around : 여백 포함 간격 맞춰 정렬

<br>
<br>
<h2>align-items</h2>

교차 축의 정렬방법 설정  
1줄일 경우 사용

- stretch : Container의 교차 축을 채우기 위해 Items를 늘림
- flex-start : 시작접으로 정렬
- flex-end : 끝점으로 정렬
- center : 가운데 정렬
- baseline : 문자 기준선에 정렬

<br>
<br>
<br>

# Items 속성

- order : Item의 순서 설정
- flex : flex-grow, flex-shrink, flex-basis의 단축 속성
- flex-grow : Item의 증가 너비 비율 설정
- flex-shrink : Item의 감소 너비 비율 설정
- flex-basis : Item의 (공간 배분 전) 기본 너비 설정
- align-self : 교차 축에서 Item 정렬 방법 설정
<br>
<br>
<hr>
<h2>order</h2>

Item에 숫자를 지정해 순서 설정. (음수 가능)  
숫자가 클수록 순서 밀림  
ex)

    .yellow {
      order : -3;     // 왼쪽으로 3번 이동
    }

<br>
<br>
<h2>flex</h2>

Item의 너비(증가, 감소, 기본) 설정하는 단축 속성

- 사용법 : 증가너비 감소너비 기본너비;  
  생략하면 기본값 적용됨 (flex-grow 제외 생략 가능)
  ex) flex : 1 1 20px; -> 증가너비 감소너비 기본너비  
  ex) flex : 1 1; -> 증가너비 감소너비

* flex-basis의 기본값은 auto, 단축속성에서 생략할 경우 0 적용

<br>
<br>
<h2>flex-grow</h2>

Item의 증가 너비 비율 설정. (숫자 클수록 더 많은 너비 가짐)  
모든 Items는 총 증가 너비에서 각 item의 증가 너비 비율만큼 너비 가질 수 있음  
즉, 상대적 너비라는 의미  
0일 경우 효과 x (늘어나지 않음)

- 기본값 : 0  
  ex) \<div class="item">0\</div>

<br>
<br>
<h2>flex-shrink</h2>

Item의 감소 너비 비율 설정. (숫자 클수록 더 많은 너비 감소)  
width, height, flex-basis 등으로 너비 지정된 경우에만 영향 받음.  
Container의 너비가 줄어 Items의 너비에 영향 미칠 경우, 영향을 미치기 시작한 지점부터 줄어든 거리만큼 감소 너비 비율에 맞게 줄어듬.  
0일 경우 효과 x()

- 기본값 : 1  
  ex) \<div class="item">0\</div>

<br>
<br>
<h2>flex-basis</h2>

Item의 (공간 배분 전) 기본 너비 설정.

- 기본값 : auto

값이 auto일땐 width, height 등의 속성으로 Item의 너비 설정 가능.  
px, em, cm 등 단위 값이 주어질 경우 설정 불가

<br>
<br>
<h2>align-self</h2>

교차 축에서 개별 Item의 정렬 방법 설정.
Container내 모든 Items의 정렬 방법을 설정하는 align-items와 달리 필요에 의해 일부만 정렬을 변경할 경우 사용 가능.  
align-items 속성보다 우선함

- auto : Conainer의 align-items 속성을 상속받음  
  기본값 : auto
- stretch : Container의 교차 축을 채우기위해 Item을 늘림
- flex-start : 각 줄의 시작점으로 정렬
- flex-end : 각 줄의 끝점으로 정렬
- center : 가운데 정렬
- baseline : 문자 기준선에 정렬
