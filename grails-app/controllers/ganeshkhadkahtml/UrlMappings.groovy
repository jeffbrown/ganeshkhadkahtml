package ganeshkhadkahtml

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/showMeSomeHtml"(uri: '/static/index.html')

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
