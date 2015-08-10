/* The following code was generated by JFlex 1.4.3 on 8/9/15 10:33 PM */

package com.intellij.plugin.buck.lang;

import com.intellij.lexer.FlexLexer;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.BOOLEAN;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.COLON;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.COMMA;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.DOUBLE_QUOTED_STRING;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.EQUAL;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.GLOB_EXCLUDES_KEYWORD;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.GLOB_KEYWORD;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.IDENTIFIER;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.LINE_COMMENT;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.L_BRACKET;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.L_CURLY;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.L_PARENTHESES;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.MACROS;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.NONE;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.NUMBER;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.PLUS;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.R_BRACKET;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.R_CURLY;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.R_PARENTHESES;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.SINGLE_QUOTED_STRING;
import static com.intellij.plugin.buck.lang.psi.BuckTypes.SLASH;
import com.intellij.psi.tree.IElementType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 8/9/15 10:33 PM from the specification file
 * <tt>/Users/cjlm/Projects/buck_idea_plugin/src/com/intellij/plugin/buck/lang/_BuckLexer.flex</tt>
 */
public class _BuckLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\36\1\3\1\2\1\0\1\3\1\1\16\36\4\0\1\3\1\0"+
    "\1\25\1\14\1\35\2\0\1\27\1\46\1\51\1\0\1\34\1\41"+
    "\1\30\1\32\1\0\1\31\11\24\1\42\2\0\1\43\3\0\4\23"+
    "\1\33\1\10\7\23\1\37\5\23\1\4\6\23\1\47\1\26\1\52"+
    "\1\0\1\22\1\0\1\11\1\17\1\45\1\20\1\7\1\35\1\15"+
    "\1\35\1\21\2\35\1\12\1\35\1\40\1\16\2\35\1\5\1\13"+
    "\1\35\1\6\2\35\1\44\2\35\1\50\1\0\1\53\1\0\41\36"+
    "\2\0\4\35\4\0\1\35\2\0\1\36\7\0\1\35\4\0\1\35"+
    "\5\0\27\35\1\0\37\35\1\0\u01ca\35\4\0\14\35\16\0\5\35"+
    "\7\0\1\35\1\0\1\35\21\0\160\36\5\35\1\0\2\35\2\0"+
    "\4\35\10\0\1\35\1\0\3\35\1\0\1\35\1\0\24\35\1\0"+
    "\123\35\1\0\213\35\1\0\5\36\2\0\236\35\11\0\46\35\2\0"+
    "\1\35\7\0\47\35\7\0\1\35\1\0\55\36\1\0\1\36\1\0"+
    "\2\36\1\0\2\36\1\0\1\36\10\0\33\35\5\0\3\35\15\0"+
    "\5\36\6\0\1\35\4\0\13\36\5\0\53\35\37\36\4\0\2\35"+
    "\1\36\143\35\1\0\1\35\10\36\1\0\6\36\2\35\2\36\1\0"+
    "\4\36\2\35\12\36\3\35\2\0\1\35\17\0\1\36\1\35\1\36"+
    "\36\35\33\36\2\0\131\35\13\36\1\35\16\0\12\36\41\35\11\36"+
    "\2\35\4\0\1\35\5\0\26\35\4\36\1\35\11\36\1\35\3\36"+
    "\1\35\5\36\22\0\31\35\3\36\104\0\1\35\1\0\13\35\67\0"+
    "\33\36\1\0\4\36\66\35\3\36\1\35\22\36\1\35\7\36\12\35"+
    "\2\36\2\0\12\36\1\0\7\35\1\0\7\35\1\0\3\36\1\0"+
    "\10\35\2\0\2\35\2\0\26\35\1\0\7\35\1\0\1\35\3\0"+
    "\4\35\2\0\1\36\1\35\7\36\2\0\2\36\2\0\3\36\1\35"+
    "\10\0\1\36\4\0\2\35\1\0\3\35\2\36\2\0\12\36\4\35"+
    "\7\0\1\35\5\0\3\36\1\0\6\35\4\0\2\35\2\0\26\35"+
    "\1\0\7\35\1\0\2\35\1\0\2\35\1\0\2\35\2\0\1\36"+
    "\1\0\5\36\4\0\2\36\2\0\3\36\3\0\1\36\7\0\4\35"+
    "\1\0\1\35\7\0\14\36\3\35\1\36\13\0\3\36\1\0\11\35"+
    "\1\0\3\35\1\0\26\35\1\0\7\35\1\0\2\35\1\0\5\35"+
    "\2\0\1\36\1\35\10\36\1\0\3\36\1\0\3\36\2\0\1\35"+
    "\17\0\2\35\2\36\2\0\12\36\1\0\1\35\17\0\3\36\1\0"+
    "\10\35\2\0\2\35\2\0\26\35\1\0\7\35\1\0\2\35\1\0"+
    "\5\35\2\0\1\36\1\35\7\36\2\0\2\36\2\0\3\36\10\0"+
    "\2\36\4\0\2\35\1\0\3\35\2\36\2\0\12\36\1\0\1\35"+
    "\20\0\1\36\1\35\1\0\6\35\3\0\3\35\1\0\4\35\3\0"+
    "\2\35\1\0\1\35\1\0\2\35\3\0\2\35\3\0\3\35\3\0"+
    "\14\35\4\0\5\36\3\0\3\36\1\0\4\36\2\0\1\35\6\0"+
    "\1\36\16\0\12\36\11\0\1\35\7\0\3\36\1\0\10\35\1\0"+
    "\3\35\1\0\27\35\1\0\12\35\1\0\5\35\3\0\1\35\7\36"+
    "\1\0\3\36\1\0\4\36\7\0\2\36\1\0\2\35\6\0\2\35"+
    "\2\36\2\0\12\36\22\0\2\36\1\0\10\35\1\0\3\35\1\0"+
    "\27\35\1\0\12\35\1\0\5\35\2\0\1\36\1\35\7\36\1\0"+
    "\3\36\1\0\4\36\7\0\2\36\7\0\1\35\1\0\2\35\2\36"+
    "\2\0\12\36\1\0\2\35\17\0\2\36\1\0\10\35\1\0\3\35"+
    "\1\0\51\35\2\0\1\35\7\36\1\0\3\36\1\0\4\36\1\35"+
    "\10\0\1\36\10\0\2\35\2\36\2\0\12\36\12\0\6\35\2\0"+
    "\2\36\1\0\22\35\3\0\30\35\1\0\11\35\1\0\1\35\2\0"+
    "\7\35\3\0\1\36\4\0\6\36\1\0\1\36\1\0\10\36\22\0"+
    "\2\36\15\0\60\35\1\36\2\35\7\36\4\0\10\35\10\36\1\0"+
    "\12\36\47\0\2\35\1\0\1\35\2\0\2\35\1\0\1\35\2\0"+
    "\1\35\6\0\4\35\1\0\7\35\1\0\3\35\1\0\1\35\1\0"+
    "\1\35\2\0\2\35\1\0\4\35\1\36\2\35\6\36\1\0\2\36"+
    "\1\35\2\0\5\35\1\0\1\35\1\0\6\36\2\0\12\36\2\0"+
    "\4\35\40\0\1\35\27\0\2\36\6\0\12\36\13\0\1\36\1\0"+
    "\1\36\1\0\1\36\4\0\2\36\10\35\1\0\44\35\4\0\24\36"+
    "\1\0\2\36\5\35\13\36\1\0\44\36\11\0\1\36\71\0\53\35"+
    "\24\36\1\35\12\36\6\0\6\35\4\36\4\35\3\36\1\35\3\36"+
    "\2\35\7\36\3\35\4\36\15\35\14\36\1\35\17\36\2\0\46\35"+
    "\1\0\1\35\5\0\1\35\2\0\53\35\1\0\u014d\35\1\0\4\35"+
    "\2\0\7\35\1\0\1\35\1\0\4\35\2\0\51\35\1\0\4\35"+
    "\2\0\41\35\1\0\4\35\2\0\7\35\1\0\1\35\1\0\4\35"+
    "\2\0\17\35\1\0\71\35\1\0\4\35\2\0\103\35\2\0\3\36"+
    "\40\0\20\35\20\0\125\35\14\0\u026c\35\2\0\21\35\1\0\32\35"+
    "\5\0\113\35\3\0\3\35\17\0\15\35\1\0\4\35\3\36\13\0"+
    "\22\35\3\36\13\0\22\35\2\36\14\0\15\35\1\0\3\35\1\0"+
    "\2\36\14\0\64\35\40\36\3\0\1\35\3\0\2\35\1\36\2\0"+
    "\12\36\41\0\3\36\2\0\12\36\6\0\130\35\10\0\51\35\1\36"+
    "\1\35\5\0\106\35\12\0\35\35\3\0\14\36\4\0\14\36\12\0"+
    "\12\36\36\35\2\0\5\35\13\0\54\35\4\0\21\36\7\35\2\36"+
    "\6\0\12\36\46\0\27\35\5\36\4\0\65\35\12\36\1\0\35\36"+
    "\2\0\13\36\6\0\12\36\15\0\1\35\130\0\5\36\57\35\21\36"+
    "\7\35\4\0\12\36\21\0\11\36\14\0\3\36\36\35\15\36\2\35"+
    "\12\36\54\35\16\36\14\0\44\35\24\36\10\0\12\36\3\0\3\35"+
    "\12\36\44\35\122\0\3\36\1\0\25\36\4\35\1\36\4\35\3\36"+
    "\2\35\11\0\300\35\47\36\25\0\4\36\u0116\35\2\0\6\35\2\0"+
    "\46\35\2\0\6\35\2\0\10\35\1\0\1\35\1\0\1\35\1\0"+
    "\1\35\1\0\37\35\2\0\65\35\1\0\7\35\1\0\1\35\3\0"+
    "\3\35\1\0\7\35\3\0\4\35\2\0\6\35\4\0\15\35\5\0"+
    "\3\35\1\0\7\35\16\0\5\36\32\0\5\36\20\0\2\35\23\0"+
    "\1\35\13\0\5\36\5\0\6\36\1\0\1\35\15\0\1\35\20\0"+
    "\15\35\3\0\33\35\25\0\15\36\4\0\1\36\3\0\14\36\21\0"+
    "\1\35\4\0\1\35\2\0\12\35\1\0\1\35\3\0\5\35\6\0"+
    "\1\35\1\0\1\35\1\0\1\35\1\0\4\35\1\0\13\35\2\0"+
    "\4\35\5\0\5\35\4\0\1\35\21\0\51\35\u0a77\0\57\35\1\0"+
    "\57\35\1\0\205\35\6\0\4\35\3\36\2\35\14\0\46\35\1\0"+
    "\1\35\5\0\1\35\2\0\70\35\7\0\1\35\17\0\1\36\27\35"+
    "\11\0\7\35\1\0\7\35\1\0\7\35\1\0\7\35\1\0\7\35"+
    "\1\0\7\35\1\0\7\35\1\0\7\35\1\0\40\36\57\0\1\35"+
    "\u01d5\0\3\35\31\0\11\35\6\36\1\0\5\35\2\0\5\35\4\0"+
    "\126\35\2\0\2\36\2\0\3\35\1\0\132\35\1\0\4\35\5\0"+
    "\51\35\3\0\136\35\21\0\33\35\65\0\20\35\u0200\0\u19b6\35\112\0"+
    "\u51cd\35\63\0\u048d\35\103\0\56\35\2\0\u010d\35\3\0\20\35\12\36"+
    "\2\35\24\0\57\35\1\36\4\0\12\36\1\0\31\35\7\0\1\36"+
    "\120\35\2\36\45\0\11\35\2\0\147\35\2\0\4\35\1\0\4\35"+
    "\14\0\13\35\115\0\12\35\1\36\3\35\1\36\4\35\1\36\27\35"+
    "\5\36\20\0\1\35\7\0\64\35\14\0\2\36\62\35\21\36\13\0"+
    "\12\36\6\0\22\36\6\35\3\0\1\35\4\0\12\36\34\35\10\36"+
    "\2\0\27\35\15\36\14\0\35\35\3\0\4\36\57\35\16\36\16\0"+
    "\1\35\12\36\46\0\51\35\16\36\11\0\3\35\1\36\10\35\2\36"+
    "\2\0\12\36\6\0\27\35\3\0\1\35\1\36\4\0\60\35\1\36"+
    "\1\35\3\36\2\35\2\36\5\35\2\36\1\35\1\36\1\35\30\0"+
    "\3\35\2\0\13\35\5\36\2\0\3\35\2\36\12\0\6\35\2\0"+
    "\6\35\2\0\6\35\11\0\7\35\1\0\7\35\221\0\43\35\10\36"+
    "\1\0\2\36\2\0\12\36\6\0\u2ba4\35\14\0\27\35\4\0\61\35"+
    "\u2104\0\u016e\35\2\0\152\35\46\0\7\35\14\0\5\35\5\0\1\35"+
    "\1\36\12\35\1\0\15\35\1\0\5\35\1\0\1\35\1\0\2\35"+
    "\1\0\2\35\1\0\154\35\41\0\u016b\35\22\0\100\35\2\0\66\35"+
    "\50\0\15\35\3\0\20\36\20\0\7\36\14\0\2\35\30\0\3\35"+
    "\31\0\1\35\6\0\5\35\1\0\207\35\2\0\1\36\4\0\1\35"+
    "\13\0\12\36\7\0\32\35\4\0\1\35\1\0\32\35\13\0\131\35"+
    "\3\0\6\35\2\0\6\35\2\0\6\35\2\0\3\35\3\0\2\35"+
    "\3\0\2\35\22\0\3\36\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\5\3\1\4\2\3\1\5\1\6"+
    "\1\7\1\10\1\1\1\5\1\11\1\3\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\5\3\1\5\1\0\1\6\2\0\1\10\6\3\2\5"+
    "\1\3\1\24\2\3\1\25\1\26\6\3\1\27";

  private static int [] zzUnpackAction() {
    int [] result = new int[61];
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
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\u0108\0\u0134"+
    "\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\54\0\u023c\0\u0268"+
    "\0\u0294\0\54\0\u02c0\0\54\0\54\0\54\0\54\0\54"+
    "\0\54\0\54\0\54\0\54\0\u01b8\0\u02ec\0\u0318\0\u0344"+
    "\0\u0370\0\u039c\0\u03c8\0\u03f4\0\54\0\u0420\0\u044c\0\54"+
    "\0\u0478\0\u04a4\0\u04d0\0\u04fc\0\u0528\0\u0554\0\u0580\0\u05ac"+
    "\0\u05d8\0\260\0\u0604\0\u0630\0\260\0\260\0\u065c\0\u0688"+
    "\0\u06b4\0\u06e0\0\u070c\0\u0738\0\260";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[61];
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
    "\1\2\3\3\1\4\2\5\1\6\1\7\2\5\1\10"+
    "\1\11\1\12\4\5\2\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\2\1\13\1\22\1\5\1\2\1\23"+
    "\1\5\1\24\1\25\1\26\2\5\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\55\0\3\3\54\0\1\35\1\36"+
    "\2\5\1\35\3\5\1\0\5\5\3\35\4\0\1\35"+
    "\1\0\1\35\1\0\2\5\1\35\1\5\3\0\2\5"+
    "\12\0\10\5\1\0\10\5\4\0\1\5\1\0\1\5"+
    "\1\0\4\5\3\0\2\5\12\0\10\5\1\0\10\5"+
    "\4\0\1\5\1\0\1\5\1\0\4\5\3\0\1\37"+
    "\1\5\12\0\1\35\3\5\1\35\1\40\2\5\1\0"+
    "\5\5\3\35\4\0\1\35\1\0\1\35\1\0\2\5"+
    "\1\35\1\5\3\0\2\5\12\0\2\5\1\41\5\5"+
    "\1\0\10\5\4\0\1\5\1\0\1\5\1\0\4\5"+
    "\3\0\2\5\6\0\2\11\1\0\51\11\4\0\6\5"+
    "\1\42\1\5\1\0\10\5\4\0\1\5\1\0\1\5"+
    "\1\0\4\5\3\0\2\5\12\0\1\35\3\5\1\35"+
    "\3\5\1\0\5\5\3\35\4\0\1\35\1\0\1\35"+
    "\1\0\2\5\1\35\1\5\3\0\2\5\15\0\1\43"+
    "\14\0\1\14\4\0\1\14\1\44\1\43\20\0\1\15"+
    "\2\0\22\15\1\45\1\46\25\15\1\17\2\0\23\17"+
    "\1\47\1\50\24\17\24\0\1\14\4\0\1\21\31\0"+
    "\1\43\22\0\1\44\1\43\24\0\1\35\3\5\1\35"+
    "\3\5\1\0\1\5\1\51\3\5\3\35\4\0\1\35"+
    "\1\0\1\35\1\0\2\5\1\35\1\5\3\0\2\5"+
    "\12\0\2\5\1\52\5\5\1\0\10\5\4\0\1\5"+
    "\1\0\1\5\1\0\4\5\3\0\2\5\12\0\10\5"+
    "\1\0\10\5\4\0\1\5\1\0\1\5\1\0\4\5"+
    "\3\0\1\5\1\53\12\0\6\5\1\54\1\5\1\0"+
    "\10\5\4\0\1\5\1\0\1\5\1\0\4\5\3\0"+
    "\2\5\12\0\10\5\1\0\2\5\1\55\5\5\4\0"+
    "\1\5\1\0\1\5\1\0\4\5\3\0\2\5\12\0"+
    "\10\5\1\0\1\5\1\56\6\5\4\0\1\5\1\0"+
    "\1\5\1\0\4\5\3\0\2\5\32\0\1\57\3\0"+
    "\2\57\2\0\1\57\43\0\1\60\4\0\1\60\22\0"+
    "\1\15\2\0\51\15\1\17\2\0\51\17\4\0\10\5"+
    "\1\0\10\5\4\0\1\5\1\0\1\5\1\0\3\5"+
    "\1\61\3\0\2\5\12\0\3\5\1\62\4\5\1\0"+
    "\10\5\4\0\1\5\1\0\1\5\1\0\4\5\3\0"+
    "\2\5\12\0\6\5\1\63\1\5\1\0\10\5\4\0"+
    "\1\5\1\0\1\5\1\0\4\5\3\0\2\5\12\0"+
    "\7\5\1\52\1\0\10\5\4\0\1\5\1\0\1\5"+
    "\1\0\4\5\3\0\2\5\12\0\10\5\1\0\3\5"+
    "\1\64\4\5\4\0\1\5\1\0\1\5\1\0\4\5"+
    "\3\0\2\5\12\0\10\5\1\0\2\5\1\65\5\5"+
    "\4\0\1\5\1\0\1\5\1\0\4\5\3\0\2\5"+
    "\32\0\1\57\4\0\1\57\31\0\1\43\14\0\1\60"+
    "\4\0\1\60\1\0\1\43\24\0\3\5\1\66\4\5"+
    "\1\0\10\5\4\0\1\5\1\0\1\5\1\0\4\5"+
    "\3\0\2\5\12\0\2\5\1\67\5\5\1\0\10\5"+
    "\4\0\1\5\1\0\1\5\1\0\4\5\3\0\2\5"+
    "\12\0\10\5\1\0\4\5\1\70\3\5\4\0\1\5"+
    "\1\0\1\5\1\0\4\5\3\0\2\5\12\0\10\5"+
    "\1\0\3\5\1\71\4\5\4\0\1\5\1\0\1\5"+
    "\1\0\4\5\3\0\2\5\12\0\1\5\1\72\6\5"+
    "\1\0\10\5\4\0\1\5\1\0\1\5\1\0\4\5"+
    "\3\0\2\5\12\0\3\5\1\73\4\5\1\0\10\5"+
    "\4\0\1\5\1\0\1\5\1\0\4\5\3\0\2\5"+
    "\12\0\10\5\1\0\5\5\1\74\2\5\4\0\1\5"+
    "\1\0\1\5\1\0\4\5\3\0\2\5\12\0\7\5"+
    "\1\75\1\0\10\5\4\0\1\5\1\0\1\5\1\0"+
    "\4\5\3\0\2\5\12\0\10\5\1\0\1\12\7\5"+
    "\4\0\1\5\1\0\1\5\1\0\4\5\3\0\2\5"+
    "\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1892];
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
    "\1\0\1\11\13\1\1\11\3\1\1\11\1\1\11\11"+
    "\7\1\1\0\1\11\2\0\1\11\25\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[61];
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

  /* user code: */
  public _BuckLexer() {
    this((java.io.Reader)null);
  }


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
    while (i < 2250) {
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
          { return DOUBLE_QUOTED_STRING;
          }
        case 24: break;
        case 20: 
          { return BOOLEAN;
          }
        case 25: break;
        case 10: 
          { return COMMA;
          }
        case 26: break;
        case 4: 
          { return LINE_COMMENT;
          }
        case 27: break;
        case 23: 
          { return GLOB_EXCLUDES_KEYWORD;
          }
        case 28: break;
        case 7: 
          { return SLASH;
          }
        case 29: break;
        case 3: 
          { return IDENTIFIER;
          }
        case 30: break;
        case 21: 
          { return GLOB_KEYWORD;
          }
        case 31: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 32: break;
        case 18: 
          { return R_CURLY;
          }
        case 33: break;
        case 8: 
          { return SINGLE_QUOTED_STRING;
          }
        case 34: break;
        case 9: 
          { return PLUS;
          }
        case 35: break;
        case 17: 
          { return R_BRACKET;
          }
        case 36: break;
        case 14: 
          { return L_BRACKET;
          }
        case 37: break;
        case 13: 
          { return L_PARENTHESES;
          }
        case 38: break;
        case 11: 
          { return COLON;
          }
        case 39: break;
        case 19: 
          { return MACROS;
          }
        case 40: break;
        case 16: 
          { return R_PARENTHESES;
          }
        case 41: break;
        case 15: 
          { return L_CURLY;
          }
        case 42: break;
        case 12: 
          { return EQUAL;
          }
        case 43: break;
        case 5: 
          { return NUMBER;
          }
        case 44: break;
        case 22: 
          { return NONE;
          }
        case 45: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 46: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
