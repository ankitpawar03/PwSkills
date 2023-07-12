// Toggle menu for smaller screens
function toggleMenu() {
    var navbarNav = document.getElementById("navbar-nav");
    navbarNav.classList.toggle("show");
    var hamburgerMenu = document.getElementById("hamburger-menu");
    hamburgerMenu.classList.toggle("active");
  }
  
  // Add event listener to the hamburger menu
  document.getElementById("hamburger-menu").addEventListener("click", toggleMenu);
  