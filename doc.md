# Unstructured Supplementary Service Data (USSD JAVA WEB SERVICE)

### REDIS
- Redis: Used as a cache to store data in memory, providing high-performance data retrieval and response.
- Instead of solely relying on a database, data can be stored in memory for faster access.
- If the data is not available in the cache, it is retrieved from the primary database.
- Cache Hit: Occurs when the requested data is found in the cache, leading to quicker response times.
- Cache Worker: Monitors changes in the database to ensure the cache is always up to date.
- Caching becomes extremely important at this point as it will allow faster storage and retrieval of the active sessions.

### Lettuce
- Lettuce is a scalable Redis client for building non-blocking Reactive applications
- Redis uses Lettuce for connections 