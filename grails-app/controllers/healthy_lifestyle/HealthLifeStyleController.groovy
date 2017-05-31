package healthy_lifestyle

import grails.converters.JSON

class HealthLifeStyleController {

    def LifeStyleService

    def index() {

        render "hmtl"
    }

    def updateWater(){
        def name = params["name"]
        def litre = params["litre"]
        render LifeStyleService.updateWater(name, litre) as JSON
    }

    def getWater(){
        def name = params["name"]
        return LifeStyleService.getWater(name)

    }

    def createUser(){
        def name = params["name"]
        render  LifeStyleService.createUser(name) as JSON
    }
}
