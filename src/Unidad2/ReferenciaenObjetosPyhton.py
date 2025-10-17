class Persona:
    def __init__(self):
        self.nombre = None  

class Main:
    def cambiarNombre(persona):
        persona.nombre = "María" 
    def main():
        persona = Persona() 
        persona.nombre = "Ana"  
        Main.cambiarNombre(persona)  
        print("Nombre después de cambiarNombre: " + persona.nombre)  

if __name__ == "__main__":
    Main.main()
