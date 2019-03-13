
// Conditional compilations

/**
* Java supports conditional compilation via workaround (static final variables and compiler optimization)
* Therefore, for the conditional if statements should be on same line despite 
* If the variable will be false in compilation time, the whole statement will not be in bytecode.
*/

if (VERBOSE_TRACE_ENABLED_FLAG) log.info("Verbose log message"); // This is not normal if without braces (usually disencouraged)


// Purpose of indentation 

/**
* Indentation of members of a static array
* Main goal is to be able to quickly comment / un comment members of the array, to skip or add a member.
* In this was it's possible to quickly with simply adding // comment in front of a element remove member of a array.
* No need to remove or add commas, which is goal number one
*/

final List<String> suportedHttpMethods = new ArrayList<String>(){
   "GET"
  ,"POST"
//,"POST"     // REMOVED by simply commenting out a line. No other changes
  ,"OPTIONS"
}; // This MUST be on separate line !!

/**
* Indentation of members of a constructor or mothod call
* Purpose is again to be able to quickly remove or rearrange parameters
*/

final StatementWithParams st = new StatementWithParams(
    CanonicalStatement.getTop("revId", "SELECT dummy FROM dual where dummy > ? and sysdate > 3"),
    // new SqlQueryParam(Types.VARCHAR, "00:00:00"),   // TEMP comment, to try different parameter type
    new SqlQueryParam(Types.TIMESTAMP, "0"),  
    new SqlQueryParam(Types.VARCHAR, "1")
);
