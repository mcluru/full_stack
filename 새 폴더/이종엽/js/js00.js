const sname = document.querySelector('#sname');
const sdept = document.querySelector('#sdept');
const save = document.querySelector('#save');
const sList = document.querySelector('#sList');

save.addEventListener('click', (e) => {

  e.preventDefault();

  const pList = document.createElement('li');
	pList.innerHTML = `${sname.value}&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp${sdept.value}
	<span class="delBtn">삭제</span>`;

	sList.appendChild(pList);

	sname.value = "";
	sdept.value = "";


  const delBtns = document.querySelectorAll('.delBtn');

	for(let delBtn of delBtns) {
		delBtn.addEventListener('click', removeItem);
	}
});

function removeItem() {
  let list = this.parentNode;
	list.parentNode.removeChild(list);
}