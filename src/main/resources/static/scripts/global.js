/* =======================
   ===== For Navbar =====
   =======================  */

//===== close navbar-collapse when a  clicked
let navbarTogglerTwo = document.querySelector(".navbar-two .navbar-toggler");
navbarTogglerTwo.addEventListener("click", function () {
    navbarTogglerTwo.classList.toggle("active");
});
