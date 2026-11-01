package l;

import com.alipay.sdk.m.u0.b;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۙۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96Q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4455 extends AbstractC12548 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C23724[] f15857;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C16233 f15859;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C2555 f15858 = new C2555();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final String[] f15855 = {"document", b.d, "object", "member", "array"};

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C21171 f15856 = new C21171(new String[]{null, null, null, null, null, null, null, null, "'break'", "'case'", "'catch'", "'class'", "'const'", "'continue'", "'debugger'", "'default'", "'delete'", "'do'", "'else'", "'export'", "'extends'", "'finally'", "'for'", "'function'", "'if'", "'import'", "'in'", "'instanceof'", "'new'", "'return'", "'super'", "'switch'", "'this'", "'throw'", "'try'", "'typeof'", "'var'", "'void'", "'while'", "'with'", "'yield'", "'let'", "'static'", "'enum'", "'await'", "'async'", "'of'", "'from'", "'get'", "'set'", "'type'", "'interface'", "'namespace'", "'module'", "'declare'", "'abstract'", "'public'", "'private'", "'protected'", "'readonly'", "'override'", "'accessor'", "'implements'", "'constructor'", "'as'", "'satisfies'", "'asserts'", "'is'", "'keyof'", "'infer'", "'unique'", "'unknown'", "'never'", "'any'", "'number'", "'string'", "'boolean'", "'symbol'", "'object'", "'undefined'", "'global'", "'require'", "'out'", "'using'", "'null'", "'true'", "'false'", "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", "','", "':'", "'...'", "'?.'", "'.'", "'=>'", "'++'", "'--'", "'**='", "'**'", "'&&='", "'||='", "'??='", "'&&'", "'||'", "'??'", "'==='", "'!=='", "'=='", "'!='", "'<='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'!'", "'~'", "'='", "'?'", "'@'"}, new String[]{null, "Hashbang", "HtmlComment", "LineComment", "BlockComment", "Regex", "StringLiteral", "TemplateStart", "Break", "Case", "Catch", "Class", "Const", "Continue", "Debugger", "Default", "Delete", "Do", "Else", "Export", "Extends", "Finally", "For", "Function", "If", "Import", "In", "Instanceof", "New", "Return", "Super", "Switch", "This", "Throw", "Try", "Typeof", "Var", "Void", "While", "With", "Yield", "Let", "Static", "Enum", "Await", "Async", "Of", "From", "Get", "Set", "Type", "Interface", "Namespace", "Module", "Declare", "Abstract", "Public", "Private", "Protected", "Readonly", "Override", "Accessor", "Implements", "Constructor", "As", "Satisfies", "Asserts", "Is", "Keyof", "Infer", "Unique", "Unknown", "Never", "Any", "Number", "String", "Boolean", "Symbol", "Object", "Undefined", "Global", "Require", "Out", "Using", "Null", "True", "False", "LParen", "RParen", "LBracket", "RBracket", "LBrace", "RBrace", "Semi", "Comma", "Colon", "Ellipsis", "OptionalDot", "Dot", "Arrow", "PlusPlus", "MinusMinus", "PowerAssign", "Power", "AndAssign", "OrAssign", "NullAssign", "And", "Or", "Nullish", "StrictEqual", "StrictNotEqual", "Equal", "NotEqual", "LessEqual", "Less", "Greater", "PlusAssign", "MinusAssign", "MultiplyAssign", "DivideAssign", "ModAssign", "BitAndAssign", "BitOrAssign", "BitXorAssign", "Plus", "Minus", "Multiply", "Divide", "Mod", "BitAnd", "BitOr", "BitXor", "Not", "BitNot", "Assign", "Question", "At", "NumberLiteral", "PrivateIdentifier", "Identifier", "Whitespace", "Unexpected", "TemplateEnd", "TemplateExpression", "TemplateText"}, null);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final String[] f15860 = new String[146];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f15860;
            if (i2 >= strArr.length) {
                break;
            }
            C21171 c21171 = f15856;
            String strM47631 = c21171.m47631(i2);
            strArr[i2] = strM47631;
            if (strM47631 == null) {
                strArr[i2] = c21171.m47630(i2);
            }
            if (strArr[i2] == null) {
                strArr[i2] = "<INVALID>";
            }
            i2++;
        }
        C16233 c16233M52830 = new C23994().m52830("\u0004\u0001\u0091>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0011\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u001e\b\u0002\n\u0002\f\u0002!\t\u0002\u0001\u0002\u0003\u0002$\b\u0002\u0003\u0002&\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00042\b\u0004\n\u0004\f\u00045\t\u0004\u0001\u0004\u0003\u00048\b\u0004\u0003\u0004:\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000E\u0000\n\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0005\u0000\u0000\u0001\f\u0001\u0001\u0000\u0000\u0000\r\u0018\u0003\u0004\u0002\u0000\u000e\u0018\u0003\b\u0004\u0000\u000f\u0011\u0005~\u0000\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0018\u0005\u008a\u0000\u0000\u0013\u0018\u0005\u0006\u0000\u0000\u0014\u0018\u0005U\u0000\u0000\u0015\u0018\u0005V\u0000\u0000\u0016\u0018\u0005T\u0000\u0000\u0017\r\u0001\u0000\u0000\u0000\u0017\u000e\u0001\u0000\u0000\u0000\u0017\u0010\u0001\u0000\u0000\u0000\u0017\u0013\u0001\u0000\u0000\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019%\u0005[\u0000\u0000\u001a\u001f\u0003\u0006\u0003\u0000\u001b\u001c\u0005^\u0000\u0000\u001c\u001e\u0003\u0006\u0003\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"$\u0005^\u0000\u0000#\"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%\u001a\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&'\u0001\u0000\u0000\u0000'(\u0005\\\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0005\u0006\u0000\u0000*+\u0005_\u0000\u0000+,\u0003\u0002\u0001\u0000,\u0007\u0001\u0000\u0000\u0000-9\u0005Y\u0000\u0000.3\u0003\u0002\u0001\u0000/0\u0005^\u0000\u000002\u0003\u0002\u0001\u00001/\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000068\u0005^\u0000\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u00009.\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0005Z\u0000\u0000<\t\u0001\u0000\u0000\u0000\b\u0010\u0017\u001f#%379".toCharArray());
        f15859 = c16233M52830;
        f15857 = new C23724[c16233M52830.f52366.size()];
        while (true) {
            C16233 c16233 = f15859;
            if (i >= c16233.f52366.size()) {
                return;
            }
            f15857[i] = new C23724(c16233.m38343(i), i);
            i++;
        }
    }

    @Override // l.AbstractC19055
    @Deprecated
    /* JADX INFO: renamed from: ۬ */
    public final String[] mo5092() {
        return f15860;
    }

    @Override // l.AbstractC19055
    /* JADX INFO: renamed from: ۘ */
    public final C21171 mo5089() {
        return f15856;
    }

    @Override // l.AbstractC19055
    /* JADX INFO: renamed from: ᩹ */
    public final String[] mo9135() {
        return f15855;
    }

    @Override // l.AbstractC19055
    /* JADX INFO: renamed from: ۨ */
    public final C16233 mo5091() {
        return f15859;
    }

    public C4455(C4943 c4943) {
        super(c4943);
        this.f61618 = new C1499(this, f15859, f15857, f15858);
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final void m12435() {
        C14665 c14665 = new C14665(m43800(), this.f23706);
        mo3204((C23289) c14665, 0, 0);
        try {
            m18913(c14665);
            m43806(10);
            m12437();
            m43806(11);
            m18919(-1);
        } catch (C21877 e) {
            this.f23709.m29892(this, e);
            this.f23709.mo27095(this, e);
        } finally {
            mo3207();
        }
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final void m12437() {
        C3374 c3374 = new C3374(m43800(), this.f23706);
        mo3204((C23289) c3374, 2, 1);
        try {
            try {
                m43806(23);
                this.f23709.mo27093(this);
                int iMo11332 = this.f23703.mo11332(1);
                if (iMo11332 == 6) {
                    m18913(c3374);
                    m43806(19);
                    m18919(6);
                } else if (iMo11332 == 89) {
                    m18913(c3374);
                    m43806(14);
                    m12439();
                } else if (iMo11332 == 91) {
                    m18913(c3374);
                    m43806(13);
                    m12436();
                } else if (iMo11332 == 126 || iMo11332 == 138) {
                    m18913(c3374);
                    m43806(16);
                    this.f23709.mo27093(this);
                    if (this.f23703.mo11332(1) == 126) {
                        m43806(15);
                        m18919(126);
                    }
                    m43806(18);
                    m18919(138);
                } else {
                    switch (iMo11332) {
                        case 84:
                            m18913(c3374);
                            m43806(22);
                            m18919(84);
                            break;
                        case 85:
                            m18913(c3374);
                            m43806(20);
                            m18919(85);
                            break;
                        case HRSS1373Polynomial.K /* 86 */:
                            m18913(c3374);
                            m43806(21);
                            m18919(86);
                            break;
                        default:
                            throw new C4237(this);
                    }
                }
                mo3207();
            } catch (C21877 e) {
                this.f23709.m29892(this, e);
                this.f23709.mo27095(this, e);
                mo3207();
            }
        } catch (Throwable th) {
            mo3207();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final void m12436() {
        C9726 c9726 = new C9726(m43800(), this.f23706);
        mo3204((C23289) c9726, 4, 2);
        try {
            m18913(c9726);
            m43806(25);
            m18919(91);
            m43806(37);
            this.f23709.mo27093(this);
            if (this.f23703.mo11332(1) == 6) {
                m43806(26);
                m12438();
                m43806(31);
                this.f23709.mo27093(this);
                int iMo5159 = ((C1499) m43804()).mo5159(2, this.f23703, this.f23706);
                while (iMo5159 != 2 && iMo5159 != 0) {
                    if (iMo5159 == 1) {
                        m43806(27);
                        m18919(94);
                        m43806(28);
                        m12438();
                    }
                    m43806(33);
                    this.f23709.mo27093(this);
                    iMo5159 = ((C1499) m43804()).mo5159(2, this.f23703, this.f23706);
                }
                m43806(35);
                this.f23709.mo27093(this);
                if (this.f23703.mo11332(1) == 94) {
                    m43806(34);
                    m18919(94);
                }
            }
            m43806(39);
            m18919(92);
        } catch (C21877 e) {
            this.f23709.m29892(this, e);
            this.f23709.mo27095(this, e);
        } finally {
            mo3207();
        }
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final void m12438() {
        C1963 c1963 = new C1963(m43800(), this.f23706);
        mo3204((C23289) c1963, 6, 3);
        try {
            m18913(c1963);
            m43806(41);
            m18919(6);
            m43806(42);
            m18919(95);
            m43806(43);
            m12437();
        } catch (C21877 e) {
            this.f23709.m29892(this, e);
            this.f23709.mo27095(this, e);
        } finally {
            mo3207();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0071 A[Catch: all -> 0x00c2, ᩸᩹᩵ -> 0x00c4, Merged into TryCatch #0 {all -> 0x00c2, ᩸᩹᩵ -> 0x00c4, blocks: (B:3:0x0011, B:5:0x0032, B:7:0x0038, B:19:0x00b4, B:9:0x0047, B:14:0x0071, B:15:0x0081, B:16:0x009a, B:18:0x00ac, B:25:0x00c5), top: B:30:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x00ac A[Catch: all -> 0x00c2, ᩸᩹᩵ -> 0x00c4, Merged into TryCatch #0 {all -> 0x00c2, ᩸᩹᩵ -> 0x00c4, blocks: (B:3:0x0011, B:5:0x0032, B:7:0x0038, B:19:0x00b4, B:9:0x0047, B:14:0x0071, B:15:0x0081, B:16:0x009a, B:18:0x00ac, B:25:0x00c5), top: B:30:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0047 A[Catch: all -> 0x00c2, ᩸᩹᩵ -> 0x00c4, Merged into TryCatch #0 {all -> 0x00c2, ᩸᩹᩵ -> 0x00c4, blocks: (B:3:0x0011, B:5:0x0032, B:7:0x0038, B:19:0x00b4, B:9:0x0047, B:14:0x0071, B:15:0x0081, B:16:0x009a, B:18:0x00ac, B:25:0x00c5), top: B:30:0x0011 }] */
    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final void m12439() {
        int iMo5159;
        C23837 c23837 = new C23837(m43800(), this.f23706);
        mo3204((C23289) c23837, 8, 4);
        try {
            m18913(c23837);
            m43806(45);
            m18919(89);
            m43806(57);
            this.f23709.mo27093(this);
            int iMo11332 = this.f23703.mo11332(1);
            if (iMo11332 != 6) {
                int i = iMo11332 - 84;
                if ((i & (-64)) == 0 && ((1 << i) & 18018796555993255L) != 0) {
                    m43806(46);
                    m12437();
                    m43806(51);
                    this.f23709.mo27093(this);
                    iMo5159 = ((C1499) m43804()).mo5159(5, this.f23703, this.f23706);
                    while (iMo5159 != 2 && iMo5159 != 0) {
                        if (iMo5159 == 1) {
                            m43806(47);
                            m18919(94);
                            m43806(48);
                            m12437();
                        }
                        m43806(53);
                        this.f23709.mo27093(this);
                        iMo5159 = ((C1499) m43804()).mo5159(5, this.f23703, this.f23706);
                    }
                    m43806(55);
                    this.f23709.mo27093(this);
                    if (this.f23703.mo11332(1) == 94) {
                        m43806(54);
                        m18919(94);
                    }
                }
            } else {
                m43806(46);
                m12437();
                m43806(51);
                this.f23709.mo27093(this);
                iMo5159 = ((C1499) m43804()).mo5159(5, this.f23703, this.f23706);
                while (iMo5159 != 2) {
                    if (iMo5159 == 1) {
                        m43806(47);
                        m18919(94);
                        m43806(48);
                        m12437();
                    }
                    m43806(53);
                    this.f23709.mo27093(this);
                    iMo5159 = ((C1499) m43804()).mo5159(5, this.f23703, this.f23706);
                }
                m43806(55);
                this.f23709.mo27093(this);
                if (this.f23703.mo11332(1) == 94) {
                    m43806(54);
                    m18919(94);
                }
            }
            m43806(59);
            m18919(90);
        } catch (C21877 e) {
            this.f23709.m29892(this, e);
            this.f23709.mo27095(this, e);
        } finally {
            mo3207();
        }
    }
}
