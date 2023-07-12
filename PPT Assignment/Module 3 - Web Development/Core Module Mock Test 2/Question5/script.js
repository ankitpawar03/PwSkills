function validateForm(event) {
    event.preventDefault(); // Prevent form submission
    let form = document.getElementById("myForm");
    let nameInput = document.getElementById("name");
    let emailInput = document.getElementById("email");
    let phoneInput = document.getElementById("phone");
    let passwordInput = document.getElementById("password");
    let ageInput = document.getElementById("age");
    let genderInput = document.getElementById("gender");
    let dateInput = document.getElementById("date");
    let colorInput = document.getElementById("color");
    
  
    // Validate name
    if (nameInput.value === "") {
      showError(nameInput, "Name is required");
    } else {
      showSuccess(nameInput);
    }
  
    // Validate email
    if (emailInput.value === "") {
      showError(emailInput, "Email is required");
    } else if (!isValidEmail(emailInput.value)) {
      showError(emailInput, "Invalid email format");
    } else {
      showSuccess(emailInput);
    }
  
    // Validate phone number
    if (phoneInput.value === "") {
      showError(phoneInput, "Phone number is required");
    } else if (!isValidPhoneNumber(phoneInput.value)) {
      showError(phoneInput, "Invalid phone number format");
    } else {
      showSuccess(phoneInput);
    }
  
    // Validate password
    if (passwordInput.value === "") {
      showError(passwordInput, "Password is required");
    } else if (passwordInput.value.length < 6) {
      showError(passwordInput, "Password must be at least 6 characters");
    } else {
      showSuccess(passwordInput);
    }
  
    // Validate age
    if (ageInput.value === "") {
      showError(ageInput, "Age is required");
    } else if (isNaN(ageInput.value) || ageInput.value <= 0) {
      showError(ageInput, "Invalid age");
    } else {
      showSuccess(ageInput);
    }
  
    // Validate gender
    if (genderInput.value === "") {
      showError(genderInput, "Gender is required");
    } else {
      showSuccess(genderInput);
    }
  
    // Validate date
    if (dateInput.value === "") {
      showError(dateInput, "Date is required");
    } else {
      showSuccess(dateInput);
    }
  
    // Validate color
    if (colorInput.value === "") {
      showError(colorInput, "Favorite color is required");
    } else {
      showSuccess(colorInput);
    }
  
    // Check if all inputs are valid
    if (
      form.checkValidity() &&
      isValidEmail(emailInput.value) &&
      isValidPhoneNumber(phoneInput.value)
    ) {
      alert("Form submitted successfully!");
      form.reset();
    }
  }
  
  // Helper functions to validate email and phone number formats
  function isValidEmail(email) {
    var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailPattern.test(email);
  }
  
  function isValidPhoneNumber(phone) {
    var phonePattern = /^\d{10}$/;
    return phonePattern.test(phone);
  }
  
  // Functions to show/hide error messages
  function showError(input, message) {
    var formControl = input.parentElement;
    var error = formControl.querySelector(".error");
    error.textContent = message;
    formControl.className = "error";
  }
  
  function showSuccess(input) {
    var formControl = input.parentElement;
    formControl.className = "";
  }
  
  // Reset error messages on input change
  var formInputs = document.querySelectorAll("form input, form select");
  formInputs.forEach(function (input) {
    input.addEventListener("input", function () {
      var formControl = input.parentElement;
      var error = formControl.querySelector(".error");
      error.textContent = "";
      formControl.className = "";
    });
  });
  