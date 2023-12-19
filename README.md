# Spring Boot 3 + Spring Security + Redis as session store

```
docker compose build

docker compose up
```

can also run locally in InteliiJ as you prefer - update application.properties to the correct hostname.

The session ID `rename` will trigger when user is authenticated and sign-on again, or when timeout (30min default) is reached and user sign on again.

The rename comamnd is not compatible with Redis cluster (irrelevent of oss or Enterprise)