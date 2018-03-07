# the hub

## Status

[![Quality Gate](https://sonarcloud.io/api/badges/gate?key=org.viqueen.thehub:thehub)]()
[![Technical debt ratio](https://sonarcloud.io/api/badges/measure?key=org.viqueen.thehub:thehub&metric=sqale_debt_ratio)]()

[SonarCloud](https://sonarcloud.io/dashboard?id=org.viqueen.thehub%3Athehub)

## Dev Notes

#### Backend Overview ...

- so lazy, I generated the code using

```bash
swagger-codegen generate -i dnb-swagger.json -l spring -o portal-server
```

- there are two profiles :

**dev** : which loads the relevant mock resources

**production** : I should have named it *prod* , it loads the relevant live resources, 
for now they are all leading to an UnsupportedOperationException.

#### Frontend Overvue ...

- so lazy, I generated the code using

```bash
npm install -g vue-cli
vue init webpack portal-frontend
```


#### Mishmash ...
