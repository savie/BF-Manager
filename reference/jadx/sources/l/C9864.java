package l;

/* JADX INFO: renamed from: l.ۢۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: MAHH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9864 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f31737;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f31738;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f31739;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f31740;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f31741;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f31742;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f31743;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f31744;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f31745;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f31746;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f31747;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9864 m25647(int i, AbstractC0148 abstractC0148) {
        if (abstractC0148 instanceof C21799) {
            return new C9864(i, (C21799) abstractC0148);
        }
        if (abstractC0148 instanceof C11356) {
            return new C9864(i, (C11356) abstractC0148);
        }
        throw new RuntimeException();
    }

    public C9864(int i, C21799 c21799) {
        this.f31747 = i;
        this.f31737 = 0;
        this.f31740 = c21799.f69525;
        this.f31742 = c21799.f69524;
        this.f31741 = c21799.f69523;
        this.f31743 = c21799.f69526;
        this.f31746 = c21799.f1128;
        this.f31738 = c21799.f69521;
        this.f31744 = c21799.f69522;
        this.f31745 = true;
        this.f31739 = false;
    }

    public C9864(int i, C11356 c11356) {
        this.f31747 = i;
        this.f31737 = 1;
        this.f31740 = c11356.f35762;
        this.f31742 = c11356.f35764;
        this.f31741 = c11356.f35761;
        this.f31743 = c11356.f35765;
        this.f31746 = c11356.f1128;
        this.f31738 = c11356.f35760;
        this.f31744 = c11356.f35767;
        this.f31745 = c11356.f35766;
        this.f31739 = c11356.f35763;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9864.class != obj.getClass()) {
            return false;
        }
        C9864 c9864 = (C9864) obj;
        return this.f31747 == c9864.f31747 && this.f31737 == c9864.f31737 && this.f31742 == c9864.f31742 && this.f31744 == c9864.f31744 && this.f31745 == c9864.f31745 && this.f31739 == c9864.f31739 && this.f31740.equals(c9864.f31740) && this.f31741.equals(c9864.f31741) && this.f31743.equals(c9864.f31743) && this.f31738.equals(c9864.f31738);
    }

    public final int hashCode() {
        return C17359.hash(Integer.valueOf(this.f31747), Integer.valueOf(this.f31737), this.f31740, Integer.valueOf(this.f31742), this.f31741, this.f31743, this.f31738, Boolean.valueOf(this.f31744), Boolean.valueOf(this.f31745), Boolean.valueOf(this.f31739));
    }
}
