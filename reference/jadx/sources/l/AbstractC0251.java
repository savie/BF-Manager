package l;

/* JADX INFO: renamed from: l.֡ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0251 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f1480 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C3073 f1479 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC7848 f1478 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo1688(C3073 c3073, AbstractC7848 abstractC7848) {
        this.f1479 = c3073;
        this.f1478 = abstractC7848;
        if (abstractC7848.f25820 > 0) {
            this.f1480 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m1691() {
        return this.f1480;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1690(boolean z) {
        this.f1480 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1689(C7307 c7307) throws C5813 {
        if (this.f1480) {
            this.f1478.f25825 = -1;
        }
        this.f1479.m9249(c7307);
        if (this.f1480) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.f1478.f25820;
            while (this.f1478.m20735() && this.f1478.f25825 == -1) {
                try {
                    Thread.sleep(10L);
                } catch (Exception unused) {
                }
                if (j > 0 && System.currentTimeMillis() - jCurrentTimeMillis > j) {
                    this.f1478.f25825 = 0;
                    throw new C5813("channel request: timeout");
                }
            }
            if (this.f1478.f25825 == 0) {
                throw new C5813("failed to send channel request");
            }
        }
    }
}
