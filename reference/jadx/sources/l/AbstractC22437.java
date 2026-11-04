package l;

/* JADX INFO: renamed from: l.᩸֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22437 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f72638 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C15723 f72637 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC8375 f72636 = null;

    /* JADX INFO: renamed from: ۙ */
    public void mo15880(C15723 c15723, AbstractC8375 abstractC8375) {
        this.f72637 = c15723;
        this.f72636 = abstractC8375;
        if (abstractC8375.f27482 > 0) {
            this.f72638 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50588() {
        return this.f72638;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50587(boolean z) {
        this.f72638 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50586(C14010 c14010) throws C2079 {
        if (this.f72638) {
            this.f72636.f27479 = -1;
        }
        this.f72637.m37627(c14010);
        if (this.f72638) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.f72636.f27482;
            while (this.f72636.m22541() && this.f72636.f27479 == -1) {
                try {
                    Thread.sleep(10L);
                } catch (Exception unused) {
                }
                if (j > 0 && System.currentTimeMillis() - jCurrentTimeMillis > j) {
                    this.f72636.f27479 = 0;
                    throw new C2079("channel request: timeout");
                }
            }
            if (this.f72636.f27479 == 0) {
                throw new C2079("failed to send channel request");
            }
        }
    }
}
