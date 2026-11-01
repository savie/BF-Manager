package l;

/* JADX INFO: renamed from: l.ܳ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38I8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14734 implements InterfaceC2428 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7648 f48164;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C6694 f48165;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f48166;

    public C14734(String str) {
        C10471 c10471 = new C10471();
        c10471.m26521("video/mp2t");
        c10471.m26533(str);
        this.f48164 = c10471.m26497();
    }

    @Override // l.InterfaceC2428
    /* JADX INFO: renamed from: ۙ */
    public final void mo7415(C6694 c6694, InterfaceC15690 interfaceC15690, C8074 c8074) {
        this.f48165 = c6694;
        c8074.m21286();
        InterfaceC8011 interfaceC8011Mo7684 = interfaceC15690.mo7684(c8074.m21287(), 5);
        this.f48166 = interfaceC8011Mo7684;
        interfaceC8011Mo7684.mo8116(this.f48164);
    }

    @Override // l.InterfaceC2428
    /* JADX INFO: renamed from: ۙ */
    public final void mo7414(C2460 c2460) {
        C2023.m6508(this.f48165);
        String str = C17983.f57504;
        long jM18076 = this.f48165.m18076();
        long jM18074 = this.f48165.m18074();
        if (jM18076 == -9223372036854775807L || jM18074 == -9223372036854775807L) {
            return;
        }
        C7648 c7648 = this.f48164;
        if (jM18074 != c7648.f25278) {
            C10471 c10471M20201 = c7648.m20201();
            c10471M20201.m26500(jM18074);
            C7648 c7648M26497 = c10471M20201.m26497();
            this.f48164 = c7648M26497;
            this.f48166.mo8116(c7648M26497);
        }
        int iM7503 = c2460.m7503();
        this.f48166.mo8112(iM7503, c2460);
        this.f48166.mo8114(jM18076, 1, iM7503, 0, null);
    }
}
