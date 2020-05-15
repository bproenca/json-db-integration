Rodar projeto:

```console
rm -rf src/test/read/*.json
mvn spring-boot:run
```

Acessar BD:
* http://localhost:8080/h2-console
  * URL = *jdbc:h2:mem:mydb*
  * `SELECT * FROM PERSON `

Enviar Json
```console
cp src/test/templates/file3.json src/test/read/
cp src/test/templates/file4.json src/test/read/
...
```
