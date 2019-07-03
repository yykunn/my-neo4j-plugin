package com.yuanyk.plugin;

import org.junit.Rule;
import org.junit.Test;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Result;
import org.neo4j.harness.junit.Neo4jRule;

public class UserFunctionTest {
	
	@Rule
	public Neo4jRule neo4j = new Neo4jRule().withFunction(UserFunctions.class);

	@Test
	public void testGreeting() {
		GraphDatabaseService db = neo4j.getGraphDatabaseService();
		Result result = db.execute("return my.greet('yyk') as res");
		System.out.println(result.next().get("res").toString());
	}
}
