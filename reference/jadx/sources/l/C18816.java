package l;

/* JADX INFO: renamed from: l.ᩴܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F8BR */
/* JADX INFO: loaded from: classes4.dex */
public final class C18816 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C18816 f60981 = new C18816();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12568[] f60982;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC21803 f60983;

    public C18816() {
        AbstractC12568 abstractC12568 = C0471.f2140;
        this.f60983 = C12467.f41575;
        AbstractC12568[] abstractC12568Arr = new AbstractC12568[18];
        this.f60982 = abstractC12568Arr;
        abstractC12568Arr[9] = abstractC12568;
        for (int i = 1; i <= 17; i++) {
            if (i != 9) {
                this.f60982[i] = new C0471(i);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C18816 m43419() {
        return f60981;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12568 m43420(int i) {
        if (i > 17) {
            i = 17;
        } else if (i < 1) {
            i = 9;
        }
        return this.f60982[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21803 m43421() {
        return this.f60983;
    }
}
