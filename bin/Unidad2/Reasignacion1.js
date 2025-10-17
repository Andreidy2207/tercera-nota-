class Persona {
    constructor() {
        this.nombre = null;  
    }
}

class Main {
    static reasignarPersona(persona) {
        persona = new Persona();  
        persona.nombre = "María";  
    }

    static main() {
        let persona = new Persona();  
        persona.nombre = "Ana";  
        Main.reasignarPersona(persona);  
        console.log("Nombre después de reasignarPersona: " + persona.nombre);  
    }
}

Main.main();
