package grails329

import grails.transaction.Transactional

class TestController {

    @Transactional
    def index() {


//        log.error "Update name: "
//        d.name = "new name"
//        d.save(flush:true, failOnError:true)
//
        def d = TestDomain.get(1L)

        log.error "Update by properties: "
        d.properties = [name: "new name 1"]
        d.save(flush:true, failOnError:true)
//
//        d = TestDomain.get(d.id)
//
//        log.error "Update by bindData: "
//        bindData(d, [name: "new name 2"])
//        d.save(flush:true, failOnError:true)

//        d = TestDomain.get(d.id)
//
//        log.error "Update name: "
//        d.name = "new name 3"
//        d.save(flush:true, failOnError:true)

        render text: "ok"
    }
}
