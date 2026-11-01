package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.֡᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes3.dex */
public final class C0620 implements InterfaceC10389 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11601 f2681;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2682;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f2683;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f2684;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f2685;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f2686 = false;

    @Override // l.InterfaceC8978
    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo2885() {
        throw null;
    }

    public C0620(C11601 c11601, long j, int i, boolean[] zArr) {
        this.f2681 = c11601;
        this.f2685 = j;
        this.f2682 = i;
        this.f2684 = zArr;
    }

    @Override // l.InterfaceC10389
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2886(long j, long j2, long j3) {
        if (mo2357()) {
            return;
        }
        C11601 c11601 = this.f2681;
        if (c11601.f38989 == null) {
            return;
        }
        int iM22238 = C8516.m22238(j2, j3);
        boolean z = this.f2686;
        int i = this.f2682;
        if (!z) {
            if (((int) (SystemClock.uptimeMillis() - this.f2685)) <= 500 || iM22238 >= 50) {
                return;
            }
            this.f2686 = true;
            C11601.m28914(c11601, i);
        }
        if (iM22238 != this.f2683) {
            this.f2683 = iM22238;
            C11601.m28900(c11601, i, iM22238);
        }
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        C11601 c11601 = this.f2681;
        boolean z = c11601.f38976 || !c11601.m28916(this.f2682);
        if (z) {
            this.f2684[0] = true;
        }
        return z;
    }
}
