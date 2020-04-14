# springboot-graphql-poc

This application is a POC for the usage of GraphQL using ReactJS in the frontend and spring-boot

- To access graphiql (The GraphQL interface): http://localhost:8080/graphiql
- To insert new store:
    mutation {
        createStore(type: "Large", location: "Atlanta", levels: "3", launchDate: "2016-08-16") 
    }
- To query stores:
    query {
        stores(count:10) {
            id,
            type,
            location,
            levels,
            launchDate
        }
    }