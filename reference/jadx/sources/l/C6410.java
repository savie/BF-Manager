package l;

import com.alipay.sdk.m.u0.b;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۛ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 96Q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6410 extends AbstractC11629 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C25351[] f21630;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C11002 f21631;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C6485 f21629 = new C6485();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final String[] f21632 = {"document", b.d, "object", "member", "array"};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C22191 f21627 = new C22191(new String[]{null, null, null, null, null, null, null, null, "'break'", "'case'", "'catch'", "'class'", "'const'", "'continue'", "'debugger'", "'default'", "'delete'", "'do'", "'else'", "'export'", "'extends'", "'finally'", "'for'", "'function'", "'if'", "'import'", "'in'", "'instanceof'", "'new'", "'return'", "'super'", "'switch'", "'this'", "'throw'", "'try'", "'typeof'", "'var'", "'void'", "'while'", "'with'", "'yield'", "'let'", "'static'", "'enum'", "'await'", "'async'", "'of'", "'from'", "'get'", "'set'", "'type'", "'interface'", "'namespace'", "'module'", "'declare'", "'abstract'", "'public'", "'private'", "'protected'", "'readonly'", "'override'", "'accessor'", "'implements'", "'constructor'", "'as'", "'satisfies'", "'asserts'", "'is'", "'keyof'", "'infer'", "'unique'", "'unknown'", "'never'", "'any'", "'number'", "'string'", "'boolean'", "'symbol'", "'object'", "'undefined'", "'global'", "'require'", "'out'", "'using'", "'null'", "'true'", "'false'", "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", "','", "':'", "'...'", "'?.'", "'.'", "'=>'", "'++'", "'--'", "'**='", "'**'", "'&&='", "'||='", "'??='", "'&&'", "'||'", "'??'", "'==='", "'!=='", "'=='", "'!='", "'<='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'!'", "'~'", "'='", "'?'", "'@'"}, new String[]{null, "Hashbang", "HtmlComment", "LineComment", "BlockComment", "Regex", "StringLiteral", "TemplateStart", "Break", "Case", "Catch", "Class", "Const", "Continue", "Debugger", "Default", "Delete", "Do", "Else", "Export", "Extends", "Finally", "For", "Function", "If", "Import", "In", "Instanceof", "New", "Return", "Super", "Switch", "This", "Throw", "Try", "Typeof", "Var", "Void", "While", "With", "Yield", "Let", "Static", "Enum", "Await", "Async", "Of", "From", "Get", "Set", "Type", "Interface", "Namespace", "Module", "Declare", "Abstract", "Public", "Private", "Protected", "Readonly", "Override", "Accessor", "Implements", "Constructor", "As", "Satisfies", "Asserts", "Is", "Keyof", "Infer", "Unique", "Unknown", "Never", "Any", "Number", "String", "Boolean", "Symbol", "Object", "Undefined", "Global", "Require", "Out", "Using", "Null", "True", "False", "LParen", "RParen", "LBracket", "RBracket", "LBrace", "RBrace", "Semi", "Comma", "Colon", "Ellipsis", "OptionalDot", "Dot", "Arrow", "PlusPlus", "MinusMinus", "PowerAssign", "Power", "AndAssign", "OrAssign", "NullAssign", "And", "Or", "Nullish", "StrictEqual", "StrictNotEqual", "Equal", "NotEqual", "LessEqual", "Less", "Greater", "PlusAssign", "MinusAssign", "MultiplyAssign", "DivideAssign", "ModAssign", "BitAndAssign", "BitOrAssign", "BitXorAssign", "Plus", "Minus", "Multiply", "Divide", "Mod", "BitAnd", "BitOr", "BitXor", "Not", "BitNot", "Assign", "Question", "At", "NumberLiteral", "PrivateIdentifier", "Identifier", "Whitespace", "Unexpected", "TemplateEnd", "TemplateExpression", "TemplateText"}, null);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final String[] f21628 = new String[146];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f21628;
            if (i2 >= strArr.length) {
                break;
            }
            C22191 c22191 = f21627;
            String strM50200 = c22191.m50200(i2);
            strArr[i2] = strM50200;
            if (strM50200 == null) {
                strArr[i2] = c22191.m50199(i2);
            }
            if (strArr[i2] == null) {
                strArr[i2] = "<INVALID>";
            }
            i2++;
        }
        C11002 c11002M56094 = new C25175().m56094("\u0004\u0001\u0091>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0011\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u001e\b\u0002\n\u0002\f\u0002!\t\u0002\u0001\u0002\u0003\u0002$\b\u0002\u0003\u0002&\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00042\b\u0004\n\u0004\f\u00045\t\u0004\u0001\u0004\u0003\u00048\b\u0004\u0003\u0004:\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000E\u0000\n\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0005\u0000\u0000\u0001\f\u0001\u0001\u0000\u0000\u0000\r\u0018\u0003\u0004\u0002\u0000\u000e\u0018\u0003\b\u0004\u0000\u000f\u0011\u0005~\u0000\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0018\u0005\u008a\u0000\u0000\u0013\u0018\u0005\u0006\u0000\u0000\u0014\u0018\u0005U\u0000\u0000\u0015\u0018\u0005V\u0000\u0000\u0016\u0018\u0005T\u0000\u0000\u0017\r\u0001\u0000\u0000\u0000\u0017\u000e\u0001\u0000\u0000\u0000\u0017\u0010\u0001\u0000\u0000\u0000\u0017\u0013\u0001\u0000\u0000\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019%\u0005[\u0000\u0000\u001a\u001f\u0003\u0006\u0003\u0000\u001b\u001c\u0005^\u0000\u0000\u001c\u001e\u0003\u0006\u0003\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"$\u0005^\u0000\u0000#\"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%\u001a\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&'\u0001\u0000\u0000\u0000'(\u0005\\\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0005\u0006\u0000\u0000*+\u0005_\u0000\u0000+,\u0003\u0002\u0001\u0000,\u0007\u0001\u0000\u0000\u0000-9\u0005Y\u0000\u0000.3\u0003\u0002\u0001\u0000/0\u0005^\u0000\u000002\u0003\u0002\u0001\u00001/\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000068\u0005^\u0000\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u00009.\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0005Z\u0000\u0000<\t\u0001\u0000\u0000\u0000\b\u0010\u0017\u001f#%379".toCharArray());
        f21631 = c11002M56094;
        f21630 = new C25351[c11002M56094.f34749.size()];
        while (true) {
            C11002 c11002 = f21631;
            if (i >= c11002.f34749.size()) {
                return;
            }
            f21630[i] = new C25351(c11002.m27846(i), i);
            i++;
        }
    }

    @Override // l.AbstractC9488
    @Deprecated
    /* JADX INFO: renamed from: ۚ */
    public final String[] mo6653() {
        return f21628;
    }

    @Override // l.AbstractC9488
    /* JADX INFO: renamed from: ֫ */
    public final C22191 mo6640() {
        return f21627;
    }

    @Override // l.AbstractC9488
    /* JADX INFO: renamed from: ܳ */
    public final String[] mo6683() {
        return f21632;
    }

    @Override // l.AbstractC9488
    /* JADX INFO: renamed from: ۤ */
    public final C11002 mo6669() {
        return f21631;
    }

    public C6410(C3523 c3523) {
        super(c3523);
        this.f30727 = new C17671(this, f21631, f21630, f21629);
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final void m18173() {
        C23564 c23564 = new C23564(m24870(), this.f2262);
        mo2511((C7998) c23564, 0, 0);
        try {
            m2510(c23564);
            m24872(10);
            m18172();
            m24872(11);
            m2518(-1);
        } catch (C10234 e) {
            this.f2261.m30971(this, e);
            this.f2261.mo29437(this, e);
        } finally {
            mo2521();
        }
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final void m18172() {
        C12375 c12375 = new C12375(m24870(), this.f2262);
        mo2511((C7998) c12375, 2, 1);
        try {
            try {
                m24872(23);
                this.f2261.mo29438(this);
                int iMo11537 = this.f2260.mo11537(1);
                if (iMo11537 == 6) {
                    m2510(c12375);
                    m24872(19);
                    m2518(6);
                } else if (iMo11537 == 89) {
                    m2510(c12375);
                    m24872(14);
                    m18174();
                } else if (iMo11537 == 91) {
                    m2510(c12375);
                    m24872(13);
                    m18170();
                } else if (iMo11537 == 126 || iMo11537 == 138) {
                    m2510(c12375);
                    m24872(16);
                    this.f2261.mo29438(this);
                    if (this.f2260.mo11537(1) == 126) {
                        m24872(15);
                        m2518(126);
                    }
                    m24872(18);
                    m2518(138);
                } else {
                    switch (iMo11537) {
                        case 84:
                            m2510(c12375);
                            m24872(22);
                            m2518(84);
                            break;
                        case 85:
                            m2510(c12375);
                            m24872(20);
                            m2518(85);
                            break;
                        case HRSS1373Polynomial.K /* 86 */:
                            m2510(c12375);
                            m24872(21);
                            m2518(86);
                            break;
                        default:
                            throw new C18439(this);
                    }
                }
                mo2521();
            } catch (C10234 e) {
                this.f2261.m30971(this, e);
                this.f2261.mo29437(this, e);
                mo2521();
            }
        } catch (Throwable th) {
            mo2521();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final void m18170() {
        C20580 c20580 = new C20580(m24870(), this.f2262);
        mo2511((C7998) c20580, 4, 2);
        try {
            m2510(c20580);
            m24872(25);
            m2518(91);
            m24872(37);
            this.f2261.mo29438(this);
            if (this.f2260.mo11537(1) == 6) {
                m24872(26);
                m18171();
                m24872(31);
                this.f2261.mo29438(this);
                int iMo4368 = ((C17671) m24871()).mo4368(2, this.f2260, this.f2262);
                while (iMo4368 != 2 && iMo4368 != 0) {
                    if (iMo4368 == 1) {
                        m24872(27);
                        m2518(94);
                        m24872(28);
                        m18171();
                    }
                    m24872(33);
                    this.f2261.mo29438(this);
                    iMo4368 = ((C17671) m24871()).mo4368(2, this.f2260, this.f2262);
                }
                m24872(35);
                this.f2261.mo29438(this);
                if (this.f2260.mo11537(1) == 94) {
                    m24872(34);
                    m2518(94);
                }
            }
            m24872(39);
            m2518(92);
        } catch (C10234 e) {
            this.f2261.m30971(this, e);
            this.f2261.mo29437(this, e);
        } finally {
            mo2521();
        }
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final void m18171() {
        C3426 c3426 = new C3426(m24870(), this.f2262);
        mo2511((C7998) c3426, 6, 3);
        try {
            m2510(c3426);
            m24872(41);
            m2518(6);
            m24872(42);
            m2518(95);
            m24872(43);
            m18172();
        } catch (C10234 e) {
            this.f2261.m30971(this, e);
            this.f2261.mo29437(this, e);
        } finally {
            mo2521();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0071 A[Catch: all -> 0x00c2, ۢܺۨ -> 0x00c4, Merged into TryCatch #0 {all -> 0x00c2, ۢܺۨ -> 0x00c4, blocks: (B:3:0x0011, B:5:0x0032, B:7:0x0038, B:19:0x00b4, B:9:0x0047, B:14:0x0071, B:15:0x0081, B:16:0x009a, B:18:0x00ac, B:25:0x00c5), top: B:30:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x00ac A[Catch: all -> 0x00c2, ۢܺۨ -> 0x00c4, Merged into TryCatch #0 {all -> 0x00c2, ۢܺۨ -> 0x00c4, blocks: (B:3:0x0011, B:5:0x0032, B:7:0x0038, B:19:0x00b4, B:9:0x0047, B:14:0x0071, B:15:0x0081, B:16:0x009a, B:18:0x00ac, B:25:0x00c5), top: B:30:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0047 A[Catch: all -> 0x00c2, ۢܺۨ -> 0x00c4, Merged into TryCatch #0 {all -> 0x00c2, ۢܺۨ -> 0x00c4, blocks: (B:3:0x0011, B:5:0x0032, B:7:0x0038, B:19:0x00b4, B:9:0x0047, B:14:0x0071, B:15:0x0081, B:16:0x009a, B:18:0x00ac, B:25:0x00c5), top: B:30:0x0011 }] */
    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final void m18174() {
        int iMo4368;
        C16104 c16104 = new C16104(m24870(), this.f2262);
        mo2511((C7998) c16104, 8, 4);
        try {
            m2510(c16104);
            m24872(45);
            m2518(89);
            m24872(57);
            this.f2261.mo29438(this);
            int iMo11537 = this.f2260.mo11537(1);
            if (iMo11537 != 6) {
                int i = iMo11537 - 84;
                if ((i & (-64)) == 0 && ((1 << i) & 18018796555993255L) != 0) {
                    m24872(46);
                    m18172();
                    m24872(51);
                    this.f2261.mo29438(this);
                    iMo4368 = ((C17671) m24871()).mo4368(5, this.f2260, this.f2262);
                    while (iMo4368 != 2 && iMo4368 != 0) {
                        if (iMo4368 == 1) {
                            m24872(47);
                            m2518(94);
                            m24872(48);
                            m18172();
                        }
                        m24872(53);
                        this.f2261.mo29438(this);
                        iMo4368 = ((C17671) m24871()).mo4368(5, this.f2260, this.f2262);
                    }
                    m24872(55);
                    this.f2261.mo29438(this);
                    if (this.f2260.mo11537(1) == 94) {
                        m24872(54);
                        m2518(94);
                    }
                }
            } else {
                m24872(46);
                m18172();
                m24872(51);
                this.f2261.mo29438(this);
                iMo4368 = ((C17671) m24871()).mo4368(5, this.f2260, this.f2262);
                while (iMo4368 != 2) {
                    if (iMo4368 == 1) {
                        m24872(47);
                        m2518(94);
                        m24872(48);
                        m18172();
                    }
                    m24872(53);
                    this.f2261.mo29438(this);
                    iMo4368 = ((C17671) m24871()).mo4368(5, this.f2260, this.f2262);
                }
                m24872(55);
                this.f2261.mo29438(this);
                if (this.f2260.mo11537(1) == 94) {
                    m24872(54);
                    m2518(94);
                }
            }
            m24872(59);
            m2518(90);
        } catch (C10234 e) {
            this.f2261.m30971(this, e);
            this.f2261.mo29437(this, e);
        } finally {
            mo2521();
        }
    }
}
