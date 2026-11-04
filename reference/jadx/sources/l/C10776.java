package l;

/* JADX INFO: renamed from: l.ۤۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6ED */
/* JADX INFO: loaded from: classes3.dex */
public final class C10776 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f34201;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10776 f34202;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C10776 m27468(C1610 c1610, String str) {
        C10776 c10776;
        C10776 c10776M14832 = c1610.m5678().m14832(str);
        if (c10776M14832 != null) {
            return c10776M14832;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            c10776 = new C10776(str, null);
        } else {
            C10776 c10776M27468 = m27468(c1610, str.substring(0, iLastIndexOf));
            str.substring(iLastIndexOf + 1);
            c10776 = new C10776(str, c10776M27468);
        }
        c1610.m5678().m14837(c10776);
        return c10776;
    }

    public C10776(String str, C10776 c10776) {
        this.f34201 = str;
        this.f34202 = c10776;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m27469() {
        return this.f34201;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10776 m27470() {
        return this.f34202;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10776)) {
            return false;
        }
        return C17359.equals(this.f34201, ((C10776) obj).f34201);
    }

    public final int hashCode() {
        return this.f34201.hashCode();
    }

    public final String toString() {
        return this.f34201;
    }
}
