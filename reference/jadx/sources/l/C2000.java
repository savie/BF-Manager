package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.֫ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6S3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2000 implements InterfaceC4076 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5614 f7463;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4076 f7464;

    public C2000(InterfaceC4076 interfaceC4076, InterfaceC5614 interfaceC5614) {
        this.f7464 = interfaceC4076;
        this.f7463 = interfaceC5614;
    }

    @Override // l.InterfaceC4076
    public final C13250 identity() {
        return this.f7464.identity();
    }

    @Override // l.InterfaceC4076
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream mo6416() {
        InputStream inputStreamMo6416 = ((C16818) this.f7464).mo6416();
        InterfaceC5614 interfaceC5614 = this.f7463;
        return !(interfaceC5614 instanceof C4513) ? inputStreamMo6416 : new C14702(inputStreamMo6416, C4513.m12548(inputStreamMo6416, interfaceC5614));
    }
}
