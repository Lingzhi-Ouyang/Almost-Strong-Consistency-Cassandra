// $ANTLR 3.5.2 Parser.g 2017-12-13 11:17:45

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
public class Cql_Parser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public CqlParser gCql;
	public CqlParser gParent;


	public Cql_Parser(TokenStream input, CqlParser gCql) {
		this(input, new RecognizerSharedState(), gCql);
	}
	public Cql_Parser(TokenStream input, RecognizerSharedState state, CqlParser gCql) {
		super(input, state);
		this.gCql = gCql;
		gParent = gCql;
	}

	@Override public String[] getTokenNames() { return CqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Parser.g"; }


	    private final List<ErrorListener> listeners = new ArrayList<ErrorListener>();
	    protected final List<ColumnIdentifier> bindVariables = new ArrayList<ColumnIdentifier>();

	    public static final Set<String> reservedTypeNames = new HashSet<String>()
	    {{
	        add("byte");
	        add("complex");
	        add("enum");
	        add("date");
	        add("interval");
	        add("macaddr");
	        add("bitstring");
	    }};

	    public AbstractMarker.Raw newBindVariables(ColumnIdentifier name)
	    {
	        AbstractMarker.Raw marker = new AbstractMarker.Raw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public AbstractMarker.INRaw newINBindVariables(ColumnIdentifier name)
	    {
	        AbstractMarker.INRaw marker = new AbstractMarker.INRaw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Tuples.Raw newTupleBindVariables(ColumnIdentifier name)
	    {
	        Tuples.Raw marker = new Tuples.Raw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Tuples.INRaw newTupleINBindVariables(ColumnIdentifier name)
	    {
	        Tuples.INRaw marker = new Tuples.INRaw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Json.Marker newJsonBindVariables(ColumnIdentifier name)
	    {
	        Json.Marker marker = new Json.Marker(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public void addErrorListener(ErrorListener listener)
	    {
	        this.listeners.add(listener);
	    }

	    public void removeErrorListener(ErrorListener listener)
	    {
	        this.listeners.remove(listener);
	    }

	    public void displayRecognitionError(String[] tokenNames, RecognitionException e)
	    {
	        for (int i = 0, m = listeners.size(); i < m; i++)
	            listeners.get(i).syntaxError(this, tokenNames, e);
	    }

	    protected void addRecognitionError(String msg)
	    {
	        for (int i = 0, m = listeners.size(); i < m; i++)
	            listeners.get(i).syntaxError(this, msg);
	    }

	    public Map<String, String> convertPropertyMap(Maps.Literal map)
	    {
	        if (map == null || map.entries == null || map.entries.isEmpty())
	            return Collections.<String, String>emptyMap();

	        Map<String, String> res = new HashMap<String, String>(map.entries.size());

	        for (Pair<Term.Raw, Term.Raw> entry : map.entries)
	        {
	            // Because the parser tries to be smart and recover on error (to
	            // allow displaying more than one error I suppose), we have null
	            // entries in there. Just skip those, a proper error will be thrown in the end.
	            if (entry.left == null || entry.right == null)
	                break;

	            if (!(entry.left instanceof Constants.Literal))
	            {
	                String msg = "Invalid property name: " + entry.left;
	                if (entry.left instanceof AbstractMarker.Raw)
	                    msg += " (bind variables are not supported in DDL queries)";
	                addRecognitionError(msg);
	                break;
	            }
	            if (!(entry.right instanceof Constants.Literal))
	            {
	                String msg = "Invalid property value: " + entry.right + " for property: " + entry.left;
	                if (entry.right instanceof AbstractMarker.Raw)
	                    msg += " (bind variables are not supported in DDL queries)";
	                addRecognitionError(msg);
	                break;
	            }

	            res.put(((Constants.Literal)entry.left).getRawText(), ((Constants.Literal)entry.right).getRawText());
	        }

	        return res;
	    }

	    public void addRawUpdate(List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key, Operation.RawUpdate update)
	    {
	        for (Pair<ColumnIdentifier.Raw, Operation.RawUpdate> p : operations)
	        {
	            if (p.left.equals(key) && !p.right.isCompatibleWith(update))
	                addRecognitionError("Multiple incompatible setting of column " + key);
	        }
	        operations.add(Pair.create(key, update));
	    }

	    public Set<Permission> filterPermissions(Set<Permission> permissions, IResource resource)
	    {
	        if (resource == null)
	            return Collections.emptySet();
	        Set<Permission> filtered = new HashSet<>(permissions);
	        filtered.retainAll(resource.applicablePermissions());
	        if (filtered.isEmpty())
	            addRecognitionError("Resource type " + resource.getClass().getSimpleName() +
	                                    " does not support any of the requested permissions");

	        return filtered;
	    }

	    public String canonicalizeObjectName(String s, boolean enforcePattern)
	    {
	        // these two conditions are here because technically they are valid
	        // ObjectNames, but we want to restrict their use without adding unnecessary
	        // work to JMXResource construction as that also happens on hotter code paths
	        if ("".equals(s))
	            addRecognitionError("Empty JMX object name supplied");

	        if ("*:*".equals(s))
	            addRecognitionError("Please use ALL MBEANS instead of wildcard pattern");

	        try
	        {
	            javax.management.ObjectName objectName = javax.management.ObjectName.getInstance(s);
	            if (enforcePattern && !objectName.isPattern())
	                addRecognitionError("Plural form used, but non-pattern JMX object name specified (" + s + ")");
	            return objectName.getCanonicalName();
	        }
	        catch (javax.management.MalformedObjectNameException e)
	        {
	          addRecognitionError(s + " is not a valid JMX object name");
	          return s;
	        }
	    }




	// $ANTLR start "cqlStatement"
	// Parser.g:188:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement );
	public final ParsedStatement cqlStatement() throws RecognitionException {
		ParsedStatement stmt = null;


		SelectStatement.RawStatement st1 =null;
		ModificationStatement.Parsed st2 =null;
		UpdateStatement.ParsedUpdate st3 =null;
		BatchStatement.Parsed st4 =null;
		DeleteStatement.Parsed st5 =null;
		UseStatement st6 =null;
		TruncateStatement st7 =null;
		CreateKeyspaceStatement st8 =null;
		CreateTableStatement.RawStatement st9 =null;
		CreateIndexStatement st10 =null;
		DropKeyspaceStatement st11 =null;
		DropTableStatement st12 =null;
		DropIndexStatement st13 =null;
		AlterTableStatement st14 =null;
		AlterKeyspaceStatement st15 =null;
		GrantPermissionsStatement st16 =null;
		RevokePermissionsStatement st17 =null;
		ListPermissionsStatement st18 =null;
		CreateRoleStatement st19 =null;
		AlterRoleStatement st20 =null;
		DropRoleStatement st21 =null;
		ListRolesStatement st22 =null;
		CreateTriggerStatement st23 =null;
		DropTriggerStatement st24 =null;
		CreateTypeStatement st25 =null;
		AlterTypeStatement st26 =null;
		DropTypeStatement st27 =null;
		CreateFunctionStatement st28 =null;
		DropFunctionStatement st29 =null;
		CreateAggregateStatement st30 =null;
		DropAggregateStatement st31 =null;
		CreateRoleStatement st32 =null;
		AlterRoleStatement st33 =null;
		DropRoleStatement st34 =null;
		ListRolesStatement st35 =null;
		GrantRoleStatement st36 =null;
		RevokeRoleStatement st37 =null;
		CreateViewStatement st38 =null;
		DropViewStatement st39 =null;
		AlterViewStatement st40 =null;

		try {
			// Parser.g:190:5: (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement )
			int alt1=40;
			alt1 = dfa1.predict(input);
			switch (alt1) {
				case 1 :
					// Parser.g:190:7: st1= selectStatement
					{
					pushFollow(FOLLOW_selectStatement_in_cqlStatement59);
					st1=selectStatement();
					state._fsp--;

					 stmt = st1; 
					}
					break;
				case 2 :
					// Parser.g:191:7: st2= insertStatement
					{
					pushFollow(FOLLOW_insertStatement_in_cqlStatement88);
					st2=insertStatement();
					state._fsp--;

					 stmt = st2; 
					}
					break;
				case 3 :
					// Parser.g:192:7: st3= updateStatement
					{
					pushFollow(FOLLOW_updateStatement_in_cqlStatement117);
					st3=updateStatement();
					state._fsp--;

					 stmt = st3; 
					}
					break;
				case 4 :
					// Parser.g:193:7: st4= batchStatement
					{
					pushFollow(FOLLOW_batchStatement_in_cqlStatement146);
					st4=batchStatement();
					state._fsp--;

					 stmt = st4; 
					}
					break;
				case 5 :
					// Parser.g:194:7: st5= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_cqlStatement176);
					st5=deleteStatement();
					state._fsp--;

					 stmt = st5; 
					}
					break;
				case 6 :
					// Parser.g:195:7: st6= useStatement
					{
					pushFollow(FOLLOW_useStatement_in_cqlStatement205);
					st6=useStatement();
					state._fsp--;

					 stmt = st6; 
					}
					break;
				case 7 :
					// Parser.g:196:7: st7= truncateStatement
					{
					pushFollow(FOLLOW_truncateStatement_in_cqlStatement237);
					st7=truncateStatement();
					state._fsp--;

					 stmt = st7; 
					}
					break;
				case 8 :
					// Parser.g:197:7: st8= createKeyspaceStatement
					{
					pushFollow(FOLLOW_createKeyspaceStatement_in_cqlStatement264);
					st8=createKeyspaceStatement();
					state._fsp--;

					 stmt = st8; 
					}
					break;
				case 9 :
					// Parser.g:198:7: st9= createTableStatement
					{
					pushFollow(FOLLOW_createTableStatement_in_cqlStatement285);
					st9=createTableStatement();
					state._fsp--;

					 stmt = st9; 
					}
					break;
				case 10 :
					// Parser.g:199:7: st10= createIndexStatement
					{
					pushFollow(FOLLOW_createIndexStatement_in_cqlStatement308);
					st10=createIndexStatement();
					state._fsp--;

					 stmt = st10; 
					}
					break;
				case 11 :
					// Parser.g:200:7: st11= dropKeyspaceStatement
					{
					pushFollow(FOLLOW_dropKeyspaceStatement_in_cqlStatement331);
					st11=dropKeyspaceStatement();
					state._fsp--;

					 stmt = st11; 
					}
					break;
				case 12 :
					// Parser.g:201:7: st12= dropTableStatement
					{
					pushFollow(FOLLOW_dropTableStatement_in_cqlStatement353);
					st12=dropTableStatement();
					state._fsp--;

					 stmt = st12; 
					}
					break;
				case 13 :
					// Parser.g:202:7: st13= dropIndexStatement
					{
					pushFollow(FOLLOW_dropIndexStatement_in_cqlStatement378);
					st13=dropIndexStatement();
					state._fsp--;

					 stmt = st13; 
					}
					break;
				case 14 :
					// Parser.g:203:7: st14= alterTableStatement
					{
					pushFollow(FOLLOW_alterTableStatement_in_cqlStatement403);
					st14=alterTableStatement();
					state._fsp--;

					 stmt = st14; 
					}
					break;
				case 15 :
					// Parser.g:204:7: st15= alterKeyspaceStatement
					{
					pushFollow(FOLLOW_alterKeyspaceStatement_in_cqlStatement427);
					st15=alterKeyspaceStatement();
					state._fsp--;

					 stmt = st15; 
					}
					break;
				case 16 :
					// Parser.g:205:7: st16= grantPermissionsStatement
					{
					pushFollow(FOLLOW_grantPermissionsStatement_in_cqlStatement448);
					st16=grantPermissionsStatement();
					state._fsp--;

					 stmt = st16; 
					}
					break;
				case 17 :
					// Parser.g:206:7: st17= revokePermissionsStatement
					{
					pushFollow(FOLLOW_revokePermissionsStatement_in_cqlStatement466);
					st17=revokePermissionsStatement();
					state._fsp--;

					 stmt = st17; 
					}
					break;
				case 18 :
					// Parser.g:207:7: st18= listPermissionsStatement
					{
					pushFollow(FOLLOW_listPermissionsStatement_in_cqlStatement483);
					st18=listPermissionsStatement();
					state._fsp--;

					 stmt = st18; 
					}
					break;
				case 19 :
					// Parser.g:208:7: st19= createUserStatement
					{
					pushFollow(FOLLOW_createUserStatement_in_cqlStatement502);
					st19=createUserStatement();
					state._fsp--;

					 stmt = st19; 
					}
					break;
				case 20 :
					// Parser.g:209:7: st20= alterUserStatement
					{
					pushFollow(FOLLOW_alterUserStatement_in_cqlStatement526);
					st20=alterUserStatement();
					state._fsp--;

					 stmt = st20; 
					}
					break;
				case 21 :
					// Parser.g:210:7: st21= dropUserStatement
					{
					pushFollow(FOLLOW_dropUserStatement_in_cqlStatement551);
					st21=dropUserStatement();
					state._fsp--;

					 stmt = st21; 
					}
					break;
				case 22 :
					// Parser.g:211:7: st22= listUsersStatement
					{
					pushFollow(FOLLOW_listUsersStatement_in_cqlStatement577);
					st22=listUsersStatement();
					state._fsp--;

					 stmt = st22; 
					}
					break;
				case 23 :
					// Parser.g:212:7: st23= createTriggerStatement
					{
					pushFollow(FOLLOW_createTriggerStatement_in_cqlStatement602);
					st23=createTriggerStatement();
					state._fsp--;

					 stmt = st23; 
					}
					break;
				case 24 :
					// Parser.g:213:7: st24= dropTriggerStatement
					{
					pushFollow(FOLLOW_dropTriggerStatement_in_cqlStatement623);
					st24=dropTriggerStatement();
					state._fsp--;

					 stmt = st24; 
					}
					break;
				case 25 :
					// Parser.g:214:7: st25= createTypeStatement
					{
					pushFollow(FOLLOW_createTypeStatement_in_cqlStatement646);
					st25=createTypeStatement();
					state._fsp--;

					 stmt = st25; 
					}
					break;
				case 26 :
					// Parser.g:215:7: st26= alterTypeStatement
					{
					pushFollow(FOLLOW_alterTypeStatement_in_cqlStatement670);
					st26=alterTypeStatement();
					state._fsp--;

					 stmt = st26; 
					}
					break;
				case 27 :
					// Parser.g:216:7: st27= dropTypeStatement
					{
					pushFollow(FOLLOW_dropTypeStatement_in_cqlStatement695);
					st27=dropTypeStatement();
					state._fsp--;

					 stmt = st27; 
					}
					break;
				case 28 :
					// Parser.g:217:7: st28= createFunctionStatement
					{
					pushFollow(FOLLOW_createFunctionStatement_in_cqlStatement721);
					st28=createFunctionStatement();
					state._fsp--;

					 stmt = st28; 
					}
					break;
				case 29 :
					// Parser.g:218:7: st29= dropFunctionStatement
					{
					pushFollow(FOLLOW_dropFunctionStatement_in_cqlStatement741);
					st29=dropFunctionStatement();
					state._fsp--;

					 stmt = st29; 
					}
					break;
				case 30 :
					// Parser.g:219:7: st30= createAggregateStatement
					{
					pushFollow(FOLLOW_createAggregateStatement_in_cqlStatement763);
					st30=createAggregateStatement();
					state._fsp--;

					 stmt = st30; 
					}
					break;
				case 31 :
					// Parser.g:220:7: st31= dropAggregateStatement
					{
					pushFollow(FOLLOW_dropAggregateStatement_in_cqlStatement782);
					st31=dropAggregateStatement();
					state._fsp--;

					 stmt = st31; 
					}
					break;
				case 32 :
					// Parser.g:221:7: st32= createRoleStatement
					{
					pushFollow(FOLLOW_createRoleStatement_in_cqlStatement803);
					st32=createRoleStatement();
					state._fsp--;

					 stmt = st32; 
					}
					break;
				case 33 :
					// Parser.g:222:7: st33= alterRoleStatement
					{
					pushFollow(FOLLOW_alterRoleStatement_in_cqlStatement827);
					st33=alterRoleStatement();
					state._fsp--;

					 stmt = st33; 
					}
					break;
				case 34 :
					// Parser.g:223:7: st34= dropRoleStatement
					{
					pushFollow(FOLLOW_dropRoleStatement_in_cqlStatement852);
					st34=dropRoleStatement();
					state._fsp--;

					 stmt = st34; 
					}
					break;
				case 35 :
					// Parser.g:224:7: st35= listRolesStatement
					{
					pushFollow(FOLLOW_listRolesStatement_in_cqlStatement878);
					st35=listRolesStatement();
					state._fsp--;

					 stmt = st35; 
					}
					break;
				case 36 :
					// Parser.g:225:7: st36= grantRoleStatement
					{
					pushFollow(FOLLOW_grantRoleStatement_in_cqlStatement903);
					st36=grantRoleStatement();
					state._fsp--;

					 stmt = st36; 
					}
					break;
				case 37 :
					// Parser.g:226:7: st37= revokeRoleStatement
					{
					pushFollow(FOLLOW_revokeRoleStatement_in_cqlStatement928);
					st37=revokeRoleStatement();
					state._fsp--;

					 stmt = st37; 
					}
					break;
				case 38 :
					// Parser.g:227:7: st38= createMaterializedViewStatement
					{
					pushFollow(FOLLOW_createMaterializedViewStatement_in_cqlStatement952);
					st38=createMaterializedViewStatement();
					state._fsp--;

					 stmt = st38; 
					}
					break;
				case 39 :
					// Parser.g:228:7: st39= dropMaterializedViewStatement
					{
					pushFollow(FOLLOW_dropMaterializedViewStatement_in_cqlStatement964);
					st39=dropMaterializedViewStatement();
					state._fsp--;

					 stmt = st39; 
					}
					break;
				case 40 :
					// Parser.g:229:7: st40= alterMaterializedViewStatement
					{
					pushFollow(FOLLOW_alterMaterializedViewStatement_in_cqlStatement978);
					st40=alterMaterializedViewStatement();
					state._fsp--;

					 stmt = st40; 
					}
					break;

			}
			 if (stmt != null) stmt.setBoundVariables(bindVariables); 
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "cqlStatement"



	// $ANTLR start "useStatement"
	// Parser.g:235:1: useStatement returns [UseStatement stmt] : K_USE ks= keyspaceName ;
	public final UseStatement useStatement() throws RecognitionException {
		UseStatement stmt = null;


		String ks =null;

		try {
			// Parser.g:236:5: ( K_USE ks= keyspaceName )
			// Parser.g:236:7: K_USE ks= keyspaceName
			{
			match(input,K_USE,FOLLOW_K_USE_in_useStatement1004); 
			pushFollow(FOLLOW_keyspaceName_in_useStatement1008);
			ks=keyspaceName();
			state._fsp--;

			 stmt = new UseStatement(ks); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "useStatement"



	// $ANTLR start "selectStatement"
	// Parser.g:245:1: selectStatement returns [SelectStatement.RawStatement expr] : K_SELECT ( K_JSON )? ( ( K_DISTINCT )? sclause= selectClause ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? ;
	public final SelectStatement.RawStatement selectStatement() throws RecognitionException {
		SelectStatement.RawStatement expr = null;


		List<RawSelector> sclause =null;
		CFName cf =null;
		WhereClause.Builder wclause =null;
		Term.Raw rows =null;


		        boolean isDistinct = false;
		        Term.Raw limit = null;
		        Term.Raw perPartitionLimit = null;
		        Map<ColumnIdentifier.Raw, Boolean> orderings = new LinkedHashMap<ColumnIdentifier.Raw, Boolean>();
		        boolean allowFiltering = false;
		        boolean isJson = false;
		    
		try {
			// Parser.g:254:5: ( K_SELECT ( K_JSON )? ( ( K_DISTINCT )? sclause= selectClause ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? )
			// Parser.g:254:7: K_SELECT ( K_JSON )? ( ( K_DISTINCT )? sclause= selectClause ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )?
			{
			match(input,K_SELECT,FOLLOW_K_SELECT_in_selectStatement1042); 
			// Parser.g:255:7: ( K_JSON )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==K_JSON) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==IDENT||(LA2_1 >= K_AGGREGATE && LA2_1 <= K_ALL)||LA2_1==K_ASCII||(LA2_1 >= K_BIGINT && LA2_1 <= K_BOOLEAN)||(LA2_1 >= K_CALLED && LA2_1 <= K_CLUSTERING)||(LA2_1 >= K_COMPACT && LA2_1 <= K_COUNTER)||(LA2_1 >= K_CUSTOM && LA2_1 <= K_DECIMAL)||(LA2_1 >= K_DISTINCT && LA2_1 <= K_DOUBLE)||(LA2_1 >= K_EXISTS && LA2_1 <= K_FLOAT)||LA2_1==K_FROZEN||(LA2_1 >= K_FUNCTION && LA2_1 <= K_FUNCTIONS)||LA2_1==K_INET||(LA2_1 >= K_INITCOND && LA2_1 <= K_INPUT)||LA2_1==K_INT||(LA2_1 >= K_JSON && LA2_1 <= K_KEYS)||(LA2_1 >= K_KEYSPACES && LA2_1 <= K_LIKE)||(LA2_1 >= K_LIST && LA2_1 <= K_MAP)||LA2_1==K_NOLOGIN||LA2_1==K_NOSUPERUSER||LA2_1==K_OPTIONS||(LA2_1 >= K_PARTITION && LA2_1 <= K_PERMISSIONS)||LA2_1==K_RETURNS||(LA2_1 >= K_ROLE && LA2_1 <= K_ROLES)||(LA2_1 >= K_SFUNC && LA2_1 <= K_TINYINT)||(LA2_1 >= K_TOKEN && LA2_1 <= K_TRIGGER)||(LA2_1 >= K_TTL && LA2_1 <= K_TYPE)||(LA2_1 >= K_USER && LA2_1 <= K_USERS)||(LA2_1 >= K_UUID && LA2_1 <= K_VARINT)||LA2_1==K_WRITETIME||(LA2_1 >= QMARK && LA2_1 <= QUOTED_NAME)||LA2_1==191) ) {
					alt2=1;
				}
				else if ( (LA2_1==K_AS) ) {
					int LA2_4 = input.LA(3);
					if ( (LA2_4==K_FROM||LA2_4==177||LA2_4==180||LA2_4==182) ) {
						alt2=1;
					}
					else if ( (LA2_4==K_AS) ) {
						int LA2_5 = input.LA(4);
						if ( (LA2_5==IDENT||(LA2_5 >= K_AGGREGATE && LA2_5 <= K_ALL)||LA2_5==K_AS||LA2_5==K_ASCII||(LA2_5 >= K_BIGINT && LA2_5 <= K_BOOLEAN)||(LA2_5 >= K_CALLED && LA2_5 <= K_CLUSTERING)||(LA2_5 >= K_COMPACT && LA2_5 <= K_COUNTER)||(LA2_5 >= K_CUSTOM && LA2_5 <= K_DECIMAL)||(LA2_5 >= K_DISTINCT && LA2_5 <= K_DOUBLE)||(LA2_5 >= K_EXISTS && LA2_5 <= K_FLOAT)||LA2_5==K_FROZEN||(LA2_5 >= K_FUNCTION && LA2_5 <= K_FUNCTIONS)||LA2_5==K_INET||(LA2_5 >= K_INITCOND && LA2_5 <= K_INPUT)||LA2_5==K_INT||(LA2_5 >= K_JSON && LA2_5 <= K_KEYS)||(LA2_5 >= K_KEYSPACES && LA2_5 <= K_LIKE)||(LA2_5 >= K_LIST && LA2_5 <= K_MAP)||LA2_5==K_NOLOGIN||LA2_5==K_NOSUPERUSER||LA2_5==K_OPTIONS||(LA2_5 >= K_PARTITION && LA2_5 <= K_PERMISSIONS)||LA2_5==K_RETURNS||(LA2_5 >= K_ROLE && LA2_5 <= K_ROLES)||(LA2_5 >= K_SFUNC && LA2_5 <= K_TINYINT)||LA2_5==K_TRIGGER||(LA2_5 >= K_TTL && LA2_5 <= K_TYPE)||(LA2_5 >= K_USER && LA2_5 <= K_USERS)||(LA2_5 >= K_UUID && LA2_5 <= K_VARINT)||LA2_5==K_WRITETIME||LA2_5==QUOTED_NAME) ) {
							alt2=1;
						}
					}
				}
			}
			switch (alt2) {
				case 1 :
					// Parser.g:255:9: K_JSON
					{
					match(input,K_JSON,FOLLOW_K_JSON_in_selectStatement1052); 
					 isJson = true; 
					}
					break;

			}

			// Parser.g:256:7: ( ( K_DISTINCT )? sclause= selectClause )
			// Parser.g:256:9: ( K_DISTINCT )? sclause= selectClause
			{
			// Parser.g:256:9: ( K_DISTINCT )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==K_DISTINCT) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==IDENT||(LA3_1 >= K_AGGREGATE && LA3_1 <= K_ALL)||LA3_1==K_ASCII||(LA3_1 >= K_BIGINT && LA3_1 <= K_BOOLEAN)||(LA3_1 >= K_CALLED && LA3_1 <= K_CLUSTERING)||(LA3_1 >= K_COMPACT && LA3_1 <= K_COUNTER)||(LA3_1 >= K_CUSTOM && LA3_1 <= K_DECIMAL)||(LA3_1 >= K_DISTINCT && LA3_1 <= K_DOUBLE)||(LA3_1 >= K_EXISTS && LA3_1 <= K_FLOAT)||LA3_1==K_FROZEN||(LA3_1 >= K_FUNCTION && LA3_1 <= K_FUNCTIONS)||LA3_1==K_INET||(LA3_1 >= K_INITCOND && LA3_1 <= K_INPUT)||LA3_1==K_INT||(LA3_1 >= K_JSON && LA3_1 <= K_KEYS)||(LA3_1 >= K_KEYSPACES && LA3_1 <= K_LIKE)||(LA3_1 >= K_LIST && LA3_1 <= K_MAP)||LA3_1==K_NOLOGIN||LA3_1==K_NOSUPERUSER||LA3_1==K_OPTIONS||(LA3_1 >= K_PARTITION && LA3_1 <= K_PERMISSIONS)||LA3_1==K_RETURNS||(LA3_1 >= K_ROLE && LA3_1 <= K_ROLES)||(LA3_1 >= K_SFUNC && LA3_1 <= K_TINYINT)||(LA3_1 >= K_TOKEN && LA3_1 <= K_TRIGGER)||(LA3_1 >= K_TTL && LA3_1 <= K_TYPE)||(LA3_1 >= K_USER && LA3_1 <= K_USERS)||(LA3_1 >= K_UUID && LA3_1 <= K_VARINT)||LA3_1==K_WRITETIME||(LA3_1 >= QMARK && LA3_1 <= QUOTED_NAME)||LA3_1==191) ) {
					alt3=1;
				}
				else if ( (LA3_1==K_AS) ) {
					int LA3_4 = input.LA(3);
					if ( (LA3_4==K_FROM||LA3_4==177||LA3_4==180||LA3_4==182) ) {
						alt3=1;
					}
					else if ( (LA3_4==K_AS) ) {
						int LA3_5 = input.LA(4);
						if ( (LA3_5==IDENT||(LA3_5 >= K_AGGREGATE && LA3_5 <= K_ALL)||LA3_5==K_AS||LA3_5==K_ASCII||(LA3_5 >= K_BIGINT && LA3_5 <= K_BOOLEAN)||(LA3_5 >= K_CALLED && LA3_5 <= K_CLUSTERING)||(LA3_5 >= K_COMPACT && LA3_5 <= K_COUNTER)||(LA3_5 >= K_CUSTOM && LA3_5 <= K_DECIMAL)||(LA3_5 >= K_DISTINCT && LA3_5 <= K_DOUBLE)||(LA3_5 >= K_EXISTS && LA3_5 <= K_FLOAT)||LA3_5==K_FROZEN||(LA3_5 >= K_FUNCTION && LA3_5 <= K_FUNCTIONS)||LA3_5==K_INET||(LA3_5 >= K_INITCOND && LA3_5 <= K_INPUT)||LA3_5==K_INT||(LA3_5 >= K_JSON && LA3_5 <= K_KEYS)||(LA3_5 >= K_KEYSPACES && LA3_5 <= K_LIKE)||(LA3_5 >= K_LIST && LA3_5 <= K_MAP)||LA3_5==K_NOLOGIN||LA3_5==K_NOSUPERUSER||LA3_5==K_OPTIONS||(LA3_5 >= K_PARTITION && LA3_5 <= K_PERMISSIONS)||LA3_5==K_RETURNS||(LA3_5 >= K_ROLE && LA3_5 <= K_ROLES)||(LA3_5 >= K_SFUNC && LA3_5 <= K_TINYINT)||LA3_5==K_TRIGGER||(LA3_5 >= K_TTL && LA3_5 <= K_TYPE)||(LA3_5 >= K_USER && LA3_5 <= K_USERS)||(LA3_5 >= K_UUID && LA3_5 <= K_VARINT)||LA3_5==K_WRITETIME||LA3_5==QUOTED_NAME) ) {
							alt3=1;
						}
					}
				}
			}
			switch (alt3) {
				case 1 :
					// Parser.g:256:11: K_DISTINCT
					{
					match(input,K_DISTINCT,FOLLOW_K_DISTINCT_in_selectStatement1069); 
					 isDistinct = true; 
					}
					break;

			}

			pushFollow(FOLLOW_selectClause_in_selectStatement1078);
			sclause=selectClause();
			state._fsp--;

			}

			match(input,K_FROM,FOLLOW_K_FROM_in_selectStatement1088); 
			pushFollow(FOLLOW_columnFamilyName_in_selectStatement1092);
			cf=columnFamilyName();
			state._fsp--;

			// Parser.g:258:7: ( K_WHERE wclause= whereClause )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==K_WHERE) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Parser.g:258:9: K_WHERE wclause= whereClause
					{
					match(input,K_WHERE,FOLLOW_K_WHERE_in_selectStatement1102); 
					pushFollow(FOLLOW_whereClause_in_selectStatement1106);
					wclause=whereClause();
					state._fsp--;

					}
					break;

			}

			// Parser.g:259:7: ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==K_ORDER) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// Parser.g:259:9: K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )*
					{
					match(input,K_ORDER,FOLLOW_K_ORDER_in_selectStatement1119); 
					match(input,K_BY,FOLLOW_K_BY_in_selectStatement1121); 
					pushFollow(FOLLOW_orderByClause_in_selectStatement1123);
					orderByClause(orderings);
					state._fsp--;

					// Parser.g:259:47: ( ',' orderByClause[orderings] )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==180) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// Parser.g:259:49: ',' orderByClause[orderings]
							{
							match(input,180,FOLLOW_180_in_selectStatement1128); 
							pushFollow(FOLLOW_orderByClause_in_selectStatement1130);
							orderByClause(orderings);
							state._fsp--;

							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

			}

			// Parser.g:260:7: ( K_PER K_PARTITION K_LIMIT rows= intValue )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==K_PER) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Parser.g:260:9: K_PER K_PARTITION K_LIMIT rows= intValue
					{
					match(input,K_PER,FOLLOW_K_PER_in_selectStatement1147); 
					match(input,K_PARTITION,FOLLOW_K_PARTITION_in_selectStatement1149); 
					match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement1151); 
					pushFollow(FOLLOW_intValue_in_selectStatement1155);
					rows=intValue();
					state._fsp--;

					 perPartitionLimit = rows; 
					}
					break;

			}

			// Parser.g:261:7: ( K_LIMIT rows= intValue )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==K_LIMIT) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Parser.g:261:9: K_LIMIT rows= intValue
					{
					match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement1170); 
					pushFollow(FOLLOW_intValue_in_selectStatement1174);
					rows=intValue();
					state._fsp--;

					 limit = rows; 
					}
					break;

			}

			// Parser.g:262:7: ( K_ALLOW K_FILTERING )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==K_ALLOW) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Parser.g:262:9: K_ALLOW K_FILTERING
					{
					match(input,K_ALLOW,FOLLOW_K_ALLOW_in_selectStatement1189); 
					match(input,K_FILTERING,FOLLOW_K_FILTERING_in_selectStatement1191); 
					 allowFiltering = true; 
					}
					break;

			}


			          SelectStatement.Parameters params = new SelectStatement.Parameters(orderings,
			                                                                             isDistinct,
			                                                                             allowFiltering,
			                                                                             isJson);
			          WhereClause where = wclause == null ? WhereClause.empty() : wclause.build();
			          expr = new SelectStatement.RawStatement(cf, params, sclause, where, limit, perPartitionLimit);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "selectStatement"



	// $ANTLR start "selectClause"
	// Parser.g:273:1: selectClause returns [List<RawSelector> expr] : (t1= selector ( ',' tN= selector )* | '\\*' );
	public final List<RawSelector> selectClause() throws RecognitionException {
		List<RawSelector> expr = null;


		RawSelector t1 =null;
		RawSelector tN =null;

		try {
			// Parser.g:274:5: (t1= selector ( ',' tN= selector )* | '\\*' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==IDENT||(LA11_0 >= K_AGGREGATE && LA11_0 <= K_ALL)||LA11_0==K_AS||LA11_0==K_ASCII||(LA11_0 >= K_BIGINT && LA11_0 <= K_BOOLEAN)||(LA11_0 >= K_CALLED && LA11_0 <= K_CLUSTERING)||(LA11_0 >= K_COMPACT && LA11_0 <= K_COUNTER)||(LA11_0 >= K_CUSTOM && LA11_0 <= K_DECIMAL)||(LA11_0 >= K_DISTINCT && LA11_0 <= K_DOUBLE)||(LA11_0 >= K_EXISTS && LA11_0 <= K_FLOAT)||LA11_0==K_FROZEN||(LA11_0 >= K_FUNCTION && LA11_0 <= K_FUNCTIONS)||LA11_0==K_INET||(LA11_0 >= K_INITCOND && LA11_0 <= K_INPUT)||LA11_0==K_INT||(LA11_0 >= K_JSON && LA11_0 <= K_KEYS)||(LA11_0 >= K_KEYSPACES && LA11_0 <= K_LIKE)||(LA11_0 >= K_LIST && LA11_0 <= K_MAP)||LA11_0==K_NOLOGIN||LA11_0==K_NOSUPERUSER||LA11_0==K_OPTIONS||(LA11_0 >= K_PARTITION && LA11_0 <= K_PERMISSIONS)||LA11_0==K_RETURNS||(LA11_0 >= K_ROLE && LA11_0 <= K_ROLES)||(LA11_0 >= K_SFUNC && LA11_0 <= K_TINYINT)||(LA11_0 >= K_TOKEN && LA11_0 <= K_TRIGGER)||(LA11_0 >= K_TTL && LA11_0 <= K_TYPE)||(LA11_0 >= K_USER && LA11_0 <= K_USERS)||(LA11_0 >= K_UUID && LA11_0 <= K_VARINT)||LA11_0==K_WRITETIME||(LA11_0 >= QMARK && LA11_0 <= QUOTED_NAME)) ) {
				alt11=1;
			}
			else if ( (LA11_0==191) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// Parser.g:274:7: t1= selector ( ',' tN= selector )*
					{
					pushFollow(FOLLOW_selector_in_selectClause1228);
					t1=selector();
					state._fsp--;

					 expr = new ArrayList<RawSelector>(); expr.add(t1); 
					// Parser.g:274:76: ( ',' tN= selector )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==180) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// Parser.g:274:77: ',' tN= selector
							{
							match(input,180,FOLLOW_180_in_selectClause1233); 
							pushFollow(FOLLOW_selector_in_selectClause1237);
							tN=selector();
							state._fsp--;

							 expr.add(tN); 
							}
							break;

						default :
							break loop10;
						}
					}

					}
					break;
				case 2 :
					// Parser.g:275:7: '\\*'
					{
					match(input,191,FOLLOW_191_in_selectClause1249); 
					 expr = Collections.<RawSelector>emptyList();
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "selectClause"



	// $ANTLR start "selector"
	// Parser.g:278:1: selector returns [RawSelector s] : us= unaliasedSelector ( K_AS c= noncol_ident )? ;
	public final RawSelector selector() throws RecognitionException {
		RawSelector s = null;


		Selectable.Raw us =null;
		ColumnIdentifier c =null;

		 ColumnIdentifier alias = null; 
		try {
			// Parser.g:280:5: (us= unaliasedSelector ( K_AS c= noncol_ident )? )
			// Parser.g:280:7: us= unaliasedSelector ( K_AS c= noncol_ident )?
			{
			pushFollow(FOLLOW_unaliasedSelector_in_selector1282);
			us=unaliasedSelector();
			state._fsp--;

			// Parser.g:280:28: ( K_AS c= noncol_ident )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==K_AS) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// Parser.g:280:29: K_AS c= noncol_ident
					{
					match(input,K_AS,FOLLOW_K_AS_in_selector1285); 
					pushFollow(FOLLOW_noncol_ident_in_selector1289);
					c=noncol_ident();
					state._fsp--;

					 alias = c; 
					}
					break;

			}

			 s = new RawSelector(us, alias); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selector"



	// $ANTLR start "unaliasedSelector"
	// Parser.g:283:1: unaliasedSelector returns [Selectable.Raw s] : (c= cident | K_COUNT '(' countArgument ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs ) ( '.' fi= cident )* ;
	public final Selectable.Raw unaliasedSelector() throws RecognitionException {
		Selectable.Raw s = null;


		ColumnIdentifier.Raw c =null;
		Selectable.Raw sn =null;
		CQL3Type t =null;
		FunctionName f =null;
		List<Selectable.Raw> args =null;
		ColumnIdentifier.Raw fi =null;

		 Selectable.Raw tmp = null; 
		try {
			// Parser.g:285:5: ( (c= cident | K_COUNT '(' countArgument ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs ) ( '.' fi= cident )* )
			// Parser.g:285:8: (c= cident | K_COUNT '(' countArgument ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs ) ( '.' fi= cident )*
			{
			// Parser.g:285:8: (c= cident | K_COUNT '(' countArgument ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs )
			int alt13=6;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// Parser.g:285:10: c= cident
					{
					pushFollow(FOLLOW_cident_in_unaliasedSelector1330);
					c=cident();
					state._fsp--;

					 tmp = c; 
					}
					break;
				case 2 :
					// Parser.g:286:10: K_COUNT '(' countArgument ')'
					{
					match(input,K_COUNT,FOLLOW_K_COUNT_in_unaliasedSelector1376); 
					match(input,177,FOLLOW_177_in_unaliasedSelector1378); 
					pushFollow(FOLLOW_countArgument_in_unaliasedSelector1380);
					countArgument();
					state._fsp--;

					match(input,178,FOLLOW_178_in_unaliasedSelector1382); 
					 tmp = Selectable.WithFunction.Raw.newCountRowsFunction();
					}
					break;
				case 3 :
					// Parser.g:287:10: K_WRITETIME '(' c= cident ')'
					{
					match(input,K_WRITETIME,FOLLOW_K_WRITETIME_in_unaliasedSelector1407); 
					match(input,177,FOLLOW_177_in_unaliasedSelector1409); 
					pushFollow(FOLLOW_cident_in_unaliasedSelector1413);
					c=cident();
					state._fsp--;

					match(input,178,FOLLOW_178_in_unaliasedSelector1415); 
					 tmp = new Selectable.WritetimeOrTTL.Raw(c, true); 
					}
					break;
				case 4 :
					// Parser.g:288:10: K_TTL '(' c= cident ')'
					{
					match(input,K_TTL,FOLLOW_K_TTL_in_unaliasedSelector1441); 
					match(input,177,FOLLOW_177_in_unaliasedSelector1449); 
					pushFollow(FOLLOW_cident_in_unaliasedSelector1453);
					c=cident();
					state._fsp--;

					match(input,178,FOLLOW_178_in_unaliasedSelector1455); 
					 tmp = new Selectable.WritetimeOrTTL.Raw(c, false); 
					}
					break;
				case 5 :
					// Parser.g:289:10: K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')'
					{
					match(input,K_CAST,FOLLOW_K_CAST_in_unaliasedSelector1481); 
					match(input,177,FOLLOW_177_in_unaliasedSelector1488); 
					pushFollow(FOLLOW_unaliasedSelector_in_unaliasedSelector1492);
					sn=unaliasedSelector();
					state._fsp--;

					match(input,K_AS,FOLLOW_K_AS_in_unaliasedSelector1494); 
					pushFollow(FOLLOW_native_type_in_unaliasedSelector1498);
					t=native_type();
					state._fsp--;

					match(input,178,FOLLOW_178_in_unaliasedSelector1500); 
					tmp = new Selectable.WithCast.Raw(sn, t);
					}
					break;
				case 6 :
					// Parser.g:290:10: f= functionName args= selectionFunctionArgs
					{
					pushFollow(FOLLOW_functionName_in_unaliasedSelector1515);
					f=functionName();
					state._fsp--;

					pushFollow(FOLLOW_selectionFunctionArgs_in_unaliasedSelector1519);
					args=selectionFunctionArgs();
					state._fsp--;

					 tmp = new Selectable.WithFunction.Raw(f, args); 
					}
					break;

			}

			// Parser.g:291:10: ( '.' fi= cident )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==182) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Parser.g:291:12: '.' fi= cident
					{
					match(input,182,FOLLOW_182_in_unaliasedSelector1534); 
					pushFollow(FOLLOW_cident_in_unaliasedSelector1538);
					fi=cident();
					state._fsp--;

					 tmp = new Selectable.WithFieldSelection.Raw(tmp, fi); 
					}
					break;

				default :
					break loop14;
				}
			}

			 s = tmp; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "unaliasedSelector"



	// $ANTLR start "selectionFunctionArgs"
	// Parser.g:294:1: selectionFunctionArgs returns [List<Selectable.Raw> a] : ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' );
	public final List<Selectable.Raw> selectionFunctionArgs() throws RecognitionException {
		List<Selectable.Raw> a = null;


		Selectable.Raw s1 =null;
		Selectable.Raw sn =null;

		try {
			// Parser.g:295:5: ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==177) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==178) ) {
					alt16=1;
				}
				else if ( (LA16_1==IDENT||(LA16_1 >= K_AGGREGATE && LA16_1 <= K_ALL)||LA16_1==K_AS||LA16_1==K_ASCII||(LA16_1 >= K_BIGINT && LA16_1 <= K_BOOLEAN)||(LA16_1 >= K_CALLED && LA16_1 <= K_CLUSTERING)||(LA16_1 >= K_COMPACT && LA16_1 <= K_COUNTER)||(LA16_1 >= K_CUSTOM && LA16_1 <= K_DECIMAL)||(LA16_1 >= K_DISTINCT && LA16_1 <= K_DOUBLE)||(LA16_1 >= K_EXISTS && LA16_1 <= K_FLOAT)||LA16_1==K_FROZEN||(LA16_1 >= K_FUNCTION && LA16_1 <= K_FUNCTIONS)||LA16_1==K_INET||(LA16_1 >= K_INITCOND && LA16_1 <= K_INPUT)||LA16_1==K_INT||(LA16_1 >= K_JSON && LA16_1 <= K_KEYS)||(LA16_1 >= K_KEYSPACES && LA16_1 <= K_LIKE)||(LA16_1 >= K_LIST && LA16_1 <= K_MAP)||LA16_1==K_NOLOGIN||LA16_1==K_NOSUPERUSER||LA16_1==K_OPTIONS||(LA16_1 >= K_PARTITION && LA16_1 <= K_PERMISSIONS)||LA16_1==K_RETURNS||(LA16_1 >= K_ROLE && LA16_1 <= K_ROLES)||(LA16_1 >= K_SFUNC && LA16_1 <= K_TINYINT)||(LA16_1 >= K_TOKEN && LA16_1 <= K_TRIGGER)||(LA16_1 >= K_TTL && LA16_1 <= K_TYPE)||(LA16_1 >= K_USER && LA16_1 <= K_USERS)||(LA16_1 >= K_UUID && LA16_1 <= K_VARINT)||LA16_1==K_WRITETIME||(LA16_1 >= QMARK && LA16_1 <= QUOTED_NAME)) ) {
					alt16=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// Parser.g:295:7: '(' ')'
					{
					match(input,177,FOLLOW_177_in_selectionFunctionArgs1566); 
					match(input,178,FOLLOW_178_in_selectionFunctionArgs1568); 
					 a = Collections.emptyList(); 
					}
					break;
				case 2 :
					// Parser.g:296:7: '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')'
					{
					match(input,177,FOLLOW_177_in_selectionFunctionArgs1578); 
					pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1582);
					s1=unaliasedSelector();
					state._fsp--;

					 List<Selectable.Raw> args = new ArrayList<Selectable.Raw>(); args.add(s1); 
					// Parser.g:297:11: ( ',' sn= unaliasedSelector )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==180) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// Parser.g:297:13: ',' sn= unaliasedSelector
							{
							match(input,180,FOLLOW_180_in_selectionFunctionArgs1598); 
							pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1602);
							sn=unaliasedSelector();
							state._fsp--;

							 args.add(sn); 
							}
							break;

						default :
							break loop15;
						}
					}

					match(input,178,FOLLOW_178_in_selectionFunctionArgs1615); 
					 a = args; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return a;
	}
	// $ANTLR end "selectionFunctionArgs"



	// $ANTLR start "countArgument"
	// Parser.g:301:1: countArgument : ( '\\*' |i= INTEGER );
	public final void countArgument() throws RecognitionException {
		Token i=null;

		try {
			// Parser.g:302:5: ( '\\*' |i= INTEGER )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==191) ) {
				alt17=1;
			}
			else if ( (LA17_0==INTEGER) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// Parser.g:302:7: '\\*'
					{
					match(input,191,FOLLOW_191_in_countArgument1634); 
					}
					break;
				case 2 :
					// Parser.g:303:7: i= INTEGER
					{
					i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_countArgument1644); 
					 if (!i.getText().equals("1")) addRecognitionError("Only COUNT(1) is supported, got COUNT(" + i.getText() + ")");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "countArgument"



	// $ANTLR start "whereClause"
	// Parser.g:306:1: whereClause returns [WhereClause.Builder clause] : relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )* ;
	public final WhereClause.Builder whereClause() throws RecognitionException {
		WhereClause.Builder clause = null;


		 clause = new WhereClause.Builder(); 
		try {
			// Parser.g:308:5: ( relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )* )
			// Parser.g:308:7: relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )*
			{
			pushFollow(FOLLOW_relationOrExpression_in_whereClause1675);
			relationOrExpression(clause);
			state._fsp--;

			// Parser.g:308:37: ( K_AND relationOrExpression[$clause] )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==K_AND) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// Parser.g:308:38: K_AND relationOrExpression[$clause]
					{
					match(input,K_AND,FOLLOW_K_AND_in_whereClause1679); 
					pushFollow(FOLLOW_relationOrExpression_in_whereClause1681);
					relationOrExpression(clause);
					state._fsp--;

					}
					break;

				default :
					break loop18;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return clause;
	}
	// $ANTLR end "whereClause"



	// $ANTLR start "relationOrExpression"
	// Parser.g:311:1: relationOrExpression[WhereClause.Builder clause] : ( relation[$clause] | customIndexExpression[$clause] );
	public final void relationOrExpression(WhereClause.Builder clause) throws RecognitionException {
		try {
			// Parser.g:312:5: ( relation[$clause] | customIndexExpression[$clause] )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==IDENT||(LA19_0 >= K_AGGREGATE && LA19_0 <= K_ALL)||LA19_0==K_AS||LA19_0==K_ASCII||(LA19_0 >= K_BIGINT && LA19_0 <= K_BOOLEAN)||(LA19_0 >= K_CALLED && LA19_0 <= K_CLUSTERING)||(LA19_0 >= K_COMPACT && LA19_0 <= K_COUNTER)||(LA19_0 >= K_CUSTOM && LA19_0 <= K_DECIMAL)||(LA19_0 >= K_DISTINCT && LA19_0 <= K_DOUBLE)||(LA19_0 >= K_EXISTS && LA19_0 <= K_FLOAT)||LA19_0==K_FROZEN||(LA19_0 >= K_FUNCTION && LA19_0 <= K_FUNCTIONS)||LA19_0==K_INET||(LA19_0 >= K_INITCOND && LA19_0 <= K_INPUT)||LA19_0==K_INT||(LA19_0 >= K_JSON && LA19_0 <= K_KEYS)||(LA19_0 >= K_KEYSPACES && LA19_0 <= K_LIKE)||(LA19_0 >= K_LIST && LA19_0 <= K_MAP)||LA19_0==K_NOLOGIN||LA19_0==K_NOSUPERUSER||LA19_0==K_OPTIONS||(LA19_0 >= K_PARTITION && LA19_0 <= K_PERMISSIONS)||LA19_0==K_RETURNS||(LA19_0 >= K_ROLE && LA19_0 <= K_ROLES)||(LA19_0 >= K_SFUNC && LA19_0 <= K_TINYINT)||(LA19_0 >= K_TOKEN && LA19_0 <= K_TRIGGER)||(LA19_0 >= K_TTL && LA19_0 <= K_TYPE)||(LA19_0 >= K_USER && LA19_0 <= K_USERS)||(LA19_0 >= K_UUID && LA19_0 <= K_VARINT)||LA19_0==K_WRITETIME||LA19_0==QUOTED_NAME||LA19_0==177) ) {
				alt19=1;
			}
			else if ( (LA19_0==193) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// Parser.g:312:7: relation[$clause]
					{
					pushFollow(FOLLOW_relation_in_relationOrExpression1703);
					relation(clause);
					state._fsp--;

					}
					break;
				case 2 :
					// Parser.g:313:7: customIndexExpression[$clause]
					{
					pushFollow(FOLLOW_customIndexExpression_in_relationOrExpression1712);
					customIndexExpression(clause);
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relationOrExpression"



	// $ANTLR start "customIndexExpression"
	// Parser.g:316:1: customIndexExpression[WhereClause.Builder clause] : 'expr(' idxName[name] ',' t= term ')' ;
	public final void customIndexExpression(WhereClause.Builder clause) throws RecognitionException {
		Term.Raw t =null;

		IndexName name = new IndexName();
		try {
			// Parser.g:318:5: ( 'expr(' idxName[name] ',' t= term ')' )
			// Parser.g:318:7: 'expr(' idxName[name] ',' t= term ')'
			{
			match(input,193,FOLLOW_193_in_customIndexExpression1740); 
			pushFollow(FOLLOW_idxName_in_customIndexExpression1742);
			idxName(name);
			state._fsp--;

			match(input,180,FOLLOW_180_in_customIndexExpression1745); 
			pushFollow(FOLLOW_term_in_customIndexExpression1749);
			t=term();
			state._fsp--;

			match(input,178,FOLLOW_178_in_customIndexExpression1751); 
			 clause.add(new CustomIndexExpression(name, t));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "customIndexExpression"



	// $ANTLR start "orderByClause"
	// Parser.g:321:1: orderByClause[Map<ColumnIdentifier.Raw, Boolean> orderings] : c= cident ( K_ASC | K_DESC )? ;
	public final void orderByClause(Map<ColumnIdentifier.Raw, Boolean> orderings) throws RecognitionException {
		ColumnIdentifier.Raw c =null;


		        boolean reversed = false;
		    
		try {
			// Parser.g:325:5: (c= cident ( K_ASC | K_DESC )? )
			// Parser.g:325:7: c= cident ( K_ASC | K_DESC )?
			{
			pushFollow(FOLLOW_cident_in_orderByClause1781);
			c=cident();
			state._fsp--;

			// Parser.g:325:16: ( K_ASC | K_DESC )?
			int alt20=3;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==K_ASC) ) {
				alt20=1;
			}
			else if ( (LA20_0==K_DESC) ) {
				alt20=2;
			}
			switch (alt20) {
				case 1 :
					// Parser.g:325:17: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_orderByClause1784); 
					}
					break;
				case 2 :
					// Parser.g:325:25: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_orderByClause1788); 
					 reversed = true; 
					}
					break;

			}

			 orderings.put(c, reversed); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "orderByClause"



	// $ANTLR start "insertStatement"
	// Parser.g:334:1: insertStatement returns [ModificationStatement.Parsed expr] : K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] ) ;
	public final ModificationStatement.Parsed insertStatement() throws RecognitionException {
		ModificationStatement.Parsed expr = null;


		CFName cf =null;
		UpdateStatement.ParsedInsert st1 =null;
		UpdateStatement.ParsedInsertJson st2 =null;

		try {
			// Parser.g:335:5: ( K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] ) )
			// Parser.g:335:7: K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] )
			{
			match(input,K_INSERT,FOLLOW_K_INSERT_in_insertStatement1817); 
			match(input,K_INTO,FOLLOW_K_INTO_in_insertStatement1819); 
			pushFollow(FOLLOW_columnFamilyName_in_insertStatement1823);
			cf=columnFamilyName();
			state._fsp--;

			// Parser.g:336:9: (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==177) ) {
				alt21=1;
			}
			else if ( (LA21_0==K_JSON) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// Parser.g:336:11: st1= normalInsertStatement[cf]
					{
					pushFollow(FOLLOW_normalInsertStatement_in_insertStatement1837);
					st1=normalInsertStatement(cf);
					state._fsp--;

					 expr = st1; 
					}
					break;
				case 2 :
					// Parser.g:337:11: K_JSON st2= jsonInsertStatement[cf]
					{
					match(input,K_JSON,FOLLOW_K_JSON_in_insertStatement1852); 
					pushFollow(FOLLOW_jsonInsertStatement_in_insertStatement1856);
					st2=jsonInsertStatement(cf);
					state._fsp--;

					 expr = st2; 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "insertStatement"



	// $ANTLR start "normalInsertStatement"
	// Parser.g:340:1: normalInsertStatement[CFName cf] returns [UpdateStatement.ParsedInsert expr] : '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
	public final UpdateStatement.ParsedInsert normalInsertStatement(CFName cf) throws RecognitionException {
		UpdateStatement.ParsedInsert expr = null;


		ColumnIdentifier.Raw c1 =null;
		ColumnIdentifier.Raw cn =null;
		Term.Raw v1 =null;
		Term.Raw vn =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<ColumnIdentifier.Raw> columnNames  = new ArrayList<ColumnIdentifier.Raw>();
		        List<Term.Raw> values = new ArrayList<Term.Raw>();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:347:5: ( '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
			// Parser.g:347:7: '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
			{
			match(input,177,FOLLOW_177_in_normalInsertStatement1892); 
			pushFollow(FOLLOW_cident_in_normalInsertStatement1896);
			c1=cident();
			state._fsp--;

			 columnNames.add(c1); 
			// Parser.g:347:47: ( ',' cn= cident )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==180) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// Parser.g:347:49: ',' cn= cident
					{
					match(input,180,FOLLOW_180_in_normalInsertStatement1903); 
					pushFollow(FOLLOW_cident_in_normalInsertStatement1907);
					cn=cident();
					state._fsp--;

					 columnNames.add(cn); 
					}
					break;

				default :
					break loop22;
				}
			}

			match(input,178,FOLLOW_178_in_normalInsertStatement1914); 
			match(input,K_VALUES,FOLLOW_K_VALUES_in_normalInsertStatement1922); 
			match(input,177,FOLLOW_177_in_normalInsertStatement1930); 
			pushFollow(FOLLOW_term_in_normalInsertStatement1934);
			v1=term();
			state._fsp--;

			 values.add(v1); 
			// Parser.g:349:39: ( ',' vn= term )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==180) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// Parser.g:349:41: ',' vn= term
					{
					match(input,180,FOLLOW_180_in_normalInsertStatement1940); 
					pushFollow(FOLLOW_term_in_normalInsertStatement1944);
					vn=term();
					state._fsp--;

					 values.add(vn); 
					}
					break;

				default :
					break loop23;
				}
			}

			match(input,178,FOLLOW_178_in_normalInsertStatement1951); 
			// Parser.g:350:7: ( K_IF K_NOT K_EXISTS )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==K_IF) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Parser.g:350:9: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_normalInsertStatement1961); 
					match(input,K_NOT,FOLLOW_K_NOT_in_normalInsertStatement1963); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_normalInsertStatement1965); 
					 ifNotExists = true; 
					}
					break;

			}

			// Parser.g:351:7: ( usingClause[attrs] )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==K_USING) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Parser.g:351:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_normalInsertStatement1980);
					usingClause(attrs);
					state._fsp--;

					}
					break;

			}


			          expr = new UpdateStatement.ParsedInsert(cf, attrs, columnNames, values, ifNotExists);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "normalInsertStatement"



	// $ANTLR start "jsonInsertStatement"
	// Parser.g:357:1: jsonInsertStatement[CFName cf] returns [UpdateStatement.ParsedInsertJson expr] : val= jsonValue ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
	public final UpdateStatement.ParsedInsertJson jsonInsertStatement(CFName cf) throws RecognitionException {
		UpdateStatement.ParsedInsertJson expr = null;


		Json.Raw val =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:362:5: (val= jsonValue ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
			// Parser.g:362:7: val= jsonValue ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
			{
			pushFollow(FOLLOW_jsonValue_in_jsonInsertStatement2026);
			val=jsonValue();
			state._fsp--;

			// Parser.g:363:7: ( K_IF K_NOT K_EXISTS )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==K_IF) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// Parser.g:363:9: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_jsonInsertStatement2036); 
					match(input,K_NOT,FOLLOW_K_NOT_in_jsonInsertStatement2038); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_jsonInsertStatement2040); 
					 ifNotExists = true; 
					}
					break;

			}

			// Parser.g:364:7: ( usingClause[attrs] )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==K_USING) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// Parser.g:364:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_jsonInsertStatement2055);
					usingClause(attrs);
					state._fsp--;

					}
					break;

			}


			          expr = new UpdateStatement.ParsedInsertJson(cf, attrs, val, ifNotExists);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "jsonInsertStatement"



	// $ANTLR start "jsonValue"
	// Parser.g:370:1: jsonValue returns [Json.Raw value] : (|s= STRING_LITERAL | ':' id= noncol_ident | QMARK );
	public final Json.Raw jsonValue() throws RecognitionException {
		Json.Raw value = null;


		Token s=null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:371:5: (|s= STRING_LITERAL | ':' id= noncol_ident | QMARK )
			int alt28=4;
			switch ( input.LA(1) ) {
			case EOF:
			case K_APPLY:
			case K_DELETE:
			case K_IF:
			case K_INSERT:
			case K_UPDATE:
			case K_USING:
			case 184:
				{
				alt28=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt28=2;
				}
				break;
			case 183:
				{
				alt28=3;
				}
				break;
			case QMARK:
				{
				alt28=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// Parser.g:372:5: 
					{
					}
					break;
				case 2 :
					// Parser.g:372:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_jsonValue2096); 
					 value = new Json.Literal((s!=null?s.getText():null)); 
					}
					break;
				case 3 :
					// Parser.g:373:7: ':' id= noncol_ident
					{
					match(input,183,FOLLOW_183_in_jsonValue2106); 
					pushFollow(FOLLOW_noncol_ident_in_jsonValue2110);
					id=noncol_ident();
					state._fsp--;

					 value = newJsonBindVariables(id); 
					}
					break;
				case 4 :
					// Parser.g:374:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_jsonValue2124); 
					 value = newJsonBindVariables(null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "jsonValue"



	// $ANTLR start "usingClause"
	// Parser.g:377:1: usingClause[Attributes.Raw attrs] : K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* ;
	public final void usingClause(Attributes.Raw attrs) throws RecognitionException {
		try {
			// Parser.g:378:5: ( K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* )
			// Parser.g:378:7: K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )*
			{
			match(input,K_USING,FOLLOW_K_USING_in_usingClause2155); 
			pushFollow(FOLLOW_usingClauseObjective_in_usingClause2157);
			usingClauseObjective(attrs);
			state._fsp--;

			// Parser.g:378:43: ( K_AND usingClauseObjective[attrs] )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==K_AND) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// Parser.g:378:45: K_AND usingClauseObjective[attrs]
					{
					match(input,K_AND,FOLLOW_K_AND_in_usingClause2162); 
					pushFollow(FOLLOW_usingClauseObjective_in_usingClause2164);
					usingClauseObjective(attrs);
					state._fsp--;

					}
					break;

				default :
					break loop29;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClause"



	// $ANTLR start "usingClauseObjective"
	// Parser.g:381:1: usingClauseObjective[Attributes.Raw attrs] : ( K_TIMESTAMP ts= intValue | K_TTL t= intValue );
	public final void usingClauseObjective(Attributes.Raw attrs) throws RecognitionException {
		Term.Raw ts =null;
		Term.Raw t =null;

		try {
			// Parser.g:382:5: ( K_TIMESTAMP ts= intValue | K_TTL t= intValue )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==K_TIMESTAMP) ) {
				alt30=1;
			}
			else if ( (LA30_0==K_TTL) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// Parser.g:382:7: K_TIMESTAMP ts= intValue
					{
					match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseObjective2186); 
					pushFollow(FOLLOW_intValue_in_usingClauseObjective2190);
					ts=intValue();
					state._fsp--;

					 attrs.timestamp = ts; 
					}
					break;
				case 2 :
					// Parser.g:383:7: K_TTL t= intValue
					{
					match(input,K_TTL,FOLLOW_K_TTL_in_usingClauseObjective2200); 
					pushFollow(FOLLOW_intValue_in_usingClauseObjective2204);
					t=intValue();
					state._fsp--;

					 attrs.timeToLive = t; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClauseObjective"



	// $ANTLR start "updateStatement"
	// Parser.g:393:1: updateStatement returns [UpdateStatement.ParsedUpdate expr] : K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? ;
	public final UpdateStatement.ParsedUpdate updateStatement() throws RecognitionException {
		UpdateStatement.ParsedUpdate expr = null;


		CFName cf =null;
		WhereClause.Builder wclause =null;
		List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations = new ArrayList<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>>();
		        boolean ifExists = false;
		    
		try {
			// Parser.g:399:5: ( K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? )
			// Parser.g:399:7: K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			{
			match(input,K_UPDATE,FOLLOW_K_UPDATE_in_updateStatement2238); 
			pushFollow(FOLLOW_columnFamilyName_in_updateStatement2242);
			cf=columnFamilyName();
			state._fsp--;

			// Parser.g:400:7: ( usingClause[attrs] )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==K_USING) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// Parser.g:400:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_updateStatement2252);
					usingClause(attrs);
					state._fsp--;

					}
					break;

			}

			match(input,K_SET,FOLLOW_K_SET_in_updateStatement2264); 
			pushFollow(FOLLOW_columnOperation_in_updateStatement2266);
			columnOperation(operations);
			state._fsp--;

			// Parser.g:401:41: ( ',' columnOperation[operations] )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==180) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// Parser.g:401:42: ',' columnOperation[operations]
					{
					match(input,180,FOLLOW_180_in_updateStatement2270); 
					pushFollow(FOLLOW_columnOperation_in_updateStatement2272);
					columnOperation(operations);
					state._fsp--;

					}
					break;

				default :
					break loop32;
				}
			}

			match(input,K_WHERE,FOLLOW_K_WHERE_in_updateStatement2283); 
			pushFollow(FOLLOW_whereClause_in_updateStatement2287);
			wclause=whereClause();
			state._fsp--;

			// Parser.g:403:7: ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==K_IF) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// Parser.g:403:9: K_IF ( K_EXISTS |conditions= updateConditions )
					{
					match(input,K_IF,FOLLOW_K_IF_in_updateStatement2297); 
					// Parser.g:403:14: ( K_EXISTS |conditions= updateConditions )
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==K_EXISTS) ) {
						int LA33_1 = input.LA(2);
						if ( (LA33_1==EOF||LA33_1==K_APPLY||LA33_1==K_DELETE||LA33_1==K_INSERT||LA33_1==K_UPDATE||LA33_1==184) ) {
							alt33=1;
						}
						else if ( (LA33_1==K_IN||LA33_1==176||LA33_1==182||(LA33_1 >= 185 && LA33_1 <= 190)) ) {
							alt33=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 33, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA33_0==IDENT||(LA33_0 >= K_AGGREGATE && LA33_0 <= K_ALL)||LA33_0==K_AS||LA33_0==K_ASCII||(LA33_0 >= K_BIGINT && LA33_0 <= K_BOOLEAN)||(LA33_0 >= K_CALLED && LA33_0 <= K_CLUSTERING)||(LA33_0 >= K_COMPACT && LA33_0 <= K_COUNTER)||(LA33_0 >= K_CUSTOM && LA33_0 <= K_DECIMAL)||(LA33_0 >= K_DISTINCT && LA33_0 <= K_DOUBLE)||(LA33_0 >= K_FILTERING && LA33_0 <= K_FLOAT)||LA33_0==K_FROZEN||(LA33_0 >= K_FUNCTION && LA33_0 <= K_FUNCTIONS)||LA33_0==K_INET||(LA33_0 >= K_INITCOND && LA33_0 <= K_INPUT)||LA33_0==K_INT||(LA33_0 >= K_JSON && LA33_0 <= K_KEYS)||(LA33_0 >= K_KEYSPACES && LA33_0 <= K_LIKE)||(LA33_0 >= K_LIST && LA33_0 <= K_MAP)||LA33_0==K_NOLOGIN||LA33_0==K_NOSUPERUSER||LA33_0==K_OPTIONS||(LA33_0 >= K_PARTITION && LA33_0 <= K_PERMISSIONS)||LA33_0==K_RETURNS||(LA33_0 >= K_ROLE && LA33_0 <= K_ROLES)||(LA33_0 >= K_SFUNC && LA33_0 <= K_TINYINT)||LA33_0==K_TRIGGER||(LA33_0 >= K_TTL && LA33_0 <= K_TYPE)||(LA33_0 >= K_USER && LA33_0 <= K_USERS)||(LA33_0 >= K_UUID && LA33_0 <= K_VARINT)||LA33_0==K_WRITETIME||LA33_0==QUOTED_NAME) ) {
						alt33=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}

					switch (alt33) {
						case 1 :
							// Parser.g:403:16: K_EXISTS
							{
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_updateStatement2301); 
							 ifExists = true; 
							}
							break;
						case 2 :
							// Parser.g:403:48: conditions= updateConditions
							{
							pushFollow(FOLLOW_updateConditions_in_updateStatement2309);
							conditions=updateConditions();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}


			          return new UpdateStatement.ParsedUpdate(cf,
			                                                  attrs,
			                                                  operations,
			                                                  wclause.build(),
			                                                  conditions == null ? Collections.<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>>emptyList() : conditions,
			                                                  ifExists);
			     
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "updateStatement"



	// $ANTLR start "updateConditions"
	// Parser.g:414:1: updateConditions returns [List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions] : columnCondition[conditions] ( K_AND columnCondition[conditions] )* ;
	public final List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> updateConditions() throws RecognitionException {
		List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions = null;


		 conditions = new ArrayList<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>>(); 
		try {
			// Parser.g:416:5: ( columnCondition[conditions] ( K_AND columnCondition[conditions] )* )
			// Parser.g:416:7: columnCondition[conditions] ( K_AND columnCondition[conditions] )*
			{
			pushFollow(FOLLOW_columnCondition_in_updateConditions2351);
			columnCondition(conditions);
			state._fsp--;

			// Parser.g:416:35: ( K_AND columnCondition[conditions] )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==K_AND) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// Parser.g:416:37: K_AND columnCondition[conditions]
					{
					match(input,K_AND,FOLLOW_K_AND_in_updateConditions2356); 
					pushFollow(FOLLOW_columnCondition_in_updateConditions2358);
					columnCondition(conditions);
					state._fsp--;

					}
					break;

				default :
					break loop35;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return conditions;
	}
	// $ANTLR end "updateConditions"



	// $ANTLR start "deleteStatement"
	// Parser.g:427:1: deleteStatement returns [DeleteStatement.Parsed expr] : K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? ;
	public final DeleteStatement.Parsed deleteStatement() throws RecognitionException {
		DeleteStatement.Parsed expr = null;


		List<Operation.RawDeletion> dels =null;
		CFName cf =null;
		WhereClause.Builder wclause =null;
		List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<Operation.RawDeletion> columnDeletions = Collections.emptyList();
		        boolean ifExists = false;
		    
		try {
			// Parser.g:433:5: ( K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? )
			// Parser.g:433:7: K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			{
			match(input,K_DELETE,FOLLOW_K_DELETE_in_deleteStatement2395); 
			// Parser.g:433:16: (dels= deleteSelection )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==IDENT||(LA36_0 >= K_AGGREGATE && LA36_0 <= K_ALL)||LA36_0==K_AS||LA36_0==K_ASCII||(LA36_0 >= K_BIGINT && LA36_0 <= K_BOOLEAN)||(LA36_0 >= K_CALLED && LA36_0 <= K_CLUSTERING)||(LA36_0 >= K_COMPACT && LA36_0 <= K_COUNTER)||(LA36_0 >= K_CUSTOM && LA36_0 <= K_DECIMAL)||(LA36_0 >= K_DISTINCT && LA36_0 <= K_DOUBLE)||(LA36_0 >= K_EXISTS && LA36_0 <= K_FLOAT)||LA36_0==K_FROZEN||(LA36_0 >= K_FUNCTION && LA36_0 <= K_FUNCTIONS)||LA36_0==K_INET||(LA36_0 >= K_INITCOND && LA36_0 <= K_INPUT)||LA36_0==K_INT||(LA36_0 >= K_JSON && LA36_0 <= K_KEYS)||(LA36_0 >= K_KEYSPACES && LA36_0 <= K_LIKE)||(LA36_0 >= K_LIST && LA36_0 <= K_MAP)||LA36_0==K_NOLOGIN||LA36_0==K_NOSUPERUSER||LA36_0==K_OPTIONS||(LA36_0 >= K_PARTITION && LA36_0 <= K_PERMISSIONS)||LA36_0==K_RETURNS||(LA36_0 >= K_ROLE && LA36_0 <= K_ROLES)||(LA36_0 >= K_SFUNC && LA36_0 <= K_TINYINT)||LA36_0==K_TRIGGER||(LA36_0 >= K_TTL && LA36_0 <= K_TYPE)||(LA36_0 >= K_USER && LA36_0 <= K_USERS)||(LA36_0 >= K_UUID && LA36_0 <= K_VARINT)||LA36_0==K_WRITETIME||LA36_0==QUOTED_NAME) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// Parser.g:433:18: dels= deleteSelection
					{
					pushFollow(FOLLOW_deleteSelection_in_deleteStatement2401);
					dels=deleteSelection();
					state._fsp--;

					 columnDeletions = dels; 
					}
					break;

			}

			match(input,K_FROM,FOLLOW_K_FROM_in_deleteStatement2414); 
			pushFollow(FOLLOW_columnFamilyName_in_deleteStatement2418);
			cf=columnFamilyName();
			state._fsp--;

			// Parser.g:435:7: ( usingClauseDelete[attrs] )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==K_USING) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// Parser.g:435:9: usingClauseDelete[attrs]
					{
					pushFollow(FOLLOW_usingClauseDelete_in_deleteStatement2428);
					usingClauseDelete(attrs);
					state._fsp--;

					}
					break;

			}

			match(input,K_WHERE,FOLLOW_K_WHERE_in_deleteStatement2440); 
			pushFollow(FOLLOW_whereClause_in_deleteStatement2444);
			wclause=whereClause();
			state._fsp--;

			// Parser.g:437:7: ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==K_IF) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// Parser.g:437:9: K_IF ( K_EXISTS |conditions= updateConditions )
					{
					match(input,K_IF,FOLLOW_K_IF_in_deleteStatement2454); 
					// Parser.g:437:14: ( K_EXISTS |conditions= updateConditions )
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==K_EXISTS) ) {
						int LA38_1 = input.LA(2);
						if ( (LA38_1==EOF||LA38_1==K_APPLY||LA38_1==K_DELETE||LA38_1==K_INSERT||LA38_1==K_UPDATE||LA38_1==184) ) {
							alt38=1;
						}
						else if ( (LA38_1==K_IN||LA38_1==176||LA38_1==182||(LA38_1 >= 185 && LA38_1 <= 190)) ) {
							alt38=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 38, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA38_0==IDENT||(LA38_0 >= K_AGGREGATE && LA38_0 <= K_ALL)||LA38_0==K_AS||LA38_0==K_ASCII||(LA38_0 >= K_BIGINT && LA38_0 <= K_BOOLEAN)||(LA38_0 >= K_CALLED && LA38_0 <= K_CLUSTERING)||(LA38_0 >= K_COMPACT && LA38_0 <= K_COUNTER)||(LA38_0 >= K_CUSTOM && LA38_0 <= K_DECIMAL)||(LA38_0 >= K_DISTINCT && LA38_0 <= K_DOUBLE)||(LA38_0 >= K_FILTERING && LA38_0 <= K_FLOAT)||LA38_0==K_FROZEN||(LA38_0 >= K_FUNCTION && LA38_0 <= K_FUNCTIONS)||LA38_0==K_INET||(LA38_0 >= K_INITCOND && LA38_0 <= K_INPUT)||LA38_0==K_INT||(LA38_0 >= K_JSON && LA38_0 <= K_KEYS)||(LA38_0 >= K_KEYSPACES && LA38_0 <= K_LIKE)||(LA38_0 >= K_LIST && LA38_0 <= K_MAP)||LA38_0==K_NOLOGIN||LA38_0==K_NOSUPERUSER||LA38_0==K_OPTIONS||(LA38_0 >= K_PARTITION && LA38_0 <= K_PERMISSIONS)||LA38_0==K_RETURNS||(LA38_0 >= K_ROLE && LA38_0 <= K_ROLES)||(LA38_0 >= K_SFUNC && LA38_0 <= K_TINYINT)||LA38_0==K_TRIGGER||(LA38_0 >= K_TTL && LA38_0 <= K_TYPE)||(LA38_0 >= K_USER && LA38_0 <= K_USERS)||(LA38_0 >= K_UUID && LA38_0 <= K_VARINT)||LA38_0==K_WRITETIME||LA38_0==QUOTED_NAME) ) {
						alt38=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 38, 0, input);
						throw nvae;
					}

					switch (alt38) {
						case 1 :
							// Parser.g:437:16: K_EXISTS
							{
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_deleteStatement2458); 
							 ifExists = true; 
							}
							break;
						case 2 :
							// Parser.g:437:48: conditions= updateConditions
							{
							pushFollow(FOLLOW_updateConditions_in_deleteStatement2466);
							conditions=updateConditions();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}


			          return new DeleteStatement.Parsed(cf,
			                                            attrs,
			                                            columnDeletions,
			                                            wclause.build(),
			                                            conditions == null ? Collections.<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>>emptyList() : conditions,
			                                            ifExists);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "deleteStatement"



	// $ANTLR start "deleteSelection"
	// Parser.g:448:1: deleteSelection returns [List<Operation.RawDeletion> operations] :t1= deleteOp ( ',' tN= deleteOp )* ;
	public final List<Operation.RawDeletion> deleteSelection() throws RecognitionException {
		List<Operation.RawDeletion> operations = null;


		Operation.RawDeletion t1 =null;
		Operation.RawDeletion tN =null;

		try {
			// Parser.g:449:5: (t1= deleteOp ( ',' tN= deleteOp )* )
			// Parser.g:449:7: t1= deleteOp ( ',' tN= deleteOp )*
			{
			 operations = new ArrayList<Operation.RawDeletion>(); 
			pushFollow(FOLLOW_deleteOp_in_deleteSelection2513);
			t1=deleteOp();
			state._fsp--;

			 operations.add(t1); 
			// Parser.g:451:11: ( ',' tN= deleteOp )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==180) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// Parser.g:451:12: ',' tN= deleteOp
					{
					match(input,180,FOLLOW_180_in_deleteSelection2528); 
					pushFollow(FOLLOW_deleteOp_in_deleteSelection2532);
					tN=deleteOp();
					state._fsp--;

					 operations.add(tN); 
					}
					break;

				default :
					break loop40;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "deleteSelection"



	// $ANTLR start "deleteOp"
	// Parser.g:454:1: deleteOp returns [Operation.RawDeletion op] : (c= cident |c= cident '[' t= term ']' |c= cident '.' field= cident );
	public final Operation.RawDeletion deleteOp() throws RecognitionException {
		Operation.RawDeletion op = null;


		ColumnIdentifier.Raw c =null;
		Term.Raw t =null;
		ColumnIdentifier.Raw field =null;

		try {
			// Parser.g:455:5: (c= cident |c= cident '[' t= term ']' |c= cident '.' field= cident )
			int alt41=3;
			alt41 = dfa41.predict(input);
			switch (alt41) {
				case 1 :
					// Parser.g:455:7: c= cident
					{
					pushFollow(FOLLOW_cident_in_deleteOp2559);
					c=cident();
					state._fsp--;

					 op = new Operation.ColumnDeletion(c); 
					}
					break;
				case 2 :
					// Parser.g:456:7: c= cident '[' t= term ']'
					{
					pushFollow(FOLLOW_cident_in_deleteOp2586);
					c=cident();
					state._fsp--;

					match(input,190,FOLLOW_190_in_deleteOp2588); 
					pushFollow(FOLLOW_term_in_deleteOp2592);
					t=term();
					state._fsp--;

					match(input,192,FOLLOW_192_in_deleteOp2594); 
					 op = new Operation.ElementDeletion(c, t); 
					}
					break;
				case 3 :
					// Parser.g:457:7: c= cident '.' field= cident
					{
					pushFollow(FOLLOW_cident_in_deleteOp2606);
					c=cident();
					state._fsp--;

					match(input,182,FOLLOW_182_in_deleteOp2608); 
					pushFollow(FOLLOW_cident_in_deleteOp2612);
					field=cident();
					state._fsp--;

					 op = new Operation.FieldDeletion(c, field); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "deleteOp"



	// $ANTLR start "usingClauseDelete"
	// Parser.g:460:1: usingClauseDelete[Attributes.Raw attrs] : K_USING K_TIMESTAMP ts= intValue ;
	public final void usingClauseDelete(Attributes.Raw attrs) throws RecognitionException {
		Term.Raw ts =null;

		try {
			// Parser.g:461:5: ( K_USING K_TIMESTAMP ts= intValue )
			// Parser.g:461:7: K_USING K_TIMESTAMP ts= intValue
			{
			match(input,K_USING,FOLLOW_K_USING_in_usingClauseDelete2632); 
			match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseDelete2634); 
			pushFollow(FOLLOW_intValue_in_usingClauseDelete2638);
			ts=intValue();
			state._fsp--;

			 attrs.timestamp = ts; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClauseDelete"



	// $ANTLR start "batchStatement"
	// Parser.g:488:1: batchStatement returns [BatchStatement.Parsed expr] : K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH ;
	public final BatchStatement.Parsed batchStatement() throws RecognitionException {
		BatchStatement.Parsed expr = null;


		ModificationStatement.Parsed s =null;


		        BatchStatement.Type type = BatchStatement.Type.LOGGED;
		        List<ModificationStatement.Parsed> statements = new ArrayList<ModificationStatement.Parsed>();
		        Attributes.Raw attrs = new Attributes.Raw();
		    
		try {
			// Parser.g:494:5: ( K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH )
			// Parser.g:494:7: K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH
			{
			match(input,K_BEGIN,FOLLOW_K_BEGIN_in_batchStatement2672); 
			// Parser.g:495:7: ( K_UNLOGGED | K_COUNTER )?
			int alt42=3;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==K_UNLOGGED) ) {
				alt42=1;
			}
			else if ( (LA42_0==K_COUNTER) ) {
				alt42=2;
			}
			switch (alt42) {
				case 1 :
					// Parser.g:495:9: K_UNLOGGED
					{
					match(input,K_UNLOGGED,FOLLOW_K_UNLOGGED_in_batchStatement2682); 
					 type = BatchStatement.Type.UNLOGGED; 
					}
					break;
				case 2 :
					// Parser.g:495:63: K_COUNTER
					{
					match(input,K_COUNTER,FOLLOW_K_COUNTER_in_batchStatement2688); 
					 type = BatchStatement.Type.COUNTER; 
					}
					break;

			}

			match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement2701); 
			// Parser.g:496:15: ( usingClause[attrs] )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==K_USING) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// Parser.g:496:17: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_batchStatement2705);
					usingClause(attrs);
					state._fsp--;

					}
					break;

			}

			// Parser.g:497:11: (s= batchStatementObjective ( ';' )? )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==K_DELETE||LA45_0==K_INSERT||LA45_0==K_UPDATE) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// Parser.g:497:13: s= batchStatementObjective ( ';' )?
					{
					pushFollow(FOLLOW_batchStatementObjective_in_batchStatement2725);
					s=batchStatementObjective();
					state._fsp--;

					// Parser.g:497:39: ( ';' )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==184) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// Parser.g:497:39: ';'
							{
							match(input,184,FOLLOW_184_in_batchStatement2727); 
							}
							break;

					}

					 statements.add(s); 
					}
					break;

				default :
					break loop45;
				}
			}

			match(input,K_APPLY,FOLLOW_K_APPLY_in_batchStatement2741); 
			match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement2743); 

			          return new BatchStatement.Parsed(type, attrs, statements);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "batchStatement"



	// $ANTLR start "batchStatementObjective"
	// Parser.g:504:1: batchStatementObjective returns [ModificationStatement.Parsed statement] : (i= insertStatement |u= updateStatement |d= deleteStatement );
	public final ModificationStatement.Parsed batchStatementObjective() throws RecognitionException {
		ModificationStatement.Parsed statement = null;


		ModificationStatement.Parsed i =null;
		UpdateStatement.ParsedUpdate u =null;
		DeleteStatement.Parsed d =null;

		try {
			// Parser.g:505:5: (i= insertStatement |u= updateStatement |d= deleteStatement )
			int alt46=3;
			switch ( input.LA(1) ) {
			case K_INSERT:
				{
				alt46=1;
				}
				break;
			case K_UPDATE:
				{
				alt46=2;
				}
				break;
			case K_DELETE:
				{
				alt46=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// Parser.g:505:7: i= insertStatement
					{
					pushFollow(FOLLOW_insertStatement_in_batchStatementObjective2774);
					i=insertStatement();
					state._fsp--;

					 statement = i; 
					}
					break;
				case 2 :
					// Parser.g:506:7: u= updateStatement
					{
					pushFollow(FOLLOW_updateStatement_in_batchStatementObjective2787);
					u=updateStatement();
					state._fsp--;

					 statement = u; 
					}
					break;
				case 3 :
					// Parser.g:507:7: d= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_batchStatementObjective2800);
					d=deleteStatement();
					state._fsp--;

					 statement = d; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return statement;
	}
	// $ANTLR end "batchStatementObjective"



	// $ANTLR start "createAggregateStatement"
	// Parser.g:510:1: createAggregateStatement returns [CreateAggregateStatement expr] : K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )? ;
	public final CreateAggregateStatement createAggregateStatement() throws RecognitionException {
		CreateAggregateStatement expr = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;
		String sfunc =null;
		CQL3Type.Raw stype =null;
		String ffunc =null;
		Term.Raw ival =null;


		        boolean orReplace = false;
		        boolean ifNotExists = false;

		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		    
		try {
			// Parser.g:517:5: ( K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )? )
			// Parser.g:517:7: K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createAggregateStatement2833); 
			// Parser.g:517:16: ( K_OR K_REPLACE )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==K_OR) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// Parser.g:517:17: K_OR K_REPLACE
					{
					match(input,K_OR,FOLLOW_K_OR_in_createAggregateStatement2836); 
					match(input,K_REPLACE,FOLLOW_K_REPLACE_in_createAggregateStatement2838); 
					 orReplace = true; 
					}
					break;

			}

			match(input,K_AGGREGATE,FOLLOW_K_AGGREGATE_in_createAggregateStatement2850); 
			// Parser.g:519:7: ( K_IF K_NOT K_EXISTS )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==K_IF) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// Parser.g:519:8: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createAggregateStatement2859); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createAggregateStatement2861); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createAggregateStatement2863); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_createAggregateStatement2877);
			fn=functionName();
			state._fsp--;

			match(input,177,FOLLOW_177_in_createAggregateStatement2885); 
			// Parser.g:522:9: (v= comparatorType ( ',' v= comparatorType )* )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==IDENT||(LA50_0 >= K_AGGREGATE && LA50_0 <= K_ALL)||LA50_0==K_AS||LA50_0==K_ASCII||(LA50_0 >= K_BIGINT && LA50_0 <= K_BOOLEAN)||(LA50_0 >= K_CALLED && LA50_0 <= K_CLUSTERING)||(LA50_0 >= K_COMPACT && LA50_0 <= K_COUNTER)||(LA50_0 >= K_CUSTOM && LA50_0 <= K_DECIMAL)||(LA50_0 >= K_DISTINCT && LA50_0 <= K_DOUBLE)||(LA50_0 >= K_EXISTS && LA50_0 <= K_FLOAT)||LA50_0==K_FROZEN||(LA50_0 >= K_FUNCTION && LA50_0 <= K_FUNCTIONS)||LA50_0==K_INET||(LA50_0 >= K_INITCOND && LA50_0 <= K_INPUT)||LA50_0==K_INT||(LA50_0 >= K_JSON && LA50_0 <= K_KEYS)||(LA50_0 >= K_KEYSPACES && LA50_0 <= K_LIKE)||(LA50_0 >= K_LIST && LA50_0 <= K_MAP)||LA50_0==K_NOLOGIN||LA50_0==K_NOSUPERUSER||LA50_0==K_OPTIONS||(LA50_0 >= K_PARTITION && LA50_0 <= K_PERMISSIONS)||LA50_0==K_RETURNS||(LA50_0 >= K_ROLE && LA50_0 <= K_ROLES)||(LA50_0 >= K_SET && LA50_0 <= K_TINYINT)||LA50_0==K_TRIGGER||(LA50_0 >= K_TTL && LA50_0 <= K_TYPE)||(LA50_0 >= K_USER && LA50_0 <= K_USERS)||(LA50_0 >= K_UUID && LA50_0 <= K_VARINT)||LA50_0==K_WRITETIME||LA50_0==QUOTED_NAME||LA50_0==STRING_LITERAL) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// Parser.g:523:11: v= comparatorType ( ',' v= comparatorType )*
					{
					pushFollow(FOLLOW_comparatorType_in_createAggregateStatement2909);
					v=comparatorType();
					state._fsp--;

					 argsTypes.add(v); 
					// Parser.g:524:11: ( ',' v= comparatorType )*
					loop49:
					while (true) {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==180) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// Parser.g:524:13: ',' v= comparatorType
							{
							match(input,180,FOLLOW_180_in_createAggregateStatement2925); 
							pushFollow(FOLLOW_comparatorType_in_createAggregateStatement2929);
							v=comparatorType();
							state._fsp--;

							 argsTypes.add(v); 
							}
							break;

						default :
							break loop49;
						}
					}

					}
					break;

			}

			match(input,178,FOLLOW_178_in_createAggregateStatement2953); 
			match(input,K_SFUNC,FOLLOW_K_SFUNC_in_createAggregateStatement2961); 
			pushFollow(FOLLOW_allowedFunctionName_in_createAggregateStatement2967);
			sfunc=allowedFunctionName();
			state._fsp--;

			match(input,K_STYPE,FOLLOW_K_STYPE_in_createAggregateStatement2975); 
			pushFollow(FOLLOW_comparatorType_in_createAggregateStatement2981);
			stype=comparatorType();
			state._fsp--;

			// Parser.g:529:7: ( K_FINALFUNC ffunc= allowedFunctionName )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==K_FINALFUNC) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// Parser.g:530:9: K_FINALFUNC ffunc= allowedFunctionName
					{
					match(input,K_FINALFUNC,FOLLOW_K_FINALFUNC_in_createAggregateStatement2999); 
					pushFollow(FOLLOW_allowedFunctionName_in_createAggregateStatement3005);
					ffunc=allowedFunctionName();
					state._fsp--;

					}
					break;

			}

			// Parser.g:532:7: ( K_INITCOND ival= term )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==K_INITCOND) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// Parser.g:533:9: K_INITCOND ival= term
					{
					match(input,K_INITCOND,FOLLOW_K_INITCOND_in_createAggregateStatement3032); 
					pushFollow(FOLLOW_term_in_createAggregateStatement3038);
					ival=term();
					state._fsp--;

					}
					break;

			}

			 expr = new CreateAggregateStatement(fn, argsTypes, sfunc, stype, ffunc, ival, orReplace, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createAggregateStatement"



	// $ANTLR start "dropAggregateStatement"
	// Parser.g:538:1: dropAggregateStatement returns [DropAggregateStatement expr] : K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? ;
	public final DropAggregateStatement dropAggregateStatement() throws RecognitionException {
		DropAggregateStatement expr = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        boolean ifExists = false;
		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		        boolean argsPresent = false;
		    
		try {
			// Parser.g:544:5: ( K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? )
			// Parser.g:544:7: K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropAggregateStatement3085); 
			match(input,K_AGGREGATE,FOLLOW_K_AGGREGATE_in_dropAggregateStatement3087); 
			// Parser.g:545:7: ( K_IF K_EXISTS )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==K_IF) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// Parser.g:545:8: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropAggregateStatement3096); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropAggregateStatement3098); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_dropAggregateStatement3113);
			fn=functionName();
			state._fsp--;

			// Parser.g:547:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==177) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// Parser.g:548:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,177,FOLLOW_177_in_dropAggregateStatement3131); 
					// Parser.g:549:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==IDENT||(LA55_0 >= K_AGGREGATE && LA55_0 <= K_ALL)||LA55_0==K_AS||LA55_0==K_ASCII||(LA55_0 >= K_BIGINT && LA55_0 <= K_BOOLEAN)||(LA55_0 >= K_CALLED && LA55_0 <= K_CLUSTERING)||(LA55_0 >= K_COMPACT && LA55_0 <= K_COUNTER)||(LA55_0 >= K_CUSTOM && LA55_0 <= K_DECIMAL)||(LA55_0 >= K_DISTINCT && LA55_0 <= K_DOUBLE)||(LA55_0 >= K_EXISTS && LA55_0 <= K_FLOAT)||LA55_0==K_FROZEN||(LA55_0 >= K_FUNCTION && LA55_0 <= K_FUNCTIONS)||LA55_0==K_INET||(LA55_0 >= K_INITCOND && LA55_0 <= K_INPUT)||LA55_0==K_INT||(LA55_0 >= K_JSON && LA55_0 <= K_KEYS)||(LA55_0 >= K_KEYSPACES && LA55_0 <= K_LIKE)||(LA55_0 >= K_LIST && LA55_0 <= K_MAP)||LA55_0==K_NOLOGIN||LA55_0==K_NOSUPERUSER||LA55_0==K_OPTIONS||(LA55_0 >= K_PARTITION && LA55_0 <= K_PERMISSIONS)||LA55_0==K_RETURNS||(LA55_0 >= K_ROLE && LA55_0 <= K_ROLES)||(LA55_0 >= K_SET && LA55_0 <= K_TINYINT)||LA55_0==K_TRIGGER||(LA55_0 >= K_TTL && LA55_0 <= K_TYPE)||(LA55_0 >= K_USER && LA55_0 <= K_USERS)||(LA55_0 >= K_UUID && LA55_0 <= K_VARINT)||LA55_0==K_WRITETIME||LA55_0==QUOTED_NAME||LA55_0==STRING_LITERAL) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// Parser.g:550:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_dropAggregateStatement3159);
							v=comparatorType();
							state._fsp--;

							 argsTypes.add(v); 
							// Parser.g:551:13: ( ',' v= comparatorType )*
							loop54:
							while (true) {
								int alt54=2;
								int LA54_0 = input.LA(1);
								if ( (LA54_0==180) ) {
									alt54=1;
								}

								switch (alt54) {
								case 1 :
									// Parser.g:551:15: ',' v= comparatorType
									{
									match(input,180,FOLLOW_180_in_dropAggregateStatement3177); 
									pushFollow(FOLLOW_comparatorType_in_dropAggregateStatement3181);
									v=comparatorType();
									state._fsp--;

									 argsTypes.add(v); 
									}
									break;

								default :
									break loop54;
								}
							}

							}
							break;

					}

					match(input,178,FOLLOW_178_in_dropAggregateStatement3209); 
					 argsPresent = true; 
					}
					break;

			}

			 expr = new DropAggregateStatement(fn, argsTypes, argsPresent, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropAggregateStatement"



	// $ANTLR start "createFunctionStatement"
	// Parser.g:559:1: createFunctionStatement returns [CreateFunctionStatement expr] : K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS rt= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL ;
	public final CreateFunctionStatement createFunctionStatement() throws RecognitionException {
		CreateFunctionStatement expr = null;


		Token language=null;
		Token body=null;
		FunctionName fn =null;
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;
		CQL3Type.Raw rt =null;


		        boolean orReplace = false;
		        boolean ifNotExists = false;

		        List<ColumnIdentifier> argsNames = new ArrayList<>();
		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		        boolean calledOnNullInput = false;
		    
		try {
			// Parser.g:568:5: ( K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS rt= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL )
			// Parser.g:568:7: K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS rt= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createFunctionStatement3266); 
			// Parser.g:568:16: ( K_OR K_REPLACE )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==K_OR) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// Parser.g:568:17: K_OR K_REPLACE
					{
					match(input,K_OR,FOLLOW_K_OR_in_createFunctionStatement3269); 
					match(input,K_REPLACE,FOLLOW_K_REPLACE_in_createFunctionStatement3271); 
					 orReplace = true; 
					}
					break;

			}

			match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_createFunctionStatement3283); 
			// Parser.g:570:7: ( K_IF K_NOT K_EXISTS )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==K_IF) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// Parser.g:570:8: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createFunctionStatement3292); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createFunctionStatement3294); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createFunctionStatement3296); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_createFunctionStatement3310);
			fn=functionName();
			state._fsp--;

			match(input,177,FOLLOW_177_in_createFunctionStatement3318); 
			// Parser.g:573:9: (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==IDENT||(LA60_0 >= K_AGGREGATE && LA60_0 <= K_ALL)||LA60_0==K_AS||LA60_0==K_ASCII||(LA60_0 >= K_BIGINT && LA60_0 <= K_BOOLEAN)||(LA60_0 >= K_CALLED && LA60_0 <= K_CLUSTERING)||(LA60_0 >= K_COMPACT && LA60_0 <= K_COUNTER)||(LA60_0 >= K_CUSTOM && LA60_0 <= K_DECIMAL)||(LA60_0 >= K_DISTINCT && LA60_0 <= K_DOUBLE)||(LA60_0 >= K_EXISTS && LA60_0 <= K_FLOAT)||LA60_0==K_FROZEN||(LA60_0 >= K_FUNCTION && LA60_0 <= K_FUNCTIONS)||LA60_0==K_INET||(LA60_0 >= K_INITCOND && LA60_0 <= K_INPUT)||LA60_0==K_INT||(LA60_0 >= K_JSON && LA60_0 <= K_KEYS)||(LA60_0 >= K_KEYSPACES && LA60_0 <= K_LIKE)||(LA60_0 >= K_LIST && LA60_0 <= K_MAP)||LA60_0==K_NOLOGIN||LA60_0==K_NOSUPERUSER||LA60_0==K_OPTIONS||(LA60_0 >= K_PARTITION && LA60_0 <= K_PERMISSIONS)||LA60_0==K_RETURNS||(LA60_0 >= K_ROLE && LA60_0 <= K_ROLES)||(LA60_0 >= K_SFUNC && LA60_0 <= K_TINYINT)||LA60_0==K_TRIGGER||(LA60_0 >= K_TTL && LA60_0 <= K_TYPE)||(LA60_0 >= K_USER && LA60_0 <= K_USERS)||(LA60_0 >= K_UUID && LA60_0 <= K_VARINT)||LA60_0==K_WRITETIME||LA60_0==QUOTED_NAME) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// Parser.g:574:11: k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )*
					{
					pushFollow(FOLLOW_noncol_ident_in_createFunctionStatement3342);
					k=noncol_ident();
					state._fsp--;

					pushFollow(FOLLOW_comparatorType_in_createFunctionStatement3346);
					v=comparatorType();
					state._fsp--;

					 argsNames.add(k); argsTypes.add(v); 
					// Parser.g:575:11: ( ',' k= noncol_ident v= comparatorType )*
					loop59:
					while (true) {
						int alt59=2;
						int LA59_0 = input.LA(1);
						if ( (LA59_0==180) ) {
							alt59=1;
						}

						switch (alt59) {
						case 1 :
							// Parser.g:575:13: ',' k= noncol_ident v= comparatorType
							{
							match(input,180,FOLLOW_180_in_createFunctionStatement3362); 
							pushFollow(FOLLOW_noncol_ident_in_createFunctionStatement3366);
							k=noncol_ident();
							state._fsp--;

							pushFollow(FOLLOW_comparatorType_in_createFunctionStatement3370);
							v=comparatorType();
							state._fsp--;

							 argsNames.add(k); argsTypes.add(v); 
							}
							break;

						default :
							break loop59;
						}
					}

					}
					break;

			}

			match(input,178,FOLLOW_178_in_createFunctionStatement3394); 
			// Parser.g:578:7: ( ( K_RETURNS K_NULL ) | ( K_CALLED ) )
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==K_RETURNS) ) {
				alt61=1;
			}
			else if ( (LA61_0==K_CALLED) ) {
				alt61=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}

			switch (alt61) {
				case 1 :
					// Parser.g:578:9: ( K_RETURNS K_NULL )
					{
					// Parser.g:578:9: ( K_RETURNS K_NULL )
					// Parser.g:578:10: K_RETURNS K_NULL
					{
					match(input,K_RETURNS,FOLLOW_K_RETURNS_in_createFunctionStatement3405); 
					match(input,K_NULL,FOLLOW_K_NULL_in_createFunctionStatement3407); 
					}

					}
					break;
				case 2 :
					// Parser.g:578:30: ( K_CALLED )
					{
					// Parser.g:578:30: ( K_CALLED )
					// Parser.g:578:31: K_CALLED
					{
					match(input,K_CALLED,FOLLOW_K_CALLED_in_createFunctionStatement3413); 
					 calledOnNullInput=true; 
					}

					}
					break;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createFunctionStatement3419); 
			match(input,K_NULL,FOLLOW_K_NULL_in_createFunctionStatement3421); 
			match(input,K_INPUT,FOLLOW_K_INPUT_in_createFunctionStatement3423); 
			match(input,K_RETURNS,FOLLOW_K_RETURNS_in_createFunctionStatement3431); 
			pushFollow(FOLLOW_comparatorType_in_createFunctionStatement3437);
			rt=comparatorType();
			state._fsp--;

			match(input,K_LANGUAGE,FOLLOW_K_LANGUAGE_in_createFunctionStatement3445); 
			language=(Token)match(input,IDENT,FOLLOW_IDENT_in_createFunctionStatement3451); 
			match(input,K_AS,FOLLOW_K_AS_in_createFunctionStatement3459); 
			body=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createFunctionStatement3465); 
			 expr = new CreateFunctionStatement(fn, (language!=null?language.getText():null).toLowerCase(), (body!=null?body.getText():null),
			                                            argsNames, argsTypes, rt, calledOnNullInput, orReplace, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createFunctionStatement"



	// $ANTLR start "dropFunctionStatement"
	// Parser.g:586:1: dropFunctionStatement returns [DropFunctionStatement expr] : K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? ;
	public final DropFunctionStatement dropFunctionStatement() throws RecognitionException {
		DropFunctionStatement expr = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        boolean ifExists = false;
		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		        boolean argsPresent = false;
		    
		try {
			// Parser.g:592:5: ( K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? )
			// Parser.g:592:7: K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropFunctionStatement3503); 
			match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_dropFunctionStatement3505); 
			// Parser.g:593:7: ( K_IF K_EXISTS )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==K_IF) ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// Parser.g:593:8: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropFunctionStatement3514); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropFunctionStatement3516); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_dropFunctionStatement3531);
			fn=functionName();
			state._fsp--;

			// Parser.g:595:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==177) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// Parser.g:596:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,177,FOLLOW_177_in_dropFunctionStatement3549); 
					// Parser.g:597:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==IDENT||(LA64_0 >= K_AGGREGATE && LA64_0 <= K_ALL)||LA64_0==K_AS||LA64_0==K_ASCII||(LA64_0 >= K_BIGINT && LA64_0 <= K_BOOLEAN)||(LA64_0 >= K_CALLED && LA64_0 <= K_CLUSTERING)||(LA64_0 >= K_COMPACT && LA64_0 <= K_COUNTER)||(LA64_0 >= K_CUSTOM && LA64_0 <= K_DECIMAL)||(LA64_0 >= K_DISTINCT && LA64_0 <= K_DOUBLE)||(LA64_0 >= K_EXISTS && LA64_0 <= K_FLOAT)||LA64_0==K_FROZEN||(LA64_0 >= K_FUNCTION && LA64_0 <= K_FUNCTIONS)||LA64_0==K_INET||(LA64_0 >= K_INITCOND && LA64_0 <= K_INPUT)||LA64_0==K_INT||(LA64_0 >= K_JSON && LA64_0 <= K_KEYS)||(LA64_0 >= K_KEYSPACES && LA64_0 <= K_LIKE)||(LA64_0 >= K_LIST && LA64_0 <= K_MAP)||LA64_0==K_NOLOGIN||LA64_0==K_NOSUPERUSER||LA64_0==K_OPTIONS||(LA64_0 >= K_PARTITION && LA64_0 <= K_PERMISSIONS)||LA64_0==K_RETURNS||(LA64_0 >= K_ROLE && LA64_0 <= K_ROLES)||(LA64_0 >= K_SET && LA64_0 <= K_TINYINT)||LA64_0==K_TRIGGER||(LA64_0 >= K_TTL && LA64_0 <= K_TYPE)||(LA64_0 >= K_USER && LA64_0 <= K_USERS)||(LA64_0 >= K_UUID && LA64_0 <= K_VARINT)||LA64_0==K_WRITETIME||LA64_0==QUOTED_NAME||LA64_0==STRING_LITERAL) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// Parser.g:598:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_dropFunctionStatement3577);
							v=comparatorType();
							state._fsp--;

							 argsTypes.add(v); 
							// Parser.g:599:13: ( ',' v= comparatorType )*
							loop63:
							while (true) {
								int alt63=2;
								int LA63_0 = input.LA(1);
								if ( (LA63_0==180) ) {
									alt63=1;
								}

								switch (alt63) {
								case 1 :
									// Parser.g:599:15: ',' v= comparatorType
									{
									match(input,180,FOLLOW_180_in_dropFunctionStatement3595); 
									pushFollow(FOLLOW_comparatorType_in_dropFunctionStatement3599);
									v=comparatorType();
									state._fsp--;

									 argsTypes.add(v); 
									}
									break;

								default :
									break loop63;
								}
							}

							}
							break;

					}

					match(input,178,FOLLOW_178_in_dropFunctionStatement3627); 
					 argsPresent = true; 
					}
					break;

			}

			 expr = new DropFunctionStatement(fn, argsTypes, argsPresent, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropFunctionStatement"



	// $ANTLR start "createKeyspaceStatement"
	// Parser.g:610:1: createKeyspaceStatement returns [CreateKeyspaceStatement expr] : K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] ;
	public final CreateKeyspaceStatement createKeyspaceStatement() throws RecognitionException {
		CreateKeyspaceStatement expr = null;


		String ks =null;


		        KeyspaceAttributes attrs = new KeyspaceAttributes();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:615:5: ( K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] )
			// Parser.g:615:7: K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs]
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createKeyspaceStatement3686); 
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_createKeyspaceStatement3688); 
			// Parser.g:615:27: ( K_IF K_NOT K_EXISTS )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==K_IF) ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// Parser.g:615:28: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createKeyspaceStatement3691); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createKeyspaceStatement3693); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createKeyspaceStatement3695); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_keyspaceName_in_createKeyspaceStatement3704);
			ks=keyspaceName();
			state._fsp--;

			match(input,K_WITH,FOLLOW_K_WITH_in_createKeyspaceStatement3712); 
			pushFollow(FOLLOW_properties_in_createKeyspaceStatement3714);
			properties(attrs);
			state._fsp--;

			 expr = new CreateKeyspaceStatement(ks, attrs, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createKeyspaceStatement"



	// $ANTLR start "createTableStatement"
	// Parser.g:626:1: createTableStatement returns [CreateTableStatement.RawStatement expr] : K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] ;
	public final CreateTableStatement.RawStatement createTableStatement() throws RecognitionException {
		CreateTableStatement.RawStatement expr = null;


		CFName cf =null;

		 boolean ifNotExists = false; 
		try {
			// Parser.g:628:5: ( K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] )
			// Parser.g:628:7: K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr]
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTableStatement3749); 
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_createTableStatement3751); 
			// Parser.g:628:31: ( K_IF K_NOT K_EXISTS )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==K_IF) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// Parser.g:628:32: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTableStatement3754); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createTableStatement3756); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTableStatement3758); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_createTableStatement3773);
			cf=columnFamilyName();
			state._fsp--;

			 expr = new CreateTableStatement.RawStatement(cf, ifNotExists); 
			pushFollow(FOLLOW_cfamDefinition_in_createTableStatement3783);
			cfamDefinition(expr);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createTableStatement"



	// $ANTLR start "cfamDefinition"
	// Parser.g:633:1: cfamDefinition[CreateTableStatement.RawStatement expr] : '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? ;
	public final void cfamDefinition(CreateTableStatement.RawStatement expr) throws RecognitionException {
		try {
			// Parser.g:634:5: ( '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? )
			// Parser.g:634:7: '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			{
			match(input,177,FOLLOW_177_in_cfamDefinition3802); 
			pushFollow(FOLLOW_cfamColumns_in_cfamDefinition3804);
			cfamColumns(expr);
			state._fsp--;

			// Parser.g:634:29: ( ',' ( cfamColumns[expr] )? )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==180) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// Parser.g:634:31: ',' ( cfamColumns[expr] )?
					{
					match(input,180,FOLLOW_180_in_cfamDefinition3809); 
					// Parser.g:634:35: ( cfamColumns[expr] )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==IDENT||(LA68_0 >= K_AGGREGATE && LA68_0 <= K_ALL)||LA68_0==K_AS||LA68_0==K_ASCII||(LA68_0 >= K_BIGINT && LA68_0 <= K_BOOLEAN)||(LA68_0 >= K_CALLED && LA68_0 <= K_CLUSTERING)||(LA68_0 >= K_COMPACT && LA68_0 <= K_COUNTER)||(LA68_0 >= K_CUSTOM && LA68_0 <= K_DECIMAL)||(LA68_0 >= K_DISTINCT && LA68_0 <= K_DOUBLE)||(LA68_0 >= K_EXISTS && LA68_0 <= K_FLOAT)||LA68_0==K_FROZEN||(LA68_0 >= K_FUNCTION && LA68_0 <= K_FUNCTIONS)||LA68_0==K_INET||(LA68_0 >= K_INITCOND && LA68_0 <= K_INPUT)||LA68_0==K_INT||(LA68_0 >= K_JSON && LA68_0 <= K_KEYS)||(LA68_0 >= K_KEYSPACES && LA68_0 <= K_LIKE)||(LA68_0 >= K_LIST && LA68_0 <= K_MAP)||LA68_0==K_NOLOGIN||LA68_0==K_NOSUPERUSER||LA68_0==K_OPTIONS||(LA68_0 >= K_PARTITION && LA68_0 <= K_PRIMARY)||LA68_0==K_RETURNS||(LA68_0 >= K_ROLE && LA68_0 <= K_ROLES)||(LA68_0 >= K_SFUNC && LA68_0 <= K_TINYINT)||LA68_0==K_TRIGGER||(LA68_0 >= K_TTL && LA68_0 <= K_TYPE)||(LA68_0 >= K_USER && LA68_0 <= K_USERS)||(LA68_0 >= K_UUID && LA68_0 <= K_VARINT)||LA68_0==K_WRITETIME||LA68_0==QUOTED_NAME) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// Parser.g:634:35: cfamColumns[expr]
							{
							pushFollow(FOLLOW_cfamColumns_in_cfamDefinition3811);
							cfamColumns(expr);
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop69;
				}
			}

			match(input,178,FOLLOW_178_in_cfamDefinition3818); 
			// Parser.g:635:7: ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==K_WITH) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// Parser.g:635:9: K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )*
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_cfamDefinition3828); 
					pushFollow(FOLLOW_cfamProperty_in_cfamDefinition3830);
					cfamProperty(expr.properties);
					state._fsp--;

					// Parser.g:635:46: ( K_AND cfamProperty[expr.properties] )*
					loop70:
					while (true) {
						int alt70=2;
						int LA70_0 = input.LA(1);
						if ( (LA70_0==K_AND) ) {
							alt70=1;
						}

						switch (alt70) {
						case 1 :
							// Parser.g:635:48: K_AND cfamProperty[expr.properties]
							{
							match(input,K_AND,FOLLOW_K_AND_in_cfamDefinition3835); 
							pushFollow(FOLLOW_cfamProperty_in_cfamDefinition3837);
							cfamProperty(expr.properties);
							state._fsp--;

							}
							break;

						default :
							break loop70;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamDefinition"



	// $ANTLR start "cfamColumns"
	// Parser.g:638:1: cfamColumns[CreateTableStatement.RawStatement expr] : (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')' );
	public final void cfamColumns(CreateTableStatement.RawStatement expr) throws RecognitionException {
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;
		ColumnIdentifier c =null;

		try {
			// Parser.g:639:5: (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')' )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==IDENT||(LA75_0 >= K_AGGREGATE && LA75_0 <= K_ALL)||LA75_0==K_AS||LA75_0==K_ASCII||(LA75_0 >= K_BIGINT && LA75_0 <= K_BOOLEAN)||(LA75_0 >= K_CALLED && LA75_0 <= K_CLUSTERING)||(LA75_0 >= K_COMPACT && LA75_0 <= K_COUNTER)||(LA75_0 >= K_CUSTOM && LA75_0 <= K_DECIMAL)||(LA75_0 >= K_DISTINCT && LA75_0 <= K_DOUBLE)||(LA75_0 >= K_EXISTS && LA75_0 <= K_FLOAT)||LA75_0==K_FROZEN||(LA75_0 >= K_FUNCTION && LA75_0 <= K_FUNCTIONS)||LA75_0==K_INET||(LA75_0 >= K_INITCOND && LA75_0 <= K_INPUT)||LA75_0==K_INT||(LA75_0 >= K_JSON && LA75_0 <= K_KEYS)||(LA75_0 >= K_KEYSPACES && LA75_0 <= K_LIKE)||(LA75_0 >= K_LIST && LA75_0 <= K_MAP)||LA75_0==K_NOLOGIN||LA75_0==K_NOSUPERUSER||LA75_0==K_OPTIONS||(LA75_0 >= K_PARTITION && LA75_0 <= K_PERMISSIONS)||LA75_0==K_RETURNS||(LA75_0 >= K_ROLE && LA75_0 <= K_ROLES)||(LA75_0 >= K_SFUNC && LA75_0 <= K_TINYINT)||LA75_0==K_TRIGGER||(LA75_0 >= K_TTL && LA75_0 <= K_TYPE)||(LA75_0 >= K_USER && LA75_0 <= K_USERS)||(LA75_0 >= K_UUID && LA75_0 <= K_VARINT)||LA75_0==K_WRITETIME||LA75_0==QUOTED_NAME) ) {
				alt75=1;
			}
			else if ( (LA75_0==K_PRIMARY) ) {
				alt75=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// Parser.g:639:7: k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )?
					{
					pushFollow(FOLLOW_ident_in_cfamColumns3863);
					k=ident();
					state._fsp--;

					pushFollow(FOLLOW_comparatorType_in_cfamColumns3867);
					v=comparatorType();
					state._fsp--;

					 boolean isStatic=false; 
					// Parser.g:639:60: ( K_STATIC )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==K_STATIC) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// Parser.g:639:61: K_STATIC
							{
							match(input,K_STATIC,FOLLOW_K_STATIC_in_cfamColumns3872); 
							isStatic = true;
							}
							break;

					}

					 expr.addDefinition(k, v, isStatic); 
					// Parser.g:640:9: ( K_PRIMARY K_KEY )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==K_PRIMARY) ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// Parser.g:640:10: K_PRIMARY K_KEY
							{
							match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns3889); 
							match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns3891); 
							 expr.addKeyAliases(Collections.singletonList(k)); 
							}
							break;

					}

					}
					break;
				case 2 :
					// Parser.g:641:7: K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')'
					{
					match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns3903); 
					match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns3905); 
					match(input,177,FOLLOW_177_in_cfamColumns3907); 
					pushFollow(FOLLOW_pkDef_in_cfamColumns3909);
					pkDef(expr);
					state._fsp--;

					// Parser.g:641:39: ( ',' c= ident )*
					loop74:
					while (true) {
						int alt74=2;
						int LA74_0 = input.LA(1);
						if ( (LA74_0==180) ) {
							alt74=1;
						}

						switch (alt74) {
						case 1 :
							// Parser.g:641:40: ',' c= ident
							{
							match(input,180,FOLLOW_180_in_cfamColumns3913); 
							pushFollow(FOLLOW_ident_in_cfamColumns3917);
							c=ident();
							state._fsp--;

							 expr.addColumnAlias(c); 
							}
							break;

						default :
							break loop74;
						}
					}

					match(input,178,FOLLOW_178_in_cfamColumns3924); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamColumns"



	// $ANTLR start "pkDef"
	// Parser.g:644:1: pkDef[CreateTableStatement.RawStatement expr] : (k= ident | '(' k1= ident ( ',' kn= ident )* ')' );
	public final void pkDef(CreateTableStatement.RawStatement expr) throws RecognitionException {
		ColumnIdentifier k =null;
		ColumnIdentifier k1 =null;
		ColumnIdentifier kn =null;

		try {
			// Parser.g:645:5: (k= ident | '(' k1= ident ( ',' kn= ident )* ')' )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==IDENT||(LA77_0 >= K_AGGREGATE && LA77_0 <= K_ALL)||LA77_0==K_AS||LA77_0==K_ASCII||(LA77_0 >= K_BIGINT && LA77_0 <= K_BOOLEAN)||(LA77_0 >= K_CALLED && LA77_0 <= K_CLUSTERING)||(LA77_0 >= K_COMPACT && LA77_0 <= K_COUNTER)||(LA77_0 >= K_CUSTOM && LA77_0 <= K_DECIMAL)||(LA77_0 >= K_DISTINCT && LA77_0 <= K_DOUBLE)||(LA77_0 >= K_EXISTS && LA77_0 <= K_FLOAT)||LA77_0==K_FROZEN||(LA77_0 >= K_FUNCTION && LA77_0 <= K_FUNCTIONS)||LA77_0==K_INET||(LA77_0 >= K_INITCOND && LA77_0 <= K_INPUT)||LA77_0==K_INT||(LA77_0 >= K_JSON && LA77_0 <= K_KEYS)||(LA77_0 >= K_KEYSPACES && LA77_0 <= K_LIKE)||(LA77_0 >= K_LIST && LA77_0 <= K_MAP)||LA77_0==K_NOLOGIN||LA77_0==K_NOSUPERUSER||LA77_0==K_OPTIONS||(LA77_0 >= K_PARTITION && LA77_0 <= K_PERMISSIONS)||LA77_0==K_RETURNS||(LA77_0 >= K_ROLE && LA77_0 <= K_ROLES)||(LA77_0 >= K_SFUNC && LA77_0 <= K_TINYINT)||LA77_0==K_TRIGGER||(LA77_0 >= K_TTL && LA77_0 <= K_TYPE)||(LA77_0 >= K_USER && LA77_0 <= K_USERS)||(LA77_0 >= K_UUID && LA77_0 <= K_VARINT)||LA77_0==K_WRITETIME||LA77_0==QUOTED_NAME) ) {
				alt77=1;
			}
			else if ( (LA77_0==177) ) {
				alt77=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// Parser.g:645:7: k= ident
					{
					pushFollow(FOLLOW_ident_in_pkDef3944);
					k=ident();
					state._fsp--;

					 expr.addKeyAliases(Collections.singletonList(k)); 
					}
					break;
				case 2 :
					// Parser.g:646:7: '(' k1= ident ( ',' kn= ident )* ')'
					{
					match(input,177,FOLLOW_177_in_pkDef3954); 
					 List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>(); 
					pushFollow(FOLLOW_ident_in_pkDef3960);
					k1=ident();
					state._fsp--;

					 l.add(k1); 
					// Parser.g:646:101: ( ',' kn= ident )*
					loop76:
					while (true) {
						int alt76=2;
						int LA76_0 = input.LA(1);
						if ( (LA76_0==180) ) {
							alt76=1;
						}

						switch (alt76) {
						case 1 :
							// Parser.g:646:103: ',' kn= ident
							{
							match(input,180,FOLLOW_180_in_pkDef3966); 
							pushFollow(FOLLOW_ident_in_pkDef3970);
							kn=ident();
							state._fsp--;

							 l.add(kn); 
							}
							break;

						default :
							break loop76;
						}
					}

					match(input,178,FOLLOW_178_in_pkDef3977); 
					 expr.addKeyAliases(l); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "pkDef"



	// $ANTLR start "cfamProperty"
	// Parser.g:649:1: cfamProperty[CFProperties props] : ( property[props.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[props] ( ',' cfamOrdering[props] )* ')' );
	public final void cfamProperty(CFProperties props) throws RecognitionException {
		try {
			// Parser.g:650:5: ( property[props.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[props] ( ',' cfamOrdering[props] )* ')' )
			int alt79=3;
			switch ( input.LA(1) ) {
			case IDENT:
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt79=1;
				}
				break;
			case K_COMPACT:
				{
				int LA79_2 = input.LA(2);
				if ( (LA79_2==K_STORAGE) ) {
					alt79=2;
				}
				else if ( (LA79_2==187) ) {
					alt79=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 79, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_CLUSTERING:
				{
				int LA79_3 = input.LA(2);
				if ( (LA79_3==K_ORDER) ) {
					alt79=3;
				}
				else if ( (LA79_3==187) ) {
					alt79=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 79, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}
			switch (alt79) {
				case 1 :
					// Parser.g:650:7: property[props.properties]
					{
					pushFollow(FOLLOW_property_in_cfamProperty3997);
					property(props.properties);
					state._fsp--;

					}
					break;
				case 2 :
					// Parser.g:651:7: K_COMPACT K_STORAGE
					{
					match(input,K_COMPACT,FOLLOW_K_COMPACT_in_cfamProperty4006); 
					match(input,K_STORAGE,FOLLOW_K_STORAGE_in_cfamProperty4008); 
					 props.setCompactStorage(); 
					}
					break;
				case 3 :
					// Parser.g:652:7: K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[props] ( ',' cfamOrdering[props] )* ')'
					{
					match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_cfamProperty4018); 
					match(input,K_ORDER,FOLLOW_K_ORDER_in_cfamProperty4020); 
					match(input,K_BY,FOLLOW_K_BY_in_cfamProperty4022); 
					match(input,177,FOLLOW_177_in_cfamProperty4024); 
					pushFollow(FOLLOW_cfamOrdering_in_cfamProperty4026);
					cfamOrdering(props);
					state._fsp--;

					// Parser.g:652:57: ( ',' cfamOrdering[props] )*
					loop78:
					while (true) {
						int alt78=2;
						int LA78_0 = input.LA(1);
						if ( (LA78_0==180) ) {
							alt78=1;
						}

						switch (alt78) {
						case 1 :
							// Parser.g:652:58: ',' cfamOrdering[props]
							{
							match(input,180,FOLLOW_180_in_cfamProperty4030); 
							pushFollow(FOLLOW_cfamOrdering_in_cfamProperty4032);
							cfamOrdering(props);
							state._fsp--;

							}
							break;

						default :
							break loop78;
						}
					}

					match(input,178,FOLLOW_178_in_cfamProperty4037); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamProperty"



	// $ANTLR start "cfamOrdering"
	// Parser.g:655:1: cfamOrdering[CFProperties props] : k= ident ( K_ASC | K_DESC ) ;
	public final void cfamOrdering(CFProperties props) throws RecognitionException {
		ColumnIdentifier k =null;

		 boolean reversed=false; 
		try {
			// Parser.g:657:5: (k= ident ( K_ASC | K_DESC ) )
			// Parser.g:657:7: k= ident ( K_ASC | K_DESC )
			{
			pushFollow(FOLLOW_ident_in_cfamOrdering4065);
			k=ident();
			state._fsp--;

			// Parser.g:657:15: ( K_ASC | K_DESC )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==K_ASC) ) {
				alt80=1;
			}
			else if ( (LA80_0==K_DESC) ) {
				alt80=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// Parser.g:657:16: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_cfamOrdering4068); 
					}
					break;
				case 2 :
					// Parser.g:657:24: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_cfamOrdering4072); 
					 reversed=true;
					}
					break;

			}

			 props.setOrdering(k, reversed); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamOrdering"



	// $ANTLR start "createTypeStatement"
	// Parser.g:668:1: createTypeStatement returns [CreateTypeStatement expr] : K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')' ;
	public final CreateTypeStatement createTypeStatement() throws RecognitionException {
		CreateTypeStatement expr = null;


		UTName tn =null;

		 boolean ifNotExists = false; 
		try {
			// Parser.g:670:5: ( K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')' )
			// Parser.g:670:7: K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')'
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTypeStatement4111); 
			match(input,K_TYPE,FOLLOW_K_TYPE_in_createTypeStatement4113); 
			// Parser.g:670:23: ( K_IF K_NOT K_EXISTS )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==K_IF) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// Parser.g:670:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTypeStatement4116); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createTypeStatement4118); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTypeStatement4120); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_userTypeName_in_createTypeStatement4138);
			tn=userTypeName();
			state._fsp--;

			 expr = new CreateTypeStatement(tn, ifNotExists); 
			match(input,177,FOLLOW_177_in_createTypeStatement4151); 
			pushFollow(FOLLOW_typeColumns_in_createTypeStatement4153);
			typeColumns(expr);
			state._fsp--;

			// Parser.g:672:32: ( ',' ( typeColumns[expr] )? )*
			loop83:
			while (true) {
				int alt83=2;
				int LA83_0 = input.LA(1);
				if ( (LA83_0==180) ) {
					alt83=1;
				}

				switch (alt83) {
				case 1 :
					// Parser.g:672:34: ',' ( typeColumns[expr] )?
					{
					match(input,180,FOLLOW_180_in_createTypeStatement4158); 
					// Parser.g:672:38: ( typeColumns[expr] )?
					int alt82=2;
					int LA82_0 = input.LA(1);
					if ( (LA82_0==IDENT||(LA82_0 >= K_AGGREGATE && LA82_0 <= K_ALL)||LA82_0==K_AS||LA82_0==K_ASCII||(LA82_0 >= K_BIGINT && LA82_0 <= K_BOOLEAN)||(LA82_0 >= K_CALLED && LA82_0 <= K_CLUSTERING)||(LA82_0 >= K_COMPACT && LA82_0 <= K_COUNTER)||(LA82_0 >= K_CUSTOM && LA82_0 <= K_DECIMAL)||(LA82_0 >= K_DISTINCT && LA82_0 <= K_DOUBLE)||(LA82_0 >= K_EXISTS && LA82_0 <= K_FLOAT)||LA82_0==K_FROZEN||(LA82_0 >= K_FUNCTION && LA82_0 <= K_FUNCTIONS)||LA82_0==K_INET||(LA82_0 >= K_INITCOND && LA82_0 <= K_INPUT)||LA82_0==K_INT||(LA82_0 >= K_JSON && LA82_0 <= K_KEYS)||(LA82_0 >= K_KEYSPACES && LA82_0 <= K_LIKE)||(LA82_0 >= K_LIST && LA82_0 <= K_MAP)||LA82_0==K_NOLOGIN||LA82_0==K_NOSUPERUSER||LA82_0==K_OPTIONS||(LA82_0 >= K_PARTITION && LA82_0 <= K_PERMISSIONS)||LA82_0==K_RETURNS||(LA82_0 >= K_ROLE && LA82_0 <= K_ROLES)||(LA82_0 >= K_SFUNC && LA82_0 <= K_TINYINT)||LA82_0==K_TRIGGER||(LA82_0 >= K_TTL && LA82_0 <= K_TYPE)||(LA82_0 >= K_USER && LA82_0 <= K_USERS)||(LA82_0 >= K_UUID && LA82_0 <= K_VARINT)||LA82_0==K_WRITETIME||LA82_0==QUOTED_NAME) ) {
						alt82=1;
					}
					switch (alt82) {
						case 1 :
							// Parser.g:672:38: typeColumns[expr]
							{
							pushFollow(FOLLOW_typeColumns_in_createTypeStatement4160);
							typeColumns(expr);
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop83;
				}
			}

			match(input,178,FOLLOW_178_in_createTypeStatement4167); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createTypeStatement"



	// $ANTLR start "typeColumns"
	// Parser.g:675:1: typeColumns[CreateTypeStatement expr] : k= noncol_ident v= comparatorType ;
	public final void typeColumns(CreateTypeStatement expr) throws RecognitionException {
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;

		try {
			// Parser.g:676:5: (k= noncol_ident v= comparatorType )
			// Parser.g:676:7: k= noncol_ident v= comparatorType
			{
			pushFollow(FOLLOW_noncol_ident_in_typeColumns4187);
			k=noncol_ident();
			state._fsp--;

			pushFollow(FOLLOW_comparatorType_in_typeColumns4191);
			v=comparatorType();
			state._fsp--;

			 expr.addDefinition(k, v); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "typeColumns"



	// $ANTLR start "createIndexStatement"
	// Parser.g:684:1: createIndexStatement returns [CreateIndexStatement expr] : K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? ;
	public final CreateIndexStatement createIndexStatement() throws RecognitionException {
		CreateIndexStatement expr = null;


		Token cls=null;
		CFName cf =null;


		        IndexPropDefs props = new IndexPropDefs();
		        boolean ifNotExists = false;
		        IndexName name = new IndexName();
		        List<IndexTarget.Raw> targets = new ArrayList<>();
		    
		try {
			// Parser.g:691:5: ( K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? )
			// Parser.g:691:7: K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createIndexStatement4226); 
			// Parser.g:691:16: ( K_CUSTOM )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==K_CUSTOM) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// Parser.g:691:17: K_CUSTOM
					{
					match(input,K_CUSTOM,FOLLOW_K_CUSTOM_in_createIndexStatement4229); 
					 props.isCustom = true; 
					}
					break;

			}

			match(input,K_INDEX,FOLLOW_K_INDEX_in_createIndexStatement4235); 
			// Parser.g:691:63: ( K_IF K_NOT K_EXISTS )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==K_IF) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// Parser.g:691:64: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createIndexStatement4238); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createIndexStatement4240); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createIndexStatement4242); 
					 ifNotExists = true; 
					}
					break;

			}

			// Parser.g:692:9: ( idxName[name] )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==IDENT||(LA86_0 >= K_AGGREGATE && LA86_0 <= K_ALL)||LA86_0==K_AS||LA86_0==K_ASCII||(LA86_0 >= K_BIGINT && LA86_0 <= K_BOOLEAN)||(LA86_0 >= K_CALLED && LA86_0 <= K_CLUSTERING)||(LA86_0 >= K_COMPACT && LA86_0 <= K_COUNTER)||(LA86_0 >= K_CUSTOM && LA86_0 <= K_DECIMAL)||(LA86_0 >= K_DISTINCT && LA86_0 <= K_DOUBLE)||(LA86_0 >= K_EXISTS && LA86_0 <= K_FLOAT)||LA86_0==K_FROZEN||(LA86_0 >= K_FUNCTION && LA86_0 <= K_FUNCTIONS)||LA86_0==K_INET||(LA86_0 >= K_INITCOND && LA86_0 <= K_INPUT)||LA86_0==K_INT||(LA86_0 >= K_JSON && LA86_0 <= K_KEYS)||(LA86_0 >= K_KEYSPACES && LA86_0 <= K_LIKE)||(LA86_0 >= K_LIST && LA86_0 <= K_MAP)||LA86_0==K_NOLOGIN||LA86_0==K_NOSUPERUSER||LA86_0==K_OPTIONS||(LA86_0 >= K_PARTITION && LA86_0 <= K_PERMISSIONS)||LA86_0==K_RETURNS||(LA86_0 >= K_ROLE && LA86_0 <= K_ROLES)||(LA86_0 >= K_SFUNC && LA86_0 <= K_TINYINT)||LA86_0==K_TRIGGER||(LA86_0 >= K_TTL && LA86_0 <= K_TYPE)||(LA86_0 >= K_USER && LA86_0 <= K_USERS)||(LA86_0 >= K_UUID && LA86_0 <= K_VARINT)||LA86_0==K_WRITETIME||(LA86_0 >= QMARK && LA86_0 <= QUOTED_NAME)) ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// Parser.g:692:10: idxName[name]
					{
					pushFollow(FOLLOW_idxName_in_createIndexStatement4258);
					idxName(name);
					state._fsp--;

					}
					break;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createIndexStatement4263); 
			pushFollow(FOLLOW_columnFamilyName_in_createIndexStatement4267);
			cf=columnFamilyName();
			state._fsp--;

			match(input,177,FOLLOW_177_in_createIndexStatement4269); 
			// Parser.g:692:55: ( indexIdent[targets] ( ',' indexIdent[targets] )* )?
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==IDENT||(LA88_0 >= K_AGGREGATE && LA88_0 <= K_ALL)||LA88_0==K_AS||LA88_0==K_ASCII||(LA88_0 >= K_BIGINT && LA88_0 <= K_BOOLEAN)||(LA88_0 >= K_CALLED && LA88_0 <= K_CLUSTERING)||(LA88_0 >= K_COMPACT && LA88_0 <= K_COUNTER)||(LA88_0 >= K_CUSTOM && LA88_0 <= K_DECIMAL)||(LA88_0 >= K_DISTINCT && LA88_0 <= K_DOUBLE)||LA88_0==K_ENTRIES||(LA88_0 >= K_EXISTS && LA88_0 <= K_FLOAT)||(LA88_0 >= K_FROZEN && LA88_0 <= K_FUNCTIONS)||LA88_0==K_INET||(LA88_0 >= K_INITCOND && LA88_0 <= K_INPUT)||LA88_0==K_INT||(LA88_0 >= K_JSON && LA88_0 <= K_KEYS)||(LA88_0 >= K_KEYSPACES && LA88_0 <= K_LIKE)||(LA88_0 >= K_LIST && LA88_0 <= K_MAP)||LA88_0==K_NOLOGIN||LA88_0==K_NOSUPERUSER||LA88_0==K_OPTIONS||(LA88_0 >= K_PARTITION && LA88_0 <= K_PERMISSIONS)||LA88_0==K_RETURNS||(LA88_0 >= K_ROLE && LA88_0 <= K_ROLES)||(LA88_0 >= K_SFUNC && LA88_0 <= K_TINYINT)||LA88_0==K_TRIGGER||(LA88_0 >= K_TTL && LA88_0 <= K_TYPE)||(LA88_0 >= K_USER && LA88_0 <= K_USERS)||(LA88_0 >= K_UUID && LA88_0 <= K_VARINT)||LA88_0==K_WRITETIME||LA88_0==QUOTED_NAME) ) {
				alt88=1;
			}
			switch (alt88) {
				case 1 :
					// Parser.g:692:56: indexIdent[targets] ( ',' indexIdent[targets] )*
					{
					pushFollow(FOLLOW_indexIdent_in_createIndexStatement4272);
					indexIdent(targets);
					state._fsp--;

					// Parser.g:692:76: ( ',' indexIdent[targets] )*
					loop87:
					while (true) {
						int alt87=2;
						int LA87_0 = input.LA(1);
						if ( (LA87_0==180) ) {
							alt87=1;
						}

						switch (alt87) {
						case 1 :
							// Parser.g:692:77: ',' indexIdent[targets]
							{
							match(input,180,FOLLOW_180_in_createIndexStatement4276); 
							pushFollow(FOLLOW_indexIdent_in_createIndexStatement4278);
							indexIdent(targets);
							state._fsp--;

							}
							break;

						default :
							break loop87;
						}
					}

					}
					break;

			}

			match(input,178,FOLLOW_178_in_createIndexStatement4285); 
			// Parser.g:693:9: ( K_USING cls= STRING_LITERAL )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==K_USING) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// Parser.g:693:10: K_USING cls= STRING_LITERAL
					{
					match(input,K_USING,FOLLOW_K_USING_in_createIndexStatement4296); 
					cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createIndexStatement4300); 
					 props.customClass = (cls!=null?cls.getText():null); 
					}
					break;

			}

			// Parser.g:694:9: ( K_WITH properties[props] )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==K_WITH) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// Parser.g:694:10: K_WITH properties[props]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createIndexStatement4315); 
					pushFollow(FOLLOW_properties_in_createIndexStatement4317);
					properties(props);
					state._fsp--;

					}
					break;

			}

			 expr = new CreateIndexStatement(cf, name, targets, props, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createIndexStatement"



	// $ANTLR start "indexIdent"
	// Parser.g:698:1: indexIdent[List<IndexTarget.Raw> targets] : (c= cident | K_VALUES '(' c= cident ')' | K_KEYS '(' c= cident ')' | K_ENTRIES '(' c= cident ')' | K_FULL '(' c= cident ')' );
	public final void indexIdent(List<IndexTarget.Raw> targets) throws RecognitionException {
		ColumnIdentifier.Raw c =null;

		try {
			// Parser.g:699:5: (c= cident | K_VALUES '(' c= cident ')' | K_KEYS '(' c= cident ')' | K_ENTRIES '(' c= cident ')' | K_FULL '(' c= cident ')' )
			int alt91=5;
			switch ( input.LA(1) ) {
			case IDENT:
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt91=1;
				}
				break;
			case K_VALUES:
				{
				int LA91_2 = input.LA(2);
				if ( (LA91_2==177) ) {
					alt91=2;
				}
				else if ( (LA91_2==178||LA91_2==180) ) {
					alt91=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 91, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_KEYS:
				{
				int LA91_3 = input.LA(2);
				if ( (LA91_3==177) ) {
					alt91=3;
				}
				else if ( (LA91_3==178||LA91_3==180) ) {
					alt91=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 91, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_ENTRIES:
				{
				alt91=4;
				}
				break;
			case K_FULL:
				{
				alt91=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}
			switch (alt91) {
				case 1 :
					// Parser.g:699:7: c= cident
					{
					pushFollow(FOLLOW_cident_in_indexIdent4349);
					c=cident();
					state._fsp--;

					 targets.add(IndexTarget.Raw.simpleIndexOn(c)); 
					}
					break;
				case 2 :
					// Parser.g:700:7: K_VALUES '(' c= cident ')'
					{
					match(input,K_VALUES,FOLLOW_K_VALUES_in_indexIdent4377); 
					match(input,177,FOLLOW_177_in_indexIdent4379); 
					pushFollow(FOLLOW_cident_in_indexIdent4383);
					c=cident();
					state._fsp--;

					match(input,178,FOLLOW_178_in_indexIdent4385); 
					 targets.add(IndexTarget.Raw.valuesOf(c)); 
					}
					break;
				case 3 :
					// Parser.g:701:7: K_KEYS '(' c= cident ')'
					{
					match(input,K_KEYS,FOLLOW_K_KEYS_in_indexIdent4396); 
					match(input,177,FOLLOW_177_in_indexIdent4398); 
					pushFollow(FOLLOW_cident_in_indexIdent4402);
					c=cident();
					state._fsp--;

					match(input,178,FOLLOW_178_in_indexIdent4404); 
					 targets.add(IndexTarget.Raw.keysOf(c)); 
					}
					break;
				case 4 :
					// Parser.g:702:7: K_ENTRIES '(' c= cident ')'
					{
					match(input,K_ENTRIES,FOLLOW_K_ENTRIES_in_indexIdent4417); 
					match(input,177,FOLLOW_177_in_indexIdent4419); 
					pushFollow(FOLLOW_cident_in_indexIdent4423);
					c=cident();
					state._fsp--;

					match(input,178,FOLLOW_178_in_indexIdent4425); 
					 targets.add(IndexTarget.Raw.keysAndValuesOf(c)); 
					}
					break;
				case 5 :
					// Parser.g:703:7: K_FULL '(' c= cident ')'
					{
					match(input,K_FULL,FOLLOW_K_FULL_in_indexIdent4435); 
					match(input,177,FOLLOW_177_in_indexIdent4437); 
					pushFollow(FOLLOW_cident_in_indexIdent4441);
					c=cident();
					state._fsp--;

					match(input,178,FOLLOW_178_in_indexIdent4443); 
					 targets.add(IndexTarget.Raw.fullCollection(c)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "indexIdent"



	// $ANTLR start "createMaterializedViewStatement"
	// Parser.g:714:1: createMaterializedViewStatement returns [CreateViewStatement expr] : K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectClause K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? K_PRIMARY K_KEY ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' ) ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? ;
	public final CreateViewStatement createMaterializedViewStatement() throws RecognitionException {
		CreateViewStatement expr = null;


		CFName cf =null;
		List<RawSelector> sclause =null;
		CFName basecf =null;
		WhereClause.Builder wclause =null;
		ColumnIdentifier.Raw k1 =null;
		ColumnIdentifier.Raw kn =null;
		ColumnIdentifier.Raw c1 =null;
		ColumnIdentifier.Raw cn =null;


		        boolean ifNotExists = false;
		        List<ColumnIdentifier.Raw> partitionKeys = new ArrayList<>();
		        List<ColumnIdentifier.Raw> compositeKeys = new ArrayList<>();
		    
		try {
			// Parser.g:720:5: ( K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectClause K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? K_PRIMARY K_KEY ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' ) ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? )
			// Parser.g:720:7: K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectClause K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? K_PRIMARY K_KEY ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' ) ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createMaterializedViewStatement4480); 
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_createMaterializedViewStatement4482); 
			match(input,K_VIEW,FOLLOW_K_VIEW_in_createMaterializedViewStatement4484); 
			// Parser.g:720:38: ( K_IF K_NOT K_EXISTS )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==K_IF) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// Parser.g:720:39: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createMaterializedViewStatement4487); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createMaterializedViewStatement4489); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createMaterializedViewStatement4491); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_createMaterializedViewStatement4499);
			cf=columnFamilyName();
			state._fsp--;

			match(input,K_AS,FOLLOW_K_AS_in_createMaterializedViewStatement4501); 
			match(input,K_SELECT,FOLLOW_K_SELECT_in_createMaterializedViewStatement4511); 
			pushFollow(FOLLOW_selectClause_in_createMaterializedViewStatement4515);
			sclause=selectClause();
			state._fsp--;

			match(input,K_FROM,FOLLOW_K_FROM_in_createMaterializedViewStatement4517); 
			pushFollow(FOLLOW_columnFamilyName_in_createMaterializedViewStatement4521);
			basecf=columnFamilyName();
			state._fsp--;

			// Parser.g:722:9: ( K_WHERE wclause= whereClause )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==K_WHERE) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// Parser.g:722:10: K_WHERE wclause= whereClause
					{
					match(input,K_WHERE,FOLLOW_K_WHERE_in_createMaterializedViewStatement4532); 
					pushFollow(FOLLOW_whereClause_in_createMaterializedViewStatement4536);
					wclause=whereClause();
					state._fsp--;

					}
					break;

			}

			match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_createMaterializedViewStatement4548); 
			match(input,K_KEY,FOLLOW_K_KEY_in_createMaterializedViewStatement4550); 
			// Parser.g:723:25: ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' )
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==177) ) {
				int LA97_1 = input.LA(2);
				if ( (LA97_1==177) ) {
					alt97=1;
				}
				else if ( (LA97_1==IDENT||(LA97_1 >= K_AGGREGATE && LA97_1 <= K_ALL)||LA97_1==K_AS||LA97_1==K_ASCII||(LA97_1 >= K_BIGINT && LA97_1 <= K_BOOLEAN)||(LA97_1 >= K_CALLED && LA97_1 <= K_CLUSTERING)||(LA97_1 >= K_COMPACT && LA97_1 <= K_COUNTER)||(LA97_1 >= K_CUSTOM && LA97_1 <= K_DECIMAL)||(LA97_1 >= K_DISTINCT && LA97_1 <= K_DOUBLE)||(LA97_1 >= K_EXISTS && LA97_1 <= K_FLOAT)||LA97_1==K_FROZEN||(LA97_1 >= K_FUNCTION && LA97_1 <= K_FUNCTIONS)||LA97_1==K_INET||(LA97_1 >= K_INITCOND && LA97_1 <= K_INPUT)||LA97_1==K_INT||(LA97_1 >= K_JSON && LA97_1 <= K_KEYS)||(LA97_1 >= K_KEYSPACES && LA97_1 <= K_LIKE)||(LA97_1 >= K_LIST && LA97_1 <= K_MAP)||LA97_1==K_NOLOGIN||LA97_1==K_NOSUPERUSER||LA97_1==K_OPTIONS||(LA97_1 >= K_PARTITION && LA97_1 <= K_PERMISSIONS)||LA97_1==K_RETURNS||(LA97_1 >= K_ROLE && LA97_1 <= K_ROLES)||(LA97_1 >= K_SFUNC && LA97_1 <= K_TINYINT)||LA97_1==K_TRIGGER||(LA97_1 >= K_TTL && LA97_1 <= K_TYPE)||(LA97_1 >= K_USER && LA97_1 <= K_USERS)||(LA97_1 >= K_UUID && LA97_1 <= K_VARINT)||LA97_1==K_WRITETIME||LA97_1==QUOTED_NAME) ) {
					alt97=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 97, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}

			switch (alt97) {
				case 1 :
					// Parser.g:724:9: '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')'
					{
					match(input,177,FOLLOW_177_in_createMaterializedViewStatement4562); 
					match(input,177,FOLLOW_177_in_createMaterializedViewStatement4564); 
					pushFollow(FOLLOW_cident_in_createMaterializedViewStatement4568);
					k1=cident();
					state._fsp--;

					 partitionKeys.add(k1); 
					// Parser.g:724:54: ( ',' kn= cident )*
					loop94:
					while (true) {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==180) ) {
							alt94=1;
						}

						switch (alt94) {
						case 1 :
							// Parser.g:724:56: ',' kn= cident
							{
							match(input,180,FOLLOW_180_in_createMaterializedViewStatement4574); 
							pushFollow(FOLLOW_cident_in_createMaterializedViewStatement4578);
							kn=cident();
							state._fsp--;

							 partitionKeys.add(kn); 
							}
							break;

						default :
							break loop94;
						}
					}

					match(input,178,FOLLOW_178_in_createMaterializedViewStatement4585); 
					// Parser.g:724:104: ( ',' c1= cident )*
					loop95:
					while (true) {
						int alt95=2;
						int LA95_0 = input.LA(1);
						if ( (LA95_0==180) ) {
							alt95=1;
						}

						switch (alt95) {
						case 1 :
							// Parser.g:724:106: ',' c1= cident
							{
							match(input,180,FOLLOW_180_in_createMaterializedViewStatement4589); 
							pushFollow(FOLLOW_cident_in_createMaterializedViewStatement4593);
							c1=cident();
							state._fsp--;

							 compositeKeys.add(c1); 
							}
							break;

						default :
							break loop95;
						}
					}

					match(input,178,FOLLOW_178_in_createMaterializedViewStatement4600); 
					}
					break;
				case 2 :
					// Parser.g:725:9: '(' k1= cident ( ',' cn= cident )* ')'
					{
					match(input,177,FOLLOW_177_in_createMaterializedViewStatement4610); 
					pushFollow(FOLLOW_cident_in_createMaterializedViewStatement4614);
					k1=cident();
					state._fsp--;

					 partitionKeys.add(k1); 
					// Parser.g:725:50: ( ',' cn= cident )*
					loop96:
					while (true) {
						int alt96=2;
						int LA96_0 = input.LA(1);
						if ( (LA96_0==180) ) {
							alt96=1;
						}

						switch (alt96) {
						case 1 :
							// Parser.g:725:52: ',' cn= cident
							{
							match(input,180,FOLLOW_180_in_createMaterializedViewStatement4620); 
							pushFollow(FOLLOW_cident_in_createMaterializedViewStatement4624);
							cn=cident();
							state._fsp--;

							 compositeKeys.add(cn); 
							}
							break;

						default :
							break loop96;
						}
					}

					match(input,178,FOLLOW_178_in_createMaterializedViewStatement4631); 
					}
					break;

			}


			             WhereClause where = wclause == null ? WhereClause.empty() : wclause.build();
			             expr = new CreateViewStatement(cf, basecf, sclause, where, partitionKeys, compositeKeys, ifNotExists);
			        
			// Parser.g:731:9: ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==K_WITH) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// Parser.g:731:11: K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )*
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createMaterializedViewStatement4663); 
					pushFollow(FOLLOW_cfamProperty_in_createMaterializedViewStatement4665);
					cfamProperty(expr.properties);
					state._fsp--;

					// Parser.g:731:48: ( K_AND cfamProperty[expr.properties] )*
					loop98:
					while (true) {
						int alt98=2;
						int LA98_0 = input.LA(1);
						if ( (LA98_0==K_AND) ) {
							alt98=1;
						}

						switch (alt98) {
						case 1 :
							// Parser.g:731:50: K_AND cfamProperty[expr.properties]
							{
							match(input,K_AND,FOLLOW_K_AND_in_createMaterializedViewStatement4670); 
							pushFollow(FOLLOW_cfamProperty_in_createMaterializedViewStatement4672);
							cfamProperty(expr.properties);
							state._fsp--;

							}
							break;

						default :
							break loop98;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createMaterializedViewStatement"



	// $ANTLR start "createTriggerStatement"
	// Parser.g:737:1: createTriggerStatement returns [CreateTriggerStatement expr] : K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL ;
	public final CreateTriggerStatement createTriggerStatement() throws RecognitionException {
		CreateTriggerStatement expr = null;


		Token cls=null;
		ColumnIdentifier.Raw name =null;
		CFName cf =null;


		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:741:5: ( K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL )
			// Parser.g:741:7: K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTriggerStatement4710); 
			match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_createTriggerStatement4712); 
			// Parser.g:741:26: ( K_IF K_NOT K_EXISTS )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==K_IF) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// Parser.g:741:27: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTriggerStatement4715); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createTriggerStatement4717); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTriggerStatement4719); 
					 ifNotExists = true; 
					}
					break;

			}

			// Parser.g:741:74: (name= cident )
			// Parser.g:741:75: name= cident
			{
			pushFollow(FOLLOW_cident_in_createTriggerStatement4729);
			name=cident();
			state._fsp--;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createTriggerStatement4740); 
			pushFollow(FOLLOW_columnFamilyName_in_createTriggerStatement4744);
			cf=columnFamilyName();
			state._fsp--;

			match(input,K_USING,FOLLOW_K_USING_in_createTriggerStatement4746); 
			cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createTriggerStatement4750); 
			 expr = new CreateTriggerStatement(cf, name.toString(), (cls!=null?cls.getText():null), ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createTriggerStatement"



	// $ANTLR start "dropTriggerStatement"
	// Parser.g:749:1: dropTriggerStatement returns [DropTriggerStatement expr] : K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName ;
	public final DropTriggerStatement dropTriggerStatement() throws RecognitionException {
		DropTriggerStatement expr = null;


		ColumnIdentifier.Raw name =null;
		CFName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:751:5: ( K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName )
			// Parser.g:751:7: K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTriggerStatement4791); 
			match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_dropTriggerStatement4793); 
			// Parser.g:751:24: ( K_IF K_EXISTS )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==K_IF) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// Parser.g:751:25: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTriggerStatement4796); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTriggerStatement4798); 
					 ifExists = true; 
					}
					break;

			}

			// Parser.g:751:63: (name= cident )
			// Parser.g:751:64: name= cident
			{
			pushFollow(FOLLOW_cident_in_dropTriggerStatement4808);
			name=cident();
			state._fsp--;

			}

			match(input,K_ON,FOLLOW_K_ON_in_dropTriggerStatement4811); 
			pushFollow(FOLLOW_columnFamilyName_in_dropTriggerStatement4815);
			cf=columnFamilyName();
			state._fsp--;

			 expr = new DropTriggerStatement(cf, name.toString(), ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropTriggerStatement"



	// $ANTLR start "alterKeyspaceStatement"
	// Parser.g:758:1: alterKeyspaceStatement returns [AlterKeyspaceStatement expr] : K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] ;
	public final AlterKeyspaceStatement alterKeyspaceStatement() throws RecognitionException {
		AlterKeyspaceStatement expr = null;


		String ks =null;

		 KeyspaceAttributes attrs = new KeyspaceAttributes(); 
		try {
			// Parser.g:760:5: ( K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] )
			// Parser.g:760:7: K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs]
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterKeyspaceStatement4855); 
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement4857); 
			pushFollow(FOLLOW_keyspaceName_in_alterKeyspaceStatement4861);
			ks=keyspaceName();
			state._fsp--;

			match(input,K_WITH,FOLLOW_K_WITH_in_alterKeyspaceStatement4871); 
			pushFollow(FOLLOW_properties_in_alterKeyspaceStatement4873);
			properties(attrs);
			state._fsp--;

			 expr = new AlterKeyspaceStatement(ks, attrs); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterKeyspaceStatement"



	// $ANTLR start "alterTableStatement"
	// Parser.g:772:1: alterTableStatement returns [AlterTableStatement expr] : K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) ;
	public final AlterTableStatement alterTableStatement() throws RecognitionException {
		AlterTableStatement expr = null;


		CFName cf =null;
		ColumnIdentifier.Raw id =null;
		CQL3Type.Raw v =null;
		boolean b1 =false;
		ColumnIdentifier.Raw id1 =null;
		CQL3Type.Raw v1 =null;
		ColumnIdentifier.Raw idn =null;
		CQL3Type.Raw vn =null;
		boolean bn =false;
		ColumnIdentifier.Raw toId1 =null;
		ColumnIdentifier.Raw toIdn =null;


		        AlterTableStatement.Type type = null;
		        TableAttributes attrs = new TableAttributes();
		        Map<ColumnIdentifier.Raw, ColumnIdentifier.Raw> renames = new HashMap<ColumnIdentifier.Raw, ColumnIdentifier.Raw>();
		        List<AlterTableStatementColumn> colNameList = new ArrayList<AlterTableStatementColumn>();
		    
		try {
			// Parser.g:779:5: ( K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) )
			// Parser.g:779:7: K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement4909); 
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_alterTableStatement4911); 
			pushFollow(FOLLOW_columnFamilyName_in_alterTableStatement4915);
			cf=columnFamilyName();
			state._fsp--;

			// Parser.g:780:11: ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
			int alt107=5;
			switch ( input.LA(1) ) {
			case K_ALTER:
				{
				alt107=1;
				}
				break;
			case K_ADD:
				{
				alt107=2;
				}
				break;
			case K_DROP:
				{
				alt107=3;
				}
				break;
			case K_WITH:
				{
				alt107=4;
				}
				break;
			case K_RENAME:
				{
				alt107=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}
			switch (alt107) {
				case 1 :
					// Parser.g:780:13: K_ALTER id= cident K_TYPE v= comparatorType
					{
					match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement4929); 
					pushFollow(FOLLOW_cident_in_alterTableStatement4933);
					id=cident();
					state._fsp--;

					match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTableStatement4936); 
					pushFollow(FOLLOW_comparatorType_in_alterTableStatement4940);
					v=comparatorType();
					state._fsp--;

					 type = AlterTableStatement.Type.ALTER; 
					 colNameList.add(new AlterTableStatementColumn(id,v)); 
					}
					break;
				case 2 :
					// Parser.g:781:13: K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) )
					{
					match(input,K_ADD,FOLLOW_K_ADD_in_alterTableStatement4959); 
					// Parser.g:781:20: ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) )
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==IDENT||(LA103_0 >= K_AGGREGATE && LA103_0 <= K_ALL)||LA103_0==K_AS||LA103_0==K_ASCII||(LA103_0 >= K_BIGINT && LA103_0 <= K_BOOLEAN)||(LA103_0 >= K_CALLED && LA103_0 <= K_CLUSTERING)||(LA103_0 >= K_COMPACT && LA103_0 <= K_COUNTER)||(LA103_0 >= K_CUSTOM && LA103_0 <= K_DECIMAL)||(LA103_0 >= K_DISTINCT && LA103_0 <= K_DOUBLE)||(LA103_0 >= K_EXISTS && LA103_0 <= K_FLOAT)||LA103_0==K_FROZEN||(LA103_0 >= K_FUNCTION && LA103_0 <= K_FUNCTIONS)||LA103_0==K_INET||(LA103_0 >= K_INITCOND && LA103_0 <= K_INPUT)||LA103_0==K_INT||(LA103_0 >= K_JSON && LA103_0 <= K_KEYS)||(LA103_0 >= K_KEYSPACES && LA103_0 <= K_LIKE)||(LA103_0 >= K_LIST && LA103_0 <= K_MAP)||LA103_0==K_NOLOGIN||LA103_0==K_NOSUPERUSER||LA103_0==K_OPTIONS||(LA103_0 >= K_PARTITION && LA103_0 <= K_PERMISSIONS)||LA103_0==K_RETURNS||(LA103_0 >= K_ROLE && LA103_0 <= K_ROLES)||(LA103_0 >= K_SFUNC && LA103_0 <= K_TINYINT)||LA103_0==K_TRIGGER||(LA103_0 >= K_TTL && LA103_0 <= K_TYPE)||(LA103_0 >= K_USER && LA103_0 <= K_USERS)||(LA103_0 >= K_UUID && LA103_0 <= K_VARINT)||LA103_0==K_WRITETIME||LA103_0==QUOTED_NAME) ) {
						alt103=1;
					}
					else if ( (LA103_0==177) ) {
						alt103=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 103, 0, input);
						throw nvae;
					}

					switch (alt103) {
						case 1 :
							// Parser.g:781:29: (id= cident v= comparatorType b1= cfisStatic )
							{
							// Parser.g:781:29: (id= cident v= comparatorType b1= cfisStatic )
							// Parser.g:781:30: id= cident v= comparatorType b1= cfisStatic
							{
							pushFollow(FOLLOW_cident_in_alterTableStatement4974);
							id=cident();
							state._fsp--;

							pushFollow(FOLLOW_comparatorType_in_alterTableStatement4980);
							v=comparatorType();
							state._fsp--;

							pushFollow(FOLLOW_cfisStatic_in_alterTableStatement4986);
							b1=cfisStatic();
							state._fsp--;

							 colNameList.add(new AlterTableStatementColumn(id,v,b1)); 
							}

							}
							break;
						case 2 :
							// Parser.g:782:24: ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' )
							{
							// Parser.g:782:24: ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' )
							// Parser.g:782:25: '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')'
							{
							match(input,177,FOLLOW_177_in_alterTableStatement5015); 
							pushFollow(FOLLOW_cident_in_alterTableStatement5020);
							id1=cident();
							state._fsp--;

							pushFollow(FOLLOW_comparatorType_in_alterTableStatement5025);
							v1=comparatorType();
							state._fsp--;

							pushFollow(FOLLOW_cfisStatic_in_alterTableStatement5030);
							b1=cfisStatic();
							state._fsp--;

							 colNameList.add(new AlterTableStatementColumn(id1,v1,b1)); 
							// Parser.g:783:24: ( ',' idn= cident vn= comparatorType bn= cfisStatic )*
							loop102:
							while (true) {
								int alt102=2;
								int LA102_0 = input.LA(1);
								if ( (LA102_0==180) ) {
									alt102=1;
								}

								switch (alt102) {
								case 1 :
									// Parser.g:783:26: ',' idn= cident vn= comparatorType bn= cfisStatic
									{
									match(input,180,FOLLOW_180_in_alterTableStatement5059); 
									pushFollow(FOLLOW_cident_in_alterTableStatement5063);
									idn=cident();
									state._fsp--;

									pushFollow(FOLLOW_comparatorType_in_alterTableStatement5068);
									vn=comparatorType();
									state._fsp--;

									pushFollow(FOLLOW_cfisStatic_in_alterTableStatement5073);
									bn=cfisStatic();
									state._fsp--;

									 colNameList.add(new AlterTableStatementColumn(idn,vn,bn)); 
									}
									break;

								default :
									break loop102;
								}
							}

							match(input,178,FOLLOW_178_in_alterTableStatement5080); 
							}

							}
							break;

					}

					 type = AlterTableStatement.Type.ADD; 
					}
					break;
				case 3 :
					// Parser.g:784:13: K_DROP (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) )
					{
					match(input,K_DROP,FOLLOW_K_DROP_in_alterTableStatement5100); 
					// Parser.g:784:20: (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) )
					int alt105=2;
					int LA105_0 = input.LA(1);
					if ( (LA105_0==IDENT||(LA105_0 >= K_AGGREGATE && LA105_0 <= K_ALL)||LA105_0==K_AS||LA105_0==K_ASCII||(LA105_0 >= K_BIGINT && LA105_0 <= K_BOOLEAN)||(LA105_0 >= K_CALLED && LA105_0 <= K_CLUSTERING)||(LA105_0 >= K_COMPACT && LA105_0 <= K_COUNTER)||(LA105_0 >= K_CUSTOM && LA105_0 <= K_DECIMAL)||(LA105_0 >= K_DISTINCT && LA105_0 <= K_DOUBLE)||(LA105_0 >= K_EXISTS && LA105_0 <= K_FLOAT)||LA105_0==K_FROZEN||(LA105_0 >= K_FUNCTION && LA105_0 <= K_FUNCTIONS)||LA105_0==K_INET||(LA105_0 >= K_INITCOND && LA105_0 <= K_INPUT)||LA105_0==K_INT||(LA105_0 >= K_JSON && LA105_0 <= K_KEYS)||(LA105_0 >= K_KEYSPACES && LA105_0 <= K_LIKE)||(LA105_0 >= K_LIST && LA105_0 <= K_MAP)||LA105_0==K_NOLOGIN||LA105_0==K_NOSUPERUSER||LA105_0==K_OPTIONS||(LA105_0 >= K_PARTITION && LA105_0 <= K_PERMISSIONS)||LA105_0==K_RETURNS||(LA105_0 >= K_ROLE && LA105_0 <= K_ROLES)||(LA105_0 >= K_SFUNC && LA105_0 <= K_TINYINT)||LA105_0==K_TRIGGER||(LA105_0 >= K_TTL && LA105_0 <= K_TYPE)||(LA105_0 >= K_USER && LA105_0 <= K_USERS)||(LA105_0 >= K_UUID && LA105_0 <= K_VARINT)||LA105_0==K_WRITETIME||LA105_0==QUOTED_NAME) ) {
						alt105=1;
					}
					else if ( (LA105_0==177) ) {
						alt105=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 105, 0, input);
						throw nvae;
					}

					switch (alt105) {
						case 1 :
							// Parser.g:784:30: id= cident
							{
							pushFollow(FOLLOW_cident_in_alterTableStatement5114);
							id=cident();
							state._fsp--;

							 colNameList.add(new AlterTableStatementColumn(id)); 
							}
							break;
						case 2 :
							// Parser.g:785:24: ( '(' id1= cident ( ',' idn= cident )* ')' )
							{
							// Parser.g:785:24: ( '(' id1= cident ( ',' idn= cident )* ')' )
							// Parser.g:785:25: '(' id1= cident ( ',' idn= cident )* ')'
							{
							match(input,177,FOLLOW_177_in_alterTableStatement5143); 
							pushFollow(FOLLOW_cident_in_alterTableStatement5148);
							id1=cident();
							state._fsp--;

							 colNameList.add(new AlterTableStatementColumn(id1)); 
							// Parser.g:786:24: ( ',' idn= cident )*
							loop104:
							while (true) {
								int alt104=2;
								int LA104_0 = input.LA(1);
								if ( (LA104_0==180) ) {
									alt104=1;
								}

								switch (alt104) {
								case 1 :
									// Parser.g:786:26: ',' idn= cident
									{
									match(input,180,FOLLOW_180_in_alterTableStatement5177); 
									pushFollow(FOLLOW_cident_in_alterTableStatement5181);
									idn=cident();
									state._fsp--;

									 colNameList.add(new AlterTableStatementColumn(idn)); 
									}
									break;

								default :
									break loop104;
								}
							}

							match(input,178,FOLLOW_178_in_alterTableStatement5188); 
							}

							}
							break;

					}

					 type = AlterTableStatement.Type.DROP; 
					}
					break;
				case 4 :
					// Parser.g:787:13: K_WITH properties[attrs]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterTableStatement5207); 
					pushFollow(FOLLOW_properties_in_alterTableStatement5210);
					properties(attrs);
					state._fsp--;

					 type = AlterTableStatement.Type.OPTS; 
					}
					break;
				case 5 :
					// Parser.g:788:13: K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )*
					{
					match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTableStatement5243); 
					 type = AlterTableStatement.Type.RENAME; 
					pushFollow(FOLLOW_cident_in_alterTableStatement5297);
					id1=cident();
					state._fsp--;

					match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement5299); 
					pushFollow(FOLLOW_cident_in_alterTableStatement5303);
					toId1=cident();
					state._fsp--;

					 renames.put(id1, toId1); 
					// Parser.g:790:16: ( K_AND idn= cident K_TO toIdn= cident )*
					loop106:
					while (true) {
						int alt106=2;
						int LA106_0 = input.LA(1);
						if ( (LA106_0==K_AND) ) {
							alt106=1;
						}

						switch (alt106) {
						case 1 :
							// Parser.g:790:18: K_AND idn= cident K_TO toIdn= cident
							{
							match(input,K_AND,FOLLOW_K_AND_in_alterTableStatement5324); 
							pushFollow(FOLLOW_cident_in_alterTableStatement5328);
							idn=cident();
							state._fsp--;

							match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement5330); 
							pushFollow(FOLLOW_cident_in_alterTableStatement5334);
							toIdn=cident();
							state._fsp--;

							 renames.put(idn, toIdn); 
							}
							break;

						default :
							break loop106;
						}
					}

					}
					break;

			}


			        expr = new AlterTableStatement(cf, type, colNameList, attrs, renames);
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterTableStatement"



	// $ANTLR start "cfisStatic"
	// Parser.g:797:1: cfisStatic returns [boolean isStaticColumn] : ( K_STATIC )? ;
	public final boolean cfisStatic() throws RecognitionException {
		boolean isStaticColumn = false;



		        boolean isStatic = false;
		    
		try {
			// Parser.g:801:5: ( ( K_STATIC )? )
			// Parser.g:801:7: ( K_STATIC )?
			{
			// Parser.g:801:7: ( K_STATIC )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==K_STATIC) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// Parser.g:801:8: K_STATIC
					{
					match(input,K_STATIC,FOLLOW_K_STATIC_in_cfisStatic5387); 
					 isStatic=true; 
					}
					break;

			}

			 isStaticColumn = isStatic;
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return isStaticColumn;
	}
	// $ANTLR end "cfisStatic"



	// $ANTLR start "alterMaterializedViewStatement"
	// Parser.g:805:1: alterMaterializedViewStatement returns [AlterViewStatement expr] : K_ALTER K_MATERIALIZED K_VIEW name= columnFamilyName K_WITH properties[attrs] ;
	public final AlterViewStatement alterMaterializedViewStatement() throws RecognitionException {
		AlterViewStatement expr = null;


		CFName name =null;


		        TableAttributes attrs = new TableAttributes();
		    
		try {
			// Parser.g:809:5: ( K_ALTER K_MATERIALIZED K_VIEW name= columnFamilyName K_WITH properties[attrs] )
			// Parser.g:809:7: K_ALTER K_MATERIALIZED K_VIEW name= columnFamilyName K_WITH properties[attrs]
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterMaterializedViewStatement5423); 
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_alterMaterializedViewStatement5425); 
			match(input,K_VIEW,FOLLOW_K_VIEW_in_alterMaterializedViewStatement5427); 
			pushFollow(FOLLOW_columnFamilyName_in_alterMaterializedViewStatement5431);
			name=columnFamilyName();
			state._fsp--;

			match(input,K_WITH,FOLLOW_K_WITH_in_alterMaterializedViewStatement5443); 
			pushFollow(FOLLOW_properties_in_alterMaterializedViewStatement5445);
			properties(attrs);
			state._fsp--;


			        expr = new AlterViewStatement(name, attrs);
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterMaterializedViewStatement"



	// $ANTLR start "alterTypeStatement"
	// Parser.g:822:1: alterTypeStatement returns [AlterTypeStatement expr] : K_ALTER K_TYPE name= userTypeName ( K_ALTER f= noncol_ident K_TYPE v= comparatorType | K_ADD f= noncol_ident v= comparatorType | K_RENAME id1= noncol_ident K_TO toId1= noncol_ident ( K_AND idn= noncol_ident K_TO toIdn= noncol_ident )* ) ;
	public final AlterTypeStatement alterTypeStatement() throws RecognitionException {
		AlterTypeStatement expr = null;


		UTName name =null;
		ColumnIdentifier f =null;
		CQL3Type.Raw v =null;
		ColumnIdentifier id1 =null;
		ColumnIdentifier toId1 =null;
		ColumnIdentifier idn =null;
		ColumnIdentifier toIdn =null;

		try {
			// Parser.g:823:5: ( K_ALTER K_TYPE name= userTypeName ( K_ALTER f= noncol_ident K_TYPE v= comparatorType | K_ADD f= noncol_ident v= comparatorType | K_RENAME id1= noncol_ident K_TO toId1= noncol_ident ( K_AND idn= noncol_ident K_TO toIdn= noncol_ident )* ) )
			// Parser.g:823:7: K_ALTER K_TYPE name= userTypeName ( K_ALTER f= noncol_ident K_TYPE v= comparatorType | K_ADD f= noncol_ident v= comparatorType | K_RENAME id1= noncol_ident K_TO toId1= noncol_ident ( K_AND idn= noncol_ident K_TO toIdn= noncol_ident )* )
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement5476); 
			match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement5478); 
			pushFollow(FOLLOW_userTypeName_in_alterTypeStatement5482);
			name=userTypeName();
			state._fsp--;

			// Parser.g:824:11: ( K_ALTER f= noncol_ident K_TYPE v= comparatorType | K_ADD f= noncol_ident v= comparatorType | K_RENAME id1= noncol_ident K_TO toId1= noncol_ident ( K_AND idn= noncol_ident K_TO toIdn= noncol_ident )* )
			int alt110=3;
			switch ( input.LA(1) ) {
			case K_ALTER:
				{
				alt110=1;
				}
				break;
			case K_ADD:
				{
				alt110=2;
				}
				break;
			case K_RENAME:
				{
				alt110=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}
			switch (alt110) {
				case 1 :
					// Parser.g:824:13: K_ALTER f= noncol_ident K_TYPE v= comparatorType
					{
					match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement5496); 
					pushFollow(FOLLOW_noncol_ident_in_alterTypeStatement5500);
					f=noncol_ident();
					state._fsp--;

					match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement5502); 
					pushFollow(FOLLOW_comparatorType_in_alterTypeStatement5506);
					v=comparatorType();
					state._fsp--;

					 expr = AlterTypeStatement.alter(name, f, v); 
					}
					break;
				case 2 :
					// Parser.g:825:13: K_ADD f= noncol_ident v= comparatorType
					{
					match(input,K_ADD,FOLLOW_K_ADD_in_alterTypeStatement5522); 
					pushFollow(FOLLOW_noncol_ident_in_alterTypeStatement5528);
					f=noncol_ident();
					state._fsp--;

					pushFollow(FOLLOW_comparatorType_in_alterTypeStatement5532);
					v=comparatorType();
					state._fsp--;

					 expr = AlterTypeStatement.addition(name, f, v); 
					}
					break;
				case 3 :
					// Parser.g:826:13: K_RENAME id1= noncol_ident K_TO toId1= noncol_ident ( K_AND idn= noncol_ident K_TO toIdn= noncol_ident )*
					{
					match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTypeStatement5555); 
					 Map<ColumnIdentifier, ColumnIdentifier> renames = new HashMap<ColumnIdentifier, ColumnIdentifier>(); 
					pushFollow(FOLLOW_noncol_ident_in_alterTypeStatement5593);
					id1=noncol_ident();
					state._fsp--;

					match(input,K_TO,FOLLOW_K_TO_in_alterTypeStatement5595); 
					pushFollow(FOLLOW_noncol_ident_in_alterTypeStatement5599);
					toId1=noncol_ident();
					state._fsp--;

					 renames.put(id1, toId1); 
					// Parser.g:829:18: ( K_AND idn= noncol_ident K_TO toIdn= noncol_ident )*
					loop109:
					while (true) {
						int alt109=2;
						int LA109_0 = input.LA(1);
						if ( (LA109_0==K_AND) ) {
							alt109=1;
						}

						switch (alt109) {
						case 1 :
							// Parser.g:829:20: K_AND idn= noncol_ident K_TO toIdn= noncol_ident
							{
							match(input,K_AND,FOLLOW_K_AND_in_alterTypeStatement5622); 
							pushFollow(FOLLOW_noncol_ident_in_alterTypeStatement5626);
							idn=noncol_ident();
							state._fsp--;

							match(input,K_TO,FOLLOW_K_TO_in_alterTypeStatement5628); 
							pushFollow(FOLLOW_noncol_ident_in_alterTypeStatement5632);
							toIdn=noncol_ident();
							state._fsp--;

							 renames.put(idn, toIdn); 
							}
							break;

						default :
							break loop109;
						}
					}

					 expr = AlterTypeStatement.renames(name, renames); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterTypeStatement"



	// $ANTLR start "dropKeyspaceStatement"
	// Parser.g:838:1: dropKeyspaceStatement returns [DropKeyspaceStatement ksp] : K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName ;
	public final DropKeyspaceStatement dropKeyspaceStatement() throws RecognitionException {
		DropKeyspaceStatement ksp = null;


		String ks =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:840:5: ( K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName )
			// Parser.g:840:7: K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropKeyspaceStatement5699); 
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement5701); 
			// Parser.g:840:25: ( K_IF K_EXISTS )?
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==K_IF) ) {
				alt111=1;
			}
			switch (alt111) {
				case 1 :
					// Parser.g:840:26: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropKeyspaceStatement5704); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropKeyspaceStatement5706); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_keyspaceName_in_dropKeyspaceStatement5715);
			ks=keyspaceName();
			state._fsp--;

			 ksp = new DropKeyspaceStatement(ks, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ksp;
	}
	// $ANTLR end "dropKeyspaceStatement"



	// $ANTLR start "dropTableStatement"
	// Parser.g:846:1: dropTableStatement returns [DropTableStatement stmt] : K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName ;
	public final DropTableStatement dropTableStatement() throws RecognitionException {
		DropTableStatement stmt = null;


		CFName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:848:5: ( K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName )
			// Parser.g:848:7: K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTableStatement5749); 
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dropTableStatement5751); 
			// Parser.g:848:29: ( K_IF K_EXISTS )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==K_IF) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// Parser.g:848:30: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTableStatement5754); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTableStatement5756); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_dropTableStatement5765);
			cf=columnFamilyName();
			state._fsp--;

			 stmt = new DropTableStatement(cf, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTableStatement"



	// $ANTLR start "dropTypeStatement"
	// Parser.g:854:1: dropTypeStatement returns [DropTypeStatement stmt] : K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName ;
	public final DropTypeStatement dropTypeStatement() throws RecognitionException {
		DropTypeStatement stmt = null;


		UTName name =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:856:5: ( K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName )
			// Parser.g:856:7: K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTypeStatement5799); 
			match(input,K_TYPE,FOLLOW_K_TYPE_in_dropTypeStatement5801); 
			// Parser.g:856:21: ( K_IF K_EXISTS )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==K_IF) ) {
				alt113=1;
			}
			switch (alt113) {
				case 1 :
					// Parser.g:856:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTypeStatement5804); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTypeStatement5806); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_userTypeName_in_dropTypeStatement5815);
			name=userTypeName();
			state._fsp--;

			 stmt = new DropTypeStatement(name, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTypeStatement"



	// $ANTLR start "dropIndexStatement"
	// Parser.g:862:1: dropIndexStatement returns [DropIndexStatement expr] : K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName ;
	public final DropIndexStatement dropIndexStatement() throws RecognitionException {
		DropIndexStatement expr = null;


		IndexName index =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:864:5: ( K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName )
			// Parser.g:864:7: K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropIndexStatement5849); 
			match(input,K_INDEX,FOLLOW_K_INDEX_in_dropIndexStatement5851); 
			// Parser.g:864:22: ( K_IF K_EXISTS )?
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==K_IF) ) {
				alt114=1;
			}
			switch (alt114) {
				case 1 :
					// Parser.g:864:23: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropIndexStatement5854); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropIndexStatement5856); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_indexName_in_dropIndexStatement5865);
			index=indexName();
			state._fsp--;

			 expr = new DropIndexStatement(index, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropIndexStatement"



	// $ANTLR start "dropMaterializedViewStatement"
	// Parser.g:871:1: dropMaterializedViewStatement returns [DropViewStatement expr] : K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName ;
	public final DropViewStatement dropMaterializedViewStatement() throws RecognitionException {
		DropViewStatement expr = null;


		CFName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:873:5: ( K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName )
			// Parser.g:873:7: K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropMaterializedViewStatement5905); 
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_dropMaterializedViewStatement5907); 
			match(input,K_VIEW,FOLLOW_K_VIEW_in_dropMaterializedViewStatement5909); 
			// Parser.g:873:36: ( K_IF K_EXISTS )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==K_IF) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// Parser.g:873:37: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropMaterializedViewStatement5912); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropMaterializedViewStatement5914); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_dropMaterializedViewStatement5923);
			cf=columnFamilyName();
			state._fsp--;

			 expr = new DropViewStatement(cf, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropMaterializedViewStatement"



	// $ANTLR start "truncateStatement"
	// Parser.g:880:1: truncateStatement returns [TruncateStatement stmt] : K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName ;
	public final TruncateStatement truncateStatement() throws RecognitionException {
		TruncateStatement stmt = null;


		CFName cf =null;

		try {
			// Parser.g:881:5: ( K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName )
			// Parser.g:881:7: K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName
			{
			match(input,K_TRUNCATE,FOLLOW_K_TRUNCATE_in_truncateStatement5954); 
			// Parser.g:881:18: ( K_COLUMNFAMILY )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==K_COLUMNFAMILY) ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// Parser.g:881:19: K_COLUMNFAMILY
					{
					match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_truncateStatement5957); 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_truncateStatement5963);
			cf=columnFamilyName();
			state._fsp--;

			 stmt = new TruncateStatement(cf); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "truncateStatement"



	// $ANTLR start "grantPermissionsStatement"
	// Parser.g:887:1: grantPermissionsStatement returns [GrantPermissionsStatement stmt] : K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName ;
	public final GrantPermissionsStatement grantPermissionsStatement() throws RecognitionException {
		GrantPermissionsStatement stmt = null;


		RoleName grantee =null;
		Set<Permission> permissionOrAll1 =null;
		IResource resource2 =null;

		try {
			// Parser.g:888:5: ( K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName )
			// Parser.g:888:7: K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName
			{
			match(input,K_GRANT,FOLLOW_K_GRANT_in_grantPermissionsStatement5988); 
			pushFollow(FOLLOW_permissionOrAll_in_grantPermissionsStatement6000);
			permissionOrAll1=permissionOrAll();
			state._fsp--;

			match(input,K_ON,FOLLOW_K_ON_in_grantPermissionsStatement6008); 
			pushFollow(FOLLOW_resource_in_grantPermissionsStatement6020);
			resource2=resource();
			state._fsp--;

			match(input,K_TO,FOLLOW_K_TO_in_grantPermissionsStatement6028); 
			pushFollow(FOLLOW_userOrRoleName_in_grantPermissionsStatement6042);
			grantee=userOrRoleName();
			state._fsp--;

			 stmt = new GrantPermissionsStatement(filterPermissions(permissionOrAll1, resource2), resource2, grantee); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "grantPermissionsStatement"



	// $ANTLR start "revokePermissionsStatement"
	// Parser.g:900:1: revokePermissionsStatement returns [RevokePermissionsStatement stmt] : K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName ;
	public final RevokePermissionsStatement revokePermissionsStatement() throws RecognitionException {
		RevokePermissionsStatement stmt = null;


		RoleName revokee =null;
		Set<Permission> permissionOrAll3 =null;
		IResource resource4 =null;

		try {
			// Parser.g:901:5: ( K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName )
			// Parser.g:901:7: K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName
			{
			match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokePermissionsStatement6073); 
			pushFollow(FOLLOW_permissionOrAll_in_revokePermissionsStatement6085);
			permissionOrAll3=permissionOrAll();
			state._fsp--;

			match(input,K_ON,FOLLOW_K_ON_in_revokePermissionsStatement6093); 
			pushFollow(FOLLOW_resource_in_revokePermissionsStatement6105);
			resource4=resource();
			state._fsp--;

			match(input,K_FROM,FOLLOW_K_FROM_in_revokePermissionsStatement6113); 
			pushFollow(FOLLOW_userOrRoleName_in_revokePermissionsStatement6127);
			revokee=userOrRoleName();
			state._fsp--;

			 stmt = new RevokePermissionsStatement(filterPermissions(permissionOrAll3, resource4), resource4, revokee); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "revokePermissionsStatement"



	// $ANTLR start "grantRoleStatement"
	// Parser.g:913:1: grantRoleStatement returns [GrantRoleStatement stmt] : K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName ;
	public final GrantRoleStatement grantRoleStatement() throws RecognitionException {
		GrantRoleStatement stmt = null;


		RoleName role =null;
		RoleName grantee =null;

		try {
			// Parser.g:914:5: ( K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName )
			// Parser.g:914:7: K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName
			{
			match(input,K_GRANT,FOLLOW_K_GRANT_in_grantRoleStatement6158); 
			pushFollow(FOLLOW_userOrRoleName_in_grantRoleStatement6172);
			role=userOrRoleName();
			state._fsp--;

			match(input,K_TO,FOLLOW_K_TO_in_grantRoleStatement6180); 
			pushFollow(FOLLOW_userOrRoleName_in_grantRoleStatement6194);
			grantee=userOrRoleName();
			state._fsp--;

			 stmt = new GrantRoleStatement(role, grantee); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "grantRoleStatement"



	// $ANTLR start "revokeRoleStatement"
	// Parser.g:924:1: revokeRoleStatement returns [RevokeRoleStatement stmt] : K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName ;
	public final RevokeRoleStatement revokeRoleStatement() throws RecognitionException {
		RevokeRoleStatement stmt = null;


		RoleName role =null;
		RoleName revokee =null;

		try {
			// Parser.g:925:5: ( K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName )
			// Parser.g:925:7: K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName
			{
			match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokeRoleStatement6225); 
			pushFollow(FOLLOW_userOrRoleName_in_revokeRoleStatement6239);
			role=userOrRoleName();
			state._fsp--;

			match(input,K_FROM,FOLLOW_K_FROM_in_revokeRoleStatement6247); 
			pushFollow(FOLLOW_userOrRoleName_in_revokeRoleStatement6261);
			revokee=userOrRoleName();
			state._fsp--;

			 stmt = new RevokeRoleStatement(role, revokee); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "revokeRoleStatement"



	// $ANTLR start "listPermissionsStatement"
	// Parser.g:932:1: listPermissionsStatement returns [ListPermissionsStatement stmt] : K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? ;
	public final ListPermissionsStatement listPermissionsStatement() throws RecognitionException {
		ListPermissionsStatement stmt = null;


		IResource resource5 =null;
		Set<Permission> permissionOrAll6 =null;


		        IResource resource = null;
		        boolean recursive = true;
		        RoleName grantee = new RoleName();
		    
		try {
			// Parser.g:938:5: ( K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? )
			// Parser.g:938:7: K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )?
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listPermissionsStatement6299); 
			pushFollow(FOLLOW_permissionOrAll_in_listPermissionsStatement6311);
			permissionOrAll6=permissionOrAll();
			state._fsp--;

			// Parser.g:940:7: ( K_ON resource )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==K_ON) ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// Parser.g:940:9: K_ON resource
					{
					match(input,K_ON,FOLLOW_K_ON_in_listPermissionsStatement6321); 
					pushFollow(FOLLOW_resource_in_listPermissionsStatement6323);
					resource5=resource();
					state._fsp--;

					 resource = resource5; 
					}
					break;

			}

			// Parser.g:941:7: ( K_OF roleName[grantee] )?
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==K_OF) ) {
				alt118=1;
			}
			switch (alt118) {
				case 1 :
					// Parser.g:941:9: K_OF roleName[grantee]
					{
					match(input,K_OF,FOLLOW_K_OF_in_listPermissionsStatement6338); 
					pushFollow(FOLLOW_roleName_in_listPermissionsStatement6340);
					roleName(grantee);
					state._fsp--;

					}
					break;

			}

			// Parser.g:942:7: ( K_NORECURSIVE )?
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==K_NORECURSIVE) ) {
				alt119=1;
			}
			switch (alt119) {
				case 1 :
					// Parser.g:942:9: K_NORECURSIVE
					{
					match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listPermissionsStatement6354); 
					 recursive = false; 
					}
					break;

			}

			 stmt = new ListPermissionsStatement(permissionOrAll6, resource, grantee, recursive); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listPermissionsStatement"



	// $ANTLR start "permission"
	// Parser.g:946:1: permission returns [Permission perm] : p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE ) ;
	public final Permission permission() throws RecognitionException {
		Permission perm = null;


		Token p=null;

		try {
			// Parser.g:947:5: (p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE ) )
			// Parser.g:947:7: p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE )
			{
			p=input.LT(1);
			if ( input.LA(1)==K_ALTER||input.LA(1)==K_AUTHORIZE||input.LA(1)==K_CREATE||input.LA(1)==K_DESCRIBE||input.LA(1)==K_DROP||input.LA(1)==K_EXECUTE||input.LA(1)==K_MODIFY||input.LA(1)==K_SELECT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			 perm = Permission.valueOf((p!=null?p.getText():null).toUpperCase()); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return perm;
	}
	// $ANTLR end "permission"



	// $ANTLR start "permissionOrAll"
	// Parser.g:951:1: permissionOrAll returns [Set<Permission> perms] : ( K_ALL ( K_PERMISSIONS )? |p= permission ( K_PERMISSION )? );
	public final Set<Permission> permissionOrAll() throws RecognitionException {
		Set<Permission> perms = null;


		Permission p =null;

		try {
			// Parser.g:952:5: ( K_ALL ( K_PERMISSIONS )? |p= permission ( K_PERMISSION )? )
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==K_ALL) ) {
				alt122=1;
			}
			else if ( (LA122_0==K_ALTER||LA122_0==K_AUTHORIZE||LA122_0==K_CREATE||LA122_0==K_DESCRIBE||LA122_0==K_DROP||LA122_0==K_EXECUTE||LA122_0==K_MODIFY||LA122_0==K_SELECT) ) {
				alt122=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 122, 0, input);
				throw nvae;
			}

			switch (alt122) {
				case 1 :
					// Parser.g:952:7: K_ALL ( K_PERMISSIONS )?
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_permissionOrAll6447); 
					// Parser.g:952:13: ( K_PERMISSIONS )?
					int alt120=2;
					int LA120_0 = input.LA(1);
					if ( (LA120_0==K_PERMISSIONS) ) {
						alt120=1;
					}
					switch (alt120) {
						case 1 :
							// Parser.g:952:15: K_PERMISSIONS
							{
							match(input,K_PERMISSIONS,FOLLOW_K_PERMISSIONS_in_permissionOrAll6451); 
							}
							break;

					}

					 perms = Permission.ALL; 
					}
					break;
				case 2 :
					// Parser.g:953:7: p= permission ( K_PERMISSION )?
					{
					pushFollow(FOLLOW_permission_in_permissionOrAll6472);
					p=permission();
					state._fsp--;

					// Parser.g:953:20: ( K_PERMISSION )?
					int alt121=2;
					int LA121_0 = input.LA(1);
					if ( (LA121_0==K_PERMISSION) ) {
						alt121=1;
					}
					switch (alt121) {
						case 1 :
							// Parser.g:953:22: K_PERMISSION
							{
							match(input,K_PERMISSION,FOLLOW_K_PERMISSION_in_permissionOrAll6476); 
							}
							break;

					}

					 perms = EnumSet.of(p); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return perms;
	}
	// $ANTLR end "permissionOrAll"



	// $ANTLR start "resource"
	// Parser.g:956:1: resource returns [IResource res] : (d= dataResource |r= roleResource |f= functionResource |j= jmxResource );
	public final IResource resource() throws RecognitionException {
		IResource res = null;


		DataResource d =null;
		RoleResource r =null;
		FunctionResource f =null;
		JMXResource j =null;

		try {
			// Parser.g:957:5: (d= dataResource |r= roleResource |f= functionResource |j= jmxResource )
			int alt123=4;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				switch ( input.LA(2) ) {
				case EOF:
				case K_FROM:
				case K_KEYSPACES:
				case K_NORECURSIVE:
				case K_OF:
				case K_TO:
				case 182:
				case 184:
					{
					alt123=1;
					}
					break;
				case K_ROLES:
					{
					alt123=2;
					}
					break;
				case K_FUNCTIONS:
					{
					alt123=3;
					}
					break;
				case K_MBEANS:
					{
					alt123=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 123, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case IDENT:
			case K_AGGREGATE:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACE:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QMARK:
			case QUOTED_NAME:
				{
				alt123=1;
				}
				break;
			case K_ROLE:
				{
				int LA123_3 = input.LA(2);
				if ( (LA123_3==EOF||LA123_3==K_FROM||LA123_3==K_NORECURSIVE||LA123_3==K_OF||LA123_3==K_TO||LA123_3==182||LA123_3==184) ) {
					alt123=1;
				}
				else if ( (LA123_3==IDENT||(LA123_3 >= K_AGGREGATE && LA123_3 <= K_ALL)||LA123_3==K_AS||LA123_3==K_ASCII||(LA123_3 >= K_BIGINT && LA123_3 <= K_BOOLEAN)||(LA123_3 >= K_CALLED && LA123_3 <= K_CLUSTERING)||(LA123_3 >= K_COMPACT && LA123_3 <= K_COUNTER)||(LA123_3 >= K_CUSTOM && LA123_3 <= K_DECIMAL)||(LA123_3 >= K_DISTINCT && LA123_3 <= K_DOUBLE)||(LA123_3 >= K_EXISTS && LA123_3 <= K_FLOAT)||LA123_3==K_FROZEN||(LA123_3 >= K_FUNCTION && LA123_3 <= K_FUNCTIONS)||LA123_3==K_INET||(LA123_3 >= K_INITCOND && LA123_3 <= K_INPUT)||LA123_3==K_INT||(LA123_3 >= K_JSON && LA123_3 <= K_KEYS)||(LA123_3 >= K_KEYSPACES && LA123_3 <= K_LIKE)||(LA123_3 >= K_LIST && LA123_3 <= K_MAP)||LA123_3==K_NOLOGIN||LA123_3==K_NOSUPERUSER||LA123_3==K_OPTIONS||(LA123_3 >= K_PARTITION && LA123_3 <= K_PERMISSIONS)||LA123_3==K_RETURNS||(LA123_3 >= K_ROLE && LA123_3 <= K_ROLES)||(LA123_3 >= K_SFUNC && LA123_3 <= K_TINYINT)||LA123_3==K_TRIGGER||(LA123_3 >= K_TTL && LA123_3 <= K_TYPE)||(LA123_3 >= K_USER && LA123_3 <= K_USERS)||(LA123_3 >= K_UUID && LA123_3 <= K_VARINT)||LA123_3==K_WRITETIME||(LA123_3 >= QMARK && LA123_3 <= QUOTED_NAME)||LA123_3==STRING_LITERAL) ) {
					alt123=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 123, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_FUNCTION:
				{
				int LA123_4 = input.LA(2);
				if ( (LA123_4==EOF||LA123_4==K_FROM||LA123_4==K_NORECURSIVE||LA123_4==K_OF||LA123_4==K_TO||LA123_4==182||LA123_4==184) ) {
					alt123=1;
				}
				else if ( (LA123_4==IDENT||(LA123_4 >= K_AGGREGATE && LA123_4 <= K_ALL)||LA123_4==K_AS||LA123_4==K_ASCII||(LA123_4 >= K_BIGINT && LA123_4 <= K_BOOLEAN)||(LA123_4 >= K_CALLED && LA123_4 <= K_CLUSTERING)||(LA123_4 >= K_COMPACT && LA123_4 <= K_COUNTER)||(LA123_4 >= K_CUSTOM && LA123_4 <= K_DECIMAL)||(LA123_4 >= K_DISTINCT && LA123_4 <= K_DOUBLE)||(LA123_4 >= K_EXISTS && LA123_4 <= K_FLOAT)||LA123_4==K_FROZEN||(LA123_4 >= K_FUNCTION && LA123_4 <= K_FUNCTIONS)||LA123_4==K_INET||(LA123_4 >= K_INITCOND && LA123_4 <= K_INPUT)||LA123_4==K_INT||(LA123_4 >= K_JSON && LA123_4 <= K_KEYS)||(LA123_4 >= K_KEYSPACES && LA123_4 <= K_LIKE)||(LA123_4 >= K_LIST && LA123_4 <= K_MAP)||LA123_4==K_NOLOGIN||LA123_4==K_NOSUPERUSER||LA123_4==K_OPTIONS||(LA123_4 >= K_PARTITION && LA123_4 <= K_PERMISSIONS)||LA123_4==K_RETURNS||(LA123_4 >= K_ROLE && LA123_4 <= K_ROLES)||(LA123_4 >= K_SFUNC && LA123_4 <= K_TINYINT)||(LA123_4 >= K_TOKEN && LA123_4 <= K_TRIGGER)||(LA123_4 >= K_TTL && LA123_4 <= K_TYPE)||(LA123_4 >= K_USER && LA123_4 <= K_USERS)||(LA123_4 >= K_UUID && LA123_4 <= K_VARINT)||LA123_4==K_WRITETIME||(LA123_4 >= QMARK && LA123_4 <= QUOTED_NAME)) ) {
					alt123=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 123, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_MBEAN:
			case K_MBEANS:
				{
				alt123=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 123, 0, input);
				throw nvae;
			}
			switch (alt123) {
				case 1 :
					// Parser.g:957:7: d= dataResource
					{
					pushFollow(FOLLOW_dataResource_in_resource6504);
					d=dataResource();
					state._fsp--;

					 res = d; 
					}
					break;
				case 2 :
					// Parser.g:958:7: r= roleResource
					{
					pushFollow(FOLLOW_roleResource_in_resource6516);
					r=roleResource();
					state._fsp--;

					 res = r; 
					}
					break;
				case 3 :
					// Parser.g:959:7: f= functionResource
					{
					pushFollow(FOLLOW_functionResource_in_resource6528);
					f=functionResource();
					state._fsp--;

					 res = f; 
					}
					break;
				case 4 :
					// Parser.g:960:7: j= jmxResource
					{
					pushFollow(FOLLOW_jmxResource_in_resource6540);
					j=jmxResource();
					state._fsp--;

					 res = j; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "resource"



	// $ANTLR start "dataResource"
	// Parser.g:963:1: dataResource returns [DataResource res] : ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName );
	public final DataResource dataResource() throws RecognitionException {
		DataResource res = null;


		String ks =null;
		CFName cf =null;

		try {
			// Parser.g:964:5: ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName )
			int alt125=3;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				int LA125_1 = input.LA(2);
				if ( (LA125_1==K_KEYSPACES) ) {
					alt125=1;
				}
				else if ( (LA125_1==EOF||LA125_1==K_FROM||LA125_1==K_NORECURSIVE||LA125_1==K_OF||LA125_1==K_TO||LA125_1==182||LA125_1==184) ) {
					alt125=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 125, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_KEYSPACE:
				{
				alt125=2;
				}
				break;
			case IDENT:
			case K_AGGREGATE:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QMARK:
			case QUOTED_NAME:
				{
				alt125=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}
			switch (alt125) {
				case 1 :
					// Parser.g:964:7: K_ALL K_KEYSPACES
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_dataResource6563); 
					match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_dataResource6565); 
					 res = DataResource.root(); 
					}
					break;
				case 2 :
					// Parser.g:965:7: K_KEYSPACE ks= keyspaceName
					{
					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dataResource6575); 
					pushFollow(FOLLOW_keyspaceName_in_dataResource6581);
					ks=keyspaceName();
					state._fsp--;

					 res = DataResource.keyspace(ks); 
					}
					break;
				case 3 :
					// Parser.g:966:7: ( K_COLUMNFAMILY )? cf= columnFamilyName
					{
					// Parser.g:966:7: ( K_COLUMNFAMILY )?
					int alt124=2;
					int LA124_0 = input.LA(1);
					if ( (LA124_0==K_COLUMNFAMILY) ) {
						alt124=1;
					}
					switch (alt124) {
						case 1 :
							// Parser.g:966:9: K_COLUMNFAMILY
							{
							match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dataResource6593); 
							}
							break;

					}

					pushFollow(FOLLOW_columnFamilyName_in_dataResource6602);
					cf=columnFamilyName();
					state._fsp--;

					 res = DataResource.table(cf.getKeyspace(), cf.getColumnFamily()); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "dataResource"



	// $ANTLR start "jmxResource"
	// Parser.g:970:1: jmxResource returns [JMXResource res] : ( K_ALL K_MBEANS | K_MBEAN mbean | K_MBEANS mbean );
	public final JMXResource jmxResource() throws RecognitionException {
		JMXResource res = null;


		ParserRuleReturnScope mbean7 =null;
		ParserRuleReturnScope mbean8 =null;

		try {
			// Parser.g:971:5: ( K_ALL K_MBEANS | K_MBEAN mbean | K_MBEANS mbean )
			int alt126=3;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				alt126=1;
				}
				break;
			case K_MBEAN:
				{
				alt126=2;
				}
				break;
			case K_MBEANS:
				{
				alt126=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 126, 0, input);
				throw nvae;
			}
			switch (alt126) {
				case 1 :
					// Parser.g:971:7: K_ALL K_MBEANS
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_jmxResource6631); 
					match(input,K_MBEANS,FOLLOW_K_MBEANS_in_jmxResource6633); 
					 res = JMXResource.root(); 
					}
					break;
				case 2 :
					// Parser.g:974:7: K_MBEAN mbean
					{
					match(input,K_MBEAN,FOLLOW_K_MBEAN_in_jmxResource6653); 
					pushFollow(FOLLOW_mbean_in_jmxResource6655);
					mbean7=mbean();
					state._fsp--;

					 res = JMXResource.mbean(canonicalizeObjectName((mbean7!=null?input.toString(mbean7.start,mbean7.stop):null), false)); 
					}
					break;
				case 3 :
					// Parser.g:975:7: K_MBEANS mbean
					{
					match(input,K_MBEANS,FOLLOW_K_MBEANS_in_jmxResource6665); 
					pushFollow(FOLLOW_mbean_in_jmxResource6667);
					mbean8=mbean();
					state._fsp--;

					 res = JMXResource.mbean(canonicalizeObjectName((mbean8!=null?input.toString(mbean8.start,mbean8.stop):null), true)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "jmxResource"



	// $ANTLR start "roleResource"
	// Parser.g:978:1: roleResource returns [RoleResource res] : ( K_ALL K_ROLES | K_ROLE role= userOrRoleName );
	public final RoleResource roleResource() throws RecognitionException {
		RoleResource res = null;


		RoleName role =null;

		try {
			// Parser.g:979:5: ( K_ALL K_ROLES | K_ROLE role= userOrRoleName )
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==K_ALL) ) {
				alt127=1;
			}
			else if ( (LA127_0==K_ROLE) ) {
				alt127=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 127, 0, input);
				throw nvae;
			}

			switch (alt127) {
				case 1 :
					// Parser.g:979:7: K_ALL K_ROLES
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_roleResource6690); 
					match(input,K_ROLES,FOLLOW_K_ROLES_in_roleResource6692); 
					 res = RoleResource.root(); 
					}
					break;
				case 2 :
					// Parser.g:980:7: K_ROLE role= userOrRoleName
					{
					match(input,K_ROLE,FOLLOW_K_ROLE_in_roleResource6702); 
					pushFollow(FOLLOW_userOrRoleName_in_roleResource6708);
					role=userOrRoleName();
					state._fsp--;

					 res = RoleResource.role(role.getName()); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "roleResource"



	// $ANTLR start "functionResource"
	// Parser.g:983:1: functionResource returns [FunctionResource res] : ( K_ALL K_FUNCTIONS | K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName | K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' ) );
	public final FunctionResource functionResource() throws RecognitionException {
		FunctionResource res = null;


		String ks =null;
		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		    
		try {
			// Parser.g:987:5: ( K_ALL K_FUNCTIONS | K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName | K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' ) )
			int alt130=3;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==K_ALL) ) {
				int LA130_1 = input.LA(2);
				if ( (LA130_1==K_FUNCTIONS) ) {
					int LA130_3 = input.LA(3);
					if ( (LA130_3==K_IN) ) {
						alt130=2;
					}
					else if ( (LA130_3==EOF||LA130_3==K_FROM||LA130_3==K_NORECURSIVE||LA130_3==K_OF||LA130_3==K_TO||LA130_3==184) ) {
						alt130=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 130, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA130_0==K_FUNCTION) ) {
				alt130=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 130, 0, input);
				throw nvae;
			}

			switch (alt130) {
				case 1 :
					// Parser.g:987:7: K_ALL K_FUNCTIONS
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_functionResource6740); 
					match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_functionResource6742); 
					 res = FunctionResource.root(); 
					}
					break;
				case 2 :
					// Parser.g:988:7: K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_functionResource6752); 
					match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_functionResource6754); 
					match(input,K_IN,FOLLOW_K_IN_in_functionResource6756); 
					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_functionResource6758); 
					pushFollow(FOLLOW_keyspaceName_in_functionResource6764);
					ks=keyspaceName();
					state._fsp--;

					 res = FunctionResource.keyspace(ks); 
					}
					break;
				case 3 :
					// Parser.g:990:7: K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )
					{
					match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_functionResource6779); 
					pushFollow(FOLLOW_functionName_in_functionResource6783);
					fn=functionName();
					state._fsp--;

					// Parser.g:991:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )
					// Parser.g:992:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,177,FOLLOW_177_in_functionResource6801); 
					// Parser.g:993:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt129=2;
					int LA129_0 = input.LA(1);
					if ( (LA129_0==IDENT||(LA129_0 >= K_AGGREGATE && LA129_0 <= K_ALL)||LA129_0==K_AS||LA129_0==K_ASCII||(LA129_0 >= K_BIGINT && LA129_0 <= K_BOOLEAN)||(LA129_0 >= K_CALLED && LA129_0 <= K_CLUSTERING)||(LA129_0 >= K_COMPACT && LA129_0 <= K_COUNTER)||(LA129_0 >= K_CUSTOM && LA129_0 <= K_DECIMAL)||(LA129_0 >= K_DISTINCT && LA129_0 <= K_DOUBLE)||(LA129_0 >= K_EXISTS && LA129_0 <= K_FLOAT)||LA129_0==K_FROZEN||(LA129_0 >= K_FUNCTION && LA129_0 <= K_FUNCTIONS)||LA129_0==K_INET||(LA129_0 >= K_INITCOND && LA129_0 <= K_INPUT)||LA129_0==K_INT||(LA129_0 >= K_JSON && LA129_0 <= K_KEYS)||(LA129_0 >= K_KEYSPACES && LA129_0 <= K_LIKE)||(LA129_0 >= K_LIST && LA129_0 <= K_MAP)||LA129_0==K_NOLOGIN||LA129_0==K_NOSUPERUSER||LA129_0==K_OPTIONS||(LA129_0 >= K_PARTITION && LA129_0 <= K_PERMISSIONS)||LA129_0==K_RETURNS||(LA129_0 >= K_ROLE && LA129_0 <= K_ROLES)||(LA129_0 >= K_SET && LA129_0 <= K_TINYINT)||LA129_0==K_TRIGGER||(LA129_0 >= K_TTL && LA129_0 <= K_TYPE)||(LA129_0 >= K_USER && LA129_0 <= K_USERS)||(LA129_0 >= K_UUID && LA129_0 <= K_VARINT)||LA129_0==K_WRITETIME||LA129_0==QUOTED_NAME||LA129_0==STRING_LITERAL) ) {
						alt129=1;
					}
					switch (alt129) {
						case 1 :
							// Parser.g:994:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_functionResource6829);
							v=comparatorType();
							state._fsp--;

							 argsTypes.add(v); 
							// Parser.g:995:13: ( ',' v= comparatorType )*
							loop128:
							while (true) {
								int alt128=2;
								int LA128_0 = input.LA(1);
								if ( (LA128_0==180) ) {
									alt128=1;
								}

								switch (alt128) {
								case 1 :
									// Parser.g:995:15: ',' v= comparatorType
									{
									match(input,180,FOLLOW_180_in_functionResource6847); 
									pushFollow(FOLLOW_comparatorType_in_functionResource6851);
									v=comparatorType();
									state._fsp--;

									 argsTypes.add(v); 
									}
									break;

								default :
									break loop128;
								}
							}

							}
							break;

					}

					match(input,178,FOLLOW_178_in_functionResource6879); 
					}

					 res = FunctionResource.functionFromCql(fn.keyspace, fn.name, argsTypes); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "functionResource"



	// $ANTLR start "createUserStatement"
	// Parser.g:1005:1: createUserStatement returns [CreateRoleStatement stmt] : K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
	public final CreateRoleStatement createUserStatement() throws RecognitionException {
		CreateRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        RoleOptions opts = new RoleOptions();
		        opts.setOption(IRoleManager.Option.LOGIN, true);
		        boolean superuser = false;
		        boolean ifNotExists = false;
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1013:5: ( K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
			// Parser.g:1013:7: K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createUserStatement6927); 
			match(input,K_USER,FOLLOW_K_USER_in_createUserStatement6929); 
			// Parser.g:1013:23: ( K_IF K_NOT K_EXISTS )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==K_IF) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// Parser.g:1013:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createUserStatement6932); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createUserStatement6934); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createUserStatement6936); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_username_in_createUserStatement6944);
			u=username();
			state._fsp--;

			 name.setName((u!=null?input.toString(u.start,u.stop):null), true); 
			// Parser.g:1014:7: ( K_WITH userPassword[opts] )?
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==K_WITH) ) {
				alt132=1;
			}
			switch (alt132) {
				case 1 :
					// Parser.g:1014:9: K_WITH userPassword[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createUserStatement6956); 
					pushFollow(FOLLOW_userPassword_in_createUserStatement6958);
					userPassword(opts);
					state._fsp--;

					}
					break;

			}

			// Parser.g:1015:7: ( K_SUPERUSER | K_NOSUPERUSER )?
			int alt133=3;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==K_SUPERUSER) ) {
				alt133=1;
			}
			else if ( (LA133_0==K_NOSUPERUSER) ) {
				alt133=2;
			}
			switch (alt133) {
				case 1 :
					// Parser.g:1015:9: K_SUPERUSER
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_createUserStatement6972); 
					 superuser = true; 
					}
					break;
				case 2 :
					// Parser.g:1015:45: K_NOSUPERUSER
					{
					match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_createUserStatement6978); 
					 superuser = false; 
					}
					break;

			}

			 opts.setOption(IRoleManager.Option.SUPERUSER, superuser);
			        stmt = new CreateRoleStatement(name, opts, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createUserStatement"



	// $ANTLR start "alterUserStatement"
	// Parser.g:1023:1: alterUserStatement returns [AlterRoleStatement stmt] : K_ALTER K_USER u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
	public final AlterRoleStatement alterUserStatement() throws RecognitionException {
		AlterRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        RoleOptions opts = new RoleOptions();
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1028:5: ( K_ALTER K_USER u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
			// Parser.g:1028:7: K_ALTER K_USER u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterUserStatement7023); 
			match(input,K_USER,FOLLOW_K_USER_in_alterUserStatement7025); 
			pushFollow(FOLLOW_username_in_alterUserStatement7029);
			u=username();
			state._fsp--;

			 name.setName((u!=null?input.toString(u.start,u.stop):null), true); 
			// Parser.g:1029:7: ( K_WITH userPassword[opts] )?
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==K_WITH) ) {
				alt134=1;
			}
			switch (alt134) {
				case 1 :
					// Parser.g:1029:9: K_WITH userPassword[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterUserStatement7041); 
					pushFollow(FOLLOW_userPassword_in_alterUserStatement7043);
					userPassword(opts);
					state._fsp--;

					}
					break;

			}

			// Parser.g:1030:7: ( K_SUPERUSER | K_NOSUPERUSER )?
			int alt135=3;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==K_SUPERUSER) ) {
				alt135=1;
			}
			else if ( (LA135_0==K_NOSUPERUSER) ) {
				alt135=2;
			}
			switch (alt135) {
				case 1 :
					// Parser.g:1030:9: K_SUPERUSER
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_alterUserStatement7057); 
					 opts.setOption(IRoleManager.Option.SUPERUSER, true); 
					}
					break;
				case 2 :
					// Parser.g:1031:11: K_NOSUPERUSER
					{
					match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_alterUserStatement7071); 
					 opts.setOption(IRoleManager.Option.SUPERUSER, false); 
					}
					break;

			}

			  stmt = new AlterRoleStatement(name, opts); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterUserStatement"



	// $ANTLR start "dropUserStatement"
	// Parser.g:1038:1: dropUserStatement returns [DropRoleStatement stmt] : K_DROP K_USER ( K_IF K_EXISTS )? u= username ;
	public final DropRoleStatement dropUserStatement() throws RecognitionException {
		DropRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        boolean ifExists = false;
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1043:5: ( K_DROP K_USER ( K_IF K_EXISTS )? u= username )
			// Parser.g:1043:7: K_DROP K_USER ( K_IF K_EXISTS )? u= username
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropUserStatement7117); 
			match(input,K_USER,FOLLOW_K_USER_in_dropUserStatement7119); 
			// Parser.g:1043:21: ( K_IF K_EXISTS )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==K_IF) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// Parser.g:1043:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropUserStatement7122); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropUserStatement7124); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_username_in_dropUserStatement7132);
			u=username();
			state._fsp--;

			 name.setName((u!=null?input.toString(u.start,u.stop):null), true); stmt = new DropRoleStatement(name, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropUserStatement"



	// $ANTLR start "listUsersStatement"
	// Parser.g:1049:1: listUsersStatement returns [ListRolesStatement stmt] : K_LIST K_USERS ;
	public final ListRolesStatement listUsersStatement() throws RecognitionException {
		ListRolesStatement stmt = null;


		try {
			// Parser.g:1050:5: ( K_LIST K_USERS )
			// Parser.g:1050:7: K_LIST K_USERS
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listUsersStatement7157); 
			match(input,K_USERS,FOLLOW_K_USERS_in_listUsersStatement7159); 
			 stmt = new ListUsersStatement(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listUsersStatement"



	// $ANTLR start "createRoleStatement"
	// Parser.g:1062:1: createRoleStatement returns [CreateRoleStatement stmt] : K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts] )? ;
	public final CreateRoleStatement createRoleStatement() throws RecognitionException {
		CreateRoleStatement stmt = null;


		RoleName name =null;


		        RoleOptions opts = new RoleOptions();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:1067:5: ( K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts] )? )
			// Parser.g:1067:7: K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts] )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createRoleStatement7193); 
			match(input,K_ROLE,FOLLOW_K_ROLE_in_createRoleStatement7195); 
			// Parser.g:1067:23: ( K_IF K_NOT K_EXISTS )?
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==K_IF) ) {
				alt137=1;
			}
			switch (alt137) {
				case 1 :
					// Parser.g:1067:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createRoleStatement7198); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createRoleStatement7200); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createRoleStatement7202); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_userOrRoleName_in_createRoleStatement7210);
			name=userOrRoleName();
			state._fsp--;

			// Parser.g:1068:7: ( K_WITH roleOptions[opts] )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==K_WITH) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// Parser.g:1068:9: K_WITH roleOptions[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createRoleStatement7220); 
					pushFollow(FOLLOW_roleOptions_in_createRoleStatement7222);
					roleOptions(opts);
					state._fsp--;

					}
					break;

			}


			        // set defaults if they weren't explictly supplied
			        if (!opts.getLogin().isPresent())
			        {
			            opts.setOption(IRoleManager.Option.LOGIN, false);
			        }
			        if (!opts.getSuperuser().isPresent())
			        {
			            opts.setOption(IRoleManager.Option.SUPERUSER, false);
			        }
			        stmt = new CreateRoleStatement(name, opts, ifNotExists);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createRoleStatement"



	// $ANTLR start "alterRoleStatement"
	// Parser.g:1092:1: alterRoleStatement returns [AlterRoleStatement stmt] : K_ALTER K_ROLE name= userOrRoleName ( K_WITH roleOptions[opts] )? ;
	public final AlterRoleStatement alterRoleStatement() throws RecognitionException {
		AlterRoleStatement stmt = null;


		RoleName name =null;


		        RoleOptions opts = new RoleOptions();
		    
		try {
			// Parser.g:1096:5: ( K_ALTER K_ROLE name= userOrRoleName ( K_WITH roleOptions[opts] )? )
			// Parser.g:1096:7: K_ALTER K_ROLE name= userOrRoleName ( K_WITH roleOptions[opts] )?
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterRoleStatement7266); 
			match(input,K_ROLE,FOLLOW_K_ROLE_in_alterRoleStatement7268); 
			pushFollow(FOLLOW_userOrRoleName_in_alterRoleStatement7272);
			name=userOrRoleName();
			state._fsp--;

			// Parser.g:1097:7: ( K_WITH roleOptions[opts] )?
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==K_WITH) ) {
				alt139=1;
			}
			switch (alt139) {
				case 1 :
					// Parser.g:1097:9: K_WITH roleOptions[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterRoleStatement7282); 
					pushFollow(FOLLOW_roleOptions_in_alterRoleStatement7284);
					roleOptions(opts);
					state._fsp--;

					}
					break;

			}

			  stmt = new AlterRoleStatement(name, opts); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterRoleStatement"



	// $ANTLR start "dropRoleStatement"
	// Parser.g:1104:1: dropRoleStatement returns [DropRoleStatement stmt] : K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName ;
	public final DropRoleStatement dropRoleStatement() throws RecognitionException {
		DropRoleStatement stmt = null;


		RoleName name =null;


		        boolean ifExists = false;
		    
		try {
			// Parser.g:1108:5: ( K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName )
			// Parser.g:1108:7: K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropRoleStatement7328); 
			match(input,K_ROLE,FOLLOW_K_ROLE_in_dropRoleStatement7330); 
			// Parser.g:1108:21: ( K_IF K_EXISTS )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==K_IF) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// Parser.g:1108:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropRoleStatement7333); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropRoleStatement7335); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_userOrRoleName_in_dropRoleStatement7343);
			name=userOrRoleName();
			state._fsp--;

			 stmt = new DropRoleStatement(name, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropRoleStatement"



	// $ANTLR start "listRolesStatement"
	// Parser.g:1115:1: listRolesStatement returns [ListRolesStatement stmt] : K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? ;
	public final ListRolesStatement listRolesStatement() throws RecognitionException {
		ListRolesStatement stmt = null;



		        boolean recursive = true;
		        RoleName grantee = new RoleName();
		    
		try {
			// Parser.g:1120:5: ( K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? )
			// Parser.g:1120:7: K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )?
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listRolesStatement7383); 
			match(input,K_ROLES,FOLLOW_K_ROLES_in_listRolesStatement7385); 
			// Parser.g:1121:7: ( K_OF roleName[grantee] )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==K_OF) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// Parser.g:1121:9: K_OF roleName[grantee]
					{
					match(input,K_OF,FOLLOW_K_OF_in_listRolesStatement7395); 
					pushFollow(FOLLOW_roleName_in_listRolesStatement7397);
					roleName(grantee);
					state._fsp--;

					}
					break;

			}

			// Parser.g:1122:7: ( K_NORECURSIVE )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==K_NORECURSIVE) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// Parser.g:1122:9: K_NORECURSIVE
					{
					match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listRolesStatement7410); 
					 recursive = false; 
					}
					break;

			}

			 stmt = new ListRolesStatement(grantee, recursive); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listRolesStatement"



	// $ANTLR start "roleOptions"
	// Parser.g:1126:1: roleOptions[RoleOptions opts] : roleOption[opts] ( K_AND roleOption[opts] )* ;
	public final void roleOptions(RoleOptions opts) throws RecognitionException {
		try {
			// Parser.g:1127:5: ( roleOption[opts] ( K_AND roleOption[opts] )* )
			// Parser.g:1127:7: roleOption[opts] ( K_AND roleOption[opts] )*
			{
			pushFollow(FOLLOW_roleOption_in_roleOptions7441);
			roleOption(opts);
			state._fsp--;

			// Parser.g:1127:24: ( K_AND roleOption[opts] )*
			loop143:
			while (true) {
				int alt143=2;
				int LA143_0 = input.LA(1);
				if ( (LA143_0==K_AND) ) {
					alt143=1;
				}

				switch (alt143) {
				case 1 :
					// Parser.g:1127:25: K_AND roleOption[opts]
					{
					match(input,K_AND,FOLLOW_K_AND_in_roleOptions7445); 
					pushFollow(FOLLOW_roleOption_in_roleOptions7447);
					roleOption(opts);
					state._fsp--;

					}
					break;

				default :
					break loop143;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleOptions"



	// $ANTLR start "roleOption"
	// Parser.g:1130:1: roleOption[RoleOptions opts] : ( K_PASSWORD '=' v= STRING_LITERAL | K_OPTIONS '=' m= mapLiteral | K_SUPERUSER '=' b= BOOLEAN | K_LOGIN '=' b= BOOLEAN );
	public final void roleOption(RoleOptions opts) throws RecognitionException {
		Token v=null;
		Token b=null;
		Maps.Literal m =null;

		try {
			// Parser.g:1131:5: ( K_PASSWORD '=' v= STRING_LITERAL | K_OPTIONS '=' m= mapLiteral | K_SUPERUSER '=' b= BOOLEAN | K_LOGIN '=' b= BOOLEAN )
			int alt144=4;
			switch ( input.LA(1) ) {
			case K_PASSWORD:
				{
				alt144=1;
				}
				break;
			case K_OPTIONS:
				{
				alt144=2;
				}
				break;
			case K_SUPERUSER:
				{
				alt144=3;
				}
				break;
			case K_LOGIN:
				{
				alt144=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 144, 0, input);
				throw nvae;
			}
			switch (alt144) {
				case 1 :
					// Parser.g:1131:8: K_PASSWORD '=' v= STRING_LITERAL
					{
					match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_roleOption7469); 
					match(input,187,FOLLOW_187_in_roleOption7471); 
					v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_roleOption7475); 
					 opts.setOption(IRoleManager.Option.PASSWORD, (v!=null?v.getText():null)); 
					}
					break;
				case 2 :
					// Parser.g:1132:8: K_OPTIONS '=' m= mapLiteral
					{
					match(input,K_OPTIONS,FOLLOW_K_OPTIONS_in_roleOption7486); 
					match(input,187,FOLLOW_187_in_roleOption7488); 
					pushFollow(FOLLOW_mapLiteral_in_roleOption7492);
					m=mapLiteral();
					state._fsp--;

					 opts.setOption(IRoleManager.Option.OPTIONS, convertPropertyMap(m)); 
					}
					break;
				case 3 :
					// Parser.g:1133:8: K_SUPERUSER '=' b= BOOLEAN
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_roleOption7503); 
					match(input,187,FOLLOW_187_in_roleOption7505); 
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_roleOption7509); 
					 opts.setOption(IRoleManager.Option.SUPERUSER, Boolean.valueOf((b!=null?b.getText():null))); 
					}
					break;
				case 4 :
					// Parser.g:1134:8: K_LOGIN '=' b= BOOLEAN
					{
					match(input,K_LOGIN,FOLLOW_K_LOGIN_in_roleOption7520); 
					match(input,187,FOLLOW_187_in_roleOption7522); 
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_roleOption7526); 
					 opts.setOption(IRoleManager.Option.LOGIN, Boolean.valueOf((b!=null?b.getText():null))); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleOption"



	// $ANTLR start "userPassword"
	// Parser.g:1138:1: userPassword[RoleOptions opts] : K_PASSWORD v= STRING_LITERAL ;
	public final void userPassword(RoleOptions opts) throws RecognitionException {
		Token v=null;

		try {
			// Parser.g:1139:5: ( K_PASSWORD v= STRING_LITERAL )
			// Parser.g:1139:8: K_PASSWORD v= STRING_LITERAL
			{
			match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_userPassword7548); 
			v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_userPassword7552); 
			 opts.setOption(IRoleManager.Option.PASSWORD, (v!=null?v.getText():null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "userPassword"



	// $ANTLR start "cident"
	// Parser.g:1147:1: cident returns [ColumnIdentifier.Raw id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnIdentifier.Raw cident() throws RecognitionException {
		ColumnIdentifier.Raw id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1148:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt145=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt145=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt145=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt145=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 145, 0, input);
				throw nvae;
			}
			switch (alt145) {
				case 1 :
					// Parser.g:1148:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cident7583); 
					 id = new ColumnIdentifier.Literal((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1149:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cident7608); 
					 id = new ColumnIdentifier.Literal((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1150:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_cident7627);
					k=unreserved_keyword();
					state._fsp--;

					 id = new ColumnIdentifier.Literal(k, false); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "cident"



	// $ANTLR start "ident"
	// Parser.g:1154:1: ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnIdentifier ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1155:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt146=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt146=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt146=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt146=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 146, 0, input);
				throw nvae;
			}
			switch (alt146) {
				case 1 :
					// Parser.g:1155:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident7653); 
					 id = ColumnIdentifier.getInterned((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1156:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_ident7678); 
					 id = ColumnIdentifier.getInterned((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1157:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_ident7697);
					k=unreserved_keyword();
					state._fsp--;

					 id = ColumnIdentifier.getInterned(k, false); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "ident"



	// $ANTLR start "noncol_ident"
	// Parser.g:1161:1: noncol_ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnIdentifier noncol_ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1162:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt147=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt147=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt147=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt147=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 147, 0, input);
				throw nvae;
			}
			switch (alt147) {
				case 1 :
					// Parser.g:1162:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_noncol_ident7723); 
					 id = new ColumnIdentifier((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1163:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_noncol_ident7748); 
					 id = new ColumnIdentifier((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1164:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_noncol_ident7767);
					k=unreserved_keyword();
					state._fsp--;

					 id = new ColumnIdentifier(k, false); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "noncol_ident"



	// $ANTLR start "keyspaceName"
	// Parser.g:1168:1: keyspaceName returns [String id] : ksName[name] ;
	public final String keyspaceName() throws RecognitionException {
		String id = null;


		 CFName name = new CFName(); 
		try {
			// Parser.g:1170:5: ( ksName[name] )
			// Parser.g:1170:7: ksName[name]
			{
			pushFollow(FOLLOW_ksName_in_keyspaceName7800);
			ksName(name);
			state._fsp--;

			 id = name.getKeyspace(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "keyspaceName"



	// $ANTLR start "indexName"
	// Parser.g:1173:1: indexName returns [IndexName name] : ( ksName[name] '.' )? idxName[name] ;
	public final IndexName indexName() throws RecognitionException {
		IndexName name = null;


		 name = new IndexName(); 
		try {
			// Parser.g:1175:5: ( ( ksName[name] '.' )? idxName[name] )
			// Parser.g:1175:7: ( ksName[name] '.' )? idxName[name]
			{
			// Parser.g:1175:7: ( ksName[name] '.' )?
			int alt148=2;
			alt148 = dfa148.predict(input);
			switch (alt148) {
				case 1 :
					// Parser.g:1175:8: ksName[name] '.'
					{
					pushFollow(FOLLOW_ksName_in_indexName7834);
					ksName(name);
					state._fsp--;

					match(input,182,FOLLOW_182_in_indexName7837); 
					}
					break;

			}

			pushFollow(FOLLOW_idxName_in_indexName7841);
			idxName(name);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "indexName"



	// $ANTLR start "columnFamilyName"
	// Parser.g:1178:1: columnFamilyName returns [CFName name] : ( ksName[name] '.' )? cfName[name] ;
	public final CFName columnFamilyName() throws RecognitionException {
		CFName name = null;


		 name = new CFName(); 
		try {
			// Parser.g:1180:5: ( ( ksName[name] '.' )? cfName[name] )
			// Parser.g:1180:7: ( ksName[name] '.' )? cfName[name]
			{
			// Parser.g:1180:7: ( ksName[name] '.' )?
			int alt149=2;
			alt149 = dfa149.predict(input);
			switch (alt149) {
				case 1 :
					// Parser.g:1180:8: ksName[name] '.'
					{
					pushFollow(FOLLOW_ksName_in_columnFamilyName7873);
					ksName(name);
					state._fsp--;

					match(input,182,FOLLOW_182_in_columnFamilyName7876); 
					}
					break;

			}

			pushFollow(FOLLOW_cfName_in_columnFamilyName7880);
			cfName(name);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "columnFamilyName"



	// $ANTLR start "userTypeName"
	// Parser.g:1183:1: userTypeName returns [UTName name] : (ks= noncol_ident '.' )? ut= non_type_ident ;
	public final UTName userTypeName() throws RecognitionException {
		UTName name = null;


		ColumnIdentifier ks =null;
		ColumnIdentifier ut =null;

		try {
			// Parser.g:1184:5: ( (ks= noncol_ident '.' )? ut= non_type_ident )
			// Parser.g:1184:7: (ks= noncol_ident '.' )? ut= non_type_ident
			{
			// Parser.g:1184:7: (ks= noncol_ident '.' )?
			int alt150=2;
			switch ( input.LA(1) ) {
				case IDENT:
					{
					int LA150_1 = input.LA(2);
					if ( (LA150_1==182) ) {
						alt150=1;
					}
					}
					break;
				case QUOTED_NAME:
					{
					int LA150_2 = input.LA(2);
					if ( (LA150_2==182) ) {
						alt150=1;
					}
					}
					break;
				case K_AGGREGATE:
				case K_ALL:
				case K_AS:
				case K_CALLED:
				case K_CLUSTERING:
				case K_COMPACT:
				case K_CONTAINS:
				case K_CUSTOM:
				case K_DISTINCT:
				case K_EXISTS:
				case K_FILTERING:
				case K_FINALFUNC:
				case K_FROZEN:
				case K_FUNCTION:
				case K_FUNCTIONS:
				case K_INITCOND:
				case K_INPUT:
				case K_JSON:
				case K_KEYS:
				case K_KEYSPACES:
				case K_LANGUAGE:
				case K_LIKE:
				case K_LIST:
				case K_LOGIN:
				case K_MAP:
				case K_NOLOGIN:
				case K_NOSUPERUSER:
				case K_OPTIONS:
				case K_PARTITION:
				case K_PASSWORD:
				case K_PER:
				case K_PERMISSION:
				case K_PERMISSIONS:
				case K_RETURNS:
				case K_ROLE:
				case K_ROLES:
				case K_SFUNC:
				case K_STATIC:
				case K_STORAGE:
				case K_STYPE:
				case K_SUPERUSER:
				case K_TRIGGER:
				case K_TUPLE:
				case K_TYPE:
				case K_USER:
				case K_USERS:
				case K_VALUES:
					{
					int LA150_3 = input.LA(2);
					if ( (LA150_3==182) ) {
						alt150=1;
					}
					}
					break;
				case K_ASCII:
				case K_BIGINT:
				case K_BLOB:
				case K_BOOLEAN:
				case K_CAST:
				case K_COUNT:
				case K_COUNTER:
				case K_DATE:
				case K_DECIMAL:
				case K_DOUBLE:
				case K_FLOAT:
				case K_INET:
				case K_INT:
				case K_SMALLINT:
				case K_TEXT:
				case K_TIME:
				case K_TIMESTAMP:
				case K_TIMEUUID:
				case K_TINYINT:
				case K_TTL:
				case K_UUID:
				case K_VARCHAR:
				case K_VARINT:
				case K_WRITETIME:
					{
					alt150=1;
					}
					break;
				case K_KEY:
					{
					int LA150_5 = input.LA(2);
					if ( (LA150_5==182) ) {
						alt150=1;
					}
					}
					break;
			}
			switch (alt150) {
				case 1 :
					// Parser.g:1184:8: ks= noncol_ident '.'
					{
					pushFollow(FOLLOW_noncol_ident_in_userTypeName7905);
					ks=noncol_ident();
					state._fsp--;

					match(input,182,FOLLOW_182_in_userTypeName7907); 
					}
					break;

			}

			pushFollow(FOLLOW_non_type_ident_in_userTypeName7913);
			ut=non_type_ident();
			state._fsp--;

			 return new UTName(ks, ut); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "userTypeName"



	// $ANTLR start "userOrRoleName"
	// Parser.g:1187:1: userOrRoleName returns [RoleName name] : roleName[name] ;
	public final RoleName userOrRoleName() throws RecognitionException {
		RoleName name = null;


		 name = new RoleName(); 
		try {
			// Parser.g:1189:5: ( roleName[name] )
			// Parser.g:1189:7: roleName[name]
			{
			pushFollow(FOLLOW_roleName_in_userOrRoleName7945);
			roleName(name);
			state._fsp--;

			return name;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "userOrRoleName"



	// $ANTLR start "ksName"
	// Parser.g:1192:1: ksName[KeyspaceElementName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void ksName(KeyspaceElementName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1193:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt151=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt151=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt151=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt151=3;
				}
				break;
			case QMARK:
				{
				alt151=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 151, 0, input);
				throw nvae;
			}
			switch (alt151) {
				case 1 :
					// Parser.g:1193:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_ksName7968); 
					 name.setKeyspace((t!=null?t.getText():null), false);
					}
					break;
				case 2 :
					// Parser.g:1194:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_ksName7993); 
					 name.setKeyspace((t!=null?t.getText():null), true);
					}
					break;
				case 3 :
					// Parser.g:1195:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_ksName8012);
					k=unreserved_keyword();
					state._fsp--;

					 name.setKeyspace(k, false);
					}
					break;
				case 4 :
					// Parser.g:1196:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_ksName8022); 
					addRecognitionError("Bind variables cannot be used for keyspace names");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ksName"



	// $ANTLR start "cfName"
	// Parser.g:1199:1: cfName[CFName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void cfName(CFName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1200:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt152=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt152=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt152=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt152=3;
				}
				break;
			case QMARK:
				{
				alt152=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 152, 0, input);
				throw nvae;
			}
			switch (alt152) {
				case 1 :
					// Parser.g:1200:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cfName8044); 
					 name.setColumnFamily((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1201:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cfName8069); 
					 name.setColumnFamily((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1202:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_cfName8088);
					k=unreserved_keyword();
					state._fsp--;

					 name.setColumnFamily(k, false); 
					}
					break;
				case 4 :
					// Parser.g:1203:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_cfName8098); 
					addRecognitionError("Bind variables cannot be used for table names");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfName"



	// $ANTLR start "idxName"
	// Parser.g:1206:1: idxName[IndexName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void idxName(IndexName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1207:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt153=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt153=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt153=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt153=3;
				}
				break;
			case QMARK:
				{
				alt153=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 153, 0, input);
				throw nvae;
			}
			switch (alt153) {
				case 1 :
					// Parser.g:1207:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_idxName8120); 
					 name.setIndex((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1208:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_idxName8145); 
					 name.setIndex((t!=null?t.getText():null), true);
					}
					break;
				case 3 :
					// Parser.g:1209:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_idxName8164);
					k=unreserved_keyword();
					state._fsp--;

					 name.setIndex(k, false); 
					}
					break;
				case 4 :
					// Parser.g:1210:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_idxName8174); 
					addRecognitionError("Bind variables cannot be used for index names");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "idxName"



	// $ANTLR start "roleName"
	// Parser.g:1213:1: roleName[RoleName name] : (t= IDENT |s= STRING_LITERAL |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void roleName(RoleName name) throws RecognitionException {
		Token t=null;
		Token s=null;
		String k =null;

		try {
			// Parser.g:1214:5: (t= IDENT |s= STRING_LITERAL |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt154=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt154=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt154=2;
				}
				break;
			case QUOTED_NAME:
				{
				alt154=3;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt154=4;
				}
				break;
			case QMARK:
				{
				alt154=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 154, 0, input);
				throw nvae;
			}
			switch (alt154) {
				case 1 :
					// Parser.g:1214:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_roleName8196); 
					 name.setName((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1215:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_roleName8221); 
					 name.setName((s!=null?s.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1216:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_roleName8237); 
					 name.setName((t!=null?t.getText():null), true); 
					}
					break;
				case 4 :
					// Parser.g:1217:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_roleName8256);
					k=unreserved_keyword();
					state._fsp--;

					 name.setName(k, false); 
					}
					break;
				case 5 :
					// Parser.g:1218:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_roleName8266); 
					addRecognitionError("Bind variables cannot be used for role names");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleName"



	// $ANTLR start "constant"
	// Parser.g:1221:1: constant returns [Constants.Literal constant] : (t= STRING_LITERAL |t= INTEGER |t= FLOAT |t= BOOLEAN |t= UUID |t= HEXNUMBER | ( '-' )? t= ( K_NAN | K_INFINITY ) );
	public final Constants.Literal constant() throws RecognitionException {
		Constants.Literal constant = null;


		Token t=null;

		try {
			// Parser.g:1222:5: (t= STRING_LITERAL |t= INTEGER |t= FLOAT |t= BOOLEAN |t= UUID |t= HEXNUMBER | ( '-' )? t= ( K_NAN | K_INFINITY ) )
			int alt156=7;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt156=1;
				}
				break;
			case INTEGER:
				{
				alt156=2;
				}
				break;
			case FLOAT:
				{
				alt156=3;
				}
				break;
			case BOOLEAN:
				{
				alt156=4;
				}
				break;
			case UUID:
				{
				alt156=5;
				}
				break;
			case HEXNUMBER:
				{
				alt156=6;
				}
				break;
			case K_INFINITY:
			case K_NAN:
			case 181:
				{
				alt156=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 156, 0, input);
				throw nvae;
			}
			switch (alt156) {
				case 1 :
					// Parser.g:1222:7: t= STRING_LITERAL
					{
					t=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant8291); 
					 constant = Constants.Literal.string((t!=null?t.getText():null)); 
					}
					break;
				case 2 :
					// Parser.g:1223:7: t= INTEGER
					{
					t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_constant8303); 
					 constant = Constants.Literal.integer((t!=null?t.getText():null)); 
					}
					break;
				case 3 :
					// Parser.g:1224:7: t= FLOAT
					{
					t=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant8322); 
					 constant = Constants.Literal.floatingPoint((t!=null?t.getText():null)); 
					}
					break;
				case 4 :
					// Parser.g:1225:7: t= BOOLEAN
					{
					t=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant8343); 
					 constant = Constants.Literal.bool((t!=null?t.getText():null)); 
					}
					break;
				case 5 :
					// Parser.g:1226:7: t= UUID
					{
					t=(Token)match(input,UUID,FOLLOW_UUID_in_constant8362); 
					 constant = Constants.Literal.uuid((t!=null?t.getText():null)); 
					}
					break;
				case 6 :
					// Parser.g:1227:7: t= HEXNUMBER
					{
					t=(Token)match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_constant8384); 
					 constant = Constants.Literal.hex((t!=null?t.getText():null)); 
					}
					break;
				case 7 :
					// Parser.g:1228:7: ( '-' )? t= ( K_NAN | K_INFINITY )
					{
					 String sign=""; 
					// Parser.g:1228:27: ( '-' )?
					int alt155=2;
					int LA155_0 = input.LA(1);
					if ( (LA155_0==181) ) {
						alt155=1;
					}
					switch (alt155) {
						case 1 :
							// Parser.g:1228:28: '-'
							{
							match(input,181,FOLLOW_181_in_constant8402); 
							sign = "-"; 
							}
							break;

					}

					t=input.LT(1);
					if ( input.LA(1)==K_INFINITY||input.LA(1)==K_NAN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					 constant = Constants.Literal.floatingPoint(sign + (t!=null?t.getText():null)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return constant;
	}
	// $ANTLR end "constant"



	// $ANTLR start "mapLiteral"
	// Parser.g:1231:1: mapLiteral returns [Maps.Literal map] : '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' ;
	public final Maps.Literal mapLiteral() throws RecognitionException {
		Maps.Literal map = null;


		Term.Raw k1 =null;
		Term.Raw v1 =null;
		Term.Raw kn =null;
		Term.Raw vn =null;

		try {
			// Parser.g:1232:5: ( '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' )
			// Parser.g:1232:7: '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}'
			{
			match(input,194,FOLLOW_194_in_mapLiteral8440); 
			 List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); 
			// Parser.g:1233:11: (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )?
			int alt158=2;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==BOOLEAN||LA158_0==FLOAT||LA158_0==HEXNUMBER||(LA158_0 >= IDENT && LA158_0 <= INTEGER)||(LA158_0 >= K_AGGREGATE && LA158_0 <= K_ALL)||LA158_0==K_AS||LA158_0==K_ASCII||(LA158_0 >= K_BIGINT && LA158_0 <= K_BOOLEAN)||(LA158_0 >= K_CALLED && LA158_0 <= K_CLUSTERING)||(LA158_0 >= K_COMPACT && LA158_0 <= K_COUNTER)||(LA158_0 >= K_CUSTOM && LA158_0 <= K_DECIMAL)||(LA158_0 >= K_DISTINCT && LA158_0 <= K_DOUBLE)||(LA158_0 >= K_EXISTS && LA158_0 <= K_FLOAT)||LA158_0==K_FROZEN||(LA158_0 >= K_FUNCTION && LA158_0 <= K_FUNCTIONS)||(LA158_0 >= K_INET && LA158_0 <= K_INPUT)||LA158_0==K_INT||(LA158_0 >= K_JSON && LA158_0 <= K_KEYS)||(LA158_0 >= K_KEYSPACES && LA158_0 <= K_LIKE)||(LA158_0 >= K_LIST && LA158_0 <= K_MAP)||(LA158_0 >= K_NAN && LA158_0 <= K_NOLOGIN)||LA158_0==K_NOSUPERUSER||LA158_0==K_NULL||LA158_0==K_OPTIONS||(LA158_0 >= K_PARTITION && LA158_0 <= K_PERMISSIONS)||LA158_0==K_RETURNS||(LA158_0 >= K_ROLE && LA158_0 <= K_ROLES)||(LA158_0 >= K_SFUNC && LA158_0 <= K_TINYINT)||(LA158_0 >= K_TOKEN && LA158_0 <= K_TRIGGER)||(LA158_0 >= K_TTL && LA158_0 <= K_TYPE)||(LA158_0 >= K_USER && LA158_0 <= K_USERS)||(LA158_0 >= K_UUID && LA158_0 <= K_VARINT)||LA158_0==K_WRITETIME||(LA158_0 >= QMARK && LA158_0 <= QUOTED_NAME)||LA158_0==STRING_LITERAL||LA158_0==UUID||LA158_0==177||LA158_0==181||LA158_0==183||LA158_0==190||LA158_0==194) ) {
				alt158=1;
			}
			switch (alt158) {
				case 1 :
					// Parser.g:1233:13: k1= term ':' v1= term ( ',' kn= term ':' vn= term )*
					{
					pushFollow(FOLLOW_term_in_mapLiteral8458);
					k1=term();
					state._fsp--;

					match(input,183,FOLLOW_183_in_mapLiteral8460); 
					pushFollow(FOLLOW_term_in_mapLiteral8464);
					v1=term();
					state._fsp--;

					 m.add(Pair.create(k1, v1)); 
					// Parser.g:1233:65: ( ',' kn= term ':' vn= term )*
					loop157:
					while (true) {
						int alt157=2;
						int LA157_0 = input.LA(1);
						if ( (LA157_0==180) ) {
							alt157=1;
						}

						switch (alt157) {
						case 1 :
							// Parser.g:1233:67: ',' kn= term ':' vn= term
							{
							match(input,180,FOLLOW_180_in_mapLiteral8470); 
							pushFollow(FOLLOW_term_in_mapLiteral8474);
							kn=term();
							state._fsp--;

							match(input,183,FOLLOW_183_in_mapLiteral8476); 
							pushFollow(FOLLOW_term_in_mapLiteral8480);
							vn=term();
							state._fsp--;

							 m.add(Pair.create(kn, vn)); 
							}
							break;

						default :
							break loop157;
						}
					}

					}
					break;

			}

			match(input,195,FOLLOW_195_in_mapLiteral8496); 
			 map = new Maps.Literal(m); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return map;
	}
	// $ANTLR end "mapLiteral"



	// $ANTLR start "setOrMapLiteral"
	// Parser.g:1237:1: setOrMapLiteral[Term.Raw t] returns [Term.Raw value] : ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* );
	public final Term.Raw setOrMapLiteral(Term.Raw t) throws RecognitionException {
		Term.Raw value = null;


		Term.Raw v =null;
		Term.Raw kn =null;
		Term.Raw vn =null;
		Term.Raw tn =null;

		try {
			// Parser.g:1238:5: ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* )
			int alt161=2;
			int LA161_0 = input.LA(1);
			if ( (LA161_0==183) ) {
				alt161=1;
			}
			else if ( (LA161_0==180||LA161_0==195) ) {
				alt161=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 161, 0, input);
				throw nvae;
			}

			switch (alt161) {
				case 1 :
					// Parser.g:1238:7: ':' v= term ( ',' kn= term ':' vn= term )*
					{
					match(input,183,FOLLOW_183_in_setOrMapLiteral8520); 
					pushFollow(FOLLOW_term_in_setOrMapLiteral8524);
					v=term();
					state._fsp--;

					 List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); m.add(Pair.create(t, v)); 
					// Parser.g:1239:11: ( ',' kn= term ':' vn= term )*
					loop159:
					while (true) {
						int alt159=2;
						int LA159_0 = input.LA(1);
						if ( (LA159_0==180) ) {
							alt159=1;
						}

						switch (alt159) {
						case 1 :
							// Parser.g:1239:13: ',' kn= term ':' vn= term
							{
							match(input,180,FOLLOW_180_in_setOrMapLiteral8540); 
							pushFollow(FOLLOW_term_in_setOrMapLiteral8544);
							kn=term();
							state._fsp--;

							match(input,183,FOLLOW_183_in_setOrMapLiteral8546); 
							pushFollow(FOLLOW_term_in_setOrMapLiteral8550);
							vn=term();
							state._fsp--;

							 m.add(Pair.create(kn, vn)); 
							}
							break;

						default :
							break loop159;
						}
					}

					 value = new Maps.Literal(m); 
					}
					break;
				case 2 :
					// Parser.g:1241:7: ( ',' tn= term )*
					{
					 List<Term.Raw> s = new ArrayList<Term.Raw>(); s.add(t); 
					// Parser.g:1242:11: ( ',' tn= term )*
					loop160:
					while (true) {
						int alt160=2;
						int LA160_0 = input.LA(1);
						if ( (LA160_0==180) ) {
							alt160=1;
						}

						switch (alt160) {
						case 1 :
							// Parser.g:1242:13: ',' tn= term
							{
							match(input,180,FOLLOW_180_in_setOrMapLiteral8585); 
							pushFollow(FOLLOW_term_in_setOrMapLiteral8589);
							tn=term();
							state._fsp--;

							 s.add(tn); 
							}
							break;

						default :
							break loop160;
						}
					}

					 value = new Sets.Literal(s); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "setOrMapLiteral"



	// $ANTLR start "collectionLiteral"
	// Parser.g:1246:1: collectionLiteral returns [Term.Raw value] : ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= setOrMapLiteral[t] '}' | '{' '}' );
	public final Term.Raw collectionLiteral() throws RecognitionException {
		Term.Raw value = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;
		Term.Raw t =null;
		Term.Raw v =null;

		try {
			// Parser.g:1247:5: ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= setOrMapLiteral[t] '}' | '{' '}' )
			int alt164=3;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==190) ) {
				alt164=1;
			}
			else if ( (LA164_0==194) ) {
				int LA164_2 = input.LA(2);
				if ( (LA164_2==195) ) {
					alt164=3;
				}
				else if ( (LA164_2==BOOLEAN||LA164_2==FLOAT||LA164_2==HEXNUMBER||(LA164_2 >= IDENT && LA164_2 <= INTEGER)||(LA164_2 >= K_AGGREGATE && LA164_2 <= K_ALL)||LA164_2==K_AS||LA164_2==K_ASCII||(LA164_2 >= K_BIGINT && LA164_2 <= K_BOOLEAN)||(LA164_2 >= K_CALLED && LA164_2 <= K_CLUSTERING)||(LA164_2 >= K_COMPACT && LA164_2 <= K_COUNTER)||(LA164_2 >= K_CUSTOM && LA164_2 <= K_DECIMAL)||(LA164_2 >= K_DISTINCT && LA164_2 <= K_DOUBLE)||(LA164_2 >= K_EXISTS && LA164_2 <= K_FLOAT)||LA164_2==K_FROZEN||(LA164_2 >= K_FUNCTION && LA164_2 <= K_FUNCTIONS)||(LA164_2 >= K_INET && LA164_2 <= K_INPUT)||LA164_2==K_INT||(LA164_2 >= K_JSON && LA164_2 <= K_KEYS)||(LA164_2 >= K_KEYSPACES && LA164_2 <= K_LIKE)||(LA164_2 >= K_LIST && LA164_2 <= K_MAP)||(LA164_2 >= K_NAN && LA164_2 <= K_NOLOGIN)||LA164_2==K_NOSUPERUSER||LA164_2==K_NULL||LA164_2==K_OPTIONS||(LA164_2 >= K_PARTITION && LA164_2 <= K_PERMISSIONS)||LA164_2==K_RETURNS||(LA164_2 >= K_ROLE && LA164_2 <= K_ROLES)||(LA164_2 >= K_SFUNC && LA164_2 <= K_TINYINT)||(LA164_2 >= K_TOKEN && LA164_2 <= K_TRIGGER)||(LA164_2 >= K_TTL && LA164_2 <= K_TYPE)||(LA164_2 >= K_USER && LA164_2 <= K_USERS)||(LA164_2 >= K_UUID && LA164_2 <= K_VARINT)||LA164_2==K_WRITETIME||(LA164_2 >= QMARK && LA164_2 <= QUOTED_NAME)||LA164_2==STRING_LITERAL||LA164_2==UUID||LA164_2==177||LA164_2==181||LA164_2==183||LA164_2==190||LA164_2==194) ) {
					alt164=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 164, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 164, 0, input);
				throw nvae;
			}

			switch (alt164) {
				case 1 :
					// Parser.g:1247:7: '[' (t1= term ( ',' tn= term )* )? ']'
					{
					match(input,190,FOLLOW_190_in_collectionLiteral8623); 
					 List<Term.Raw> l = new ArrayList<Term.Raw>(); 
					// Parser.g:1248:11: (t1= term ( ',' tn= term )* )?
					int alt163=2;
					int LA163_0 = input.LA(1);
					if ( (LA163_0==BOOLEAN||LA163_0==FLOAT||LA163_0==HEXNUMBER||(LA163_0 >= IDENT && LA163_0 <= INTEGER)||(LA163_0 >= K_AGGREGATE && LA163_0 <= K_ALL)||LA163_0==K_AS||LA163_0==K_ASCII||(LA163_0 >= K_BIGINT && LA163_0 <= K_BOOLEAN)||(LA163_0 >= K_CALLED && LA163_0 <= K_CLUSTERING)||(LA163_0 >= K_COMPACT && LA163_0 <= K_COUNTER)||(LA163_0 >= K_CUSTOM && LA163_0 <= K_DECIMAL)||(LA163_0 >= K_DISTINCT && LA163_0 <= K_DOUBLE)||(LA163_0 >= K_EXISTS && LA163_0 <= K_FLOAT)||LA163_0==K_FROZEN||(LA163_0 >= K_FUNCTION && LA163_0 <= K_FUNCTIONS)||(LA163_0 >= K_INET && LA163_0 <= K_INPUT)||LA163_0==K_INT||(LA163_0 >= K_JSON && LA163_0 <= K_KEYS)||(LA163_0 >= K_KEYSPACES && LA163_0 <= K_LIKE)||(LA163_0 >= K_LIST && LA163_0 <= K_MAP)||(LA163_0 >= K_NAN && LA163_0 <= K_NOLOGIN)||LA163_0==K_NOSUPERUSER||LA163_0==K_NULL||LA163_0==K_OPTIONS||(LA163_0 >= K_PARTITION && LA163_0 <= K_PERMISSIONS)||LA163_0==K_RETURNS||(LA163_0 >= K_ROLE && LA163_0 <= K_ROLES)||(LA163_0 >= K_SFUNC && LA163_0 <= K_TINYINT)||(LA163_0 >= K_TOKEN && LA163_0 <= K_TRIGGER)||(LA163_0 >= K_TTL && LA163_0 <= K_TYPE)||(LA163_0 >= K_USER && LA163_0 <= K_USERS)||(LA163_0 >= K_UUID && LA163_0 <= K_VARINT)||LA163_0==K_WRITETIME||(LA163_0 >= QMARK && LA163_0 <= QUOTED_NAME)||LA163_0==STRING_LITERAL||LA163_0==UUID||LA163_0==177||LA163_0==181||LA163_0==183||LA163_0==190||LA163_0==194) ) {
						alt163=1;
					}
					switch (alt163) {
						case 1 :
							// Parser.g:1248:13: t1= term ( ',' tn= term )*
							{
							pushFollow(FOLLOW_term_in_collectionLiteral8641);
							t1=term();
							state._fsp--;

							 l.add(t1); 
							// Parser.g:1248:36: ( ',' tn= term )*
							loop162:
							while (true) {
								int alt162=2;
								int LA162_0 = input.LA(1);
								if ( (LA162_0==180) ) {
									alt162=1;
								}

								switch (alt162) {
								case 1 :
									// Parser.g:1248:38: ',' tn= term
									{
									match(input,180,FOLLOW_180_in_collectionLiteral8647); 
									pushFollow(FOLLOW_term_in_collectionLiteral8651);
									tn=term();
									state._fsp--;

									 l.add(tn); 
									}
									break;

								default :
									break loop162;
								}
							}

							}
							break;

					}

					match(input,192,FOLLOW_192_in_collectionLiteral8667); 
					 value = new Lists.Literal(l); 
					}
					break;
				case 2 :
					// Parser.g:1250:7: '{' t= term v= setOrMapLiteral[t] '}'
					{
					match(input,194,FOLLOW_194_in_collectionLiteral8677); 
					pushFollow(FOLLOW_term_in_collectionLiteral8681);
					t=term();
					state._fsp--;

					pushFollow(FOLLOW_setOrMapLiteral_in_collectionLiteral8685);
					v=setOrMapLiteral(t);
					state._fsp--;

					 value = v; 
					match(input,195,FOLLOW_195_in_collectionLiteral8690); 
					}
					break;
				case 3 :
					// Parser.g:1253:7: '{' '}'
					{
					match(input,194,FOLLOW_194_in_collectionLiteral8708); 
					match(input,195,FOLLOW_195_in_collectionLiteral8710); 
					 value = new Sets.Literal(Collections.<Term.Raw>emptyList()); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "collectionLiteral"



	// $ANTLR start "usertypeLiteral"
	// Parser.g:1256:1: usertypeLiteral returns [UserTypes.Literal ut] : '{' k1= noncol_ident ':' v1= term ( ',' kn= noncol_ident ':' vn= term )* '}' ;
	public final UserTypes.Literal usertypeLiteral() throws RecognitionException {
		UserTypes.Literal ut = null;


		ColumnIdentifier k1 =null;
		Term.Raw v1 =null;
		ColumnIdentifier kn =null;
		Term.Raw vn =null;

		 Map<ColumnIdentifier, Term.Raw> m = new HashMap<ColumnIdentifier, Term.Raw>(); 
		try {
			// Parser.g:1260:5: ( '{' k1= noncol_ident ':' v1= term ( ',' kn= noncol_ident ':' vn= term )* '}' )
			// Parser.g:1260:7: '{' k1= noncol_ident ':' v1= term ( ',' kn= noncol_ident ':' vn= term )* '}'
			{
			match(input,194,FOLLOW_194_in_usertypeLiteral8754); 
			pushFollow(FOLLOW_noncol_ident_in_usertypeLiteral8758);
			k1=noncol_ident();
			state._fsp--;

			match(input,183,FOLLOW_183_in_usertypeLiteral8760); 
			pushFollow(FOLLOW_term_in_usertypeLiteral8764);
			v1=term();
			state._fsp--;

			 m.put(k1, v1); 
			// Parser.g:1260:58: ( ',' kn= noncol_ident ':' vn= term )*
			loop165:
			while (true) {
				int alt165=2;
				int LA165_0 = input.LA(1);
				if ( (LA165_0==180) ) {
					alt165=1;
				}

				switch (alt165) {
				case 1 :
					// Parser.g:1260:60: ',' kn= noncol_ident ':' vn= term
					{
					match(input,180,FOLLOW_180_in_usertypeLiteral8770); 
					pushFollow(FOLLOW_noncol_ident_in_usertypeLiteral8774);
					kn=noncol_ident();
					state._fsp--;

					match(input,183,FOLLOW_183_in_usertypeLiteral8776); 
					pushFollow(FOLLOW_term_in_usertypeLiteral8780);
					vn=term();
					state._fsp--;

					 m.put(kn, vn); 
					}
					break;

				default :
					break loop165;
				}
			}

			match(input,195,FOLLOW_195_in_usertypeLiteral8787); 
			}

			 ut = new UserTypes.Literal(m); 
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ut;
	}
	// $ANTLR end "usertypeLiteral"



	// $ANTLR start "tupleLiteral"
	// Parser.g:1263:1: tupleLiteral returns [Tuples.Literal tt] : '(' t1= term ( ',' tn= term )* ')' ;
	public final Tuples.Literal tupleLiteral() throws RecognitionException {
		Tuples.Literal tt = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		 List<Term.Raw> l = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1266:5: ( '(' t1= term ( ',' tn= term )* ')' )
			// Parser.g:1266:7: '(' t1= term ( ',' tn= term )* ')'
			{
			match(input,177,FOLLOW_177_in_tupleLiteral8824); 
			pushFollow(FOLLOW_term_in_tupleLiteral8828);
			t1=term();
			state._fsp--;

			 l.add(t1); 
			// Parser.g:1266:34: ( ',' tn= term )*
			loop166:
			while (true) {
				int alt166=2;
				int LA166_0 = input.LA(1);
				if ( (LA166_0==180) ) {
					alt166=1;
				}

				switch (alt166) {
				case 1 :
					// Parser.g:1266:36: ',' tn= term
					{
					match(input,180,FOLLOW_180_in_tupleLiteral8834); 
					pushFollow(FOLLOW_term_in_tupleLiteral8838);
					tn=term();
					state._fsp--;

					 l.add(tn); 
					}
					break;

				default :
					break loop166;
				}
			}

			match(input,178,FOLLOW_178_in_tupleLiteral8845); 
			}

			 tt = new Tuples.Literal(l); 
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tt;
	}
	// $ANTLR end "tupleLiteral"



	// $ANTLR start "value"
	// Parser.g:1269:1: value returns [Term.Raw value] : (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK );
	public final Term.Raw value() throws RecognitionException {
		Term.Raw value = null;


		Constants.Literal c =null;
		Term.Raw l =null;
		UserTypes.Literal u =null;
		Tuples.Literal t =null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:1270:5: (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK )
			int alt167=7;
			alt167 = dfa167.predict(input);
			switch (alt167) {
				case 1 :
					// Parser.g:1270:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_value8868);
					c=constant();
					state._fsp--;

					 value = c; 
					}
					break;
				case 2 :
					// Parser.g:1271:7: l= collectionLiteral
					{
					pushFollow(FOLLOW_collectionLiteral_in_value8890);
					l=collectionLiteral();
					state._fsp--;

					 value = l; 
					}
					break;
				case 3 :
					// Parser.g:1272:7: u= usertypeLiteral
					{
					pushFollow(FOLLOW_usertypeLiteral_in_value8903);
					u=usertypeLiteral();
					state._fsp--;

					 value = u; 
					}
					break;
				case 4 :
					// Parser.g:1273:7: t= tupleLiteral
					{
					pushFollow(FOLLOW_tupleLiteral_in_value8918);
					t=tupleLiteral();
					state._fsp--;

					 value = t; 
					}
					break;
				case 5 :
					// Parser.g:1274:7: K_NULL
					{
					match(input,K_NULL,FOLLOW_K_NULL_in_value8934); 
					 value = Constants.NULL_LITERAL; 
					}
					break;
				case 6 :
					// Parser.g:1275:7: ':' id= noncol_ident
					{
					match(input,183,FOLLOW_183_in_value8958); 
					pushFollow(FOLLOW_noncol_ident_in_value8962);
					id=noncol_ident();
					state._fsp--;

					 value = newBindVariables(id); 
					}
					break;
				case 7 :
					// Parser.g:1276:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_value8973); 
					 value = newBindVariables(null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "value"



	// $ANTLR start "intValue"
	// Parser.g:1279:1: intValue returns [Term.Raw value] : (|t= INTEGER | ':' id= noncol_ident | QMARK );
	public final Term.Raw intValue() throws RecognitionException {
		Term.Raw value = null;


		Token t=null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:1280:5: (|t= INTEGER | ':' id= noncol_ident | QMARK )
			int alt168=4;
			switch ( input.LA(1) ) {
			case EOF:
			case K_ALLOW:
			case K_AND:
			case K_APPLY:
			case K_DELETE:
			case K_INSERT:
			case K_LIMIT:
			case K_SET:
			case K_UPDATE:
			case K_WHERE:
			case 184:
				{
				alt168=1;
				}
				break;
			case INTEGER:
				{
				alt168=2;
				}
				break;
			case 183:
				{
				alt168=3;
				}
				break;
			case QMARK:
				{
				alt168=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 168, 0, input);
				throw nvae;
			}
			switch (alt168) {
				case 1 :
					// Parser.g:1281:5: 
					{
					}
					break;
				case 2 :
					// Parser.g:1281:7: t= INTEGER
					{
					t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_intValue9019); 
					 value = Constants.Literal.integer((t!=null?t.getText():null)); 
					}
					break;
				case 3 :
					// Parser.g:1282:7: ':' id= noncol_ident
					{
					match(input,183,FOLLOW_183_in_intValue9033); 
					pushFollow(FOLLOW_noncol_ident_in_intValue9037);
					id=noncol_ident();
					state._fsp--;

					 value = newBindVariables(id); 
					}
					break;
				case 4 :
					// Parser.g:1283:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_intValue9048); 
					 value = newBindVariables(null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "intValue"



	// $ANTLR start "functionName"
	// Parser.g:1286:1: functionName returns [FunctionName s] : (ks= keyspaceName '.' )? f= allowedFunctionName ;
	public final FunctionName functionName() throws RecognitionException {
		FunctionName s = null;


		String ks =null;
		String f =null;

		try {
			// Parser.g:1287:5: ( (ks= keyspaceName '.' )? f= allowedFunctionName )
			// Parser.g:1287:7: (ks= keyspaceName '.' )? f= allowedFunctionName
			{
			// Parser.g:1287:7: (ks= keyspaceName '.' )?
			int alt169=2;
			alt169 = dfa169.predict(input);
			switch (alt169) {
				case 1 :
					// Parser.g:1287:8: ks= keyspaceName '.'
					{
					pushFollow(FOLLOW_keyspaceName_in_functionName9082);
					ks=keyspaceName();
					state._fsp--;

					match(input,182,FOLLOW_182_in_functionName9084); 
					}
					break;

			}

			pushFollow(FOLLOW_allowedFunctionName_in_functionName9090);
			f=allowedFunctionName();
			state._fsp--;

			 s = new FunctionName(ks, f); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "functionName"



	// $ANTLR start "allowedFunctionName"
	// Parser.g:1290:1: allowedFunctionName returns [String s] : (f= IDENT |f= QUOTED_NAME |u= unreserved_function_keyword | K_TOKEN | K_COUNT );
	public final String allowedFunctionName() throws RecognitionException {
		String s = null;


		Token f=null;
		String u =null;

		try {
			// Parser.g:1291:5: (f= IDENT |f= QUOTED_NAME |u= unreserved_function_keyword | K_TOKEN | K_COUNT )
			int alt170=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt170=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt170=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
				{
				alt170=3;
				}
				break;
			case K_TOKEN:
				{
				alt170=4;
				}
				break;
			case K_COUNT:
				{
				alt170=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 170, 0, input);
				throw nvae;
			}
			switch (alt170) {
				case 1 :
					// Parser.g:1291:7: f= IDENT
					{
					f=(Token)match(input,IDENT,FOLLOW_IDENT_in_allowedFunctionName9117); 
					 s = (f!=null?f.getText():null).toLowerCase(); 
					}
					break;
				case 2 :
					// Parser.g:1292:7: f= QUOTED_NAME
					{
					f=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_allowedFunctionName9151); 
					 s = (f!=null?f.getText():null); 
					}
					break;
				case 3 :
					// Parser.g:1293:7: u= unreserved_function_keyword
					{
					pushFollow(FOLLOW_unreserved_function_keyword_in_allowedFunctionName9179);
					u=unreserved_function_keyword();
					state._fsp--;

					 s = u; 
					}
					break;
				case 4 :
					// Parser.g:1294:7: K_TOKEN
					{
					match(input,K_TOKEN,FOLLOW_K_TOKEN_in_allowedFunctionName9189); 
					 s = "token"; 
					}
					break;
				case 5 :
					// Parser.g:1295:7: K_COUNT
					{
					match(input,K_COUNT,FOLLOW_K_COUNT_in_allowedFunctionName9221); 
					 s = "count"; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "allowedFunctionName"



	// $ANTLR start "function"
	// Parser.g:1298:1: function returns [Term.Raw t] : (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' );
	public final Term.Raw function() throws RecognitionException {
		Term.Raw t = null;


		FunctionName f =null;
		List<Term.Raw> args =null;

		try {
			// Parser.g:1299:5: (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' )
			int alt171=2;
			alt171 = dfa171.predict(input);
			switch (alt171) {
				case 1 :
					// Parser.g:1299:7: f= functionName '(' ')'
					{
					pushFollow(FOLLOW_functionName_in_function9268);
					f=functionName();
					state._fsp--;

					match(input,177,FOLLOW_177_in_function9270); 
					match(input,178,FOLLOW_178_in_function9272); 
					 t = new FunctionCall.Raw(f, Collections.<Term.Raw>emptyList()); 
					}
					break;
				case 2 :
					// Parser.g:1300:7: f= functionName '(' args= functionArgs ')'
					{
					pushFollow(FOLLOW_functionName_in_function9302);
					f=functionName();
					state._fsp--;

					match(input,177,FOLLOW_177_in_function9304); 
					pushFollow(FOLLOW_functionArgs_in_function9308);
					args=functionArgs();
					state._fsp--;

					match(input,178,FOLLOW_178_in_function9310); 
					 t = new FunctionCall.Raw(f, args); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "function"



	// $ANTLR start "functionArgs"
	// Parser.g:1303:1: functionArgs returns [List<Term.Raw> args] : t1= term ( ',' tn= term )* ;
	public final List<Term.Raw> functionArgs() throws RecognitionException {
		List<Term.Raw> args = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		 args = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1305:5: (t1= term ( ',' tn= term )* )
			// Parser.g:1305:7: t1= term ( ',' tn= term )*
			{
			pushFollow(FOLLOW_term_in_functionArgs9343);
			t1=term();
			state._fsp--;

			args.add(t1); 
			// Parser.g:1305:32: ( ',' tn= term )*
			loop172:
			while (true) {
				int alt172=2;
				int LA172_0 = input.LA(1);
				if ( (LA172_0==180) ) {
					alt172=1;
				}

				switch (alt172) {
				case 1 :
					// Parser.g:1305:34: ',' tn= term
					{
					match(input,180,FOLLOW_180_in_functionArgs9349); 
					pushFollow(FOLLOW_term_in_functionArgs9353);
					tn=term();
					state._fsp--;

					 args.add(tn); 
					}
					break;

				default :
					break loop172;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return args;
	}
	// $ANTLR end "functionArgs"



	// $ANTLR start "term"
	// Parser.g:1308:1: term returns [Term.Raw term] : (v= value |f= function | '(' c= comparatorType ')' t= term );
	public final Term.Raw term() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw v =null;
		Term.Raw f =null;
		CQL3Type.Raw c =null;
		Term.Raw t =null;

		try {
			// Parser.g:1309:5: (v= value |f= function | '(' c= comparatorType ')' t= term )
			int alt173=3;
			alt173 = dfa173.predict(input);
			switch (alt173) {
				case 1 :
					// Parser.g:1309:7: v= value
					{
					pushFollow(FOLLOW_value_in_term9381);
					v=value();
					state._fsp--;

					 term = v; 
					}
					break;
				case 2 :
					// Parser.g:1310:7: f= function
					{
					pushFollow(FOLLOW_function_in_term9418);
					f=function();
					state._fsp--;

					 term = f; 
					}
					break;
				case 3 :
					// Parser.g:1311:7: '(' c= comparatorType ')' t= term
					{
					match(input,177,FOLLOW_177_in_term9450); 
					pushFollow(FOLLOW_comparatorType_in_term9454);
					c=comparatorType();
					state._fsp--;

					match(input,178,FOLLOW_178_in_term9456); 
					pushFollow(FOLLOW_term_in_term9460);
					t=term();
					state._fsp--;

					 term = new TypeCast(c, t); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "term"



	// $ANTLR start "columnOperation"
	// Parser.g:1314:1: columnOperation[List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations] : key= cident columnOperationDifferentiator[operations, key] ;
	public final void columnOperation(List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations) throws RecognitionException {
		ColumnIdentifier.Raw key =null;

		try {
			// Parser.g:1315:5: (key= cident columnOperationDifferentiator[operations, key] )
			// Parser.g:1315:7: key= cident columnOperationDifferentiator[operations, key]
			{
			pushFollow(FOLLOW_cident_in_columnOperation9483);
			key=cident();
			state._fsp--;

			pushFollow(FOLLOW_columnOperationDifferentiator_in_columnOperation9485);
			columnOperationDifferentiator(operations, key);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnOperation"



	// $ANTLR start "columnOperationDifferentiator"
	// Parser.g:1318:1: columnOperationDifferentiator[List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key] : ( '=' normalColumnOperation[operations, key] | '[' k= term ']' collectionColumnOperation[operations, key, k] | '.' field= cident udtColumnOperation[operations, key, field] );
	public final void columnOperationDifferentiator(List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key) throws RecognitionException {
		Term.Raw k =null;
		ColumnIdentifier.Raw field =null;

		try {
			// Parser.g:1319:5: ( '=' normalColumnOperation[operations, key] | '[' k= term ']' collectionColumnOperation[operations, key, k] | '.' field= cident udtColumnOperation[operations, key, field] )
			int alt174=3;
			switch ( input.LA(1) ) {
			case 187:
				{
				alt174=1;
				}
				break;
			case 190:
				{
				alt174=2;
				}
				break;
			case 182:
				{
				alt174=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 174, 0, input);
				throw nvae;
			}
			switch (alt174) {
				case 1 :
					// Parser.g:1319:7: '=' normalColumnOperation[operations, key]
					{
					match(input,187,FOLLOW_187_in_columnOperationDifferentiator9504); 
					pushFollow(FOLLOW_normalColumnOperation_in_columnOperationDifferentiator9506);
					normalColumnOperation(operations, key);
					state._fsp--;

					}
					break;
				case 2 :
					// Parser.g:1320:7: '[' k= term ']' collectionColumnOperation[operations, key, k]
					{
					match(input,190,FOLLOW_190_in_columnOperationDifferentiator9515); 
					pushFollow(FOLLOW_term_in_columnOperationDifferentiator9519);
					k=term();
					state._fsp--;

					match(input,192,FOLLOW_192_in_columnOperationDifferentiator9521); 
					pushFollow(FOLLOW_collectionColumnOperation_in_columnOperationDifferentiator9523);
					collectionColumnOperation(operations, key, k);
					state._fsp--;

					}
					break;
				case 3 :
					// Parser.g:1321:7: '.' field= cident udtColumnOperation[operations, key, field]
					{
					match(input,182,FOLLOW_182_in_columnOperationDifferentiator9532); 
					pushFollow(FOLLOW_cident_in_columnOperationDifferentiator9536);
					field=cident();
					state._fsp--;

					pushFollow(FOLLOW_udtColumnOperation_in_columnOperationDifferentiator9538);
					udtColumnOperation(operations, key, field);
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnOperationDifferentiator"



	// $ANTLR start "normalColumnOperation"
	// Parser.g:1324:1: normalColumnOperation[List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key] : (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER );
	public final void normalColumnOperation(List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key) throws RecognitionException {
		Token sig=null;
		Token i=null;
		Term.Raw t =null;
		ColumnIdentifier.Raw c =null;

		try {
			// Parser.g:1325:5: (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER )
			int alt176=3;
			alt176 = dfa176.predict(input);
			switch (alt176) {
				case 1 :
					// Parser.g:1325:7: t= term ( '+' c= cident )?
					{
					pushFollow(FOLLOW_term_in_normalColumnOperation9559);
					t=term();
					state._fsp--;

					// Parser.g:1325:14: ( '+' c= cident )?
					int alt175=2;
					int LA175_0 = input.LA(1);
					if ( (LA175_0==179) ) {
						alt175=1;
					}
					switch (alt175) {
						case 1 :
							// Parser.g:1325:15: '+' c= cident
							{
							match(input,179,FOLLOW_179_in_normalColumnOperation9562); 
							pushFollow(FOLLOW_cident_in_normalColumnOperation9566);
							c=cident();
							state._fsp--;

							}
							break;

					}


					          if (c == null)
					          {
					              addRawUpdate(operations, key, new Operation.SetValue(t));
					          }
					          else
					          {
					              if (!key.equals(c))
					                  addRecognitionError("Only expressions of the form X = <value> + X are supported.");
					              addRawUpdate(operations, key, new Operation.Prepend(t));
					          }
					      
					}
					break;
				case 2 :
					// Parser.g:1338:7: c= cident sig= ( '+' | '-' ) t= term
					{
					pushFollow(FOLLOW_cident_in_normalColumnOperation9587);
					c=cident();
					state._fsp--;

					sig=input.LT(1);
					if ( input.LA(1)==179||input.LA(1)==181 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_normalColumnOperation9601);
					t=term();
					state._fsp--;


					          if (!key.equals(c))
					              addRecognitionError("Only expressions of the form X = X " + (sig!=null?sig.getText():null) + "<value> are supported.");
					          addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+") ? new Operation.Addition(t) : new Operation.Substraction(t));
					      
					}
					break;
				case 3 :
					// Parser.g:1344:7: c= cident i= INTEGER
					{
					pushFollow(FOLLOW_cident_in_normalColumnOperation9619);
					c=cident();
					state._fsp--;

					i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_normalColumnOperation9623); 

					          // Note that this production *is* necessary because X = X - 3 will in fact be lexed as [ X, '=', X, INTEGER].
					          if (!key.equals(c))
					              // We don't yet allow a '+' in front of an integer, but we could in the future really, so let's be future-proof in our error message
					              addRecognitionError("Only expressions of the form X = X " + ((i!=null?i.getText():null).charAt(0) == '-' ? '-' : '+') + " <value> are supported.");
					          addRawUpdate(operations, key, new Operation.Addition(Constants.Literal.integer((i!=null?i.getText():null))));
					      
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "normalColumnOperation"



	// $ANTLR start "collectionColumnOperation"
	// Parser.g:1354:1: collectionColumnOperation[List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key, Term.Raw k] : '=' t= term ;
	public final void collectionColumnOperation(List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key, Term.Raw k) throws RecognitionException {
		Term.Raw t =null;

		try {
			// Parser.g:1355:5: ( '=' t= term )
			// Parser.g:1355:7: '=' t= term
			{
			match(input,187,FOLLOW_187_in_collectionColumnOperation9649); 
			pushFollow(FOLLOW_term_in_collectionColumnOperation9653);
			t=term();
			state._fsp--;


			          addRawUpdate(operations, key, new Operation.SetElement(k, t));
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "collectionColumnOperation"



	// $ANTLR start "udtColumnOperation"
	// Parser.g:1361:1: udtColumnOperation[List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key, ColumnIdentifier.Raw field] : '=' t= term ;
	public final void udtColumnOperation(List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key, ColumnIdentifier.Raw field) throws RecognitionException {
		Term.Raw t =null;

		try {
			// Parser.g:1362:5: ( '=' t= term )
			// Parser.g:1362:7: '=' t= term
			{
			match(input,187,FOLLOW_187_in_udtColumnOperation9679); 
			pushFollow(FOLLOW_term_in_udtColumnOperation9683);
			t=term();
			state._fsp--;


			          addRawUpdate(operations, key, new Operation.SetField(field, t));
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "udtColumnOperation"



	// $ANTLR start "columnCondition"
	// Parser.g:1368:1: columnCondition[List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions] : key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) ) ;
	public final void columnCondition(List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions) throws RecognitionException {
		ColumnIdentifier.Raw key =null;
		Operator op =null;
		Term.Raw t =null;
		List<Term.Raw> values =null;
		AbstractMarker.INRaw marker =null;
		Term.Raw element =null;
		ColumnIdentifier.Raw field =null;

		try {
			// Parser.g:1370:5: (key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) ) )
			// Parser.g:1370:7: key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) )
			{
			pushFollow(FOLLOW_cident_in_columnCondition9716);
			key=cident();
			state._fsp--;

			// Parser.g:1371:9: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) )
			int alt182=4;
			switch ( input.LA(1) ) {
			case 176:
			case 185:
			case 186:
			case 187:
			case 188:
			case 189:
				{
				alt182=1;
				}
				break;
			case K_IN:
				{
				alt182=2;
				}
				break;
			case 190:
				{
				alt182=3;
				}
				break;
			case 182:
				{
				alt182=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 182, 0, input);
				throw nvae;
			}
			switch (alt182) {
				case 1 :
					// Parser.g:1371:11: op= relationType t= term
					{
					pushFollow(FOLLOW_relationType_in_columnCondition9730);
					op=relationType();
					state._fsp--;

					pushFollow(FOLLOW_term_in_columnCondition9734);
					t=term();
					state._fsp--;

					 conditions.add(Pair.create(key, ColumnCondition.Raw.simpleCondition(t, op))); 
					}
					break;
				case 2 :
					// Parser.g:1372:11: K_IN (values= singleColumnInValues |marker= inMarker )
					{
					match(input,K_IN,FOLLOW_K_IN_in_columnCondition9748); 
					// Parser.g:1373:13: (values= singleColumnInValues |marker= inMarker )
					int alt177=2;
					int LA177_0 = input.LA(1);
					if ( (LA177_0==177) ) {
						alt177=1;
					}
					else if ( (LA177_0==QMARK||LA177_0==183) ) {
						alt177=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 177, 0, input);
						throw nvae;
					}

					switch (alt177) {
						case 1 :
							// Parser.g:1373:15: values= singleColumnInValues
							{
							pushFollow(FOLLOW_singleColumnInValues_in_columnCondition9766);
							values=singleColumnInValues();
							state._fsp--;

							 conditions.add(Pair.create(key, ColumnCondition.Raw.simpleInCondition(values))); 
							}
							break;
						case 2 :
							// Parser.g:1374:15: marker= inMarker
							{
							pushFollow(FOLLOW_inMarker_in_columnCondition9786);
							marker=inMarker();
							state._fsp--;

							 conditions.add(Pair.create(key, ColumnCondition.Raw.simpleInCondition(marker))); 
							}
							break;

					}

					}
					break;
				case 3 :
					// Parser.g:1376:11: '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					{
					match(input,190,FOLLOW_190_in_columnCondition9814); 
					pushFollow(FOLLOW_term_in_columnCondition9818);
					element=term();
					state._fsp--;

					match(input,192,FOLLOW_192_in_columnCondition9820); 
					// Parser.g:1377:13: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					int alt179=2;
					int LA179_0 = input.LA(1);
					if ( (LA179_0==176||(LA179_0 >= 185 && LA179_0 <= 189)) ) {
						alt179=1;
					}
					else if ( (LA179_0==K_IN) ) {
						alt179=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 179, 0, input);
						throw nvae;
					}

					switch (alt179) {
						case 1 :
							// Parser.g:1377:15: op= relationType t= term
							{
							pushFollow(FOLLOW_relationType_in_columnCondition9838);
							op=relationType();
							state._fsp--;

							pushFollow(FOLLOW_term_in_columnCondition9842);
							t=term();
							state._fsp--;

							 conditions.add(Pair.create(key, ColumnCondition.Raw.collectionCondition(t, element, op))); 
							}
							break;
						case 2 :
							// Parser.g:1378:15: K_IN (values= singleColumnInValues |marker= inMarker )
							{
							match(input,K_IN,FOLLOW_K_IN_in_columnCondition9860); 
							// Parser.g:1379:17: (values= singleColumnInValues |marker= inMarker )
							int alt178=2;
							int LA178_0 = input.LA(1);
							if ( (LA178_0==177) ) {
								alt178=1;
							}
							else if ( (LA178_0==QMARK||LA178_0==183) ) {
								alt178=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 178, 0, input);
								throw nvae;
							}

							switch (alt178) {
								case 1 :
									// Parser.g:1379:19: values= singleColumnInValues
									{
									pushFollow(FOLLOW_singleColumnInValues_in_columnCondition9882);
									values=singleColumnInValues();
									state._fsp--;

									 conditions.add(Pair.create(key, ColumnCondition.Raw.collectionInCondition(element, values))); 
									}
									break;
								case 2 :
									// Parser.g:1380:19: marker= inMarker
									{
									pushFollow(FOLLOW_inMarker_in_columnCondition9906);
									marker=inMarker();
									state._fsp--;

									 conditions.add(Pair.create(key, ColumnCondition.Raw.collectionInCondition(element, marker))); 
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 4 :
					// Parser.g:1383:11: '.' field= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					{
					match(input,182,FOLLOW_182_in_columnCondition9952); 
					pushFollow(FOLLOW_cident_in_columnCondition9956);
					field=cident();
					state._fsp--;

					// Parser.g:1384:13: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					int alt181=2;
					int LA181_0 = input.LA(1);
					if ( (LA181_0==176||(LA181_0 >= 185 && LA181_0 <= 189)) ) {
						alt181=1;
					}
					else if ( (LA181_0==K_IN) ) {
						alt181=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 181, 0, input);
						throw nvae;
					}

					switch (alt181) {
						case 1 :
							// Parser.g:1384:15: op= relationType t= term
							{
							pushFollow(FOLLOW_relationType_in_columnCondition9974);
							op=relationType();
							state._fsp--;

							pushFollow(FOLLOW_term_in_columnCondition9978);
							t=term();
							state._fsp--;

							 conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldCondition(t, field, op))); 
							}
							break;
						case 2 :
							// Parser.g:1385:15: K_IN (values= singleColumnInValues |marker= inMarker )
							{
							match(input,K_IN,FOLLOW_K_IN_in_columnCondition9996); 
							// Parser.g:1386:17: (values= singleColumnInValues |marker= inMarker )
							int alt180=2;
							int LA180_0 = input.LA(1);
							if ( (LA180_0==177) ) {
								alt180=1;
							}
							else if ( (LA180_0==QMARK||LA180_0==183) ) {
								alt180=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 180, 0, input);
								throw nvae;
							}

							switch (alt180) {
								case 1 :
									// Parser.g:1386:19: values= singleColumnInValues
									{
									pushFollow(FOLLOW_singleColumnInValues_in_columnCondition10018);
									values=singleColumnInValues();
									state._fsp--;

									 conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldInCondition(field, values))); 
									}
									break;
								case 2 :
									// Parser.g:1387:19: marker= inMarker
									{
									pushFollow(FOLLOW_inMarker_in_columnCondition10042);
									marker=inMarker();
									state._fsp--;

									 conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldInCondition(field, marker))); 
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnCondition"



	// $ANTLR start "properties"
	// Parser.g:1393:1: properties[PropertyDefinitions props] : property[props] ( K_AND property[props] )* ;
	public final void properties(PropertyDefinitions props) throws RecognitionException {
		try {
			// Parser.g:1394:5: ( property[props] ( K_AND property[props] )* )
			// Parser.g:1394:7: property[props] ( K_AND property[props] )*
			{
			pushFollow(FOLLOW_property_in_properties10104);
			property(props);
			state._fsp--;

			// Parser.g:1394:23: ( K_AND property[props] )*
			loop183:
			while (true) {
				int alt183=2;
				int LA183_0 = input.LA(1);
				if ( (LA183_0==K_AND) ) {
					alt183=1;
				}

				switch (alt183) {
				case 1 :
					// Parser.g:1394:24: K_AND property[props]
					{
					match(input,K_AND,FOLLOW_K_AND_in_properties10108); 
					pushFollow(FOLLOW_property_in_properties10110);
					property(props);
					state._fsp--;

					}
					break;

				default :
					break loop183;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "properties"



	// $ANTLR start "property"
	// Parser.g:1397:1: property[PropertyDefinitions props] : (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= mapLiteral );
	public final void property(PropertyDefinitions props) throws RecognitionException {
		ColumnIdentifier k =null;
		String simple =null;
		Maps.Literal map =null;

		try {
			// Parser.g:1398:5: (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= mapLiteral )
			int alt184=2;
			alt184 = dfa184.predict(input);
			switch (alt184) {
				case 1 :
					// Parser.g:1398:7: k= noncol_ident '=' simple= propertyValue
					{
					pushFollow(FOLLOW_noncol_ident_in_property10133);
					k=noncol_ident();
					state._fsp--;

					match(input,187,FOLLOW_187_in_property10135); 
					pushFollow(FOLLOW_propertyValue_in_property10139);
					simple=propertyValue();
					state._fsp--;

					 try { props.addProperty(k.toString(), simple); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 
					}
					break;
				case 2 :
					// Parser.g:1399:7: k= noncol_ident '=' map= mapLiteral
					{
					pushFollow(FOLLOW_noncol_ident_in_property10151);
					k=noncol_ident();
					state._fsp--;

					match(input,187,FOLLOW_187_in_property10153); 
					pushFollow(FOLLOW_mapLiteral_in_property10157);
					map=mapLiteral();
					state._fsp--;

					 try { props.addProperty(k.toString(), convertPropertyMap(map)); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "property"



	// $ANTLR start "propertyValue"
	// Parser.g:1402:1: propertyValue returns [String str] : (c= constant |u= unreserved_keyword );
	public final String propertyValue() throws RecognitionException {
		String str = null;


		Constants.Literal c =null;
		String u =null;

		try {
			// Parser.g:1403:5: (c= constant |u= unreserved_keyword )
			int alt185=2;
			int LA185_0 = input.LA(1);
			if ( (LA185_0==BOOLEAN||LA185_0==FLOAT||LA185_0==HEXNUMBER||LA185_0==INTEGER||LA185_0==K_INFINITY||LA185_0==K_NAN||LA185_0==STRING_LITERAL||LA185_0==UUID||LA185_0==181) ) {
				alt185=1;
			}
			else if ( ((LA185_0 >= K_AGGREGATE && LA185_0 <= K_ALL)||LA185_0==K_AS||LA185_0==K_ASCII||(LA185_0 >= K_BIGINT && LA185_0 <= K_BOOLEAN)||(LA185_0 >= K_CALLED && LA185_0 <= K_CLUSTERING)||(LA185_0 >= K_COMPACT && LA185_0 <= K_COUNTER)||(LA185_0 >= K_CUSTOM && LA185_0 <= K_DECIMAL)||(LA185_0 >= K_DISTINCT && LA185_0 <= K_DOUBLE)||(LA185_0 >= K_EXISTS && LA185_0 <= K_FLOAT)||LA185_0==K_FROZEN||(LA185_0 >= K_FUNCTION && LA185_0 <= K_FUNCTIONS)||LA185_0==K_INET||(LA185_0 >= K_INITCOND && LA185_0 <= K_INPUT)||LA185_0==K_INT||(LA185_0 >= K_JSON && LA185_0 <= K_KEYS)||(LA185_0 >= K_KEYSPACES && LA185_0 <= K_LIKE)||(LA185_0 >= K_LIST && LA185_0 <= K_MAP)||LA185_0==K_NOLOGIN||LA185_0==K_NOSUPERUSER||LA185_0==K_OPTIONS||(LA185_0 >= K_PARTITION && LA185_0 <= K_PERMISSIONS)||LA185_0==K_RETURNS||(LA185_0 >= K_ROLE && LA185_0 <= K_ROLES)||(LA185_0 >= K_SFUNC && LA185_0 <= K_TINYINT)||LA185_0==K_TRIGGER||(LA185_0 >= K_TTL && LA185_0 <= K_TYPE)||(LA185_0 >= K_USER && LA185_0 <= K_USERS)||(LA185_0 >= K_UUID && LA185_0 <= K_VARINT)||LA185_0==K_WRITETIME) ) {
				alt185=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 185, 0, input);
				throw nvae;
			}

			switch (alt185) {
				case 1 :
					// Parser.g:1403:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_propertyValue10182);
					c=constant();
					state._fsp--;

					 str = c.getRawText(); 
					}
					break;
				case 2 :
					// Parser.g:1404:7: u= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_propertyValue10204);
					u=unreserved_keyword();
					state._fsp--;

					 str = u; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "propertyValue"



	// $ANTLR start "relationType"
	// Parser.g:1407:1: relationType returns [Operator op] : ( '=' | '<' | '<=' | '>' | '>=' | '!=' );
	public final Operator relationType() throws RecognitionException {
		Operator op = null;


		try {
			// Parser.g:1408:5: ( '=' | '<' | '<=' | '>' | '>=' | '!=' )
			int alt186=6;
			switch ( input.LA(1) ) {
			case 187:
				{
				alt186=1;
				}
				break;
			case 185:
				{
				alt186=2;
				}
				break;
			case 186:
				{
				alt186=3;
				}
				break;
			case 188:
				{
				alt186=4;
				}
				break;
			case 189:
				{
				alt186=5;
				}
				break;
			case 176:
				{
				alt186=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 186, 0, input);
				throw nvae;
			}
			switch (alt186) {
				case 1 :
					// Parser.g:1408:7: '='
					{
					match(input,187,FOLLOW_187_in_relationType10227); 
					 op = Operator.EQ; 
					}
					break;
				case 2 :
					// Parser.g:1409:7: '<'
					{
					match(input,185,FOLLOW_185_in_relationType10238); 
					 op = Operator.LT; 
					}
					break;
				case 3 :
					// Parser.g:1410:7: '<='
					{
					match(input,186,FOLLOW_186_in_relationType10249); 
					 op = Operator.LTE; 
					}
					break;
				case 4 :
					// Parser.g:1411:7: '>'
					{
					match(input,188,FOLLOW_188_in_relationType10259); 
					 op = Operator.GT; 
					}
					break;
				case 5 :
					// Parser.g:1412:7: '>='
					{
					match(input,189,FOLLOW_189_in_relationType10270); 
					 op = Operator.GTE; 
					}
					break;
				case 6 :
					// Parser.g:1413:7: '!='
					{
					match(input,176,FOLLOW_176_in_relationType10280); 
					 op = Operator.NEQ; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "relationType"



	// $ANTLR start "relation"
	// Parser.g:1416:1: relation[WhereClause.Builder clauses] : (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident K_CONTAINS ( K_KEY )? t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );
	public final void relation(WhereClause.Builder clauses) throws RecognitionException {
		ColumnIdentifier.Raw name =null;
		Operator type =null;
		Term.Raw t =null;
		List<ColumnIdentifier.Raw> l =null;
		AbstractMarker.INRaw marker =null;
		List<Term.Raw> inValues =null;
		Term.Raw key =null;
		List<ColumnIdentifier.Raw> ids =null;
		Tuples.INRaw tupleInMarker =null;
		List<Tuples.Literal> literals =null;
		List<Tuples.Raw> markers =null;
		Tuples.Literal literal =null;
		Tuples.Raw tupleMarker =null;

		try {
			// Parser.g:1417:5: (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident K_CONTAINS ( K_KEY )? t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' )
			int alt190=10;
			alt190 = dfa190.predict(input);
			switch (alt190) {
				case 1 :
					// Parser.g:1417:7: name= cident type= relationType t= term
					{
					pushFollow(FOLLOW_cident_in_relation10302);
					name=cident();
					state._fsp--;

					pushFollow(FOLLOW_relationType_in_relation10306);
					type=relationType();
					state._fsp--;

					pushFollow(FOLLOW_term_in_relation10310);
					t=term();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, type, t)); 
					}
					break;
				case 2 :
					// Parser.g:1418:7: name= cident K_LIKE t= term
					{
					pushFollow(FOLLOW_cident_in_relation10322);
					name=cident();
					state._fsp--;

					match(input,K_LIKE,FOLLOW_K_LIKE_in_relation10324); 
					pushFollow(FOLLOW_term_in_relation10328);
					t=term();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, Operator.LIKE, t)); 
					}
					break;
				case 3 :
					// Parser.g:1419:7: name= cident K_IS K_NOT K_NULL
					{
					pushFollow(FOLLOW_cident_in_relation10340);
					name=cident();
					state._fsp--;

					match(input,K_IS,FOLLOW_K_IS_in_relation10342); 
					match(input,K_NOT,FOLLOW_K_NOT_in_relation10344); 
					match(input,K_NULL,FOLLOW_K_NULL_in_relation10346); 
					 clauses.add(new SingleColumnRelation(name, Operator.IS_NOT, Constants.NULL_LITERAL)); 
					}
					break;
				case 4 :
					// Parser.g:1420:7: K_TOKEN l= tupleOfIdentifiers type= relationType t= term
					{
					match(input,K_TOKEN,FOLLOW_K_TOKEN_in_relation10356); 
					pushFollow(FOLLOW_tupleOfIdentifiers_in_relation10360);
					l=tupleOfIdentifiers();
					state._fsp--;

					pushFollow(FOLLOW_relationType_in_relation10364);
					type=relationType();
					state._fsp--;

					pushFollow(FOLLOW_term_in_relation10368);
					t=term();
					state._fsp--;

					 clauses.add(new TokenRelation(l, type, t)); 
					}
					break;
				case 5 :
					// Parser.g:1422:7: name= cident K_IN marker= inMarker
					{
					pushFollow(FOLLOW_cident_in_relation10388);
					name=cident();
					state._fsp--;

					match(input,K_IN,FOLLOW_K_IN_in_relation10390); 
					pushFollow(FOLLOW_inMarker_in_relation10394);
					marker=inMarker();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, Operator.IN, marker)); 
					}
					break;
				case 6 :
					// Parser.g:1424:7: name= cident K_IN inValues= singleColumnInValues
					{
					pushFollow(FOLLOW_cident_in_relation10414);
					name=cident();
					state._fsp--;

					match(input,K_IN,FOLLOW_K_IN_in_relation10416); 
					pushFollow(FOLLOW_singleColumnInValues_in_relation10420);
					inValues=singleColumnInValues();
					state._fsp--;

					 clauses.add(SingleColumnRelation.createInRelation(name, inValues)); 
					}
					break;
				case 7 :
					// Parser.g:1426:7: name= cident K_CONTAINS ( K_KEY )? t= term
					{
					pushFollow(FOLLOW_cident_in_relation10440);
					name=cident();
					state._fsp--;

					match(input,K_CONTAINS,FOLLOW_K_CONTAINS_in_relation10442); 
					 Operator rt = Operator.CONTAINS; 
					// Parser.g:1426:67: ( K_KEY )?
					int alt187=2;
					int LA187_0 = input.LA(1);
					if ( (LA187_0==K_KEY) ) {
						int LA187_1 = input.LA(2);
						if ( (LA187_1==BOOLEAN||LA187_1==FLOAT||LA187_1==HEXNUMBER||(LA187_1 >= IDENT && LA187_1 <= INTEGER)||(LA187_1 >= K_AGGREGATE && LA187_1 <= K_ALL)||LA187_1==K_AS||LA187_1==K_ASCII||(LA187_1 >= K_BIGINT && LA187_1 <= K_BOOLEAN)||(LA187_1 >= K_CALLED && LA187_1 <= K_CLUSTERING)||(LA187_1 >= K_COMPACT && LA187_1 <= K_COUNTER)||(LA187_1 >= K_CUSTOM && LA187_1 <= K_DECIMAL)||(LA187_1 >= K_DISTINCT && LA187_1 <= K_DOUBLE)||(LA187_1 >= K_EXISTS && LA187_1 <= K_FLOAT)||LA187_1==K_FROZEN||(LA187_1 >= K_FUNCTION && LA187_1 <= K_FUNCTIONS)||(LA187_1 >= K_INET && LA187_1 <= K_INPUT)||LA187_1==K_INT||(LA187_1 >= K_JSON && LA187_1 <= K_KEYS)||(LA187_1 >= K_KEYSPACES && LA187_1 <= K_LIKE)||(LA187_1 >= K_LIST && LA187_1 <= K_MAP)||(LA187_1 >= K_NAN && LA187_1 <= K_NOLOGIN)||LA187_1==K_NOSUPERUSER||LA187_1==K_NULL||LA187_1==K_OPTIONS||(LA187_1 >= K_PARTITION && LA187_1 <= K_PERMISSIONS)||LA187_1==K_RETURNS||(LA187_1 >= K_ROLE && LA187_1 <= K_ROLES)||(LA187_1 >= K_SFUNC && LA187_1 <= K_TINYINT)||(LA187_1 >= K_TOKEN && LA187_1 <= K_TRIGGER)||(LA187_1 >= K_TTL && LA187_1 <= K_TYPE)||(LA187_1 >= K_USER && LA187_1 <= K_USERS)||(LA187_1 >= K_UUID && LA187_1 <= K_VARINT)||LA187_1==K_WRITETIME||(LA187_1 >= QMARK && LA187_1 <= QUOTED_NAME)||LA187_1==STRING_LITERAL||LA187_1==UUID||LA187_1==177||LA187_1==181||LA187_1==183||LA187_1==190||LA187_1==194) ) {
							alt187=1;
						}
					}
					switch (alt187) {
						case 1 :
							// Parser.g:1426:68: K_KEY
							{
							match(input,K_KEY,FOLLOW_K_KEY_in_relation10447); 
							 rt = Operator.CONTAINS_KEY; 
							}
							break;

					}

					pushFollow(FOLLOW_term_in_relation10463);
					t=term();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, rt, t)); 
					}
					break;
				case 8 :
					// Parser.g:1428:7: name= cident '[' key= term ']' type= relationType t= term
					{
					pushFollow(FOLLOW_cident_in_relation10475);
					name=cident();
					state._fsp--;

					match(input,190,FOLLOW_190_in_relation10477); 
					pushFollow(FOLLOW_term_in_relation10481);
					key=term();
					state._fsp--;

					match(input,192,FOLLOW_192_in_relation10483); 
					pushFollow(FOLLOW_relationType_in_relation10487);
					type=relationType();
					state._fsp--;

					pushFollow(FOLLOW_term_in_relation10491);
					t=term();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, key, type, t)); 
					}
					break;
				case 9 :
					// Parser.g:1429:7: ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )
					{
					pushFollow(FOLLOW_tupleOfIdentifiers_in_relation10503);
					ids=tupleOfIdentifiers();
					state._fsp--;

					// Parser.g:1430:7: ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )
					int alt189=3;
					alt189 = dfa189.predict(input);
					switch (alt189) {
						case 1 :
							// Parser.g:1430:9: K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples )
							{
							match(input,K_IN,FOLLOW_K_IN_in_relation10513); 
							// Parser.g:1431:11: ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples )
							int alt188=4;
							int LA188_0 = input.LA(1);
							if ( (LA188_0==177) ) {
								switch ( input.LA(2) ) {
								case 178:
									{
									alt188=1;
									}
									break;
								case 177:
									{
									alt188=3;
									}
									break;
								case QMARK:
								case 183:
									{
									alt188=4;
									}
									break;
								default:
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 188, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else if ( (LA188_0==QMARK||LA188_0==183) ) {
								alt188=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 188, 0, input);
								throw nvae;
							}

							switch (alt188) {
								case 1 :
									// Parser.g:1431:13: '(' ')'
									{
									match(input,177,FOLLOW_177_in_relation10527); 
									match(input,178,FOLLOW_178_in_relation10529); 
									 clauses.add(MultiColumnRelation.createInRelation(ids, new ArrayList<Tuples.Literal>())); 
									}
									break;
								case 2 :
									// Parser.g:1433:13: tupleInMarker= inMarkerForTuple
									{
									pushFollow(FOLLOW_inMarkerForTuple_in_relation10561);
									tupleInMarker=inMarkerForTuple();
									state._fsp--;

									 clauses.add(MultiColumnRelation.createSingleMarkerInRelation(ids, tupleInMarker)); 
									}
									break;
								case 3 :
									// Parser.g:1435:13: literals= tupleOfTupleLiterals
									{
									pushFollow(FOLLOW_tupleOfTupleLiterals_in_relation10595);
									literals=tupleOfTupleLiterals();
									state._fsp--;


									                  clauses.add(MultiColumnRelation.createInRelation(ids, literals));
									              
									}
									break;
								case 4 :
									// Parser.g:1439:13: markers= tupleOfMarkersForTuples
									{
									pushFollow(FOLLOW_tupleOfMarkersForTuples_in_relation10629);
									markers=tupleOfMarkersForTuples();
									state._fsp--;

									 clauses.add(MultiColumnRelation.createInRelation(ids, markers)); 
									}
									break;

							}

							}
							break;
						case 2 :
							// Parser.g:1442:9: type= relationType literal= tupleLiteral
							{
							pushFollow(FOLLOW_relationType_in_relation10671);
							type=relationType();
							state._fsp--;

							pushFollow(FOLLOW_tupleLiteral_in_relation10675);
							literal=tupleLiteral();
							state._fsp--;


							              clauses.add(MultiColumnRelation.createNonInRelation(ids, type, literal));
							          
							}
							break;
						case 3 :
							// Parser.g:1446:9: type= relationType tupleMarker= markerForTuple
							{
							pushFollow(FOLLOW_relationType_in_relation10701);
							type=relationType();
							state._fsp--;

							pushFollow(FOLLOW_markerForTuple_in_relation10705);
							tupleMarker=markerForTuple();
							state._fsp--;

							 clauses.add(MultiColumnRelation.createNonInRelation(ids, type, tupleMarker)); 
							}
							break;

					}

					}
					break;
				case 10 :
					// Parser.g:1449:7: '(' relation[$clauses] ')'
					{
					match(input,177,FOLLOW_177_in_relation10735); 
					pushFollow(FOLLOW_relation_in_relation10737);
					relation(clauses);
					state._fsp--;

					match(input,178,FOLLOW_178_in_relation10740); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relation"



	// $ANTLR start "inMarker"
	// Parser.g:1452:1: inMarker returns [AbstractMarker.INRaw marker] : ( QMARK | ':' name= noncol_ident );
	public final AbstractMarker.INRaw inMarker() throws RecognitionException {
		AbstractMarker.INRaw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1453:5: ( QMARK | ':' name= noncol_ident )
			int alt191=2;
			int LA191_0 = input.LA(1);
			if ( (LA191_0==QMARK) ) {
				alt191=1;
			}
			else if ( (LA191_0==183) ) {
				alt191=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 191, 0, input);
				throw nvae;
			}

			switch (alt191) {
				case 1 :
					// Parser.g:1453:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_inMarker10761); 
					 marker = newINBindVariables(null); 
					}
					break;
				case 2 :
					// Parser.g:1454:7: ':' name= noncol_ident
					{
					match(input,183,FOLLOW_183_in_inMarker10771); 
					pushFollow(FOLLOW_noncol_ident_in_inMarker10775);
					name=noncol_ident();
					state._fsp--;

					 marker = newINBindVariables(name); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "inMarker"



	// $ANTLR start "tupleOfIdentifiers"
	// Parser.g:1457:1: tupleOfIdentifiers returns [List<ColumnIdentifier.Raw> ids] : '(' n1= cident ( ',' ni= cident )* ')' ;
	public final List<ColumnIdentifier.Raw> tupleOfIdentifiers() throws RecognitionException {
		List<ColumnIdentifier.Raw> ids = null;


		ColumnIdentifier.Raw n1 =null;
		ColumnIdentifier.Raw ni =null;

		 ids = new ArrayList<ColumnIdentifier.Raw>(); 
		try {
			// Parser.g:1459:5: ( '(' n1= cident ( ',' ni= cident )* ')' )
			// Parser.g:1459:7: '(' n1= cident ( ',' ni= cident )* ')'
			{
			match(input,177,FOLLOW_177_in_tupleOfIdentifiers10807); 
			pushFollow(FOLLOW_cident_in_tupleOfIdentifiers10811);
			n1=cident();
			state._fsp--;

			 ids.add(n1); 
			// Parser.g:1459:39: ( ',' ni= cident )*
			loop192:
			while (true) {
				int alt192=2;
				int LA192_0 = input.LA(1);
				if ( (LA192_0==180) ) {
					alt192=1;
				}

				switch (alt192) {
				case 1 :
					// Parser.g:1459:40: ',' ni= cident
					{
					match(input,180,FOLLOW_180_in_tupleOfIdentifiers10816); 
					pushFollow(FOLLOW_cident_in_tupleOfIdentifiers10820);
					ni=cident();
					state._fsp--;

					 ids.add(ni); 
					}
					break;

				default :
					break loop192;
				}
			}

			match(input,178,FOLLOW_178_in_tupleOfIdentifiers10826); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ids;
	}
	// $ANTLR end "tupleOfIdentifiers"



	// $ANTLR start "singleColumnInValues"
	// Parser.g:1462:1: singleColumnInValues returns [List<Term.Raw> terms] : '(' (t1= term ( ',' ti= term )* )? ')' ;
	public final List<Term.Raw> singleColumnInValues() throws RecognitionException {
		List<Term.Raw> terms = null;


		Term.Raw t1 =null;
		Term.Raw ti =null;

		 terms = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1464:5: ( '(' (t1= term ( ',' ti= term )* )? ')' )
			// Parser.g:1464:7: '(' (t1= term ( ',' ti= term )* )? ')'
			{
			match(input,177,FOLLOW_177_in_singleColumnInValues10856); 
			// Parser.g:1464:11: (t1= term ( ',' ti= term )* )?
			int alt194=2;
			int LA194_0 = input.LA(1);
			if ( (LA194_0==BOOLEAN||LA194_0==FLOAT||LA194_0==HEXNUMBER||(LA194_0 >= IDENT && LA194_0 <= INTEGER)||(LA194_0 >= K_AGGREGATE && LA194_0 <= K_ALL)||LA194_0==K_AS||LA194_0==K_ASCII||(LA194_0 >= K_BIGINT && LA194_0 <= K_BOOLEAN)||(LA194_0 >= K_CALLED && LA194_0 <= K_CLUSTERING)||(LA194_0 >= K_COMPACT && LA194_0 <= K_COUNTER)||(LA194_0 >= K_CUSTOM && LA194_0 <= K_DECIMAL)||(LA194_0 >= K_DISTINCT && LA194_0 <= K_DOUBLE)||(LA194_0 >= K_EXISTS && LA194_0 <= K_FLOAT)||LA194_0==K_FROZEN||(LA194_0 >= K_FUNCTION && LA194_0 <= K_FUNCTIONS)||(LA194_0 >= K_INET && LA194_0 <= K_INPUT)||LA194_0==K_INT||(LA194_0 >= K_JSON && LA194_0 <= K_KEYS)||(LA194_0 >= K_KEYSPACES && LA194_0 <= K_LIKE)||(LA194_0 >= K_LIST && LA194_0 <= K_MAP)||(LA194_0 >= K_NAN && LA194_0 <= K_NOLOGIN)||LA194_0==K_NOSUPERUSER||LA194_0==K_NULL||LA194_0==K_OPTIONS||(LA194_0 >= K_PARTITION && LA194_0 <= K_PERMISSIONS)||LA194_0==K_RETURNS||(LA194_0 >= K_ROLE && LA194_0 <= K_ROLES)||(LA194_0 >= K_SFUNC && LA194_0 <= K_TINYINT)||(LA194_0 >= K_TOKEN && LA194_0 <= K_TRIGGER)||(LA194_0 >= K_TTL && LA194_0 <= K_TYPE)||(LA194_0 >= K_USER && LA194_0 <= K_USERS)||(LA194_0 >= K_UUID && LA194_0 <= K_VARINT)||LA194_0==K_WRITETIME||(LA194_0 >= QMARK && LA194_0 <= QUOTED_NAME)||LA194_0==STRING_LITERAL||LA194_0==UUID||LA194_0==177||LA194_0==181||LA194_0==183||LA194_0==190||LA194_0==194) ) {
				alt194=1;
			}
			switch (alt194) {
				case 1 :
					// Parser.g:1464:13: t1= term ( ',' ti= term )*
					{
					pushFollow(FOLLOW_term_in_singleColumnInValues10864);
					t1=term();
					state._fsp--;

					 terms.add(t1); 
					// Parser.g:1464:43: ( ',' ti= term )*
					loop193:
					while (true) {
						int alt193=2;
						int LA193_0 = input.LA(1);
						if ( (LA193_0==180) ) {
							alt193=1;
						}

						switch (alt193) {
						case 1 :
							// Parser.g:1464:44: ',' ti= term
							{
							match(input,180,FOLLOW_180_in_singleColumnInValues10869); 
							pushFollow(FOLLOW_term_in_singleColumnInValues10873);
							ti=term();
							state._fsp--;

							 terms.add(ti); 
							}
							break;

						default :
							break loop193;
						}
					}

					}
					break;

			}

			match(input,178,FOLLOW_178_in_singleColumnInValues10882); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return terms;
	}
	// $ANTLR end "singleColumnInValues"



	// $ANTLR start "tupleOfTupleLiterals"
	// Parser.g:1467:1: tupleOfTupleLiterals returns [List<Tuples.Literal> literals] : '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' ;
	public final List<Tuples.Literal> tupleOfTupleLiterals() throws RecognitionException {
		List<Tuples.Literal> literals = null;


		Tuples.Literal t1 =null;
		Tuples.Literal ti =null;

		 literals = new ArrayList<>(); 
		try {
			// Parser.g:1469:5: ( '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' )
			// Parser.g:1469:7: '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')'
			{
			match(input,177,FOLLOW_177_in_tupleOfTupleLiterals10912); 
			pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals10916);
			t1=tupleLiteral();
			state._fsp--;

			 literals.add(t1); 
			// Parser.g:1469:50: ( ',' ti= tupleLiteral )*
			loop195:
			while (true) {
				int alt195=2;
				int LA195_0 = input.LA(1);
				if ( (LA195_0==180) ) {
					alt195=1;
				}

				switch (alt195) {
				case 1 :
					// Parser.g:1469:51: ',' ti= tupleLiteral
					{
					match(input,180,FOLLOW_180_in_tupleOfTupleLiterals10921); 
					pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals10925);
					ti=tupleLiteral();
					state._fsp--;

					 literals.add(ti); 
					}
					break;

				default :
					break loop195;
				}
			}

			match(input,178,FOLLOW_178_in_tupleOfTupleLiterals10931); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return literals;
	}
	// $ANTLR end "tupleOfTupleLiterals"



	// $ANTLR start "markerForTuple"
	// Parser.g:1472:1: markerForTuple returns [Tuples.Raw marker] : ( QMARK | ':' name= noncol_ident );
	public final Tuples.Raw markerForTuple() throws RecognitionException {
		Tuples.Raw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1473:5: ( QMARK | ':' name= noncol_ident )
			int alt196=2;
			int LA196_0 = input.LA(1);
			if ( (LA196_0==QMARK) ) {
				alt196=1;
			}
			else if ( (LA196_0==183) ) {
				alt196=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 196, 0, input);
				throw nvae;
			}

			switch (alt196) {
				case 1 :
					// Parser.g:1473:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_markerForTuple10952); 
					 marker = newTupleBindVariables(null); 
					}
					break;
				case 2 :
					// Parser.g:1474:7: ':' name= noncol_ident
					{
					match(input,183,FOLLOW_183_in_markerForTuple10962); 
					pushFollow(FOLLOW_noncol_ident_in_markerForTuple10966);
					name=noncol_ident();
					state._fsp--;

					 marker = newTupleBindVariables(name); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "markerForTuple"



	// $ANTLR start "tupleOfMarkersForTuples"
	// Parser.g:1477:1: tupleOfMarkersForTuples returns [List<Tuples.Raw> markers] : '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' ;
	public final List<Tuples.Raw> tupleOfMarkersForTuples() throws RecognitionException {
		List<Tuples.Raw> markers = null;


		Tuples.Raw m1 =null;
		Tuples.Raw mi =null;

		 markers = new ArrayList<Tuples.Raw>(); 
		try {
			// Parser.g:1479:5: ( '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' )
			// Parser.g:1479:7: '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')'
			{
			match(input,177,FOLLOW_177_in_tupleOfMarkersForTuples10998); 
			pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples11002);
			m1=markerForTuple();
			state._fsp--;

			 markers.add(m1); 
			// Parser.g:1479:51: ( ',' mi= markerForTuple )*
			loop197:
			while (true) {
				int alt197=2;
				int LA197_0 = input.LA(1);
				if ( (LA197_0==180) ) {
					alt197=1;
				}

				switch (alt197) {
				case 1 :
					// Parser.g:1479:52: ',' mi= markerForTuple
					{
					match(input,180,FOLLOW_180_in_tupleOfMarkersForTuples11007); 
					pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples11011);
					mi=markerForTuple();
					state._fsp--;

					 markers.add(mi); 
					}
					break;

				default :
					break loop197;
				}
			}

			match(input,178,FOLLOW_178_in_tupleOfMarkersForTuples11017); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return markers;
	}
	// $ANTLR end "tupleOfMarkersForTuples"



	// $ANTLR start "inMarkerForTuple"
	// Parser.g:1482:1: inMarkerForTuple returns [Tuples.INRaw marker] : ( QMARK | ':' name= noncol_ident );
	public final Tuples.INRaw inMarkerForTuple() throws RecognitionException {
		Tuples.INRaw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1483:5: ( QMARK | ':' name= noncol_ident )
			int alt198=2;
			int LA198_0 = input.LA(1);
			if ( (LA198_0==QMARK) ) {
				alt198=1;
			}
			else if ( (LA198_0==183) ) {
				alt198=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 198, 0, input);
				throw nvae;
			}

			switch (alt198) {
				case 1 :
					// Parser.g:1483:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_inMarkerForTuple11038); 
					 marker = newTupleINBindVariables(null); 
					}
					break;
				case 2 :
					// Parser.g:1484:7: ':' name= noncol_ident
					{
					match(input,183,FOLLOW_183_in_inMarkerForTuple11048); 
					pushFollow(FOLLOW_noncol_ident_in_inMarkerForTuple11052);
					name=noncol_ident();
					state._fsp--;

					 marker = newTupleINBindVariables(name); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "inMarkerForTuple"



	// $ANTLR start "comparatorType"
	// Parser.g:1487:1: comparatorType returns [CQL3Type.Raw t] : (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL );
	public final CQL3Type.Raw comparatorType() throws RecognitionException {
		CQL3Type.Raw t = null;


		Token s=null;
		CQL3Type n =null;
		CQL3Type.Raw c =null;
		CQL3Type.Raw tt =null;
		UTName id =null;
		CQL3Type.Raw f =null;

		try {
			// Parser.g:1488:5: (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL )
			int alt199=6;
			alt199 = dfa199.predict(input);
			switch (alt199) {
				case 1 :
					// Parser.g:1488:7: n= native_type
					{
					pushFollow(FOLLOW_native_type_in_comparatorType11077);
					n=native_type();
					state._fsp--;

					 t = CQL3Type.Raw.from(n); 
					}
					break;
				case 2 :
					// Parser.g:1489:7: c= collection_type
					{
					pushFollow(FOLLOW_collection_type_in_comparatorType11093);
					c=collection_type();
					state._fsp--;

					 t = c; 
					}
					break;
				case 3 :
					// Parser.g:1490:7: tt= tuple_type
					{
					pushFollow(FOLLOW_tuple_type_in_comparatorType11105);
					tt=tuple_type();
					state._fsp--;

					 t = tt; 
					}
					break;
				case 4 :
					// Parser.g:1491:7: id= userTypeName
					{
					pushFollow(FOLLOW_userTypeName_in_comparatorType11121);
					id=userTypeName();
					state._fsp--;

					 t = CQL3Type.Raw.userType(id); 
					}
					break;
				case 5 :
					// Parser.g:1492:7: K_FROZEN '<' f= comparatorType '>'
					{
					match(input,K_FROZEN,FOLLOW_K_FROZEN_in_comparatorType11133); 
					match(input,185,FOLLOW_185_in_comparatorType11135); 
					pushFollow(FOLLOW_comparatorType_in_comparatorType11139);
					f=comparatorType();
					state._fsp--;

					match(input,188,FOLLOW_188_in_comparatorType11141); 

					        try {
					            t = CQL3Type.Raw.frozen(f);
					        } catch (InvalidRequestException e) {
					            addRecognitionError(e.getMessage());
					        }
					      
					}
					break;
				case 6 :
					// Parser.g:1500:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_comparatorType11159); 

					        try {
					            t = CQL3Type.Raw.from(new CQL3Type.Custom((s!=null?s.getText():null)));
					        } catch (SyntaxException e) {
					            addRecognitionError("Cannot parse type " + (s!=null?s.getText():null) + ": " + e.getMessage());
					        } catch (ConfigurationException e) {
					            addRecognitionError("Error setting type " + (s!=null?s.getText():null) + ": " + e.getMessage());
					        }
					      
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "comparatorType"



	// $ANTLR start "native_type"
	// Parser.g:1512:1: native_type returns [CQL3Type t] : ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_SMALLINT | K_TEXT | K_TIMESTAMP | K_TINYINT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_DATE | K_TIME );
	public final CQL3Type native_type() throws RecognitionException {
		CQL3Type t = null;


		try {
			// Parser.g:1513:5: ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_SMALLINT | K_TEXT | K_TIMESTAMP | K_TINYINT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_DATE | K_TIME )
			int alt200=20;
			switch ( input.LA(1) ) {
			case K_ASCII:
				{
				alt200=1;
				}
				break;
			case K_BIGINT:
				{
				alt200=2;
				}
				break;
			case K_BLOB:
				{
				alt200=3;
				}
				break;
			case K_BOOLEAN:
				{
				alt200=4;
				}
				break;
			case K_COUNTER:
				{
				alt200=5;
				}
				break;
			case K_DECIMAL:
				{
				alt200=6;
				}
				break;
			case K_DOUBLE:
				{
				alt200=7;
				}
				break;
			case K_FLOAT:
				{
				alt200=8;
				}
				break;
			case K_INET:
				{
				alt200=9;
				}
				break;
			case K_INT:
				{
				alt200=10;
				}
				break;
			case K_SMALLINT:
				{
				alt200=11;
				}
				break;
			case K_TEXT:
				{
				alt200=12;
				}
				break;
			case K_TIMESTAMP:
				{
				alt200=13;
				}
				break;
			case K_TINYINT:
				{
				alt200=14;
				}
				break;
			case K_UUID:
				{
				alt200=15;
				}
				break;
			case K_VARCHAR:
				{
				alt200=16;
				}
				break;
			case K_VARINT:
				{
				alt200=17;
				}
				break;
			case K_TIMEUUID:
				{
				alt200=18;
				}
				break;
			case K_DATE:
				{
				alt200=19;
				}
				break;
			case K_TIME:
				{
				alt200=20;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 200, 0, input);
				throw nvae;
			}
			switch (alt200) {
				case 1 :
					// Parser.g:1513:7: K_ASCII
					{
					match(input,K_ASCII,FOLLOW_K_ASCII_in_native_type11188); 
					 t = CQL3Type.Native.ASCII; 
					}
					break;
				case 2 :
					// Parser.g:1514:7: K_BIGINT
					{
					match(input,K_BIGINT,FOLLOW_K_BIGINT_in_native_type11202); 
					 t = CQL3Type.Native.BIGINT; 
					}
					break;
				case 3 :
					// Parser.g:1515:7: K_BLOB
					{
					match(input,K_BLOB,FOLLOW_K_BLOB_in_native_type11215); 
					 t = CQL3Type.Native.BLOB; 
					}
					break;
				case 4 :
					// Parser.g:1516:7: K_BOOLEAN
					{
					match(input,K_BOOLEAN,FOLLOW_K_BOOLEAN_in_native_type11230); 
					 t = CQL3Type.Native.BOOLEAN; 
					}
					break;
				case 5 :
					// Parser.g:1517:7: K_COUNTER
					{
					match(input,K_COUNTER,FOLLOW_K_COUNTER_in_native_type11242); 
					 t = CQL3Type.Native.COUNTER; 
					}
					break;
				case 6 :
					// Parser.g:1518:7: K_DECIMAL
					{
					match(input,K_DECIMAL,FOLLOW_K_DECIMAL_in_native_type11254); 
					 t = CQL3Type.Native.DECIMAL; 
					}
					break;
				case 7 :
					// Parser.g:1519:7: K_DOUBLE
					{
					match(input,K_DOUBLE,FOLLOW_K_DOUBLE_in_native_type11266); 
					 t = CQL3Type.Native.DOUBLE; 
					}
					break;
				case 8 :
					// Parser.g:1520:7: K_FLOAT
					{
					match(input,K_FLOAT,FOLLOW_K_FLOAT_in_native_type11279); 
					 t = CQL3Type.Native.FLOAT; 
					}
					break;
				case 9 :
					// Parser.g:1521:7: K_INET
					{
					match(input,K_INET,FOLLOW_K_INET_in_native_type11293); 
					 t = CQL3Type.Native.INET;
					}
					break;
				case 10 :
					// Parser.g:1522:7: K_INT
					{
					match(input,K_INT,FOLLOW_K_INT_in_native_type11308); 
					 t = CQL3Type.Native.INT; 
					}
					break;
				case 11 :
					// Parser.g:1523:7: K_SMALLINT
					{
					match(input,K_SMALLINT,FOLLOW_K_SMALLINT_in_native_type11324); 
					 t = CQL3Type.Native.SMALLINT; 
					}
					break;
				case 12 :
					// Parser.g:1524:7: K_TEXT
					{
					match(input,K_TEXT,FOLLOW_K_TEXT_in_native_type11335); 
					 t = CQL3Type.Native.TEXT; 
					}
					break;
				case 13 :
					// Parser.g:1525:7: K_TIMESTAMP
					{
					match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_native_type11350); 
					 t = CQL3Type.Native.TIMESTAMP; 
					}
					break;
				case 14 :
					// Parser.g:1526:7: K_TINYINT
					{
					match(input,K_TINYINT,FOLLOW_K_TINYINT_in_native_type11360); 
					 t = CQL3Type.Native.TINYINT; 
					}
					break;
				case 15 :
					// Parser.g:1527:7: K_UUID
					{
					match(input,K_UUID,FOLLOW_K_UUID_in_native_type11372); 
					 t = CQL3Type.Native.UUID; 
					}
					break;
				case 16 :
					// Parser.g:1528:7: K_VARCHAR
					{
					match(input,K_VARCHAR,FOLLOW_K_VARCHAR_in_native_type11387); 
					 t = CQL3Type.Native.VARCHAR; 
					}
					break;
				case 17 :
					// Parser.g:1529:7: K_VARINT
					{
					match(input,K_VARINT,FOLLOW_K_VARINT_in_native_type11399); 
					 t = CQL3Type.Native.VARINT; 
					}
					break;
				case 18 :
					// Parser.g:1530:7: K_TIMEUUID
					{
					match(input,K_TIMEUUID,FOLLOW_K_TIMEUUID_in_native_type11412); 
					 t = CQL3Type.Native.TIMEUUID; 
					}
					break;
				case 19 :
					// Parser.g:1531:7: K_DATE
					{
					match(input,K_DATE,FOLLOW_K_DATE_in_native_type11423); 
					 t = CQL3Type.Native.DATE; 
					}
					break;
				case 20 :
					// Parser.g:1532:7: K_TIME
					{
					match(input,K_TIME,FOLLOW_K_TIME_in_native_type11438); 
					 t = CQL3Type.Native.TIME; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "native_type"



	// $ANTLR start "collection_type"
	// Parser.g:1535:1: collection_type returns [CQL3Type.Raw pt] : ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' );
	public final CQL3Type.Raw collection_type() throws RecognitionException {
		CQL3Type.Raw pt = null;


		CQL3Type.Raw t1 =null;
		CQL3Type.Raw t2 =null;
		CQL3Type.Raw t =null;

		try {
			// Parser.g:1536:5: ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' )
			int alt201=3;
			switch ( input.LA(1) ) {
			case K_MAP:
				{
				alt201=1;
				}
				break;
			case K_LIST:
				{
				alt201=2;
				}
				break;
			case K_SET:
				{
				alt201=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 201, 0, input);
				throw nvae;
			}
			switch (alt201) {
				case 1 :
					// Parser.g:1536:7: K_MAP '<' t1= comparatorType ',' t2= comparatorType '>'
					{
					match(input,K_MAP,FOLLOW_K_MAP_in_collection_type11466); 
					match(input,185,FOLLOW_185_in_collection_type11469); 
					pushFollow(FOLLOW_comparatorType_in_collection_type11473);
					t1=comparatorType();
					state._fsp--;

					match(input,180,FOLLOW_180_in_collection_type11475); 
					pushFollow(FOLLOW_comparatorType_in_collection_type11479);
					t2=comparatorType();
					state._fsp--;

					match(input,188,FOLLOW_188_in_collection_type11481); 

					            // if we can't parse either t1 or t2, antlr will "recover" and we may have t1 or t2 null.
					            if (t1 != null && t2 != null)
					                pt = CQL3Type.Raw.map(t1, t2);
					        
					}
					break;
				case 2 :
					// Parser.g:1542:7: K_LIST '<' t= comparatorType '>'
					{
					match(input,K_LIST,FOLLOW_K_LIST_in_collection_type11499); 
					match(input,185,FOLLOW_185_in_collection_type11501); 
					pushFollow(FOLLOW_comparatorType_in_collection_type11505);
					t=comparatorType();
					state._fsp--;

					match(input,188,FOLLOW_188_in_collection_type11507); 
					 if (t != null) pt = CQL3Type.Raw.list(t); 
					}
					break;
				case 3 :
					// Parser.g:1544:7: K_SET '<' t= comparatorType '>'
					{
					match(input,K_SET,FOLLOW_K_SET_in_collection_type11525); 
					match(input,185,FOLLOW_185_in_collection_type11528); 
					pushFollow(FOLLOW_comparatorType_in_collection_type11532);
					t=comparatorType();
					state._fsp--;

					match(input,188,FOLLOW_188_in_collection_type11534); 
					 if (t != null) pt = CQL3Type.Raw.set(t); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return pt;
	}
	// $ANTLR end "collection_type"



	// $ANTLR start "tuple_type"
	// Parser.g:1548:1: tuple_type returns [CQL3Type.Raw t] : K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>' ;
	public final CQL3Type.Raw tuple_type() throws RecognitionException {
		CQL3Type.Raw t = null;


		CQL3Type.Raw t1 =null;
		CQL3Type.Raw tn =null;

		try {
			// Parser.g:1549:5: ( K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>' )
			// Parser.g:1549:7: K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>'
			{
			match(input,K_TUPLE,FOLLOW_K_TUPLE_in_tuple_type11565); 
			match(input,185,FOLLOW_185_in_tuple_type11567); 
			 List<CQL3Type.Raw> types = new ArrayList<>(); 
			pushFollow(FOLLOW_comparatorType_in_tuple_type11582);
			t1=comparatorType();
			state._fsp--;

			 types.add(t1); 
			// Parser.g:1550:47: ( ',' tn= comparatorType )*
			loop202:
			while (true) {
				int alt202=2;
				int LA202_0 = input.LA(1);
				if ( (LA202_0==180) ) {
					alt202=1;
				}

				switch (alt202) {
				case 1 :
					// Parser.g:1550:48: ',' tn= comparatorType
					{
					match(input,180,FOLLOW_180_in_tuple_type11587); 
					pushFollow(FOLLOW_comparatorType_in_tuple_type11591);
					tn=comparatorType();
					state._fsp--;

					 types.add(tn); 
					}
					break;

				default :
					break loop202;
				}
			}

			match(input,188,FOLLOW_188_in_tuple_type11603); 
			 t = CQL3Type.Raw.tuple(types); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "tuple_type"


	public static class username_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "username"
	// Parser.g:1554:1: username : ( IDENT | STRING_LITERAL | QUOTED_NAME );
	public final Cql_Parser.username_return username() throws RecognitionException {
		Cql_Parser.username_return retval = new Cql_Parser.username_return();
		retval.start = input.LT(1);

		try {
			// Parser.g:1555:5: ( IDENT | STRING_LITERAL | QUOTED_NAME )
			int alt203=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt203=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt203=2;
				}
				break;
			case QUOTED_NAME:
				{
				alt203=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 203, 0, input);
				throw nvae;
			}
			switch (alt203) {
				case 1 :
					// Parser.g:1555:7: IDENT
					{
					match(input,IDENT,FOLLOW_IDENT_in_username11622); 
					}
					break;
				case 2 :
					// Parser.g:1556:7: STRING_LITERAL
					{
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_username11630); 
					}
					break;
				case 3 :
					// Parser.g:1557:7: QUOTED_NAME
					{
					match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_username11638); 
					 addRecognitionError("Quoted strings are are not supported for user names and USER is deprecated, please use ROLE");
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "username"


	public static class mbean_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "mbean"
	// Parser.g:1560:1: mbean : STRING_LITERAL ;
	public final Cql_Parser.mbean_return mbean() throws RecognitionException {
		Cql_Parser.mbean_return retval = new Cql_Parser.mbean_return();
		retval.start = input.LT(1);

		try {
			// Parser.g:1561:5: ( STRING_LITERAL )
			// Parser.g:1561:7: STRING_LITERAL
			{
			match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_mbean11657); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mbean"



	// $ANTLR start "non_type_ident"
	// Parser.g:1566:1: non_type_ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= basic_unreserved_keyword |kk= K_KEY );
	public final ColumnIdentifier non_type_ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		Token kk=null;
		String k =null;

		try {
			// Parser.g:1567:5: (t= IDENT |t= QUOTED_NAME |k= basic_unreserved_keyword |kk= K_KEY )
			int alt204=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt204=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt204=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_CALLED:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_CUSTOM:
			case K_DISTINCT:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INITCOND:
			case K_INPUT:
			case K_JSON:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TRIGGER:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_VALUES:
				{
				alt204=3;
				}
				break;
			case K_KEY:
				{
				alt204=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 204, 0, input);
				throw nvae;
			}
			switch (alt204) {
				case 1 :
					// Parser.g:1567:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_non_type_ident11682); 
					 if (reservedTypeNames.contains((t!=null?t.getText():null))) addRecognitionError("Invalid (reserved) user type name " + (t!=null?t.getText():null)); id = new ColumnIdentifier((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1568:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_non_type_ident11713); 
					 id = new ColumnIdentifier((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1569:7: k= basic_unreserved_keyword
					{
					pushFollow(FOLLOW_basic_unreserved_keyword_in_non_type_ident11738);
					k=basic_unreserved_keyword();
					state._fsp--;

					 id = new ColumnIdentifier(k, false); 
					}
					break;
				case 4 :
					// Parser.g:1570:7: kk= K_KEY
					{
					kk=(Token)match(input,K_KEY,FOLLOW_K_KEY_in_non_type_ident11750); 
					 id = new ColumnIdentifier((kk!=null?kk.getText():null), false); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "non_type_ident"



	// $ANTLR start "unreserved_keyword"
	// Parser.g:1573:1: unreserved_keyword returns [String str] : (u= unreserved_function_keyword |k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY | K_CAST ) );
	public final String unreserved_keyword() throws RecognitionException {
		String str = null;


		Token k=null;
		String u =null;

		try {
			// Parser.g:1574:5: (u= unreserved_function_keyword |k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY | K_CAST ) )
			int alt205=2;
			int LA205_0 = input.LA(1);
			if ( ((LA205_0 >= K_AGGREGATE && LA205_0 <= K_ALL)||LA205_0==K_AS||LA205_0==K_ASCII||(LA205_0 >= K_BIGINT && LA205_0 <= K_BOOLEAN)||LA205_0==K_CALLED||LA205_0==K_CLUSTERING||(LA205_0 >= K_COMPACT && LA205_0 <= K_CONTAINS)||LA205_0==K_COUNTER||(LA205_0 >= K_CUSTOM && LA205_0 <= K_DECIMAL)||(LA205_0 >= K_DISTINCT && LA205_0 <= K_DOUBLE)||(LA205_0 >= K_EXISTS && LA205_0 <= K_FLOAT)||LA205_0==K_FROZEN||(LA205_0 >= K_FUNCTION && LA205_0 <= K_FUNCTIONS)||LA205_0==K_INET||(LA205_0 >= K_INITCOND && LA205_0 <= K_INPUT)||LA205_0==K_INT||LA205_0==K_JSON||LA205_0==K_KEYS||(LA205_0 >= K_KEYSPACES && LA205_0 <= K_LIKE)||(LA205_0 >= K_LIST && LA205_0 <= K_MAP)||LA205_0==K_NOLOGIN||LA205_0==K_NOSUPERUSER||LA205_0==K_OPTIONS||(LA205_0 >= K_PARTITION && LA205_0 <= K_PERMISSIONS)||LA205_0==K_RETURNS||(LA205_0 >= K_ROLE && LA205_0 <= K_ROLES)||(LA205_0 >= K_SFUNC && LA205_0 <= K_TINYINT)||LA205_0==K_TRIGGER||(LA205_0 >= K_TUPLE && LA205_0 <= K_TYPE)||(LA205_0 >= K_USER && LA205_0 <= K_USERS)||(LA205_0 >= K_UUID && LA205_0 <= K_VARINT)) ) {
				alt205=1;
			}
			else if ( (LA205_0==K_CAST||LA205_0==K_COUNT||LA205_0==K_KEY||LA205_0==K_TTL||LA205_0==K_WRITETIME) ) {
				alt205=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 205, 0, input);
				throw nvae;
			}

			switch (alt205) {
				case 1 :
					// Parser.g:1574:7: u= unreserved_function_keyword
					{
					pushFollow(FOLLOW_unreserved_function_keyword_in_unreserved_keyword11793);
					u=unreserved_function_keyword();
					state._fsp--;

					 str = u; 
					}
					break;
				case 2 :
					// Parser.g:1575:7: k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY | K_CAST )
					{
					k=input.LT(1);
					if ( input.LA(1)==K_CAST||input.LA(1)==K_COUNT||input.LA(1)==K_KEY||input.LA(1)==K_TTL||input.LA(1)==K_WRITETIME ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					 str = (k!=null?k.getText():null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "unreserved_keyword"



	// $ANTLR start "unreserved_function_keyword"
	// Parser.g:1578:1: unreserved_function_keyword returns [String str] : (u= basic_unreserved_keyword |t= native_type );
	public final String unreserved_function_keyword() throws RecognitionException {
		String str = null;


		String u =null;
		CQL3Type t =null;

		try {
			// Parser.g:1579:5: (u= basic_unreserved_keyword |t= native_type )
			int alt206=2;
			int LA206_0 = input.LA(1);
			if ( ((LA206_0 >= K_AGGREGATE && LA206_0 <= K_ALL)||LA206_0==K_AS||LA206_0==K_CALLED||LA206_0==K_CLUSTERING||(LA206_0 >= K_COMPACT && LA206_0 <= K_CONTAINS)||LA206_0==K_CUSTOM||LA206_0==K_DISTINCT||(LA206_0 >= K_EXISTS && LA206_0 <= K_FINALFUNC)||LA206_0==K_FROZEN||(LA206_0 >= K_FUNCTION && LA206_0 <= K_FUNCTIONS)||(LA206_0 >= K_INITCOND && LA206_0 <= K_INPUT)||LA206_0==K_JSON||LA206_0==K_KEYS||(LA206_0 >= K_KEYSPACES && LA206_0 <= K_LIKE)||(LA206_0 >= K_LIST && LA206_0 <= K_MAP)||LA206_0==K_NOLOGIN||LA206_0==K_NOSUPERUSER||LA206_0==K_OPTIONS||(LA206_0 >= K_PARTITION && LA206_0 <= K_PERMISSIONS)||LA206_0==K_RETURNS||(LA206_0 >= K_ROLE && LA206_0 <= K_ROLES)||LA206_0==K_SFUNC||(LA206_0 >= K_STATIC && LA206_0 <= K_SUPERUSER)||LA206_0==K_TRIGGER||(LA206_0 >= K_TUPLE && LA206_0 <= K_TYPE)||(LA206_0 >= K_USER && LA206_0 <= K_USERS)||LA206_0==K_VALUES) ) {
				alt206=1;
			}
			else if ( (LA206_0==K_ASCII||(LA206_0 >= K_BIGINT && LA206_0 <= K_BOOLEAN)||LA206_0==K_COUNTER||(LA206_0 >= K_DATE && LA206_0 <= K_DECIMAL)||LA206_0==K_DOUBLE||LA206_0==K_FLOAT||LA206_0==K_INET||LA206_0==K_INT||LA206_0==K_SMALLINT||(LA206_0 >= K_TEXT && LA206_0 <= K_TINYINT)||LA206_0==K_UUID||(LA206_0 >= K_VARCHAR && LA206_0 <= K_VARINT)) ) {
				alt206=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 206, 0, input);
				throw nvae;
			}

			switch (alt206) {
				case 1 :
					// Parser.g:1579:7: u= basic_unreserved_keyword
					{
					pushFollow(FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword11852);
					u=basic_unreserved_keyword();
					state._fsp--;

					 str = u; 
					}
					break;
				case 2 :
					// Parser.g:1580:7: t= native_type
					{
					pushFollow(FOLLOW_native_type_in_unreserved_function_keyword11864);
					t=native_type();
					state._fsp--;

					 str = t.toString(); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "unreserved_function_keyword"



	// $ANTLR start "basic_unreserved_keyword"
	// Parser.g:1583:1: basic_unreserved_keyword returns [String str] : k= ( K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_DISTINCT | K_CONTAINS | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_JSON | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION ) ;
	public final String basic_unreserved_keyword() throws RecognitionException {
		String str = null;


		Token k=null;

		try {
			// Parser.g:1584:5: (k= ( K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_DISTINCT | K_CONTAINS | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_JSON | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION ) )
			// Parser.g:1584:7: k= ( K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_DISTINCT | K_CONTAINS | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_JSON | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION )
			{
			k=input.LT(1);
			if ( (input.LA(1) >= K_AGGREGATE && input.LA(1) <= K_ALL)||input.LA(1)==K_AS||input.LA(1)==K_CALLED||input.LA(1)==K_CLUSTERING||(input.LA(1) >= K_COMPACT && input.LA(1) <= K_CONTAINS)||input.LA(1)==K_CUSTOM||input.LA(1)==K_DISTINCT||(input.LA(1) >= K_EXISTS && input.LA(1) <= K_FINALFUNC)||input.LA(1)==K_FROZEN||(input.LA(1) >= K_FUNCTION && input.LA(1) <= K_FUNCTIONS)||(input.LA(1) >= K_INITCOND && input.LA(1) <= K_INPUT)||input.LA(1)==K_JSON||input.LA(1)==K_KEYS||(input.LA(1) >= K_KEYSPACES && input.LA(1) <= K_LIKE)||(input.LA(1) >= K_LIST && input.LA(1) <= K_MAP)||input.LA(1)==K_NOLOGIN||input.LA(1)==K_NOSUPERUSER||input.LA(1)==K_OPTIONS||(input.LA(1) >= K_PARTITION && input.LA(1) <= K_PERMISSIONS)||input.LA(1)==K_RETURNS||(input.LA(1) >= K_ROLE && input.LA(1) <= K_ROLES)||input.LA(1)==K_SFUNC||(input.LA(1) >= K_STATIC && input.LA(1) <= K_SUPERUSER)||input.LA(1)==K_TRIGGER||(input.LA(1) >= K_TUPLE && input.LA(1) <= K_TYPE)||(input.LA(1) >= K_USER && input.LA(1) <= K_USERS)||input.LA(1)==K_VALUES ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			 str = (k!=null?k.getText():null); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "basic_unreserved_keyword"

	// Delegated rules


	protected DFA1 dfa1 = new DFA1(this);
	protected DFA13 dfa13 = new DFA13(this);
	protected DFA41 dfa41 = new DFA41(this);
	protected DFA148 dfa148 = new DFA148(this);
	protected DFA149 dfa149 = new DFA149(this);
	protected DFA167 dfa167 = new DFA167(this);
	protected DFA169 dfa169 = new DFA169(this);
	protected DFA171 dfa171 = new DFA171(this);
	protected DFA173 dfa173 = new DFA173(this);
	protected DFA176 dfa176 = new DFA176(this);
	protected DFA184 dfa184 = new DFA184(this);
	protected DFA190 dfa190 = new DFA190(this);
	protected DFA189 dfa189 = new DFA189(this);
	protected DFA199 dfa199 = new DFA199(this);
	static final String DFA1_eotS =
		"\63\uffff";
	static final String DFA1_eofS =
		"\63\uffff";
	static final String DFA1_minS =
		"\1\34\7\uffff\2\31\1\54\2\24\1\32\10\uffff\1\163\22\uffff\1\150\2\uffff"+
		"\1\101\5\uffff\1\31";
	static final String DFA1_maxS =
		"\1\u008e\7\uffff\3\u008f\2\u00a6\1\u0090\10\uffff\1\163\22\uffff\1\u0085"+
		"\2\uffff\1\160\5\uffff\1\104";
	static final String DFA1_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\6\uffff\1\10\1\11\1\23\1\27\1\31"+
		"\1\40\1\46\1\12\1\uffff\1\34\1\36\1\13\1\14\1\15\1\25\1\30\1\33\1\35\1"+
		"\37\1\42\1\47\1\16\1\17\1\24\1\32\1\41\1\50\1\uffff\1\20\1\44\1\uffff"+
		"\1\21\1\45\1\26\1\43\1\22\1\uffff";
	static final String DFA1_specialS =
		"\63\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\12\7\uffff\1\4\14\uffff\1\10\3\uffff\1\5\4\uffff\1\11\13\uffff\1\13"+
			"\7\uffff\1\2\13\uffff\1\15\32\uffff\1\14\2\uffff\1\1\17\uffff\1\7\4\uffff"+
			"\1\3\1\6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\30\22\uffff\1\17\5\uffff\1\25\21\uffff\1\27\4\uffff\1\25\13\uffff"+
			"\1\16\7\uffff\1\24\14\uffff\1\26\13\uffff\1\23\20\uffff\1\21\3\uffff"+
			"\1\22\3\uffff\1\20",
			"\1\40\22\uffff\1\32\27\uffff\1\37\4\uffff\1\33\13\uffff\1\31\7\uffff"+
			"\1\42\30\uffff\1\41\20\uffff\1\35\3\uffff\1\36\3\uffff\1\34",
			"\1\43\50\uffff\1\44\7\uffff\1\50\30\uffff\1\47\24\uffff\1\46\3\uffff"+
			"\1\45",
			"\1\53\4\uffff\1\53\1\51\1\uffff\1\52\2\uffff\1\53\1\uffff\1\53\1\52"+
			"\2\uffff\3\53\1\uffff\3\53\1\uffff\4\53\1\52\3\53\2\uffff\1\52\2\53\1"+
			"\52\1\uffff\1\52\4\53\1\uffff\1\53\1\uffff\2\53\4\uffff\1\53\1\uffff"+
			"\2\53\1\uffff\1\53\2\uffff\3\53\1\uffff\3\53\1\uffff\3\53\3\uffff\1\52"+
			"\1\uffff\1\53\1\uffff\1\53\4\uffff\1\53\2\uffff\5\53\3\uffff\1\53\1\uffff"+
			"\2\53\1\52\1\uffff\13\53\2\uffff\1\53\1\uffff\3\53\3\uffff\2\53\1\uffff"+
			"\4\53\3\uffff\1\53\10\uffff\2\53\2\uffff\1\53",
			"\1\56\4\uffff\1\56\1\54\1\uffff\1\55\2\uffff\1\56\1\uffff\1\56\1\55"+
			"\2\uffff\3\56\1\uffff\3\56\1\uffff\4\56\1\55\3\56\2\uffff\1\55\2\56\1"+
			"\55\1\uffff\1\55\4\56\1\uffff\1\56\1\uffff\2\56\4\uffff\1\56\1\uffff"+
			"\2\56\1\uffff\1\56\2\uffff\3\56\1\uffff\3\56\1\uffff\3\56\3\uffff\1\55"+
			"\1\uffff\1\56\1\uffff\1\56\4\uffff\1\56\2\uffff\5\56\3\uffff\1\56\1\uffff"+
			"\2\56\1\55\1\uffff\13\56\2\uffff\1\56\1\uffff\3\56\3\uffff\2\56\1\uffff"+
			"\4\56\3\uffff\1\56\10\uffff\2\56\2\uffff\1\56",
			"\1\61\1\uffff\1\61\5\uffff\1\61\16\uffff\1\61\5\uffff\1\61\2\uffff\1"+
			"\61\1\uffff\1\61\43\uffff\1\61\26\uffff\1\60\1\61\27\uffff\1\57",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\62",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\52\7\uffff\1\52\24\uffff\1\53",
			"",
			"",
			"\1\56\46\uffff\1\55\7\uffff\1\55",
			"",
			"",
			"",
			"",
			"",
			"\1\30\52\uffff\1\27"
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "188:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement );";
		}
	}

	static final String DFA13_eotS =
		"\75\uffff";
	static final String DFA13_eofS =
		"\75\uffff";
	static final String DFA13_minS =
		"\1\24\34\37\1\uffff\1\24\1\uffff\1\24\3\uffff\30\37\1\uffff";
	static final String DFA13_maxS =
		"\1\u00a3\34\u00b6\1\uffff\1\u00a3\1\uffff\1\u00bf\3\uffff\30\u00b6\1\uffff";
	static final String DFA13_acceptS =
		"\35\uffff\1\6\1\uffff\1\1\1\uffff\1\3\1\4\1\5\30\uffff\1\2";
	static final String DFA13_specialS =
		"\75\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\33\1\3\1\uffff\2\3\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\3"+
			"\1\12\3\uffff\3\3\1\13\1\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\uffff\2"+
			"\3\1\uffff\1\15\2\uffff\1\3\1\34\1\3\1\uffff\3\3\1\uffff\3\3\5\uffff"+
			"\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\16\4\3\1\17\1\27\1\20\1\25\1\21\1\uffff\1\35\1\3\1\uffff\1\32"+
			"\2\3\3\uffff\2\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\31\10\uffff\1\35"+
			"\1\2",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\40\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\41\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\42\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\157\uffff\1\43\1\37\1\uffff\1\37\1\uffff\1\36",
			"\1\37\41\uffff\1\37\160\uffff\1\37\1\uffff\1\37\1\uffff\1\36",
			"",
			"\1\44\4\uffff\2\46\4\uffff\1\46\1\uffff\1\47\3\uffff\1\50\1\51\1\52"+
			"\1\uffff\1\46\1\37\1\46\1\uffff\2\46\1\73\1\53\1\uffff\1\46\1\71\1\54"+
			"\3\uffff\1\46\1\55\3\uffff\3\46\1\56\1\uffff\1\46\1\uffff\2\46\4\uffff"+
			"\1\57\1\uffff\2\46\1\uffff\1\60\2\uffff\1\46\1\37\1\46\1\uffff\3\46\1"+
			"\uffff\3\46\5\uffff\1\46\1\uffff\1\46\4\uffff\1\46\2\uffff\5\46\3\uffff"+
			"\1\46\1\uffff\2\46\2\uffff\1\46\1\61\4\46\1\62\1\72\1\63\1\70\1\64\1"+
			"\uffff\1\35\1\46\1\uffff\1\37\2\46\3\uffff\2\46\1\uffff\1\65\1\46\1\66"+
			"\1\67\3\uffff\1\37\11\uffff\1\45",
			"",
			"\1\35\1\74\3\uffff\2\35\4\uffff\1\35\1\uffff\1\35\3\uffff\3\35\1\uffff"+
			"\3\35\1\uffff\4\35\1\uffff\3\35\3\uffff\2\35\3\uffff\4\35\1\uffff\1\35"+
			"\1\uffff\2\35\4\uffff\1\35\1\uffff\2\35\1\uffff\1\35\2\uffff\3\35\1\uffff"+
			"\3\35\1\uffff\3\35\5\uffff\1\35\1\uffff\1\35\4\uffff\1\35\2\uffff\5\35"+
			"\3\uffff\1\35\1\uffff\2\35\2\uffff\13\35\1\uffff\2\35\1\uffff\3\35\3"+
			"\uffff\2\35\1\uffff\4\35\3\uffff\1\35\10\uffff\2\35\16\uffff\1\35\14"+
			"\uffff\1\74",
			"",
			"",
			"",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			"\1\37\41\uffff\1\37\157\uffff\1\35\1\37\1\uffff\1\37\1\uffff\1\37",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "285:8: (c= cident | K_COUNT '(' countArgument ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs )";
		}
	}

	static final String DFA41_eotS =
		"\34\uffff";
	static final String DFA41_eofS =
		"\34\uffff";
	static final String DFA41_minS =
		"\1\24\30\101\3\uffff";
	static final String DFA41_maxS =
		"\1\u00a3\30\u00be\3\uffff";
	static final String DFA41_acceptS =
		"\31\uffff\1\1\1\2\1\3";
	static final String DFA41_specialS =
		"\34\uffff}>";
	static final String[] DFA41_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\30\1\3\1\uffff\2\3\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\3"+
			"\1\12\3\uffff\3\3\1\13\1\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\uffff\2"+
			"\3\1\uffff\1\15\2\uffff\1\3\1\30\1\3\1\uffff\3\3\1\uffff\3\3\5\uffff"+
			"\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\16\4\3\1\17\1\27\1\20\1\25\1\21\2\uffff\1\3\1\uffff\1\30\2\3\3"+
			"\uffff\2\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\30\11\uffff\1\2",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"",
			"",
			""
	};

	static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
	static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
	static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
	static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
	static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
	static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
	static final short[][] DFA41_transition;

	static {
		int numStates = DFA41_transitionS.length;
		DFA41_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
		}
	}

	protected class DFA41 extends DFA {

		public DFA41(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 41;
			this.eot = DFA41_eot;
			this.eof = DFA41_eof;
			this.min = DFA41_min;
			this.max = DFA41_max;
			this.accept = DFA41_accept;
			this.special = DFA41_special;
			this.transition = DFA41_transition;
		}
		@Override
		public String getDescription() {
			return "454:1: deleteOp returns [Operation.RawDeletion op] : (c= cident |c= cident '[' t= term ']' |c= cident '.' field= cident );";
		}
	}

	static final String DFA148_eotS =
		"\34\uffff";
	static final String DFA148_eofS =
		"\1\uffff\31\33\2\uffff";
	static final String DFA148_minS =
		"\1\24\31\u00b6\2\uffff";
	static final String DFA148_maxS =
		"\1\u00a3\31\u00b8\2\uffff";
	static final String DFA148_acceptS =
		"\32\uffff\1\1\1\2";
	static final String DFA148_specialS =
		"\34\uffff}>";
	static final String[] DFA148_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\30\1\3\1\uffff\2\3\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\3"+
			"\1\12\3\uffff\3\3\1\13\1\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\uffff\2"+
			"\3\1\uffff\1\15\2\uffff\1\3\1\30\1\3\1\uffff\3\3\1\uffff\3\3\5\uffff"+
			"\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\16\4\3\1\17\1\27\1\20\1\25\1\21\2\uffff\1\3\1\uffff\1\30\2\3\3"+
			"\uffff\2\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\30\10\uffff\1\31\1\2",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"",
			""
	};

	static final short[] DFA148_eot = DFA.unpackEncodedString(DFA148_eotS);
	static final short[] DFA148_eof = DFA.unpackEncodedString(DFA148_eofS);
	static final char[] DFA148_min = DFA.unpackEncodedStringToUnsignedChars(DFA148_minS);
	static final char[] DFA148_max = DFA.unpackEncodedStringToUnsignedChars(DFA148_maxS);
	static final short[] DFA148_accept = DFA.unpackEncodedString(DFA148_acceptS);
	static final short[] DFA148_special = DFA.unpackEncodedString(DFA148_specialS);
	static final short[][] DFA148_transition;

	static {
		int numStates = DFA148_transitionS.length;
		DFA148_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA148_transition[i] = DFA.unpackEncodedString(DFA148_transitionS[i]);
		}
	}

	protected class DFA148 extends DFA {

		public DFA148(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 148;
			this.eot = DFA148_eot;
			this.eof = DFA148_eof;
			this.min = DFA148_min;
			this.max = DFA148_max;
			this.accept = DFA148_accept;
			this.special = DFA148_special;
			this.transition = DFA148_transition;
		}
		@Override
		public String getDescription() {
			return "1175:7: ( ksName[name] '.' )?";
		}
	}

	static final String DFA149_eotS =
		"\34\uffff";
	static final String DFA149_eofS =
		"\1\uffff\31\33\2\uffff";
	static final String DFA149_minS =
		"\1\24\31\30\2\uffff";
	static final String DFA149_maxS =
		"\1\u00a3\31\u00b8\2\uffff";
	static final String DFA149_acceptS =
		"\32\uffff\1\1\1\2";
	static final String DFA149_specialS =
		"\34\uffff}>";
	static final String[] DFA149_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\30\1\3\1\uffff\2\3\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\3"+
			"\1\12\3\uffff\3\3\1\13\1\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\uffff\2"+
			"\3\1\uffff\1\15\2\uffff\1\3\1\30\1\3\1\uffff\3\3\1\uffff\3\3\5\uffff"+
			"\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\16\4\3\1\17\1\27\1\20\1\25\1\21\2\uffff\1\3\1\uffff\1\30\2\3\3"+
			"\uffff\2\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\30\10\uffff\1\31\1\2",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"",
			""
	};

	static final short[] DFA149_eot = DFA.unpackEncodedString(DFA149_eotS);
	static final short[] DFA149_eof = DFA.unpackEncodedString(DFA149_eofS);
	static final char[] DFA149_min = DFA.unpackEncodedStringToUnsignedChars(DFA149_minS);
	static final char[] DFA149_max = DFA.unpackEncodedStringToUnsignedChars(DFA149_maxS);
	static final short[] DFA149_accept = DFA.unpackEncodedString(DFA149_acceptS);
	static final short[] DFA149_special = DFA.unpackEncodedString(DFA149_specialS);
	static final short[][] DFA149_transition;

	static {
		int numStates = DFA149_transitionS.length;
		DFA149_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA149_transition[i] = DFA.unpackEncodedString(DFA149_transitionS[i]);
		}
	}

	protected class DFA149 extends DFA {

		public DFA149(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 149;
			this.eot = DFA149_eot;
			this.eof = DFA149_eof;
			this.min = DFA149_min;
			this.max = DFA149_max;
			this.accept = DFA149_accept;
			this.special = DFA149_special;
			this.transition = DFA149_transition;
		}
		@Override
		public String getDescription() {
			return "1180:7: ( ksName[name] '.' )?";
		}
	}

	static final String DFA167_eotS =
		"\42\uffff";
	static final String DFA167_eofS =
		"\42\uffff";
	static final String DFA167_minS =
		"\1\6\2\uffff\1\6\4\uffff\30\u00b1\1\u00b6\1\uffff";
	static final String DFA167_maxS =
		"\1\u00c2\2\uffff\1\u00c3\4\uffff\31\u00b7\1\uffff";
	static final String DFA167_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\31\uffff\1\3";
	static final String DFA167_specialS =
		"\42\uffff}>";
	static final String[] DFA167_transitionS = {
			"\1\1\7\uffff\1\1\3\uffff\1\1\2\uffff\1\1\65\uffff\1\1\25\uffff\1\1\4"+
			"\uffff\1\5\73\uffff\1\7\3\uffff\1\1\2\uffff\1\1\7\uffff\1\4\3\uffff\1"+
			"\1\1\uffff\1\6\6\uffff\1\2\3\uffff\1\3",
			"",
			"",
			"\1\2\7\uffff\1\2\3\uffff\1\2\1\uffff\1\10\1\2\3\uffff\2\12\4\uffff\1"+
			"\12\1\uffff\1\13\3\uffff\1\14\1\15\1\16\1\uffff\1\12\1\40\1\12\1\uffff"+
			"\2\12\1\37\1\17\1\uffff\1\12\1\35\1\20\3\uffff\1\12\1\21\3\uffff\3\12"+
			"\1\22\1\uffff\1\12\1\uffff\2\12\4\uffff\1\23\1\2\2\12\1\uffff\1\24\2"+
			"\uffff\1\12\1\40\1\12\1\uffff\3\12\1\uffff\3\12\4\uffff\1\2\1\12\1\uffff"+
			"\1\12\1\uffff\1\2\2\uffff\1\12\2\uffff\5\12\3\uffff\1\12\1\uffff\2\12"+
			"\2\uffff\1\12\1\25\4\12\1\26\1\36\1\27\1\34\1\30\1\uffff\1\2\1\12\1\uffff"+
			"\1\40\2\12\3\uffff\2\12\1\uffff\1\31\1\12\1\32\1\33\3\uffff\1\40\10\uffff"+
			"\1\2\1\11\2\uffff\1\2\2\uffff\1\2\7\uffff\1\2\3\uffff\1\2\1\uffff\1\2"+
			"\6\uffff\1\2\3\uffff\2\2",
			"",
			"",
			"",
			"",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\1\41",
			""
	};

	static final short[] DFA167_eot = DFA.unpackEncodedString(DFA167_eotS);
	static final short[] DFA167_eof = DFA.unpackEncodedString(DFA167_eofS);
	static final char[] DFA167_min = DFA.unpackEncodedStringToUnsignedChars(DFA167_minS);
	static final char[] DFA167_max = DFA.unpackEncodedStringToUnsignedChars(DFA167_maxS);
	static final short[] DFA167_accept = DFA.unpackEncodedString(DFA167_acceptS);
	static final short[] DFA167_special = DFA.unpackEncodedString(DFA167_specialS);
	static final short[][] DFA167_transition;

	static {
		int numStates = DFA167_transitionS.length;
		DFA167_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA167_transition[i] = DFA.unpackEncodedString(DFA167_transitionS[i]);
		}
	}

	protected class DFA167 extends DFA {

		public DFA167(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 167;
			this.eot = DFA167_eot;
			this.eof = DFA167_eof;
			this.min = DFA167_min;
			this.max = DFA167_max;
			this.accept = DFA167_accept;
			this.special = DFA167_special;
			this.transition = DFA167_transition;
		}
		@Override
		public String getDescription() {
			return "1269:1: value returns [Term.Raw value] : (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK );";
		}
	}

	static final String DFA169_eotS =
		"\33\uffff";
	static final String DFA169_eofS =
		"\1\uffff\30\32\2\uffff";
	static final String DFA169_minS =
		"\1\24\30\u00b1\2\uffff";
	static final String DFA169_maxS =
		"\1\u00a3\30\u00b8\2\uffff";
	static final String DFA169_acceptS =
		"\31\uffff\1\1\1\2";
	static final String DFA169_specialS =
		"\33\uffff}>";
	static final String[] DFA169_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\31\1\3\1\uffff\2\3\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\3"+
			"\1\12\3\uffff\3\3\1\13\1\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\uffff\2"+
			"\3\1\uffff\1\15\2\uffff\1\3\1\31\1\3\1\uffff\3\3\1\uffff\3\3\5\uffff"+
			"\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\16\4\3\1\17\1\27\1\20\1\25\1\21\1\uffff\1\32\1\3\1\uffff\1\31"+
			"\2\3\3\uffff\2\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\31\10\uffff\1\31"+
			"\1\2",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"",
			""
	};

	static final short[] DFA169_eot = DFA.unpackEncodedString(DFA169_eotS);
	static final short[] DFA169_eof = DFA.unpackEncodedString(DFA169_eofS);
	static final char[] DFA169_min = DFA.unpackEncodedStringToUnsignedChars(DFA169_minS);
	static final char[] DFA169_max = DFA.unpackEncodedStringToUnsignedChars(DFA169_maxS);
	static final short[] DFA169_accept = DFA.unpackEncodedString(DFA169_acceptS);
	static final short[] DFA169_special = DFA.unpackEncodedString(DFA169_specialS);
	static final short[][] DFA169_transition;

	static {
		int numStates = DFA169_transitionS.length;
		DFA169_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA169_transition[i] = DFA.unpackEncodedString(DFA169_transitionS[i]);
		}
	}

	protected class DFA169 extends DFA {

		public DFA169(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 169;
			this.eot = DFA169_eot;
			this.eof = DFA169_eof;
			this.min = DFA169_min;
			this.max = DFA169_max;
			this.accept = DFA169_accept;
			this.special = DFA169_special;
			this.transition = DFA169_transition;
		}
		@Override
		public String getDescription() {
			return "1287:7: (ks= keyspaceName '.' )?";
		}
	}

	static final String DFA171_eotS =
		"\70\uffff";
	static final String DFA171_eofS =
		"\70\uffff";
	static final String DFA171_minS =
		"\1\24\30\u00b1\1\u00b6\1\u00b1\1\u00b6\1\24\1\6\30\u00b1\2\uffff";
	static final String DFA171_maxS =
		"\1\u00a3\31\u00b6\1\u00b1\1\u00b6\1\u00a3\1\u00c2\30\u00b1\2\uffff";
	static final String DFA171_acceptS =
		"\66\uffff\1\1\1\2";
	static final String DFA171_specialS =
		"\70\uffff}>";
	static final String[] DFA171_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\33\1\3\1\uffff\2\3\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\3"+
			"\1\12\3\uffff\3\3\1\13\1\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\uffff\2"+
			"\3\1\uffff\1\15\2\uffff\1\3\1\33\1\3\1\uffff\3\3\1\uffff\3\3\5\uffff"+
			"\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\16\4\3\1\17\1\27\1\20\1\25\1\21\1\uffff\1\32\1\3\1\uffff\1\33"+
			"\2\3\3\uffff\2\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\33\10\uffff\1\31"+
			"\1\2",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\34",
			"\1\35",
			"\1\34",
			"\1\36\4\uffff\2\40\4\uffff\1\40\1\uffff\1\41\3\uffff\1\42\1\43\1\44"+
			"\1\uffff\1\40\1\uffff\1\40\1\uffff\2\40\1\65\1\45\1\uffff\1\40\1\63\1"+
			"\46\3\uffff\1\40\1\47\3\uffff\3\40\1\50\1\uffff\1\40\1\uffff\2\40\4\uffff"+
			"\1\51\1\uffff\2\40\1\uffff\1\52\2\uffff\1\40\1\uffff\1\40\1\uffff\3\40"+
			"\1\uffff\3\40\5\uffff\1\40\1\uffff\1\40\4\uffff\1\40\2\uffff\5\40\3\uffff"+
			"\1\40\1\uffff\2\40\2\uffff\1\40\1\53\4\40\1\54\1\64\1\55\1\62\1\56\1"+
			"\uffff\1\32\1\40\2\uffff\2\40\3\uffff\2\40\1\uffff\1\57\1\40\1\60\1\61"+
			"\15\uffff\1\37",
			"\1\67\7\uffff\1\67\3\uffff\1\67\1\uffff\2\67\3\uffff\2\67\4\uffff\1"+
			"\67\1\uffff\1\67\3\uffff\3\67\1\uffff\3\67\1\uffff\4\67\1\uffff\3\67"+
			"\3\uffff\2\67\3\uffff\4\67\1\uffff\1\67\1\uffff\2\67\4\uffff\4\67\1\uffff"+
			"\1\67\2\uffff\3\67\1\uffff\3\67\1\uffff\3\67\4\uffff\2\67\1\uffff\1\67"+
			"\1\uffff\1\67\2\uffff\1\67\2\uffff\5\67\3\uffff\1\67\1\uffff\2\67\2\uffff"+
			"\13\67\1\uffff\2\67\1\uffff\3\67\3\uffff\2\67\1\uffff\4\67\3\uffff\1"+
			"\67\10\uffff\2\67\2\uffff\1\67\2\uffff\1\67\7\uffff\1\67\1\66\2\uffff"+
			"\1\67\1\uffff\1\67\6\uffff\1\67\3\uffff\1\67",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"",
			""
	};

	static final short[] DFA171_eot = DFA.unpackEncodedString(DFA171_eotS);
	static final short[] DFA171_eof = DFA.unpackEncodedString(DFA171_eofS);
	static final char[] DFA171_min = DFA.unpackEncodedStringToUnsignedChars(DFA171_minS);
	static final char[] DFA171_max = DFA.unpackEncodedStringToUnsignedChars(DFA171_maxS);
	static final short[] DFA171_accept = DFA.unpackEncodedString(DFA171_acceptS);
	static final short[] DFA171_special = DFA.unpackEncodedString(DFA171_specialS);
	static final short[][] DFA171_transition;

	static {
		int numStates = DFA171_transitionS.length;
		DFA171_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA171_transition[i] = DFA.unpackEncodedString(DFA171_transitionS[i]);
		}
	}

	protected class DFA171 extends DFA {

		public DFA171(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 171;
			this.eot = DFA171_eot;
			this.eof = DFA171_eof;
			this.min = DFA171_min;
			this.max = DFA171_max;
			this.accept = DFA171_accept;
			this.special = DFA171_special;
			this.transition = DFA171_transition;
		}
		@Override
		public String getDescription() {
			return "1298:1: function returns [Term.Raw t] : (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' );";
		}
	}

	static final String DFA173_eotS =
		"\105\uffff";
	static final String DFA173_eofS =
		"\3\uffff\1\1\41\uffff\1\1\6\uffff\31\41";
	static final String DFA173_minS =
		"\1\6\1\uffff\1\6\1\33\1\uffff\1\u00b2\30\u00b1\1\u00b2\2\u00b1\1\uffff"+
		"\1\u00b1\1\u00b6\1\u00b1\1\6\1\24\1\6\1\154\3\u00b1\31\33";
	static final String DFA173_maxS =
		"\1\u00c2\1\uffff\1\u00c2\1\u00c3\1\uffff\1\u00b4\2\u00b6\1\u00b9\26\u00b6"+
		"\2\u00b9\1\uffff\1\u00b9\2\u00b6\1\u00c3\1\u00a3\1\u00c2\1\u00b6\3\u00b2"+
		"\31\u00c3";
	static final String DFA173_acceptS =
		"\1\uffff\1\1\2\uffff\1\2\34\uffff\1\3\43\uffff";
	static final String DFA173_specialS =
		"\105\uffff}>";
	static final String[] DFA173_transitionS = {
			"\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff\1\4\1\1\3\uffff\2\4\4\uffff\1\4"+
			"\1\uffff\1\4\3\uffff\3\4\1\uffff\3\4\1\uffff\4\4\1\uffff\3\4\3\uffff"+
			"\2\4\3\uffff\4\4\1\uffff\1\4\1\uffff\2\4\4\uffff\1\4\1\1\2\4\1\uffff"+
			"\1\4\2\uffff\3\4\1\uffff\3\4\1\uffff\3\4\4\uffff\1\1\1\4\1\uffff\1\4"+
			"\1\uffff\1\1\2\uffff\1\4\2\uffff\5\4\3\uffff\1\4\1\uffff\2\4\2\uffff"+
			"\13\4\1\uffff\2\4\1\uffff\3\4\3\uffff\2\4\1\uffff\4\4\3\uffff\1\4\10"+
			"\uffff\1\3\1\4\2\uffff\1\1\2\uffff\1\1\7\uffff\1\2\3\uffff\1\1\1\uffff"+
			"\1\1\6\uffff\1\1\3\uffff\1\1",
			"",
			"\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff\1\6\1\1\3\uffff\2\44\4\uffff\1"+
			"\44\1\uffff\1\11\3\uffff\1\12\1\13\1\14\1\uffff\1\44\1\43\1\44\1\uffff"+
			"\2\44\1\35\1\15\1\uffff\1\44\1\33\1\16\3\uffff\1\44\1\17\3\uffff\3\44"+
			"\1\20\1\uffff\1\42\1\uffff\2\44\4\uffff\1\21\1\1\2\44\1\uffff\1\22\2"+
			"\uffff\1\44\1\36\1\44\1\uffff\3\44\1\uffff\1\37\1\44\1\10\4\uffff\1\1"+
			"\1\44\1\uffff\1\44\1\uffff\1\1\2\uffff\1\44\2\uffff\5\44\3\uffff\1\44"+
			"\1\uffff\2\44\1\uffff\1\41\1\44\1\23\4\44\1\24\1\34\1\25\1\32\1\26\1"+
			"\uffff\1\1\1\44\1\uffff\1\43\1\40\1\44\3\uffff\2\44\1\uffff\1\27\1\44"+
			"\1\30\1\31\3\uffff\1\43\10\uffff\1\1\1\7\2\uffff\1\5\2\uffff\1\1\7\uffff"+
			"\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\3\uffff\1\1",
			"\1\1\1\uffff\2\1\26\uffff\1\1\21\uffff\1\1\6\uffff\1\1\12\uffff\1\1"+
			"\21\uffff\1\1\2\uffff\1\1\2\uffff\1\1\33\uffff\1\1\11\uffff\1\1\32\uffff"+
			"\3\1\1\uffff\1\4\2\1\7\uffff\1\1\2\uffff\1\1",
			"",
			"\1\45\1\uffff\1\1",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46\2\uffff\1\41",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\4\uffff\1\46",
			"\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46\2\uffff\1\41",
			"\1\1\1\41\3\uffff\1\46\2\uffff\1\41",
			"",
			"\1\1\1\41\3\uffff\1\46\2\uffff\1\41",
			"\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\2\41\3\uffff\2\41\1\1\1\uffff"+
			"\2\1\1\41\1\uffff\1\41\3\uffff\3\41\1\uffff\3\41\1\uffff\4\41\1\uffff"+
			"\3\41\1\1\2\uffff\2\41\3\uffff\4\41\1\uffff\1\41\1\uffff\2\41\1\uffff"+
			"\1\1\2\uffff\4\41\1\1\1\41\2\uffff\3\41\1\uffff\3\41\1\1\3\41\4\uffff"+
			"\2\41\1\uffff\1\41\1\uffff\1\41\2\uffff\1\41\1\uffff\1\1\2\41\1\50\2"+
			"\41\1\1\2\uffff\1\41\1\uffff\2\41\2\uffff\13\41\1\uffff\2\41\1\uffff"+
			"\3\41\1\uffff\1\1\1\uffff\2\41\1\uffff\4\41\1\uffff\1\1\1\uffff\1\41"+
			"\10\uffff\2\41\2\uffff\1\41\2\uffff\1\41\7\uffff\1\41\3\1\1\41\1\uffff"+
			"\1\47\1\1\5\uffff\1\41\1\uffff\1\1\1\uffff\1\41\1\1",
			"\1\51\4\uffff\2\53\4\uffff\1\53\1\uffff\1\1\3\uffff\3\1\1\uffff\1\53"+
			"\1\uffff\1\53\1\uffff\2\53\2\1\1\uffff\1\53\2\1\3\uffff\1\53\1\1\3\uffff"+
			"\3\53\1\1\1\uffff\1\53\1\uffff\2\53\4\uffff\1\1\1\uffff\2\53\1\uffff"+
			"\1\1\2\uffff\1\53\1\41\1\53\1\uffff\3\53\1\uffff\3\53\5\uffff\1\53\1"+
			"\uffff\1\53\4\uffff\1\53\2\uffff\5\53\3\uffff\1\53\1\uffff\2\53\2\uffff"+
			"\1\53\1\1\4\53\5\1\1\uffff\1\1\1\53\2\uffff\2\53\3\uffff\2\53\1\uffff"+
			"\1\1\1\53\2\1\15\uffff\1\52",
			"\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff\1\54\1\1\3\uffff\2\56\4\uffff\1"+
			"\56\1\uffff\1\57\3\uffff\1\60\1\61\1\62\1\uffff\1\56\1\104\1\56\1\uffff"+
			"\2\56\1\103\1\63\1\uffff\1\56\1\101\1\64\3\uffff\1\56\1\65\3\uffff\3"+
			"\56\1\66\1\uffff\1\56\1\uffff\2\56\4\uffff\1\67\1\1\2\56\1\uffff\1\70"+
			"\2\uffff\1\56\1\104\1\56\1\uffff\3\56\1\uffff\3\56\4\uffff\1\1\1\56\1"+
			"\uffff\1\56\1\uffff\1\1\2\uffff\1\56\2\uffff\5\56\3\uffff\1\56\1\uffff"+
			"\2\56\2\uffff\1\56\1\71\4\56\1\72\1\102\1\73\1\100\1\74\1\uffff\1\1\1"+
			"\56\1\uffff\1\104\2\56\3\uffff\2\56\1\uffff\1\75\1\56\1\76\1\77\3\uffff"+
			"\1\104\10\uffff\1\1\1\55\2\uffff\1\1\2\uffff\1\1\7\uffff\1\1\3\uffff"+
			"\1\1\1\uffff\1\1\6\uffff\1\1\3\uffff\1\1",
			"\1\1\104\uffff\1\41\4\uffff\1\41",
			"\1\1\1\41",
			"\1\1\1\41",
			"\1\1\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\32\uffff\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41"
	};

	static final short[] DFA173_eot = DFA.unpackEncodedString(DFA173_eotS);
	static final short[] DFA173_eof = DFA.unpackEncodedString(DFA173_eofS);
	static final char[] DFA173_min = DFA.unpackEncodedStringToUnsignedChars(DFA173_minS);
	static final char[] DFA173_max = DFA.unpackEncodedStringToUnsignedChars(DFA173_maxS);
	static final short[] DFA173_accept = DFA.unpackEncodedString(DFA173_acceptS);
	static final short[] DFA173_special = DFA.unpackEncodedString(DFA173_specialS);
	static final short[][] DFA173_transition;

	static {
		int numStates = DFA173_transitionS.length;
		DFA173_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA173_transition[i] = DFA.unpackEncodedString(DFA173_transitionS[i]);
		}
	}

	protected class DFA173 extends DFA {

		public DFA173(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 173;
			this.eot = DFA173_eot;
			this.eof = DFA173_eof;
			this.min = DFA173_min;
			this.max = DFA173_max;
			this.accept = DFA173_accept;
			this.special = DFA173_special;
			this.transition = DFA173_transition;
		}
		@Override
		public String getDescription() {
			return "1308:1: term returns [Term.Raw term] : (v= value |f= function | '(' c= comparatorType ')' t= term );";
		}
	}

	static final String DFA176_eotS =
		"\35\uffff";
	static final String DFA176_eofS =
		"\35\uffff";
	static final String DFA176_minS =
		"\1\6\1\uffff\31\25\2\uffff";
	static final String DFA176_maxS =
		"\1\u00c2\1\uffff\31\u00b6\2\uffff";
	static final String DFA176_acceptS =
		"\1\uffff\1\1\31\uffff\1\2\1\3";
	static final String DFA176_specialS =
		"\35\uffff}>";
	static final String[] DFA176_transitionS = {
			"\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff\1\2\1\1\3\uffff\2\4\4\uffff\1\4"+
			"\1\uffff\1\5\3\uffff\1\6\1\7\1\10\1\uffff\1\4\1\32\1\4\1\uffff\2\4\1"+
			"\31\1\11\1\uffff\1\4\1\27\1\12\3\uffff\1\4\1\13\3\uffff\3\4\1\14\1\uffff"+
			"\1\4\1\uffff\2\4\4\uffff\1\15\1\1\2\4\1\uffff\1\16\2\uffff\1\4\1\32\1"+
			"\4\1\uffff\3\4\1\uffff\3\4\4\uffff\1\1\1\4\1\uffff\1\4\1\uffff\1\1\2"+
			"\uffff\1\4\2\uffff\5\4\3\uffff\1\4\1\uffff\2\4\2\uffff\1\4\1\17\4\4\1"+
			"\20\1\30\1\21\1\26\1\22\1\uffff\1\1\1\4\1\uffff\1\32\2\4\3\uffff\2\4"+
			"\1\uffff\1\23\1\4\1\24\1\25\3\uffff\1\32\10\uffff\1\1\1\3\2\uffff\1\1"+
			"\2\uffff\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\3\uffff"+
			"\1\1",
			"",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009d\uffff\1\33\1\uffff\1\33\1\1",
			"",
			""
	};

	static final short[] DFA176_eot = DFA.unpackEncodedString(DFA176_eotS);
	static final short[] DFA176_eof = DFA.unpackEncodedString(DFA176_eofS);
	static final char[] DFA176_min = DFA.unpackEncodedStringToUnsignedChars(DFA176_minS);
	static final char[] DFA176_max = DFA.unpackEncodedStringToUnsignedChars(DFA176_maxS);
	static final short[] DFA176_accept = DFA.unpackEncodedString(DFA176_acceptS);
	static final short[] DFA176_special = DFA.unpackEncodedString(DFA176_specialS);
	static final short[][] DFA176_transition;

	static {
		int numStates = DFA176_transitionS.length;
		DFA176_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA176_transition[i] = DFA.unpackEncodedString(DFA176_transitionS[i]);
		}
	}

	protected class DFA176 extends DFA {

		public DFA176(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 176;
			this.eot = DFA176_eot;
			this.eof = DFA176_eof;
			this.min = DFA176_min;
			this.max = DFA176_max;
			this.accept = DFA176_accept;
			this.special = DFA176_special;
			this.transition = DFA176_transition;
		}
		@Override
		public String getDescription() {
			return "1324:1: normalColumnOperation[List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key] : (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER );";
		}
	}

	static final String DFA184_eotS =
		"\34\uffff";
	static final String DFA184_eofS =
		"\34\uffff";
	static final String DFA184_minS =
		"\1\24\30\u00bb\1\6\2\uffff";
	static final String DFA184_maxS =
		"\1\u00a3\30\u00bb\1\u00c2\2\uffff";
	static final String DFA184_acceptS =
		"\32\uffff\1\1\1\2";
	static final String DFA184_specialS =
		"\34\uffff}>";
	static final String[] DFA184_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\30\1\3\1\uffff\2\3\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\3"+
			"\1\12\3\uffff\3\3\1\13\1\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\uffff\2"+
			"\3\1\uffff\1\15\2\uffff\1\3\1\30\1\3\1\uffff\3\3\1\uffff\3\3\5\uffff"+
			"\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\16\4\3\1\17\1\27\1\20\1\25\1\21\2\uffff\1\3\1\uffff\1\30\2\3\3"+
			"\uffff\2\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\30\11\uffff\1\2",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\32\7\uffff\1\32\3\uffff\1\32\2\uffff\1\32\3\uffff\2\32\4\uffff\1"+
			"\32\1\uffff\1\32\3\uffff\3\32\1\uffff\3\32\1\uffff\4\32\1\uffff\3\32"+
			"\3\uffff\2\32\3\uffff\4\32\1\uffff\1\32\1\uffff\2\32\4\uffff\4\32\1\uffff"+
			"\1\32\2\uffff\3\32\1\uffff\3\32\1\uffff\3\32\4\uffff\2\32\1\uffff\1\32"+
			"\4\uffff\1\32\2\uffff\5\32\3\uffff\1\32\1\uffff\2\32\2\uffff\13\32\2"+
			"\uffff\1\32\1\uffff\3\32\3\uffff\2\32\1\uffff\4\32\3\uffff\1\32\14\uffff"+
			"\1\32\2\uffff\1\32\13\uffff\1\32\14\uffff\1\33",
			"",
			""
	};

	static final short[] DFA184_eot = DFA.unpackEncodedString(DFA184_eotS);
	static final short[] DFA184_eof = DFA.unpackEncodedString(DFA184_eofS);
	static final char[] DFA184_min = DFA.unpackEncodedStringToUnsignedChars(DFA184_minS);
	static final char[] DFA184_max = DFA.unpackEncodedStringToUnsignedChars(DFA184_maxS);
	static final short[] DFA184_accept = DFA.unpackEncodedString(DFA184_acceptS);
	static final short[] DFA184_special = DFA.unpackEncodedString(DFA184_specialS);
	static final short[][] DFA184_transition;

	static {
		int numStates = DFA184_transitionS.length;
		DFA184_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA184_transition[i] = DFA.unpackEncodedString(DFA184_transitionS[i]);
		}
	}

	protected class DFA184 extends DFA {

		public DFA184(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 184;
			this.eot = DFA184_eot;
			this.eof = DFA184_eof;
			this.min = DFA184_min;
			this.max = DFA184_max;
			this.accept = DFA184_accept;
			this.special = DFA184_special;
			this.transition = DFA184_transition;
		}
		@Override
		public String getDescription() {
			return "1397:1: property[PropertyDefinitions props] : (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= mapLiteral );";
		}
	}

	static final String DFA190_eotS =
		"\75\uffff";
	static final String DFA190_eofS =
		"\75\uffff";
	static final String DFA190_minS =
		"\1\24\30\56\1\uffff\1\24\3\uffff\1\u00a2\2\uffff\30\56\4\uffff";
	static final String DFA190_maxS =
		"\1\u00b1\30\u00be\1\uffff\1\u00b1\3\uffff\1\u00b7\2\uffff\30\u00be\4\uffff";
	static final String DFA190_acceptS =
		"\31\uffff\1\4\1\uffff\1\1\1\2\1\3\1\uffff\1\7\1\10\30\uffff\1\12\1\5\1"+
		"\6\1\11";
	static final String DFA190_specialS =
		"\75\uffff}>";
	static final String[] DFA190_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\30\1\3\1\uffff\2\3\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\3"+
			"\1\12\3\uffff\3\3\1\13\1\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\uffff\2"+
			"\3\1\uffff\1\15\2\uffff\1\3\1\30\1\3\1\uffff\3\3\1\uffff\3\3\5\uffff"+
			"\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\16\4\3\1\17\1\27\1\20\1\25\1\21\1\uffff\1\31\1\3\1\uffff\1\30"+
			"\2\3\3\uffff\2\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\30\11\uffff\1\2"+
			"\15\uffff\1\32",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"",
			"\1\41\4\uffff\2\43\4\uffff\1\43\1\uffff\1\44\3\uffff\1\45\1\46\1\47"+
			"\1\uffff\1\43\1\70\1\43\1\uffff\2\43\1\70\1\50\1\uffff\1\43\1\66\1\51"+
			"\3\uffff\1\43\1\52\3\uffff\3\43\1\53\1\uffff\1\43\1\uffff\2\43\4\uffff"+
			"\1\54\1\uffff\2\43\1\uffff\1\55\2\uffff\1\43\1\70\1\43\1\uffff\3\43\1"+
			"\uffff\3\43\5\uffff\1\43\1\uffff\1\43\4\uffff\1\43\2\uffff\5\43\3\uffff"+
			"\1\43\1\uffff\2\43\2\uffff\1\43\1\56\4\43\1\57\1\67\1\60\1\65\1\61\1"+
			"\uffff\1\71\1\43\1\uffff\1\70\2\43\3\uffff\2\43\1\uffff\1\62\1\43\1\63"+
			"\1\64\3\uffff\1\70\11\uffff\1\42\15\uffff\1\71",
			"",
			"",
			"",
			"\1\72\16\uffff\1\73\5\uffff\1\72",
			"",
			"",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"",
			"",
			"",
			""
	};

	static final short[] DFA190_eot = DFA.unpackEncodedString(DFA190_eotS);
	static final short[] DFA190_eof = DFA.unpackEncodedString(DFA190_eofS);
	static final char[] DFA190_min = DFA.unpackEncodedStringToUnsignedChars(DFA190_minS);
	static final char[] DFA190_max = DFA.unpackEncodedStringToUnsignedChars(DFA190_maxS);
	static final short[] DFA190_accept = DFA.unpackEncodedString(DFA190_acceptS);
	static final short[] DFA190_special = DFA.unpackEncodedString(DFA190_specialS);
	static final short[][] DFA190_transition;

	static {
		int numStates = DFA190_transitionS.length;
		DFA190_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA190_transition[i] = DFA.unpackEncodedString(DFA190_transitionS[i]);
		}
	}

	protected class DFA190 extends DFA {

		public DFA190(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 190;
			this.eot = DFA190_eot;
			this.eof = DFA190_eof;
			this.min = DFA190_min;
			this.max = DFA190_max;
			this.accept = DFA190_accept;
			this.special = DFA190_special;
			this.transition = DFA190_transition;
		}
		@Override
		public String getDescription() {
			return "1416:1: relation[WhereClause.Builder clauses] : (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident K_CONTAINS ( K_KEY )? t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );";
		}
	}

	static final String DFA189_eotS =
		"\12\uffff";
	static final String DFA189_eofS =
		"\12\uffff";
	static final String DFA189_minS =
		"\1\110\1\uffff\6\u00a2\2\uffff";
	static final String DFA189_maxS =
		"\1\u00bd\1\uffff\6\u00b7\2\uffff";
	static final String DFA189_acceptS =
		"\1\uffff\1\1\6\uffff\1\2\1\3";
	static final String DFA189_specialS =
		"\12\uffff}>";
	static final String[] DFA189_transitionS = {
			"\1\1\147\uffff\1\7\10\uffff\1\3\1\4\1\2\1\5\1\6",
			"",
			"\1\11\16\uffff\1\10\5\uffff\1\11",
			"\1\11\16\uffff\1\10\5\uffff\1\11",
			"\1\11\16\uffff\1\10\5\uffff\1\11",
			"\1\11\16\uffff\1\10\5\uffff\1\11",
			"\1\11\16\uffff\1\10\5\uffff\1\11",
			"\1\11\16\uffff\1\10\5\uffff\1\11",
			"",
			""
	};

	static final short[] DFA189_eot = DFA.unpackEncodedString(DFA189_eotS);
	static final short[] DFA189_eof = DFA.unpackEncodedString(DFA189_eofS);
	static final char[] DFA189_min = DFA.unpackEncodedStringToUnsignedChars(DFA189_minS);
	static final char[] DFA189_max = DFA.unpackEncodedStringToUnsignedChars(DFA189_maxS);
	static final short[] DFA189_accept = DFA.unpackEncodedString(DFA189_acceptS);
	static final short[] DFA189_special = DFA.unpackEncodedString(DFA189_specialS);
	static final short[][] DFA189_transition;

	static {
		int numStates = DFA189_transitionS.length;
		DFA189_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA189_transition[i] = DFA.unpackEncodedString(DFA189_transitionS[i]);
		}
	}

	protected class DFA189 extends DFA {

		public DFA189(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 189;
			this.eot = DFA189_eot;
			this.eof = DFA189_eof;
			this.min = DFA189_min;
			this.max = DFA189_max;
			this.accept = DFA189_accept;
			this.special = DFA189_special;
			this.transition = DFA189_transition;
		}
		@Override
		public String getDescription() {
			return "1430:7: ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )";
		}
	}

	static final String DFA199_eotS =
		"\37\uffff";
	static final String DFA199_eofS =
		"\1\uffff\24\34\2\31\1\uffff\1\31\1\uffff\1\31\4\uffff";
	static final String DFA199_minS =
		"\1\24\26\77\1\uffff\1\77\1\uffff\1\77\4\uffff";
	static final String DFA199_maxS =
		"\1\u00a6\26\u00bc\1\uffff\1\u00bc\1\uffff\1\u00bc\4\uffff";
	static final String DFA199_acceptS =
		"\27\uffff\1\2\1\uffff\1\4\1\uffff\1\6\1\1\1\3\1\5";
	static final String DFA199_specialS =
		"\37\uffff}>";
	static final String[] DFA199_transitionS = {
			"\1\31\4\uffff\2\31\4\uffff\1\31\1\uffff\1\1\3\uffff\1\2\1\3\1\4\1\uffff"+
			"\3\31\1\uffff\3\31\1\5\1\uffff\1\31\1\23\1\6\3\uffff\1\31\1\7\3\uffff"+
			"\3\31\1\10\1\uffff\1\32\1\uffff\2\31\4\uffff\1\11\1\uffff\2\31\1\uffff"+
			"\1\12\2\uffff\3\31\1\uffff\3\31\1\uffff\1\26\1\31\1\25\5\uffff\1\31\1"+
			"\uffff\1\31\4\uffff\1\31\2\uffff\5\31\3\uffff\1\31\1\uffff\2\31\1\uffff"+
			"\1\27\1\31\1\13\4\31\1\14\1\24\1\15\1\22\1\16\2\uffff\1\31\1\uffff\1"+
			"\31\1\30\1\31\3\uffff\2\31\1\uffff\1\17\1\31\1\20\1\21\3\uffff\1\31\11"+
			"\uffff\1\31\2\uffff\1\33",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\31\14\uffff\1\31\12\uffff\1\31\31\uffff\1\31\12\uffff\1\31\65\uffff"+
			"\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\27\2\uffff\1\31",
			"\1\31\14\uffff\1\31\12\uffff\1\31\31\uffff\1\31\12\uffff\1\31\65\uffff"+
			"\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\27\2\uffff\1\31",
			"",
			"\1\31\14\uffff\1\31\12\uffff\1\31\31\uffff\1\31\12\uffff\1\31\65\uffff"+
			"\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\35\2\uffff\1\31",
			"",
			"\1\31\14\uffff\1\31\12\uffff\1\31\31\uffff\1\31\12\uffff\1\31\65\uffff"+
			"\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\36\2\uffff\1\31",
			"",
			"",
			"",
			""
	};

	static final short[] DFA199_eot = DFA.unpackEncodedString(DFA199_eotS);
	static final short[] DFA199_eof = DFA.unpackEncodedString(DFA199_eofS);
	static final char[] DFA199_min = DFA.unpackEncodedStringToUnsignedChars(DFA199_minS);
	static final char[] DFA199_max = DFA.unpackEncodedStringToUnsignedChars(DFA199_maxS);
	static final short[] DFA199_accept = DFA.unpackEncodedString(DFA199_acceptS);
	static final short[] DFA199_special = DFA.unpackEncodedString(DFA199_specialS);
	static final short[][] DFA199_transition;

	static {
		int numStates = DFA199_transitionS.length;
		DFA199_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA199_transition[i] = DFA.unpackEncodedString(DFA199_transitionS[i]);
		}
	}

	protected class DFA199 extends DFA {

		public DFA199(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 199;
			this.eot = DFA199_eot;
			this.eof = DFA199_eof;
			this.min = DFA199_min;
			this.max = DFA199_max;
			this.accept = DFA199_accept;
			this.special = DFA199_special;
			this.transition = DFA199_transition;
		}
		@Override
		public String getDescription() {
			return "1487:1: comparatorType returns [CQL3Type.Raw t] : (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL );";
		}
	}

	public static final BitSet FOLLOW_selectStatement_in_cqlStatement59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStatement_in_cqlStatement88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateStatement_in_cqlStatement117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_batchStatement_in_cqlStatement146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_cqlStatement176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_useStatement_in_cqlStatement205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_truncateStatement_in_cqlStatement237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createKeyspaceStatement_in_cqlStatement264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTableStatement_in_cqlStatement285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createIndexStatement_in_cqlStatement308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropKeyspaceStatement_in_cqlStatement331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTableStatement_in_cqlStatement353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropIndexStatement_in_cqlStatement378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTableStatement_in_cqlStatement403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterKeyspaceStatement_in_cqlStatement427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grantPermissionsStatement_in_cqlStatement448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_revokePermissionsStatement_in_cqlStatement466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listPermissionsStatement_in_cqlStatement483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createUserStatement_in_cqlStatement502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterUserStatement_in_cqlStatement526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropUserStatement_in_cqlStatement551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listUsersStatement_in_cqlStatement577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTriggerStatement_in_cqlStatement602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTriggerStatement_in_cqlStatement623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTypeStatement_in_cqlStatement646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTypeStatement_in_cqlStatement670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTypeStatement_in_cqlStatement695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createFunctionStatement_in_cqlStatement721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropFunctionStatement_in_cqlStatement741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createAggregateStatement_in_cqlStatement763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropAggregateStatement_in_cqlStatement782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createRoleStatement_in_cqlStatement803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterRoleStatement_in_cqlStatement827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropRoleStatement_in_cqlStatement852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listRolesStatement_in_cqlStatement878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grantRoleStatement_in_cqlStatement903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_revokeRoleStatement_in_cqlStatement928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createMaterializedViewStatement_in_cqlStatement952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropMaterializedViewStatement_in_cqlStatement964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterMaterializedViewStatement_in_cqlStatement978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USE_in_useStatement1004 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_keyspaceName_in_useStatement1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SELECT_in_selectStatement1042 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x8000000C023D8EDFL});
	public static final BitSet FOLLOW_K_JSON_in_selectStatement1052 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x8000000C023D8EDFL});
	public static final BitSet FOLLOW_K_DISTINCT_in_selectStatement1069 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x8000000C023D8EDFL});
	public static final BitSet FOLLOW_selectClause_in_selectStatement1078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROM_in_selectStatement1088 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_selectStatement1092 = new BitSet(new long[]{0x0000000008000002L,0x0000480002000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_WHERE_in_selectStatement1102 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8EDFL,0x0000000000000002L});
	public static final BitSet FOLLOW_whereClause_in_selectStatement1106 = new BitSet(new long[]{0x0000000008000002L,0x0000480002000000L});
	public static final BitSet FOLLOW_K_ORDER_in_selectStatement1119 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_K_BY_in_selectStatement1121 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_orderByClause_in_selectStatement1123 = new BitSet(new long[]{0x0000000008000002L,0x0000400002000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_selectStatement1128 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_orderByClause_in_selectStatement1130 = new BitSet(new long[]{0x0000000008000002L,0x0000400002000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_PER_in_selectStatement1147 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_PARTITION_in_selectStatement1149 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_LIMIT_in_selectStatement1151 = new BitSet(new long[]{0x0000000008200000L,0x0000000002000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_intValue_in_selectStatement1155 = new BitSet(new long[]{0x0000000008000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_LIMIT_in_selectStatement1170 = new BitSet(new long[]{0x0000000008200000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_intValue_in_selectStatement1174 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_K_ALLOW_in_selectStatement1189 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_K_FILTERING_in_selectStatement1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_selectClause1228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_selectClause1233 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_selector_in_selectClause1237 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_191_in_selectClause1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selector1282 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AS_in_selector1285 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_selector1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_unaliasedSelector1330 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_COUNT_in_unaliasedSelector1376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_unaliasedSelector1378 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_countArgument_in_unaliasedSelector1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_unaliasedSelector1382 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_WRITETIME_in_unaliasedSelector1407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_unaliasedSelector1409 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_unaliasedSelector1413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_unaliasedSelector1415 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_TTL_in_unaliasedSelector1441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_unaliasedSelector1449 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_unaliasedSelector1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_unaliasedSelector1455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_CAST_in_unaliasedSelector1481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_unaliasedSelector1488 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_unaliasedSelector_in_unaliasedSelector1492 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_K_AS_in_unaliasedSelector1494 = new BitSet(new long[]{0x021900E200000000L,0x0800000000008401L,0x000000000034001FL});
	public static final BitSet FOLLOW_native_type_in_unaliasedSelector1498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_unaliasedSelector1500 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_functionName_in_unaliasedSelector1515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_selectionFunctionArgs_in_unaliasedSelector1519 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_182_in_unaliasedSelector1534 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_unaliasedSelector1538 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_177_in_selectionFunctionArgs1566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_selectionFunctionArgs1568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_selectionFunctionArgs1578 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_selectionFunctionArgs1598 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_selectionFunctionArgs1615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_191_in_countArgument1634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_countArgument1644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationOrExpression_in_whereClause1675 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_whereClause1679 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8EDFL,0x0000000000000002L});
	public static final BitSet FOLLOW_relationOrExpression_in_whereClause1681 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_relation_in_relationOrExpression1703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_customIndexExpression_in_relationOrExpression1712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_193_in_customIndexExpression1740 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_idxName_in_customIndexExpression1742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_customIndexExpression1745 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_customIndexExpression1749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_customIndexExpression1751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_orderByClause1781 = new BitSet(new long[]{0x0040000100000002L});
	public static final BitSet FOLLOW_K_ASC_in_orderByClause1784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_orderByClause1788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INSERT_in_insertStatement1817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_INTO_in_insertStatement1819 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_insertStatement1823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0002000000000000L});
	public static final BitSet FOLLOW_normalInsertStatement_in_insertStatement1837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_JSON_in_insertStatement1852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0080004400020000L});
	public static final BitSet FOLLOW_jsonInsertStatement_in_insertStatement1856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_normalInsertStatement1892 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_normalInsertStatement1896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_normalInsertStatement1903 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_normalInsertStatement1907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_normalInsertStatement1914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_K_VALUES_in_normalInsertStatement1922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_normalInsertStatement1930 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_normalInsertStatement1934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_normalInsertStatement1940 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_normalInsertStatement1944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_normalInsertStatement1951 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_IF_in_normalInsertStatement1961 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_normalInsertStatement1963 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_normalInsertStatement1965 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_usingClause_in_normalInsertStatement1980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jsonValue_in_jsonInsertStatement2026 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_IF_in_jsonInsertStatement2036 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_jsonInsertStatement2038 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_jsonInsertStatement2040 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_usingClause_in_jsonInsertStatement2055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_jsonValue2096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_jsonValue2106 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_jsonValue2110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_jsonValue2124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USING_in_usingClause2155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000204L});
	public static final BitSet FOLLOW_usingClauseObjective_in_usingClause2157 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_usingClause2162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000204L});
	public static final BitSet FOLLOW_usingClauseObjective_in_usingClause2164 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseObjective2186 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseObjective2190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TTL_in_usingClauseObjective2200 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseObjective2204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_UPDATE_in_updateStatement2238 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_updateStatement2242 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_usingClause_in_updateStatement2252 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_K_SET_in_updateStatement2264 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_columnOperation_in_updateStatement2266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000800000L});
	public static final BitSet FOLLOW_180_in_updateStatement2270 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_columnOperation_in_updateStatement2272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000800000L});
	public static final BitSet FOLLOW_K_WHERE_in_updateStatement2283 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8EDFL,0x0000000000000002L});
	public static final BitSet FOLLOW_whereClause_in_updateStatement2287 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_IF_in_updateStatement2297 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_K_EXISTS_in_updateStatement2301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateConditions_in_updateStatement2309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_columnCondition_in_updateConditions2351 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_updateConditions2356 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_columnCondition_in_updateConditions2358 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_DELETE_in_deleteStatement2395 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB437L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_deleteSelection_in_deleteStatement2401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROM_in_deleteStatement2414 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_deleteStatement2418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000820000L});
	public static final BitSet FOLLOW_usingClauseDelete_in_deleteStatement2428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_WHERE_in_deleteStatement2440 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8EDFL,0x0000000000000002L});
	public static final BitSet FOLLOW_whereClause_in_deleteStatement2444 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_IF_in_deleteStatement2454 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_K_EXISTS_in_deleteStatement2458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateConditions_in_deleteStatement2466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteOp_in_deleteSelection2513 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_deleteSelection2528 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_deleteOp_in_deleteSelection2532 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_cident_in_deleteOp2559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_deleteOp2586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_190_in_deleteOp2588 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_deleteOp2592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_192_in_deleteOp2594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_deleteOp2606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_182_in_deleteOp2608 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_deleteOp2612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USING_in_usingClauseDelete2632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseDelete2634 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseDelete2638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BEGIN_in_batchStatement2672 = new BitSet(new long[]{0x0001000800000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_UNLOGGED_in_batchStatement2682 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_K_COUNTER_in_batchStatement2688 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_K_BATCH_in_batchStatement2701 = new BitSet(new long[]{0x0020000040000000L,0x0000000000004000L,0x0000000000022000L});
	public static final BitSet FOLLOW_usingClause_in_batchStatement2705 = new BitSet(new long[]{0x0020000040000000L,0x0000000000004000L,0x0000000000002000L});
	public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement2725 = new BitSet(new long[]{0x0020000040000000L,0x0000000000004000L,0x0100000000002000L});
	public static final BitSet FOLLOW_184_in_batchStatement2727 = new BitSet(new long[]{0x0020000040000000L,0x0000000000004000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_APPLY_in_batchStatement2741 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_K_BATCH_in_batchStatement2743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStatement_in_batchStatementObjective2774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateStatement_in_batchStatementObjective2787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_batchStatementObjective2800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createAggregateStatement2833 = new BitSet(new long[]{0x0000000002000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_OR_in_createAggregateStatement2836 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_REPLACE_in_createAggregateStatement2838 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_K_AGGREGATE_in_createAggregateStatement2850 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_K_IF_in_createAggregateStatement2859 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createAggregateStatement2861 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createAggregateStatement2863 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_functionName_in_createAggregateStatement2877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_createAggregateStatement2885 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00040048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement2909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_createAggregateStatement2925 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement2929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_createAggregateStatement2953 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_K_SFUNC_in_createAggregateStatement2961 = new BitSet(new long[]{0xE31DEAE286100000L,0xFCD1F2141DD4B435L,0x00000008003D8CDFL});
	public static final BitSet FOLLOW_allowedFunctionName_in_createAggregateStatement2967 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_K_STYPE_in_createAggregateStatement2975 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement2981 = new BitSet(new long[]{0x8000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_FINALFUNC_in_createAggregateStatement2999 = new BitSet(new long[]{0xE31DEAE286100000L,0xFCD1F2141DD4B435L,0x00000008003D8CDFL});
	public static final BitSet FOLLOW_allowedFunctionName_in_createAggregateStatement3005 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_INITCOND_in_createAggregateStatement3032 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_createAggregateStatement3038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropAggregateStatement3085 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_K_AGGREGATE_in_dropAggregateStatement3087 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_K_IF_in_dropAggregateStatement3096 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropAggregateStatement3098 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_functionName_in_dropAggregateStatement3113 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_dropAggregateStatement3131 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00040048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_dropAggregateStatement3159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_dropAggregateStatement3177 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_dropAggregateStatement3181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_dropAggregateStatement3209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createFunctionStatement3266 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000010L});
	public static final BitSet FOLLOW_K_OR_in_createFunctionStatement3269 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_REPLACE_in_createFunctionStatement3271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_K_FUNCTION_in_createFunctionStatement3283 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_K_IF_in_createFunctionStatement3292 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createFunctionStatement3294 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createFunctionStatement3296 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_functionName_in_createFunctionStatement3310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_createFunctionStatement3318 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00040008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_createFunctionStatement3342 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement3346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_createFunctionStatement3362 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_createFunctionStatement3366 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement3370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_createFunctionStatement3394 = new BitSet(new long[]{0x0000020000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_RETURNS_in_createFunctionStatement3405 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_NULL_in_createFunctionStatement3407 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_CALLED_in_createFunctionStatement3413 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_ON_in_createFunctionStatement3419 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_NULL_in_createFunctionStatement3421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_INPUT_in_createFunctionStatement3423 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_RETURNS_in_createFunctionStatement3431 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement3437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_LANGUAGE_in_createFunctionStatement3445 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_createFunctionStatement3451 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_K_AS_in_createFunctionStatement3459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createFunctionStatement3465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropFunctionStatement3503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_K_FUNCTION_in_dropFunctionStatement3505 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_K_IF_in_dropFunctionStatement3514 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropFunctionStatement3516 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_functionName_in_dropFunctionStatement3531 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_dropFunctionStatement3549 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00040048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_dropFunctionStatement3577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_dropFunctionStatement3595 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_dropFunctionStatement3599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_dropFunctionStatement3627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createKeyspaceStatement3686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_createKeyspaceStatement3688 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_createKeyspaceStatement3691 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createKeyspaceStatement3693 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createKeyspaceStatement3695 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_keyspaceName_in_createKeyspaceStatement3704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_createKeyspaceStatement3712 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_properties_in_createKeyspaceStatement3714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTableStatement3749 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_createTableStatement3751 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_createTableStatement3754 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTableStatement3756 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTableStatement3758 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_createTableStatement3773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_cfamDefinition_in_createTableStatement3783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_cfamDefinition3802 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD3F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition3804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_cfamDefinition3809 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD3F2141DDCB435L,0x00140008023D8E9FL});
	public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition3811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_cfamDefinition3818 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_cfamDefinition3828 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition3830 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_cfamDefinition3835 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition3837 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ident_in_cfamColumns3863 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_cfamColumns3867 = new BitSet(new long[]{0x0000000000000002L,0x1002000000000000L});
	public static final BitSet FOLLOW_K_STATIC_in_cfamColumns3872 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
	public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns3889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_K_KEY_in_cfamColumns3891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns3903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_K_KEY_in_cfamColumns3905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_cfamColumns3907 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8E9FL});
	public static final BitSet FOLLOW_pkDef_in_cfamColumns3909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_cfamColumns3913 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_ident_in_cfamColumns3917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_cfamColumns3924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_pkDef3944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_pkDef3954 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_ident_in_pkDef3960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_pkDef3966 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_ident_in_pkDef3970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_pkDef3977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_cfamProperty3997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COMPACT_in_cfamProperty4006 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_K_STORAGE_in_cfamProperty4008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CLUSTERING_in_cfamProperty4018 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_ORDER_in_cfamProperty4020 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_K_BY_in_cfamProperty4022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_cfamProperty4024 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty4026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_cfamProperty4030 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty4032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_cfamProperty4037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_cfamOrdering4065 = new BitSet(new long[]{0x0040000100000000L});
	public static final BitSet FOLLOW_K_ASC_in_cfamOrdering4068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_cfamOrdering4072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTypeStatement4111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_TYPE_in_createTypeStatement4113 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_createTypeStatement4116 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTypeStatement4118 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTypeStatement4120 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_userTypeName_in_createTypeStatement4138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_createTypeStatement4151 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_typeColumns_in_createTypeStatement4153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_createTypeStatement4158 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00140008023D8E9FL});
	public static final BitSet FOLLOW_typeColumns_in_createTypeStatement4160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_createTypeStatement4167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_noncol_ident_in_typeColumns4187 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_typeColumns4191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createIndexStatement4226 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_CUSTOM_in_createIndexStatement4229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_INDEX_in_createIndexStatement4235 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F3141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_createIndexStatement4238 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createIndexStatement4240 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createIndexStatement4242 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F3141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_idxName_in_createIndexStatement4258 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_ON_in_createIndexStatement4263 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_createIndexStatement4267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_createIndexStatement4269 = new BitSet(new long[]{0xEB1DEEE286100000L,0xFCD1F2141DDCB43DL,0x00040008023D8E9FL});
	public static final BitSet FOLLOW_indexIdent_in_createIndexStatement4272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_createIndexStatement4276 = new BitSet(new long[]{0xEB1DEEE286100000L,0xFCD1F2141DDCB43DL,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_indexIdent_in_createIndexStatement4278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_createIndexStatement4285 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001020000L});
	public static final BitSet FOLLOW_K_USING_in_createIndexStatement4296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createIndexStatement4300 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_createIndexStatement4315 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_properties_in_createIndexStatement4317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_indexIdent4349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VALUES_in_indexIdent4377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_indexIdent4379 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_indexIdent4383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_indexIdent4385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYS_in_indexIdent4396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_indexIdent4398 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_indexIdent4402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_indexIdent4404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ENTRIES_in_indexIdent4417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_indexIdent4419 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_indexIdent4423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_indexIdent4425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FULL_in_indexIdent4435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_indexIdent4437 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_indexIdent4441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_indexIdent4443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createMaterializedViewStatement4480 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_createMaterializedViewStatement4482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_K_VIEW_in_createMaterializedViewStatement4484 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_createMaterializedViewStatement4487 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createMaterializedViewStatement4489 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createMaterializedViewStatement4491 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_createMaterializedViewStatement4499 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_K_AS_in_createMaterializedViewStatement4501 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_K_SELECT_in_createMaterializedViewStatement4511 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x8000000C023D8EDFL});
	public static final BitSet FOLLOW_selectClause_in_createMaterializedViewStatement4515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROM_in_createMaterializedViewStatement4517 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_createMaterializedViewStatement4521 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_WHERE_in_createMaterializedViewStatement4532 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8EDFL,0x0000000000000002L});
	public static final BitSet FOLLOW_whereClause_in_createMaterializedViewStatement4536 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_K_PRIMARY_in_createMaterializedViewStatement4548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_K_KEY_in_createMaterializedViewStatement4550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_createMaterializedViewStatement4562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_createMaterializedViewStatement4564 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement4568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_createMaterializedViewStatement4574 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement4578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_createMaterializedViewStatement4585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_createMaterializedViewStatement4589 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement4593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_createMaterializedViewStatement4600 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_177_in_createMaterializedViewStatement4610 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement4614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_createMaterializedViewStatement4620 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement4624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_createMaterializedViewStatement4631 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_createMaterializedViewStatement4663 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cfamProperty_in_createMaterializedViewStatement4665 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_createMaterializedViewStatement4670 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cfamProperty_in_createMaterializedViewStatement4672 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTriggerStatement4710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_TRIGGER_in_createTriggerStatement4712 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_createTriggerStatement4715 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTriggerStatement4717 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTriggerStatement4719 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_createTriggerStatement4729 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_ON_in_createTriggerStatement4740 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_createTriggerStatement4744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_USING_in_createTriggerStatement4746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createTriggerStatement4750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTriggerStatement4791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_TRIGGER_in_dropTriggerStatement4793 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_dropTriggerStatement4796 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTriggerStatement4798 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_dropTriggerStatement4808 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_ON_in_dropTriggerStatement4811 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_dropTriggerStatement4815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterKeyspaceStatement4855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement4857 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_keyspaceName_in_alterKeyspaceStatement4861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterKeyspaceStatement4871 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_properties_in_alterKeyspaceStatement4873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement4909 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_alterTableStatement4911 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_alterTableStatement4915 = new BitSet(new long[]{0x0400000011000000L,0x0004000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement4929 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement4933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTableStatement4936 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement4940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ADD_in_alterTableStatement4959 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement4974 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement4980 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_cfisStatic_in_alterTableStatement4986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_alterTableStatement5015 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5020 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement5025 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_cfisStatic_in_alterTableStatement5030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_alterTableStatement5059 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5063 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement5068 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_cfisStatic_in_alterTableStatement5073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_alterTableStatement5080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_alterTableStatement5100 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_alterTableStatement5143 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_alterTableStatement5177 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_alterTableStatement5188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WITH_in_alterTableStatement5207 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_properties_in_alterTableStatement5210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RENAME_in_alterTableStatement5243 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_TO_in_alterTableStatement5299 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5303 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_alterTableStatement5324 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_TO_in_alterTableStatement5330 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5334 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_STATIC_in_cfisStatic5387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterMaterializedViewStatement5423 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_alterMaterializedViewStatement5425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_K_VIEW_in_alterMaterializedViewStatement5427 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_alterMaterializedViewStatement5431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterMaterializedViewStatement5443 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_properties_in_alterMaterializedViewStatement5445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement5476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement5478 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_userTypeName_in_alterTypeStatement5482 = new BitSet(new long[]{0x0000000011000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement5496 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_alterTypeStatement5500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement5502 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement5506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ADD_in_alterTypeStatement5522 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_alterTypeStatement5528 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement5532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RENAME_in_alterTypeStatement5555 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_alterTypeStatement5593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_TO_in_alterTypeStatement5595 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_alterTypeStatement5599 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_alterTypeStatement5622 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_alterTypeStatement5626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_TO_in_alterTypeStatement5628 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_alterTypeStatement5632 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropKeyspaceStatement5699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement5701 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_dropKeyspaceStatement5704 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropKeyspaceStatement5706 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_keyspaceName_in_dropKeyspaceStatement5715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTableStatement5749 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dropTableStatement5751 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_dropTableStatement5754 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTableStatement5756 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_dropTableStatement5765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTypeStatement5799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_TYPE_in_dropTypeStatement5801 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_dropTypeStatement5804 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTypeStatement5806 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_userTypeName_in_dropTypeStatement5815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropIndexStatement5849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_INDEX_in_dropIndexStatement5851 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_dropIndexStatement5854 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropIndexStatement5856 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_indexName_in_dropIndexStatement5865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropMaterializedViewStatement5905 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_dropMaterializedViewStatement5907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_K_VIEW_in_dropMaterializedViewStatement5909 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_dropMaterializedViewStatement5912 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropMaterializedViewStatement5914 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_dropMaterializedViewStatement5923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TRUNCATE_in_truncateStatement5954 = new BitSet(new long[]{0xE31DFEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_truncateStatement5957 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_truncateStatement5963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GRANT_in_grantPermissionsStatement5988 = new BitSet(new long[]{0x1482000414000000L,0x0100000100000000L});
	public static final BitSet FOLLOW_permissionOrAll_in_grantPermissionsStatement6000 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_ON_in_grantPermissionsStatement6008 = new BitSet(new long[]{0xE31DFEE286100000L,0xFCD1F214DDFCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_resource_in_grantPermissionsStatement6020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_TO_in_grantPermissionsStatement6028 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_grantPermissionsStatement6042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_REVOKE_in_revokePermissionsStatement6073 = new BitSet(new long[]{0x1482000414000000L,0x0100000100000000L});
	public static final BitSet FOLLOW_permissionOrAll_in_revokePermissionsStatement6085 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_ON_in_revokePermissionsStatement6093 = new BitSet(new long[]{0xE31DFEE286100000L,0xFCD1F214DDFCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_resource_in_revokePermissionsStatement6105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROM_in_revokePermissionsStatement6113 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_revokePermissionsStatement6127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GRANT_in_grantRoleStatement6158 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_grantRoleStatement6172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_TO_in_grantRoleStatement6180 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_grantRoleStatement6194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_REVOKE_in_revokeRoleStatement6225 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_revokeRoleStatement6239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROM_in_revokeRoleStatement6247 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_revokeRoleStatement6261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listPermissionsStatement6299 = new BitSet(new long[]{0x1482000414000000L,0x0100000100000000L});
	public static final BitSet FOLLOW_permissionOrAll_in_listPermissionsStatement6311 = new BitSet(new long[]{0x0000000000000002L,0x0000018800000000L});
	public static final BitSet FOLLOW_K_ON_in_listPermissionsStatement6321 = new BitSet(new long[]{0xE31DFEE286100000L,0xFCD1F214DDFCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_resource_in_listPermissionsStatement6323 = new BitSet(new long[]{0x0000000000000002L,0x0000008800000000L});
	public static final BitSet FOLLOW_K_OF_in_listPermissionsStatement6338 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_roleName_in_listPermissionsStatement6340 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_K_NORECURSIVE_in_listPermissionsStatement6354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_permission6390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_permissionOrAll6447 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_K_PERMISSIONS_in_permissionOrAll6451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_permission_in_permissionOrAll6472 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_K_PERMISSION_in_permissionOrAll6476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataResource_in_resource6504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleResource_in_resource6516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionResource_in_resource6528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jmxResource_in_resource6540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_dataResource6563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_K_KEYSPACES_in_dataResource6565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_dataResource6575 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_keyspaceName_in_dataResource6581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dataResource6593 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_dataResource6602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_jmxResource6631 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_K_MBEANS_in_jmxResource6633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MBEAN_in_jmxResource6653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_mbean_in_jmxResource6655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MBEANS_in_jmxResource6665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_mbean_in_jmxResource6667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_roleResource6690 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_K_ROLES_in_roleResource6692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ROLE_in_roleResource6702 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_roleResource6708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_functionResource6740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_functionResource6742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_functionResource6752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_functionResource6754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_IN_in_functionResource6756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_functionResource6758 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_keyspaceName_in_functionResource6764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FUNCTION_in_functionResource6779 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_functionName_in_functionResource6783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_functionResource6801 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00040048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_functionResource6829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_functionResource6847 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_functionResource6851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_functionResource6879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createUserStatement6927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_K_USER_in_createUserStatement6929 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000080L,0x0000004800000000L});
	public static final BitSet FOLLOW_K_IF_in_createUserStatement6932 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createUserStatement6934 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createUserStatement6936 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000004800000000L});
	public static final BitSet FOLLOW_username_in_createUserStatement6944 = new BitSet(new long[]{0x0000000000000002L,0x8000001000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_createUserStatement6956 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_userPassword_in_createUserStatement6958 = new BitSet(new long[]{0x0000000000000002L,0x8000001000000000L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_createUserStatement6972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NOSUPERUSER_in_createUserStatement6978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterUserStatement7023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_K_USER_in_alterUserStatement7025 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000004800000000L});
	public static final BitSet FOLLOW_username_in_alterUserStatement7029 = new BitSet(new long[]{0x0000000000000002L,0x8000001000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterUserStatement7041 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_userPassword_in_alterUserStatement7043 = new BitSet(new long[]{0x0000000000000002L,0x8000001000000000L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_alterUserStatement7057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NOSUPERUSER_in_alterUserStatement7071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropUserStatement7117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_K_USER_in_dropUserStatement7119 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000080L,0x0000004800000000L});
	public static final BitSet FOLLOW_K_IF_in_dropUserStatement7122 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropUserStatement7124 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000004800000000L});
	public static final BitSet FOLLOW_username_in_dropUserStatement7132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listUsersStatement7157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_USERS_in_listUsersStatement7159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createRoleStatement7193 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_ROLE_in_createRoleStatement7195 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_createRoleStatement7198 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createRoleStatement7200 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createRoleStatement7202 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_createRoleStatement7210 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_createRoleStatement7220 = new BitSet(new long[]{0x0000000000000000L,0x8000220008000000L});
	public static final BitSet FOLLOW_roleOptions_in_createRoleStatement7222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterRoleStatement7266 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_ROLE_in_alterRoleStatement7268 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_alterRoleStatement7272 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterRoleStatement7282 = new BitSet(new long[]{0x0000000000000000L,0x8000220008000000L});
	public static final BitSet FOLLOW_roleOptions_in_alterRoleStatement7284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropRoleStatement7328 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_ROLE_in_dropRoleStatement7330 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_dropRoleStatement7333 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropRoleStatement7335 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_dropRoleStatement7343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listRolesStatement7383 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_K_ROLES_in_listRolesStatement7385 = new BitSet(new long[]{0x0000000000000002L,0x0000008800000000L});
	public static final BitSet FOLLOW_K_OF_in_listRolesStatement7395 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_roleName_in_listRolesStatement7397 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_K_NORECURSIVE_in_listRolesStatement7410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleOption_in_roleOptions7441 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_roleOptions7445 = new BitSet(new long[]{0x0000000000000000L,0x8000220008000000L});
	public static final BitSet FOLLOW_roleOption_in_roleOptions7447 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_PASSWORD_in_roleOption7469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_roleOption7471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_roleOption7475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_OPTIONS_in_roleOption7486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_roleOption7488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_mapLiteral_in_roleOption7492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_roleOption7503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_roleOption7505 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BOOLEAN_in_roleOption7509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LOGIN_in_roleOption7520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_roleOption7522 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BOOLEAN_in_roleOption7526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PASSWORD_in_userPassword7548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_userPassword7552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_cident7583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_cident7608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_cident7627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ident7653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_ident7678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_ident7697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_noncol_ident7723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_noncol_ident7748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_noncol_ident7767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_keyspaceName7800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_indexName7834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_182_in_indexName7837 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_idxName_in_indexName7841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_columnFamilyName7873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_182_in_columnFamilyName7876 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_cfName_in_columnFamilyName7880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_noncol_ident_in_userTypeName7905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_182_in_userTypeName7907 = new BitSet(new long[]{0xE1046A0086100000L,0xF4D1F2141DDC3034L,0x0000000800098C80L});
	public static final BitSet FOLLOW_non_type_ident_in_userTypeName7913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleName_in_userOrRoleName7945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ksName7968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_ksName7993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_ksName8012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_ksName8022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_cfName8044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_cfName8069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_cfName8088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_cfName8098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_idxName8120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_idxName8145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_idxName8164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_idxName8174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_roleName8196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_roleName8221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_roleName8237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_roleName8256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_roleName8266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_constant8291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_constant8303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant8322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_constant8343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UUID_in_constant8362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEXNUMBER_in_constant8384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_181_in_constant8402 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000800L});
	public static final BitSet FOLLOW_set_in_constant8411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_194_in_mapLiteral8440 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x000000000000000CL});
	public static final BitSet FOLLOW_term_in_mapLiteral8458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_mapLiteral8460 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_mapLiteral8464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_180_in_mapLiteral8470 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_mapLiteral8474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_mapLiteral8476 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_mapLiteral8480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_195_in_mapLiteral8496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_setOrMapLiteral8520 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral8524 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_setOrMapLiteral8540 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral8544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_setOrMapLiteral8546 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral8550 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_setOrMapLiteral8585 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral8589 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_190_in_collectionLiteral8623 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000005L});
	public static final BitSet FOLLOW_term_in_collectionLiteral8641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_180_in_collectionLiteral8647 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_collectionLiteral8651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_192_in_collectionLiteral8667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_194_in_collectionLiteral8677 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_collectionLiteral8681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0090000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_setOrMapLiteral_in_collectionLiteral8685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_195_in_collectionLiteral8690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_194_in_collectionLiteral8708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_195_in_collectionLiteral8710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_194_in_usertypeLiteral8754 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_usertypeLiteral8758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_usertypeLiteral8760 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_usertypeLiteral8764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_180_in_usertypeLiteral8770 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_usertypeLiteral8774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_usertypeLiteral8776 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_usertypeLiteral8780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_195_in_usertypeLiteral8787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_tupleLiteral8824 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_tupleLiteral8828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_tupleLiteral8834 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_tupleLiteral8838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_tupleLiteral8845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value8868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionLiteral_in_value8890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usertypeLiteral_in_value8903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleLiteral_in_value8918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NULL_in_value8934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_value8958 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_value8962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_value8973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_intValue9019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_intValue9033 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_intValue9037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_intValue9048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyspaceName_in_functionName9082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_182_in_functionName9084 = new BitSet(new long[]{0xE31DEAE286100000L,0xFCD1F2141DD4B435L,0x00000008003D8CDFL});
	public static final BitSet FOLLOW_allowedFunctionName_in_functionName9090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_allowedFunctionName9117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_allowedFunctionName9151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_function_keyword_in_allowedFunctionName9179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TOKEN_in_allowedFunctionName9189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNT_in_allowedFunctionName9221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_function9268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_function9270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_function9272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_function9302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_function9304 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_functionArgs_in_function9308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_function9310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_functionArgs9343 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_functionArgs9349 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_functionArgs9353 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_value_in_term9381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_term9418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_term9450 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_term9454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_term9456 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_term9460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_columnOperation9483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4840000000000000L});
	public static final BitSet FOLLOW_columnOperationDifferentiator_in_columnOperation9485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_columnOperationDifferentiator9504 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_normalColumnOperation_in_columnOperationDifferentiator9506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_190_in_columnOperationDifferentiator9515 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_columnOperationDifferentiator9519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_192_in_columnOperationDifferentiator9521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_collectionColumnOperation_in_columnOperationDifferentiator9523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_182_in_columnOperationDifferentiator9532 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_columnOperationDifferentiator9536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_udtColumnOperation_in_columnOperationDifferentiator9538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_normalColumnOperation9559 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_179_in_normalColumnOperation9562 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation9566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation9587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0028000000000000L});
	public static final BitSet FOLLOW_set_in_normalColumnOperation9591 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_normalColumnOperation9601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation9619 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_INTEGER_in_normalColumnOperation9623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_collectionColumnOperation9649 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_collectionColumnOperation9653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_udtColumnOperation9679 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_udtColumnOperation9683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_columnCondition9716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x7E41000000000000L});
	public static final BitSet FOLLOW_relationType_in_columnCondition9730 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_columnCondition9734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition9748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0082000400000000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition9766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition9786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_190_in_columnCondition9814 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_columnCondition9818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_192_in_columnCondition9820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x3E01000000000000L});
	public static final BitSet FOLLOW_relationType_in_columnCondition9838 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_columnCondition9842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition9860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0082000400000000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition9882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition9906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_182_in_columnCondition9952 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_columnCondition9956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x3E01000000000000L});
	public static final BitSet FOLLOW_relationType_in_columnCondition9974 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_columnCondition9978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition9996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0082000400000000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition10018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition10042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_properties10104 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_properties10108 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_property_in_properties10110 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_noncol_ident_in_property10133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_property10135 = new BitSet(new long[]{0xE31DEEE286244040L,0xFCD1F2161DDCBC35L,0x00200240023D8E9FL});
	public static final BitSet FOLLOW_propertyValue_in_property10139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_noncol_ident_in_property10151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_property10153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_mapLiteral_in_property10157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_propertyValue10182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_propertyValue10204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_relationType10227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_185_in_relationType10238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_186_in_relationType10249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_188_in_relationType10259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_189_in_relationType10270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_176_in_relationType10280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x3E01000000000000L});
	public static final BitSet FOLLOW_relationType_in_relation10306 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_relation10310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10322 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_LIKE_in_relation10324 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_relation10328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_IS_in_relation10342 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_relation10344 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_NULL_in_relation10346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TOKEN_in_relation10356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation10360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x3E01000000000000L});
	public static final BitSet FOLLOW_relationType_in_relation10364 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_relation10368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_IN_in_relation10390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_inMarker_in_relation10394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_IN_in_relation10416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_relation10420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10440 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_K_CONTAINS_in_relation10442 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_K_KEY_in_relation10447 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_relation10463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_190_in_relation10477 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_relation10481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_192_in_relation10483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x3E01000000000000L});
	public static final BitSet FOLLOW_relationType_in_relation10487 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_relation10491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation10503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x3E01000000000000L});
	public static final BitSet FOLLOW_K_IN_in_relation10513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0082000400000000L});
	public static final BitSet FOLLOW_177_in_relation10527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_relation10529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarkerForTuple_in_relation10561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfTupleLiterals_in_relation10595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfMarkersForTuples_in_relation10629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationType_in_relation10671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_tupleLiteral_in_relation10675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationType_in_relation10701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_markerForTuple_in_relation10705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_relation10735 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8EDFL});
	public static final BitSet FOLLOW_relation_in_relation10737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_relation10740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_inMarker10761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_inMarker10771 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_inMarker10775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_tupleOfIdentifiers10807 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers10811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_tupleOfIdentifiers10816 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers10820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_tupleOfIdentifiers10826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_singleColumnInValues10856 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A6024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_singleColumnInValues10864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_singleColumnInValues10869 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_singleColumnInValues10873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_singleColumnInValues10882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_tupleOfTupleLiterals10912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals10916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_tupleOfTupleLiterals10921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals10925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_tupleOfTupleLiterals10931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_markerForTuple10952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_markerForTuple10962 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_markerForTuple10966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_tupleOfMarkersForTuples10998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples11002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_tupleOfMarkersForTuples11007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples11011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_tupleOfMarkersForTuples11017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_inMarkerForTuple11038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_inMarkerForTuple11048 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_inMarkerForTuple11052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_native_type_in_comparatorType11077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collection_type_in_comparatorType11093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_type_in_comparatorType11105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_userTypeName_in_comparatorType11121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROZEN_in_comparatorType11133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_185_in_comparatorType11135 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_comparatorType11139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_comparatorType11141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_comparatorType11159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ASCII_in_native_type11188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BIGINT_in_native_type11202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BLOB_in_native_type11215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BOOLEAN_in_native_type11230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNTER_in_native_type11242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DECIMAL_in_native_type11254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DOUBLE_in_native_type11266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FLOAT_in_native_type11279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INET_in_native_type11293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INT_in_native_type11308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SMALLINT_in_native_type11324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TEXT_in_native_type11335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_native_type11350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TINYINT_in_native_type11360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_UUID_in_native_type11372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VARCHAR_in_native_type11387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VARINT_in_native_type11399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIMEUUID_in_native_type11412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DATE_in_native_type11423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIME_in_native_type11438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MAP_in_collection_type11466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_185_in_collection_type11469 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type11473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_collection_type11475 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type11479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_collection_type11481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_collection_type11499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_185_in_collection_type11501 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type11505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_collection_type11507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SET_in_collection_type11525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_185_in_collection_type11528 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type11532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_collection_type11534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TUPLE_in_tuple_type11565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_185_in_tuple_type11567 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_tuple_type11582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1010000000000000L});
	public static final BitSet FOLLOW_180_in_tuple_type11587 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_tuple_type11591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1010000000000000L});
	public static final BitSet FOLLOW_188_in_tuple_type11603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_username11622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_username11630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_username11638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_mbean11657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_non_type_ident11682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_non_type_ident11713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basic_unreserved_keyword_in_non_type_ident11738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEY_in_non_type_ident11750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_function_keyword_in_unreserved_keyword11793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_unreserved_keyword11809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword11852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_native_type_in_unreserved_function_keyword11864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_basic_unreserved_keyword11902 = new BitSet(new long[]{0x0000000000000002L});
}
