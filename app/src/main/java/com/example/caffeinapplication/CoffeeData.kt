package com.example.caffeinapplication

object CoffeeData {

    private val CoffeePhoto = intArrayOf(
        R.drawable.americano,
        R.drawable.affogato,
        R.drawable.cappucino,
        R.drawable.machiato,
        R.drawable.mocacino,
        R.drawable.latte,
        R.drawable.v60,
        R.drawable.vietnam_drip
    )

    private val CoffeeTitle = arrayOf(
        "Americano Coffee",
        "Affogato Coffee",
        "Cappcuccino Coffee",
        "Machiato Coffee",
        "Moccacino Coffee",
        "Coffee Latte",
        "V60 Coffee",
        "Vietnam Drip Coffee"
    )

    private val CoffeeTime = arrayOf(
        "10 Minute",
        "5 Minute",
        "2-3 Minute",
        "2-3 Minute",
        "5 Minute",
        "5-8 Minute",
        "3-5 Minute",
        "5-8 Minute"
    )

    private val CoffeeType = arrayOf(
        "Hot",
        "Ice",
        "Hot or Ice",
        "Hot or Ice",
        "Ice",
        "Hot or Ice",
        "Hot",
        "Hot or Ice"
    )

    private val CoffeeIngredients = arrayOf(
        " -> 14–18 grams espresso coffee beans\n" +
                "\t-> hot or almost boiling water\n" +
                "\t-> espresso machine\n" +
                "\t-> scale\n" +
                "\t-> grinder\n" +
                "\t-> tamper",
        " -> 1 shot espresso\n" +
                "\t-> 2 scoops vanilla gelato or ice cream\n" +
                "\t-> 1 splash amaretto\n" +
                "\t-> Shaved dark chocolate, for serving",
        "-> Espresso machine\n" +
                "\t-> Coffee beans\n" +
                "\t-> Grinder\n" +
                "\t-> Scale\n" +
                "\t-> Cup\n" +
                "\t-> Tamper\n" +
                "\t-> Milk pitcher\n" +
                "\t-> Cloth for portafilter and steam wand",
        " -> 1 shot espresso \n" +
                "\t-> 1 cup 2% milk\n" +
                "\t-> 1 Tbsp Vanilla Syrup\n" +
                "\t-> Caramel sauce",
        " -> Chocolate powder\n" +
                "\t-> Espresso\n" +
                "\t-> Steamed milk\n" +
                "\t-> Whipped cream",
        " -> Espresso machine\n" +
                "\t-> Coffee beans\n" +
                "\t-> Grinder\n" +
                "\t-> Scale\n" +
                "\t-> Cup\n" +
                "\t-> Tamper\n" +
                "\t-> Milk pitcher\n" +
                "\t-> Cloth for portafilter and steamwand",
        " -> Filter (Hario V60, Kalita, Melitta, Wilfa…),\n" +
                "\t-> Filter paper\n" +
                "\t-> Cup/decanter\n" +
                "\t-> Scale\n" +
                "\t-> Grinder\n" +
                "\t-> Kettle",
        " -> 2 tbsp sweetened condensed milk\n" +
                "\t-> 2 tbsp dark or medium-dark roast (coarse grind)\n" +
                "\t-> Vietnamese coffee press\n" +
                "\t-> Ice\n" +
                "\t-> Hot Water"
    )

