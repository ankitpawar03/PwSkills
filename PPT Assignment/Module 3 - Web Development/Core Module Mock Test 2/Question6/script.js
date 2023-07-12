function openModal() {
  let modalOverlay = document.getElementById("modalOverlay");
  modalOverlay.style.display = "flex";
  document.body.classList.add("modal-open");
}

function closeModal() {
  let modalOverlay = document.getElementById("modalOverlay");
  modalOverlay.style.display = "none";
  document.body.classList.remove("modal-open");
}

function doSomething() {
  closeModal();
}

window.onclick = function(event) {
  let modalOverlay = document.getElementById("modalOverlay");
  if (event.target === modalOverlay) {
    closeModal();
  }
};
