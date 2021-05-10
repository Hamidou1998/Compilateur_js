import node.Operation;
import utils.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class JavaScript/*@bgen(jjtree)*/ implements JavaScriptTreeConstants, JavaScriptConstants {/*@bgen(jjtree)*/


    static private int[] jj_la1_0;
    static private int[] jj_la1_1;
    static private int[] jj_la1_2;
    static private int[] jj_la1_3;
    static private int[] jj_la1_4;
    private static int counter = 0;

    static {
        jj_la1_init_0();
        jj_la1_init_1();
        jj_la1_init_2();
        jj_la1_init_3();
        jj_la1_init_4();
    }

    final private int[] jj_la1 = new int[90];
    final private JJCalls[] jj_2_rtns = new JJCalls[47];
    final private LookaheadSuccess jj_ls = new LookaheadSuccess();
    private final List<int[]> jj_expentries = new ArrayList<int[]>();
    private final int[] jj_lasttokens = new int[100];
   
    public JavaScriptTokenManager token_source;
  
    public Token token;
   
    public Token jj_nt;
    protected JJTJavaScriptState jjtree = new JJTJavaScriptState();
    JavaCharStream jj_input_stream;
    private int jj_ntk;
    private Token jj_scanpos, jj_lastpos;
    private int jj_la;
    private int jj_gen;
    private boolean jj_rescan = false;
    private int jj_gc = 0;
    private int[] jj_expentry;
    private int jj_kind = -1;
    private int jj_endpos;

    public JavaScript(InputStream stream) {
        this(stream, null);
    }

    public JavaScript(InputStream stream, String encoding) {
        try {
            jj_input_stream = new JavaCharStream(stream, encoding, 1, 1);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        token_source = new JavaScriptTokenManager(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 90; i++) jj_la1[i] = -1;
        for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
    }

    public JavaScript(Reader stream) {
        jj_input_stream = new JavaCharStream(stream, 1, 1);
        token_source = new JavaScriptTokenManager(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 90; i++) jj_la1[i] = -1;
        for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
    }

    public JavaScript(JavaScriptTokenManager tm) {
        token_source = tm;
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 90; i++) jj_la1[i] = -1;
        for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
    }
    public static void main(String[] args) {
        Compilateur parser;
        if (args.length == 0) {
            System.out.println("Compilateur :Lecture du fichier system.In .....");
            parser = new Compilateur(System.in);
        } else if (args.length == 1) {
            System.out.println("Compilateur :Lecture du fichier " +args[0]+" .....");
            try {
                parser = new Compilateur(new FileInputStream(args[0]), "UTF-8");
            } catch (FileNotFoundException e) {
                System.out.println("Compilateur :" +args[0]+" not found.....");
                return;
            }
        } else {
            System.out.println("Compilateur :  Usage is one of:");
            System.out.println("         Compilateur  < inputfile");
            System.out.println("ou");
            System.out.println("         Compilateur fichier entrer ");
            return;
        }
        try {
            SimpleNode n = parser.Program();
            System.out.println("Compilateur : Le programme est executer avec succees ...!");
            Main.codeMachine();
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            System.out.println("Compilateur:Erreurs rencontrées lors de l'analyse.....");
        }
    }

    private static void jj_la1_init_0() {
        jj_la1_0 = new int[]{0x0, 0x0, 0xb4900000, 0xb4900000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x10000000, 0x14800000, 0x10000000, 0x0, 0x0, 0xb4900000, 0x0, 0x14800000, 0x10800000, 0x0, 0x0, 0xa0100000, 0xb4900000, 0xa0100000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x2000000, 0x2000000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0xb4900000, 0xb4900000, 0x0, 0x0, 0x0, 0x0, 0x400000, 0x8000000, 0xfddc0000, 0xfddc0000, 0x0, 0x0, 0x0, 0x0, 0x200000, 0xb4900000, 0xb4900000, 0xb4900000, 0xb4900000, 0xb4900000, 0x0, 0x400000, 0x0, 0x0, 0x0, 0x0, 0xfddc0000, 0xfddc0000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0xfddc0000, 0xfddc0000, 0xfddc0000, 0xfddc0000, 0x0, 0x0, 0x0,};
    }

    private static void jj_la1_init_1() {
        jj_la1_1 = new int[]{0x0, 0x4000000, 0x4540000, 0x4d40000, 0x4000000, 0x4000000, 0x0, 0x4000000, 0x4000000, 0x0, 0x540000, 0x540000, 0x540000, 0x1400000, 0x1500000, 0x540000, 0x4000000, 0x540000, 0x540000, 0x0, 0x0, 0x0, 0x540000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x78000000, 0x78000000, 0x78000000, 0x78000000, 0x80000000, 0x80000000, 0x80000000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x540000, 0x540000, 0x0, 0x4000000, 0x4000000, 0x2000000, 0x101, 0x38002, 0x257a103, 0x257a103, 0x4000000, 0x4000000, 0x0, 0x0, 0x0, 0x540000, 0x540000, 0x540000, 0x540000, 0x540000, 0x101, 0x0, 0x4, 0x4, 0x80080, 0x4, 0x257a103, 0x257a103, 0x1000, 0x1008, 0x0, 0x0, 0x0, 0x4000000, 0x257a103, 0x257a103, 0x257a103, 0x257a103, 0x1000000, 0x4000000, 0x0,};
    }

    private static void jj_la1_init_2() {
        jj_la1_2 = new int[]{0x0, 0x0, 0x18198, 0x18198, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x18198, 0x0, 0x0, 0x0, 0x180, 0x180, 0x18198, 0x18198, 0x18198, 0x60, 0x60, 0x18, 0x18, 0xe00, 0xe00, 0x0, 0x0, 0x0, 0x0, 0x7, 0x7, 0x7, 0x1000, 0x1000, 0x4000, 0x4000, 0x2000, 0x2000, 0x20000, 0x20000, 0x40000, 0x40000, 0x80000, 0x80000, 0x18198, 0x18198, 0xffe00000, 0x0, 0x0, 0x0, 0x0, 0x0, 0x18198, 0x18198, 0x0, 0x0, 0x200000, 0x200000, 0x0, 0x18198, 0x18198, 0x18198, 0x18198, 0x18198, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x18198, 0x18198, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x18198, 0x18198, 0x18198, 0x18198, 0x0, 0x0, 0x200000,};
    }

    private static void jj_la1_init_3() {
        jj_la1_3 = new int[]{0x722, 0x0, 0x100722, 0x100722, 0x0, 0x0, 0x100402, 0x0, 0x0, 0x100402, 0x100722, 0x100722, 0x100722, 0x0, 0x0, 0x100722, 0x0, 0x100722, 0x100722, 0x0, 0x0, 0x0, 0x100722, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x1, 0x1, 0x1, 0x1, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x100722, 0x100722, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x100722, 0x100722, 0x0, 0x0, 0x0, 0x0, 0x0, 0x100722, 0x100722, 0x100722, 0x100722, 0x100722, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x100722, 0x100722, 0x0, 0x0, 0x100000, 0x100000, 0x100000, 0x0, 0x100722, 0x100722, 0x100722, 0x100722, 0x0, 0x0, 0x0,};
    }

    private static void jj_la1_init_4() {
        jj_la1_4 = new int[]{0x8, 0x0, 0x8, 0x8, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x8, 0x8, 0x8, 0x0, 0x0, 0x8, 0x0, 0x8, 0x8, 0x0, 0x0, 0x0, 0x8, 0x0, 0x4, 0x4, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x8, 0x8, 0x2, 0x0, 0x0, 0x0, 0x0, 0x0, 0x8, 0x8, 0x0, 0x0, 0x0, 0x0, 0x0, 0x8, 0x8, 0x8, 0x8, 0x8, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x8, 0x8, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x8, 0x8, 0x8, 0x8, 0x0, 0x0, 0x0,};
    }


    private void showOpenBracket(String token) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < counter; i++) {
            stringBuilder.append("\t");
        }
        stringBuilder.append("<").append(token).append(">");
        System.out.println(stringBuilder.toString());
        counter++;
    }

    private void showToken(String token) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < counter; i++) {
            stringBuilder.append("\t");
        }
        stringBuilder.append(token);
        System.out.println(stringBuilder.toString());
    }

    private void showCloseBracket(String token) {
        counter--;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < counter; i++) {
            stringBuilder.append("\t");
        }
        stringBuilder.append("</").append(token).append(">");
        System.out.println(stringBuilder.toString());
    }
    
   /**************** GRAMMAIRE *****************//*

    /* Expression primaire  */
    final public void PrimaryExpression() throws ParseException {
        showOpenBracket("PrimaryExpression");
        if (jj_2_1(2147483647)) {
            ASTThisReference jjtn001 = new ASTThisReference(JJTTHISREFERENCE);
            boolean jjtc001 = true;
            jjtree.openNodeScope(jjtn001);
            jjtreeOpenNodeScope(jjtn001);
            try {
                jj_consume_token(THIS);
            } finally {
                if (jjtc001) {
                    jjtree.closeNodeScope(jjtn001, true);
                    jjtreeCloseNodeScope(jjtn001);
                }
            }
        } else if (jj_2_2(2147483647)) {
            ObjectLiteral();
        } else if (jj_2_3(2147483647)) {
            ASTParenExpression jjtn002 = new ASTParenExpression(JJTPARENEXPRESSION);
            boolean jjtc002 = true;
            jjtree.openNodeScope(jjtn002);
            jjtreeOpenNodeScope(jjtn002);
            try {
                jj_consume_token(LPAREN);
                Expression();
                Main.setExpression(token);
                jj_consume_token(RPAREN);
            } catch (Throwable jjte002) {
                if (jjtc002) {
                    jjtree.clearNodeScope(jjtn002);
                    jjtc002 = false;
                } else {
                    jjtree.popNode();
                }
                if (jjte002 instanceof RuntimeException) {
                    {
                        if (true) throw (RuntimeException) jjte002;
                    }
                }
                if (jjte002 instanceof ParseException) {
                    {
                        if (true) throw (ParseException) jjte002;
                    }
                }
                {
                    if (true) throw (Error) jjte002;
                }
            } finally {
                if (jjtc002) {
                    jjtree.closeNodeScope(jjtn002, true);
                    jjtreeCloseNodeScope(jjtn002);
                }
            }
        } else if (jj_2_4(2147483647)) {
            Identifier();
        } else if (jj_2_5(2147483647)) {
            ArrayLiteral();
        } else if (jj_2_6(2)) {
            Literal();
        } else {
            jj_consume_token(-1);
            throw new ParseException();
        }
        showCloseBracket("PrimaryExpression");
    }
    
     /* Expression Literals */
    final public void Literal() throws ParseException {
        showOpenBracket("Literal");
        /*@bgen(jjtree) Literal */
        ASTLiteral jjtn000 = new ASTLiteral(JJTLITERAL);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        jjtreeOpenNodeScope(jjtn000);
        Token t;
        Map objLiteral;
        List arrayLiteral;
        try {
            switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
                case DECIMAL_LITERAL:
                    t = jj_consume_token(DECIMAL_LITERAL);
                    jjtree.closeNodeScope(jjtn000, true);
                    jjtc000 = false;
                    jjtreeCloseNodeScope(jjtn000);
                    jjtn000.jjtSetValue(t.image);
                    break;
                case HEX_INTEGER_LITERAL:
                    t = jj_consume_token(HEX_INTEGER_LITERAL);
                    jjtree.closeNodeScope(jjtn000, true);
                    jjtc000 = false;
                    jjtreeCloseNodeScope(jjtn000);
                    jjtn000.jjtSetValue(t.image);
                    break;
                case STRING_LITERAL:
                    t = jj_consume_token(STRING_LITERAL);
                    jjtree.closeNodeScope(jjtn000, true);
                    jjtc000 = false;
                    jjtreeCloseNodeScope(jjtn000);
                    jjtn000.jjtSetValue(t.image);
                    break;
                case BOOLEAN_LITERAL:
                    t = jj_consume_token(BOOLEAN_LITERAL);
                    jjtree.closeNodeScope(jjtn000, true);
                    jjtc000 = false;
                    jjtreeCloseNodeScope(jjtn000);
                    jjtn000.jjtSetValue(t.image);
                    break;
                case NULL_LITERAL:
                    t = jj_consume_token(NULL_LITERAL);
                    jjtree.closeNodeScope(jjtn000, true);
                    jjtc000 = false;
                    jjtreeCloseNodeScope(jjtn000);
                    jjtn000.jjtSetValue(null);
                    break;
                case REGULAR_EXPRESSION_LITERAL:
                    t = jj_consume_token(REGULAR_EXPRESSION_LITERAL);
                    jjtree.closeNodeScope(jjtn000, true);
                    jjtc000 = false;
                    jjtreeCloseNodeScope(jjtn000);
                    jjtn000.jjtSetValue(t.image);
                    break;
                default:
                    jj_la1[0] = jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
            }
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
                jjtreeCloseNodeScope(jjtn000);
            }
        }
        showCloseBracket("Literal");
    }

    final public void Identifier() throws ParseException {
        showOpenBracket("Identifier");
        /*@bgen(jjtree) Identifier */
        ASTIdentifier jjtn000 = new ASTIdentifier(JJTIDENTIFIER);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);
        jjtreeOpenNodeScope(jjtn000);
        Token t;
        try {
            t = jj_consume_token(IDENTIFIER_NAME);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            jjtreeCloseNodeScope(jjtn000);
            jjtn000.jjtSetValue(t.image);
        } finally {
            if (jjtc000) {
                jjtree.closeNodeScope(jjtn000, true);
                jjtreeCloseNodeScope(jjtn000);
            }
            showCloseBracket("Identifier");
        }

    }

   
}