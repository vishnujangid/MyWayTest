
     function generate_table() {
  // get the reference for the body
  var body = document.getElementsByClassName("right-part")[0];
    console.log(body)
  // creates a <table> element and a <tbody> element
  var tbl = document.createElement("table");
  var tblBody = document.createElement("tbody");

  // creating all cells
  for (var i = 100; i <0; ) {
    // creates a table row
    var row = document.createElement("tr");

    for (var j = 0; j <=10; j++) {
      var cell = document.createElement("td");
      row.appendChild(cell);
      console.log(i-j)
      row.insertCell(0).innerHTML = "<input type=`button` value = "+i-j+" style=`width: 200%; margin:auto; display:block;` class=`btn btn-danger` >";

    }
    i=i-10

    // add the row to the end of the table body
    tblBody.appendChild(row);
  }

  // put the <tbody> in the <table>
  tbl.appendChild(tblBody);
  // appends <table> into <body>
  body.appendChild(tbl);
  // sets the border attribute of tbl to 2;
  tbl.setAttribute("border", "2");
}
