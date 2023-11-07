import io.gatling.javaapi.core.CoreDsl.constantUsersPerSec
import io.gatling.javaapi.core.CoreDsl.scenario
import io.gatling.javaapi.core.Simulation
import io.gatling.javaapi.http.HttpDsl.http
import java.time.Duration

class TestSimulation : Simulation() {
    private val httpProtocol = http
        .baseUrl("https://dummyjson.com")
        .acceptHeader("application/json")

    private val scn = scenario("request")
        .exec(http("request1")["/products/1"])

    init {
        this.setUp(scn.injectOpen(constantUsersPerSec(5.0).during(Duration.ofSeconds(10))))
            .protocols(httpProtocol)
    }
}
