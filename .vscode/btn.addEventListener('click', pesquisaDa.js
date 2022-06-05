btn.addEventListener('click', pesquisaDados)

btn2.addEventListener('click', () => {

while (information.hasChildNodes()) {
    information.removeChild(information.firstChild);
}
while (ul.hasChildNodes()) {
    ul.removeChild(ul.firstChild);
}
image.removeChild(image.firstElementChild);

pesquisaDados()

})