# Grid

<h3>Grid는 Container, Items 두가지로 나뉨 </h3>
Container : Items를 감싸는 부모요소. 각 Item을 정렬하기 위해 필요<br>
Flex보다 좀 더 복잡한 레이아웃을 위해 사용<br>
<br>

- 사용속성
  - Container : display, grid-template-rows, gap 등
  - Items : grid-row-start, grid-area, align-self 등

<br>

# Conrainer 속성

- display : Grid Container를 정의
- grid-template-rows : 명시적 행(Track)의 크기 정의
- grid-template-columns : 명시적 열(Track)의 크기 정의
- grid-template-areas : 영역(Area) 이름을 참조해 템플릿 생성
- grid-template : grid-template-xxx의 단축 속성
- row-gap(grid-row-gap) : 행과 행 사이 간격 정의
- column-gap(grid-column-gap) : 열과 열 사이의 간격 정의
- gap(grid-gap) : xxx-gap의 단축 속성
- grid-auto-rows : 암시적 행(Track)의 크기 정의
- grid-auto-columns : 암시적 열(Track)의 크기 정의
- grid-auto-flow : 자동 배치 알고리즘 방식 정의
- grid : grid-template-xxx과 grid-auto-xxx의 단축 속성
- align-content : 그리드 콘텐츠 수직 정렬
- justify-content : 그리드 콘텐츠 수평 정렬
- place-content : align-content와 justify-content의 단축 속성
- align-items : 그리드 아이템들 수직 정렬
- justify-items : 그리드 아이템들 수평 정렬
- place-items : align-items와 justify-items의 단축 속성
<br>
<br>
<hr>
<h2>display</h2>

container 정의.  
정의된 컨테이너 자식 요소들은 자동으로 Item으로 정의됨

- grid : Block 특성 컨테이너 정의
- inline-grid : Inline 특성 컨테이너 정의

<br>
<br>
<h2>grid-template-rows</h2>

1.명시적 행 크기 정의, 동시에 라인 이름 정의 가능(중복된 이름 지정 가능)  
2.fr(fraction, 공간비율) 단위 사용 가능  
3.repeat() 함수 사용가능 : grid-template-rows : repeat(나눌 칸 개수, 각 행 크기)

ex)

    .container {
    display: grid;
    grid-template-rows : 1행크기 2행크기 ...;                     //각 행의 크기 정의
    grid-template-rows : [선이름] 1행크기 [선이름] 2행크기...;    //각 행 크기 정의
                                                                  동시에 이름 정의
    grid-template-rows: repeat(3, 100px);
    grid-template-rows: repeat(3, 1fr);
    }

각 라인은 행과 열의 개수대로 숫자 라인 이름이 자동으로 지정됨.  
따라서 꼭 필요한 경우가 아니면 이름 정의 필요 x

<br>
<br>
<h2>grid-template-columns</h2>

- 사용법은 grid-template-rows와 동일.

ex)

    .container {
    display: grid;
    grid-template-columns : 1열크기 2열크기 ...;                     //각 열의 크기 정의
    grid-template-columns : [선이름] 1열크기 [선이름] 2열크기...;    //각 열 크기 정의
                                                                  동시에 이름 정의
    grid-template-columns: repeat(3, 100px);
    grid-template-columns: repeat(3, 1fr);
    }

<br>
<br>
<h2>grid-template-areas</h2>

지정된 그리드 영역 이름을 참조해 그리드 템플릿 생성  
Container가 아닌 Item에 적용하는 속성.

---

<br>
<br>
<br>

# Items 속성

- grid-row-start : Item의 행 시작 위치 지정
- grid-row-end : 아이템의 행 끝 위치 지정
- grid-row : grid-row-xxx의 단축 속성(행 시작/끝 위치)
- grid-column-start : 그리드 아이템의 열 시작 위치 지정
- grid-column-end : 그리드 아이템의 열 끝 위치 지정
- grid-column : grid-column-xxx의 단축 속성(열 시작/끝 위치)
- grid-area : 영역(Area) 이름 설정하거나, grid-row와 grid-column의 단축 속성
- align-self : 단일 아이템 수직 정렬
- justify-self : 단일 아이템 수평 정렬
- place-self : align-self와 justify-self의 단축 속성
- order : 아이템 배치 순서 지정
- z-index : 아이템 쌓이는 순서 지정
