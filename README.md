# Project description

This is a simple example of spring boot data.

Expense management service with rest api

## API

* GET /api/expense
  * Request
    * Body: empty
  * Response
    * Code:
      * 200 OK
    * Body:
      * List of expense saved in mongodb

* POST /api/expense
  * Request
    * Body:
      * JSON of the expense object
  * Response
    * Code:
      * 201 CREATED
      * 500 SERVER ERROR
