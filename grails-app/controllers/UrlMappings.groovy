class UrlMappings {

    static mappings = {

        "/bruno/$id"(controller:"response", parseRequest:true){
            action = [GET:"getInfo"]
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
