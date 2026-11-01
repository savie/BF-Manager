package l;

/* JADX INFO: renamed from: l.۬ۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7S4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13100 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC23844 f43612 = C21209.m47672(EnumC6749.LIST_ITEM_OPEN_TAG, EnumC6749.PARAGRAPH_OPEN_TAG, EnumC6749.HEADER_OPEN_TAG);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f43613;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f43616;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f43618;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f43619;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f43621;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f43623;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f43624;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C22978 f43625;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final StringBuilder f43620 = new StringBuilder();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3926 f43617 = new C3926();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3926 f43614 = new C3926();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C3926 f43615 = new C3926();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public EnumC1104 f43622 = EnumC1104.NONE;

    public C13100(int i) {
        this.f43621 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32328() {
        EnumC1104 enumC1104 = EnumC1104.WHITESPACE;
        EnumC1104 enumC1105 = this.f43622;
        if (enumC1104.compareTo(enumC1105) < 0) {
            enumC1104 = enumC1105;
        }
        this.f43622 = enumC1104;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32329(C22978 c22978) {
        this.f43625 = c22978;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32339() {
        this.f43620.append("/**");
        m32320(EnumC22272.AUTO_INDENT);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m32336() {
        StringBuilder sb = this.f43620;
        sb.append("\n");
        m32319(this.f43621 + 1);
        sb.append("*/");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m32347(C22978 c22978) {
        this.f43624 = false;
        this.f43617.m11400();
        this.f43614.m11400();
        this.f43615.m11400();
        if (this.f43623) {
            if (!this.f43619) {
                m32323();
            } else {
                this.f43619 = false;
                m32318();
            }
        }
        m32322(c22978);
        this.f43619 = true;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m32334(C22978 c22978) {
        m32323();
        m32322(c22978);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m32335(C22978 c22978) {
        m32322(c22978);
        m32323();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m32341(C22978 c22978) {
        m32323();
        m32322(c22978);
        this.f43624 = false;
        this.f43614.m11402();
        this.f43615.m11402();
        m32318();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m32331(C22978 c22978) {
        m32318();
        this.f43617.m11399();
        this.f43614.m11399();
        m32322(c22978);
        this.f43615.m11399();
        m32323();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m32348(C22978 c22978) {
        m32318();
        boolean z = this.f43624;
        C3926 c3926 = this.f43617;
        if (z) {
            this.f43624 = false;
            c3926.m11399();
        }
        m32322(c22978);
        this.f43624 = true;
        c3926.m11402();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m32338(C22978 c22978) {
        m32323();
        m32322(c22978);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m32324(C22978 c22978) {
        m32322(c22978);
        m32323();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m32343(C22978 c22978) {
        if (this.f43623) {
            m32323();
            m32322(c22978);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32340(C22978 c22978) {
        m32323();
        m32322(c22978);
        m32323();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m32344(C22978 c22978) {
        m32323();
        m32322(c22978);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m32333(C22978 c22978) {
        m32322(c22978);
        m32323();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m32330(C22978 c22978) {
        m32322(c22978);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m32326(C22978 c22978) {
        m32322(c22978);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32345(C22978 c22978) {
        m32323();
        m32322(c22978);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m32332(C22978 c22978) {
        m32322(c22978);
        m32323();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32342(C22978 c22978) {
        m32325();
        m32319(this.f43613);
        m32322(c22978);
        m32318();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m32327(C22978 c22978) {
        m32318();
        m32322(c22978);
        m32318();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m32337(C22978 c22978) {
        m32322(c22978);
        m32318();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m32325() {
        m32320(EnumC22272.NO_AUTO_INDENT);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m32346(C22978 c22978) {
        m32322(c22978);
    }

    public final String toString() {
        return this.f43620.toString();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m32323() {
        EnumC1104 enumC1104 = EnumC1104.BLANK_LINE;
        EnumC1104 enumC1105 = this.f43622;
        if (enumC1104.compareTo(enumC1105) < 0) {
            enumC1104 = enumC1105;
        }
        this.f43622 = enumC1104;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m32318() {
        EnumC1104 enumC1104 = EnumC1104.NEWLINE;
        EnumC1104 enumC1105 = this.f43622;
        if (enumC1104.compareTo(enumC1105) < 0) {
            enumC1104 = enumC1105;
        }
        this.f43622 = enumC1104;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m32322(C22978 c22978) {
        if (this.f43625 != null) {
            m32318();
        }
        EnumC1104 enumC1104 = this.f43622;
        EnumC1104 enumC1105 = EnumC1104.BLANK_LINE;
        if (enumC1104 == enumC1105 && (this.f43615.m11398() || this.f43619)) {
            this.f43622 = EnumC1104.NEWLINE;
        }
        EnumC1104 enumC1106 = this.f43622;
        StringBuilder sb = this.f43620;
        if (enumC1106 != enumC1105) {
            if (enumC1106 == EnumC1104.NEWLINE) {
                m32320(EnumC22272.AUTO_INDENT);
                this.f43622 = EnumC1104.NONE;
            }
        } else {
            sb.append("\n");
            m32319(this.f43621 + 1);
            sb.append("*");
            m32320(EnumC22272.AUTO_INDENT);
            this.f43622 = EnumC1104.NONE;
        }
        int i = this.f43622 == EnumC1104.WHITESPACE ? 1 : 0;
        if (!this.f43616 && c22978.m50816() + i > this.f43618) {
            m32320(EnumC22272.AUTO_INDENT);
        }
        if (!this.f43616 && i != 0) {
            sb.append(" ");
            this.f43618--;
        }
        C22978 c22979 = this.f43625;
        if (c22979 != null) {
            sb.append(c22979.m50817());
            this.f43625 = null;
            this.f43613 = m32321();
            m32318();
            m32322(c22978);
            return;
        }
        sb.append(c22978.m50817());
        if (!f43612.contains(c22978.m50815())) {
            this.f43616 = false;
        }
        this.f43618 -= c22978.m50816();
        this.f43622 = EnumC1104.NONE;
        this.f43623 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32320(EnumC22272 enumC22272) {
        StringBuilder sb = this.f43620;
        sb.append("\n");
        int i = this.f43621;
        m32319(i + 1);
        sb.append("*");
        m32319(1);
        this.f43618 = 97 - i;
        if (enumC22272 == EnumC22272.AUTO_INDENT) {
            m32319(m32321());
            this.f43618 -= m32321();
        }
        this.f43616 = true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m32321() {
        int iM11403 = (this.f43614.m11403() * 2) + (this.f43617.m11403() * 4);
        return this.f43619 ? iM11403 + 4 : iM11403;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32319(int i) {
        String string;
        if (i < 0) {
            throw new IllegalArgumentException(C8479.m22141(i, "count is negative: "));
        }
        if (i != 0) {
            string = " ";
            if (i != 1) {
                if (1 > Integer.MAX_VALUE / i) {
                    throw new OutOfMemoryError(C2271.m6966(i, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(i);
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        } else {
            string = "";
        }
        this.f43620.append(string);
    }
}
