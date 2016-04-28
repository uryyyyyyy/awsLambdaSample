
1. create assembly(uber) jar.
1. create lambda function
1. set event source from Kinesis
1. put data to kinesis

```
aws kinesis put-record --stream-name XXX --data "This is a test." --partition-key shardId-000000000000 --region ap-northeast-1 --profile XXX
```
