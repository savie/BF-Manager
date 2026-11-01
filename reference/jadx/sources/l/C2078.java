package l;

/* JADX INFO: renamed from: l.֫᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2078 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f7680;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18888 f7681;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6596(C2078 c2078, C4651 c4651, C2078 c2079) {
        c2078.getClass();
        c4651.m12842(c2078.f7681.f30809 - (c2079 == null ? 0 : c2079.f7681.f30809));
        c4651.m12842(c2078.f7680);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m6595(C2078 c2078, int i, C2078 c2079) {
        int i2;
        if (c2079 == null) {
            i2 = 0;
        } else {
            c2078.getClass();
            i2 = c2079.f7681.f30809;
        }
        return C13530.m33072(c2078.f7680) + C13530.m33072(c2078.f7681.f30809 - i2) + i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C18888 c18888 = ((C2078) obj).f7681;
        C18888 c18889 = this.f7681;
        int iCompareTo = c18889.f61162.compareTo(c18888.f61162);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = c18889.f61164.compareTo(c18888.f61164);
        return iCompareTo2 != 0 ? iCompareTo2 : c18889.f61160.compareTo(c18888.f61160);
    }

    public C2078(C18888 c18888, int i) {
        this.f7681 = c18888;
        this.f7680 = i;
    }

    public C2078(C12063 c12063, C13825 c13825, C2078 c2078) {
        this.f7681 = (C18888) c12063.f40352.m44688(c13825.m33647() + (c2078 == null ? 0 : c2078.f7681.f30809));
        this.f7680 = c13825.m33647();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m6598() {
        return (EnumC3364.STATIC.getValue() & this.f7680) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6597() {
        return (EnumC3364.FINAL.getValue() & this.f7680) != 0;
    }
}
