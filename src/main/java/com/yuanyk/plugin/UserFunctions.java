package com.yuanyk.plugin;

import org.neo4j.procedure.Description;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.UserFunction;

public class UserFunctions {
	
	@UserFunction("my.greet")
	@Description("问候")
	public String greet(@Name("name") String name) {
		return "Hello "+name;
	}
}
