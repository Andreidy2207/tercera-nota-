const PasoporValorenJavaScrip = {
    
    cambiarValor: function(num) {
        num = 77;  
        console.log("Dentro de cambiarValor: " + num);  
    },

    main: function() {
        let numero = 5;  // Equivalente a int numero = 5;
        this.cambiarValor(numero);  // Llama al método del objeto
        console.log("Después de llamar a cambiarValor: " + numero);  // Imprime 5
    }
};

// Ejecutar el método main (equivalente a public static void main)
Main.main();
