package l;

/* JADX INFO: renamed from: l.᩹ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes.dex */
public final class C23619 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f76650;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f76651;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3481 f76652;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f76653;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f76654;

    public C23619(C3481 c3481, int i, int i2, long j, int i3) {
        this.f76652 = c3481;
        this.f76651 = i;
        this.f76650 = i2;
        this.f76653 = j;
        this.f76654 = i3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m52863() {
        return this.f76653 < this.f76652.f12031;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m52862() {
        if (!m52863()) {
            throw new IndexOutOfBoundsException("Recipe cursor exhausted");
        }
        return this.f76654;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52861() {
        if (m52863()) {
            long j = this.f76653 + 1;
            this.f76653 = j;
            C3481 c3481 = this.f76652;
            if (j >= c3481.f12031) {
                return;
            }
            AbstractC0433 abstractC0433 = c3481.f12030[this.f76651];
            int i = this.f76650 + 1;
            this.f76650 = i;
            if (i < abstractC0433.mo2248()) {
                this.f76654 = abstractC0433.mo2250(this.f76654);
                return;
            }
            this.f76651++;
            this.f76650 = 0;
            this.f76654 = c3481.f12030[this.f76651].mo2249(0);
        }
    }
}
