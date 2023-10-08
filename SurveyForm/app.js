function submitForm() {
    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const dob = document.getElementById("dob").value;
    const country = document.getElementById("country").value;
    const gender = [];
    const profession = document.getElementById("profession").value;
    const email = document.getElementById("email").value;
    const mobile = document.getElementById("mobile").value;

    const firstTime = document.querySelector('input[name="firstTime"]:checked').value;
    const suggestion = document.querySelector('input[name="suggestion"]:checked').value;
    const satisfaction = document.querySelector('input[name="satisfaction"]:checked').value;
    const suggestions = document.getElementById("suggestions").value;


    
    if (document.getElementById("male").checked) {
        gender.push("Male");
    }
    if (document.getElementById("female").checked) {
        gender.push("Female");
    }

    if (!firstName || !lastName || !dob || !country || gender.length === 0 || !profession || !email || !mobile) {
        alert("Please fill out all fields.");
        return;
    }

    const selectedValues = `
        First Name: ${firstName}
        Last Name: ${lastName}
        Date of Birth: ${dob}
        Country: ${country}
        Gender: ${gender.join(", ")}
        Profession: ${profession}
        Email: ${email}
        Mobile Number: ${mobile}
        First Time User: ${firstTime}
        Satisfaction: ${satisfaction}
        Suggestions: ${suggestions}
        Would Suggest: ${suggestion}
    `;
    
    alert("Selected Values:\n" + selectedValues);
}

function resetForm() {
    document.getElementById("surveyForm").reset();
}