let participant = document.querySelector("#name");
let major = document.querySelector("#major");
let participantList = document.querySelector("#participantList");
let register = document.querySelector("#register");

register.addEventListener("click", (e) => {
  e.preventDefault();

  let participants = document.createElement("div");
  participants.classList.add("list");
  participants.innerHTML = `<div>${participant.value}</div><div>${major.value}</div><button class="delBtn">삭제</button>`;
  participantList.appendChild(participants);
});

participantList.addEventListener("click", (e) => {
  e.preventDefault();
  if (e.target.className === "delBtn") {
    e.target.parentNode.remove();
  }
});
