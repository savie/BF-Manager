package l;

/* JADX INFO: renamed from: l.ۘ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB0P */
/* JADX INFO: loaded from: classes2.dex */
public final class C4440 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15900;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2948 f15901;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f15902 = 1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C2948 f15903;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C2948 f15904;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f15905;

    public C4440(C2948 c2948) {
        this.f15903 = c2948;
        this.f15904 = c2948;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m14128(int i) {
        C2948 c2948M9643 = this.f15904.m9643(i);
        int i2 = 1;
        if (this.f15902 == 2) {
            if (c2948M9643 != null) {
                this.f15904 = c2948M9643;
                this.f15900++;
            } else if (i == 65038) {
                m14127();
            } else if (i != 65039) {
                if (this.f15904.m9644() != null) {
                    if (this.f15900 != 1 || m14126()) {
                        this.f15901 = this.f15904;
                        m14127();
                        i2 = 3;
                    } else {
                        m14127();
                    }
                } else {
                    m14127();
                }
            }
            i2 = 2;
        } else if (c2948M9643 == null) {
            m14127();
        } else {
            this.f15902 = 2;
            this.f15904 = c2948M9643;
            this.f15900 = 1;
            i2 = 2;
        }
        this.f15905 = i;
        return i2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m14127() {
        this.f15902 = 1;
        this.f15904 = this.f15903;
        this.f15900 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5098 m14131() {
        return this.f15901.m9644();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5098 m14129() {
        return this.f15904.m9644();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m14130() {
        if (this.f15902 != 2 || this.f15904.m9644() == null) {
            return false;
        }
        return this.f15900 > 1 || m14126();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m14126() {
        return this.f15904.m9644().m15416() || this.f15905 == 65039;
    }
}
