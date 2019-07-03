## neo4j自定义过程和函数

MAVEN INSTALL之后在target目录下生成的JAR包复制到NEO4J安装目录下的PLUGIN目录重启neo4j服务即可。

>过程：用 Call xxx(参数)来调用执行。

>函数：可以用在cypher中任何可以使用方法的地方如where子句，return子句中。如match (n) wehre com.xxx.xx(n) return n。