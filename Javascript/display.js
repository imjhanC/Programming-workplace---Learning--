// script.js

function processFile() {
    const fileInput = document.getElementById('fileInput');
    const dataTable = document.getElementById('dataTable');
    
    const file = fileInput.files[0];
    const reader = new FileReader();
    
    reader.onload = function(event) {
        const fileContent = event.target.result;
        displayData(fileContent);
    };
    
    reader.readAsText(file);
}

function displayData(fileContent) {
    const dataRows = fileContent.trim().split('\n').map(row => row.split(/\s+/));

    const dataTable = document.getElementById('dataTable');
    dataTable.innerHTML = ''; // Clear the table content

    dataRows.forEach(rowData => {
        const row = dataTable.insertRow();
        rowData.forEach(cellData => {
            const cell = row.insertCell();
            cell.textContent = cellData;
        });
    });
}
