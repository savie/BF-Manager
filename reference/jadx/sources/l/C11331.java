package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧ᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11331 extends C2592 implements InterfaceC4003, InterfaceC19436 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f38232 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11766 f38233;

    @Override // l.C2592, l.InterfaceC24031
    public final void onTransitionCancel(AbstractC11766 abstractC11766) {
    }

    public C11331(AbstractC11766 abstractC11766) {
        this.f38233 = abstractC11766;
        Arrays.fill(new long[20], Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28392() {
        AbstractC11766 abstractC11766 = this.f38233;
        long j = abstractC11766.getTotalDurationMillis() == 0 ? 1L : 0L;
        abstractC11766.setCurrentPlayTimeMillis(j, this.f38232);
        this.f38232 = j;
    }

    @Override // l.InterfaceC19436
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28393(float f) {
        AbstractC11766 abstractC11766 = this.f38233;
        long jMax = Math.max(-1L, Math.min(abstractC11766.getTotalDurationMillis() + 1, Math.round(f)));
        abstractC11766.setCurrentPlayTimeMillis(jMax, this.f38232);
        this.f38232 = jMax;
    }
}
