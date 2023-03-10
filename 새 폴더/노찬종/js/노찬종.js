let data = document.querySelector('#data');
let cls = document.querySelector('#cls');
let save = document.querySelector('#save');
let signList = document.querySelector('#signList');

save.addEventListener('click', (e) => {
  e.preventDefault();

  let person = document.createElement('li');
  person.innerHTML = `
    ${data.value} - ${cls.value}
    <button class="delBtn">삭제</button>
  `;
  signList.appendChild(person);

  data.value = "";
  cls.value = "";

  // 삭제
  let delButtons = document.querySelectorAll('.delBtn');

  for(let delButton of delButtons) {
    delButton.addEventListener('click', removeItem);
  }
});

function removeItem() {
  let list = this.parentNode;
  list.parentNode.removeChild(list);
}