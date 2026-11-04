package l;

/* JADX INFO: renamed from: l.᩸ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98OO */
/* JADX INFO: loaded from: classes.dex */
public final class C22517 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f72834;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f72835;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f72836;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f72837;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Object f72838;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f72839;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f72840;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f72841;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14902 f72842;

    public C22517(Object obj, int i, C14902 c14902, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f72834 = obj;
        this.f72840 = i;
        this.f72842 = c14902;
        this.f72838 = obj2;
        this.f72839 = i2;
        this.f72836 = j;
        this.f72837 = j2;
        this.f72835 = i3;
        this.f72841 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22517.class == obj.getClass()) {
            C22517 c22517 = (C22517) obj;
            if (this.f72840 == c22517.f72840 && this.f72839 == c22517.f72839 && this.f72836 == c22517.f72836 && this.f72837 == c22517.f72837 && this.f72835 == c22517.f72835 && this.f72841 == c22517.f72841 && C17359.equals(this.f72842, c22517.f72842) && C17359.equals(this.f72834, c22517.f72834) && C17359.equals(this.f72838, c22517.f72838)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(this.f72834, Integer.valueOf(this.f72840), this.f72842, this.f72838, Integer.valueOf(this.f72839), Long.valueOf(this.f72836), Long.valueOf(this.f72837), Integer.valueOf(this.f72835), Integer.valueOf(this.f72841));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f72840 + ", period=" + this.f72839 + ", pos=" + this.f72836;
        int i = this.f72835;
        if (i == -1) {
            return str;
        }
        StringBuilder sbM10405 = C3188.m10405(str, ", contentPos=");
        sbM10405.append(this.f72837);
        sbM10405.append(", adGroup=");
        sbM10405.append(i);
        sbM10405.append(", ad=");
        sbM10405.append(this.f72841);
        return sbM10405.toString();
    }

    static {
        C4794.m14773(0, 1, 2, 3, 4);
        C7116.m19499(5);
        C7116.m19499(6);
    }
}
