// --------------------------------------------------------------------------

// Get Greetings

const getAllGreetings = async () => {
    try {
        const response = await fetch("/api/greetings");
        const greetings = await response.json();
        return greetings;
    } catch(error) {
        console.error("Error: ", error);
    }
}
const getGreeting = async (id) => {
    try {
        const response = await fetch(`/api/greetings/${id}`);
        const greeting = await response.json();
        return greeting;
    } catch(error) {
        console.error("Error: ", error);
    }
}

export { getAllGreetings, getGreeting };

// --------------------------------------------------------------------------