package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.֨ۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8F6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1068 implements InterfaceC0817 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7450 f3829;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5368 f3830;

    @Override // l.InterfaceC0817
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InputStream mo3286() {
        return C9765.m25437(this);
    }

    public C1068(C5368 c5368, C7450 c7450) {
        this.f3830 = c5368;
        this.f3829 = c7450;
    }

    @Override // l.InterfaceC0817
    public final InputStream getInputStream() {
        return this.f3830.m16032(this.f3829);
    }

    @Override // l.InterfaceC0817
    public final long length() {
        return this.f3829.m20449();
    }
}
