var navbar = document.querySelector(".navigation");
var sticky = navbar.offsetTop;

window.addEventListener("scroll", function() {
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("navigation--sticky");
  } else {
    navbar.classList.remove("navigation--sticky");
  }
});

$(document).ready(function() {
  $(".main__carousel-slick").slick({
    dots: true,
    autoplay: true,
    autoplaySpeed: 3000
  });

  $(".main__questions-accordion").accordion({
    collapsible: true,
    icons: {
      header: "ui-icon-triangle-1-s",
      activeHeader: "ui-icon-triangle-1-n"
    }
  });
});
