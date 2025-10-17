class Persona:
    def __init__(self):
        self.nombre = None 

class Main:
    def reasignarPersona(persona):
        persona = Persona()  
        persona.nombre = "María" 

    def main():
        persona = Persona()  
        persona.nombre = "Ana" 
        Main.reasignarPersona(persona) 
        print("Nombre después de reasignarPersona: " + persona.nombre) 

if __name__ == "__main__":
    Main.main()
