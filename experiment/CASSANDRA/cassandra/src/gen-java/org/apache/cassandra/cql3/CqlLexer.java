// $ANTLR 3.5.2 Cql__.g 2017-12-13 11:17:46

    package org.apache.cassandra.cql3;

    import org.apache.cassandra.exceptions.SyntaxException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CqlLexer extends Lexer {
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
	public static final int Tokens=196;

	    List<Token> tokens = new ArrayList<Token>();

	    public void emit(Token token)
	    {
	        state.token = token;
	        tokens.add(token);
	    }

	    public Token nextToken()
	    {
	        super.nextToken();
	        if (tokens.size() == 0)
	            return new CommonToken(Token.EOF);
	        return tokens.remove(0);
	    }

	    private final List<ErrorListener> listeners = new ArrayList<ErrorListener>();

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


	// delegates
	public Cql_Lexer gLexer;
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {gLexer};
	}

	public CqlLexer() {} 
	public CqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
		gLexer = new Cql_Lexer(input, state, this);
	}
	@Override public String getGrammarFileName() { return "Cql__.g"; }

	// $ANTLR start "T__176"
	public final void mT__176() throws RecognitionException {
		try {
			int _type = T__176;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:49:8: ( '!=' )
			// Cql__.g:49:10: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__176"

	// $ANTLR start "T__177"
	public final void mT__177() throws RecognitionException {
		try {
			int _type = T__177;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:50:8: ( '(' )
			// Cql__.g:50:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__177"

	// $ANTLR start "T__178"
	public final void mT__178() throws RecognitionException {
		try {
			int _type = T__178;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:51:8: ( ')' )
			// Cql__.g:51:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__178"

	// $ANTLR start "T__179"
	public final void mT__179() throws RecognitionException {
		try {
			int _type = T__179;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:52:8: ( '+' )
			// Cql__.g:52:10: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__179"

	// $ANTLR start "T__180"
	public final void mT__180() throws RecognitionException {
		try {
			int _type = T__180;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:53:8: ( ',' )
			// Cql__.g:53:10: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__180"

	// $ANTLR start "T__181"
	public final void mT__181() throws RecognitionException {
		try {
			int _type = T__181;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:54:8: ( '-' )
			// Cql__.g:54:10: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__181"

	// $ANTLR start "T__182"
	public final void mT__182() throws RecognitionException {
		try {
			int _type = T__182;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:55:8: ( '.' )
			// Cql__.g:55:10: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__182"

	// $ANTLR start "T__183"
	public final void mT__183() throws RecognitionException {
		try {
			int _type = T__183;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:56:8: ( ':' )
			// Cql__.g:56:10: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__183"

	// $ANTLR start "T__184"
	public final void mT__184() throws RecognitionException {
		try {
			int _type = T__184;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:57:8: ( ';' )
			// Cql__.g:57:10: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__184"

	// $ANTLR start "T__185"
	public final void mT__185() throws RecognitionException {
		try {
			int _type = T__185;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:58:8: ( '<' )
			// Cql__.g:58:10: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__185"

	// $ANTLR start "T__186"
	public final void mT__186() throws RecognitionException {
		try {
			int _type = T__186;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:59:8: ( '<=' )
			// Cql__.g:59:10: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__186"

	// $ANTLR start "T__187"
	public final void mT__187() throws RecognitionException {
		try {
			int _type = T__187;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:60:8: ( '=' )
			// Cql__.g:60:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__187"

	// $ANTLR start "T__188"
	public final void mT__188() throws RecognitionException {
		try {
			int _type = T__188;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:61:8: ( '>' )
			// Cql__.g:61:10: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__188"

	// $ANTLR start "T__189"
	public final void mT__189() throws RecognitionException {
		try {
			int _type = T__189;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:62:8: ( '>=' )
			// Cql__.g:62:10: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__189"

	// $ANTLR start "T__190"
	public final void mT__190() throws RecognitionException {
		try {
			int _type = T__190;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:63:8: ( '[' )
			// Cql__.g:63:10: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__190"

	// $ANTLR start "T__191"
	public final void mT__191() throws RecognitionException {
		try {
			int _type = T__191;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:64:8: ( '\\*' )
			// Cql__.g:64:10: '\\*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__191"

	// $ANTLR start "T__192"
	public final void mT__192() throws RecognitionException {
		try {
			int _type = T__192;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:65:8: ( ']' )
			// Cql__.g:65:10: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__192"

	// $ANTLR start "T__193"
	public final void mT__193() throws RecognitionException {
		try {
			int _type = T__193;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:66:8: ( 'expr(' )
			// Cql__.g:66:10: 'expr('
			{
			match("expr("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__193"

	// $ANTLR start "T__194"
	public final void mT__194() throws RecognitionException {
		try {
			int _type = T__194;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:67:8: ( '{' )
			// Cql__.g:67:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__194"

	// $ANTLR start "T__195"
	public final void mT__195() throws RecognitionException {
		try {
			int _type = T__195;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cql__.g:68:8: ( '}' )
			// Cql__.g:68:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__195"

	@Override
	public void mTokens() throws RecognitionException {
		// Cql__.g:1:8: ( T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | Lexer. Tokens )
		int alt1=21;
		alt1 = dfa1.predict(input);
		switch (alt1) {
			case 1 :
				// Cql__.g:1:10: T__176
				{
				mT__176(); 

				}
				break;
			case 2 :
				// Cql__.g:1:17: T__177
				{
				mT__177(); 

				}
				break;
			case 3 :
				// Cql__.g:1:24: T__178
				{
				mT__178(); 

				}
				break;
			case 4 :
				// Cql__.g:1:31: T__179
				{
				mT__179(); 

				}
				break;
			case 5 :
				// Cql__.g:1:38: T__180
				{
				mT__180(); 

				}
				break;
			case 6 :
				// Cql__.g:1:45: T__181
				{
				mT__181(); 

				}
				break;
			case 7 :
				// Cql__.g:1:52: T__182
				{
				mT__182(); 

				}
				break;
			case 8 :
				// Cql__.g:1:59: T__183
				{
				mT__183(); 

				}
				break;
			case 9 :
				// Cql__.g:1:66: T__184
				{
				mT__184(); 

				}
				break;
			case 10 :
				// Cql__.g:1:73: T__185
				{
				mT__185(); 

				}
				break;
			case 11 :
				// Cql__.g:1:80: T__186
				{
				mT__186(); 

				}
				break;
			case 12 :
				// Cql__.g:1:87: T__187
				{
				mT__187(); 

				}
				break;
			case 13 :
				// Cql__.g:1:94: T__188
				{
				mT__188(); 

				}
				break;
			case 14 :
				// Cql__.g:1:101: T__189
				{
				mT__189(); 

				}
				break;
			case 15 :
				// Cql__.g:1:108: T__190
				{
				mT__190(); 

				}
				break;
			case 16 :
				// Cql__.g:1:115: T__191
				{
				mT__191(); 

				}
				break;
			case 17 :
				// Cql__.g:1:122: T__192
				{
				mT__192(); 

				}
				break;
			case 18 :
				// Cql__.g:1:129: T__193
				{
				mT__193(); 

				}
				break;
			case 19 :
				// Cql__.g:1:136: T__194
				{
				mT__194(); 

				}
				break;
			case 20 :
				// Cql__.g:1:143: T__195
				{
				mT__195(); 

				}
				break;
			case 21 :
				// Cql__.g:1:150: Lexer. Tokens
				{
				gLexer.mTokens(); 

				}
				break;

		}
	}


	protected DFA1 dfa1 = new DFA1(this);
	static final String DFA1_eotS =
		"\6\uffff\1\24\3\uffff\1\26\1\uffff\1\30\3\uffff\1\23\10\uffff\3\23\1\uffff";
	static final String DFA1_eofS =
		"\35\uffff";
	static final String DFA1_minS =
		"\1\11\5\uffff\1\55\3\uffff\1\75\1\uffff\1\75\3\uffff\1\170\10\uffff\1"+
		"\160\1\162\1\50\1\uffff";
	static final String DFA1_maxS =
		"\1\175\5\uffff\1\71\3\uffff\1\75\1\uffff\1\75\3\uffff\1\170\10\uffff\1"+
		"\160\1\162\1\50\1\uffff";
	static final String DFA1_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\11\1\uffff\1\14\1\uffff"+
		"\1\17\1\20\1\21\1\uffff\1\23\1\24\1\25\1\6\1\13\1\12\1\16\1\15\3\uffff"+
		"\1\22";
	static final String DFA1_specialS =
		"\35\uffff}>";
	static final String[] DFA1_transitionS = {
			"\2\23\2\uffff\1\23\22\uffff\1\23\1\1\1\23\1\uffff\1\23\2\uffff\1\23\1"+
			"\2\1\3\1\16\1\4\1\5\1\6\1\7\13\23\1\10\1\11\1\12\1\13\1\14\1\23\1\uffff"+
			"\32\23\1\15\1\uffff\1\17\3\uffff\4\23\1\20\25\23\1\21\1\uffff\1\22",
			"",
			"",
			"",
			"",
			"",
			"\1\23\2\uffff\12\23",
			"",
			"",
			"",
			"\1\25",
			"",
			"\1\27",
			"",
			"",
			"",
			"\1\31",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\32",
			"\1\33",
			"\1\34",
			""
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
			return "1:1: Tokens : ( T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | Lexer. Tokens );";
		}
	}

}
