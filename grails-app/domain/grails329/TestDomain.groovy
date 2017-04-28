package grails329

class TestDomain {
    String name

    static constraints = {
    }

    def beforeInsert () {
        def a = 1 // any code
        return true
    }

    def beforeValidate(){
        log.error "${name}: beforeValidate hasChanged:${hasChanged('name')}, getOriginalValue:${getOriginalValue('name')}, isDirty:${isDirty('name')}, getPersistentValue:${getPersistentValue('name')}"
    }

    def beforeUpdate () {
        log.error "${name}: beforeUpdate hasChanged:${hasChanged('name')}, getOriginalValue:${getOriginalValue('name')}, isDirty:${isDirty('name')}, getPersistentValue:${getPersistentValue('name')}"
    }
}
