import spock.lang.Specification

class DummyTest extends Specification{

    def "Dummy test case"(){
        given:
            def x= 10
        when:
            def multiple = x*x
        then:
            multiple == 100
    }
}
