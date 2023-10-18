############################################################################
<script> document.getElementByID("targeted demo").innerHTML = "text here ";</script>
--> is to changed the target to specific text
--------------------------------------------------------------------------
<!DOCTYPE html>
<html>
<body>

<h2>Demo JavaScript in Body</h2>

<p id="demo">A Paragraph</p>

<button type="button" onclick="myFunction()">Try it</button>

<script>
function myFunction() {
  document.getElementById("demo").innerHTML = "Paragraph changed.";
}
</script>
</body>
</html>
Change via button and declared function
--------------------------------------------------------------------------
External javascript

<!DOCTYPE html>
<html>
<body>

<h2>Demo External JavaScript</h2>

<p id="demo">A Paragraph.</p>

<button type="button" onclick="myFunction()">Try it</button>

<p>This example links to "myScript.js".</p>
<p>(myFunction is stored in "myScript.js")</p>

<script src="myScript.js"></script>

</body>
</html>

myScript.js's content 

function myFunction() {
  document.getElementById("demo").innerHTML = "Paragraph changed.";
}

############################################################################
Displaying properties important 
  
.innerHTML is writing to the inner HTML element

document.write() is writing to HTML output  - rewrite the whole page  Using document.write() after a document is loaded, deletes all existing HTML

Writing into an alert box, using window.alert().

Writing into the browser console, using console.log().

