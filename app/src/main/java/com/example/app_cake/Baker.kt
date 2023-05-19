package com.example.app_cake

class Baker {

    var location:String = ""
    var service:String = ""
    var price:String = ""
    var baker_id:String = ""

    constructor( location: String, service: String, price: String, baker_id: String) {
        this.location =location
        this.service = service
        this.price = price
        this.baker_id = baker_id
    }

    constructor()

}