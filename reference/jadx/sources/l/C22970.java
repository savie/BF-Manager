package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩺ۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7D7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22970 extends C4624 implements InterfaceC12387 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f74648;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f74649;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f74650;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public String f74651;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f74652;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f74653;

    public C22970(C3980 c3980, C3275 c3275) {
        super(c3980, c3275);
        this.f74649 = 0;
        this.f74651 = m18213(m18222(AbstractC6741.f22679, EnumC20934.f68134.m47084()));
        this.f22696 = EnumC10020.INNER_CLASSES;
    }

    @Override // l.C4624, l.AbstractC6741
    /* JADX INFO: renamed from: ۚ */
    public final int mo12770() {
        if (this.f74649 == 0) {
            boolean zMo18231 = mo18231();
            C3275 c3275 = this.f16355;
            if (zMo18231) {
                int iM18205 = c3275.f22686 - m18205();
                this.f74649 = iM18205;
                this.f74649 = Math.max(iM18205, this.f22688);
            } else {
                int iM18206 = c3275.f22686 - m18205();
                this.f74649 = iM18206;
                this.f74649 = Math.max(iM18206, this.f74651.length() + this.f22688);
            }
        }
        return this.f74649;
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ܰ */
    public final void mo14102(int i, int i2) {
        String strConcat = this.f74651.concat(EnumC23839.m52517(this.f74652, EnumC0554.INNER_CLASS));
        boolean z = this.f22704;
        boolean z2 = this.f22692;
        if (z2) {
            String strM50812 = m50812(strConcat);
            if (z) {
                m18228(strM50812);
            } else {
                this.f22710.mo18524(m18222(mo12770(), strM50812));
                m18228(" // ");
            }
        } else {
            m18228(strConcat);
        }
        if (!z2 || (z2 && !z)) {
            int i3 = this.f74653;
            C3980 c3980 = this.f16354;
            if (i3 != 0) {
                m18228(c3980.f47512.getName(this.f74653) + " = ");
            }
            int i4 = this.f74650;
            if (i4 != 0) {
                m18228(c3980.f47512.m27825(i4));
            }
            int i5 = this.f74648;
            if (i5 != 0) {
                m18228(" of " + c3980.f47512.m27825(i5));
            }
            m18219((!c3980.f22692 || z) ? l.b : "");
            return;
        }
        m18221();
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ۖ */
    public final void mo14101(int i, int i2) {
        if (i == 0) {
            m18209(EnumC20934.f68134.m47085() + " {");
        }
        m18208(1);
        String strM52517 = EnumC23839.m52517(this.f74652, EnumC0554.INNER_CLASS);
        boolean z = this.f22692;
        boolean z2 = this.f22704;
        if (z) {
            String strM50812 = m50812(strM52517);
            if (z2) {
                m18223(strM50812);
            } else {
                this.f22710.mo18524(m18212(mo12770(), strM50812));
                m18228(" // ");
            }
        } else {
            m18223(strM52517);
        }
        if (!z || (z && !z2)) {
            int i3 = this.f74653;
            C3980 c3980 = this.f16354;
            if (i3 != 0) {
                m18228(c3980.f47512.getName(i3) + " = ");
            }
            int i4 = this.f74650;
            if (i4 != 0) {
                m18228(c3980.f47512.m27825(i4));
            }
            int i5 = this.f74648;
            if (i5 != 0) {
                m18228(" of " + c3980.f47512.m27825(i5));
            }
            m18219((!c3980.f22692 || z2) ? l.b : "");
        } else {
            m18221();
        }
        m18227(1);
        if (i == i2 - 1) {
            m18209(l.d);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private String m50812(String str) {
        int i = this.f74653;
        if (i != 0) {
            str = str.concat(String.format("#%d = ", Integer.valueOf(i)));
        }
        int i2 = this.f74650;
        if (i2 != 0) {
            str = str.concat(String.format("#%d", Integer.valueOf(i2)));
        }
        int i3 = this.f74648;
        if (i3 != 0) {
            str = str.concat(String.format(" of #%d", Integer.valueOf(i3)));
        }
        return str.concat(l.b);
    }

    @Override // l.InterfaceC12387
    /* JADX INFO: renamed from: ۖ */
    public final int mo9753() {
        return m50812(EnumC23839.m52517(this.f74652, EnumC0554.INNER_CLASS)).length() + 1;
    }

    @Override // l.InterfaceC12387
    /* JADX INFO: renamed from: ۙ */
    public final void mo9754(int i) {
        this.f22688 = i;
    }
}
