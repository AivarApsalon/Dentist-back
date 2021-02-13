function addRegistration() {
    let newRegistration = {
        date: document.getElementById("date").value,
        time: document.getElementById("time").value,

    }
    fetch('/dentist/add-registration',
        {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(newRegistration)
        })
}

let addRegistrationButton = document.getElementById("add_registration");
addRegistrationButton.onclick = addRegistration();
