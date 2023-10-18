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
<!DOCTYPE html>
<html>
<body>

<h1>My First Web Page</h1>
<p>My first paragraph.</p>

<button type="button" onclick="document.write(5 + 6)">Try it</button>

</body>
</html>


Writing into an alert box, using window.alert().
<!DOCTYPE html>
<html>
<body>

<h1>My First Web Page</h1>
<p>My first paragraph.</p>

<script>
window.alert(5 + 6);
</script>

</body>
</html>


Writing into the browser console, using console.log().
<!DOCTYPE html>
<html>
<body>

<script>
console.log(5 + 6);
</script>

</body>
</html>


javascript print - print to printer 
<!DOCTYPE html>
<html>
<body>

<button onclick="window.print()">Print this page</button>

</body>
</html>

----------------------------------------------------------------------------

############################################################################
statement < code block >

<!DOCTYPE html>
<html>
<body>

<h2>JavaScript Statements</h2>

<p>JavaScript code blocks are written between { and }</p>

<button type="button" onclick="myFunction()">Click Me!</button>

<p id="demo1"></p>
<p id="demo2"></p>

<script>
function myFunction() {
  document.getElementById("demo1").innerHTML = "Hello Dolly!";
  document.getElementById("demo2").innerHTML = "How are you?";
}
</script>

</body>
</html>

 let a , b ,c ;
 a = 5;
 b = 6;
 c = a + b;

document.getElementbyId("target).innerHTML = c ;

1.const is constant
2.var is variables    var x = ??


############################################################################
Objects and array
<!DOCTYPE html>
<html>
<body>

<h2>JavaScript const</h2>

<p>Declaring a constant object does NOT make the objects properties unchangeable:</p>

<p id="demo"></p>

<script>
// Create an object:
const car = {type:"Fiat", model:"500", color:"white"};

// Change a property:
car.color = "red";

// Add a property:
car.owner = "Johnson";

// Display the property:
document.getElementById("demo").innerHTML = "Car owner is " + car.owner; 
</script>

</body>
</html>


############################################################################