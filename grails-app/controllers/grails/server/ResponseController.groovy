package grails.server

class ResponseController {

    def getInfo() {
        Map response = [:]
        response = [message:"Funciona todo bien", action:"GET"]
        return [status:200, response: response]
    }
}
