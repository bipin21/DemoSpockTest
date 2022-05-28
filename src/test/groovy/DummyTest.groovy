import spock.lang.Specification

class DummyTest extends Specification{

    def "First unit test case for sum"(){
        given:
            def x= 10
            def y = 5
        when:
            def result = x+y
        then:
            result == 15
    }
}
