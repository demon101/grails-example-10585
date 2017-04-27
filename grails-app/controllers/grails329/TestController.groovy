package grails329

class TestController {

    def index() {
        log.error "Create new"
        def d = new TestDomain(name: "Old Name").save(flush:true, failOnError:true)
        d = TestDomain.get(d.id)

        log.error "Update name: "
        d.name = "new name"
        d.save(flush:true, failOnError:true)
//
        d = TestDomain.get(d.id)

        log.error "Update by properties: "
        d.properties = [name: "new name 1"]
        d.save(flush:true, failOnError:true)
//
        d = TestDomain.get(d.id)
//
        log.error "Update by bindData: "
        bindData(d, [name: "new name 2"])
        d.save(flush:true, failOnError:true)

        d = TestDomain.get(d.id)

        log.error "Update name: "
        d.name = "new name 3"
        d.save(flush:true, failOnError:true)

        render text: "ok"

    }
}
