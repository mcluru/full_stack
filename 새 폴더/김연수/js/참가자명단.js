const name = document.querySelector('#name');
const list = document.querySelector('#list');
const save = document.querySelector('#save');
const 참가자list = document.querySelector('#참가자list');

save.addEventListener('click',(e)=>{
  e.preventDefault();

  const person = document.createElement('li');
  person.innerHTML=`${name.value}-${list.value}
  
  <button class=delBtn>삭제</button>`

  참가자list.appendChild(person)
  name.value="";
  list.value="";

    //삭제하기
    const delBottons = document.querySelectorAll('.delBtn')
    for(let delBotton of delBottons){
      delBotton.addEventListener('click',removeItem);

      }
    });
    function removeItem(){
      let 리스트 = this.parentNode;
      리스트.parentNode.removeChild(리스트);
    }

    
    





