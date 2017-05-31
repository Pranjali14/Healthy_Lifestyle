package healthy_lifestyle

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/api/water"{
            controller = "healthLifeStyle"
            parseRequest =true
            action = [PUT:"updateWater", GET:"getWater"]
        }
        "/api/user"{
            controller = "healthLifeStyle"
            parseRequest = true
            action = [POST:"createUser"]
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
