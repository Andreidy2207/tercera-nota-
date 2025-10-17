class Persona {
    constructor() {
        this.nombre = null;  
    }
}

class Main {
    static cambiarNombre(persona) {
        persona.nombre = "María";  
    }

    static main() {
        let persona = new Persona();  
        persona.nombre = "Ana";  
        Main.cambiarNombre(persona); 
        console.log("Nombre después de cambiarNombre: " + persona.nombre);  
    }
}

Main.main();
