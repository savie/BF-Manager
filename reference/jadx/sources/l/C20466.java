package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20466 extends C7787 implements InterfaceC2566, InterfaceC3343 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f65568 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0329 f65569;

    @Override // l.C7787, l.InterfaceC12261
    public final void onTransitionCancel(AbstractC0329 abstractC0329) {
    }

    public C20466(AbstractC0329 abstractC0329) {
        this.f65569 = abstractC0329;
        Arrays.fill(new long[20], Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46973() {
        AbstractC0329 abstractC0329 = this.f65569;
        long j = abstractC0329.getTotalDurationMillis() == 0 ? 1L : 0L;
        abstractC0329.setCurrentPlayTimeMillis(j, this.f65568);
        this.f65568 = j;
    }

    @Override // l.InterfaceC3343
    /* JADX INFO: renamed from: ۙ */
    public final void mo10996(float f) {
        AbstractC0329 abstractC0329 = this.f65569;
        long jMax = Math.max(-1L, Math.min(abstractC0329.getTotalDurationMillis() + 1, Math.round(f)));
        abstractC0329.setCurrentPlayTimeMillis(jMax, this.f65568);
        this.f65568 = jMax;
    }
}
