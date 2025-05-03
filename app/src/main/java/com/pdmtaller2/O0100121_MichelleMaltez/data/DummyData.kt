package com.pdmtaller2.O0100121_MichelleMaltez.data

import com.pdmtaller2.O0100121_MichelleMaltez.models.Dish
import com.pdmtaller2.O0100121_MichelleMaltez.models.Restaurant
val Restaurants = listOf(
    // Comida Rápida
    Restaurant(1, "Burger House", "Deliciosas hamburguesas caseras", "hamburguesa", listOf("Comida Rápida"), listOf(
        Dish(1, "Hamburguesa Clásica", "Pan artesanal, carne 100% res, queso y vegetales.", "clasica"),
        Dish(2, "Papas Fritas", "Crujientes papas con salsa especial.", "fritas")
    )),
    Restaurant(2, "FryKing", "Expertos en papas y hamburguesas", "burger", listOf("Comida Rápida"), listOf(
        Dish(3, "Fry Deluxe", "Combo de papas fritas con toppings.", "papas"),
        Dish(4, "Burger BBQ", "Hamburguesa con salsa BBQ y cebolla crispy.", "bbq")
    )),
    Restaurant(3, "Hot Dog World", "Perros calientes como en casa", "hotdogmain", listOf("Comida Rápida"), listOf(
        Dish(5, "Hot Dog Clásico", "Salchicha, mostaza y ketchup.", "tocino"),
        Dish(6, "Hot Dog con Tocino", "Salchicha envuelta en tocino.", "hotdog")
    )),
    Restaurant(4, "Wings Station", "Las mejores alitas", "wings", listOf("Comida Rápida"), listOf(
        Dish(7, "Alitas BBQ", "Alitas bañadas en salsa BBQ.", "wingsbbq"),
        Dish(8, "Alitas Picantes", "Para los valientes 🔥", "chilewings")
    )),
    Restaurant(5, "Fast Pizza", "Pizza en minutos", "pizza", listOf("Comida Rápida"), listOf(
        Dish(9, "Pizza Pepperoni", "Con extra de queso y pepperoni.", "pepperoni"),
        Dish(10, "Pizza Suprema", "Con todo lo que imagines.", "suprema")
    )),
    Restaurant(6, "Taquería El Mexicano", "Tacos auténticos y sabrosos", "tacos", listOf("Comida Mexicana"), listOf(
        Dish(11, "Tacos al Pastor", "Tortilla con carne marinada, piña y cebolla.", "tacosbirria"),
        Dish(12, "Nachos con Queso", "Totopos con queso fundido y jalapeños.", "nachos")
    )),
    Restaurant(7, "Casa de Burritos", "Burritos gigantes al gusto", "burrito", listOf("Comida Mexicana"), listOf(
        Dish(13, "Burrito Mixto", "Pollo, res y frijoles.", "mixto"),
        Dish(14, "Burrito Vegetariano", "Lleno de sabor sin carne.", "vegetariano")
    )),
    Restaurant(8, "El Sazón Azteca", "Sabor de la abuela", "azteca", listOf("Comida Mexicana"), listOf(
        Dish(15, "Tamales", "Rellenos de pollo o cerdo.", "tamales"),
        Dish(16, "Enchiladas Verdes", "Con salsa de tomatillo.", "enchiladas")
    )),
    Restaurant(9, "Tacos La Cueva", "Tacos de todos los estilos", "tacosnormal", listOf("Comida Mexicana"), listOf(
        Dish(17, "Taco Campechano", "Mixto de carne asada y chorizo.", "campechanos"),
        Dish(18, "Taco de Lengua", "¡Solo para conocedores!", "lengua")
    )),
    Restaurant(10, "Quesadillas Doña Lucha", "Queso y tradición", "quesadilla", listOf("Comida Mexicana"), listOf(
        Dish(19, "Quesadilla de Huitlacoche", "Un sabor único mexicano.", "huita"),
        Dish(20, "Quesadilla de Chicharrón", "Crujiente y sabrosa.", "chicharron")
    )),
    Restaurant(
        id = 11,
        name = "Pasta Bella",
        description = "Sabores auténticos italianos",
        imageUrl = "bella",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(21, "Spaghetti Bolognese", "Clásico espagueti con salsa de carne.", "bolognesa"),
            Dish(22, "Lasaña", "Capas de pasta con carne y bechamel.", "lasana")
        )
    ),
    Restaurant(
        id = 12,
        name = "La Trattoria",
        description = "Comida italiana tradicional",
        imageUrl = "tratoria",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(23, "Fettuccine Alfredo", "Pasta cremosa con parmesano.", "alfredo"),
            Dish(24, "Risotto de Hongos", "Arroz cremoso con champiñones.", "risotto")
        )
    ),
    Restaurant(
        id = 13,
        name = "Pizza Nostra",
        description = "La pizza como en Nápoles",
        imageUrl = "nostra",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(25, "Pizza Margarita", "Tomate, albahaca y mozzarella.", "margarita"),
            Dish(26, "Pizza Cuatro Quesos", "Mezcla irresistible de quesos.", "queso")
        )
    ),
    Restaurant(
        id = 14,
        name = "Gnocchi & Co.",
        description = "Especialistas en gnocchi y pastas",
        imageUrl = "co",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(27, "Gnocchi Pomodoro", "Con salsa de tomate casera.", "gnocchi"),
            Dish(28, "Gnocchi Pesto", "Con pesto de albahaca y parmesano.", "pesto")
        )
    ),
    Restaurant(
        id = 15,
        name = "Ravioli di Roma",
        description = "La pasta rellena más sabrosa",
        imageUrl = "roma",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(29, "Ravioli de Espinaca", "Relleno con ricotta y espinaca.", "espinaca"),
            Dish(30, "Ravioli de Carne", "Con salsa pomodoro.", "ravioli")
        )
    ),
    Restaurant(
        id = 16,
        name = "Sushi Time",
        description = "Frescura japonesa al instante",
        imageUrl = "sushi",
        categories = listOf("Comida Asiática"),
        menu = listOf(
            Dish(31, "Sushi Roll California", "Palta, cangrejo y pepino.", "california"),
            Dish(32, "Sashimi de Salmón", "Puro y fresco salmón.", "salmon")
        )
    ),
    Restaurant(
        id = 17,
        name = "Wok Express",
        description = "Salteados al estilo oriental",
        imageUrl = "china",
        categories = listOf("Comida Asiática"),
        menu = listOf(
            Dish(33, "Wok de Pollo", "Verduras, arroz y pollo.", "camaron"),
            Dish(34, "Wok de Camarones", "Sabor del mar en tu wok.", "pollo")
        )
    ),
    Restaurant(
        id = 18,
        name = "Noodle Bar",
        description = "Ramen y fideos como en Asia",
        imageUrl = "noodle",
        categories = listOf("Comida Asiática"),
        menu = listOf(
            Dish(35, "Ramen Tonkotsu", "Caldo profundo con cerdo.", "ramen"),
            Dish(36, "Yakisoba", "Fideos salteados estilo japonés.", "yakisoba")
        )
    ),
    Restaurant(
        id = 19,
        name = "Thai Street Food",
        description = "Sabores auténticos tailandeses",
        imageUrl = "thai",
        categories = listOf("Comida Asiática"),
        menu = listOf(
            Dish(37, "Pad Thai", "Fideos de arroz con maní y huevo.", "pad"),
            Dish(38, "Curry Verde", "Picante y lleno de sabor.", "curry")
        )
    ),
    Restaurant(
        id = 20,
        name = "Korean BBQ",
        description = "Parrilla al estilo coreano",
        imageUrl = "corea",
        categories = listOf("Comida Asiática"),
        menu = listOf(
            Dish(39, "Tteokbokki", "Pasteles de arroz en salsa de gochujang.", "tteokbokki"),
            Dish(40, "Kimchi", "Repollo fermentado picante.", "kimchi")
        )
    ),
    Restaurant(
        id = 26,
        name = "Dulce Tentación",
        description = "Pasteles y tartas irresistibles",
        imageUrl = "cakes",
        categories = listOf("Postres y Dulces"),
        menu = listOf(
            Dish(51, "Tarta de Fresas", "Con crema pastelera y base crocante.", "fresa"),
            Dish(52, "Pastel de Chocolate", "Súper húmedo con cobertura.", "chocolate")
        )
    ),
    Restaurant(
        id = 27,
        name = "Helados del Cielo",
        description = "Helados artesanales",
        imageUrl = "helados",
        categories = listOf("Postres y Dulces"),
        menu = listOf(
            Dish(53, "Helado de Vainilla", "Suave y cremoso.", "vainilla"),
            Dish(54, "Helado de Mango", "Refrescante y tropical.", "mangi")
        )
    ),
    Restaurant(
        id = 28,
        name = "ChocoLovers",
        description = "Todo con mucho chocolate",
        imageUrl = "choco",
        categories = listOf("Postres y Dulces"),
        menu = listOf(
            Dish(55, "Brownie Clásico", "Con nueces y mucho chocolate.", "brownie"),
            Dish(56, "Fondue de Chocolate", "Con frutas y malvaviscos.", "fondue")
        )
    ),
    Restaurant(
        id = 29,
        name = "Donuts & Co.",
        description = "Donas de todos los sabores",
        imageUrl = "donas",
        categories = listOf("Postres y Dulces"),
        menu = listOf(
            Dish(57, "Dona Glaseada", "Clásica y dulce.", "glaseadas"),
            Dish(58, "Dona Rellena", "Con crema de vainilla.", "rellenas")
        )
    ),
    Restaurant(
        id = 30,
        name = "Cupcake Factory",
        description = "Cupcakes creativos y deliciosos",
        imageUrl = "cupcackes",
        categories = listOf("Postres y Dulces"),
        menu = listOf(
            Dish(59, "Cupcake de Red Velvet", "Con frosting de queso crema.", "red"),
            Dish(60, "Cupcake de Limón", "Suave y cítrico.", "limon")
        )
    ),
    Restaurant(
        id = 31,
        name = "Juice Bar",
        description = "Jugos naturales y smoothies",
        imageUrl = "jugos",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(61, "Jugo de Naranja", "100% natural.", "naranja"),
            Dish(62, "Smoothie Tropical", "Mango, piña y papaya.", "trpical")
        )
    ),
    Restaurant(
        id = 32,
        name = "Coffee House",
        description = "Café para todos los gustos",
        imageUrl = "cafes",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(63, "Latte", "Espuma suave y cremosa.", "latte"),
            Dish(64, "Capuchino", "Con cacao espolvoreado.", "capucchino")
        )
    ),
    Restaurant(
        id = 33,
        name = "Bubble Tea Land",
        description = "Boba tea de sabores variados",
        imageUrl = "bobas",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(65, "Té de Taro", "Con perlas de tapioca.", "taro"),
            Dish(66, "Té de Matcha", "Sabor verde y dulce.", "matcha")
        )
    ),
    Restaurant(
        id = 34,
        name = "Lemonade Stand",
        description = "Limonadas con un toque especial",
        imageUrl = "limonadas",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(67, "Limonada Clásica", "Fresca y natural.", "limonada"),
            Dish(68, "Limonada de Fresa", "Con trozos de fruta.", "limonfresa")
        )
    ),
    Restaurant(
        id = 35,
        name = "Mocktail Bar",
        description = "Cócteles sin alcohol",
        imageUrl = "cocktail",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(69, "Mojito sin alcohol", "Refrescante y mentolado.", "mojito"),
            Dish(70, "Piña Colada sin alcohol", "Dulce y tropical.", "pina")
        )
    ),
)