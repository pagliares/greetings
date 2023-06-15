// -------------------------------------------------------------------------- 

import { getAllGreetings, getGreeting } from './greeting.js';

// --------------------------------------------------------------------------

// Load Select Options

const loadOptions = async () => {
    const greetings = await getAllGreetings();
    greetings.forEach(g => addOption(g));
}
const addOption = (greeting) => {
    const select = document.querySelector("#country");
    const opt = document.createElement('option');
    opt.setAttribute('value', greeting.id);
    opt.innerText = greeting.country;
    select.appendChild(opt);
}

// --------------------------------------------------------------------------

// Change Greeting Text

const changeGreeting = async () => {
    const select = document.querySelector("#country");
    const selectedId = select.value;
    const greeting = await getGreeting(selectedId);
    document.querySelector(".greeting .text").innerText = await greeting.greeting;
}

// --------------------------------------------------------------------------

// Events

window.onload = async () => {
    await loadOptions();
    changeGreeting();
}
document.querySelector("#country").addEventListener('change', changeGreeting);

// --------------------------------------------------------------------------