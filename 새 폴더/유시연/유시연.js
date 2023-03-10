// 책 목록에 추가
const title = document.querySelector("#name"); 
const author = document.querySelector("#stnum"); 
const save = document.querySelector("#save"); 
const bookList = document.querySelector("#bookList"); 

save.addEventListener("click", (e) => {
  e.preventDefault();

  const item = document.createElement("li");
  item.innerHTML = `
    ${title.value} - ${author.value} 
    <span class="delBtn">취소</span>`;
  bookList.appendChild(item);

  title.value = "";
  author.value = "";

  //취소
  const delButtons = document.querySelectorAll(".delBtn"); 

  for (let delButton of delButtons) {
    delButton.addEventListener("click", removeItem);
  }
});

function removeItem() {
  let list = this.parentNode;
  list.parentNode.removeChild(list);
}
