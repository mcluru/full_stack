const name = document.querySelector("#name");
const subject = document.querySelector("#subject");
const save = document.querySelector("#save");
const userList = document.querySelector("#userList");

save.addEventListener("click", (e) => {
  e.preventDefault();

  const item = document.createElement("tr");
  item.innerHTML = `<td id="blank"></td><td>${name.value}</td><td>${subject.value}</td><button class='delBtn' id='blank'>x</button>`;
  userList.appendChild(item);

  name.value = "";
  subject.value = "";

  const delButtons = document.querySelectorAll(".delBtn");
  for (let delButton of delButtons) {
    delButton.addEventListener("click", removeItem);
  }
});

function removeItem() {
  let mytable = this.parentNode;
  mytable.parentNode.removeChild(mytable);
}
