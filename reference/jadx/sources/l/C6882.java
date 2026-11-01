package l;

import com.rosan.dhizuku.shared.DhizukuVariables;

/* JADX INFO: renamed from: l.ۜܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6QF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6882 extends AbstractC7060 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C23724[] f23183;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C16233 f23186;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C2555 f23184 = new C2555();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final String[] f23181 = {"stylesheet", "declarationList", "componentValues", "orphanCloser", DhizukuVariables.PARAM_COMPONENT, "block", "function", "parentheses", "brackets", "atom"};

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C21171 f23182 = new C21171(new String[]{null, null, null, null, "'<!--'", "'-->'", null, null, null, null, null, null, null, null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "':'", "';'", "','"}, new String[]{null, "Url", "Comment", "Whitespace", "Cdo", "Cdc", "StringLiteral", "BadString", "Function", "AtKeyword", "Hash", "Dimension", "Percentage", "Number", "Ident", "LBrace", "RBrace", "LBracket", "RBracket", "LParen", "RParen", "Colon", "Semicolon", "Comma", "Delim"}, null);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final String[] f23185 = new String[25];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f23185;
            if (i2 >= strArr.length) {
                break;
            }
            C21171 c21171 = f23182;
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
        C16233 c16233M52830 = new C23994().m52830("\u0004\u0001\u0018_\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0005\u0000\u0017\b\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002)\b\u0002\n\u0002\f\u0002,\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00047\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005;\b\u0005\n\u0005\f\u0005>\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006D\b\u0006\n\u0006\f\u0006G\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007M\b\u0007\n\u0007\f\u0007P\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bV\b\b\n\b\f\bY\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0002\u0003\u0000\u0010\u0010\u0012\u0012\u0014\u0014\u0002\u0000\b\b\u000f\u0014b\u0000\u0018\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000\u0000\fA\u0001\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000\u0000\u0010S\u0001\u0000\u0000\u0000\u0012\\\u0001\u0000\u0000\u0000\u0014\u0017\u0003\b\u0004\u0000\u0015\u0017\u0003\u0006\u0003\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d \u0003\b\u0004\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0000\u0000\u0001%\u0003\u0001\u0000\u0000\u0000&)\u0003\b\u0004\u0000')\u0003\u0006\u0003\u0000(&\u0001\u0000\u0000\u0000('\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0000\u0000\u0001.\u0005\u0001\u0000\u0000\u0000/0\u0007\u0000\u0000\u00000\u0007\u0001\u0000\u0000\u000017\u0003\n\u0005\u000027\u0003\f\u0006\u000037\u0003\u000e\u0007\u000047\u0003\u0010\b\u000057\u0003\u0012\t\u000061\u0001\u0000\u0000\u000062\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u00007\t\u0001\u0000\u0000\u00008<\u0005\u000f\u0000\u00009;\u0003\b\u0004\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0005\u0010\u0000\u0000@\u000b\u0001\u0000\u0000\u0000AE\u0005\b\u0000\u0000BD\u0003\b\u0004\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0014\u0000\u0000I\r\u0001\u0000\u0000\u0000JN\u0005\u0013\u0000\u0000KM\u0003\b\u0004\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u0014\u0000\u0000R\u000f\u0001\u0000\u0000\u0000SW\u0005\u0011\u0000\u0000TV\u0003\b\u0004\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\u0012\u0000\u0000[\u0011\u0001\u0000\u0000\u0000\\]\b\u0001\u0000\u0000]\u0013\u0001\u0000\u0000\u0000\u000b\u0016\u0018\u001f!(*6<ENW".toCharArray());
        f23186 = c16233M52830;
        f23183 = new C23724[c16233M52830.f52366.size()];
        while (true) {
            C16233 c16233 = f23186;
            if (i >= c16233.f52366.size()) {
                return;
            }
            f23183[i] = new C23724(c16233.m38343(i), i);
            i++;
        }
    }

    @Override // l.AbstractC19055
    @Deprecated
    /* JADX INFO: renamed from: ۬ */
    public final String[] mo5092() {
        return f23185;
    }

    @Override // l.AbstractC19055
    /* JADX INFO: renamed from: ۘ */
    public final C21171 mo5089() {
        return f23182;
    }

    @Override // l.AbstractC19055
    /* JADX INFO: renamed from: ᩹ */
    public final String[] mo9135() {
        return f23181;
    }

    @Override // l.AbstractC19055
    /* JADX INFO: renamed from: ۨ */
    public final C16233 mo5091() {
        return f23186;
    }

    public C6882(C4943 c4943) {
        super(c4943);
        this.f61618 = new C1499(this, f23186, f23183, f23184);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C4059 m18499() {
        C4059 c4059 = new C4059(m43800(), this.f23706);
        mo3204((C23289) c4059, 0, 0);
        try {
            try {
                m18913(c4059);
                m43806(24);
                this.f23709.mo27093(this);
                int iMo11332 = this.f23703.mo11332(1);
                while ((iMo11332 & (-64)) == 0 && ((1 << iMo11332) & 33554430) != 0) {
                    m43806(22);
                    this.f23709.mo27093(this);
                    switch (this.f23703.mo11332(1)) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 17:
                        case 19:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                            m43806(20);
                            m18490();
                            break;
                        case 16:
                        case 18:
                        case 20:
                            m43806(21);
                            m18491();
                            break;
                        default:
                            throw new C4237(this);
                    }
                    m43806(26);
                    this.f23709.mo27093(this);
                    iMo11332 = this.f23703.mo11332(1);
                }
                m43806(27);
                m18919(-1);
                mo3207();
                return c4059;
            } catch (C21877 e) {
                this.f23709.m29892(this, e);
                this.f23709.mo27095(this, e);
                mo3207();
                return c4059;
            }
        } catch (Throwable th) {
            mo3207();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C5471 m18493() {
        C5471 c5471 = new C5471(m43800(), this.f23706);
        mo3204((C23289) c5471, 2, 1);
        try {
            try {
                m18913(c5471);
                m43806(33);
                this.f23709.mo27093(this);
                int iMo11332 = this.f23703.mo11332(1);
                while ((iMo11332 & (-64)) == 0 && ((1 << iMo11332) & 33554430) != 0) {
                    m43806(31);
                    this.f23709.mo27093(this);
                    switch (this.f23703.mo11332(1)) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 17:
                        case 19:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                            m43806(29);
                            m18490();
                            break;
                        case 16:
                        case 18:
                        case 20:
                            m43806(30);
                            m18491();
                            break;
                        default:
                            throw new C4237(this);
                    }
                    m43806(35);
                    this.f23709.mo27093(this);
                    iMo11332 = this.f23703.mo11332(1);
                }
                m43806(36);
                m18919(-1);
                mo3207();
                return c5471;
            } catch (C21877 e) {
                this.f23709.m29892(this, e);
                this.f23709.mo27095(this, e);
                mo3207();
                return c5471;
            }
        } catch (Throwable th) {
            mo3207();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2648 m18495() {
        C2648 c2648 = new C2648(m43800(), this.f23706);
        mo3204((C23289) c2648, 4, 2);
        try {
            try {
                m18913(c2648);
                m43806(42);
                this.f23709.mo27093(this);
                int iMo11332 = this.f23703.mo11332(1);
                while ((iMo11332 & (-64)) == 0 && ((1 << iMo11332) & 33554430) != 0) {
                    m43806(40);
                    this.f23709.mo27093(this);
                    switch (this.f23703.mo11332(1)) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 17:
                        case 19:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                            m43806(38);
                            m18490();
                            break;
                        case 16:
                        case 18:
                        case 20:
                            m43806(39);
                            m18491();
                            break;
                        default:
                            throw new C4237(this);
                    }
                    m43806(44);
                    this.f23709.mo27093(this);
                    iMo11332 = this.f23703.mo11332(1);
                }
                m43806(45);
                m18919(-1);
                mo3207();
                return c2648;
            } catch (C21877 e) {
                this.f23709.m29892(this, e);
                this.f23709.mo27095(this, e);
                mo3207();
                return c2648;
            }
        } catch (Throwable th) {
            mo3207();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m18491() {
        C1237 c1237 = new C1237(m43800(), this.f23706);
        mo3204((C23289) c1237, 6, 3);
        try {
            m18913(c1237);
            m43806(47);
            int iMo11332 = this.f23703.mo11332(1);
            if ((iMo11332 & (-64)) != 0 || ((1 << iMo11332) & 1376256) == 0) {
                this.f23709.mo27094(this);
            } else {
                if (this.f23703.mo11332(1) == -1) {
                    this.f23710 = true;
                }
                this.f23709.m29889();
                mo18924();
            }
        } catch (C21877 e) {
            this.f23709.m29892(this, e);
            this.f23709.mo27095(this, e);
        } finally {
            mo3207();
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m18490() {
        C11822 c11822 = new C11822(m43800(), this.f23706);
        mo3204((C23289) c11822, 8, 4);
        try {
            try {
                m43806(54);
                this.f23709.mo27093(this);
                switch (this.f23703.mo11332(1)) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        m18913(c11822);
                        m43806(53);
                        m18498();
                        break;
                    case 8:
                        m18913(c11822);
                        m43806(50);
                        m18496();
                        break;
                    case 15:
                        m18913(c11822);
                        m43806(49);
                        m18494();
                        break;
                    case 16:
                    case 18:
                    case 20:
                    default:
                        throw new C4237(this);
                    case 17:
                        m18913(c11822);
                        m43806(52);
                        m18497();
                        break;
                    case 19:
                        m18913(c11822);
                        m43806(51);
                        m18492();
                        break;
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

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m18494() {
        C4765 c4765 = new C4765(m43800(), this.f23706);
        mo3204((C23289) c4765, 10, 5);
        try {
            m18913(c4765);
            m43806(56);
            m18919(15);
            m43806(60);
            this.f23709.mo27093(this);
            int iMo11332 = this.f23703.mo11332(1);
            while ((iMo11332 & (-64)) == 0 && ((1 << iMo11332) & 32178174) != 0) {
                m43806(57);
                m18490();
                m43806(62);
                this.f23709.mo27093(this);
                iMo11332 = this.f23703.mo11332(1);
            }
            m43806(63);
            m18919(16);
        } catch (C21877 e) {
            this.f23709.m29892(this, e);
            this.f23709.mo27095(this, e);
        } finally {
            mo3207();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m18496() {
        C22405 c22405 = new C22405(m43800(), this.f23706);
        mo3204((C23289) c22405, 12, 6);
        try {
            m18913(c22405);
            m43806(65);
            m18919(8);
            m43806(69);
            this.f23709.mo27093(this);
            int iMo11332 = this.f23703.mo11332(1);
            while ((iMo11332 & (-64)) == 0 && ((1 << iMo11332) & 32178174) != 0) {
                m43806(66);
                m18490();
                m43806(71);
                this.f23709.mo27093(this);
                iMo11332 = this.f23703.mo11332(1);
            }
            m43806(72);
            m18919(20);
        } catch (C21877 e) {
            this.f23709.m29892(this, e);
            this.f23709.mo27095(this, e);
        } finally {
            mo3207();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18492() {
        C13233 c13233 = new C13233(m43800(), this.f23706);
        mo3204((C23289) c13233, 14, 7);
        try {
            m18913(c13233);
            m43806(74);
            m18919(19);
            m43806(78);
            this.f23709.mo27093(this);
            int iMo11332 = this.f23703.mo11332(1);
            while ((iMo11332 & (-64)) == 0 && ((1 << iMo11332) & 32178174) != 0) {
                m43806(75);
                m18490();
                m43806(80);
                this.f23709.mo27093(this);
                iMo11332 = this.f23703.mo11332(1);
            }
            m43806(81);
            m18919(20);
        } catch (C21877 e) {
            this.f23709.m29892(this, e);
            this.f23709.mo27095(this, e);
        } finally {
            mo3207();
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m18497() {
        C13939 c13939 = new C13939(m43800(), this.f23706);
        mo3204((C23289) c13939, 16, 8);
        try {
            m18913(c13939);
            m43806(83);
            m18919(17);
            m43806(87);
            this.f23709.mo27093(this);
            int iMo11332 = this.f23703.mo11332(1);
            while ((iMo11332 & (-64)) == 0 && ((1 << iMo11332) & 32178174) != 0) {
                m43806(84);
                m18490();
                m43806(89);
                this.f23709.mo27093(this);
                iMo11332 = this.f23703.mo11332(1);
            }
            m43806(90);
            m18919(18);
        } catch (C21877 e) {
            this.f23709.m29892(this, e);
            this.f23709.mo27095(this, e);
        } finally {
            mo3207();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18498() {
        C2878 c2878 = new C2878(m43800(), this.f23706);
        mo3204((C23289) c2878, 18, 9);
        try {
            m18913(c2878);
            m43806(92);
            int iMo11332 = this.f23703.mo11332(1);
            if (iMo11332 <= 0 || ((iMo11332 & (-64)) == 0 && ((1 << iMo11332) & 2064640) != 0)) {
                this.f23709.mo27094(this);
            } else {
                if (this.f23703.mo11332(1) == -1) {
                    this.f23710 = true;
                }
                this.f23709.m29889();
                mo18924();
            }
        } catch (C21877 e) {
            this.f23709.m29892(this, e);
            this.f23709.mo27095(this, e);
        } finally {
            mo3207();
        }
    }
}
