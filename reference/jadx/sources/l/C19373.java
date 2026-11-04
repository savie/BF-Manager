package l;

import com.rosan.dhizuku.shared.DhizukuVariables;

/* JADX INFO: renamed from: l.ᩳ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D6QF */
/* JADX INFO: loaded from: classes5.dex */
public final class C19373 extends AbstractC0540 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C25351[] f62597;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C11002 f62599;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C6485 f62601 = new C6485();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final String[] f62596 = {"stylesheet", "declarationList", "componentValues", "orphanCloser", DhizukuVariables.PARAM_COMPONENT, "block", "function", "parentheses", "brackets", "atom"};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C22191 f62598 = new C22191(new String[]{null, null, null, null, "'<!--'", "'-->'", null, null, null, null, null, null, null, null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "':'", "';'", "','"}, new String[]{null, "Url", "Comment", "Whitespace", "Cdo", "Cdc", "StringLiteral", "BadString", "Function", "AtKeyword", "Hash", "Dimension", "Percentage", "Number", "Ident", "LBrace", "RBrace", "LBracket", "RBracket", "LParen", "RParen", "Colon", "Semicolon", "Comma", "Delim"}, null);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final String[] f62600 = new String[25];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f62600;
            if (i2 >= strArr.length) {
                break;
            }
            C22191 c22191 = f62598;
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
        C11002 c11002M56094 = new C25175().m56094("\u0004\u0001\u0018_\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0005\u0000\u0017\b\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002)\b\u0002\n\u0002\f\u0002,\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00047\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005;\b\u0005\n\u0005\f\u0005>\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006D\b\u0006\n\u0006\f\u0006G\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007M\b\u0007\n\u0007\f\u0007P\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bV\b\b\n\b\f\bY\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0002\u0003\u0000\u0010\u0010\u0012\u0012\u0014\u0014\u0002\u0000\b\b\u000f\u0014b\u0000\u0018\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000\u0000\fA\u0001\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000\u0000\u0010S\u0001\u0000\u0000\u0000\u0012\\\u0001\u0000\u0000\u0000\u0014\u0017\u0003\b\u0004\u0000\u0015\u0017\u0003\u0006\u0003\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d \u0003\b\u0004\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0000\u0000\u0001%\u0003\u0001\u0000\u0000\u0000&)\u0003\b\u0004\u0000')\u0003\u0006\u0003\u0000(&\u0001\u0000\u0000\u0000('\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0000\u0000\u0001.\u0005\u0001\u0000\u0000\u0000/0\u0007\u0000\u0000\u00000\u0007\u0001\u0000\u0000\u000017\u0003\n\u0005\u000027\u0003\f\u0006\u000037\u0003\u000e\u0007\u000047\u0003\u0010\b\u000057\u0003\u0012\t\u000061\u0001\u0000\u0000\u000062\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u00007\t\u0001\u0000\u0000\u00008<\u0005\u000f\u0000\u00009;\u0003\b\u0004\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0005\u0010\u0000\u0000@\u000b\u0001\u0000\u0000\u0000AE\u0005\b\u0000\u0000BD\u0003\b\u0004\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0014\u0000\u0000I\r\u0001\u0000\u0000\u0000JN\u0005\u0013\u0000\u0000KM\u0003\b\u0004\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u0014\u0000\u0000R\u000f\u0001\u0000\u0000\u0000SW\u0005\u0011\u0000\u0000TV\u0003\b\u0004\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\u0012\u0000\u0000[\u0011\u0001\u0000\u0000\u0000\\]\b\u0001\u0000\u0000]\u0013\u0001\u0000\u0000\u0000\u000b\u0016\u0018\u001f!(*6<ENW".toCharArray());
        f62599 = c11002M56094;
        f62597 = new C25351[c11002M56094.f34749.size()];
        while (true) {
            C11002 c11002 = f62599;
            if (i >= c11002.f34749.size()) {
                return;
            }
            f62597[i] = new C25351(c11002.m27846(i), i);
            i++;
        }
    }

    @Override // l.AbstractC9488
    @Deprecated
    /* JADX INFO: renamed from: ۚ */
    public final String[] mo6653() {
        return f62600;
    }

    @Override // l.AbstractC9488
    /* JADX INFO: renamed from: ֫ */
    public final C22191 mo6640() {
        return f62598;
    }

    @Override // l.AbstractC9488
    /* JADX INFO: renamed from: ܳ */
    public final String[] mo6683() {
        return f62596;
    }

    @Override // l.AbstractC9488
    /* JADX INFO: renamed from: ۤ */
    public final C11002 mo6669() {
        return f62599;
    }

    public C19373(C3523 c3523) {
        super(c3523);
        this.f30727 = new C17671(this, f62599, f62597, f62601);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C8186 m44812() {
        C8186 c8186 = new C8186(m24870(), this.f2262);
        mo2511((C7998) c8186, 0, 0);
        try {
            try {
                m2510(c8186);
                m24872(24);
                this.f2261.mo29438(this);
                int iMo11537 = this.f2260.mo11537(1);
                while ((iMo11537 & (-64)) == 0 && ((1 << iMo11537) & 33554430) != 0) {
                    m24872(22);
                    this.f2261.mo29438(this);
                    switch (this.f2260.mo11537(1)) {
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
                            m24872(20);
                            m44815();
                            break;
                        case 16:
                        case 18:
                        case 20:
                            m24872(21);
                            m44813();
                            break;
                        default:
                            throw new C18439(this);
                    }
                    m24872(26);
                    this.f2261.mo29438(this);
                    iMo11537 = this.f2260.mo11537(1);
                }
                m24872(27);
                m2518(-1);
                mo2521();
                return c8186;
            } catch (C10234 e) {
                this.f2261.m30971(this, e);
                this.f2261.mo29437(this, e);
                mo2521();
                return c8186;
            }
        } catch (Throwable th) {
            mo2521();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C14897 m44811() {
        C14897 c14897 = new C14897(m24870(), this.f2262);
        mo2511((C7998) c14897, 2, 1);
        try {
            try {
                m2510(c14897);
                m24872(33);
                this.f2261.mo29438(this);
                int iMo11537 = this.f2260.mo11537(1);
                while ((iMo11537 & (-64)) == 0 && ((1 << iMo11537) & 33554430) != 0) {
                    m24872(31);
                    this.f2261.mo29438(this);
                    switch (this.f2260.mo11537(1)) {
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
                            m24872(29);
                            m44815();
                            break;
                        case 16:
                        case 18:
                        case 20:
                            m24872(30);
                            m44813();
                            break;
                        default:
                            throw new C18439(this);
                    }
                    m24872(35);
                    this.f2261.mo29438(this);
                    iMo11537 = this.f2260.mo11537(1);
                }
                m24872(36);
                m2518(-1);
                mo2521();
                return c14897;
            } catch (C10234 e) {
                this.f2261.m30971(this, e);
                this.f2261.mo29437(this, e);
                mo2521();
                return c14897;
            }
        } catch (Throwable th) {
            mo2521();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C4457 m44808() {
        C4457 c4457 = new C4457(m24870(), this.f2262);
        mo2511((C7998) c4457, 4, 2);
        try {
            try {
                m2510(c4457);
                m24872(42);
                this.f2261.mo29438(this);
                int iMo11537 = this.f2260.mo11537(1);
                while ((iMo11537 & (-64)) == 0 && ((1 << iMo11537) & 33554430) != 0) {
                    m24872(40);
                    this.f2261.mo29438(this);
                    switch (this.f2260.mo11537(1)) {
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
                            m24872(38);
                            m44815();
                            break;
                        case 16:
                        case 18:
                        case 20:
                            m24872(39);
                            m44813();
                            break;
                        default:
                            throw new C18439(this);
                    }
                    m24872(44);
                    this.f2261.mo29438(this);
                    iMo11537 = this.f2260.mo11537(1);
                }
                m24872(45);
                m2518(-1);
                mo2521();
                return c4457;
            } catch (C10234 e) {
                this.f2261.m30971(this, e);
                this.f2261.mo29437(this, e);
                mo2521();
                return c4457;
            }
        } catch (Throwable th) {
            mo2521();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m44813() {
        C18627 c18627 = new C18627(m24870(), this.f2262);
        mo2511((C7998) c18627, 6, 3);
        try {
            m2510(c18627);
            m24872(47);
            int iMo11537 = this.f2260.mo11537(1);
            if ((iMo11537 & (-64)) != 0 || ((1 << iMo11537) & 1376256) == 0) {
                this.f2261.mo29436(this);
            } else {
                if (this.f2260.mo11537(1) == -1) {
                    this.f2264 = true;
                }
                this.f2261.m30968();
                mo2527();
            }
        } catch (C10234 e) {
            this.f2261.m30971(this, e);
            this.f2261.mo29437(this, e);
        } finally {
            mo2521();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m44815() {
        C24595 c24595 = new C24595(m24870(), this.f2262);
        mo2511((C7998) c24595, 8, 4);
        try {
            try {
                m24872(54);
                this.f2261.mo29438(this);
                switch (this.f2260.mo11537(1)) {
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
                        m2510(c24595);
                        m24872(53);
                        m44810();
                        break;
                    case 8:
                        m2510(c24595);
                        m24872(50);
                        m44816();
                        break;
                    case 15:
                        m2510(c24595);
                        m24872(49);
                        m44814();
                        break;
                    case 16:
                    case 18:
                    case 20:
                    default:
                        throw new C18439(this);
                    case 17:
                        m2510(c24595);
                        m24872(52);
                        m44817();
                        break;
                    case 19:
                        m2510(c24595);
                        m24872(51);
                        m44809();
                        break;
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44814() {
        C12660 c12660 = new C12660(m24870(), this.f2262);
        mo2511((C7998) c12660, 10, 5);
        try {
            m2510(c12660);
            m24872(56);
            m2518(15);
            m24872(60);
            this.f2261.mo29438(this);
            int iMo11537 = this.f2260.mo11537(1);
            while ((iMo11537 & (-64)) == 0 && ((1 << iMo11537) & 32178174) != 0) {
                m24872(57);
                m44815();
                m24872(62);
                this.f2261.mo29438(this);
                iMo11537 = this.f2260.mo11537(1);
            }
            m24872(63);
            m2518(16);
        } catch (C10234 e) {
            this.f2261.m30971(this, e);
            this.f2261.mo29437(this, e);
        } finally {
            mo2521();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44816() {
        C21611 c21611 = new C21611(m24870(), this.f2262);
        mo2511((C7998) c21611, 12, 6);
        try {
            m2510(c21611);
            m24872(65);
            m2518(8);
            m24872(69);
            this.f2261.mo29438(this);
            int iMo11537 = this.f2260.mo11537(1);
            while ((iMo11537 & (-64)) == 0 && ((1 << iMo11537) & 32178174) != 0) {
                m24872(66);
                m44815();
                m24872(71);
                this.f2261.mo29438(this);
                iMo11537 = this.f2260.mo11537(1);
            }
            m24872(72);
            m2518(20);
        } catch (C10234 e) {
            this.f2261.m30971(this, e);
            this.f2261.mo29437(this, e);
        } finally {
            mo2521();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m44809() {
        C0728 c0728 = new C0728(m24870(), this.f2262);
        mo2511((C7998) c0728, 14, 7);
        try {
            m2510(c0728);
            m24872(74);
            m2518(19);
            m24872(78);
            this.f2261.mo29438(this);
            int iMo11537 = this.f2260.mo11537(1);
            while ((iMo11537 & (-64)) == 0 && ((1 << iMo11537) & 32178174) != 0) {
                m24872(75);
                m44815();
                m24872(80);
                this.f2261.mo29438(this);
                iMo11537 = this.f2260.mo11537(1);
            }
            m24872(81);
            m2518(20);
        } catch (C10234 e) {
            this.f2261.m30971(this, e);
            this.f2261.mo29437(this, e);
        } finally {
            mo2521();
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m44817() {
        C6695 c6695 = new C6695(m24870(), this.f2262);
        mo2511((C7998) c6695, 16, 8);
        try {
            m2510(c6695);
            m24872(83);
            m2518(17);
            m24872(87);
            this.f2261.mo29438(this);
            int iMo11537 = this.f2260.mo11537(1);
            while ((iMo11537 & (-64)) == 0 && ((1 << iMo11537) & 32178174) != 0) {
                m24872(84);
                m44815();
                m24872(89);
                this.f2261.mo29438(this);
                iMo11537 = this.f2260.mo11537(1);
            }
            m24872(90);
            m2518(18);
        } catch (C10234 e) {
            this.f2261.m30971(this, e);
            this.f2261.mo29437(this, e);
        } finally {
            mo2521();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m44810() {
        C20865 c20865 = new C20865(m24870(), this.f2262);
        mo2511((C7998) c20865, 18, 9);
        try {
            m2510(c20865);
            m24872(92);
            int iMo11537 = this.f2260.mo11537(1);
            if (iMo11537 <= 0 || ((iMo11537 & (-64)) == 0 && ((1 << iMo11537) & 2064640) != 0)) {
                this.f2261.mo29436(this);
            } else {
                if (this.f2260.mo11537(1) == -1) {
                    this.f2264 = true;
                }
                this.f2261.m30968();
                mo2527();
            }
        } catch (C10234 e) {
            this.f2261.m30971(this, e);
            this.f2261.mo29437(this, e);
        } finally {
            mo2521();
        }
    }
}
