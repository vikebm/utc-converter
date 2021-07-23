# Getting Started

Install OpenJDK 11 (LTS).
Open or import a new project in your favorite IDE, in my case use IntelliJ IDEA Community.
You must make sure that the SDK module corresponds to 11 as well as gradle JVM.
Select the main class and run the project.

1. Frontend example: https://tuten-app.herokuapp.com/utc-converter.
2. Backend example: https://api-utc-converter.herokuapp.com/api/v1/convert.

**Example**

```
curl --location --request POST 'https://api-utc-converter.herokuapp.com/api/v1/convert' \
--header 'Content-Type: application/json' \
--data-raw '{
    "time": "15:32",
    "timezone":"+4"
}'
```


