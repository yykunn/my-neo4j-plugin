package com.yuanyk.plugin;

import org.junit.Rule;
import org.junit.Test;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.harness.junit.Neo4jRule;

public class UserProducerTest {
	@Rule
	public Neo4jRule neo4j = new Neo4jRule().withProcedure(UserProducer.class);

	@Test
	public void testCreateCustomerNode() {
		GraphDatabaseService db = neo4j.getGraphDatabaseService();
		try(Transaction ts = db.beginTx()){
			Result result = db.execute("call my.createCustomerNode('test') yield node return node");
			Node node = (Node)result.next().get("node");
			System.out.println(node.getProperty("name"));
			System.out.println(node);
		}
	}
}
