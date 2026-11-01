package l;

/* JADX INFO: renamed from: l.ۖܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2633 implements InterfaceC8011 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f10265;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f10266;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7928 f10264 = new C7928();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f10263 = -9223372036854775807L;

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo8113(long j) {
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8112(int i, C2460 c2460) {
        c2460.m7535(i);
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8115(C2460 c2460, int i, int i2) {
        c2460.m7535(i);
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8116(C7648 c7648) {
        this.f10265 = true;
        this.f10264.getClass();
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo8111(InterfaceC6942 interfaceC6942, int i, boolean z) {
        return this.f10264.mo8117(interfaceC6942, i, z);
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo8117(InterfaceC6942 interfaceC6942, int i, boolean z) {
        return this.f10264.mo8117(interfaceC6942, i, z);
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8114(long j, int i, int i2, int i3, C18594 c18594) {
        if (this.f10263 != -9223372036854775807L) {
            if (c18594 == null) {
                this.f10266 = true;
            }
        } else {
            if (c18594 != null || (i & 1) == 0) {
                return;
            }
            this.f10263 = j;
        }
    }
}
