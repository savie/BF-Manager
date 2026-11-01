package l;

/* JADX INFO: renamed from: l.۫᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BHQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12723 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 f42432;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f42433;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f42434;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f42435;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f42436;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 f42437;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3320 f42438;

    public C12723(int i, C3320 c3320, InterfaceC14093 interfaceC14093, InterfaceC14093 interfaceC14094, int i2, boolean z, String str) {
        if (c3320 == null) {
            throw new NullPointerException("result == null");
        }
        if (interfaceC14093 == null) {
            throw new NullPointerException("sources == null");
        }
        if (interfaceC14094 == null) {
            throw new NullPointerException("exceptions == null");
        }
        if (i2 < 1 || i2 > 6) {
            throw new IllegalArgumentException(C8479.m22141(i2, "invalid branchingness: "));
        }
        if (interfaceC14094.size() != 0 && i2 != 6) {
            throw new IllegalArgumentException("exceptions / branchingness mismatch");
        }
        this.f42435 = i;
        this.f42438 = c3320;
        this.f42432 = interfaceC14093;
        this.f42437 = interfaceC14094;
        this.f42434 = i2;
        this.f42436 = z;
        this.f42433 = str;
    }

    public C12723(int i, C3320 c3320, InterfaceC14093 interfaceC14093, int i2, String str) {
        this(i, c3320, interfaceC14093, C9672.f32573, i2, false, str);
    }

    public C12723(int i, C3320 c3320, InterfaceC14093 interfaceC14093, String str) {
        this(i, c3320, interfaceC14093, C9672.f32573, 1, false, str);
    }

    public C12723(int i, C3320 c3320, InterfaceC14093 interfaceC14093, InterfaceC14093 interfaceC14094, String str) {
        this(i, c3320, interfaceC14093, interfaceC14094, 6, false, str);
    }

    public C12723(int i, C9672 c9672, InterfaceC14093 interfaceC14093) {
        this(i, C3320.f12280, c9672, interfaceC14093, 6, true, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12723)) {
            return false;
        }
        C12723 c12723 = (C12723) obj;
        return this.f42435 == c12723.f42435 && this.f42434 == c12723.f42434 && this.f42438 == c12723.f42438 && this.f42432.equals(c12723.f42432) && this.f42437.equals(c12723.f42437);
    }

    public final int hashCode() {
        return this.f42437.hashCode() + ((this.f42432.hashCode() + ((this.f42438.hashCode() + (((this.f42435 * 31) + this.f42434) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM40152 = C17214.m40152(40, "Rop{");
        sbM40152.append(C1238.m4436(this.f42435));
        C3320 c3320 = C3320.f12280;
        C3320 c3321 = this.f42438;
        if (c3321 != c3320) {
            sbM40152.append(" ");
            sbM40152.append(c3321);
        } else {
            sbM40152.append(" .");
        }
        sbM40152.append(" <-");
        InterfaceC14093 interfaceC14093 = this.f42432;
        int size = interfaceC14093.size();
        if (size == 0) {
            sbM40152.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sbM40152.append(' ');
                sbM40152.append(interfaceC14093.getType(i));
            }
        }
        if (this.f42436) {
            sbM40152.append(" call");
        }
        InterfaceC14093 interfaceC14094 = this.f42437;
        int size2 = interfaceC14094.size();
        if (size2 != 0) {
            sbM40152.append(" throws");
            for (int i2 = 0; i2 < size2; i2++) {
                sbM40152.append(' ');
                if (interfaceC14094.getType(i2) == C3320.f12274) {
                    sbM40152.append("<any>");
                } else {
                    sbM40152.append(interfaceC14094.getType(i2));
                }
            }
        } else {
            int i3 = this.f42434;
            if (i3 == 1) {
                sbM40152.append(" flows");
            } else if (i3 == 2) {
                sbM40152.append(" returns");
            } else if (i3 == 3) {
                sbM40152.append(" gotos");
            } else if (i3 == 4) {
                sbM40152.append(" ifs");
            } else if (i3 != 5) {
                sbM40152.append(" ".concat(C22475.m49983(i3)));
            } else {
                sbM40152.append(" switches");
            }
        }
        sbM40152.append('}');
        return sbM40152.toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m31572() {
        return this.f42435;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3320 m31574() {
        return this.f42438;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 m31578() {
        return this.f42432;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m31577() {
        return this.f42434;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m31571() {
        return this.f42436;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m31576() {
        int i = this.f42435;
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m31575() {
        String str = this.f42433;
        return str != null ? str : toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31573() {
        return this.f42437.size() != 0;
    }
}
