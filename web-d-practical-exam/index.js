function generateTable(){

    let number = document.getElementById("num").value;

    let resultDiv = document.getElementById("result");

    resultDiv.innerHTML = "";

    for(let i = 1; i <= 10; i++){

        resultDiv.innerHTML += number + " × " + i + " = " + (number*i) + "<br>";

    }

}