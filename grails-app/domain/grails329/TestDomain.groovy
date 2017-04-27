package grails329

class TestDomain {
    String name

    static constraints = {
    }

    def beforeValidate(){
        log.error "${name}: beforeValidate hasChanged:${hasChanged('name')}, isDirty:${isDirty('name')}"
    }

    def beforeUpdate () {
        log.error "${name}: beforeValidate hasChanged:${hasChanged('name')}, getOriginalValue:${getOriginalValue('name')}, isDirty:${isDirty('name')}, ${getPersistentValue('name')}"
    }
}
