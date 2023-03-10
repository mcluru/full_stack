window.onload = () => {
  const 이름 = document.querySelector('#이름');
  const 전공 = document.querySelector('#전공');
  const 저장 = document.querySelector('#저장');
  const 명단 = document.querySelector('#명단');

  저장.addEventListener('click',(e)=>{
    e.preventDefault();
    const 아이템 = document.createElement("tr");
    아이템.innerHTML = `
    <td>${이름.value}</td>
    <td>${전공.value}</td>
    <button class="삭제">신청취소</button>
    `;
    // 아이템.style.margin = 100+"px";
    명단.appendChild(아이템);

    이름.value = " ";
    전공.value = " ";

    const 삭제버튼 = document.querySelectorAll('.삭제');

    for(let 신청취소 of 삭제버튼){
      신청취소.addEventListener('click', removeItem);
    }
  });
  function removeItem(){
    let list = this.parentNode;
    list.parentNode.removeChild(list);
  }
}