    private val CoffeeSteps = arrayOf(
        " -> Measure out your beans for a double shot. Grind them really fine.\n" +
                "\t-> Tamp the beans, then put the portafilter into its spot on the machine.\n" +
                "\t-> Make the espresso.\n" +
                "\t-> Heat up the water to 160-170 degrees Fahrenheit.\n" +
                "\t-> Pour the espresso into the hot water, mix 1 part espresso to 2 parts water.",
        " -> Brew the espresso. Using your desired brewing method, brew 1 shot espresso.\n" +
                "\t-> Scoop the ice cream. As the espresso is brewing, drop 2 scoops vanilla gelato or ice cream into a small drinking glass.\n" +
                "\t-> Add the espresso and amaretto. Pour the espresso shot and 1 splash amaretto over the ice cream.\n" +
                "\t-> Garnish and serve. Top with shaved dark chocolate and serve immediately.\n",
        " -> steam the milk. Heat 1 cup of milk in a 2-quart saucepan over medium heat. Let the milk simmer until bubbles form around the edges, but don’t boil the milk. Remove the pan from heat and set it on a flat surface.\n" +
                "\t-> Switch on the steam wand. Create froth for the first couple of second (up until the milk has reached 37 c). While froth is created, the volume of the milk increases so be sure to have the steam wand nozzle close to the milk surface all the way through. The longer you keep the nozzle close to milk surface the more froth you will create.   \n" +
                "\t-> When you have reached 37 c, rise the pitcher a bit so that the nozzle gets deeper into milk. Make sure the nozzle does not touch the bottom of the pitcher!  \n" +
                "\t-> Find a perrfect position where the whilrpool of milk is created. Keep warming the milk until it reaches +55-62 c. \n" +
                "\t-> Swirl the milk in the pitcher until it is smooth, silky and shiny.\n",
        " -> Prepare 1 shot of espresso.\n" +
                "\t-> Froth the milk. If using the Nespresso® Aeroccino, froth milk on the medium froth setting.\n" +
                "\t-> Pour the Vanilla Syrup into the bottom of your mug.\n" +
                "\t-> Fill your mug ¾ full with milk and then fill the remaining ¼ with foam.\n" +
                "\t-> Pour espresso shot through milk and milk foam.\n" +
                "\t-> Drizzle caramel sauce on top.\n",
        " -> Brew an espresso into a mug, cup or glass.\n" +
                "\t-> Add two teaspoons of hot chocolate mix or cocoa powder and mix with the espresso.\n" +
                "\t-> Foam and texture the required quantity of milk, ensuring we have a good quality foam.\n" +
                "\t-> Add the milk to the cup containing the chocolate espresso and top with whipped cream.\n" +
                "\t-> Dust with more cocoa powder before serving.",
        " -> Prepare the espresso.\n" +
                "\t-> Pour milk to the pitcher. Make sure your stea wand cloth is moist.  \n" +
                "\t-> Purge the steam wand and pull it to far up and straight position. Place the pitcher so that the nozzle is aligned to the steam wand. Make sure the steam wand nozzle is in the middle of the pitcher and just below the milk surface. Tilt the pitcher a bit to optimize the whilrpool later on.\n" +
                "\t-> Swith on the steam wand. Start with the nozzle just below the surface but after a second or two rise the pitcher a bit so that the nozzle gets deeper into milk. Make sure the nozzle does not touch the bottom of the pitcher! \n" +
                "\t-> Find a perfect position where the whilrpool of milk is created. Keep warming the milk until it reaches +55-62 c. \n" +
                "\t-> Swirl the milk in the pitcher until it is smooth, silky and shiny.",
        " -> Measure and grind coffee. \n" +
                "\t-> Pour hot water through the filter to wet the paper and to warm up the filter and the cup/decanter. Use the hot water afterwards to water your houseplants.\n" +
                "\t-> Add the ground coffee to the filter. \n" +
                "\t-> Wet the coffee. Use 60 grams of water (three times the dry weight of ground coffee). Bloom for 30-45 sec.\n" +
                "\t-> Pour more water with a rotating movement on the grounds until the scale shows 200 grams. Let steep for 30 sec. \n" +
                "\t-> Use the rest of the water to first clean up the brim of the filter and then pour the rest of the water on the grounds with a rotating movement until the scale shows 340 grams. \n" +
                "\t-> Swirl the cup/decanter before serving.  And enjoy!",
        " -> Add 2 tablespoons of your coarse ground coffee to the coffee press.\n" +
                "\t-> Wet the grounds slightly with hot water.\n" +
                "\t-> Screw the press on tight ensuring that the coffee is packed well.\n" +
                "\t-> Boil your water and pour your hot water into the coffee press and cover it with its hat.\n" +
                "\t-> Wait for the coffee to finish brewing. (3-5 minutes)\n" +
                "\t-> When the brewing has completed, stir the coffee well.\n" +
                "\t-> Pour the sweetened condensed milk into a mug.\n" +
                "\t-> Brew your coffee over the condensed milk. (Or pour in if using a different brewing method). Stir well to mix and melt.\n" +
                "\t-> Fill a glass with ice and pour the mixture over top. Enjoy!"
    )

    private val CoffeeDetail = arrayOf(
        "Americano terdiri dari satu shot espresso yang dituangkan dalam cangkir berukuran 178 mililiter yang dicampur dengan air panas hingga memenuhi gelas. Minuman ini kerap disajikan dalam panas maupun dingin yang disebut iced Americano.",
        "affogato adalah es krim vanila yang dituang espresso shot. Paduan pahitnya kopi hitam dan es krim yang manis dan lembut menciptakan sensasi rasa menyenangkan. Apalagi saat es krim perlahan meleleh begitu tersiram espresso.",
        "Cappuccino adalah olahan espresso yang paling banyak digemari, terutama bagi penikmat kopi dengan rasa lebih mild Minuman ini terdiri dari espresso dan steamed milk dengan rasio 1:1",
        "Kalau kamu gak terlalu menikmati kopi yang cenderung pahit, kamu bisa pesan macchiato sebagai alternatif. Rasio steamed milk dalam minuman ini lebih besar dari espresso, sehingga ada sentuhan milky dan gurih.",
        "Espresso, susu, dan cokelat merupakan paduan ideal dari secangkir moccacino. Dibanding kopi, lembutnya cokelat dan susu lebih mendominasi. Biasanya minuman ini menggunakan cokelat bubuk untuk campuran dan garnish, tapi ada juga yang memakai sirup cokelat di atasnya.",
        "Latte biasanya menggunakan perbandingan espresso dan susu 2:1. Selain rasanya nikmat, latte biasanya disajikan dalam cangkir dengan motif indah di atasnya atau yang banyak disebut latte art.",
        "kopi yang mengguanakan metode pour over. Kopi yang dihasilkan dari teknik ini menonjolkan rasa tapi lebih bersih karena tidak ada minyak dan waktu kontak dengan kopinya singkat",
        "kopi Vietnam drip berasal dari tetesan air kopi. Terdapat banyak lubang kecil di bagian bawah Vietnam drip. Terbuat dari kopi bubuk vietnam menggunakan alat bernama vietnam drip"

    )

    val ListData: ArrayList<Coffee>
    get() {
        val List = arrayListOf<Coffee>()
        for (position in CoffeePhoto.indices) {
            val Coffee = Coffee()
            Coffee.photo = CoffeePhoto[position]
            Coffee.title = CoffeeTitle[position]
            Coffee.time = CoffeeTime[position]
            Coffee.type = CoffeeType[position]
            Coffee.ingredients = CoffeeIngredients [position]
            Coffee.steps = CoffeeSteps[position]
            Coffee.detail = CoffeeDetail[position]
            List.add(Coffee)
        }
        return List
    }
}