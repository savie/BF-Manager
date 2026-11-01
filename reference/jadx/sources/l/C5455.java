package l;

import java.io.IOException;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: l.ۚܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes2.dex */
public final class C5455 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f18802;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SoftReference f18803;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9835 f18804;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13515 f18805;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile int f18806;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m15116() {
        byte[] bArrM5857;
        int i = this.f18806 - 1;
        this.f18806 = i;
        if (i == 0 && (bArrM5857 = this.f18805.m41181().m5857()) != null) {
            this.f18805.m41181().m5860((byte[]) null);
            if (this.f18803.get() == null) {
                this.f18803 = new SoftReference(bArrM5857);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m15115() {
        this.f18806++;
        try {
            if (this.f18805.m41181().m5857() == null) {
                byte[] bArrM46727 = (byte[]) this.f18803.get();
                if (bArrM46727 == null) {
                    bArrM46727 = this.f18802.m46727();
                }
                if (bArrM46727 == null) {
                    throw new IOException("Failed to load dex buffer: " + this.f18802.mo33986());
                }
                this.f18805.m41181().m5860(bArrM46727);
            }
        } catch (Throwable th) {
            this.f18806--;
            throw th;
        }
    }

    public C5455(C13515 c13515, AbstractC20745 abstractC20745, int i, int i2, long j, int i3) {
        this.f18805 = c13515;
        this.f18802 = abstractC20745;
        this.f18804 = new C9835(i, i2, j, i3, new C2632(this));
        c13515.m41173(this);
        byte[] bArrM5857 = c13515.m41181().m5857();
        c13515.m41181().m5860((byte[]) null);
        this.f18803 = new SoftReference(bArrM5857);
    }
}
