package grails329

class TestDomain {
    String name

    static constraints = {
    }

    def beforeValidate(){
        log.error "${name}: beforeValidate hasChanged:${hasChanged('name')}"
    }

    def beforeUpdate () {
        log.error "${name}: beforeValidate hasChanged:${hasChanged('name')}, getOriginalValue:${getOriginalValue('name')}"
    }
}
