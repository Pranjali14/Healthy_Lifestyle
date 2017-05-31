package healthy_lifestyle

import grails.transaction.Transactional

@Transactional
class LifeStyleService {

    def serviceMethod() {

    }

    def updateWater(def name, def litre){
        def user = User.findByName(name)
        user.setWater(Integer.parseInt(litre))
        user.save()

    }

    def getWater(def name){
        return User.findByName(name)
    }

    def createUser(def name){
        def user = new User(name: name, water: 0).save()
        return user
    }
}
