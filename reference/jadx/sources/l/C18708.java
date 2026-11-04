package l;

/* JADX INFO: renamed from: l.ᩳ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BHQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18708 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f60806;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f60807;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 f60808;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5085 f60809;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f60810;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 f60811;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f60812;

    public C18708(int i, C5085 c5085, InterfaceC11050 interfaceC11050, InterfaceC11050 interfaceC11051, int i2, boolean z, String str) {
        if (c5085 == null) {
            throw new NullPointerException("result == null");
        }
        if (interfaceC11050 == null) {
            throw new NullPointerException("sources == null");
        }
        if (interfaceC11051 == null) {
            throw new NullPointerException("exceptions == null");
        }
        if (i2 < 1 || i2 > 6) {
            throw new IllegalArgumentException(C13645.m33382(i2, "invalid branchingness: "));
        }
        if (interfaceC11051.size() != 0 && i2 != 6) {
            throw new IllegalArgumentException("exceptions / branchingness mismatch");
        }
        this.f60810 = i;
        this.f60809 = c5085;
        this.f60808 = interfaceC11050;
        this.f60811 = interfaceC11051;
        this.f60806 = i2;
        this.f60807 = z;
        this.f60812 = str;
    }

    public C18708(int i, C5085 c5085, InterfaceC11050 interfaceC11050, int i2, String str) {
        this(i, c5085, interfaceC11050, C13705.f43487, i2, false, str);
    }

    public C18708(int i, C5085 c5085, InterfaceC11050 interfaceC11050, String str) {
        this(i, c5085, interfaceC11050, C13705.f43487, 1, false, str);
    }

    public C18708(int i, C5085 c5085, InterfaceC11050 interfaceC11050, InterfaceC11050 interfaceC11051, String str) {
        this(i, c5085, interfaceC11050, interfaceC11051, 6, false, str);
    }

    public C18708(int i, C13705 c13705, InterfaceC11050 interfaceC11050) {
        this(i, C5085.f17731, c13705, interfaceC11050, 6, true, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18708)) {
            return false;
        }
        C18708 c18708 = (C18708) obj;
        return this.f60810 == c18708.f60810 && this.f60806 == c18708.f60806 && this.f60809 == c18708.f60809 && this.f60808.equals(c18708.f60808) && this.f60811.equals(c18708.f60811);
    }

    public final int hashCode() {
        return this.f60811.hashCode() + ((this.f60808.hashCode() + ((this.f60809.hashCode() + (((this.f60810 * 31) + this.f60806) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM3018 = C0703.m3018(40, "Rop{");
        sbM3018.append(C11855.m29705(this.f60810));
        C5085 c5085 = C5085.f17731;
        C5085 c5086 = this.f60809;
        if (c5086 != c5085) {
            sbM3018.append(" ");
            sbM3018.append(c5086);
        } else {
            sbM3018.append(" .");
        }
        sbM3018.append(" <-");
        InterfaceC11050 interfaceC11050 = this.f60808;
        int size = interfaceC11050.size();
        if (size == 0) {
            sbM3018.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sbM3018.append(' ');
                sbM3018.append(interfaceC11050.getType(i));
            }
        }
        if (this.f60807) {
            sbM3018.append(" call");
        }
        InterfaceC11050 interfaceC11051 = this.f60811;
        int size2 = interfaceC11051.size();
        if (size2 != 0) {
            sbM3018.append(" throws");
            for (int i2 = 0; i2 < size2; i2++) {
                sbM3018.append(' ');
                if (interfaceC11051.getType(i2) == C5085.f17728) {
                    sbM3018.append("<any>");
                } else {
                    sbM3018.append(interfaceC11051.getType(i2));
                }
            }
        } else {
            int i3 = this.f60806;
            if (i3 == 1) {
                sbM3018.append(" flows");
            } else if (i3 == 2) {
                sbM3018.append(" returns");
            } else if (i3 == 3) {
                sbM3018.append(" gotos");
            } else if (i3 == 4) {
                sbM3018.append(" ifs");
            } else if (i3 != 5) {
                sbM3018.append(" ".concat(C5306.m15936(i3)));
            } else {
                sbM3018.append(" switches");
            }
        }
        sbM3018.append('}');
        return sbM3018.toString();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m43509() {
        return this.f60810;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C5085 m43507() {
        return this.f60809;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 m43506() {
        return this.f60808;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m43508() {
        return this.f60806;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m43505() {
        return this.f60807;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m43503() {
        int i = this.f60810;
        if (i == 14 || i == 16) {
            return true;
        }
        switch (i) {
            case 20:
            case 21:
            case 22:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m43504() {
        String str = this.f60812;
        return str != null ? str : toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43502() {
        return this.f60811.size() != 0;
    }
}
