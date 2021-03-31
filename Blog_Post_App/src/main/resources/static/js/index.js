function ADDuser() {



    //creat a table
    var table = document.getElementById("result_table");


    //get values from form
    var Name = document.getElementById("Name").value;
    var mob_no = document.getElementById("mob_no").value;
    var email = document.getElementById("email").value;

    if (Name == "" || mob_no == "" || email == "") {
        alert("Please Enter Vaild credentials");
    } else {
        //creat tr tag
        var tr = document.createElement("TR");

        var td = document.createElement("TD");
        var inp_1 = document.createTextNode(Name);
        td.appendChild(inp_1);
        tr.appendChild(td);

        var td_2 = document.createElement("TD");
        var inp_2 = document.createTextNode(mob_no);
        td_2.appendChild(inp_2);
        tr.appendChild(td_2);

        var td_3 = document.createElement("TD");
        var inp_3 = document.createTextNode(email);
        td_3.appendChild(inp_3);
        tr.appendChild(td_3);

        var td_4 = document.createElement("TD");
        var delet = document.createElement("Button");
        var text_btn = document.createTextNode("Delete")
        delet.appendChild(text_btn);
        delet.setAttribute("onclick", "delete_user()");
        td_4.appendChild(delet);

        tr.appendChild(td_4);

        table.appendChild(tr);
    }


}

function delete_user() {

    var td_d = event.target.parentNode;
    var tr_D = td_d.parentNode;
    tr_D.parentNode.removeChild(tr_D);

}