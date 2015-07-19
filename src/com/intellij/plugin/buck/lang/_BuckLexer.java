/* The following code was generated by JFlex 1.4.3 on 7/19/15 3:23 AM */

package com.intellij.plugin.buck.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.intellij.plugin.buck.lang.psi.BuckTypes;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;
import java.lang.String;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 7/19/15 3:23 AM from the specification file
 * <tt>/Users/cjlm/Projects/buck_plugin/src/com/intellij/plugin/buck/lang/Buck.flex</tt>
 */
public class _BuckLexer implements FlexLexer, BuckTypes {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int WAITING_VALUE = 2;
  public static final int SINGLE_QUOTE_STRING = 6;
  public static final int YYINITIAL = 0;
  public static final int DOUBLE_QUOTE_STRING = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  0,  0,  0,  0,  0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\2\1\0\1\1\1\2\22\0\1\1\1\0\1\54"+
    "\1\4\3\0\1\53\1\55\1\56\2\0\1\57\3\0\7\41\1\37"+
    "\2\41\1\0\1\60\1\0\1\5\3\0\1\50\3\40\1\47\1\44"+
    "\5\40\1\51\5\40\1\45\1\52\1\43\1\46\5\40\1\55\1\3"+
    "\1\56\1\0\1\17\1\0\1\22\1\24\1\26\1\23\1\7\1\20"+
    "\1\6\1\35\1\21\1\33\1\31\1\13\1\14\1\10\1\15\1\30"+
    "\1\36\1\11\1\27\1\16\1\12\1\34\1\36\1\32\1\25\1\36"+
    "\1\55\1\0\1\56\54\0\1\42\12\0\1\42\4\0\1\42\5\0"+
    "\27\42\1\0\37\42\1\0\u01ca\42\4\0\14\42\16\0\5\42\7\0"+
    "\1\42\1\0\1\42\201\0\5\42\1\0\2\42\2\0\4\42\10\0"+
    "\1\42\1\0\3\42\1\0\1\42\1\0\24\42\1\0\123\42\1\0"+
    "\213\42\10\0\236\42\11\0\46\42\2\0\1\42\7\0\47\42\110\0"+
    "\33\42\5\0\3\42\55\0\53\42\43\0\2\42\1\0\143\42\1\0"+
    "\1\42\17\0\2\42\7\0\2\42\12\0\3\42\2\0\1\42\20\0"+
    "\1\42\1\0\36\42\35\0\131\42\13\0\1\42\30\0\41\42\11\0"+
    "\2\42\4\0\1\42\5\0\26\42\4\0\1\42\11\0\1\42\3\0"+
    "\1\42\27\0\31\42\107\0\1\42\1\0\13\42\127\0\66\42\3\0"+
    "\1\42\22\0\1\42\7\0\12\42\17\0\7\42\1\0\7\42\5\0"+
    "\10\42\2\0\2\42\2\0\26\42\1\0\7\42\1\0\1\42\3\0"+
    "\4\42\3\0\1\42\20\0\1\42\15\0\2\42\1\0\3\42\16\0"+
    "\2\42\23\0\6\42\4\0\2\42\2\0\26\42\1\0\7\42\1\0"+
    "\2\42\1\0\2\42\1\0\2\42\37\0\4\42\1\0\1\42\23\0"+
    "\3\42\20\0\11\42\1\0\3\42\1\0\26\42\1\0\7\42\1\0"+
    "\2\42\1\0\5\42\3\0\1\42\22\0\1\42\17\0\2\42\43\0"+
    "\10\42\2\0\2\42\2\0\26\42\1\0\7\42\1\0\2\42\1\0"+
    "\5\42\3\0\1\42\36\0\2\42\1\0\3\42\17\0\1\42\21\0"+
    "\1\42\1\0\6\42\3\0\3\42\1\0\4\42\3\0\2\42\1\0"+
    "\1\42\1\0\2\42\3\0\2\42\3\0\3\42\3\0\14\42\26\0"+
    "\1\42\64\0\10\42\1\0\3\42\1\0\27\42\1\0\12\42\1\0"+
    "\5\42\3\0\1\42\32\0\2\42\6\0\2\42\43\0\10\42\1\0"+
    "\3\42\1\0\27\42\1\0\12\42\1\0\5\42\3\0\1\42\40\0"+
    "\1\42\1\0\2\42\17\0\2\42\22\0\10\42\1\0\3\42\1\0"+
    "\51\42\2\0\1\42\20\0\1\42\21\0\2\42\30\0\6\42\5\0"+
    "\22\42\3\0\30\42\1\0\11\42\1\0\1\42\2\0\7\42\72\0"+
    "\60\42\1\0\2\42\14\0\7\42\72\0\2\42\1\0\1\42\2\0"+
    "\2\42\1\0\1\42\2\0\1\42\6\0\4\42\1\0\7\42\1\0"+
    "\3\42\1\0\1\42\1\0\1\42\2\0\2\42\1\0\4\42\1\0"+
    "\2\42\11\0\1\42\2\0\5\42\1\0\1\42\25\0\4\42\40\0"+
    "\1\42\77\0\10\42\1\0\44\42\33\0\5\42\163\0\53\42\24\0"+
    "\1\42\20\0\6\42\4\0\4\42\3\0\1\42\3\0\2\42\7\0"+
    "\3\42\4\0\15\42\14\0\1\42\21\0\46\42\1\0\1\42\5\0"+
    "\1\42\2\0\53\42\1\0\u014d\42\1\0\4\42\2\0\7\42\1\0"+
    "\1\42\1\0\4\42\2\0\51\42\1\0\4\42\2\0\41\42\1\0"+
    "\4\42\2\0\7\42\1\0\1\42\1\0\4\42\2\0\17\42\1\0"+
    "\71\42\1\0\4\42\2\0\103\42\45\0\20\42\20\0\125\42\14\0"+
    "\u026c\42\2\0\21\42\1\0\32\42\5\0\113\42\25\0\15\42\1\0"+
    "\4\42\16\0\22\42\16\0\22\42\16\0\15\42\1\0\3\42\17\0"+
    "\64\42\43\0\1\42\4\0\1\42\103\0\130\42\10\0\51\42\1\0"+
    "\1\42\5\0\106\42\12\0\35\42\63\0\36\42\2\0\5\42\13\0"+
    "\54\42\25\0\7\42\70\0\27\42\11\0\65\42\122\0\1\42\135\0"+
    "\57\42\21\0\7\42\67\0\36\42\15\0\2\42\12\0\54\42\32\0"+
    "\44\42\51\0\3\42\12\0\44\42\153\0\4\42\1\0\4\42\3\0"+
    "\2\42\11\0\300\42\100\0\u0116\42\2\0\6\42\2\0\46\42\2\0"+
    "\6\42\2\0\10\42\1\0\1\42\1\0\1\42\1\0\1\42\1\0"+
    "\37\42\2\0\65\42\1\0\7\42\1\0\1\42\3\0\3\42\1\0"+
    "\7\42\3\0\4\42\2\0\6\42\4\0\15\42\5\0\3\42\1\0"+
    "\7\42\164\0\1\42\15\0\1\42\20\0\15\42\145\0\1\42\4\0"+
    "\1\42\2\0\12\42\1\0\1\42\3\0\5\42\6\0\1\42\1\0"+
    "\1\42\1\0\1\42\1\0\4\42\1\0\13\42\2\0\4\42\5\0"+
    "\5\42\4\0\1\42\64\0\2\42\u0a7b\0\57\42\1\0\57\42\1\0"+
    "\205\42\6\0\4\42\3\0\2\42\14\0\46\42\1\0\1\42\5\0"+
    "\1\42\2\0\70\42\7\0\1\42\20\0\27\42\11\0\7\42\1\0"+
    "\7\42\1\0\7\42\1\0\7\42\1\0\7\42\1\0\7\42\1\0"+
    "\7\42\1\0\7\42\120\0\1\42\u01d5\0\2\42\52\0\5\42\5\0"+
    "\2\42\4\0\126\42\6\0\3\42\1\0\132\42\1\0\4\42\5\0"+
    "\51\42\3\0\136\42\21\0\33\42\65\0\20\42\u0200\0\u19b6\42\112\0"+
    "\u51cd\42\63\0\u048d\42\103\0\56\42\2\0\u010d\42\3\0\20\42\12\0"+
    "\2\42\24\0\57\42\20\0\31\42\10\0\106\42\61\0\11\42\2\0"+
    "\147\42\2\0\4\42\1\0\4\42\14\0\13\42\115\0\12\42\1\0"+
    "\3\42\1\0\4\42\1\0\27\42\35\0\64\42\16\0\62\42\76\0"+
    "\6\42\3\0\1\42\16\0\34\42\12\0\27\42\31\0\35\42\7\0"+
    "\57\42\34\0\1\42\60\0\51\42\27\0\3\42\1\0\10\42\24\0"+
    "\27\42\3\0\1\42\5\0\60\42\1\0\1\42\3\0\2\42\2\0"+
    "\5\42\2\0\1\42\1\0\1\42\30\0\3\42\2\0\13\42\7\0"+
    "\3\42\14\0\6\42\2\0\6\42\2\0\6\42\11\0\7\42\1\0"+
    "\7\42\221\0\43\42\35\0\u2ba4\42\14\0\27\42\4\0\61\42\u2104\0"+
    "\u016e\42\2\0\152\42\46\0\7\42\14\0\5\42\5\0\1\42\1\0"+
    "\12\42\1\0\15\42\1\0\5\42\1\0\1\42\1\0\2\42\1\0"+
    "\2\42\1\0\154\42\41\0\u016b\42\22\0\100\42\2\0\66\42\50\0"+
    "\14\42\164\0\5\42\1\0\207\42\44\0\32\42\6\0\32\42\13\0"+
    "\131\42\3\0\6\42\2\0\6\42\2\0\6\42\2\0\3\42\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\7\1\1\5\12\1"+
    "\2\5\1\1\2\5\2\6\1\7\1\10\1\11\1\12"+
    "\40\1\1\0\4\5\5\6\10\1\1\13\12\1\1\13"+
    "\22\1\1\0\1\5\1\0\2\5\2\0\2\1\1\14"+
    "\11\1\1\15\24\1\1\0\1\15\2\0\37\1\3\0"+
    "\16\1\1\14\15\1\1\0\24\1\1\13\3\1\1\0"+
    "\24\1\1\0\15\1\1\13\11\1\1\0\25\1\1\0"+
    "\17\1\1\0\13\1\1\0\11\1\1\0\10\1\1\0"+
    "\3\1\1\0\2\1\1\0\2\1\1\14\5\1";

