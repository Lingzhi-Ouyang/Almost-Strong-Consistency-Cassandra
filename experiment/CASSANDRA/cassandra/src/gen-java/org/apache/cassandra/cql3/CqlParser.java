// $ANTLR 3.5.2 C:\\Users\\mio\\repo\\cassandra/src/antlr/Cql.g 2017-12-13 11:17:45

    package org.apache.cassandra.cql3;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.EnumSet;
    import java.util.HashSet;
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;

    import org.apache.cassandra.auth.*;
    import org.apache.cassandra.cql3.*;
    import org.apache.cassandra.cql3.restrictions.CustomIndexExpression;
    import org.apache.cassandra.cql3.statements.*;
    import org.apache.cassandra.cql3.selection.*;
    import org.apache.cassandra.cql3.functions.*;
    import org.apache.cassandra.db.marshal.CollectionType;
    import org.apache.cassandra.exceptions.ConfigurationException;
    import org.apache.cassandra.exceptions.InvalidRequestException;
    import org.apache.cassandra.exceptions.SyntaxException;
    import org.apache.cassandra.utils.Pair;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "B", "BOOLEAN", "C", "COMMENT", 
		"D", "DIGIT", "E", "EXPONENT", "F", "FLOAT", "G", "H", "HEX", "HEXNUMBER", 
		"I", "IDENT", "INTEGER", "J", "K", "K_ADD", "K_AGGREGATE", "K_ALL", "K_ALLOW", 
		"K_ALTER", "K_AND", "K_APPLY", "K_AS", "K_ASC", "K_ASCII", "K_AUTHORIZE", 
		"K_BATCH", "K_BEGIN", "K_BIGINT", "K_BLOB", "K_BOOLEAN", "K_BY", "K_CALLED", 
		"K_CAST", "K_CLUSTERING", "K_COLUMNFAMILY", "K_COMPACT", "K_CONTAINS", 
		"K_COUNT", "K_COUNTER", "K_CREATE", "K_CUSTOM", "K_DATE", "K_DECIMAL", 
		"K_DELETE", "K_DESC", "K_DESCRIBE", "K_DISTINCT", "K_DOUBLE", "K_DROP", 
		"K_ENTRIES", "K_EXECUTE", "K_EXISTS", "K_FILTERING", "K_FINALFUNC", "K_FLOAT", 
		"K_FROM", "K_FROZEN", "K_FULL", "K_FUNCTION", "K_FUNCTIONS", "K_GRANT", 
		"K_IF", "K_IN", "K_INDEX", "K_INET", "K_INFINITY", "K_INITCOND", "K_INPUT", 
		"K_INSERT", "K_INT", "K_INTO", "K_IS", "K_JSON", "K_KEY", "K_KEYS", "K_KEYSPACE", 
		"K_KEYSPACES", "K_LANGUAGE", "K_LIKE", "K_LIMIT", "K_LIST", "K_LOGIN", 
		"K_MAP", "K_MATERIALIZED", "K_MBEAN", "K_MBEANS", "K_MODIFY", "K_NAN", 
		"K_NOLOGIN", "K_NORECURSIVE", "K_NOSUPERUSER", "K_NOT", "K_NULL", "K_OF", 
		"K_ON", "K_OPTIONS", "K_OR", "K_ORDER", "K_PARTITION", "K_PASSWORD", "K_PER", 
		"K_PERMISSION", "K_PERMISSIONS", "K_PRIMARY", "K_RENAME", "K_REPLACE", 
		"K_RETURNS", "K_REVOKE", "K_ROLE", "K_ROLES", "K_SELECT", "K_SET", "K_SFUNC", 
		"K_SMALLINT", "K_STATIC", "K_STORAGE", "K_STYPE", "K_SUPERUSER", "K_TEXT", 
		"K_TIME", "K_TIMESTAMP", "K_TIMEUUID", "K_TINYINT", "K_TO", "K_TOKEN", 
		"K_TRIGGER", "K_TRUNCATE", "K_TTL", "K_TUPLE", "K_TYPE", "K_UNLOGGED", 
		"K_UPDATE", "K_USE", "K_USER", "K_USERS", "K_USING", "K_UUID", "K_VALUES", 
		"K_VARCHAR", "K_VARINT", "K_VIEW", "K_WHERE", "K_WITH", "K_WRITETIME", 
		"L", "LETTER", "M", "MULTILINE_COMMENT", "N", "O", "P", "Q", "QMARK", 
		"QUOTED_NAME", "R", "S", "STRING_LITERAL", "T", "U", "UUID", "V", "W", 
		"WS", "X", "Y", "Z", "'!='", "'('", "')'", "'+'", "','", "'-'", "'.'", 
		"':'", "';'", "'<'", "'<='", "'='", "'>'", "'>='", "'['", "'\\*'", "']'", 
		"'expr('", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__176=176;
	public static final int T__177=177;
	public static final int T__178=178;
	public static final int T__179=179;
	public static final int T__180=180;
	public static final int T__181=181;
	public static final int T__182=182;
	public static final int T__183=183;
	public static final int T__184=184;
	public static final int T__185=185;
	public static final int T__186=186;
	public static final int T__187=187;
	public static final int T__188=188;
	public static final int T__189=189;
	public static final int T__190=190;
	public static final int T__191=191;
	public static final int T__192=192;
	public static final int T__193=193;
	public static final int T__194=194;
	public static final int T__195=195;
	public static final int A=4;
	public static final int B=5;
	public static final int BOOLEAN=6;
	public static final int C=7;
	public static final int COMMENT=8;
	public static final int D=9;
	public static final int DIGIT=10;
	public static final int E=11;
	public static final int EXPONENT=12;
	public static final int F=13;
	public static final int FLOAT=14;
	public static final int G=15;
	public static final int H=16;
	public static final int HEX=17;
	public static final int HEXNUMBER=18;
	public static final int I=19;
	public static final int IDENT=20;
	public static final int INTEGER=21;
	public static final int J=22;
	public static final int K=23;
	public static final int K_ADD=24;
	public static final int K_AGGREGATE=25;
	public static final int K_ALL=26;
	public static final int K_ALLOW=27;
	public static final int K_ALTER=28;
	public static final int K_AND=29;
	public static final int K_APPLY=30;
	public static final int K_AS=31;
	public static final int K_ASC=32;
	public static final int K_ASCII=33;
	public static final int K_AUTHORIZE=34;
	public static final int K_BATCH=35;
	public static final int K_BEGIN=36;
	public static final int K_BIGINT=37;
	public static final int K_BLOB=38;
	public static final int K_BOOLEAN=39;
	public static final int K_BY=40;
	public static final int K_CALLED=41;
	public static final int K_CAST=42;
	public static final int K_CLUSTERING=43;
	public static final int K_COLUMNFAMILY=44;
	public static final int K_COMPACT=45;
	public static final int K_CONTAINS=46;
	public static final int K_COUNT=47;
	public static final int K_COUNTER=48;
	public static final int K_CREATE=49;
	public static final int K_CUSTOM=50;
	public static final int K_DATE=51;
	public static final int K_DECIMAL=52;
	public static final int K_DELETE=53;
	public static final int K_DESC=54;
	public static final int K_DESCRIBE=55;
	public static final int K_DISTINCT=56;
	public static final int K_DOUBLE=57;
	public static final int K_DROP=58;
	public static final int K_ENTRIES=59;
	public static final int K_EXECUTE=60;
	public static final int K_EXISTS=61;
	public static final int K_FILTERING=62;
	public static final int K_FINALFUNC=63;
	public static final int K_FLOAT=64;
	public static final int K_FROM=65;
	public static final int K_FROZEN=66;
	public static final int K_FULL=67;
	public static final int K_FUNCTION=68;
	public static final int K_FUNCTIONS=69;
	public static final int K_GRANT=70;
	public static final int K_IF=71;
	public static final int K_IN=72;
	public static final int K_INDEX=73;
	public static final int K_INET=74;
	public static final int K_INFINITY=75;
	public static final int K_INITCOND=76;
	public static final int K_INPUT=77;
	public static final int K_INSERT=78;
	public static final int K_INT=79;
	public static final int K_INTO=80;
	public static final int K_IS=81;
	public static final int K_JSON=82;
	public static final int K_KEY=83;
	public static final int K_KEYS=84;
	public static final int K_KEYSPACE=85;
	public static final int K_KEYSPACES=86;
	public static final int K_LANGUAGE=87;
	public static final int K_LIKE=88;
	public static final int K_LIMIT=89;
	public static final int K_LIST=90;
	public static final int K_LOGIN=91;
	public static final int K_MAP=92;
	public static final int K_MATERIALIZED=93;
	public static final int K_MBEAN=94;
	public static final int K_MBEANS=95;
	public static final int K_MODIFY=96;
	public static final int K_NAN=97;
	public static final int K_NOLOGIN=98;
	public static final int K_NORECURSIVE=99;
	public static final int K_NOSUPERUSER=100;
	public static final int K_NOT=101;
	public static final int K_NULL=102;
	public static final int K_OF=103;
	public static final int K_ON=104;
	public static final int K_OPTIONS=105;
	public static final int K_OR=106;
	public static final int K_ORDER=107;
	public static final int K_PARTITION=108;
	public static final int K_PASSWORD=109;
	public static final int K_PER=110;
	public static final int K_PERMISSION=111;
	public static final int K_PERMISSIONS=112;
	public static final int K_PRIMARY=113;
	public static final int K_RENAME=114;
	public static final int K_REPLACE=115;
	public static final int K_RETURNS=116;
	public static final int K_REVOKE=117;
	public static final int K_ROLE=118;
	public static final int K_ROLES=119;
	public static final int K_SELECT=120;
	public static final int K_SET=121;
	public static final int K_SFUNC=122;
	public static final int K_SMALLINT=123;
	public static final int K_STATIC=124;
	public static final int K_STORAGE=125;
	public static final int K_STYPE=126;
	public static final int K_SUPERUSER=127;
	public static final int K_TEXT=128;
	public static final int K_TIME=129;
	public static final int K_TIMESTAMP=130;
	public static final int K_TIMEUUID=131;
	public static final int K_TINYINT=132;
	public static final int K_TO=133;
	public static final int K_TOKEN=134;
	public static final int K_TRIGGER=135;
	public static final int K_TRUNCATE=136;
	public static final int K_TTL=137;
	public static final int K_TUPLE=138;
	public static final int K_TYPE=139;
	public static final int K_UNLOGGED=140;
	public static final int K_UPDATE=141;
	public static final int K_USE=142;
	public static final int K_USER=143;
	public static final int K_USERS=144;
	public static final int K_USING=145;
	public static final int K_UUID=146;
	public static final int K_VALUES=147;
	public static final int K_VARCHAR=148;
	public static final int K_VARINT=149;
	public static final int K_VIEW=150;
	public static final int K_WHERE=151;
	public static final int K_WITH=152;
	public static final int K_WRITETIME=153;
	public static final int L=154;
	public static final int LETTER=155;
	public static final int M=156;
	public static final int MULTILINE_COMMENT=157;
	public static final int N=158;
	public static final int O=159;
	public static final int P=160;
	public static final int Q=161;
	public static final int QMARK=162;
	public static final int QUOTED_NAME=163;
	public static final int R=164;
	public static final int S=165;
	public static final int STRING_LITERAL=166;
	public static final int T=167;
	public static final int U=168;
	public static final int UUID=169;
	public static final int V=170;
	public static final int W=171;
	public static final int WS=172;
	public static final int X=173;
	public static final int Y=174;
	public static final int Z=175;

	// delegates
	public Cql_Parser gParser;
	public Parser[] getDelegates() {
		return new Parser[] {gParser};
	}

	// delegators


	public CqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		gParser = new Cql_Parser(input, state, this);
	}

	@Override public String[] getTokenNames() { return CqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\mio\\repo\\cassandra/src/antlr/Cql.g"; }


	    public void addErrorListener(ErrorListener listener)
	    {
	        gParser.addErrorListener(listener);
	    }

	    public void removeErrorListener(ErrorListener listener)
	    {
	        gParser.removeErrorListener(listener);
	    }

	    public void displayRecognitionError(String[] tokenNames, RecognitionException e)
	    {
	        gParser.displayRecognitionError(tokenNames, e);
	    }

	    protected void addRecognitionError(String msg)
	    {
	        gParser.addRecognitionError(msg);
	    }



	// $ANTLR start "query"
	// C:\\Users\\mio\\repo\\cassandra/src/antlr/Cql.g:119:1: query returns [ParsedStatement stmnt] : st= cqlStatement ( ';' )* EOF ;
	public final ParsedStatement query() throws RecognitionException {
		ParsedStatement stmnt = null;


		ParsedStatement st =null;

		try {
			// C:\\Users\\mio\\repo\\cassandra/src/antlr/Cql.g:120:5: (st= cqlStatement ( ';' )* EOF )
			// C:\\Users\\mio\\repo\\cassandra/src/antlr/Cql.g:120:7: st= cqlStatement ( ';' )* EOF
			{
			pushFollow(FOLLOW_cqlStatement_in_query77);
			st=cqlStatement();
			state._fsp--;

			// C:\\Users\\mio\\repo\\cassandra/src/antlr/Cql.g:120:23: ( ';' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==184) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\mio\\repo\\cassandra/src/antlr/Cql.g:120:24: ';'
					{
					match(input,184,FOLLOW_184_in_query80); 
					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_query84); 
			 stmnt = st; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmnt;
	}
	// $ANTLR end "query"

	// Delegated rules
	public List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> updateConditions() throws RecognitionException { return gParser.updateConditions(); }

	public Cql_Parser.username_return username() throws RecognitionException { return gParser.username(); }

	public void userPassword(RoleOptions opts) throws RecognitionException { gParser.userPassword(opts); }

	public FunctionResource functionResource() throws RecognitionException { return gParser.functionResource(); }

	public String unreserved_keyword() throws RecognitionException { return gParser.unreserved_keyword(); }

	public CreateTypeStatement createTypeStatement() throws RecognitionException { return gParser.createTypeStatement(); }

	public ColumnIdentifier ident() throws RecognitionException { return gParser.ident(); }

	public ListRolesStatement listRolesStatement() throws RecognitionException { return gParser.listRolesStatement(); }

	public void columnOperation(List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations) throws RecognitionException { gParser.columnOperation(operations); }

	public String allowedFunctionName() throws RecognitionException { return gParser.allowedFunctionName(); }

	public AlterKeyspaceStatement alterKeyspaceStatement() throws RecognitionException { return gParser.alterKeyspaceStatement(); }

	public void roleOption(RoleOptions opts) throws RecognitionException { gParser.roleOption(opts); }

	public void orderByClause(Map<ColumnIdentifier.Raw, Boolean> orderings) throws RecognitionException { gParser.orderByClause(orderings); }

	public void usingClauseObjective(Attributes.Raw attrs) throws RecognitionException { gParser.usingClauseObjective(attrs); }

	public RoleResource roleResource() throws RecognitionException { return gParser.roleResource(); }

	public AlterViewStatement alterMaterializedViewStatement() throws RecognitionException { return gParser.alterMaterializedViewStatement(); }

	public Tuples.INRaw inMarkerForTuple() throws RecognitionException { return gParser.inMarkerForTuple(); }

	public DropKeyspaceStatement dropKeyspaceStatement() throws RecognitionException { return gParser.dropKeyspaceStatement(); }

	public CreateRoleStatement createUserStatement() throws RecognitionException { return gParser.createUserStatement(); }

	public Json.Raw jsonValue() throws RecognitionException { return gParser.jsonValue(); }

	public GrantRoleStatement grantRoleStatement() throws RecognitionException { return gParser.grantRoleStatement(); }

	public String basic_unreserved_keyword() throws RecognitionException { return gParser.basic_unreserved_keyword(); }

	public void collectionColumnOperation(List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key, Term.Raw k) throws RecognitionException { gParser.collectionColumnOperation(operations, key, k); }

	public CreateKeyspaceStatement createKeyspaceStatement() throws RecognitionException { return gParser.createKeyspaceStatement(); }

	public Operator relationType() throws RecognitionException { return gParser.relationType(); }

	public void idxName(IndexName name) throws RecognitionException { gParser.idxName(name); }

	public CreateRoleStatement createRoleStatement() throws RecognitionException { return gParser.createRoleStatement(); }

	public List<ColumnIdentifier.Raw> tupleOfIdentifiers() throws RecognitionException { return gParser.tupleOfIdentifiers(); }

	public ColumnIdentifier non_type_ident() throws RecognitionException { return gParser.non_type_ident(); }

	public FunctionName functionName() throws RecognitionException { return gParser.functionName(); }

	public Operation.RawDeletion deleteOp() throws RecognitionException { return gParser.deleteOp(); }

	public String propertyValue() throws RecognitionException { return gParser.propertyValue(); }

	public JMXResource jmxResource() throws RecognitionException { return gParser.jmxResource(); }

	public void ksName(KeyspaceElementName name) throws RecognitionException { gParser.ksName(name); }

	public Term.Raw collectionLiteral() throws RecognitionException { return gParser.collectionLiteral(); }

	public AlterTableStatement alterTableStatement() throws RecognitionException { return gParser.alterTableStatement(); }

	public void udtColumnOperation(List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key, ColumnIdentifier.Raw field) throws RecognitionException { gParser.udtColumnOperation(operations, key, field); }

	public ListPermissionsStatement listPermissionsStatement() throws RecognitionException { return gParser.listPermissionsStatement(); }

	public RoleName userOrRoleName() throws RecognitionException { return gParser.userOrRoleName(); }

	public WhereClause.Builder whereClause() throws RecognitionException { return gParser.whereClause(); }

	public SelectStatement.RawStatement selectStatement() throws RecognitionException { return gParser.selectStatement(); }

	public ColumnIdentifier.Raw cident() throws RecognitionException { return gParser.cident(); }

	public void columnOperationDifferentiator(List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key) throws RecognitionException { gParser.columnOperationDifferentiator(operations, key); }

	public void properties(PropertyDefinitions props) throws RecognitionException { gParser.properties(props); }

	public CreateViewStatement createMaterializedViewStatement() throws RecognitionException { return gParser.createMaterializedViewStatement(); }

	public GrantPermissionsStatement grantPermissionsStatement() throws RecognitionException { return gParser.grantPermissionsStatement(); }

	public DropTriggerStatement dropTriggerStatement() throws RecognitionException { return gParser.dropTriggerStatement(); }

	public void cfamColumns(CreateTableStatement.RawStatement expr) throws RecognitionException { gParser.cfamColumns(expr); }

	public boolean cfisStatic() throws RecognitionException { return gParser.cfisStatic(); }

	public AbstractMarker.INRaw inMarker() throws RecognitionException { return gParser.inMarker(); }

	public void customIndexExpression(WhereClause.Builder clause) throws RecognitionException { gParser.customIndexExpression(clause); }

	public Tuples.Raw markerForTuple() throws RecognitionException { return gParser.markerForTuple(); }

	public void usingClauseDelete(Attributes.Raw attrs) throws RecognitionException { gParser.usingClauseDelete(attrs); }

	public UpdateStatement.ParsedInsert normalInsertStatement(CFName cf) throws RecognitionException { return gParser.normalInsertStatement(cf); }

	public IResource resource() throws RecognitionException { return gParser.resource(); }

	public List<Tuples.Raw> tupleOfMarkersForTuples() throws RecognitionException { return gParser.tupleOfMarkersForTuples(); }

	public UseStatement useStatement() throws RecognitionException { return gParser.useStatement(); }

	public void property(PropertyDefinitions props) throws RecognitionException { gParser.property(props); }

	public CreateAggregateStatement createAggregateStatement() throws RecognitionException { return gParser.createAggregateStatement(); }

	public AlterRoleStatement alterUserStatement() throws RecognitionException { return gParser.alterUserStatement(); }

	public Constants.Literal constant() throws RecognitionException { return gParser.constant(); }

	public CQL3Type native_type() throws RecognitionException { return gParser.native_type(); }

	public void countArgument() throws RecognitionException { gParser.countArgument(); }

	public void typeColumns(CreateTypeStatement expr) throws RecognitionException { gParser.typeColumns(expr); }

	public CQL3Type.Raw comparatorType() throws RecognitionException { return gParser.comparatorType(); }

	public DropRoleStatement dropRoleStatement() throws RecognitionException { return gParser.dropRoleStatement(); }

	public List<Tuples.Literal> tupleOfTupleLiterals() throws RecognitionException { return gParser.tupleOfTupleLiterals(); }

	public void pkDef(CreateTableStatement.RawStatement expr) throws RecognitionException { gParser.pkDef(expr); }

	public void usingClause(Attributes.Raw attrs) throws RecognitionException { gParser.usingClause(attrs); }

	public ModificationStatement.Parsed insertStatement() throws RecognitionException { return gParser.insertStatement(); }

	public Term.Raw setOrMapLiteral(Term.Raw t) throws RecognitionException { return gParser.setOrMapLiteral(t); }

	public String keyspaceName() throws RecognitionException { return gParser.keyspaceName(); }

	public Term.Raw value() throws RecognitionException { return gParser.value(); }

	public CreateTriggerStatement createTriggerStatement() throws RecognitionException { return gParser.createTriggerStatement(); }

	public TruncateStatement truncateStatement() throws RecognitionException { return gParser.truncateStatement(); }

	public CQL3Type.Raw tuple_type() throws RecognitionException { return gParser.tuple_type(); }

	public RevokePermissionsStatement revokePermissionsStatement() throws RecognitionException { return gParser.revokePermissionsStatement(); }

	public ColumnIdentifier noncol_ident() throws RecognitionException { return gParser.noncol_ident(); }

	public List<RawSelector> selectClause() throws RecognitionException { return gParser.selectClause(); }

	public DropIndexStatement dropIndexStatement() throws RecognitionException { return gParser.dropIndexStatement(); }

	public Maps.Literal mapLiteral() throws RecognitionException { return gParser.mapLiteral(); }

	public void relation(WhereClause.Builder clauses) throws RecognitionException { gParser.relation(clauses); }

	public Set<Permission> permissionOrAll() throws RecognitionException { return gParser.permissionOrAll(); }

	public ListRolesStatement listUsersStatement() throws RecognitionException { return gParser.listUsersStatement(); }

	public DropAggregateStatement dropAggregateStatement() throws RecognitionException { return gParser.dropAggregateStatement(); }

	public List<Term.Raw> functionArgs() throws RecognitionException { return gParser.functionArgs(); }

	public ParsedStatement cqlStatement() throws RecognitionException { return gParser.cqlStatement(); }

	public DropFunctionStatement dropFunctionStatement() throws RecognitionException { return gParser.dropFunctionStatement(); }

	public CreateIndexStatement createIndexStatement() throws RecognitionException { return gParser.createIndexStatement(); }

	public void cfamDefinition(CreateTableStatement.RawStatement expr) throws RecognitionException { gParser.cfamDefinition(expr); }

	public void roleName(RoleName name) throws RecognitionException { gParser.roleName(name); }

	public DataResource dataResource() throws RecognitionException { return gParser.dataResource(); }

	public void relationOrExpression(WhereClause.Builder clause) throws RecognitionException { gParser.relationOrExpression(clause); }

	public Term.Raw function() throws RecognitionException { return gParser.function(); }

	public List<Selectable.Raw> selectionFunctionArgs() throws RecognitionException { return gParser.selectionFunctionArgs(); }

	public Selectable.Raw unaliasedSelector() throws RecognitionException { return gParser.unaliasedSelector(); }

	public DropRoleStatement dropUserStatement() throws RecognitionException { return gParser.dropUserStatement(); }

	public RevokeRoleStatement revokeRoleStatement() throws RecognitionException { return gParser.revokeRoleStatement(); }

	public DropViewStatement dropMaterializedViewStatement() throws RecognitionException { return gParser.dropMaterializedViewStatement(); }

	public UpdateStatement.ParsedUpdate updateStatement() throws RecognitionException { return gParser.updateStatement(); }

	public CreateFunctionStatement createFunctionStatement() throws RecognitionException { return gParser.createFunctionStatement(); }

	public UTName userTypeName() throws RecognitionException { return gParser.userTypeName(); }

	public DropTypeStatement dropTypeStatement() throws RecognitionException { return gParser.dropTypeStatement(); }

	public List<Operation.RawDeletion> deleteSelection() throws RecognitionException { return gParser.deleteSelection(); }

	public ModificationStatement.Parsed batchStatementObjective() throws RecognitionException { return gParser.batchStatementObjective(); }

	public void cfamOrdering(CFProperties props) throws RecognitionException { gParser.cfamOrdering(props); }

	public void normalColumnOperation(List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key) throws RecognitionException { gParser.normalColumnOperation(operations, key); }

	public CreateTableStatement.RawStatement createTableStatement() throws RecognitionException { return gParser.createTableStatement(); }

	public Cql_Parser.mbean_return mbean() throws RecognitionException { return gParser.mbean(); }

	public List<Term.Raw> singleColumnInValues() throws RecognitionException { return gParser.singleColumnInValues(); }

	public String unreserved_function_keyword() throws RecognitionException { return gParser.unreserved_function_keyword(); }

	public DeleteStatement.Parsed deleteStatement() throws RecognitionException { return gParser.deleteStatement(); }

	public BatchStatement.Parsed batchStatement() throws RecognitionException { return gParser.batchStatement(); }

	public UpdateStatement.ParsedInsertJson jsonInsertStatement(CFName cf) throws RecognitionException { return gParser.jsonInsertStatement(cf); }

	public IndexName indexName() throws RecognitionException { return gParser.indexName(); }

	public void cfName(CFName name) throws RecognitionException { gParser.cfName(name); }

	public AlterTypeStatement alterTypeStatement() throws RecognitionException { return gParser.alterTypeStatement(); }

	public CFName columnFamilyName() throws RecognitionException { return gParser.columnFamilyName(); }

	public void columnCondition(List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions) throws RecognitionException { gParser.columnCondition(conditions); }

	public void cfamProperty(CFProperties props) throws RecognitionException { gParser.cfamProperty(props); }

	public Tuples.Literal tupleLiteral() throws RecognitionException { return gParser.tupleLiteral(); }

	public Term.Raw intValue() throws RecognitionException { return gParser.intValue(); }

	public AlterRoleStatement alterRoleStatement() throws RecognitionException { return gParser.alterRoleStatement(); }

	public UserTypes.Literal usertypeLiteral() throws RecognitionException { return gParser.usertypeLiteral(); }

	public Term.Raw term() throws RecognitionException { return gParser.term(); }

	public DropTableStatement dropTableStatement() throws RecognitionException { return gParser.dropTableStatement(); }

	public void roleOptions(RoleOptions opts) throws RecognitionException { gParser.roleOptions(opts); }

	public CQL3Type.Raw collection_type() throws RecognitionException { return gParser.collection_type(); }

	public RawSelector selector() throws RecognitionException { return gParser.selector(); }

	public void indexIdent(List<IndexTarget.Raw> targets) throws RecognitionException { gParser.indexIdent(targets); }

	public Permission permission() throws RecognitionException { return gParser.permission(); }



	public static final BitSet FOLLOW_cqlStatement_in_query77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_184_in_query80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_EOF_in_query84 = new BitSet(new long[]{0x0000000000000002L});
}
