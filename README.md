# Spring Boot with Spring Batch Example 1
https://github.com/TechPrimers/spring-batch-example-1
## Load CSV to DB
- `http://localhost:8081/load` - Trigger point for Spring Batch
- `http://localhost:8081/h2-console` - H2 Console for querying the in-memory tables.

## H2 Config
- `testdb` - Database.
- `sa` - User
- `password` - Password.

## H2 db selects
select * from user;
select * from BATCH_JOB_EXECUTION;
select * from BATCH_JOB_EXECUTION_CONTEXT;
select * from BATCH_JOB_EXECUTION_PARAMS;
select * from BATCH_JOB_INSTANCE;
select * from BATCH_STEP_EXECUTION;
select * from BATCH_STEP_EXECUTION_CONTEXT;
