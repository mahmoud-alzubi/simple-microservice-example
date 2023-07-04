To convert the Swagger document to a GitHub Markdown (`.md`) document, you can follow the Markdown syntax and structure to represent the content of the Swagger document. Here's the Swagger document converted to a GitHub Markdown document:

```markdown
# Swagger Petstore - OpenAPI 3.0

This is a sample Pet Store Server based on the OpenAPI 3.0 specification. You can find out more about Swagger at [https://swagger.io](https://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.

_If you're looking for the Swagger 2.0/OAS 2.0 version of Petstore, then click [here](https://editor.swagger.io/?url=https://petstore.swagger.io/v2/swagger.yaml). Alternatively, you can load via the `Edit > Load Petstore OAS 2.0` menu option!_

Some useful links:
- [The Pet Store repository](https://github.com/swagger-api/swagger-petstore)
- [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)

## Information

- Version: 1.0.11
- Terms of Service: [http://swagger.io/terms/](http://swagger.io/terms/)
- Contact: apiteam@swagger.io
- License: [Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

## External Documentation

Find out more about Swagger [here](http://swagger.io)

## Servers

- [https://petstore3.swagger.io/api/v3](https://petstore3.swagger.io/api/v3)

## Tags

### pet

Everything about your Pets. Find out more [here](http://swagger.io)

### store

Access to Petstore orders. Find out more about our store [here](http://swagger.io)

### user

Operations about user

## Paths

### /pet

#### PUT /pet

- Tags: pet
- Summary: Update an existing pet
- Description: Update an existing pet by Id
- Operation ID: updatePet
- Request Body:
  - Description: Update an existent pet in the store
  - Content:
    - application/json:
      - Schema: `#components/schemas/Pet`
    - application/xml:
      - Schema: `#components/schemas/Pet`
    - application/x-www-form-urlencoded:
      - Schema: `#components/schemas/Pet`
  - Required: true
- Responses:
  - '200':
    - Description: Successful operation
    - Content:
      - application/json:
        - Schema: `#components/schemas/Pet`
      - application/xml:
        - Schema: `#components/schemas/Pet`
  - '400':
    - Description: Invalid ID supplied
  - '404':
    - Description: Pet not found
  - '405':
    - Description: Validation exception
- Security:
  - petstore_auth:
    - write:pets
    - read:pets

#### POST /pet

- Tags: pet
- Summary: Add a new pet to the store
- Description: Add a new pet to the store
- Operation ID: addPet
- Request Body:
  - Description: Create a new pet in the store
  - Content:
    - application/json:
      - Schema: `#components/schemas/Pet`
    - application/xml:
      - Schema: `

.
