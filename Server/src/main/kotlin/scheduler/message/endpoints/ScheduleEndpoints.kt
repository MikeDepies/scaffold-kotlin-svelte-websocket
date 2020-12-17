import scheduler.message.endpoints.EndpointProvider

fun EndpointProvider.scheduleEndpoints() = sequence<SimpleMessageEndpoint<*, *>> {

}