var employeeJson = [
  {
    "ProductName": "Samsung Galaxy S21",
    "Price": "799.99",
    "Image": "SamsungGalaxys21.jpg",
  },
  {
    "ProductName": "Apple iPhone 12",
    "Price": "699.99",
    "Image": "iphone12.jpg"
  },
  {
    "ProductName": "Google Pixel 4",
    "Price": "599.99",
    "Image": "pixel4.jpg"
  }];

function createTableFromJsonData() {
  //Get the headers from JSON data
  var headers = Object.keys(employeeJson[0]);

  //Prepare html header
  var headerRowHTML = '<tr>';
  for (var i = 0; i < headers.length; i++) {
    headerRowHTML += '<th>' + headers[i] + '</th>';
  }
  headerRowHTML += '</tr>';

  //Prepare all the employee records as HTML
  var allRecordsHTML = '';
  for (var i = 0; i < employeeJson.length; i++) { //Prepare html row allRecordsHTML+='<tr>';
    for (var j = 0; j < headers.length; j++) {
      var header = headers[j];
      if (header === "Image") {
        allRecordsHTML += '<td><a href="order.html"><img src="' + employeeJson[i][header] + '"></a></td>';
      }
      else {
        allRecordsHTML += '<td>' + employeeJson[i][header] + '</td>';
      }

    } allRecordsHTML += '</tr>';
  }

  //Append the table header and all records
  var table = document.getElementById("display_json_data");
  table.innerHTML = headerRowHTML + allRecordsHTML;
}

window.onload = createTableFromJsonData();