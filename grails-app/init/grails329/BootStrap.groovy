package grails329

class BootStrap {

    def init = { servletContext ->

        log.error "Create new"
        new TestDomain(name: "Old Name").save(flush:true, failOnError:true)

    }
    def destroy = {
    }
}
