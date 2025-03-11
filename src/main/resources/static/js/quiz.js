document.addEventListener("DOMContentLoaded", function() {
    fetch("/quiz/random")
        .then(response => response.json())
        .then(data => {
            document.getElementById("question").innerText = data.question;
            let buttons = document.querySelectorAll(".option-btn");
            let options = [data.option1, data.option2, data.option3, data.option4];
            buttons.forEach((btn, index) => {
                btn.innerText = options[index];
                btn.onclick = () => alert(options[index] === data.answer ? "정답!" : "오답!");
            });
        });
});
