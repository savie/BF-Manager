package l;

import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.ۗۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C3044 extends AbstractC7060 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C23724[] f11405;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C16233 f11408;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C2555 f11406 = new C2555();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final String[] f11403 = {"document", "part", "tag", "tagItem", AnnotationHandler.ATTRIBUTE};

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C21171 f11404 = new C21171(new String[]{null, null, "'<!--'", "'<![CDATA['", "'<!'", null, null, null, null, null, "'/>'", null, null, "'='", null, "'/'"}, new String[]{null, "RawText", "Comment", "Cdata", "Declaration", "Processing", "EndOpen", "TagOpen", "Text", "Other", "SelfClose", "TagClose", "TagSpace", "Equals", "TagWord", "Slash", "BrokenQuoted", "TagOther", "ValueSpace", "QuotedValue", "BareValue"}, null);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final String[] f11407 = new String[21];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f11407;
            if (i2 >= strArr.length) {
                break;
            }
            C21171 c21171 = f11404;
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
        C16233 c16233M52830 = new C23994().m52830("\u0004\u0001\u0014L\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002 \b\u0002\n\u0002\f\u0002#\t\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003/\b\u0003\n\u0003\f\u00032\t\u0003\u0001\u0003\u0003\u00035\b\u0003\u0003\u00037\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004;\b\u0004\n\u0004\f\u0004>\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004B\b\u0004\n\u0004\f\u0004E\t\u0004\u0001\u0004\u0003\u0004H\b\u0004\u0003\u0004J\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0003\u0001\u0000\u0006\u0007\u0001\u0000\n\u000b\u0001\u0000\u0013\u0014[\u0000\r\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004\u001c\u0001\u0000\u0000\u0000\u00066\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0000\u0000\u0001\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u001b\u0003\u0004\u0002\u0000\u0013\u001b\u0005\u0002\u0000\u0000\u0014\u001b\u0005\u0003\u0000\u0000\u0015\u001b\u0005\u0004\u0000\u0000\u0016\u001b\u0005\u0005\u0000\u0000\u0017\u001b\u0005\b\u0000\u0000\u0018\u001b\u0005\t\u0000\u0000\u0019\u001b\u0005\u0001\u0000\u0000\u001a\u0012\u0001\u0000\u0000\u0000\u001a\u0013\u0001\u0000\u0000\u0000\u001a\u0014\u0001\u0000\u0000\u0000\u001a\u0015\u0001\u0000\u0000\u0000\u001a\u0016\u0001\u0000\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c\u001d\u0007\u0000\u0000\u0000\u001d!\u0005\u000e\u0000\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$&\u0007\u0001\u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0005\u0001\u0000\u0000\u0000'7\u0003\b\u0004\u0000(7\u0005\f\u0000\u0000)7\u0005\u000f\u0000\u0000*7\u0005\u0010\u0000\u0000+7\u0005\u0011\u0000\u0000,0\u0005\r\u0000\u0000-/\u0005\u0012\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000035\u0007\u0002\u0000\u000043\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u00006'\u0001\u0000\u0000\u00006(\u0001\u0000\u0000\u00006)\u0001\u0000\u0000\u00006*\u0001\u0000\u0000\u00006+\u0001\u0000\u0000\u00006,\u0001\u0000\u0000\u00007\u0007\u0001\u0000\u0000\u00008I\u0005\u000e\u0000\u00009;\u0005\f\u0000\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?C\u0005\r\u0000\u0000@B\u0005\u0012\u0000\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FH\u0007\u0002\u0000\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000I<\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\t\u0001\u0000\u0000\u0000\u000b\r\u001a!%046<CGI".toCharArray());
        f11408 = c16233M52830;
        f11405 = new C23724[c16233M52830.f52366.size()];
        while (true) {
            C16233 c16233 = f11408;
            if (i >= c16233.f52366.size()) {
                return;
            }
            f11405[i] = new C23724(c16233.m38343(i), i);
            i++;
        }
    }

    @Override // l.AbstractC19055
    @Deprecated
    /* JADX INFO: renamed from: ۬ */
    public final String[] mo5092() {
        return f11407;
    }

    @Override // l.AbstractC19055
    /* JADX INFO: renamed from: ۘ */
    public final C21171 mo5089() {
        return f11404;
    }

    @Override // l.AbstractC19055
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String[] mo9135() {
        return f11403;
    }

    @Override // l.AbstractC19055
    /* JADX INFO: renamed from: ۨ */
    public final C16233 mo5091() {
        return f11408;
    }

    public C3044(C4943 c4943) {
        super(c4943);
        this.f61618 = new C1499(this, f11408, f11405, f11406);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C23507 m9131() {
        C23507 c23507 = new C23507(m43800(), this.f23706);
        mo3204((C23289) c23507, 0, 0);
        try {
            m18913(c23507);
            m43806(13);
            this.f23709.mo27093(this);
            int iMo11332 = this.f23703.mo11332(1);
            while ((iMo11332 & (-64)) == 0 && ((1 << iMo11332) & 1022) != 0) {
                m43806(10);
                m9133();
                m43806(15);
                this.f23709.mo27093(this);
                iMo11332 = this.f23703.mo11332(1);
            }
            m43806(16);
            m18919(-1);
            return c23507;
        } catch (C21877 e) {
            this.f23709.m29892(this, e);
            this.f23709.mo27095(this, e);
            return c23507;
        } finally {
            mo3207();
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m9133() {
        C14335 c14335 = new C14335(m43800(), this.f23706);
        mo3204((C23289) c14335, 2, 1);
        try {
            try {
                m43806(26);
                this.f23709.mo27093(this);
                switch (this.f23703.mo11332(1)) {
                    case 1:
                        m18913(c14335);
                        m43806(25);
                        m18919(1);
                        break;
                    case 2:
                        m18913(c14335);
                        m43806(19);
                        m18919(2);
                        break;
                    case 3:
                        m18913(c14335);
                        m43806(20);
                        m18919(3);
                        break;
                    case 4:
                        m18913(c14335);
                        m43806(21);
                        m18919(4);
                        break;
                    case 5:
                        m18913(c14335);
                        m43806(22);
                        m18919(5);
                        break;
                    case 6:
                    case 7:
                        m18913(c14335);
                        m43806(18);
                        m9130();
                        break;
                    case 8:
                        m18913(c14335);
                        m43806(23);
                        m18919(8);
                        break;
                    case 9:
                        m18913(c14335);
                        m43806(24);
                        m18919(9);
                        break;
                    default:
                        throw new C4237(this);
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

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m9130() {
        C1633 c1633 = new C1633(m43800(), this.f23706);
        mo3204((C23289) c1633, 4, 2);
        try {
            m18913(c1633);
            m43806(28);
            int iMo11332 = this.f23703.mo11332(1);
            if (iMo11332 != 6 && iMo11332 != 7) {
                this.f23709.mo27094(this);
            } else {
                if (this.f23703.mo11332(1) == -1) {
                    this.f23710 = true;
                }
                this.f23709.m29889();
                mo18924();
            }
            m43806(29);
            m18919(14);
            m43806(33);
            this.f23709.mo27093(this);
            int iMo11333 = this.f23703.mo11332(1);
            while ((iMo11333 & (-64)) == 0 && ((1 << iMo11333) & 258048) != 0) {
                m43806(30);
                m9132();
                m43806(35);
                this.f23709.mo27093(this);
                iMo11333 = this.f23703.mo11332(1);
            }
            m43806(37);
            this.f23709.mo27093(this);
            int iMo11334 = this.f23703.mo11332(1);
            if (iMo11334 == 10 || iMo11334 == 11) {
                m43806(36);
                int iMo11335 = this.f23703.mo11332(1);
                if (iMo11335 != 10 && iMo11335 != 11) {
                    this.f23709.mo27094(this);
                } else {
                    if (this.f23703.mo11332(1) == -1) {
                        this.f23710 = true;
                    }
                    this.f23709.m29889();
                    mo18924();
                }
            }
        } catch (C21877 e) {
            this.f23709.m29892(this, e);
            this.f23709.mo27095(this, e);
        } finally {
            mo3207();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m9132() {
        C9396 c9396 = new C9396(m43800(), this.f23706);
        mo3204((C23289) c9396, 6, 3);
        try {
            try {
                m43806(54);
                this.f23709.mo27093(this);
                switch (this.f23703.mo11332(1)) {
                    case 12:
                        m18913(c9396);
                        m43806(40);
                        m18919(12);
                        break;
                    case 13:
                        m18913(c9396);
                        m43806(44);
                        m18919(13);
                        m43806(48);
                        this.f23709.mo27093(this);
                        int iMo11332 = this.f23703.mo11332(1);
                        while (iMo11332 == 18) {
                            m43806(45);
                            m18919(18);
                            m43806(50);
                            this.f23709.mo27093(this);
                            iMo11332 = this.f23703.mo11332(1);
                        }
                        m43806(52);
                        this.f23709.mo27093(this);
                        int iMo11333 = this.f23703.mo11332(1);
                        if (iMo11333 == 19 || iMo11333 == 20) {
                            m43806(51);
                            int iMo11334 = this.f23703.mo11332(1);
                            if (iMo11334 != 19 && iMo11334 != 20) {
                                this.f23709.mo27094(this);
                            } else {
                                if (this.f23703.mo11332(1) == -1) {
                                    this.f23710 = true;
                                }
                                this.f23709.m29889();
                                mo18924();
                            }
                        }
                        break;
                    case 14:
                        m18913(c9396);
                        m43806(39);
                        m9134();
                        break;
                    case 15:
                        m18913(c9396);
                        m43806(41);
                        m18919(15);
                        break;
                    case 16:
                        m18913(c9396);
                        m43806(42);
                        m18919(16);
                        break;
                    case 17:
                        m18913(c9396);
                        m43806(43);
                        m18919(17);
                        break;
                    default:
                        throw new C4237(this);
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9134() {
        C10807 c10807 = new C10807(m43800(), this.f23706);
        mo3204((C23289) c10807, 8, 4);
        try {
            try {
                m18913(c10807);
                m43806(56);
                m18919(14);
                m43806(73);
                this.f23709.mo27093(this);
                if (((C1499) m43804()).mo5159(10, this.f23703, this.f23706) == 1) {
                    m43806(60);
                    this.f23709.mo27093(this);
                    int iMo11332 = this.f23703.mo11332(1);
                    while (iMo11332 == 12) {
                        m43806(57);
                        m18919(12);
                        m43806(62);
                        this.f23709.mo27093(this);
                        iMo11332 = this.f23703.mo11332(1);
                    }
                    m43806(63);
                    m18919(13);
                    m43806(67);
                    this.f23709.mo27093(this);
                    int iMo11333 = this.f23703.mo11332(1);
                    while (iMo11333 == 18) {
                        m43806(64);
                        m18919(18);
                        m43806(69);
                        this.f23709.mo27093(this);
                        iMo11333 = this.f23703.mo11332(1);
                    }
                    m43806(71);
                    this.f23709.mo27093(this);
                    int iMo11334 = this.f23703.mo11332(1);
                    if (iMo11334 == 19 || iMo11334 == 20) {
                        m43806(70);
                        int iMo11335 = this.f23703.mo11332(1);
                        if (iMo11335 != 19 && iMo11335 != 20) {
                            this.f23709.mo27094(this);
                        } else {
                            if (this.f23703.mo11332(1) == -1) {
                                this.f23710 = true;
                            }
                            this.f23709.m29889();
                            mo18924();
                        }
                    }
                }
            } catch (C21877 e) {
                this.f23709.m29892(this, e);
                this.f23709.mo27095(this, e);
            }
        } finally {
            mo3207();
        }
    }
}
