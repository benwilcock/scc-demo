package contracts.helloservice

import org.springframework.cloud.contract.spec.Contract
Contract.make {
    description "should return Bonjour Ben when given request path name is Ben"
    request{
        method GET()
        url("/bonjour/Ben") {
        }
    }
    response {
        body("Bonjour Ben")
        status 200
    }
}