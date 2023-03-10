window.onload = (e) => {
    let name = document.getElementById("name");
    let department = document.getElementById("department");

    document.getElementById("add").addEventListener('click',(e)=>{
        e.preventDefault(); // submit function init
    
        //tr group
        let tr = document.createElement('tr');

        //td........
        let td_name = document.createElement('td');
        let td_department = document.createElement('td');
        let td_delbutton = document.createElement('td');
    
        td_name.innerText = name.value;
        td_department.innerText = department.value;
    
        //td insert to tr
        tr.appendChild(td_name);
        tr.appendChild(td_department);


        //delete button create
        let button_delete = document.createElement("button");

        button_delete.innerText = "삭제";
        button_delete.addEventListener('click', () => tr.remove());

        td_delbutton.appendChild(button_delete);

        //delete button insert to tr
        tr.appendChild(td_delbutton);
        

        //list table 
        document.getElementById("list").appendChild(tr);

        //input init
        name.value = "";
        department.value = "";
    });


}
