package l;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: renamed from: l.ܺۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16670 extends AbstractC18951 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C14454 f53850;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f53851;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f53852;

    public void shutdown() {
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long m39388() {
        C14454 c14454 = this.f53850;
        if (c14454 == null || c14454.isEmpty()) {
            return C25227.FOREVER_NS;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m39387() {
        C14454 c14454 = this.f53850;
        if (c14454 == null) {
            return false;
        }
        AbstractC12941 abstractC12941 = (AbstractC12941) (c14454.isEmpty() ? null : c14454.removeFirst());
        if (abstractC12941 == null) {
            return false;
        }
        abstractC12941.run();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39383(AbstractC12941 abstractC12941) {
        C14454 c14454 = this.f53850;
        if (c14454 == null) {
            c14454 = new C14454();
            this.f53850 = c14454;
        }
        c14454.addLast(abstractC12941);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m39382() {
        return this.f53851 >= Blake2xsDigest.MAX_NUMBER_BLOCKS;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m39385() {
        C14454 c14454 = this.f53850;
        if (c14454 != null) {
            return c14454.isEmpty();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39384(boolean z) {
        this.f53851 += z ? Blake2xsDigest.MAX_NUMBER_BLOCKS : 1L;
        if (z) {
            return;
        }
        this.f53852 = true;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m39386() {
        long j = this.f53851 - Blake2xsDigest.MAX_NUMBER_BLOCKS;
        this.f53851 = j;
        if (j <= 0 && this.f53852) {
            shutdown();
        }
    }
}
