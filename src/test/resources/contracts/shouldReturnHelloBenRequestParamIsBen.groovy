package contracts

import org.springframework.cloud.contract.spec.Contract
Contract.make {
    description "should return Hello Ben when given name is Ben"
    request{
        method GET()
        url("/hello") {
            queryParameters {
                parameter("name", "Ben")
            }
        }
    }
    response {
        body("Hello Ben")
        status 200
    }
}