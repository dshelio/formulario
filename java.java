document.getElementById("extensive-form").addEventListener("submit", function(event) {
    event.preventDefault(); // Previne o envio do formulário

    const nome = document.getElementById("nome").value;
    const email = document.getElementById("email").value;
    const idade = document
