function calculateresult(){
    let n = document.getElementById("Subjects").value;
    let total = 0;
    for(i=1;i<=n;i++){
        let marks= parseFloat(prompt("enter marks for subject "+i));
        total=total+marks;

    }
    let average = total/n;
    let grade;
    let result;
    if (average>=90){
        grade="A+";
    }

    else if (average >=75){
            grade="A";
    }
    else if (average >=60){
            grade="B+";
    }
    else if (average >=50){
            grade="B";
    }
    else if (average >=40){
            grade="C";
    }
    else {
            grade="F";
    }
    if (average >=40){
        result="PASS";

    }
    else{
        result="FAIL";
    }
    document.getElementById("result").innerHTML = "Total Marks: "+ total + "<br>" + "Average Marks :" + average + "<br>"+ "Grade:" + grade + "<br>" +"Result"+ result ;

}
