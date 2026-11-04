package l;

import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.ۨۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 66QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C12157 extends AbstractC0540 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C25351[] f39084;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C11002 f39086;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C6485 f39088 = new C6485();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final String[] f39083 = {"document", "part", "tag", "tagItem", AnnotationHandler.ATTRIBUTE};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C22191 f39085 = new C22191(new String[]{null, null, "'<!--'", "'<![CDATA['", "'<!'", null, null, null, null, null, "'/>'", null, null, "'='", null, "'/'"}, new String[]{null, "RawText", "Comment", "Cdata", "Declaration", "Processing", "EndOpen", "TagOpen", "Text", "Other", "SelfClose", "TagClose", "TagSpace", "Equals", "TagWord", "Slash", "BrokenQuoted", "TagOther", "ValueSpace", "QuotedValue", "BareValue"}, null);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final String[] f39087 = new String[21];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f39087;
            if (i2 >= strArr.length) {
                break;
            }
            C22191 c22191 = f39085;
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
        C11002 c11002M56094 = new C25175().m56094("\u0004\u0001\u0014L\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002 \b\u0002\n\u0002\f\u0002#\t\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003/\b\u0003\n\u0003\f\u00032\t\u0003\u0001\u0003\u0003\u00035\b\u0003\u0003\u00037\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004;\b\u0004\n\u0004\f\u0004>\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004B\b\u0004\n\u0004\f\u0004E\t\u0004\u0001\u0004\u0003\u0004H\b\u0004\u0003\u0004J\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0003\u0001\u0000\u0006\u0007\u0001\u0000\n\u000b\u0001\u0000\u0013\u0014[\u0000\r\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004\u001c\u0001\u0000\u0000\u0000\u00066\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0000\u0000\u0001\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u001b\u0003\u0004\u0002\u0000\u0013\u001b\u0005\u0002\u0000\u0000\u0014\u001b\u0005\u0003\u0000\u0000\u0015\u001b\u0005\u0004\u0000\u0000\u0016\u001b\u0005\u0005\u0000\u0000\u0017\u001b\u0005\b\u0000\u0000\u0018\u001b\u0005\t\u0000\u0000\u0019\u001b\u0005\u0001\u0000\u0000\u001a\u0012\u0001\u0000\u0000\u0000\u001a\u0013\u0001\u0000\u0000\u0000\u001a\u0014\u0001\u0000\u0000\u0000\u001a\u0015\u0001\u0000\u0000\u0000\u001a\u0016\u0001\u0000\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c\u001d\u0007\u0000\u0000\u0000\u001d!\u0005\u000e\u0000\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$&\u0007\u0001\u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0005\u0001\u0000\u0000\u0000'7\u0003\b\u0004\u0000(7\u0005\f\u0000\u0000)7\u0005\u000f\u0000\u0000*7\u0005\u0010\u0000\u0000+7\u0005\u0011\u0000\u0000,0\u0005\r\u0000\u0000-/\u0005\u0012\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000035\u0007\u0002\u0000\u000043\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u00006'\u0001\u0000\u0000\u00006(\u0001\u0000\u0000\u00006)\u0001\u0000\u0000\u00006*\u0001\u0000\u0000\u00006+\u0001\u0000\u0000\u00006,\u0001\u0000\u0000\u00007\u0007\u0001\u0000\u0000\u00008I\u0005\u000e\u0000\u00009;\u0005\f\u0000\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?C\u0005\r\u0000\u0000@B\u0005\u0012\u0000\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FH\u0007\u0002\u0000\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000I<\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\t\u0001\u0000\u0000\u0000\u000b\r\u001a!%046<CGI".toCharArray());
        f39086 = c11002M56094;
        f39084 = new C25351[c11002M56094.f34749.size()];
        while (true) {
            C11002 c11002 = f39086;
            if (i >= c11002.f34749.size()) {
                return;
            }
            f39084[i] = new C25351(c11002.m27846(i), i);
            i++;
        }
    }

    @Override // l.AbstractC9488
    @Deprecated
    /* JADX INFO: renamed from: ۚ */
    public final String[] mo6653() {
        return f39087;
    }

    @Override // l.AbstractC9488
    /* JADX INFO: renamed from: ֫ */
    public final C22191 mo6640() {
        return f39085;
    }

    @Override // l.AbstractC9488
    /* JADX INFO: renamed from: ܳ */
    public final String[] mo6683() {
        return f39083;
    }

    @Override // l.AbstractC9488
    /* JADX INFO: renamed from: ۤ */
    public final C11002 mo6669() {
        return f39086;
    }

    public C12157(C3523 c3523) {
        super(c3523);
        this.f30727 = new C17671(this, f39086, f39084, f39088);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15886 m30366() {
        C15886 c15886 = new C15886(m24870(), this.f2262);
        mo2511((C7998) c15886, 0, 0);
        try {
            m2510(c15886);
            m24872(13);
            this.f2261.mo29438(this);
            int iMo11537 = this.f2260.mo11537(1);
            while ((iMo11537 & (-64)) == 0 && ((1 << iMo11537) & 1022) != 0) {
                m24872(10);
                m30368();
                m24872(15);
                this.f2261.mo29438(this);
                iMo11537 = this.f2260.mo11537(1);
            }
            m24872(16);
            m2518(-1);
            return c15886;
        } catch (C10234 e) {
            this.f2261.m30971(this, e);
            this.f2261.mo29437(this, e);
            return c15886;
        } finally {
            mo2521();
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m30368() {
        C23346 c23346 = new C23346(m24870(), this.f2262);
        mo2511((C7998) c23346, 2, 1);
        try {
            try {
                m24872(26);
                this.f2261.mo29438(this);
                switch (this.f2260.mo11537(1)) {
                    case 1:
                        m2510(c23346);
                        m24872(25);
                        m2518(1);
                        break;
                    case 2:
                        m2510(c23346);
                        m24872(19);
                        m2518(2);
                        break;
                    case 3:
                        m2510(c23346);
                        m24872(20);
                        m2518(3);
                        break;
                    case 4:
                        m2510(c23346);
                        m24872(21);
                        m2518(4);
                        break;
                    case 5:
                        m2510(c23346);
                        m24872(22);
                        m2518(5);
                        break;
                    case 6:
                    case 7:
                        m2510(c23346);
                        m24872(18);
                        m30367();
                        break;
                    case 8:
                        m2510(c23346);
                        m24872(23);
                        m2518(8);
                        break;
                    case 9:
                        m2510(c23346);
                        m24872(24);
                        m2518(9);
                        break;
                    default:
                        throw new C18439(this);
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

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m30367() {
        C3208 c3208 = new C3208(m24870(), this.f2262);
        mo2511((C7998) c3208, 4, 2);
        try {
            m2510(c3208);
            m24872(28);
            int iMo11537 = this.f2260.mo11537(1);
            if (iMo11537 != 6 && iMo11537 != 7) {
                this.f2261.mo29436(this);
            } else {
                if (this.f2260.mo11537(1) == -1) {
                    this.f2264 = true;
                }
                this.f2261.m30968();
                mo2527();
            }
            m24872(29);
            m2518(14);
            m24872(33);
            this.f2261.mo29438(this);
            int iMo11538 = this.f2260.mo11537(1);
            while ((iMo11538 & (-64)) == 0 && ((1 << iMo11538) & 258048) != 0) {
                m24872(30);
                m30364();
                m24872(35);
                this.f2261.mo29438(this);
                iMo11538 = this.f2260.mo11537(1);
            }
            m24872(37);
            this.f2261.mo29438(this);
            int iMo11539 = this.f2260.mo11537(1);
            if (iMo11539 == 10 || iMo11539 == 11) {
                m24872(36);
                int iMo115310 = this.f2260.mo11537(1);
                if (iMo115310 != 10 && iMo115310 != 11) {
                    this.f2261.mo29436(this);
                } else {
                    if (this.f2260.mo11537(1) == -1) {
                        this.f2264 = true;
                    }
                    this.f2261.m30968();
                    mo2527();
                }
            }
        } catch (C10234 e) {
            this.f2261.m30971(this, e);
            this.f2261.mo29437(this, e);
        } finally {
            mo2521();
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m30364() {
        C20362 c20362 = new C20362(m24870(), this.f2262);
        mo2511((C7998) c20362, 6, 3);
        try {
            try {
                m24872(54);
                this.f2261.mo29438(this);
                switch (this.f2260.mo11537(1)) {
                    case 12:
                        m2510(c20362);
                        m24872(40);
                        m2518(12);
                        break;
                    case 13:
                        m2510(c20362);
                        m24872(44);
                        m2518(13);
                        m24872(48);
                        this.f2261.mo29438(this);
                        int iMo11537 = this.f2260.mo11537(1);
                        while (iMo11537 == 18) {
                            m24872(45);
                            m2518(18);
                            m24872(50);
                            this.f2261.mo29438(this);
                            iMo11537 = this.f2260.mo11537(1);
                        }
                        m24872(52);
                        this.f2261.mo29438(this);
                        int iMo11538 = this.f2260.mo11537(1);
                        if (iMo11538 == 19 || iMo11538 == 20) {
                            m24872(51);
                            int iMo11539 = this.f2260.mo11537(1);
                            if (iMo11539 != 19 && iMo11539 != 20) {
                                this.f2261.mo29436(this);
                            } else {
                                if (this.f2260.mo11537(1) == -1) {
                                    this.f2264 = true;
                                }
                                this.f2261.m30968();
                                mo2527();
                            }
                        }
                        break;
                    case 14:
                        m2510(c20362);
                        m24872(39);
                        m30365();
                        break;
                    case 15:
                        m2510(c20362);
                        m24872(41);
                        m2518(15);
                        break;
                    case 16:
                        m2510(c20362);
                        m24872(42);
                        m2518(16);
                        break;
                    case 17:
                        m2510(c20362);
                        m24872(43);
                        m2518(17);
                        break;
                    default:
                        throw new C18439(this);
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

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m30365() {
        C17378 c17378 = new C17378(m24870(), this.f2262);
        mo2511((C7998) c17378, 8, 4);
        try {
            try {
                m2510(c17378);
                m24872(56);
                m2518(14);
                m24872(73);
                this.f2261.mo29438(this);
                if (((C17671) m24871()).mo4368(10, this.f2260, this.f2262) == 1) {
                    m24872(60);
                    this.f2261.mo29438(this);
                    int iMo11537 = this.f2260.mo11537(1);
                    while (iMo11537 == 12) {
                        m24872(57);
                        m2518(12);
                        m24872(62);
                        this.f2261.mo29438(this);
                        iMo11537 = this.f2260.mo11537(1);
                    }
                    m24872(63);
                    m2518(13);
                    m24872(67);
                    this.f2261.mo29438(this);
                    int iMo11538 = this.f2260.mo11537(1);
                    while (iMo11538 == 18) {
                        m24872(64);
                        m2518(18);
                        m24872(69);
                        this.f2261.mo29438(this);
                        iMo11538 = this.f2260.mo11537(1);
                    }
                    m24872(71);
                    this.f2261.mo29438(this);
                    int iMo11539 = this.f2260.mo11537(1);
                    if (iMo11539 == 19 || iMo11539 == 20) {
                        m24872(70);
                        int iMo115310 = this.f2260.mo11537(1);
                        if (iMo115310 != 19 && iMo115310 != 20) {
                            this.f2261.mo29436(this);
                        } else {
                            if (this.f2260.mo11537(1) == -1) {
                                this.f2264 = true;
                            }
                            this.f2261.m30968();
                            mo2527();
                        }
                    }
                }
            } catch (C10234 e) {
                this.f2261.m30971(this, e);
                this.f2261.mo29437(this, e);
            }
        } finally {
            mo2521();
        }
    }
}
