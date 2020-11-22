package pl.dk.netstorageplay

import spock.lang.Specification

class ExampleSpec extends Specification {

    def "should work"() {
        when:
        println 'working'

        then:
        noExceptionThrown()
    }
}