  private static int [] zzUnpackAction() {
    int [] result = new int[375];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\223\0\61\0\304\0\365\0\u0126"+
    "\0\u0157\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae"+
    "\0\u02df\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4\0\u0405\0\u0436"+
    "\0\u0467\0\u0498\0\u04c9\0\u04fa\0\u052b\0\u055c\0\61\0\61"+
    "\0\61\0\61\0\u058d\0\u05be\0\u05ef\0\u0620\0\u0651\0\u0682"+
    "\0\u06b3\0\u06e4\0\u0715\0\u0746\0\u0777\0\u07a8\0\u07d9\0\u080a"+
    "\0\u083b\0\u086c\0\u089d\0\u08ce\0\u08ff\0\u0930\0\u0961\0\u0992"+
    "\0\u09c3\0\u09f4\0\u0a25\0\u0a56\0\u0a87\0\u0ab8\0\u0ae9\0\u0b1a"+
    "\0\u0b4b\0\u0b7c\0\u0bad\0\u0bde\0\u0c0f\0\u0c40\0\u0c71\0\u0ca2"+
    "\0\61\0\u0cd3\0\u0d04\0\u0d35\0\u0d66\0\u0d97\0\u0dc8\0\u0df9"+
    "\0\u0e2a\0\u0e5b\0\u0e8c\0\u0ebd\0\u0eee\0\u0f1f\0\u0f50\0\u0f81"+
    "\0\u0fb2\0\u0fe3\0\u1014\0\u1045\0\u1076\0\u10a7\0\u10d8\0\u0188"+
    "\0\u1109\0\u113a\0\u116b\0\u119c\0\u11cd\0\u11fe\0\u122f\0\u1260"+
    "\0\u1291\0\u12c2\0\u12f3\0\u1324\0\u1355\0\u1386\0\u13b7\0\u13e8"+
    "\0\u1419\0\u144a\0\u147b\0\u14ac\0\u14dd\0\u150e\0\u153f\0\u1570"+
    "\0\u15a1\0\u15d2\0\u1603\0\u0188\0\u1634\0\u1665\0\u1696\0\u16c7"+
    "\0\u16f8\0\u1729\0\u175a\0\u178b\0\u17bc\0\u0188\0\u17ed\0\u181e"+
    "\0\u184f\0\u1880\0\u18b1\0\u18e2\0\u1913\0\u1944\0\u1975\0\u19a6"+
    "\0\u19d7\0\u1a08\0\u1a39\0\u1a6a\0\u1a9b\0\u1acc\0\u1afd\0\u1b2e"+
    "\0\u1b5f\0\u1b90\0\u1bc1\0\u0467\0\u1bf2\0\u1c23\0\u1c54\0\u1c85"+
    "\0\u1cb6\0\u1ce7\0\u1d18\0\u1d49\0\u1d7a\0\u1dab\0\u1ddc\0\u1e0d"+
    "\0\u1e3e\0\u1e6f\0\u1ea0\0\u1ed1\0\u1f02\0\u1f33\0\u1f64\0\u1f95"+
    "\0\u1fc6\0\u1ff7\0\u2028\0\u2059\0\u208a\0\u20bb\0\u20ec\0\u211d"+
    "\0\u214e\0\u217f\0\u21b0\0\u21e1\0\u2212\0\u2243\0\u2274\0\u22a5"+
    "\0\u22d6\0\u2307\0\u2338\0\u2369\0\u239a\0\u23cb\0\u23fc\0\u242d"+
    "\0\u245e\0\u248f\0\u24c0\0\u24f1\0\u2522\0\u2553\0\u0498\0\u2584"+
    "\0\u25b5\0\u25e6\0\u2617\0\u2648\0\u2679\0\u26aa\0\u26db\0\u270c"+
    "\0\u273d\0\u276e\0\u279f\0\u27d0\0\u2801\0\u2832\0\u2863\0\u2894"+
    "\0\u28c5\0\u28f6\0\u2927\0\u2958\0\u2989\0\u29ba\0\u29eb\0\u2a1c"+
    "\0\u2a4d\0\u2a7e\0\u2aaf\0\u2ae0\0\u2b11\0\u2b42\0\u2b73\0\u2ba4"+
    "\0\u2bd5\0\u2c06\0\u2c37\0\u2c68\0\u2c99\0\u2cca\0\u2cfb\0\u2d2c"+
    "\0\u2d5d\0\u2d8e\0\u2dbf\0\u2df0\0\u2e21\0\u2e52\0\u2e83\0\u2eb4"+
    "\0\u2ee5\0\u2f16\0\u2f47\0\u2f78\0\u2fa9\0\u2fda\0\u300b\0\u303c"+
    "\0\u306d\0\u309e\0\u30cf\0\u3100\0\u3131\0\u3162\0\u3193\0\u31c4"+
    "\0\u31f5\0\u3226\0\u3257\0\u3288\0\u32b9\0\u32ea\0\u331b\0\u334c"+
    "\0\u0498\0\u337d\0\u33ae\0\u33df\0\u3410\0\u3441\0\u3472\0\u34a3"+
    "\0\u34d4\0\u3505\0\u3536\0\u3567\0\u3598\0\u35c9\0\u35fa\0\u362b"+
    "\0\u365c\0\u368d\0\u36be\0\u36ef\0\u3720\0\u3751\0\u3782\0\u37b3"+
    "\0\u37e4\0\u3815\0\u3846\0\u3877\0\u38a8\0\u38d9\0\u390a\0\u393b"+
    "\0\u396c\0\u399d\0\u39ce\0\u39ff\0\u3a30\0\u3a61\0\u3a92\0\u3ac3"+
    "\0\u3af4\0\u3b25\0\u3b56\0\u3b87\0\u3bb8\0\u3be9\0\u3c1a\0\u3c4b"+
    "\0\u3c7c\0\u3cad\0\u3cde\0\u3d0f\0\u3d40\0\u3d71\0\u3da2\0\u3dd3"+
    "\0\u3e04\0\u3e35\0\u3e66\0\u3e97\0\u3ec8\0\u3ef9\0\u3f2a\0\u3f5b"+
    "\0\u3f8c\0\u3fbd\0\u3fee\0\u401f\0\u4050\0\u4081\0\u40b2\0\u40e3"+
    "\0\u4114\0\u4145\0\u4176\0\u41a7\0\u41d8\0\u4209\0\u423a\0\u426b"+
    "\0\u429c\0\u42cd\0\u42fe\0\u432f\0\u4360\0\u4391\0\u43c2\0\u43f3"+
    "\0\u4424\0\61\0\u4455\0\u4486\0\u44b7\0\u44e8\0\u4519";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[375];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\2\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\2\12\1\13\1\12\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\12\1\23\1\24\1\25\2\12"+
    "\1\26\1\27\2\12\1\30\1\31\1\30\1\32\1\33"+
    "\1\34\6\31\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\62\0\2\3\56\0\2\4\1\0\56\4\6\0\1\12"+
    "\1\43\3\12\1\44\3\12\1\45\22\12\1\32\10\12"+
    "\14\0\11\12\1\45\12\12\1\46\7\12\1\32\10\12"+
    "\14\0\11\12\1\45\2\12\1\47\1\50\16\12\1\32"+
    "\10\12\14\0\1\12\1\51\5\12\1\52\1\12\1\45"+
    "\22\12\1\32\10\12\14\0\11\12\1\45\22\12\1\32"+
    "\10\12\14\0\11\12\1\45\2\12\1\53\17\12\1\32"+
    "\10\12\14\0\1\12\1\54\1\12\1\55\5\12\1\45"+
    "\22\12\1\32\10\12\14\0\11\32\1\15\17\32\3\15"+
    "\1\32\10\15\14\0\11\12\1\45\2\12\1\56\17\12"+
    "\1\32\10\12\14\0\2\12\1\57\3\12\1\60\2\12"+
    "\1\45\22\12\1\32\10\12\14\0\2\12\1\61\6\12"+
    "\1\45\1\12\1\62\1\63\4\12\1\64\1\65\11\12"+
    "\1\32\10\12\14\0\1\12\1\66\7\12\1\67\22\12"+
    "\1\32\10\12\14\0\11\12\1\45\1\12\1\70\20\12"+
    "\1\32\10\12\14\0\7\12\1\71\1\12\1\45\12\12"+
    "\1\72\7\12\1\32\10\12\14\0\3\12\1\73\3\12"+
    "\1\74\1\75\1\45\22\12\1\32\10\12\14\0\3\12"+
    "\1\76\5\12\1\45\2\12\1\77\2\12\1\100\14\12"+
    "\1\32\10\12\14\0\11\12\1\45\2\12\1\101\17\12"+
    "\1\32\10\12\14\0\11\12\1\45\1\12\1\102\20\12"+
    "\1\32\10\12\14\0\11\103\1\104\17\103\3\30\1\0"+
    "\10\30\14\0\11\12\1\105\17\12\3\31\1\32\10\31"+
    "\14\0\45\32\14\0\3\12\1\55\5\12\1\105\17\12"+
    "\3\31\1\32\2\31\1\106\5\31\14\0\11\12\1\105"+
    "\2\12\1\56\14\12\3\31\1\32\5\31\1\107\2\31"+
    "\6\0\3\110\1\111\47\110\1\112\5\110\3\113\1\111"+
    "\50\113\1\114\4\113\6\0\2\12\1\115\6\12\1\45"+
    "\22\12\1\32\10\12\14\0\7\12\1\116\1\12\1\45"+
    "\22\12\1\32\10\12\14\0\14\32\1\117\30\32\14\0"+
    "\11\12\1\45\6\12\1\120\1\12\1\121\11\12\1\32"+
    "\10\12\14\0\6\12\1\122\2\12\1\45\22\12\1\32"+
    "\10\12\14\0\11\12\1\45\11\12\1\123\10\12\1\32"+
    "\10\12\14\0\6\12\1\124\2\12\1\45\7\12\1\125"+
    "\12\12\1\32\10\12\14\0\11\12\1\45\4\12\1\126"+
    "\15\12\1\32\10\12\14\0\2\12\1\127\6\12\1\45"+
    "\1\12\1\130\20\12\1\32\10\12\14\0\11\12\1\45"+
    "\7\12\1\131\12\12\1\32\10\12\14\0\4\12\1\132"+
    "\4\12\1\45\22\12\1\32\10\12\14\0\5\12\1\133"+
    "\3\12\1\45\22\12\1\32\10\12\14\0\11\12\1\45"+
    "\6\12\1\134\13\12\1\32\10\12\14\0\11\12\1\45"+
    "\10\12\1\135\11\12\1\32\10\12\14\0\11\12\1\45"+
    "\3\12\1\136\16\12\1\32\10\12\14\0\11\12\1\45"+
    "\3\12\1\137\16\12\1\32\10\12\14\0\3\12\1\140"+
    "\5\12\1\45\22\12\1\32\10\12\14\0\11\12\1\45"+
    "\7\12\1\141\12\12\1\32\10\12\14\0\11\12\1\45"+
    "\11\12\1\142\10\12\1\32\10\12\14\0\11\12\1\45"+
    "\10\12\1\143\11\12\1\32\10\12\14\0\5\32\1\144"+
    "\2\32\1\145\3\32\1\117\1\32\1\146\26\32\14\0"+
    "\2\12\1\147\6\12\1\45\22\12\1\32\10\12\14\0"+
    "\2\12\1\150\6\12\1\45\22\12\1\32\10\12\14\0"+
    "\11\12\1\45\12\12\1\151\7\12\1\32\10\12\14\0"+
    "\11\12\1\45\6\12\1\152\13\12\1\32\10\12\14\0"+
    "\4\12\1\153\4\12\1\45\22\12\1\32\10\12\14\0"+
    "\7\12\1\154\1\12\1\45\22\12\1\32\10\12\14\0"+
    "\1\12\1\155\5\12\1\156\1\12\1\45\22\12\1\32"+
    "\10\12\14\0\11\12\1\45\6\12\1\157\13\12\1\32"+
    "\10\12\14\0\10\12\1\160\1\45\22\12\1\32\10\12"+
    "\14\0\11\12\1\45\14\12\1\161\5\12\1\32\10\12"+
    "\14\0\11\12\1\45\7\12\1\162\12\12\1\32\10\12"+
    "\14\0\11\103\1\163\22\103\1\0\10\103\25\0\1\164"+
    "\2\0\1\165\14\0\3\164\1\0\10\164\14\0\11\32"+
    "\1\15\2\32\1\117\14\32\3\15\1\32\10\15\14\0"+
    "\11\12\1\105\17\12\3\31\1\32\3\31\1\166\4\31"+
    "\14\0\11\12\1\105\17\12\3\31\1\32\6\31\1\167"+
    "\1\31\6\0\3\110\1\111\47\110\1\111\5\110\53\0"+
    "\1\170\5\0\3\113\1\111\50\113\1\111\4\113\54\0"+
    "\1\171\12\0\3\12\1\172\5\12\1\173\22\12\1\32"+
    "\10\12\14\0\11\12\1\45\4\12\1\174\15\12\1\32"+
    "\10\12\14\0\2\32\1\175\42\32\14\0\5\12\1\176"+
    "\3\12\1\45\22\12\1\32\10\12\14\0\7\12\1\177"+
    "\1\12\1\45\22\12\1\32\10\12\14\0\1\12\1\140"+
    "\7\12\1\45\22\12\1\32\10\12\14\0\11\12\1\200"+
    "\22\12\1\32\10\12\14\0\7\12\1\201\1\12\1\45"+
    "\22\12\1\32\10\12\14\0\7\12\1\202\1\12\1\45"+
    "\22\12\1\32\10\12\14\0\7\12\1\203\1\12\1\45"+
    "\22\12\1\32\10\12\14\0\11\12\1\45\1\12\1\204"+
    "\20\12\1\32\10\12\14\0\2\12\1\140\6\12\1\45"+
    "\22\12\1\32\10\12\14\0\10\12\1\205\1\45\22\12"+
    "\1\32\10\12\14\0\1\12\1\206\7\12\1\45\22\12"+
    "\1\32\10\12\14\0\11\12\1\45\7\12\1\132\12\12"+
    "\1\32\10\12\14\0\5\12\1\207\3\12\1\45\22\12"+
    "\1\32\10\12\14\0\7\12\1\210\1\12\1\45\22\12"+
    "\1\32\10\12\14\0\3\12\1\211\5\12\1\45\22\12"+
    "\1\32\10\12\14\0\5\12\1\140\3\12\1\45\22\12"+
    "\1\32\10\12\14\0\1\12\1\212\7\12\1\45\22\12"+
    "\1\32\10\12\14\0\11\12\1\213\22\12\1\32\10\12"+
    "\14\0\11\12\1\45\7\12\1\140\12\12\1\32\10\12"+
    "\14\0\13\32\1\214\31\32\14\0\1\32\1\215\43\32"+
    "\14\0\13\32\1\216\31\32\14\0\11\12\1\45\2\12"+
    "\1\217\17\12\1\32\10\12\14\0\10\12\1\220\1\45"+
    "\22\12\1\32\10\12\14\0\11\12\1\67\22\12\1\32"+
    "\10\12\14\0\11\12\1\221\7\12\1\140\12\12\1\32"+
    "\10\12\14\0\3\12\1\222\5\12\1\45\22\12\1\32"+
    "\10\12\14\0\3\12\1\122\5\12\1\45\22\12\1\32"+
    "\10\12\14\0\11\12\1\45\4\12\1\223\15\12\1\32"+
    "\10\12\14\0\1\224\10\12\1\45\10\12\1\225\2\12"+
    "\1\226\6\12\1\32\10\12\14\0\11\12\1\45\11\12"+
    "\1\227\10\12\1\32\10\12\14\0\11\12\1\45\15\12"+
    "\1\230\4\12\1\32\10\12\14\0\11\12\1\45\2\12"+
    "\1\231\17\12\1\32\10\12\14\0\11\12\1\45\1\12"+
    "\1\232\20\12\1\32\10\12\30\0\1\165\55\0\1\164"+
    "\17\0\3\164\1\0\10\164\16\0\1\233\56\0\11\12"+
    "\1\105\17\12\3\31\1\32\4\31\1\234\3\31\14\0"+
    "\11\12\1\105\17\12\3\31\1\32\7\31\1\166\6\0"+
    "\53\170\1\235\5\170\54\171\1\236\4\171\6\0\4\12"+
    "\1\237\4\12\1\45\22\12\1\32\10\12\14\0\14\32"+
    "\1\240\30\32\14\0\15\32\1\241\27\32\14\0\4\12"+
    "\1\242\4\12\1\45\22\12\1\32\10\12\14\0\3\12"+
    "\1\243\5\12\1\45\22\12\1\32\10\12\14\0\5\32"+
    "\1\144\6\32\1\117\30\32\14\0\10\12\1\244\1\45"+
    "\22\12\1\32\10\12\14\0\4\12\1\245\4\12\1\45"+
    "\22\12\1\32\10\12\14\0\5\12\1\246\3\12\1\45"+
    "\22\12\1\32\10\12\14\0\11\12\1\45\1\247\21\12"+
    "\1\32\10\12\14\0\11\12\1\250\22\12\1\32\10\12"+
    "\14\0\4\12\1\251\4\12\1\45\22\12\1\32\10\12"+
    "\14\0\3\12\1\252\5\12\1\45\22\12\1\32\10\12"+
    "\14\0\7\12\1\253\1\12\1\45\22\12\1\32\10\12"+
    "\14\0\10\12\1\143\1\45\22\12\1\32\10\12\14\0"+
    "\1\254\13\32\1\117\30\32\14\0\16\32\1\255\26\32"+
    "\14\0\21\32\1\256\23\32\14\0\2\32\1\257\42\32"+
    "\14\0\3\12\1\260\5\12\1\45\22\12\1\32\10\12"+
    "\14\0\11\12\1\45\2\12\1\261\17\12\1\32\10\12"+
    "\14\0\3\32\1\262\4\32\1\263\3\32\1\117\30\32"+
    "\14\0\11\12\1\45\6\12\1\264\13\12\1\32\10\12"+
    "\14\0\4\12\1\265\4\12\1\45\22\12\1\32\10\12"+
    "\14\0\4\12\1\266\4\12\1\45\22\12\1\32\10\12"+
    "\14\0\1\12\1\267\7\12\1\45\22\12\1\32\10\12"+
    "\14\0\1\12\1\270\7\12\1\45\22\12\1\32\10\12"+
    "\14\0\11\12\1\45\2\12\1\271\17\12\1\32\10\12"+
    "\14\0\7\12\1\272\1\12\1\45\22\12\1\32\10\12"+
    "\14\0\11\12\1\67\3\12\1\273\13\12\1\274\2\12"+
    "\1\32\10\12\14\0\11\12\1\45\4\12\1\275\15\12"+
    "\1\32\10\12\31\0\1\276\35\0\53\170\1\277\5\170"+
    "\54\171\1\300\4\171\6\0\5\12\1\301\3\12\1\45"+
    "\22\12\1\32\10\12\14\0\2\32\1\175\10\32\1\302"+
    "\31\32\14\0\3\32\1\303\41\32\14\0\11\12\1\45"+
    "\3\12\1\304\16\12\1\32\10\12\14\0\10\12\1\305"+
    "\1\45\22\12\1\32\10\12\14\0\1\12\1\306\7\12"+
    "\1\45\22\12\1\32\10\12\14\0\3\12\1\307\5\12"+
    "\1\45\22\12\1\32\10\12\14\0\1\12\1\310\7\12"+
    "\1\45\22\12\1\32\10\12\14\0\1\12\1\311\7\12"+
    "\1\45\22\12\1\32\10\12\14\0\5\32\1\312\6\32"+
    "\1\117\30\32\14\0\11\12\1\45\3\12\1\313\16\12"+
    "\1\32\10\12\14\0\10\12\1\314\1\45\22\12\1\32"+
    "\10\12\14\0\11\12\1\45\1\12\1\315\20\12\1\32"+
    "\10\12\14\0\1\32\1\316\43\32\14\0\3\32\1\257"+
    "\41\32\14\0\10\32\1\317\34\32\14\0\14\32\1\320"+
    "\30\32\14\0\11\12\1\45\5\12\1\321\14\12\1\32"+
    "\10\12\14\0\11\12\1\45\6\12\1\212\13\12\1\32"+
    "\10\12\14\0\7\32\1\322\35\32\14\0\14\32\1\323"+
    "\30\32\14\0\1\12\1\324\7\12\1\45\22\12\1\32"+
    "\10\12\14\0\11\12\1\45\1\12\1\325\20\12\1\32"+
    "\10\12\14\0\11\12\1\45\2\12\1\326\17\12\1\32"+
    "\10\12\14\0\3\12\1\327\5\12\1\45\22\12\1\32"+
    "\10\12\14\0\11\12\1\45\6\12\1\330\13\12\1\32"+
    "\10\12\14\0\1\331\10\12\1\45\22\12\1\32\10\12"+
    "\14\0\2\12\1\151\6\12\1\45\22\12\1\32\10\12"+
    "\14\0\7\12\1\332\1\12\1\45\22\12\1\32\10\12"+
    "\14\0\11\12\1\333\22\12\1\32\10\12\14\0\11\12"+
    "\1\45\1\12\1\334\20\12\1\32\10\12\17\0\1\335"+
    "\47\0\53\170\1\111\5\170\54\171\1\111\4\171\6\0"+
    "\1\12\1\174\7\12\1\45\22\12\1\32\10\12\14\0"+
    "\15\32\1\336\27\32\14\0\7\32\1\337\35\32\14\0"+
    "\1\12\1\143\7\12\1\45\22\12\1\32\10\12\14\0"+
    "\1\12\1\340\7\12\1\45\22\12\1\32\10\12\14\0"+
    "\11\12\1\341\22\12\1\32\10\12\14\0\11\12\1\45"+
    "\6\12\1\304\13\12\1\32\10\12\14\0\11\12\1\45"+
    "\6\12\1\342\13\12\1\32\10\12\14\0\11\12\1\45"+
    "\7\12\1\343\12\12\1\32\10\12\14\0\13\32\1\344"+
    "\31\32\14\0\1\12\1\345\7\12\1\45\22\12\1\32"+
    "\10\12\14\0\11\12\1\346\22\12\1\32\10\12\14\0"+
    "\11\12\1\45\3\12\1\347\16\12\1\32\10\12\14\0"+
    "\2\32\1\350\42\32\14\0\3\32\1\351\41\32\14\0"+
    "\11\12\1\352\22\12\1\32\10\12\14\0\7\32\1\353"+
    "\35\32\14\0\3\32\1\354\41\32\14\0\11\12\1\355"+
    "\22\12\1\32\10\12\14\0\5\12\1\356\3\12\1\45"+
    "\22\12\1\32\10\12\14\0\3\12\1\357\5\12\1\45"+
    "\22\12\1\32\10\12\14\0\10\12\1\360\1\45\22\12"+
    "\1\32\10\12\14\0\10\12\1\361\1\45\22\12\1\32"+
    "\10\12\14\0\1\12\1\362\7\12\1\45\22\12\1\32"+
    "\10\12\14\0\11\12\1\45\6\12\1\363\13\12\1\32"+
    "\10\12\14\0\14\32\1\117\4\32\1\364\23\32\14\0"+
    "\5\12\1\365\3\12\1\45\22\12\1\32\10\12\23\0"+
    "\1\366\51\0\5\32\1\317\37\32\14\0\13\32\1\367"+
    "\31\32\14\0\11\12\1\45\3\12\1\370\16\12\1\32"+
    "\10\12\14\0\12\32\1\371\1\32\1\117\30\32\14\0"+
    "\10\12\1\372\1\45\22\12\1\32\10\12\14\0\10\12"+
    "\1\140\1\45\22\12\1\32\10\12\14\0\16\32\1\373"+
    "\26\32\14\0\11\12\1\374\22\12\1\32\10\12\14\0"+
    "\14\32\1\117\5\32\1\375\22\32\14\0\11\12\1\376"+
    "\22\12\1\32\10\12\14\0\3\32\1\377\41\32\14\0"+
    "\17\32\1\317\25\32\14\0\14\32\1\117\10\32\1\u0100"+
    "\17\32\14\0\10\32\1\u0101\34\32\14\0\1\u0102\44\32"+
    "\14\0\4\32\1\u0103\7\32\1\117\10\32\1\u0100\17\32"+
    "\14\0\10\12\1\u0104\1\45\22\12\1\32\10\12\14\0"+
    "\11\12\1\45\3\12\1\u0105\16\12\1\32\10\12\14\0"+
    "\11\12\1\45\1\12\1\304\20\12\1\32\10\12\14\0"+
    "\11\12\1\u0106\22\12\1\32\10\12\14\0\11\12\1\u0107"+
    "\22\12\1\32\10\12\14\0\11\12\1\u0108\22\12\1\32"+
    "\10\12\14\0\4\32\1\u0109\40\32\14\0\11\12\1\45"+
    "\1\12\1\u010a\20\12\1\32\10\12\27\0\1\u010b\45\0"+
    "\15\32\1\u010c\27\32\14\0\11\12\1\u010d\22\12\1\32"+
    "\10\12\14\0\13\32\1\u010e\31\32\14\0\3\12\1\u010f"+
    "\5\12\1\45\22\12\1\32\10\12\14\0\3\32\1\u0110"+
    "\41\32\14\0\14\32\1\117\1\u0111\27\32\14\0\14\32"+
    "\1\u0112\30\32\14\0\3\32\1\u0113\1\32\1\144\1\u0114"+
    "\5\32\1\u0115\1\32\1\u0116\3\32\1\u0117\22\32\14\0"+
    "\4\32\1\u010e\40\32\14\0\14\32\1\u0118\30\32\14\0"+
    "\21\32\1\u0119\23\32\14\0\1\32\1\u011a\43\32\14\0"+
    "\2\32\1\u011b\42\32\14\0\11\12\1\u011c\22\12\1\32"+
    "\10\12\14\0\11\12\1\u011d\22\12\1\32\10\12\14\0"+
    "\14\32\1\117\3\32\1\u011e\24\32\14\0\10\32\1\u011f"+
    "\3\32\1\117\30\32\14\0\4\32\1\u0120\7\32\1\117"+
    "\30\32\14\0\22\32\1\u0121\22\32\14\0\10\12\1\u0122"+
    "\1\45\22\12\1\32\10\12\31\0\1\u0123\43\0\11\32"+
    "\1\u0124\33\32\14\0\14\32\1\117\1\u0125\27\32\14\0"+
    "\5\32\1\u0126\37\32\14\0\11\12\1\45\1\12\1\u0127"+
    "\20\12\1\32\10\12\14\0\14\32\1\u0128\30\32\14\0"+
    "\1\32\1\u0129\43\32\14\0\10\32\1\u012a\34\32\14\0"+
    "\1\32\1\u012b\43\32\14\0\14\32\1\u012c\30\32\14\0"+
    "\2\32\1\175\11\32\1\u012d\30\32\14\0\4\32\1\u012e"+
    "\6\32\1\216\31\32\14\0\3\32\1\u012f\41\32\14\0"+
    "\3\32\1\u0119\41\32\14\0\10\32\1\u0119\34\32\14\0"+
    "\15\32\1\u0130\27\32\14\0\2\32\1\u0131\11\32\1\117"+
    "\5\32\1\u0132\2\32\1\u0133\17\32\14\0\14\32\1\117"+
    "\3\32\1\u0134\24\32\14\0\7\32\1\u0135\35\32\14\0"+
    "\17\32\1\u0136\25\32\14\0\3\32\1\u0137\41\32\14\0"+
    "\22\32\1\u0138\22\32\14\0\11\12\1\45\5\12\1\140"+
    "\14\12\1\32\10\12\25\0\1\u0139\47\0\5\32\1\144"+
    "\37\32\14\0\1\32\1\u013a\43\32\14\0\1\32\1\317"+
    "\43\32\14\0\11\12\1\45\6\12\1\u013b\13\12\1\32"+
    "\10\12\14\0\3\32\1\u013c\41\32\14\0\12\32\1\u013d"+
    "\32\32\14\0\27\32\1\u0119\15\32\14\0\21\32\1\u013e"+
    "\23\32\14\0\2\32\1\u013f\42\32\14\0\3\32\1\317"+
    "\41\32\14\0\13\32\1\u0140\31\32\14\0\1\32\1\u0141"+
    "\43\32\14\0\1\32\1\u0142\43\32\14\0\14\32\1\u0143"+
    "\30\32\14\0\17\32\1\u0144\25\32\14\0\14\32\1\u012d"+
    "\30\32\14\0\7\32\1\u0145\35\32\14\0\2\32\1\u0146"+
    "\42\32\14\0\22\32\1\u0147\22\32\14\0\5\32\1\u0119"+
    "\37\32\14\0\7\32\1\u0148\35\32\21\0\1\u0149\53\0"+
    "\22\32\1\u0101\22\32\14\0\11\12\1\u014a\22\12\1\32"+
    "\10\12\14\0\17\32\1\u014b\25\32\14\0\21\32\1\317"+
    "\23\32\14\0\7\32\1\u014c\35\32\14\0\13\32\1\u014d"+
    "\31\32\14\0\5\32\1\u014e\37\32\14\0\16\32\1\u014f"+
    "\26\32\14\0\3\32\1\u0150\41\32\14\0\10\32\1\u0151"+
    "\34\32\14\0\10\32\1\u0152\34\32\14\0\2\32\1\u0153"+
    "\42\32\14\0\12\32\1\u0154\32\32\14\0\1\32\1\u0119"+
    "\43\32\14\0\3\32\1\u011a\41\32\27\0\1\u0155\45\0"+
    "\10\32\1\145\3\32\1\117\30\32\14\0\11\32\1\u0156"+
    "\33\32\14\0\4\32\1\u0157\40\32\14\0\12\32\1\145"+
    "\32\32\14\0\15\32\1\u0158\27\32\14\0\4\32\1\u0159"+
    "\40\32\14\0\11\32\1\u015a\33\32\14\0\13\32\1\u015b"+
    "\31\32\14\0\27\32\1\u015c\15\32\14\0\12\32\1\u015d"+
    "\32\32\14\0\13\32\1\u015e\31\32\32\0\1\u015f\42\0"+
    "\22\32\1\u0160\22\32\14\0\3\32\1\u0161\41\32\14\0"+
    "\11\32\1\u0162\33\32\14\0\13\32\1\u0163\31\32\14\0"+
    "\10\32\1\u0164\34\32\14\0\26\32\1\u0165\16\32\14\0"+
    "\7\32\1\u0166\35\32\14\0\13\32\1\u0167\31\32\14\0"+
    "\1\317\44\32\17\0\1\u0168\55\0\3\32\1\u0169\41\32"+
    "\14\0\20\32\1\u0126\24\32\14\0\20\32\1\u011e\24\32"+
    "\14\0\5\32\1\u016a\37\32\14\0\1\32\1\u016b\43\32"+
    "\14\0\1\32\1\u010c\43\32\14\0\2\32\1\u010c\42\32"+
    "\14\0\1\u0119\44\32\30\0\1\u016c\44\0\7\32\1\u016d"+
    "\35\32\14\0\10\32\1\u016e\34\32\14\0\21\32\1\u011a"+
    "\23\32\17\0\1\u016f\55\0\25\32\1\u0170\17\32\14\0"+
    "\11\32\1\u0171\33\32\33\0\1\u0172\41\0\1\32\1\u0173"+
    "\43\32\14\0\14\32\1\u0133\30\32\14\0\20\32\1\u0174"+
    "\24\32\14\0\10\32\1\u0175\34\32\14\0\11\32\1\u0176"+
    "\33\32\14\0\15\32\1\u0177\27\32\14\0\13\32\1\u0118"+
    "\31\32\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[17738];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\31\1\4\11\40\1\1\0"+
    "\5\1\1\11\51\1\1\0\1\1\1\0\2\1\2\0"+
    "\41\1\1\0\1\1\2\0\37\1\3\0\34\1\1\0"+
    "\30\1\1\0\24\1\1\0\27\1\1\0\25\1\1\0"+
    "\17\1\1\0\13\1\1\0\11\1\1\0\10\1\1\0"+
    "\3\1\1\0\2\1\1\0\2\1\1\11\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[375];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _BuckLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1620) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 6: 
          { return VALUE_STRING;
          }
        case 14: break;
        case 8: 
          { return RBRACE;
          }
        case 15: break;
        case 4: 
          { return EQUAL;
          }
        case 16: break;
        case 3: 
          { return COMMENT;
          }
        case 17: break;
        case 9: 
          { return COMMA;
          }
        case 18: break;
        case 12: 
          { return RULE_NAMES;
          }
        case 19: break;
        case 11: 
          { return KEYWORDS;
          }
        case 20: break;
        case 1: 
          { return IDENTIFIER;
          }
        case 21: break;
        case 13: 
          { return VALUE_BOOLEAN;
          }
        case 22: break;
        case 10: 
          { return SEMICOLON;
          }
        case 23: break;
        case 2: 
          { return TokenType.WHITE_SPACE;
          }
        case 24: break;
        case 7: 
          { return LBRACE;
          }
        case 25: break;
        case 5: 
          { return MACROS;
          }
        case 26: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
