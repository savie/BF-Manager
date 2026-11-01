package l;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: renamed from: l.᩸ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21721 extends AbstractC12405 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f70416;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f70417;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14481 f70418;

    public void shutdown() {
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long m48464() {
        C14481 c14481 = this.f70418;
        if (c14481 == null || c14481.m34883()) {
            return C17492.FOREVER_NS;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m48465() {
        AbstractC13255 abstractC13255;
        C14481 c14481 = this.f70418;
        if (c14481 == null || (abstractC13255 = (AbstractC13255) c14481.m34884()) == null) {
            return false;
        }
        abstractC13255.run();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48459(AbstractC13255 abstractC13255) {
        C14481 c14481 = this.f70418;
        if (c14481 == null) {
            c14481 = new C14481();
            this.f70418 = c14481;
        }
        c14481.m34882(abstractC13255);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m48461() {
        return this.f70417 >= Blake2xsDigest.MAX_NUMBER_BLOCKS;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m48462() {
        C14481 c14481 = this.f70418;
        if (c14481 != null) {
            return c14481.m34883();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48460(boolean z) {
        this.f70417 += z ? Blake2xsDigest.MAX_NUMBER_BLOCKS : 1L;
        if (z) {
            return;
        }
        this.f70416 = true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m48463() {
        long j = this.f70417 - Blake2xsDigest.MAX_NUMBER_BLOCKS;
        this.f70417 = j;
        if (j <= 0 && this.f70416) {
            shutdown();
        }
    }
}
