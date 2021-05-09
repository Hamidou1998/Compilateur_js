import node.Main;
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
    /**
     * Generated utils.Token Manager.
     */
    public JavaScriptTokenManager token_source;
    /**
     * Current token.
     */
    public Token token;
    /**
     * Next token.
     */
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

    /**
     * Constructor with InputStream.
     */
    public JavaScript(InputStream stream) {
        this(stream, null);
    }

    /**
     * Constructor with InputStream and supplied encoding
     */
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

    /**
     * Constructor.
     */
    public JavaScript(Reader stream) {
        jj_input_stream = new JavaCharStream(stream, 1, 1);
        token_source = new JavaScriptTokenManager(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 90; i++) jj_la1[i] = -1;
        for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
    }

    /**
     * Constructor with generated utils.Token Manager.
     */
    public JavaScript(JavaScriptTokenManager tm) {
        token_source = tm;
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 90; i++) jj_la1[i] = -1;
        for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
    }

   
}